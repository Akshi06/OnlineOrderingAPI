import axios from "axios";

export default axios.create({
    baseURL:"http://localhost:8080/v1/online-order",
    headers:{
        "Content-tpye": "application/json"
    }
});