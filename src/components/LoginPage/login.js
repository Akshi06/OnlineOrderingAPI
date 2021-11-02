import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import "./Signup.css"



class login extends Component {

    userCheckout(a){
        console.log(a);
        console.log("userCheckout done");
    }
     

    render() {
        return (
            <div className="singupContainer"> 
            <form className="singupForm"> 
                <h3>Login</h3>

                <div className="form-group">
                    <label> Name</label>
                    <input type="text" className="form-control" placeholder="Name" required   id="name" />
                </div>

                <div className="form-group">
                    <label>Email </label>
                    <input type="email" className="form-control" placeholder="Enter email"  id="email" />
                </div>
                <Link to="/cart-page"><button type="submit" className="singupBtn " onClick={this.userCheckout(document.getElementById('name'))}>Login</button></Link>
                <p className="forgot-password ">
                    You didn't have account yet <Link to="/customer-signup-page" className="loginLink">Signup</Link>
                </p>

            </form>
        </div>
        );
    }
}

export default login;