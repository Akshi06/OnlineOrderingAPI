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
    postCutIdAndDate(data){
        return Service.post(`/order?custId=2`,data)
    }

    postOrderProduct(orderId , productId ,productQuntity ){
        return Service.post(`/orderProduct?orderId=${orderId}&productId=${productId}&productQuntity=${productQuntity}`)
    }
    
 
}

export default new ProductService();