import Service from "./Service";

class ProductService {

    getSalad(){
       return Service.get("/products/category?categories=salad");
    }

    getSoup(){
        return Service.get("/products/category?categories=soup");
    }
    getPasta(){
        return Service.get("/products/category?categories=pasta");
    }

    get(productId){
        return Service.get(`/products/${productId}`);
    }
    postTheCustomer(data){
        return Service.post(`/customer`, data)
    }
    postOrder(data){
        return Service.post("/orders?cusId=2",data)
    }

    getByCustomerId(){
        return Service.get("/customer/2")
    }

    postPaymentDetail(){
        return Service.post(`/payment`)
    }
    
 
}

export default new ProductService();