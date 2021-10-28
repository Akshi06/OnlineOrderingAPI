import React, { Component } from 'react';
import "./Login.css"

class login extends Component {
    render() {
        return (
            <div>
                <div className="back-ground">
                    {/* <img src ="image/logingImg.jpg"></img>   */}
                    <div className ="form-box">
                        <div className ="logingForm">
                            <form>
                                <h1>Login In</h1>
                                <div className="form-text">
                                    <label>Name : </label>
                                    <input type ="text"></input>
                                </div>
                                <div className="form-text">
                                    <label>E-mail : </label>
                                    <input type ="email"></input>
                                </div>
                                <button>submit</button>
                            </form> 
                        </div>
                    </div> 
                </div> 
            </div>
        );
    }
}

export default login;