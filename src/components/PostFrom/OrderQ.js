import axios from 'axios';
import React, { Component } from 'react';
import ProductService from '../../service/ProductService';


class orderQ extends Component {

    constructor(props) {
		super(props)

		this.state = {
			productQuantity: '',
			
		}
	}

	changeHandler = e => {
		this.setState({ [e.target.name]: e.target.value })
	}

	submitHandler = e => {
		e.preventDefault()
		console.log(this.state)
	
			axios.post("http://localhost:8080/v1/online-order/orderProduct",this.state)
			.then(response => {
				console.log(response)
			})
			.catch(error => {
				console.log(error)
			})
	}



    render() {
        const { productQuantity } = this.state
        return (
            <div>
                <form onSubmit={this.submitHandler}>
                    <label>Order Quantity:
                        <input type="text" name="productQuantity" value={productQuantity} onChange={this.changeHandler} />
                    </label>
                    {/* <div  onChange={this.onChangeValue} className ="redioBtn">
                        <input type="radio" value={this.state.method} name="method" className="redio1" /> Cash
                        <input type="radio" value={this.state.method} name="method" className="redio2" /> Card
                    </div> */}
                    <button type="submit">Submit</button>
                </form> 
                
            </div>
        );
    }
}

export default orderQ;