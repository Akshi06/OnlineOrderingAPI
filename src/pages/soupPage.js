import React from 'react';
import Navigation from '../components/Navigation';
import Soup from '../components/soup/index';
import Body from '../components/soup/soupItem/soupItem'
import Footer from '../components/footer';

const soupPage = () => {
    return (
        <div>
            <Navigation />
            <Soup />
            <Body />
            <Footer />
        </div>
    );
};

export default soupPage;