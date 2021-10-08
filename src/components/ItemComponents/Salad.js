import React from 'react';
import './ItemIndex.css';

const Salad = () => {
    return (
        <div>
            <section className="oneSalad">
                <div className='saladfirstImg'>
                    <img src='image/sm.png' alt="coverImg" className="coverImg"/>
                    <div className ="saladHeads">
                        <h2 className="saladHeading">Welcome to YUMMY TUMMY salad Dishes...!</h2>
                        <p className="saladfirstP">"Junk food satisfies you for a minute. Healthy food, on the other hand, satisfies you for life...."</p>
                    </div>
                </div>
            </section>
            
        </div>
    );
};

export default Salad;