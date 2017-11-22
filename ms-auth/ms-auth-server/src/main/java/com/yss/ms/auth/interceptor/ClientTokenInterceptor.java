package com.yss.ms.auth.interceptor;

import com.yss.ms.auth.configuration.ClientConfig;
import com.yss.ms.auth.service.ClientService;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ace on 2017/9/12.
 */
public class ClientTokenInterceptor implements RequestInterceptor {
    private Logger logger = LoggerFactory.getLogger(ClientTokenInterceptor.class);
    @Autowired
    private ClientConfig clientConfig;
    @Autowired
    private ClientService clientService;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        try {
            requestTemplate.header(clientConfig.getClientTokenHeader(), clientService.apply(clientConfig.getClientId(), clientConfig.getClientSecret()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
