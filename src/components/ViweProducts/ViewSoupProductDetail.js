import React, { Component } from 'react';
import{Link} from "react-router-dom"
import ProductService from '../../service/ProductService';




import "./index.css"
import PostForm from './PostForm';

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
            name:"React",
            message:""
        };
        this.onChangeValue = this.onChangeValue.bind(this);
    }

    onChangeValue(event){
        console.log(event.target.value);
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
                            <h1> {soupItem.productName} </h1>                                      
                            <h3> Rs {soupItem.price} /= </h3> 
                            < PostForm />
                    
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
                  <p>Please click on a Order...</p>
                </div>
              )}
          </div>
        );
    }
}

export default ViewSoupProductDetail;


 