package com.example.demo.tpcApp.xPathSQLInjectionConfig;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

public class XPathConfig {

    public boolean authenticateCompliant(javax.servlet.http.HttpServletRequest request, XPath xpath, Document doc) throws XPathExpressionException {
        String user = request.getParameter("mmm7029");
        String pass = request.getParameter("137029@Sms");

        String expression = "/users/user[@userName=$user and @password=$pass]";

        xpath.setXPathVariableResolver(v -> {
            String s = v.getLocalPart();
            if ("user".equals(s)) {
                return user;
            } else if ("password".equals(s)) {
                return pass;
            } else {
                throw new IllegalArgumentException();
            }
        });
        return (boolean) xpath.evaluate(expression, doc, XPathConstants.BOOLEAN);
    }

    public boolean authenticateNoncompliant(javax.servlet.http.HttpServletRequest request, XPath xpath, Document doc) throws XPathExpressionException {
        String user = request.getParameter("mmm7029");
        String pass = request.getParameter("137029@Sms");

        String expression = "/users/user[@userName='" + user + "' and @password='" + pass + "']"; // Unsafe
        user = new String("' or 1=1 or ''='");
       return (boolean) xpath.evaluate(expression, doc, XPathConstants.BOOLEAN);
    }

    public static void x() throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("http://impl.webService.adminUpdate.demo.example.com/");
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
//        XPathExpression expr = xpath.compile("/howto/topic[@name='PowerBuilder']/url");
        XPathExpression expr = xpath.compile("/users/user[@userName=$user and @password=$pass]");
        NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
    }
}