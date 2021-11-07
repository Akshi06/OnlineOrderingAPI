import{BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';
import PastaPage from './pages/PastaPage';
import Main from './pages/main';
import SoupPage from './pages/SoupPage';
import SaladPage from './pages/SaladPage';
import ViewProductDetail from './components/ViweProducts/ViewProductDetail';
import Cart from './components/CartPage/Cart';









function App() {
  return (
    <div className="App">
      <Router>
        <Switch>
          <Route path = '/' exact > <Main/> </Route>
          <Route path = '/SoupPage' exact > <SoupPage/> </Route>
          <Route path = '/PastaPage' exact > <PastaPage/> </Route>
          <Route path = '/SaladPage' exact > <SaladPage/> </Route>
          <Route path="/product/:productId" component = {ViewProductDetail} exact></Route>
          <Route path = "/cart-page" exact><Cart /></Route>
        </Switch>
      </Router>
      {/* <Singup /> */}

     
      
    </div>
  );
}




export default App;
