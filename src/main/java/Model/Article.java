package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table()
public class Article {

	@Column
	String heading=null;
	@Column
	@Id
	String url=null;
	
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String heading, String url) {
		super();
		this.heading = heading;
		this.url = url;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
