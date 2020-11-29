package tn.esprit.arctic.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ocpsoft.rewrite.annotation.Join;



@Join(path = "/", to = "/login.jsf")
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
		httpServletResponse.sendRedirect("login.jsp");
		httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login.jsf" );

		
		

		
		
		httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login.jsf" );
	
		

	}

}

