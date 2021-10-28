import React from 'react';

function CartPart() {
    let A = JSON.parse(localStorage.allItem)
    console.log(A[1].soupItem.productId);
    for(let i = 1; i < A.length ; i++){
       console.log(A[i].soupItem.productName);
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
								<tr>
									<td data-th="Product">
										<div className="row">
											<div className="col-sm-2 hidden-xs"><img src="" alt="..." className="img-responsive"/></div>
											<div className="col-sm-10">
												<h4 className="nomargin">pk</h4>
												<p>dis</p>
											</div>
										</div>
									</td>
									<td data-th="Price">price</td>
									<td data-th="Quantity">
										<p className="form-control text-center">q</p>
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
									<td colSpan="3" className="hidden-xs"></td>
									<td className="hidden-xs text-center"><strong>Total $1.99</strong></td>
								</tr>
					</tfoot>
				</table>  
            </div>
        );
    }
    
}

export default CartPart;