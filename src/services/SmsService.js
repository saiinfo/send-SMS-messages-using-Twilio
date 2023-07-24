import axios from 'axios'

const SMS_BASE_REST_API_URL = 'http://localhost:8080/sms';
const PAY_BASE_REST_API_URL = 'http://localhost:8080/create-order';

class SmsService{


    smsSubmit(sms){
        return axios.post(SMS_BASE_REST_API_URL,sms)
    }
     
   
    
   
}

export default new SmsService();