import React, { Component } from 'react';
import ProductService from '../../service/ProductService';

import "./index.css"

class ViewSoupProductDetail extends Component {
    constructor(props){
        super(props);
        this.getProduct = this.getProduct.bind(this);

        this.state = {
            soupItem:{
                productId:null,
                productName:"",
                productDescription:"",
                price:null,
                img:""



            },
            message:""
        };
    }


    componentDidMount(){
        this.getProduct(this.props.match.params.productId);
    }

    getProduct(productId){
        ProductService.get(productId)
        .then(response =>{
            this.setState({
                soupItem:response.data
            });
            console.log(response.data)
        })
        // .catch(e =>{
        //     console.log(e);
        // });
    }


    render() {
        const {soupItem} = this.state;
        return (
            <div>
            {soupItem ? (
                <div className="header">
                    <div className = "Content"> 
                        <div className = "column">                                     
                            <img src={soupItem.img} alt = {soupItem.productId} className = "FirstImg" />
                        </div>                                         
                        <div className = "column">                                     
                            <h1>Name: {soupItem.productName} </h1>                                      
                            <h3>Price: {soupItem.price} </h3> 
                            <h4> Q </h4>
                        </div>                                     
                    </div>
                    <div className = "section2">                                 
                        <div className = "description">                                    
                            <h2>Description</h2>
                            <p>{soupItem.productDescription}</p>
                        </div>
                    </div>
                </div>
               
        
          
            ) : (
              <div>
                <br />
                <p>Please click on a Tutorial...</p>
              </div>
            )}
          </div>
        );
    }
}

export default ViewSoupProductDetail;


 