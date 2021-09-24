import Navigation from '../components/Navigation';
import Footer from '../components/footer';
// import main from '../image/slide-3.jpg';
import './main.css';
// import soup from '../image/soup.png';
// import pasta from '../image/pastam.png';
// import salad from '../image/sam.png';

const Main = () => {
        return (

                <>
                        <Navigation />

                        <section className="one">
                                <div className='firstImg'>
                                        {/* <img src={main} alt="main" className="mainImg"/> */}
                                        <div className ="first">
                                                <h2 className="firstHeading">Welcome to YUMMY TUMMY...!</h2>
                                                <p className="firstP">We deliver good quality food with great service to our customers</p>
                                        </div>
                                        
                                </div>
                        </section>

                        <section className="two">
                                <div className="seconeSec">
                                        <h2 className="seconeTopic">YUMMY TUMMY Dishes</h2>
                                        <p className="secP">We Provide Quality Food. We Care About Your Health</p>
                                </div>
                        </section>
                        <section className="three">
                                <div className="threePic">
                                        <div className="soup">
                                                {/* <img src ={soup} alt="soup" className="soup1" /> */}
                                                <button onclick="shoot()" className="soupB">Soup</button>
                                                
                                        </div>
                                        <div className="pasta">
                                                {/* <img src ={pasta} alt="pasta" className="pasta1" /> */}
                                                <button onclick="shoot()" className="pastaB">Pasta</button>
                                                
                                        </div>
                                        <div className="salad">
                                                {/* <img src ={salad} alt="salad" className="salad1" /> */}
                                                <button onclick="shoot()" className="saladB">Salad</button>
                                                
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