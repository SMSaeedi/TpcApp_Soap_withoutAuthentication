package com.example.demo.config;

import com.example.demo.tpcApp.webService.ChangePayment;
import com.example.demo.tpcApp.webService.NewCustomer;
import com.example.demo.tpcApp.webService.NewProduct;
import com.example.demo.tpcApp.webService.ProductDetail;
import com.example.demo.tpcApp.webService.impl.ChangePaymentImpl;
import com.example.demo.tpcApp.webService.impl.NewCustomerImpl;
import com.example.demo.tpcApp.webService.impl.NewProductImpl;
import com.example.demo.tpcApp.webService.impl.ProductDetailImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Configuration
public class TpcAppConfig implements BeanFactoryPostProcessor {

    @Value("${cxf.path}")
    protected String ws;

    @GetMapping("/")
    public RedirectView hello(HttpServletRequest request) {
        return new RedirectView(request.getContextPath() + ws);
    }

    @Autowired
    private Bus bus;

    @Bean
    public ChangePayment changePayment() { return new ChangePaymentImpl();
    }

    @Bean
    public NewCustomer newCustomer() {
        return new NewCustomerImpl();
    }

    @Bean
    public NewProduct newProduct() {
        return new NewProductImpl();
    }

    @Bean
    public ProductDetail productDetail() {
        return new ProductDetailImpl();
    }

   /* @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, newCustomerService());
        endpoint.publish("/TpcApp");
        return endpoint;
    }*/

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        Arrays.stream(new String[]{"changePayment", "newCustomer", "productDetail", "newProduct"}).forEach(str -> {
            bus = factory.getBean(Bus.class);
            JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
            bean.setAddress("/" + str + "/TpcApp");
            bean.setBus(bus);
            bean.setServiceClass(TpcAppConfig.class);
            factory.registerSingleton(str, bean.create());
        });
    }
}