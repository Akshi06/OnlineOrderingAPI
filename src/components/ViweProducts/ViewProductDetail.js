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
        this.postDataInToLocal = this.postDataInToLocal.bind(this);
       
        this.state = {
            soupItem:{
                productId:0,
                productName:"",
                productDescription:"",
                price:0,
                img:"",
                
            },
            
            
        };
        
    }

    onChangeQuntity(e) {
        this.setState({
          productQuntity : e.target.value
        });
    }


    componentDidMount(){
        this.getProduct(this.props.match.params.productId);
    }

    componentWillUpdate(nextProps, nextState) {
        localStorage.setItem('items', JSON.stringify(nextState));
    }

    removingDupplicates(items){
        let equalities = [];

        for(let i of items){
            if(equalities.indexOf(i) === -1){
                equalities.push(i);
            }
        }

        return equalities;
    }
    
    postDataInToLocal(){

        let allItem = JSON.parse(localStorage.getItem("allItem"));

        let itemData = JSON.parse(localStorage.getItem("items"));

        let finalAllItem =[];

        let eleQuantity = 0;
        let stateQuantity = 0;
        let tot = 0;

        console.log("befor if null");
        if (allItem == null){

            allItem = [];

            finalAllItem.push(itemData);

            console.log("allItem" , finalAllItem);

            localStorage.setItem("allItem" , JSON.stringify(finalAllItem));

        }else{ 
            console.log("for let i");

            let count = 1;

            for(let i = 0; i < allItem.length;i++){
                count+=1;

                console.log(count);


                if (JSON.stringify(allItem[i].soupItem.productId) === JSON.stringify(itemData.soupItem.productId)) {

                    console.log("checking equalities");

                    if (window.confirm('You have already added this item. Are you sure you want to add this ?')) {

                        eleQuantity = Number(allItem[i].productQuntity);

                        stateQuantity = Number(this.state.productQuntity);

                        tot = eleQuantity + stateQuantity;
                        
                        const index = allItem.indexOf(allItem[i]);

                        if (index > -1) {
                            allItem.splice(index, 1);

                            console.log("deleting", index);
                        }

                        if(localStorage.getItem("items")){

                            this.setState({

                                productQuntity:tot
                            })
                            
                        }
                        finalAllItem.push(itemData);

                        itemData.productQuntity = tot;

                    }else{
                        console.log("conifirmation canceled");
                        break;
                    }
                }else{
                    finalAllItem.push(itemData);

                    console.log("no any equalities");
                }
            }

            for(let c = 0; c < allItem.length; c++){
                finalAllItem.push(allItem[c])
            }


            let finalArray = this.removingDupplicates(finalAllItem)
            
            console.log(finalArray, "final array");

            localStorage.setItem("allItem" , JSON.stringify(finalArray))

        }

    }
  
    getProduct(productId){
        ProductService.getByProductId(productId)
        .then(response =>{
            this.setState({
                soupItem:response.data[0]
              
            });
        });
     

    } 

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
                                        onChange={this.onChangeQuntity}
                                        name="productQuntity"
                                    />
                                    
                                </div>
                           
                                <Link to = "">
                                    <button type="submit"  onClick = {this.postDataInToLocal}className="btn btn-success">
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
                  <p>Please check the a Order...</p>
                </div>
              )}
          </div>
        );
    }
}

export default ViewProductDetail;


 