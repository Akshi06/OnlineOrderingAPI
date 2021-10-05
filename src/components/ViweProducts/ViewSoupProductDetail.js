import React from 'react';
import { useParams } from 'react-router-dom';

const ViewProductDetail = (props) => {

    const params = useParams();

    return (
        <div>
            <div>
                
             <strong>Id: </strong> {params.productId}
             <strong>Id: </strong> {params.productName}
            
            </div>
            
        </div>
    );
};

export default ViewProductDetail;
