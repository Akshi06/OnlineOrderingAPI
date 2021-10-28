import React from 'react';

import ProductService from '../../service/ProductService';
import{Link} from "react-router-dom"
import "./index.css"
import Nav from '../Navigation';



class ViewProductDetail extends React.Component {
    constructor(props){
        super(props);
        this.getProduct = this.getProduct.bind(this);
        this.onChangeQuntity = this.onChangeQuntity.bind(this);
        // this.saveQuntity = this.saveQuntity.bind(this);
      
        // this.getOrderProduct = this.getOrderProduct.bind(this)
        
        this.state = {
            soupItem:{
                productId:0,
                productName:"",
                productDescription:"",
                price:0,
                img:"",
                
            },
            // productQuntity:0,
           
            
            
        };
        
    }

    onChangeQuntity(e) {
        this.setState({
          productQuntity : e.target.value
        });
    }

     
    // saveQuntity(){
    //     var data ={
    //         Quntity : this.state.productQuntity
    //     }
    // }

    // saveQuntity() {
    //     ProductService.postCutIdAndDate()
    //     .then(response => {
    //         this.setState({
    //             id:response.data.orderId,
    //             orderDate: response.data.orderDate,
    //             submitted : true
    //         });
    //         console.log(response);

    //         ProductService.postOrderProduct(response.data.orderId , this.state.soupItem.productId ,this.state.productQuntity)
    //             .then(res => {
    //                 // this.setState({
    //                 //     orderProduct_id:res.data.orderProduct_id
    //                 // })
    //                 console.log(res);
    //             })
    //         // ProductService.getOrderProduct(this.state.orderProduct_id)
    //         // .then(response =>{
    //         //     // this.setState({
    //         //     //     orderProduct_id:response.orderProduct_id
    //         //     // });
    //         //     console.log(response.orderProduct_id)
    //         // })
    //     })
    //     .catch(e => {
    //         console.log(e);
    //     });
    // }

    componentDidMount(){
        this.getProduct(this.props.match.params.productId);

        let allItem = JSON.parse(localStorage.getItem("allItem"));
        if(allItem == null) allItem = [];

        this.itemData = JSON.parse(localStorage.getItem("items"));

        if(localStorage.getItem("items")){
            this.setState({
                productQuntity:this.itemData.productQuntity
            })
            console.log(this.itemData)
        
        }
        allItem.push(this.itemData);
        localStorage.setItem("allItem" , JSON.stringify(allItem));
       
    }
    componentWillUpdate(nextProps, nextState) {
        localStorage.setItem('items', JSON.stringify(nextState));
    
    }

  
    getProduct(productId){
        ProductService.get(productId)
        .then(response =>{
            this.setState({
                soupItem:response.data[0]
              
            });
            // console.log(response.data[0])
       
            
        });
     

    } 

    // setItemToLocal(productId,productName,price){

    //     let allItem = JSON.parse(localStorage.getItem("allItem"));

    //     if(allItem == null) allItem = [];
    //     console.log(allItem);
    //     // window.localStorage.clear();
       
        
    //     let items = {
    //         id:productId,
    //         name:productName,
    //         price:price,
    //         Quntity:this.state.productQuntity,
           
    //     }
        
    //     localStorage.setItem("item", JSON.stringify(items));

    //     allItem.push(items);

    //     localStorage.setItem("allItem" , JSON.stringify(allItem));

    //     // localStorage.getItem(items)
    //     // console.log(items)
    //     }
    
    

    render() {
        const {soupItem} = this.state;

        return (
            <div>
                 <Nav />
            {soupItem ? (
                <div className="header">
                    <div className = "Content"> 
                        <div className = "column">                                     
                            <img src= {"../"+soupItem.img} alt = {soupItem.productId} className = "FirstImg" />
                        </div>                                         
                        <div className = "column">                                     
                            <h1> {soupItem.productName} </h1> 
                                                              
                            <h3> Rs {soupItem.price} /= </h3> 
                            <div>
                                <div className="form-group">
                                    <label htmlFor="productQuntity">product Quntity</label>
                                    <input
                                        type="text"
                                        value={this.state.productQuntity}
                                        className="form-control"
                                        id="productQuntity"
                                        // required
                                        // value={this.state.productQuntity}
                                        onChange={this.onChangeQuntity}
                                        name="productQuntity"
                                    />
                                    
                                </div>
                           
                                <Link to = "">
                                    <button type="submit"
                                                // onClick={
                                                //     this.setItemToLocal(
                                                //         soupItem.productId,
                                                //         soupItem.productName, 
                                                //         soupItem.price, 
                                                //         this.state.productQuntity
                                                //     )
                                                // } 
                                                // onClick={this.saveQuntity()}
                                                className="btn btn-success"
                                        >
                                        Add to cart
                                    </button>
                                </Link>
                                    
                                
                            </div>
                    
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

export default ViewProductDetail;


 