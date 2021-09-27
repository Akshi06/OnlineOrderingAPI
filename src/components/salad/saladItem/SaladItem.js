import ProductService from '../../../service/ProductService';
import react, { Component } from 'react';
import salad from '../salad';
import './item.css'
// import image from './summer.jpg'



class SaladItem extends react.Component {
    
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
                <div className = 'item'>
                    {/* <h1>Salad</h1> */}
                    <div>
                    
                        {
                        
                            this.state.item.map(
                                items =>
                                        <h3 key = {items.categories === "Salad"}>
                                            <div className = 'topCard'>
                                                <div className = 'card'>
                                                    <img src={items.img} alt={items.productName} className='itemImg'/>
                                                    <div className = 'cardItem'>
                                                        <h3>{items.productName}</h3>
                                                        <h3> Rs:{items.price}</h3>
                                                    </div>
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
export default SaladItem