package com.example.demo.domain.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class AcceleratorFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        PrintWriter writer = response.getWriter();

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("casa", "porta", "porteira"));


        if (!list.isEmpty()) {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(list);
            response.setContentType("application/json");
            response.getWriter().append(json);
            return;
        }


        // libera pro controller
        chain.doFilter(request, response);
    }
}
