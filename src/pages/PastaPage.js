import Navigation from '../components/Navigation';
import Pasta from '../components/ItemCollectionMainPage/Pasta';
import PastaCollection from '../components/ItemCollection/PastaCollection';
import Footer from '../components/footer';


const PastaPage = () => {
    return (
        <>
           <Navigation />
           <Pasta />
           <PastaCollection />
           <Footer />
    
        </>
    );
};

export default PastaPage;