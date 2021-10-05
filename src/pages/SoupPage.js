import React, { useState } from 'react';
import Navigation from '../components/Navigation';
import Soup from '../components/ItemComponents/Soup';
import Footer from '../components/footer';
import { useHistory } from 'react-router-dom';

const SoupPage = (props) => {

    const history = useHistory();
  



    return (
        <div>
            <Navigation />
            <Soup />
          
            <button onClick={() => history.goBack()}>Go back</button>
            <Footer/>

            
        </div>
    );
};

export default SoupPage;

