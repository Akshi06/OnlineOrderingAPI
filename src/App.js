import{BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';
import PastaPage from './pages/PastaPage';
import Main from './pages/main';
import SoupPage from './pages/SoupPage';
import SaladPage from './pages/SaladPage';
import ViewProductDetail from './components/ViweProducts/ViewProductDetail';
import Cart from './components/CartPage/Cart'
import LoginPage from './components/LoginPage/login';


// import Cart from './components/CartPage/Cart';






function App() {
  return (
    <div className="App">
      {/* <LoginPage/> */}

     
      <Router>
        <Switch>
          <Route path = '/' exact > <Main/> </Route>
          <Route path = '/SoupPage' exact > <SoupPage/> </Route>
          <Route path = '/PastaPage' exact > <PastaPage/> </Route>
          <Route path = '/SaladPage' exact > <SaladPage/> </Route>
          <Route path="/product/:productId" component = {ViewProductDetail}></Route>
          <Route path="/Cart/:orderProduct_id" component ={Cart}></Route>

          
        </Switch>
      </Router>
      
    </div>
  );
}




export default App;
