import React, { Component } from 'react';
import './Collection.css';
import ProductService from '../../service/ProductService';




class SaladCollection extends React.Component {
    
    constructor(props){
        super(props)
        this.state ={
            item:[]
        }
    }

    
    componentDidMount(){
            ProductService.getSalad().then((response) => {
                this.setState({item: response.data})
                 
            });  
    }



    render(){
        
            return(
                <div className ='topic'>
                    <h1>_. Salad Dishes._</h1>
                    <div className='mainCard'>
                    
                        {
                        
                            this.state.item.map(
                                items =>
                                        <h3 key = {items.categories}>
                                                <div className = 'card'>
                                                    <img src={items.img} alt={items.productName} className='itemImg'/>
                                                    <div className = 'cardItem'>
                                                        <h3>{items.productName}</h3>
                                                        <h3> Rs:{items.price}</h3>
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
export default SaladCollection