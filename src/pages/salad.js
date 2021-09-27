import React from 'react';
import Navigation from '../components/Navigation';
import Salad from '../components/salad/salad';
import SaladItem from '../components/salad/saladItem/SaladItem';
import Footer from '../components/footer';

const salad = () => {
    return (
        <div>
            <Navigation />
            <Salad />
            <SaladItem />
            <Footer />
        </div>
    );
};

export default salad;
