package com.example.accountbook;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName="userFilter",urlPatterns = {"/page/analyse.html","/page/statistics/list.html","/page/m_accountType/list.html","/page/statistics/add.html"})
public class UserFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest hreq = (HttpServletRequest) request;
        HttpServletResponse hres = (HttpServletResponse) response;
        hres.setCharacterEncoding("utf-8");
        hres.setContentType("text/html;setchar=utf-8");
        HttpSession session = ((HttpServletRequest) request).getSession();

        boolean isLog = false;
        if(session.getAttribute("is_login") != null) isLog = (Boolean) session.getAttribute("is_login");
        if(isLog){
            chain.doFilter(request, response);
        }else {
            hres.getWriter().println("<script charset=\"gb2312\" type=\"text/javascript\" language=\"JavaScript\">alert(\"请先登录！\") </script>");
            hres.setHeader("Refresh", "0;url=/page/m_login/login.html");
        }
    }
}
