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
				<CartPart />
				
		</div>
    );
  }
}

export default Cart;