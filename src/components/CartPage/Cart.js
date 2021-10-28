import React, { Component } from 'react';
import './Cart.css';
import CartPart from './CartPart';




class Cart extends Component {

	constructor(props){
		super(props);
		this.getItem = this.getItem.bind(this);

		this.state = {soupItem:[]}
	}

	componentDidMount(){
		this.getItem();
		
	}

	getItem(){
		 
		 this.setState({
			 SelectedItem:JSON.parse(window.localStorage.getItem("allItem"))
			
		 })
		 let A = JSON.parse(localStorage.allItem)
		 console.log(A[1].soupItem.productId);
		 for(let i = 1; i < A.length ; i++){
			 console.log(A[i].soupItem.productName);
		 }
		
	}
	


	

  render() {
    return (
		<div>
				<div className="container">
					<h1>YUMMY TUMMY CART</h1>
				</div>
				<table id="cart" className="table table-hover table-condensed">
					<thead>
						<tr>
							<th className="th1">Product</th>
							<th className="th2">Price</th>
							<th className="th3">Quantity</th>
							<th  className="th4">Subtotal</th>
							<th className="th5"></th>
						</tr>
					</thead>
					<CartPart />
				</table>
				
				
		</div>
    );
  }
}

export default Cart;