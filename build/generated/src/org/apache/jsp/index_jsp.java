package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("  <title>SpaceMath</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("      \n");
      out.write(".sony{\n");
      out.write("\tbackground-color: rgb(5,5,5); \n");
      out.write("\theight: 285px;\n");
      out.write("\twidth: 200px;\n");
      out.write("\t\n");
      out.write("\tfloat: left; \n");
      out.write("\tmargin-left: 80px;\n");
      out.write("\tborder-radius: 10px; \n");
      out.write("\tmargin-top: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".apple{\n");
      out.write("\tbackground-color: rgb(5,5,5); \n");
      out.write("\theight: 285px;\n");
      out.write("\twidth: 200px; \n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-left: 110px; \n");
      out.write("\tborder-radius: 20px;\n");
      out.write("        margin-top: 20px; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".lg{\n");
      out.write("\tbackground-color: rgb(5,5,5); \n");
      out.write("\n");
      out.write("\theight: 285px;\n");
      out.write("\twidth: 200px; \n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-left: 110px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ofertas{\n");
      out.write("\tbackground-color: rgb(5,5,5); \n");
      out.write("\theight: 285px;\n");
      out.write("\twidth: 200px; \n");
      out.write("\tfloat: left;\n");
      out.write("\tmargin-left: 110px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\n");
      out.write("\t/*position: absolute;\n");
      out.write("\ttop: 280px;\n");
      out.write("\tleft: 1070px;*/ \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#caja5{ /*el pie de pagina */\n");
      out.write("\tfloat: left;\n");
      out.write("\tbackground-color: rgb(60,60,60); \n");
      out.write("\twidth: 1320px; \n");
      out.write("\theight: 150px; \n");
      out.write("\tborder:transparent; \n");
      out.write("\n");
      out.write("\n");
      out.write("\tfont-family: corbel; \n");
      out.write("\tcolor: white;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".galeria{ /*El amarillo */\n");
      out.write("\tbackground-color:rgb(200,200,200); \n");
      out.write("\theight: 120px;\n");
      out.write("\twidth: 850px; \n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\tmargin-left: 40px;\n");
      out.write("\tfloat: left;\n");
      out.write("\tborder-radius: 10px; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".contenedor{ /*El principal */\n");
      out.write("\twidth: 1320px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".contenido{ /* El gris */\n");
      out.write("\tbackground-color: rgb(153, 153, 153); \n");
      out.write("\theight: 330px; \n");
      out.write("\twidth: 1290px;\n");
      out.write("\tmargin-top: 20px; \n");
      out.write("\tmargin-left: 20px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contacto{\n");
      out.write("\tbackground-color:rgb(85, 178, 172); \n");
      out.write("\theight: 120px;\n");
      out.write("\twidth: 400px; \n");
      out.write("\tmargin-left: 20px;\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\tmargin-bottom: 40px;\n");
      out.write("\tclear: both;\n");
      out.write("\tfloat: left;\n");
      out.write("\tborder-radius: 10px;  \n");
      out.write("\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      </style>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\" style=\"background-color: black\" id=\"cuerpoUno\" >\n");
      out.write("<div class=\"container\">\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" >\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("                   <!-- <span class=\"navbar-brand\">MegaCómputo</span> -->\n");
      out.write("                    </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"  style=\"margin-left: 460px;\" ><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" >Jugar<span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"ingresar.jsp\">Iniciar sesión</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("               <!--<li><a href=\"ingresar.jsp\">Tablets</a></li> -->\n");
      out.write("               \n");
      out.write("                </ul>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- <li><a href=\"#\">Ofertas</a></li> -->\n");
      out.write("    <!--  <li><a href=\"preguntasfrecuentes.jsp\">Preguntas Frecuentes</a></li>-->\n");
      out.write("      <li><a href=\"mandarCorreo.jsp\">Contacto</a></li>\n");
      out.write("      <li><a href=\"ingresar.jsp\">Soy Administrador</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"insertUser.jsp\">Crear una cuenta</a></li>\n");
      out.write("      <!--<li><a href=\"nuevasllegadas.jsp\">Próximos Lanzamientos</a></li> -->\n");
      out.write("      <!-- <li><a href=\"contacto.jsp\">Contacto</a></li>-->\n");
      out.write("    </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                \n");
      out.write("                            <!--\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"carrito.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Carrito <span class=\"badge\">0</span></a>\n");
      out.write("                                </li>\n");
      out.write("                                \n");
      out.write("                            -->\n");
      out.write("                          \n");
      out.write("                        </ul>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <br><br><br>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <!-- <font style=\"font-family: corbel; font-size: 20px;color: white;\">  -->\n");
      out.write("       <!--%! int numeroAccesos = 0; %> <!--Variable local para conocer los accesos-->\n");
      out.write("       <!--%=\"Este día eres el visitante número: \" + (//numeroAccesos++) +\" \"%> \n");
      out.write("      <!-- </font><div>-->\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("<br>\n");
      out.write("<!--\n");
      out.write(" &nbsp &nbsp&nbsp &nbsp &nbsp &nbsp <audio controls=\"\"> \n");
      out.write("\t\t<source src=\"cancion.mp3\" type=\"audio/mpeg\"> Tu navegador no soporta audio\n");
      out.write("</audio> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\" contenedor\">\n");
      out.write("    \n");
      out.write("    <font id=\"fuenteNombre\"> </font>\n");
      out.write("    \n");
      out.write("    <center><img  style=\"border-radius: 10px; height: 570px; width:1300px;\" id=\"logotipo\" src=\"./images/spacemath.jpg\"></center> \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <center><img  style=\"border-radius: 10px; height: 90px; width:210px;\" id=\"logotipo\" src=\"./images/sociales.png\"></center>\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <!--\n");
      out.write("    <div class=\"contenido\">\n");
      out.write("\t\t<!--<img id =\"imgCelulares\" src=\"beiner.jpg\">\n");
      out.write("\n");
      out.write("\t\t<div class = \"sony\"> \n");
      out.write("\n");
      out.write("\t\t\t<center><font style=\"color: steelblue; font-family: verdana;\">¿Quienes somos?<br> <br>  </font>\n");
      out.write("                            <font id=\"fuenteSony\">\n");
      out.write("                            Somos YouThinking, empresa 100% mexicana que desde hace más de veinte años hemos\n");
      out.write("                            ofrecido los mejores examenes de certificaciones en línea sobre diversos temas. \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            </font></center>\n");
      out.write("\t\t\t<br><br>\n");
      out.write("\t\t\t<!--<a href=\"tablaSony.html\"><center><img src=\"carrito.png\"></center></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t  </div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"apple\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t<center><font style=\"color: steelblue; font-family: verdana;\">Nuestra misión:<br> <br>  </font>\n");
      out.write("                            <font id=\"fuenteSony\">Estamos comprometidos a ofrecerte los mejores examenes en línea,\n");
      out.write("                            brindándote una certificación que te ayuda a crecer en tu vida \n");
      out.write("                            laboral, todo esto, con absoluto respeto, confianza y privacidad de \n");
      out.write("                            tus resultados.\n");
      out.write("                         \n");
      out.write("                            \n");
      out.write("                        </font></center>\n");
      out.write("\t\t\t<br><br>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\t\t\t<!--<a href=\"tablaApple.html\"><center><img src=\"logoApple.jpg\"></center></a>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div> -->\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                <!--        \n");
      out.write("\t\t<div class=\" lg\">\n");
      out.write("                            <center><font style=\"color: steelblue; font-family: verdana;\">Nuestra visión:<br> <br>  </font>\n");
      out.write("                            <font id=\"fuenteLG\">Ser de las mejores empresas de examenes en línea para que puedas conseguir\n");
      out.write("                            una certificación de manera sencilla y a un precio no tan elevado. \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </font></center>\n");
      out.write("\t\t\t<br><br>\n");
      out.write("                        \n");
      out.write("\t\t\t<!--<a href=\"tablaLG.html\"><center><img src=\"logoLG.jpg\"></center></a>\n");
      out.write("\n");
      out.write("\t\t</div> -->\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                <!--        \n");
      out.write("\t\t<div class=\"ofertas\"> \n");
      out.write("\t\t\t<center><font style=\"color: steelblue; font-family: verdana;\">¡Elígenos!<br> <br>  </font>\n");
      out.write("                        <font id=\"fuenteEmpresa\">\n");
      out.write("                        Hemos sido clasificadas entre las mejores empresas en línea para la \n");
      out.write("                        aplicación de examenes. \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        </font> </center>\n");
      out.write("                        \n");
      out.write("\t\t\t<br> <br>\n");
      out.write("                        \n");
      out.write("\t\t\t<!--<a href=\"#\"><center><img id=\"dinero\" src=\"pesos.jpg\"></center></a>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       <!--                     \n");
      out.write("\t<div class=\"contacto\"> \n");
      out.write("\t\t<center><font style=\"color:white\"  id=\"fuenteContacto\">Av. Las Palmas no.890, fracc. Lomas Bellas<br>\n");
      out.write("\n");
      out.write("\t\tAguascalientes, México <br>\n");
      out.write("\t\t¡Llámanos! : 9104905 <br>\n");
      out.write("\t\tCorreo electrónico: youthinking@gmail.com\n");
      out.write("                </center>\n");
      out.write("\t\t<!--<center><a title=\"Facebook\" href=\"https://www.facebook.com/profile.php?id=100001440172953\" target=\"_blank\"><img id=\"imgFacebook\" src=\"fb.png\" alt=\"Los Tejos\"/></a></center>\n");
      out.write("\n");
      out.write("\t\t</font>\n");
      out.write("\t</div> -->\n");
      out.write("\n");
      out.write("                \n");
      out.write("            \n");
      out.write("       <!--  <div class=\"galeria\" style=\"margin-left: 220px;\">\n");
      out.write("           \n");
      out.write("\t</div>\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("         \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
