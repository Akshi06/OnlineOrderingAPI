import{BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import './App.css';
import PastaPage from './pages/PastaPage';
import Main from './pages/main';
import SoupPage from './pages/SoupPage';
import SaladPage from './pages/SaladPage';
import ViewSoupProductDetail from './components/ViweProducts/ViewSoupProductDetail';






function App() {
  return (
    <div className="App">
     
      <Router>
        <Switch>
          <Route path = '/' exact > <Main/> </Route>
          <Route path = '/SoupPage' exact > <SoupPage/> </Route>
          <Route path = '/PastaPage' exact > <PastaPage/> </Route>
          <Route path = '/SaladPage' exact > <SaladPage/> </Route>
          <Route exact path="/view-product-details/:productId"><ViewSoupProductDetail/></Route>
          
        </Switch>
      </Router>
    </div>
  );
}




export default App;
