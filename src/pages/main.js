import React from 'react';
import {useHistory} from 'react-router-dom';

import Navigation from '../components/Navigation';
import Footer from '../components/footer';
import './main.css';


const Main = (props) => {

        const history = useHistory();

        return (

                <>
                        <Navigation />

                        <section className="one">
                                <div className='firstImg'>
                                        <img src='image/slide-3.jpg' alt="main" className="mainImg"/>
                                        <div className ="first">
                                                <h2 className="firstHeading">Welcome to YUMMY TUMMY...!</h2>
                                                <p className="firstP">We deliver good quality food with great service to our customers</p>
                                        </div>
                                        
                                </div>
                        </section>

                        <section className="two">
                                <div className="seconeSec">
                                        <h2 className="seconeTopic"> _. YUMMY TUMMY Dishes ._</h2>
                                        <p className="secP">We Provide Quality Food. We Care About Your Health</p>
                                </div>
                        </section>
                        <section className="three">
                                <div className="threePic">
                                        <div className="soup">
                                                <img src ='image/soup.png' alt="soup" className="soup1" />
                                                <button onClick={() => history.push('/SoupPage')} className="soupB">Soup</button>       
                                        </div>
                                        <div className="pasta">
                                                <img src ='image/pastam.png' alt="pasta" className="pasta1" />
                                                <button onClick={() => history.push('/PastaPage')} className="pastaB">Pasta</button>        
                                        </div>
                                        <div className="salad">
                                                <img src ='image/sam.png' alt="salad" className="salad1" />
                                                <button onClick={() => history.push('/SaladPage')} className="pastaB">Salad</button>
                                                        
                                        </div>      
                                </div>
                        </section>
                        <div className = "fmain">
                                <Footer />
                        </div>
                </>
        );

}

export default Main;