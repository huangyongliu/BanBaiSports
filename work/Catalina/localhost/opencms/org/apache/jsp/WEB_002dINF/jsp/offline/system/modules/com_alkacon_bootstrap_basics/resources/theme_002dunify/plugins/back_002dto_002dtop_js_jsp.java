/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2015-01-20 04:45:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.offline.system.modules.com_alkacon_bootstrap_basics.resources.theme_002dunify.plugins;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class back_002dto_002dtop_js_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/opencms.tld", Long.valueOf(1414568902000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005flink;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcms_005flink = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcms_005flink.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("//** jQuery Scroll to Top Control script- (c) Dynamic Drive DHTML code library: http://www.dynamicdrive.com.\n");
      out.write("//** Available/ usage terms at http://www.dynamicdrive.com (March 30th, 09')\n");
      out.write("//** v1.1 (April 7th, 09'):\n");
      out.write("//** 1) Adds ability to scroll to an absolute position (from top of page) or specific element on the page instead.\n");
      out.write("//** 2) Fixes scroll animation not working in Opera. \n");
      out.write("\n");
      out.write("\n");
      out.write("var scrolltotop={\n");
      out.write("\t//startline: Integer. Number of pixels from top of doc scrollbar is scrolled before showing control\n");
      out.write("\t//scrollto: Keyword (Integer, or \"Scroll_to_Element_ID\"). How far to scroll document up when control is clicked on (0=top).\n");
      out.write("\tsetting: {startline:100, scrollto: 0, scrollduration:1000, fadeduration:[500, 100]},\n");
      out.write("\tcontrolHTML: '<img src=\"");
      if (_jspx_meth_cms_005flink_005f0(_jspx_page_context))
        return;
      out.write("\" style=\"width:51px; height:42px\" />', //HTML for control, which is auto wrapped in DIV w/ ID=\"topcontrol\"\n");
      out.write("\tcontrolattrs: {offsetx:5, offsety:5}, //offset of control relative to right/ bottom of window corner\n");
      out.write("\tanchorkeyword: '#top', //Enter href value of HTML anchors on the page that should also act as \"Scroll Up\" links\n");
      out.write("\n");
      out.write("\tstate: {isvisible:false, shouldvisible:false},\n");
      out.write("\n");
      out.write("\tscrollup:function(){\n");
      out.write("\t\tif (!this.cssfixedsupport) //if control is positioned using JavaScript\n");
      out.write("\t\t\tthis.$control.css({opacity:0}) //hide control immediately after clicking it\n");
      out.write("\t\tvar dest=isNaN(this.setting.scrollto)? this.setting.scrollto : parseInt(this.setting.scrollto)\n");
      out.write("\t\tif (typeof dest==\"string\" && jQuery('#'+dest).length==1) //check element set by string exists\n");
      out.write("\t\t\tdest=jQuery('#'+dest).offset().top\n");
      out.write("\t\telse\n");
      out.write("\t\t\tdest=0\n");
      out.write("\t\tthis.$body.animate({scrollTop: dest}, this.setting.scrollduration);\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\tkeepfixed:function(){\n");
      out.write("\t\tvar $window=jQuery(window)\n");
      out.write("\t\tvar controlx=$window.scrollLeft() + $window.width() - this.$control.width() - this.controlattrs.offsetx\n");
      out.write("\t\tvar controly=$window.scrollTop() + $window.height() - this.$control.height() - this.controlattrs.offsety\n");
      out.write("\t\tthis.$control.css({left:controlx+'px', top:controly+'px'})\n");
      out.write("\t},\n");
      out.write("\n");
      out.write("\ttogglecontrol:function(){\n");
      out.write("\t\tvar scrolltop=jQuery(window).scrollTop()\n");
      out.write("\t\tif (!this.cssfixedsupport)\n");
      out.write("\t\t\tthis.keepfixed()\n");
      out.write("\t\tthis.state.shouldvisible=(scrolltop>=this.setting.startline)? true : false\n");
      out.write("\t\tif (this.state.shouldvisible && !this.state.isvisible){\n");
      out.write("\t\t\tthis.$control.stop().animate({opacity:1}, this.setting.fadeduration[0])\n");
      out.write("\t\t\tthis.state.isvisible=true\n");
      out.write("\t\t}\n");
      out.write("\t\telse if (this.state.shouldvisible==false && this.state.isvisible){\n");
      out.write("\t\t\tthis.$control.stop().animate({opacity:0}, this.setting.fadeduration[1])\n");
      out.write("\t\t\tthis.state.isvisible=false\n");
      out.write("\t\t}\n");
      out.write("\t},\n");
      out.write("\t\n");
      out.write("\tinit:function(){\n");
      out.write("\t\tjQuery(document).ready(function($){\n");
      out.write("\t\t\tvar mainobj=scrolltotop\n");
      out.write("\t\t\tvar iebrws=document.all\n");
      out.write("\t\t\tmainobj.cssfixedsupport=!iebrws || iebrws && document.compatMode==\"CSS1Compat\" && window.XMLHttpRequest //not IE or IE7+ browsers in standards mode\n");
      out.write("\t\t\tmainobj.$body=(window.opera)? (document.compatMode==\"CSS1Compat\"? $('html') : $('body')) : $('html,body')\n");
      out.write("\t\t\tmainobj.$control=$('<div id=\"topcontrol\">'+mainobj.controlHTML+'</div>')\n");
      out.write("\t\t\t\t.css({position:mainobj.cssfixedsupport? 'fixed' : 'absolute', bottom:mainobj.controlattrs.offsety, right:mainobj.controlattrs.offsetx, opacity:0, cursor:'pointer'})\n");
      out.write("\t\t\t\t.attr({title:'Scroll Back to Top'})\n");
      out.write("\t\t\t\t.click(function(){mainobj.scrollup(); return false})\n");
      out.write("\t\t\t\t.appendTo('body')\n");
      out.write("\t\t\tif (document.all && !window.XMLHttpRequest && mainobj.$control.text()!='') //loose check for IE6 and below, plus whether control contains any text\n");
      out.write("\t\t\t\tmainobj.$control.css({width:mainobj.$control.width()}) //IE6- seems to require an explicit width on a DIV containing text\n");
      out.write("\t\t\tmainobj.togglecontrol()\n");
      out.write("\t\t\t$('a[href=\"' + mainobj.anchorkeyword +'\"]').click(function(){\n");
      out.write("\t\t\t\tmainobj.scrollup()\n");
      out.write("\t\t\t\treturn false\n");
      out.write("\t\t\t})\n");
      out.write("\t\t\t$(window).bind('scroll resize', function(e){\n");
      out.write("\t\t\t\tmainobj.togglecontrol()\n");
      out.write("\t\t\t})\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("scrolltotop.init()");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_cms_005flink_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:link
    org.opencms.jsp.CmsJspTagLink _jspx_th_cms_005flink_005f0 = (org.opencms.jsp.CmsJspTagLink) _005fjspx_005ftagPool_005fcms_005flink.get(org.opencms.jsp.CmsJspTagLink.class);
    _jspx_th_cms_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005flink_005f0.setParent(null);
    int _jspx_eval_cms_005flink_005f0 = _jspx_th_cms_005flink_005f0.doStartTag();
    if (_jspx_eval_cms_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_cms_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_cms_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_cms_005flink_005f0.doInitBody();
      }
      do {
        out.write("/system/modules/com.alkacon.bootstrap.basics/resources/theme-unify/img/up.png");
        int evalDoAfterBody = _jspx_th_cms_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_cms_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_cms_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005flink.reuse(_jspx_th_cms_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcms_005flink.reuse(_jspx_th_cms_005flink_005f0);
    return false;
  }
}