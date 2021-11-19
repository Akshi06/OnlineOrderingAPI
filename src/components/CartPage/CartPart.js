import React,  { useState } from 'react';
import "./Cart.css";
import{Link} from "react-router-dom";
import ProductService from '../../service/ProductService';

function CartPart() {
    // eslint-disable-next-line
    const [order, setOrder] = useState(0);
    const getItemArray = JSON.parse(localStorage.getItem('allItem') || '0');

    let priceArray = []
    let total = 0 
    let letIArray =[]
 
    // let localStorageClone = localStorage.getItem('allItem');
    // let localStorageReal = localStorage.getItem('allItem');

    // for(let i=0;i < localStorageClone.length; i++){
    //     for(let j=0;j < localStorageReal.length; j++){
    //         if(i==j){
    //             items.productQuntity(i+j)
    //         }

    //     }
    // }

    for(let i in getItemArray){
        if(getItemArray[i] != null){
           letIArray.push(getItemArray[i])
            console.log(getItemArray[i] , "successfull pushed 1");
        }else if (getItemArray[i] == null){
            console.log("item is null");
        }else{
            console.log("end of array ");
        }
    }
    console.log(letIArray);

    function subTotal(price, quantity){
        let subTotal = price * quantity;
        priceArray.push(subTotal)
        return subTotal
    }
    
    function totalPrice(){
       for(let i = 0; i < priceArray.length; i++){
            total = total + priceArray[i]
            localStorage.setItem('totalPrice' , total);
       }
        return total
    }


    async function postData(){
       await ProductService.postOrder()
        .then((response) =>{
            setOrder({
                order:response.data.orderId
            })
            letIArray.forEach(
                items =>(
                    
                     ProductService.postOrderProduct(response.data.orderId , items.soupItem.productId , items.productQuntity)
                )
            )
            let localStoragePrice = localStorage.getItem("totalPrice");
            ProductService.postPaymentDetail(response.data.orderId , localStoragePrice)
            
            
        })
       alert("Thank You Yummy Tummy Foods")
        localStorage.clear();
    }
    
    return (
        <div>
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
				<tbody>
                    {
                        letIArray.map((items,i) => 
                        (
                            <tr key = {i}>
                                <td data-th="Product" className="td1">
                                    <div className="row">
                                        <div className="col-sm-2 hidden-xs"><img src={items.soupItem.img} alt="..." className="img-responsive"/></div>
                                        <div className="col-sm-10">
                                            <h4 className="nomargin">{items.soupItem.productName}</h4>
                                            <p>{items.soupItem.productDescription}</p>
                                         </div>
                                    </div>
                                </td>
                                <td data-th="Price" className="td2"> Rs:{items.soupItem.price}</td>
                                <td data-th="Quantity" className="td3">
                                    <p className="form-control text-center">{items.productQuntity}</p>
                                </td>
                                <td  data-th="Subtotal" className="text-center td4">{subTotal(items.soupItem.price , items.productQuntity)}</td>
                                <td className="actions" data-th=""></td>
                            </tr>
                        ))
                    }
                    </tbody>
					<tfoot>
									
						<tr>
							<td colSpan="3" className="hidden-xs"></td>
							<td className="hidden-xs text-center"><strong>Total {totalPrice()}</strong></td>
                          
						</tr>
					</tfoot>
				</table>
            <Link to ="/" className="link">
                <div className="payBtn">
                <button onClick = {postData} className="cartBtn">Pay</button>
                </div>
                
            </Link>
        </div>
    );
}
    


export default CartPart;