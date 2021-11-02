import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import ProductService from '../../service/ProductService';


import "./Signup.css"

class Singup extends React.Component{
    constructor(props){
        super(props);
        this.saveQuntity = this.saveQuntity.bind(this);
    
        this.state = {
            customerData:{
                customerId:0,
                customerName:"",
                Email:"",
                phone:0  
            },
            addrest:{
                addrestId:0,
                zip:0,
                Street:"",
                city:"",
                State:""
                
            }
            
        };
        
    }


       saveQuntity() {
        ProductService.postTheAddress()
        .then(response => {
            this.setState({
                addrestId:response.data.addrestId,
                zip:response.data.zip,
                Street:response.data.Street,
                city:response.data.city,
                State:response.data.State
                
            });
            console.log(response);

            ProductService.postOrderProduct(response.data.orderId , this.state.soupItem.productId ,this.state.productQuntity)
                .then(res => {
                    // this.setState({
                    //     orderProduct_id:res.data.orderProduct_id
                    // })
                    console.log(res);
                })
            // ProductService.getOrderProduct(this.state.orderProduct_id)
            // .then(response =>{
            //     // this.setState({
            //     //     orderProduct_id:response.orderProduct_id
            //     // });
            //     console.log(response.orderProduct_id)
            // })
        })
        .catch(e => {
            console.log(e);
        });
    }

    render() {
        return (
        <div className="signup-bg">
            <div className="singupContainer"> 
                <form className="singupForm"> 
                    <h3>Sign Up</h3>

                    <div className="form-group">
                        <label> Name</label>
                        <input type="text" className="form-control" placeholder="Name" value={this.state.customerName} />
                    </div>

                    <div className="form-group">
                        <label>Email </label>
                        <input type="email" className="form-control" placeholder="Enter email" value={this.state.Email} />
                    </div>
                    <div className="form-group">
                        <label>Phone Number</label>
                        <input type="text" className="form-control" placeholder="Phone Number" value={this.state.phone} />
                    </div>

                    <div className="form-group">
                        <label>Zip Code</label>
                        <input type="text" className="form-control" placeholder="Zip Code" value={this.state.zip} />
                    </div>
                    <div className="form-group">
                        <label>Street</label>
                        <input type="text" className="form-control" placeholder="Street" value={this.state.Street} />
                    </div>
                    <div className="form-group">
                        <label>City</label>
                        <input type="text" className="form-control" placeholder="City" value={this.state.city} />
                    </div>
                    <div className="form-group">
                        <label>State</label>
                        <input type="text" className="form-control" placeholder="state" value={this.state.state} />
                    </div>
                    <Link to="/cart-page"><button type="submit" className="singupBtn ">Sign Up</button></Link>
                    

                </form>
             </div>
       
        </div>
        
    );
}
}
        


export default Singup;

