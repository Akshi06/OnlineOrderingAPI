import Service from "./Service";



// const SALAD_REST_API_URL = 'http://localhost:8080/v1/online-order/product/get?categories=salad';
// const SOUP_REST_API_URL = 'http://localhost:8080/v1/online-order/product/get?categories=soup';
// const PASTA_REST_API_URL = 'http://localhost:8080/v1/online-order/product/get?categories=pasta';


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
    
 
}

export default new ProductService();