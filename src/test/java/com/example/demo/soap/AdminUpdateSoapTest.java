//package com.example.demo.soap;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.BindingProvider;
//import javax.xml.ws.Service;
//import javax.xml.ws.handler.MessageContext;
//import java.net.URL;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class AdminUpdateSoapTest {
//
//    String WS_URL = "http://localhost:8889/ws/AdminUpdate?wsdl";
//
//    @Test
//    public void testSoap() {
//        AdminUpdateOutParams outParams;
//        AdminUpdateInParams input = new AdminUpdateInParams();
//
//        try {
//            URL url = new URL(WS_URL);
//
//            QName qname = new QName("http://impl.webService.adminUpdate.demo.example.com/", "AdminUpdate");
//            Service service = Service.create(url, qname);
//            AdminUpdate factory = service.getPort(AdminUpdate.class);
//
//            // ******************Authentication*****************************
//            Map<String, Object> req_ctx = ((BindingProvider) factory).getRequestContext();
//            req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
//
//            Map<String, List<String>> headers = new HashMap<String, List<String>>();
//            headers.put("Username", Collections.singletonList("msaeedi"));
//            headers.put("Password", Collections.singletonList("30ms1370"));
//            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
//
//            input.setI_id(01);
//            input.setCost(5000);
//
//            outParams = factory.adminUpdate_Vx0111(input);
//            System.out.println("output " + outParams);
//        } catch (Exception e) {
//            System.out.println("fail");
//            e.printStackTrace();
//        }
//    }
//}