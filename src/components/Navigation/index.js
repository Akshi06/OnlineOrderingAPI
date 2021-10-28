import './index.css';
import{Link} from "react-router-dom"
const Nav = () => {
        return (
            <>
                <div className= 'nav'>
                    <div className='logo'>
                        <img src="../image/logo.png" alt="Logo" className="logoImg"/>
                       
                    </div>
                    <div className = "navBtn">
                    <Link to={"/Cart"}>
                             <button className="viweCartBtn"><i className="fa fa-shopping-cart"></i></button>
                    </Link>
                        
                    </div>
                    
                </div>
            </>
        );
}

export default Nav;