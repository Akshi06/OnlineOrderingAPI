import React, { Component } from 'react';
// import { Link } from 'react-router-dom';
import ProductService from '../../service/ProductService';


import "./Signup.css"

class Singup extends React.Component{
    constructor(props){
        super(props);
        this.saveCustomer = this.saveCustomer.bind(this);
        this.onChangeName = this.onChangeName.bind(this);
        this.onChangeMail = this.onChangeMail.bind(this);
        this.onChangePhone = this.onChangePhone.bind(this);
        this.onChangeZip = this.onChangeZip.bind(this);
        this.onChangeStreet = this.onChangeStreet.bind(this);
        this.onChangeCity = this.onChangeCity.bind(this);
        this.onChangeAddState = this.onChangeAddState.bind(this);
       
    
        this.state = {
            customerData:{
                customerId:0,
                customerName:"",
                email:"",
                phone:null  
            },
            address:{
                addrestId:0,
                zip:null,
                Street:"",
                city:"",
                addState:""
                
            },

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
    onChangePhone(e) {
        this.setState({
            phone: e.target.value
        });
    }
 
    onChangeZip(e) {
        this.setState({
            zip: e.target.value
        });
    }
    onChangeStreet(e) {
        this.setState({
            street: e.target.value
        });
    }
 
    onChangeCity(e) {
        this.setState({
            city: e.target.value
        });
    }
    onChangeAddState(e) {
        this.setState({
            state: e.target.value
        });
    }
 
   
    saveCustomer() {
        // let customerData = {
              let customerName = this.state.customerData.customerName;
              let email = this.state.customerData.email;
            let phone = this.state.customerData.phone; 
        // }
        // let address = {
               let zip = this.state.address.zip;
              let  Street = this.state.address.Street;
              let city = this.state.address.city;
              let  State = this.state.address.addState

        // }
        if(email === "" || customerName === "" || phone === "" || zip === ""|| Street === "" || city === ""|| State === ""){
            alert("All Fields must be Filled")
            return false;
        }else{
            let data = {
                customerName : this.state.customerData.customerName,
                email :this.state.customerData.email,
                phone : this.state.customerData.phone 
            }
            console.log(data);
            ProductService.getCustomers()
            .then((res) =>{
                console.log(res.data);
                let cusRegisterData = []
                for(let i in res.data){
                    if(res.data[i].customerName === data.customerName){
                        if(res.data[i].customerEmail === data.email){
                            console.log(res.data[i]);
                            cusRegisterData.push(res.data[i]);
                            window.localStorage.setItem("cusRegisterData", JSON.stringify(cusRegisterData))    
                            alert(" You'r already member of Yummy Tummy");
                            // this.props.history.push("/cart-page")
                            return true ;
                        }
                       
                        
                    }
                    
                }
            })

        }

       
    }

    render() {
        return (
        <div className="signup-bg">
            <div className="singupContainer"> 
                <form className="singupForm"> 
                    <h3>Sign Up</h3>

                    <div className="form-group">
                        <label> Name</label>
                        <input type="text" className="form-control" placeholder="Name" onChange={this.onChangeName} value={this.state.customerData.customerName} required  name="name" />
                    </div>

                    <div className="form-group">
                        <label>Email </label>
                        <input type="email" className="form-control" placeholder="Enter email" onChange={this.onChangeMail} value={this.state.customerData.email}  required o name="mail" />
                    </div>
                    <div className="form-group">
                        <label>Number</label>
                        <input type="text" className="form-control" placeholder="Phone Number" value={this.state.customerData.phone} required onChange={this.onChangePhone} name="phone" />
                    </div>

                    <div className="form-group">
                        <label>Zip Code</label>
                        <input type="text" className="form-control" placeholder="Zip Code" value={this.state.address.zip} required onChange={this.onChangeZip} name="zip"/>
                    </div>
                    <div className="form-group">
                        <label>Street</label>
                        <input type="text" className="form-control" placeholder="Street" value={this.state.address.Street} required onChange={this.onChangeStreet} name="street" />
                    </div>
                    <div className="form-group">
                        <label>City</label>
                        <input type="text" className="form-control" placeholder="City" value={this.state.address.city} required onChange={this.onChangeCity} name="city"/>
                    </div>
                    <div className="form-group">
                        <label>State</label>
                        <input type="text" className="form-control" placeholder="state" value={this.state.address.addState} required onChange={this.onChangeAddState} name="state"/>
                    </div>
                    {/* <Link to="/cart-page"> */}
                        <button type="submit" className="singupBtn" onClick={this.saveCustomer}>Sign Up</button>
                        {/* </Link> */}
                    

                </form>
             </div>
       
        </div>
        
    );
}
}
        


export default Singup;

