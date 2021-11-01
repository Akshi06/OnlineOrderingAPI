import React, {Component, useState} from "react";
import { Link } from 'react-router-dom';
import ProductService from "../../service/ProductService";

import "./Signup.css"

const Singup = () =>{

    // const initialCustomer = {
    //     customerId:null,
    //     name:"",
    //     mail:"",
    //     phoneNumber:null,
       
    // };
    // const initialAddress ={
    //     addressId:null,
    //     zip:null,
    //     street:"",
    //     city:"",
    //     state:""
    // }

    // const[customer, setCutomer] = useState(initialCustomer);
    // const[address, setAddress] = useState(initialAddress);
    // const[submit,setSubmitted] = useState(false);


    // const saveCustomer = () =>{
    //     var data = {
    //         name:customer.name,
    //         mail:customer.mail,
    //         phoneNumber:customer.phoneNumber,
    //         zip:customer.zipCode,
    //         street:customer.street,
    //         city:customer.city,
    //         state:customer.state
    //     }
    // }

    // ProductService.postTheAddress(data)
    //     .then(res =>{
    //         setAddress({
    //             addressId:res.data.addressId,
    //             zip:res.data.zipCode,
    //             street:res.data.street,
    //             city:res.data.city,
    //             state:res.data.state
    //         });

    //         ProductService.postTheCustomer(res.data.addressId,data)
    //         .then(response => {
    //             setCutomer({
    //                 addressId:res.data.addressId,
    //                 customerId:response.data.customerId,
    //                 name:response.data.name,
    //                 mail:response.data.mail,
    //                 phoneNumber:response.data.phoneNumber,
    //             })
    //             setSubmitted(true);
    //             console.log(response.data)
    //             console.log(res.data)
    
    //         })

           
    //     })
    //     .catch(e =>{
    //         console.log(e);
    //     })

    //     const newCustomer = () => {
    //         setCutomer(initialCustomer);
    //         setAddress(initialAddress);
    //         setSubmitted(false);
    //     }






        return (
            <div className="signup-bg">
                <div className="singupContainer"> 
                    <form className="singupForm"> 
                        <h3>Sign Up</h3>

                        <div className="form-group">
                            <label> Name</label>
                            <input type="text" className="form-control" placeholder="Name"  />
                        </div>

                        <div className="form-group">
                            <label>Email address</label>
                            <input type="email" className="form-control" placeholder="Enter email" />
                        </div>
                        <div className="form-group">
                            <label>Phone Number</label>
                            <input type="text" className="form-control" placeholder="Phone Number" />
                        </div>

                        <div className="form-group">
                            <label>Zip Code</label>
                            <input type="text" className="form-control" placeholder="Zip Code" />
                        </div>
                        <div className="form-group">
                            <label>Street</label>
                            <input type="text" className="form-control" placeholder="Street" />
                        </div>
                        <div className="form-group">
                            <label>City</label>
                            <input type="text" className="form-control" placeholder="City" />
                        </div>
                        <div className="form-group">
                            <label>State</label>
                            <input type="text" className="form-control" placeholder="state" />
                        </div>
                        <Link to="/cart-page"><button type="submit" className="singupBtn ">Sign Up</button></Link>
                        

                    </form>
                 </div>
           
            </div>
            
        );
    }


export default Singup;

