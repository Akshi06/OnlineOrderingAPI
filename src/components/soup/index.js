import React from 'react';
import './soup.css';
// import coverImg from './image/soupCimg.jpg'

const soup = () => {
    return (
        <div>
            <div>
                <section className="onesoup">
                    <div className='soupfirstImg'>
                        <img src='image/soupCimg.jpg' alt="coverImg" className="soupcoverImg"/>
                        <div className ="soupHeads">
                            <h2 className="soupHeading">Welcome to YUMMY TUMMY soup Dishes...!</h2>
                            <p className="soupfirstP">"Drinking soup provides a great moment of exhilarating taste"</p>
                        </div>
                    </div>
                </section>
            </div>  
        </div>
    );
};

export default soup;