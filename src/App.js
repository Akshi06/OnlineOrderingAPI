import{BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';
import PastaPage from './pages/PastaPage';
import Main from './pages/main';
import SoupPage from './pages/SoupPage';
import SaladPage from './pages/SaladPage';
import ViewSoupProductDetail from './components/ViweProducts/ViewSoupProductDetail';
import Cart from './components/CartPage/Cart'


// import Cart from './components/CartPage/Cart';






function App() {
  return (
    <div className="App">

     
      <Router>
        <Switch>
          <Route path = '/' exact > <Main/> </Route>
          <Route path = '/SoupPage' exact > <SoupPage/> </Route>
          <Route path = '/PastaPage' exact > <PastaPage/> </Route>
          <Route path = '/SaladPage' exact > <SaladPage/> </Route>
          <Route path="/product/:productId" component = {ViewSoupProductDetail}></Route>
          <Route path="/cart" component = {Cart}></Route>

          
        </Switch>
      </Router>
      
    </div>
  );
}




export default App;
