import React from 'react';
import'./Cart.css'

const Cart = () => {
    return (
        <div>
            <h1>Shopping cart</h1>
            <table>
                <tr>
                    <th>Food Dish</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Subtotal</th>
                </tr>
                <tr>
                    <td>soup</td>
                    <td>Rs:1000</td>
                    <td>2</td>
                    <td>2000</td>
                </tr>

            </table>
            
        </div>
    );
};

export default Cart;