/*
 * package com.example.smsdemo.springbootsmsapp;
 * 
 * import org.json.JSONObject; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.razorpay.Order; import com.razorpay.RazorpayClient; import
 * com.razorpay.RazorpayException;
 * 
 * @CrossOrigin("*")
 * 
 * @RestController
 * 
 * @RequestMapping("/api/payment") public class PaymentController {
 * 
 * private final String RAZORPAY_KEY_ID = "rzp_test_P0OeGrtDJwTPdL"; private
 * final String RAZORPAY_KEY_SECRET = "hcEgnePzkaleeZgETXzG6qSh";
 * 
 * @PostMapping("/create-order") public String createOrder() throws
 * RazorpayException { try { RazorpayClient razorpayClient = new
 * RazorpayClient(RAZORPAY_KEY_ID, RAZORPAY_KEY_SECRET); JSONObject options =
 * new JSONObject(); options.put("amount", 10); // Amount in paise (e.g., 10000
 * paise = INR 100) options.put("currency", "INR");
 * 
 * Order order = razorpayClient.orders.create(options); return order.toString();
 * } catch (RazorpayException e) { // Handle exception appropriately return
 * "Error occurred while creating the order."; } } }
 */