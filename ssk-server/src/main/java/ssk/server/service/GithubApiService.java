package ssk.server.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


@Service
public class GithubApiService {

    @Value("${GITHUB_CLIENT_ID}")
    private String gClientId;

    @Value("${GITHUB_CLIENT_SECRET}")
    private String gClientSecret;

    @Value("${GITHUB_SSK_API}")
    private String githubUrl;

    private MultiValueMap<String, String> requestHeaders;

    private List<MediaType> responseHeaders;

    private HttpEntity<?> request;

    private RestTemplate restTemplate;

    private Gson gson ;

    public String url;


    private ResponseEntity<?> response ;



    public MultiValueMap<String, String> getHeaders() {
        return requestHeaders;
    }

    public HttpEntity<?> getRequest() {
        return request;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public MultiValueMap<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    public String getgClientSecret() {
        return this.gClientSecret;
    }

    public String getgClientId() {
        return this.gClientId;
    }

    public void setgClientId(String gClientId) {
        this.gClientId = gClientId;
    }

    public GithubApiService(){
        this.requestHeaders = new LinkedMultiValueMap<String, String>();
        this.responseHeaders = new ArrayList<>();
        this.responseHeaders.add(MediaType.APPLICATION_JSON);
        this.restTemplate = new RestTemplate();
    }


    public ResponseEntity<Object[]> getScenarioList(){
        HttpHeaders headers = new HttpHeaders();
        this.request = new HttpEntity<>(this.updateRequestHeaders("json", null));
        this.url = "contents/scenarios/";
        ResponseEntity<Object[]> responseEntity =  this.restTemplate.exchange(getGithubUrl() + this.url, HttpMethod.GET, this.getRequest(), Object[].class);
        Object[] objects = responseEntity.getBody();
        MediaType contentType = responseEntity.getHeaders().getContentType();
        HttpStatus statusCode = responseEntity.getStatusCode();
        JSONObject response = new JSONObject(objects);
       return  responseEntity;
    }

    public ResponseEntity<JSONArray> getSpecifications(){
        HttpHeaders headers = new HttpHeaders();
        this.request = new HttpEntity<>(this.updateRequestHeaders("json", null));
        this.url = "contents/spec/";
        ResponseEntity<JSONArray> responseEntity =  this.restTemplate.exchange(getGithubUrl() + this.url, HttpMethod.GET, this.getRequest(), JSONArray.class);
        return  responseEntity;
    }


    public ResponseEntity<String> getGithubFileContent (String  type, String fileName) {
         this.request = new HttpEntity<>(this.updateRequestHeaders("xml", null));
        this.url  = "contents/";
        switch (type){
            case "scenario":
                this.url += "scenarios/" + fileName;
                break;
                case "spec":
                this.url += "spec/" + fileName;
                break;
            case "step" :
                this.url += "steps/" + fileName;
                break;

            default:
        }
        String content =  this.restTemplate.exchange(getGithubUrl() + this.url, HttpMethod.GET, this.getRequest(), String.class).getBody();
         string2XMl(content);
        return this.restTemplate.exchange(this.url, HttpMethod.GET, this.getRequest(), String.class);
    }

    /* Get Commits on specific Github path */

    public JSONObject getCommitsOfPath(String path, String since ){
        this.url  = "commits/";
        JSONObject jSon = new JSONObject().put("path", path).put("since", since);
        this.request = new HttpEntity<>(this.updateRequestHeaders("json", jSon ));
        String content =  this.restTemplate.exchange(getGithubUrl() + this.url, HttpMethod.GET, this.request , String.class).getBody();
        JSONArray jsonArray = new JSONArray(content);

        // Here we take the most up to date commit
        jSon = getMostUpdated(jsonArray);

        /* request to Update DataList index on Elastic Search */
        if(converDate(getDate(jSon)).compareTo(converDate(since)) > 0){
           // ********************************************************************
        }
        return jSon;
    }


    private MultiValueMap<String, String>  updateRequestHeaders(String type, JSONObject jSon){
        switch (type){
            case "xml":
                this.getRequestHeaders().add("Accept", "application/vnd.github.VERSION.raw");
               this.getRequestHeaders().add("Content-Type", MediaType.APPLICATION_XML_VALUE);
                break;
            case "json":
                this.getRequestHeaders().add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
                break;
            default:
                //this.getRequestHeaders().set("Content-Type", "application/json;UTF-8");
             break;
        }
        this.getRequestHeaders().set("client_id", this.getgClientId());
        this.getRequestHeaders().set("client_secret", this.getgClientSecret());
        if(jSon !=null) {
            Iterator<?> keys = jSon.keys();
            while (keys.hasNext()) {
                String key = (String) keys.next();
                this.getRequestHeaders().set(key, (String) jSon.get(key));
            }
        }
        return this.getRequestHeaders();
    }

    /* Here I've to validate the XML scenario content before any operations on it*/
    private Document string2XMl(String content){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new ByteArrayInputStream(content.getBytes()));
            System.out.print("Root element: ");
            System.out.println(doc.getDocumentElement().getNodeName());
            System.out.println(nodeToString(doc.getDocumentElement()));
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }


    }


    /* Transform XML scenario document in Json content for Search engine */

    private JSONObject getScenarioFromXML(Document document){
        JSONObject scenario = new JSONObject();


        return scenario;
    }


    private String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }

        return sw.toString();
    }

    private JSONObject getMostUpdated(JSONArray jsonArray){
        JSONObject result = jsonArray.getJSONObject(0);
        if(jsonArray.length()> 1) {
            for (int i = 1; i < jsonArray.length(); i++) {
                JSONObject explrObject = jsonArray.getJSONObject(i);
                if(converDate(getDate(result)).compareTo(converDate(getDate(explrObject))) <= 0){
                    result = explrObject;
                }

            }
        }
        return result;
    }

    private Date converDate(String date ){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DDTHH:MM:SSZ");
        Date result = null;
        try {
            result =  sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    private String getDate(JSONObject json){
        String result = "";
        if ( json.get("commit") instanceof JSONObject ) {
            JSONObject commit = new JSONObject(json.get("commit").toString());
            if ( commit.get("committer") instanceof JSONObject ){
                JSONObject committer = new JSONObject(commit.get("committer").toString());
                result = (String) committer.get("date");
            }
        }
        return result;
    }


}
