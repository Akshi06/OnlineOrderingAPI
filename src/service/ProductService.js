import axios from "axios";

const SALAD_REST_API_URL = 'http://localhost:8080/v1/online-order/product/get?categories=salad';
const SOUP_REST_API_URL = 'http://localhost:8080/v1/online-order/product/get?categories=soup';
const PASTA_REST_API_URL = 'http://localhost:8080/v1/online-order/product/get?categories=pasta';
// const PASTA_ID_REST_API_URL = 'http://localhost:8080/v1/online-order/product/4';

class ProductService {

    getSalad(){
       return axios.get(SALAD_REST_API_URL);
    }

    getSoup(){
        return axios.get(SOUP_REST_API_URL);
    }
    getPasta(){
        return axios.get(PASTA_REST_API_URL);
    }
    // getId(){
    //     return axios.get(PASTA_ID_REST_API_URL);
    // }
}

export default new ProductService();