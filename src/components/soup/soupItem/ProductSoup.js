// import React, { Component } from 'react';
// import ProductService from '../../../service/ProductService';
// import ProductSoup from './ProductSoup';


// class ProductSoup extends Component {
//     constructor(props){
//         super(props)
//         this.state ={
//             item:[]
//         }

//     }
//     componentDidMount(){
//             ProductService.getSoup().then((response) => {
//                 this.setState({item: response.data})
                 
//             });  
//     }
//     render() {
//         return (
//             <div>
//             {
//                 this.state.item.map(
//                     items =>
//                             <h3 key = {items.categories}>
//                                 <div className = 'card'>
//                                     <img src={items.img} alt={items.productName} className='itemImg'/>
//                                     <div className = 'cardItem'>
//                                         <h3>{items.productName}</h3>
//                                         <h3> Rs:{items.price}</h3>
//                                     </div>
//                                 </div>
                            
//                             </h3> 
//                 )
//             }
//         </div>
//         );
//     }
// }
// export default ProductSoup;




import React from 'react';
import { useLocation } from 'react-router-dom';

const ProductSoup = (_) => {

    const { state } = useLocation();
    // console.log(state.soupItem.productId);
    return (
        <div>
            <div>
                
             <strong>Id: </strong> {state.soupItem.productId}{" "}
            
            </div>
            
        </div>
    );
};

export default ProductSoup;

