
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<head>
  <title>SpaceMath</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <script>
        function code(e) {
            e = e || window.event;
            return(e.keyCode);
        }
        window.onload = function(){
            document.onkeypress = function(e){
                var key = code(e);
                // do something with key
                //alert(key);
                if (key === 106) { // Si es una J (jugar)
                    window.location.href = "checklogin.jsp";
                }
            };
        };
    </script>
 
<style>
      
.sony{
	background-color: rgb(5,5,5); 
	height: 285px;
	width: 200px;
	float: left; 
	margin-left: 80px;
	border-radius: 10px; 
	margin-top: 20px;
}

.apple{
	background-color: rgb(5,5,5); 
	height: 285px;
	width: 200px; 
	float: left;
	margin-left: 110px; 
	border-radius: 20px;
        margin-top: 20px; 
}

.lg{
	background-color: rgb(5,5,5); 
	height: 285px;
	width: 200px; 
	float: left;
	margin-left: 110px;
	border-radius: 10px;
	margin-top: 20px;
	
}

.ofertas{
	background-color: rgb(5,5,5); 
	height: 285px;
	width: 200px; 
	float: left;
	margin-left: 110px;
	border-radius: 10px;
	margin-top: 20px;

	/*position: absolute;
	top: 280px;
	left: 1070px;*/ 
}

#caja5{ /*el pie de pagina */
	float: left;
	background-color: rgb(60,60,60); 
	width: 1320px; 
	height: 150px; 
	border:transparent; 
	font-family: corbel; 
	color: white;
}


.galeria{ /*El amarillo */
	background-color:rgb(200,200,200); 
	height: 120px;
	width: 850px; 
	margin-top: 20px;
	margin-left: 40px;
	float: left;
	border-radius: 10px; 

}


.contenedor{ /*El principal */
	width: 1320px;
}


.contenido{ /* El gris */
	background-color: rgb(153, 153, 153); 
	height: 330px; 
	width: 1290px;
	margin-top: 20px; 
	margin-left: 20px;
	border-radius: 10px;

}

.contacto{
	background-color:rgb(85, 178, 172); 
	height: 120px;
	width: 400px; 
	margin-left: 20px;
	margin-top: 20px;
	margin-bottom: 40px;
	clear: both;
	float: left;
	border-radius: 10px;  
    }
</style>
      
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50" style="background-color: black" id="cuerpoUno" >
        <div class="container">
                <nav class="navbar navbar-inverse navbar-fixed-top" >
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <!-- <span class="navbar-brand">MegaCómputo</span> -->
                        </div>
                        <div class="collapse navbar-collapse" id="myNavbar">
                            <ul class="nav navbar-nav">
                                <li class="active"  style="margin-left: 460px;" >
                                    <a href="index.jsp"> <img src="images/iconos/home.png" width="40"> Inicio</a>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">  <img src="images/iconos/play.png" width="40"> Jugar<span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a href="ingresar.jsp">  <img src="images/iconos/login.png" width="40"> Iniciar sesión</a></li>
                                        </ul>
                                </li>   
                                <li><a href="insertUser.jsp">  <img src="images/iconos/register.png" width="40"> Crear cuenta </a></li>
                                <li><a href="ayuda.jsp">  <img src="images/iconos/help.png" width="40"> Ayuda</a></li>
                                <li><a href="acercade.jsp">  <img src="images/iconos/about.png" width="40"> Acerca de</a></li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">  <img src="images/iconos/others.png" width="40"> Otros<span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a href="ingresar.jsp">  <img src="images/iconos/admin.png" width="40"> Soy Administrador</a></li>
                                            <li class="divider"></li>
                                            <li><a href="mandarCorreo.jsp">  <img src="images/iconos/contact.png" width="40"> Contacto</a></li>     
                                        </ul>
                                </li> 
                            </ul>
                        </div>
                    </div>
                </nav>
    
        </div>

    <br><br><br>

       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       
<br>

<footer>
    <div class=" contenedor">
        <center><img  style="border-radius: 10px; height: 570px; width:1300px;" id="logotipo" src="./images/spacemath.jpg"></center> 
        <center>            
            <img  style="border-radius: 10px; height: 90px; width:210px;" id="logotipo" src="./images/sociales.png">     
            <br>
            <font id="fuenteNombre"> Copyright © Autores: Juan Manuel Lopez, Citlaly Almanza, Gabriela Guerrero </font>
        </center>
    </div>
</footer>
</body>
</html>
