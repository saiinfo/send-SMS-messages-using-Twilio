import React, { useState } from 'react';
import axios from 'axios';

const PaymentComponent = () => {
  const [orderId, setOrderId] = useState('');

  const createOrder = async () => {
    try {
      const response = await axios.post('/create-order');
      setOrderId(response.data.id);
    } catch (error) {
      console.error('Error creating order:', error);
    }
  };

  return (
    <div>
      <h2>Payment Form</h2>
      <button onClick={createOrder}>Create Order</button>
      {orderId && <p>Order ID: {orderId}</p>}
    </div>
  );
};

export default PaymentComponent;
