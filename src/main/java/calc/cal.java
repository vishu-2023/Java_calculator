package calc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.startup.Tomcat.ExistingStandardWrapper;

/**
 * Servlet implementation class cal
 */
public class cal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		private String[]  s= {
				"ચૂસ  મારો લોડો ચોદયા	",
				"વયો જા વયો જા",
				"ઊઊઓ ઍઍઍઍઍઍઍઍ ઊંઊં ",
				"ઠીક છે",
				"અંદર ના રૂમ માં જઈને વાંક વાળીને ઉભા રહો મુ આઉઉ ચુ",
				"ત્રણ સ્તન ની ડીટડી વાળો બાબુ",
				"હવે ભોશદીના જાને અહીંથી"
				
							
		};
       
   
    public cal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		String str3=request.getParameter("bt1");
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
         int ans;
		
		if(str3.equals("1")) ans= a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else ans=a/b;

		 int randomIndex = (int) (Math.random() * s.length);
	     String randomJoke = s[randomIndex];
	     
		response.sendRedirect("NewFile.jsp?Ans = "+ans+"& વાહ="+randomJoke);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
