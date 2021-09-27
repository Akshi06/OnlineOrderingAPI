import './App.css';
import PastaPage from './pages/Pasta';
import Main from './pages/main';
import SoupPage from './pages/soupPage';
import Salad from './pages/salad';
import{Broweser as Router, Route, Switch} from 'react-router-dom';




function App() {
  return (
    <div className="App">
      <Main />
      
      {/* <PastaPage /> */}
      {/* <SoupPage /> */}
      {/* <Salad /> */}

    </div>
  );
}




export default App;
