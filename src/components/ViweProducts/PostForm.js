import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import ProductService from '../../service/ProductService';

class PostForm extends Component {
  constructor(props) {
    super(props);
    this.onChangeQuntity = this.onChangeQuntity.bind(this);
    this.saveQuntity = this.saveQuntity.bind(this);
    this.state = {
      quntity:[]
    };
  }
  
  onChangeQuntity(e) {
      this.setState({
        productQuntity : e.target.value
      });
  }
    
  saveQuntity() {
      var data = {
        productQuntity: this.state.productQuntity,
          
  };
    
  ProductService.postOrderProduct(this.state.orderId , this.state.productId ,this.state.productQuntity)
    .then(response => {
      this.setState({
      orderProduct_id: response.data.orderProduct_id,
      productQuantity: response.data.productQuantity,
      orderDetail: response.data.orderId,
      product:response.data.productId,
       submitted: true
    });
    console.log(response.data);
  })
  .catch(e => {
      console.log(e);
  });
    

  ProductService.postCutIdAndDate(data)
    .then(response => {
      this.setState({
        id:response.data.orderId,
        orderDate: response.data.orderDate,
      submitted : true
      });
      console.log(response.data);
      
    })
    .catch(e => {
        console.log(e);
    });
  }
    

    
  render() {
    return (
      <div>
        <div className="submit-form">
          <div>
            <div className="form-group">
              <label htmlFor="productQuntity">productQuntity</label>
              <input
                type="text"
                className="form-control"
                id="productQuntity"
                required
                value={this.state.productQuntity}
                onChange={this.onChangeQuntity}
                name="productQuntity"
              />
            </div>
            <Link >
              <button onClick={this.saveQuntity} className="btn btn-success">
                Add to cart
              </button>
            </Link>
          </div>
        </div>
      </div>
    );
  }
}

export default PostForm;