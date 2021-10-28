import React from 'react';
import "./Cart.css";

function CartPart() {
    
        let orderItem = JSON.parse(localStorage.allItem)
   
    // console.log(orderItem[1].soupItem.productId);
    // for(let i = 1; i < orderItem.length ; i++){
    //    console.log(orderItem[i].soupItem.productName);
        return (
            <>
                {
                     orderItem.forEach(element => {
                        
                        if(element !=null){
                            console.log(element.soupItem.productName);
                            console.log(element.productQuntity);
                            <tr>
                                <td data-th="Product" className="th1">
                                    <div className="row">
                                        <div className="col-sm-2 hidden-xs"><img src={element.soupItem.img} alt="..." className="img-responsive"/></div>
                                            <div className="col-sm-10">
                                                <h4 className="nomargin">{element.soupItem.productName}</h4>
                                                <p>{element.soupItem.productDescription}</p>
                                            </div>
                                        </div>
                                </td>
                                <td data-th="Price" className="th2"> Rs:{element.soupItem.price}</td>
                                <td data-th="Quantity" className="th3">
                                    <p className="form-control text-center">{element.productQuntity}</p>
                                </td>
                                    <td  data-th="Subtotal" className="text-center th4">1.99</td>
                                    <td class="actions" data-th="">
                                </td>
                            </tr>
                        }else if(element == null){

                        }
                        
                        else {
                            console.log("error");
                        }

                        
                           
                    })
                }
            </>
        );
    }
    


export default CartPart;