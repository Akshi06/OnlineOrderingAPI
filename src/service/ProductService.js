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
    postTheAddress(data){
        return Service.post(`/customer-address`, data)
    }
    getCustomers(){
        return Service.get("/customers")
    }

    // postOrderProduct(orderId , productId ,productQuntity ){
    //     return Service.post(`/orderProduct?orderId=${orderId}&productId=${productId}&productQuntity=${productQuntity}`)
    // }

    postPaymentDetail(){
        return Service.post(`/payment`)
    }
    
 
}

export default new ProductService();