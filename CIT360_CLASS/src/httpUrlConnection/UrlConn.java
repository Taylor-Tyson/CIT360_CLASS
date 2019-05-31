package httpUrlConnection;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UrlConn {
			
		@RequestMapping("/downloadWebPage")
		public String downloadWebPage (@RequestParam String site) {
			try {
				URL url = new URL("http://" + site);
				HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
				try {
				     InputStream in = new BufferedInputStream(urlConnection.getInputStream());
				     BufferedReader br = new BufferedReader(new InputStreamReader(in));
						String inputLine;
						StringBuffer response = new StringBuffer();

						while ((inputLine = br.readLine()) != null) {
							response.append(inputLine);
						}
						br.close();
				     return response.toString();
				   } finally {
				     urlConnection.disconnect();
				   }

			} catch (Exception e) {
				e.printStackTrace();
			}
			return "Error downloading page";
		}
		
		@RequestMapping("/webPageHeaders")
		public String getWebPageHeaders (@RequestParam String site) {
			try {
				URL url = new URL("http://" + site);
				HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
				try {
					Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
		            StringBuilder sb = new StringBuilder();
		            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
		                sb.append(entry.getKey() + ": " + entry.getValue() + ";");
		            }
		            return sb.toString();

				   } finally {
				     urlConnection.disconnect();
				   }

			} catch (Exception e) {
				e.printStackTrace();
			}
			return "Error downloading page";
		}
}
