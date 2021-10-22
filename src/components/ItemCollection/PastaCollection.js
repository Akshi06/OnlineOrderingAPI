import React, { Component } from 'react';
import './Collection.css';
import ProductService from '../../service/ProductService';
import{Link} from "react-router-dom"


class PastaCollection extends React.Component {
    
    constructor(props){
        super(props)
        this.state ={
            item:[]
        }
    }

    
    componentDidMount(){
            ProductService.getPasta().then((response) => {
                this.setState({item: response.data})
                 
            });  
    }




    render(){
        
        return(
            <div className ='topic'>
                <h1>_. Pasta Dishes ._</h1>
                <div className='mainCard'>
                    {
                        this.state.item.map(
                            items =>                 
                            <h3 key = {items.productId}>
                            <div className = 'card'>
                                <img src={items.img} alt={items.productName} className='itemImg'/>
                                <div className = 'cardItem'>
                                    <h3>{items.productName}</h3>
                                        <h3> Rs:{items.price}</h3>
                                        
                                        <Link to={"/product/" + items.productId}>
                                                    <button>Order</button>
                                        </Link>
                                     
                                    </div>
                                </div>
                            </h3> 
                        )            
                    }
                </div>           
            </div>
        )        
    }
}

export default PastaCollection;

