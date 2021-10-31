import React, { Component } from 'react';
import './Cart.css';
import CartPart from './CartPart';
import Navi from '../Navigation/index'

class Cart extends Component {

  render() {
    return (
		<div>
			<Navi />
				<div className="container">
					<h1>YUMMY TUMMY CART</h1>
				</div>
				<CartPart />
				
				
		</div>
    );
  }
}

export default Cart;