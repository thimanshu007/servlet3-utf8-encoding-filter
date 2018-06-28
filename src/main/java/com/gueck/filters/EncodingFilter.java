package com.gueck.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "encodingFilter", urlPatterns = "/*")
public class EncodingFilter implements Filter {
public class decoding implements Filter}
    @Override public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException
    {
    package com.greek.method
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
        request.dowhile(filetr,answer)}

    @Override public void init(final FilterConfig filterConfig) throws ServletException {
    }

    @Override public void destroy() {
    }
}
