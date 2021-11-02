import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import ProductService from '../../service/ProductService';
import "./Signup.css"



class login extends Component {
    constructor(props) {
        super(props);
        this.onChangeName = this.onChangeName.bind(this);
        this.onChangeMail = this.onChangeMail.bind(this);
        this.saveTutorial = this.saveTutorial.bind(this);
        // this.newTutorial = this.newTutorial.bind(this);
    
        this.state = {
          name: "",
          mail: "", 
       

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
    
    saveTutorial() {
        var data = {
            name: this.state.name,
            mail: this.state.mail
        };
        console.log(data);

    }
    
    render() {
        return (
            <div className="singupContainer"> 
            <form className="singupForm"> 
                <h3>Login</h3>

                <div className="form-group">
                    <label> Name</label>
                    <input type="text" className="form-control" placeholder="Name" id="name"  required value={this.state.name} onChange={this.onChangeName} name="name" />
                </div>

                <div className="form-group">
                    <label>Email </label>
                    <input type="email" className="form-control" placeholder="Enter email"  id="email" required value={this.state.mail} onChange={this.onChangeMail} name="mail"/>
                </div>
                <Link to="/cart-page">
                    <button type="submit" className="singupBtn " onClick={this.saveTutorial}>Login</button>
                </Link>
                <p className="forgot-password ">
                    You didn't have account yet <Link to="/customer-signup-page" className="loginLink">Signup</Link>
                </p>

            </form>
        </div>
        );
    }
}

export default login;