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
    // postCutIdAndDate(){
        // return Service.post(`/order?custId=5`,)
    // }

    // postOrderProduct(orderId , productId ,productQuntity ){
    //     return Service.post(`/orderProduct?orderId=${orderId}&productId=${productId}&productQuntity=${productQuntity}`)
    // }

    postPaymentDetail(){
        return Service.post(`/payment`)
    }
    
 
}

export default new ProductService();