package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import Model.Article;
import Model.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/_home.jsp");
	rd.forward(request, response);
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String baseUrl="https://economictimes.indiatimes.com/headlines.cms";
		WebClient client=new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		HtmlPage page;
		String url=null;
		String heading=null;
		List<Article> list_of_articles= new ArrayList<Article>();
		try{
			 page=client.getPage(baseUrl);
			
			 
			//main domnode on section of the economictimes.indiatimes.com/headlines.cms
		 DomNode section=page.getFirstByXPath("//section[@id='pageContent']");
		
		 //article anchor domnodes list 
		 List<DomNode> article_anchor_domnodes=section.getByXPath("//section[@id='pageContent'] //a");

		
		 
		 //add path to articles_url_link
		 for(DomNode a:article_anchor_domnodes) {
			 if(((DomElement) a).getAttribute("href").length()>60 && !((DomElement) a).getAttribute("href").startsWith("https://"))
			 {
			url="https://economictimes.indiatimes.com/"+((DomElement) a).getAttribute("href");
			 heading=((DomElement) a).getAttribute("title");
		
			
			 if(!heading.isEmpty()) {
			 Article article= new Article(heading,url);
			list_of_articles.add(article);
			 }
			 }
			 }
		
		 
		 /*  int i =0;
		 //printing total no of url
		for(String url:url_list_of_article) {
			 System.out.println(url);
			 i++;
		 }
		 System.out.println(i);
		 */
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		request.setAttribute("articles",list_of_articles);
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/articles.jsp");
		rd.forward(request, response);

}
}
