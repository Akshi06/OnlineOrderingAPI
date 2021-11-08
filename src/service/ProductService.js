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
    postOrder(){
        return Service.post("/orders?cusId=2")
    }
    postPaymentDetail(orderId , totalPayment){
        return Service.post(`/payment?orderId=${orderId}&totalPayment=${totalPayment}`)
    }
    postOrderProduct(orderId , productId ,productQuntity ){
        return Service.post(`/order-product?orderId=${orderId}&productId=${productId}&productQuntity=${productQuntity}`)
    }

    
 
}

export default new ProductService();