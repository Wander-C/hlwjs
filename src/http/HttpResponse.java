/*
 * @Description: 根据具体需求，构造相应的request或者response
 */
package src.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpResponse {
  private String httpVersion;
  private String statusCode;
  private String explanation;
  private Map<String, String> headerLines = new HashMap<>();

  HttpResponse(String httpVersion, String statusCode, String explanation, Map<String, String> headerLines) {
    this.httpVersion = httpVersion;
    this.statusCode = statusCode;
    this.explanation = explanation;
    this.headerLines = headerLines;
  }

    // TODO:setter getter
    public void setHttpVersion(String httpVersion){
      this.httpVersion=httpVersion;
    }
    public String getHttpVersion(){
      return httpVersion;
    }

    public void setStatusCode(String statusCode){
      this.statusCode=statusCode;
    }
    public String getStatusCode(){
      return statusCode;
    }

    public void setExplanation(String explanation){
      this.explanation=explanation;
    }
    public String getExplanation(){
      return explanation;
    }

    public void setHeaderLines(Map<String, String>headerLines){
      this.headerLines=headerLines;
    }
    public Map<String, String> getHeaderLines (){
      return headerLines;
    }
}
