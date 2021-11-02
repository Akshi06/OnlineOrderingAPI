import React, { Component } from 'react';
import { Link , Redirect } from 'react-router-dom';
import ProductService from '../../service/ProductService';
import "./Signup.css"




class login extends Component {
    constructor(props) {
        super(props);
        this.onChangeName = this.onChangeName.bind(this);
        this.onChangeMail = this.onChangeMail.bind(this);
        this.saveCustomer = this.saveCustomer.bind(this);
       
    
        this.state = {
          name: "",
          mail: "", 
       
         submit:true
        };
    }

    onChangeName(e) {
        this.setState({
            name: e.target.value
        });
    }
 
    onChangeMail(e) {
        this.setState({
            mail: e.target.value
        });
    }
    
    // saveCustomer() {
        // var data = {
        //     name: this.state.name,
        //     mail: this.state.mail
        // };
        // console.log(data);


        // ProductService.getCustomers()
        // .then((res) =>{
        //     console.log(res.data);
        //     let cusData = []
        //     for(let i in res.data){
        //         if(res.data[i].customerName === data.name){
        //             if(res.data[i].customerEmail === data.mail){
        //                 console.log(res.data[i]);
        //                 cusData.push(res.data[i]);
        //                 window.localStorage.setItem("customer", JSON.stringify(cusData))    
        //             }
                    
        //         }else{
                       
        //         } 
        //     }
        // })
    // }

    saveCustomer(){
        let email = this.state.mail;
        var name = this.state.name


        if(email === "" || name === ""){
            alert("All Fields must be Filled")
            return false;
        }else{
            var data = {
                name: this.state.name,
                mail: this.state.mail
            };
            console.log(data);
            ProductService.getCustomers()
            .then((res) =>{
                console.log(res.data);
                let cusData = []
                for(let i in res.data){
                    if(res.data[i].customerName === data.name){
                        if(res.data[i].customerEmail === data.mail){
                            console.log(res.data[i]);
                            cusData.push(res.data[i]);
                            window.localStorage.setItem("customer", JSON.stringify(cusData))    
                            alert(" welcome to Yummy Tummy");
                            this.props.history.push("/cart-page")
                            return true ;
                        }
                       
                        
                    }
                    
                }
            })

        }

    }

    render() {
        return (
            <div className="singupContainer"> 
            <form className="singupForm" onSubmit={this.handleSumbit}> 
                <h3>Login</h3>

                <div className="form-group">
                    <label> Name</label>
                    <input type="text" className="form-control" placeholder="Name" id="name"  required value={this.state.name} onChange={this.onChangeName} name="name" />
                </div>

                <div className="form-group">
                    <label>Email </label>
                    <input type="email" className="form-control" placeholder="Enter email"  id="email"  value={this.state.mail} onChange={this.onChangeMail} name="mail"/>
                </div>
                {/* <Link to="/cart-page" > */}
                    <button type="submit" className="singupBtn " onClick= {this.saveCustomer}>Login</button>
                {/* </Link> */}
                <p className="forgot-password ">
                    You didn't have account yet <Link to="/customer-signup-page" className="loginLink">Signup</Link>
                </p>

            </form>
        </div>
        );
    }
}

export default login;