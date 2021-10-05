import React from 'react';
import Navigation from '../components/Navigation';
import Salad from '../components/ItemComponents/Salad';
import SaladCollection from '../components/ItemCollection/SaladCollection'
import Footer from '../components/footer';

const SaladPage = () => {
    return (
        <div>
            <Navigation />
            <Salad />
            <SaladCollection />
            <Footer />
        </div>
    );
};

export default SaladPage;
