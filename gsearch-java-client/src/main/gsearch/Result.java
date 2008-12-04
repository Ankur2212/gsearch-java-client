
package gsearch;

import java.util.*;

public class Result
{
	private String title;
	private String unescapedUrl;
	private String clusterUrl;
	private String url;
	private String publisher;
	private String publishedDate;
	private String location;
	private String content;
	private String titleNoFormatting;
	private String lat;
	private String lng;
	private String streetAddress;
	private String city;
	private String region;
	private String country;
	private Image image;
	private List<PhoneNumber> phoneNumbers;
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getUnescapedUrl()
	{
		return unescapedUrl;
	}
	
	public void setUnescapedUrl(String unescapedUrl)
	{
		this.unescapedUrl = unescapedUrl;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public void setPublisher(String p)
	{
		this.publisher = p;
	}

	public String getPublishedDate()
	{
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate)
	{
		this.publishedDate = publishedDate;
	}

	
	
	public String getLocation()
	{
		return location;
	}

	public void setLocation(String loc)
	{
		this.location = loc;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image im)
	{
		this.image = im;
	}

	
	public String getClusterUrl()
	{
		return clusterUrl;
	}

	public void setClusterUrl(String u)
	{
		this.clusterUrl = u;
	}


	
	public String getContent()
	{
		return content;
	}

	public void setContent(String c)
	{
		this.content = c;
	}

	
	public String getTitleNoFormatting()
	{
		return titleNoFormatting;
	}

	public void setTitleNoFormatting(String formatting)
	{
		this.titleNoFormatting = formatting;
	}

	
	public String getLat()
	{
		return lat;
	}

	public void setLat(String lat)
	{
		this.lat = lat;
	}

	public String getLng()
	{
		return lng;
	}

	public void setLng(String lng)
	{
		this.lng = lng;
	}

	public String getStreetAddress()
	{
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getRegion()
	{
		return region;
	}

	public void setRegion(String region)
	{
		this.region = region;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public List<PhoneNumber> getPhoneNumbers()
	{
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> pnumbers)
	{
		this.phoneNumbers = pnumbers;
	}

	public String toString()
	{
		return this.getTitleNoFormatting() + "\n" 
				+ this.getUnescapedUrl() + "\n"
				+ this.getPublisher() + "\n"
				+ this.getPublishedDate() + "\n"
				+ this.getLocation() + "\n"
				+ ( (this.getImage() == null) ? "no image" : "Image url: " + this.getImage().getUrl());
	}
	
}
