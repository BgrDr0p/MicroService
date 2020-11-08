package com.mcommerce.zuulserver.filters;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LogFilters extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public String filterType() {
        return "pre"; // avant la demande du MS
        // return "post; après la demande du MS
    }

    @Override
    public int filterOrder() {
        // ordre d'éxecution des filtres
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        // signaler si le filtre a excuté ou non
        // possibilité de faire des vérification avant de lancer
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

        logger.info("*********** requete : "+ request.getRequestURI());
        return null;
    }
}
