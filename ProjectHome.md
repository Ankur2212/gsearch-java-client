Java client library for Google's [Ajax Search API](http://code.google.com/apis/ajaxsearch/)

### Example: searching Google News ###

```

 import gsearch.*;

 Client client = new Client();

 List<Result> portland = c.searchNewsByLocation("97202");

 List<Result> yankees = c.searchNews("Yankees", "New York, NY", null);

 List<Result> boston = c.searchNews(null, 
                                    "Boston, MA", 
                                    NewsTopic.BUSINESS);

```

### Example:  Google Local search ###

```

 import gsearch.*;

 Client client = new Client();

 double lat = 45.521694;
		
 double lon = -122.691806;
		
 List<Result> coffee = c.searchLocal(lat, lon, "coffee");

```


## Example:  Google web search ##

```

 import gsearch.*;

 Client client = new Client();

 List<Result> ajax = c.searchWeb("google ajax search");

```

## Example:  Google book search ##

```

 import gsearch.*;

 Client client = new Client();

 List<Result> books = c.searchBooks("economy");

```


## Example:  Google image search ##

```

 import gsearch.*;

 Client client = new Client();

 List<Result> lolcats = c.searchImages("lolcats");

```


## Example:  Google blog search ##

```

 import gsearch.*;

 Client client = new Client();

 List<Result> lolcats = c.searchBlogs("lolcats");

```


## Example:  Google video search ##

```

 import gsearch.*;

 Client client = new Client();

 List<Result> video = c.searchVideos("bike ride", OrderBy.DATE);

```