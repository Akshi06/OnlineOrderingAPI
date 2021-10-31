import React, {Component} from "react";

import "./Signup.css"

class Singup extends Component {
    render() {
        return (
            <div className="singupContainer"> 
                <form className="singupForm"> 
                    <h3>Sign Up</h3>

                    <div className="form-group">
                        <label> Name</label>
                        <input type="text" className="form-control" placeholder="Name" />
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
                    <button type="submit" className="singupBtn ">Sign Up</button>
                    <p className="forgot-password ">
                        Already registered 
                    </p>

                </form>
            </div>
           
        );
    }
}

export default Singup;

