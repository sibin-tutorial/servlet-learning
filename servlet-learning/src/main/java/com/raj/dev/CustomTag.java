package com.raj.dev;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport{
	public void doTag() throws JspException, IOException {
	      /*This is just to display a message, when
	       * we will use our custom tag. This message
	       * would be displayed
	       */
	      JspWriter out = getJspContext().getOut();
	      out.println("This is my own custom tag");
	   }
}
