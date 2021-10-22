import Service from "./Service";

class ProductService {

    getSalad(){
       return Service.get("/product/get?categories=salad");
    }

    getSoup(){
        return Service.get("/product/get?categories=soup");
    }
    getPasta(){
        return Service.get("/product/get?categories=pasta");
    }

    get(productId){
        return Service.get(`/product/${productId}`);
    }
    postCutIdAndDate(){
        return Service.post(`/order?custId=5`,)
    }

    postOrderProduct(orderId , productId ,productQuntity ){
        return Service.post(`/orderProduct?orderId=${orderId}&productId=${productId}&productQuntity=${productQuntity}`)
    }
    getOrderProduct(orderProduct_id){
        return Service.get(`/OrderProduct/${orderProduct_id}`)
    }
    
 
}

export default new ProductService();