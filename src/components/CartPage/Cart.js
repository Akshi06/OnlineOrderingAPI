import React, { Component } from 'react';
import './Cart.css';

import ProductService from '../../service/ProductService';

class Cart extends Component {

	constructor(props){
        super(props);
        this.getProduct = this.getProduct.bind(this);
        
        this.state = {
            Item:{
                productId:0,
                productName:"",
                productDescription:"",
                price:null,
                img:""
            },
            name:"React",
            message:""
        };
        
    }

	componentDidMount(){
		this.getProduct(this.props.match.params.orderProduct_id);
	}
	getProduct(orderProduct_id){
        ProductService.getOrderProduct(orderProduct_id)
        .then(response =>{
            this.setState({
                Item:response.data
            });
            console.log(response.data)
        })
    }
  render() {
	  const {Item} =this.state
    return (
		<div>
			{Item ? (
				<div className="container">
				<h1>YUMMY TUMMY CART</h1>
				<table id="cart" className="table table-hover table-condensed">
							<thead>
								<tr>
									<th className="th1">Product</th>
									<th className="th2">Price</th>
									<th className="th3">Quantity</th>
									<th className="th4">Subtotal</th>
									<th className="th5"></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td data-th="Product">
										<div className="row">
											<div className="col-sm-2 hidden-xs"><img src={Item.img} alt="..." class="img-responsive"/></div>
											<div className="col-sm-10">
												<h4 className="nomargin">{Item.productName}</h4>
												<p>{Item.productDescription}</p>
											</div>
										</div>
									</td>
									<td data-th="Price">{Item.price}</td>
									<td data-th="Quantity">
										<p class="form-control text-center">q</p>
									</td>
									<td data-th="Subtotal" className="text-center">1.99</td>
									{/* <td class="actions" data-th="">
										<button class="btn btn-info btn-sm"><i class="fa fa-refresh"></i></button>
										<button class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>								
									</td> */}
								</tr>
							</tbody>
							<tfoot>
								{/* <tr cclassNamelass="visible-xs">
									<td className="text-center"><strong>Total 1.99</strong></td>
								</tr> */}
								<tr>
									<td colspan="2" className="hidden-xs"></td>
									<td className="hidden-xs text-center"><strong>Total $1.99</strong></td>
								</tr>
							</tfoot>
					</table>
			</div>
			):(
				<div>
                  <br />
                  <p>Please click on a Order...</p>
                </div>
			)}
			
		</div>

      
    );
  }
}

export default Cart;