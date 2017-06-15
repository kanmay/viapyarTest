package packageB;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleOrder
 */
@WebServlet("/HandleOrder")
public class HandleOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Customer c = new Customer();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int orderCount = Integer.parseInt(request.getParameter("ordercount"));
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		int productId=0;
		int price=0;
		float discount=0;
		float cashback=0;
		int quantity=0;
		String receiversName="";
		String receiversAddress="";
		String receiversPhone="";
		String orderStatus="";
		String promoCode="";
		String paymentMethod="";
		String paymentStatus="";
		
		String usersAddress="";
		String usersCity="";
		String usersState="";
		int usersZip=0;
		String usersPhone="";
		
		
		
		receiversName=request.getParameter("RName");
		receiversAddress=request.getParameter("RAddress");
		receiversPhone=request.getParameter("RPhone");
		orderStatus="Received Successfully";
		promoCode="";
		paymentMethod="COD";
		paymentStatus="Pending";
		
		usersAddress=request.getParameter("UAddress");
		usersCity=request.getParameter("UCity");
		usersState=request.getParameter("UState");
		usersZip=Integer.parseInt(request.getParameter("UZip"));
		usersPhone=request.getParameter("UPhone");
		
		if(orderCount==0){
			
			productId=Integer.parseInt(request.getParameter("productId"));
			price=Integer.parseInt(request.getParameter("price"));
			discount=Float.parseFloat(request.getParameter("discount"));
			cashback=Float.parseFloat(request.getParameter("cashback"));
			quantity=Integer.parseInt(request.getParameter("quantity"));
			

			
			c.getOrder(customerId, productId, price, discount, cashback, quantity, receiversName, 
					   receiversAddress, receiversPhone,orderStatus, promoCode, paymentMethod, paymentStatus);
			
		}else{
		
		
		for(int i=1;i<=orderCount;i++){
			
			productId=Integer.parseInt(request.getParameter("productId"+Integer.toString(i)));
			price=Integer.parseInt(request.getParameter("price"+Integer.toString(i)));
			discount=Float.parseFloat(request.getParameter("discount"+Integer.toString(i)));
			cashback=Float.parseFloat(request.getParameter("cashback"+Integer.toString(i)));
			quantity=Integer.parseInt(request.getParameter("quantity"+Integer.toString(i)));
			

			
			c.getOrder(customerId, productId, price, discount, cashback, quantity, receiversName, 
					   receiversAddress, receiversPhone,orderStatus, promoCode, paymentMethod, paymentStatus);
			c.DeleteFromCart(customerId, productId);
		}
		}
		
		    c.updateUserProfile(customerId,usersAddress,usersCity,usersZip,usersState,usersPhone);
		    response.sendRedirect("Thankyou.html");
		
	}
}
