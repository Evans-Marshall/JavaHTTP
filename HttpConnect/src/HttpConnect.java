
import java.io.*;
import java.net.*;

public class HttpConnect {

	public static void main(String args[]) throws IOException {

	    URL url = new URL("https://www.gunnerkrigg.com/");
	    HttpURLConnection con = (HttpURLConnection) url.openConnection();
	    con.setRequestMethod("GET");

	    BufferedReader in = new BufferedReader(new InputStreamReader(
	        con.getInputStream()));
	    String inputLine;
	    while ((inputLine = in.readLine()) != null) {
	      System.out.println(inputLine);
	    }

	    in.close();
	  }


}

	