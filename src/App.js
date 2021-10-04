import{BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';
import PastaPage from './pages/Pasta';
import Main from './pages/main';
import SoupPage from './pages/SoupPage';
import SaladPage from './pages/salad';
import ProductSoup from './components/soup/soupItem/ProductSoup';






function App() {
  return (
    <div className="App">
     
      <Router>
        <Switch>
          <Route path = '/' exact > <Main/> </Route>
          <Route path = '/SoupPage' exact > <SoupPage/> </Route>
          <Route path = '/PastaPage' exact > <PastaPage/> </Route>
          <Route path = '/SaladPage' exact > <SaladPage/> </Route>
          <Route exact path="/view-contact-details/:productId"><ProductSoup/></Route>
          
        </Switch>
      </Router>
      
      {/* <PastaPage /> */}
      {/* <SoupPage /> */}
      {/* <Salad /> */}

    </div>
  );
}




export default App;
