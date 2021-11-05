import './index.css';
import{Link} from "react-router-dom"
const Nav = () => {
        return (
            <>
                <div className= 'nav'>
                    <div className='logo'>
                        <Link to ="/">
                            <img src="../image/logo.gif" alt="Logo" className="logoImg"/>
                        </Link>
                       
                    </div>
                    <div className = "navBtn">
                    <Link to={"/cart-page"}>
                             <button className="viweCartBtn"><i className="fa fa-shopping-cart"></i></button>
                    </Link>
                        
                    </div>
                    
                </div>
            </>
        );
}

export default Nav;