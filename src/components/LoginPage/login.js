import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import "./Signup.css"

class login extends Component {
    render() {
        return (
            <div className="singupContainer"> 
            <form className="singupForm"> 
                <h3>Login</h3>

                <div className="form-group">
                    <label> Name</label>
                    <input type="text" className="form-control" placeholder="Name" />
                </div>

                <div className="form-group">
                    <label>Email address</label>
                    <input type="email" className="form-control" placeholder="Enter email" />
                </div>
                <Link to="/cart-page"><button type="submit" className="singupBtn ">Login</button></Link>
                <p className="forgot-password ">
                    You didn't have account yet <Link to="/customer-signup-page" className="loginLink">Signup</Link>
                </p>

            </form>
        </div>
        );
    }
}

export default login;