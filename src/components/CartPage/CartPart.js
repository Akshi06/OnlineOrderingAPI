import React from 'react';

function CartPart() {
    let A = JSON.parse(localStorage.allItem)
    console.log(A[1].soupItem.productId);
    for(let i = 1; i < A.length ; i++){
       console.log(A[i].soupItem.productName);
    }
    return (
        <div>
            
        </div>
    );
}

export default CartPart;