
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Random;


//import java.net.http.HttpClient;

public class App {

    private static final String USER_AGENT = "Mozilla/5.0";

	private static  String GET_URL = "https://reqres.in/api/users";

	private static  String POST_URL = "https://reqres.in/api/users";
    //POST_URL = "https://reqres.in/api/users";

	private static  String POST_PARAMS = "{\"name\": \"Upendra\", \"job\": \"Programmer\"}";
    
    private static void sendGET() throws IOException {
		GET_URL = "http://automatiomservices.somee.com/api/users";
        URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
        //set JSON Format
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
        

		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
            //byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
                //byte[] bytes = inputLine.getBytes(StandardCharsets.UTF_8);
               // String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
               // assertEquals(inputLine, utf8EncodedString);
				//response.append(utf8EncodedString);
                response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("GET request did not work.");
		}

	}

	private static void sendPOST() throws IOException {
		POST_URL = "http://automatiomservices.somee.com/api/users";
        URL obj = new URL(POST_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
        //set JSON Format
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept", "application/json");
		// For POST only - START
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
        Random rand = new Random();
        int t = rand.nextInt(5) + 10;
        int h = rand.nextInt(10) + 50;
        POST_PARAMS = "{\"temp\": " + t + ", \"humid\": " + h + "}";
        POST_PARAMS = "{\"name\": \"new name \", \"age\": " + h + "}";
		os.write(POST_PARAMS.getBytes("utf-8"), 0, POST_PARAMS.length());
		os.flush();
		os.close();
		// For POST only - END

		int responseCode = con.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);

		if (responseCode == HttpURLConnection.HTTP_OK || responseCode == 201)  { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("POST request did not work.");
		}
	}


    public static void main(String[] args) throws Exception {        
        sendGET();
        System.out.println("GET DONE");
        sendPOST();
        
       /* Presenter presenter = new Presenter();
        presenter.setMesengers(new FixedPhone(), new MobilePhone(), new SmartPhone());
        presenter.setViewers(new TextView());
        presenter.run();*/ 
        
    }
}
