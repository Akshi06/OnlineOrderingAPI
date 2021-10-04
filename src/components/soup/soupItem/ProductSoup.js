import React from 'react';
import { useLocation } from 'react-router-dom';

const ProductSoup = () => {

    const { state } = useLocation();
    return (
        <div>
            <div>
                
             <strong>Id: </strong> {state.soupItem.productId}{" "}
            
            </div>
            
        </div>
    );
};

export default ProductSoup;

