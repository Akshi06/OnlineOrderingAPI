import React from 'react';
import './Collection.css';
import ProductService from '../../service/ProductService';
import{Link} from "react-router-dom"
import BackBtn from '../Gobackbtn/BackBtn';
class SoupCollection extends React.Component {
    
    constructor(props){
        super(props)
        this.state ={
            item:[]
        }

    }


    componentDidMount(){
            ProductService.getSoup().then((response) => {
                this.setState({item: response.data})
                 
            });  
    }


    render(){
        return(
            <div>
              
                <div className ='topic'>
                <BackBtn />
                    <h1 className="topicMain">_. Soup Dishes ._</h1>
                    <div className='mainCard'>
                        {
                        this.state.item.map(
                            soupItem =>
                                <h3 key = {soupItem.productId}>
                                    <div className = 'card'>
                                        <img src= {soupItem.img} alt={soupItem.productName} className='itemImg'/>
                                        <div className = 'cardItem'>
                                            <h3>{soupItem.productName}</h3>
                                            <h3> Rs:{soupItem.price}</h3>
                                            <Link to={"/product/" + soupItem.productId}>
                                                <button className="orderBtn">Order</button>
                                            </Link>
                                        </div>
                                    </div>
                                </h3> 
                            )
                        }
                    </div>
                </div>
            </div>
            )

        
    }
}

export default SoupCollection;