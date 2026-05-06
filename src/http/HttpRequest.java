/*
 * @Description: 
 */
/*
 * @Description: 请求报文对应的数据类型
 */
package src.http;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequest {
  private String method;
  private String url;
  private String httpVersion;
  private Map<String,String> headerLines = new HashMap<>();
  private String mainBody;
  

  HttpRequest(String method, String url, String httpVersion, Map<String,String> headerLines, String mainBody) {
    this.method = method;
    this.url = url;
    this.httpVersion = httpVersion;
    this.headerLines = headerLines;
    this.mainBody =mainBody;
  }

  // TODO:setter getter
  public void setMethod(String method){
    this.method=method;
  }
  public String getMethod(){
    return method;
  }

  public void setUrl(String url){
    this.url=url;
  }
  public String getUrl(){
    return url;
  }

  public void setHttpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
  }
  public String getHttpVersion() {
    return httpVersion;
  }

  public void setHeaderLines(HashMap<String, String> headerLines) {
    this.headerLines = headerLines;
  }
  public Map<String,String> getHeaderLines(){
    return headerLines;
  }

  public void setMainbody(String mainbody){
    this.mainBody=mainbody;
  }
  public String getMainbody(){
    return mainBody;
  }

}
