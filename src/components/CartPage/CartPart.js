import React from 'react';
import "./Cart.css";
import ProductService from '../../service/ProductService';
import{Link} from "react-router-dom";

function CartPart() {


    let priceArray = []
    let total = 0 
    const getArray = JSON.parse(localStorage.getItem('allItem') || '0');
    let letIArray =[]

    for(let i in getArray){
        if(getArray[i] != null){
           letIArray.push(getArray[i])
            console.log(getArray[i] , "successfull pushed 1");
        
        }else if (getArray[i] == null){

        }else{
            console.log("end of array 1");
        }
    }

    function subTotal(price, quantity){
        let tot = price * quantity;
        priceArray.push(tot)
        return tot
    }
    
    function totalPrice(){
       for(let i = 0; i < priceArray.length; i++){
        total = total + priceArray[i]
       }
        
        return total
    }

     
    // saveQuntity(() =>{
    //     ProductService.postCutIdAndDate()
    //         .then(response => {
    //             this.setState({
    //                 id:response.data.orderId,
    //                 orderDate: response.data.orderDate,
    //                 submitted : true
    //         );
    //                 console.log(response);
        
    //                 ProductService.postOrderProduct(response.data.orderId , this.state.soupItem.productId ,this.state.productQuntity)
    //                     .then(res => {
    //                         // this.setState({
    //                         //     orderProduct_id:res.data.orderProduct_id
    //                         // })
    //                         console.log(res);
    //                     })
    //                 // ProductService.getOrderProduct(this.state.orderProduct_id)
    //                 // .then(response =>{
    //                 //     // this.setState({
    //                 //     //     orderProduct_id:response.orderProduct_id
    //                 //     // });
    //                 //     console.log(response.orderProduct_id)
    //                 // })
    //             })
    //             .catch(e => {
    //                 console.log(e);
    //             });
    // })
    

    
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
                                        <td data-th="Product" className="th1">
                                            <div className="row">
                                                <div className="col-sm-2 hidden-xs"><img src={items.soupItem.img} alt="..." className="img-responsive"/></div>
                                                    <div className="col-sm-10">
                                                        <h4 className="nomargin">{items.soupItem.productName}</h4>
                                                        <p>{items.soupItem.productDescription}</p>
                                                        </div>
                                                    </div>
                                        </td>
                                        <td data-th="Price" className="th2"> Rs:{items.soupItem.price}</td>
                                        <td data-th="Quantity" className="th3">
                                            <p className="form-control text-center">{items.productQuntity}</p>
                                        </td>
                                        <td  data-th="Subtotal" className="text-center th4">{subTotal(items.soupItem.price , items.productQuntity)}</td>
                                        <td className="actions" data-th="">
                                        </td>
                                    </tr>
                                )
                            )
                        }
                    </tbody>
					<tfoot>
									
						<tr>
							<td colSpan="3" className="hidden-xs"></td>
							<td className="hidden-xs text-center"><strong>Total {totalPrice()}</strong></td>
                          
						</tr>
					</tfoot>
                   
					
				</table>
                <Link to ="/customer-login">
                     <button className="cartBtn">Pay</button>
                </Link>
              
            </div>
        );
}
    


export default CartPart;