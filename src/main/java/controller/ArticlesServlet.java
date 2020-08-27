package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * Servlet implementation class ArticlesServlet
 */
public class ArticlesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticlesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String baseUrl=request.getParameter("url");
		System.out.println(baseUrl);
		WebClient client=new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		HtmlPage page;
		String heading=null;
		String img_url=null;
		String text1=null;
		try{
			 page=client.getPage(baseUrl);
			 
			 
			 //heading DomNode
		 DomNode head=page.getFirstByXPath("//body//h1");
		 heading=head.asText();
		 System.out.println(heading);
		 //image DomNode
		DomElement img=page.getFirstByXPath("//body//figure[@class='artImg']/img");
		
		if(img!=null) {
		//img url
		 img_url=img.getAttribute("src");
		System.out.println(img_url);
		}
		// to get article main text htmlelement
		HtmlElement text=(HtmlElement) page.getFirstByXPath("//body//div[@class='artText']");
		//Iterable<DomNode> itr=text.getChildren();	
		if(text!=null)
		 text1=text.asText();
		
		//to print main article html code
		/*for(DomNode node:itr) {
			
			System.out.println(node.asXml());
		}*/
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
		
		request.setAttribute("url",baseUrl);
	request.setAttribute("heading",heading);
	request.setAttribute("img_url",img_url);
	request.setAttribute("text", text1);
	
	RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/WEB-INF/views/articleshow.jsp");
	rd.forward(request,response);
	}  
	
		
	}


