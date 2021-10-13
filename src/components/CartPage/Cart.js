
import'./Cart.css'
import React, { Component } from 'react';
import ProductService from '../../service/ProductService';

class Cart extends Component {
    constructor(props) {
        super(props);
      
        this.retrieveTutorials = this.retrieveTutorials.bind(this);
        this.refreshList = this.refreshList.bind(this);
        this.setActiveTutorial = this.setActiveTutorial.bind(this);
        
        this.state = {
          tutorials: [],
          currentTutorial: null,
          currentIndex: -1,
          searchTitle: ""
        };
      }
    
      componentDidMount() {
        this.retrieveTutorials();
      }
    
    
      retrieveTutorials() {
        ProductService.addTOCart()
          .then(response => {
            this.setState({
              tutorials: response.data
            });
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          });
      }
    
      refreshList() {
        this.retrieveTutorials();
        this.setState({
          currentTutorial: null,
          currentIndex: -1
        });
      }
    
      setActiveTutorial(tutorial, index) {
        this.setState({
          currentTutorial: tutorial,
          currentIndex: index
        });
      }
    
    

    render() {
        const {  currentTutorial } = this.state;
        return (
            <div className="list row">
                 
                <div className="col-md-6">

                <button
                    className="m-3 btn btn-sm btn-danger"
                    onClick={this.removeAllTutorials}
                >
                    Remove All
                </button>
             </div>
        <div className="col-md-6">
          {currentTutorial ? (
            <div>
              <h4>Tutorial</h4>
              <div>
                <label>
                  <strong>Title:</strong>
                </label>{" "}
                {currentTutorial.invoiceNo}
              </div>
              <div>
                <label>
                  <strong>Description:</strong>
                </label>{" "}
                {currentTutorial.orderProduct}
              </div>

              {/* <Link
                to={"/tutorials/" + currentTutorial.id}
                className="badge badge-warning"
              >
                Edit
              </Link> */}
            </div>
          ) : (
            <div>
              <br />
              <p>Please click on a order...</p>
            </div>
          )}
        </div>
      </div>
        );
    }
}

export default Cart;

