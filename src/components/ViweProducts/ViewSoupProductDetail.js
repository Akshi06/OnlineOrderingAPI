// import React from 'react';
// import { useParams } from 'react-router-dom';

import Nav from '../Navigation';
import "./index.css"
import ProductService from '../../service/ProductService';

import React, { Component } from 'react';

class ViewSoupProductDetail extends Component {
    constructor(props){
        super(props)
        this.state ={
            Soupitem:[]
        }

    }
    componentDidMount(){
        ProductService.getSoupItem().then((response) => {
            this.setState({Soupitem: response.data})
             
        });  
    }
    render() {
        return (
            <div>
                <div className = "header">
                     <Nav />
                   
                        {
                            this.state.Soupitem.map(
                                item =>
                                <h3 key = {item.productId}>
                                    <div className = "Content"> 
                                        <div className = "column">
                                            <img src = {item.img} className = "FirstImg" />
                                        </div>
                                        <div className = "column">
                                            <h1>Name: {item.productName} </h1> 
                                            <h3>Price: {item.price} </h3> 
                                            <h4> Q </h4>
                                        </div>
                                    </div>
                                    <div className = "section2">
                                        <div className = "description">
                                            <h2>Description</h2>
                                            <p>{item.productDescription}</p>
                                        </div>
                                    </div>
                                </h3>
                            )
                        }      
                </div>
                
            </div>
        );
    }
}

export default ViewSoupProductDetail;

// const ViewProductDetail = (props) => {

//     const params = useParams();

//     return (
//         <div className = "header">
//               <Nav />
//             <div className = "Content">  
//                 <div className = "column">
//                     <img src = "image/soup.png" className = "FirstImg" />
//                 </div>
//                 <div className = "column">
//                     {/* <h5>Id: </h5> {params.productId} */}
//                     <h1>Name: {params.productName} </h1> 
//                     <h3>Price </h3> 
//                     <h4> Q </h4>
//                 </div>
//             </div>
//             <div className = "section2">
//                 <div className = "description">
                     
//                     <h2>Description</h2>
//                     <p>{params.productDescription}</p>
//                 </div>
//             </div>
            
//         </div>
//     );
// };

// export default ViewProductDetail;
