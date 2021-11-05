import React from 'react';
import { Link } from 'react-router-dom';
import ProductService from '../../service/ProductService';
import Nav from '../Navigation';


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
            // customerData:{
                customerId:0,
                customerName:"",
                email:"",
                phone:0 , 
            // },
            // address:{
                addrestId:0,
                zip:0,
                Street:"",
                city:"",
                addState:"",
                
            // },

            submit:true
            
            
        };
        
    }

    onChangeName(e) {
        this.setState({
            customerName: e.target.value
        });
    }
 
    onChangeMail(e) {
        this.setState({
            email: e.target.value
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
            Street: e.target.value
        });
    }
 
    onChangeCity(e) {
        this.setState({
            city: e.target.value
        });
    }
    onChangeAddState(e) {
        this.setState({
            addState: e.target.value
        });
    }
 
   
    saveCustomer() {
        // let customerData = {
              let  saveCustomerName = this.state.customerName;
              let  saveEmail = this.state.email;
              let  savePhone = this.state.phone; 
              let  saveZip = this.state.zip;
              let  saveStreet = this.state.Street;
              let  saveCity = this.state.city;
              let   saveState = this.state.addState

        // }
        if(saveCustomerName === "" || saveEmail === "" || savePhone === "" || saveZip === ""|| saveStreet === "" || saveCity === ""|| saveState === ""){
            alert("All Fields must be Filled")
            return false;
        }else{
            let customerData = {
                name : this.state.customerName,
                mail :this.state.email,
                phone : this.state.phone,
                zipCode : this.state.zip,
                street :this.state.Street,
                city : this.state.city,
                dataState : this.state.addState

                 
            }
            console.log(customerData);
            ProductService.getCustomers()
            .then((res) =>{
                console.log(res.data);
                let cusRegisterData = []
                let address = []
                for(let i in res.data){
                    // for(let j in res.data[i].address){
                        if(res.data[i].customerName === customerData.name){
                            if(res.data[i].customerEmail === customerData.mail){
                                if(res.data[i].customerPhone === customerData.phone){
                                    console.log(res.data[i]);
                                    cusRegisterData.push(res.data[i]);
                                    window.localStorage.setItem("cusRegisterData", JSON.stringify(cusRegisterData))    
                                    alert(" You'r already member of Yummy Tummy please Login");
                                    return true ;
                                }
                                // else{
                                   
                                //     if(res.data[i].address[j].zip === data.zipCode && res.data[i].address[j].street === data.street && res.data[i].address[j].city === data.city && res.data[i].address[j].dataState === data.dataState ){
                                //         console.log(res.data[i].address[j]);
                                //         address.push(res.data[i].address[j]);
                                //         window.localStorage.setItem("address" , JSON.stringify(address))
                                //         return true;
                                //     }
                                //     else{
                                //         console.log("print");
                                //         ProductService.postTheAddress(data)
                                //         .then(response => {
                                //             this.setState({
                                //                 id:response.data.cusAddressId,
                                //                 addressZip:response.data.zipCode,
                                //                 addressStreet:response.data.saveStreet,
                                //                 addressCity:response.data.saveCity,
                                //                 addressState:response.data.saveState,
                                                
                                                            
                                //             })
                                //                 console.log(response.data)
                                //             }) .catch(e =>{
                                //                 console.log(e);
                                //             })

                                //     }
                                // }
                                
                                
                            } 
                        
                        } 

                    // }
                        
                    
                }
            })

        }

       
    }

    render() {
        return (
            
        <div className="signup-bg">
            <Nav />
            <div className="singupContainer"> 
                <form className="singupForm"> 
                    <h3>Sign Up</h3>

                    <div className="form-group">
                        <label> Name</label>
                        <input type="text" className="form-control" placeholder="Name" onChange={this.onChangeName} value={this.state.customerName} required  name="name" />
                    </div>

                    <div className="form-group">
                        <label>Email </label>
                        <input type="email" className="form-control" placeholder="Enter email" onChange={this.onChangeMail} value={this.state.email}  required  name="mail" id="mail" />
                    </div>
                    <div className="form-group">
                        <label>Number</label>
                        <input type="text" className="form-control" placeholder="Phone Number" value={this.state.phone} required onChange={this.onChangePhone} name="phone" />
                    </div>

                    <div className="form-group">
                        <label>Zip Code</label>
                        <input type="text" className="form-control" placeholder="Zip Code" value={this.state.zip} required onChange={this.onChangeZip} name="zip"/>
                    </div>
                    <div className="form-group">
                        <label>Street</label>
                        <input type="text" className="form-control" placeholder="Street" value={this.state.Street} required onChange={this.onChangeStreet} name="street" />
                    </div>
                    <div className="form-group">
                        <label>City</label>
                        <input type="text" className="form-control" placeholder="City" value={this.state.city} required onChange={this.onChangeCity} name="city"/>
                    </div>
                    <div className="form-group">
                        <label>State</label>
                        <input type="text" className="form-control" placeholder="state" value={this.state.addState} required onChange={this.onChangeAddState} name="state"/>
                    </div>
                    <Link to="/cart-page">
                        <button  className="singupBtn" onClick={this.saveCustomer}>Sign Up</button>
                    </Link>
                    

                </form>
             </div>
       
        </div>
        
    );
}
}
        


export default Singup;

