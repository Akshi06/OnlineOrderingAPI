import React, { Component } from 'react';
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
                <button type="submit" className="singupBtn ">Login</button>
                <p className="forgot-password ">
                    Already registered 
                </p>

            </form>
        </div>
        );
    }
}

export default login;