import React from 'react';
import './pasta.css';


const index = () => {
    return (
        <div>
            <section className="onepasta">
                <div className='pastafirstImg'>
                    <img src='image/pasta3.jpg' alt="coverImg" className="coverImg"/>
                    <div className ="pastaHeads">
                        <h2 className="pastaHeading">Welcome to YUMMY TUMMY pasta Dishes...!</h2>
                        <p className="pastafirstP">"Life is a combination of magic and pasta...."</p>
                    </div>
                </div>
            </section>
        </div>
    );
};

export default index;