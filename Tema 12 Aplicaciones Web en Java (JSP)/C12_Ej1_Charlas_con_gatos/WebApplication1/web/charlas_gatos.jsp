<%-- 
    Document   : charlas_gatos
    Created on : 11 may. 2023, 19:07:06
    Author     : Irene Martín Barea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="biblioteca.Gato"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gatos con clase</title>
        <%--La hoja de estilos individual no funciona correctamente por lo que el css está implementado
        en el mismo documento--%>
        <style>
            body{
               background-image: url("imagen/fondo.png");
               background-repeat:repeat;
               background-size: 170px 170px;
               top:0px;
            }
            h1{
                color:#EBC031;
                text-shadow:1px 1px 2px black;
            }
            div.bocadilloRojo {
                height: 255px;
                background-image: url('imagen/bocadillo1.png');
                background-repeat:no-repeat;
                background-size:contain;
                display:inline-block;
                width:35%;
            }
            div.bocadilloAzul {
                height: 255px;
                background-image: url('imagen/bocadillo3.png');
                background-repeat:no-repeat;
                background-size:contain;
                display:inline-block;
                width:35%;
            }
            div.bocadilloRosa {
                height: 255px;
                background-image: url('imagen/bocadillo2.png');
                background-repeat:no-repeat;
                background-size:contain;
                display:inline-block;
                width:35%;
            }
            p.nombre{
                margin-left: 80px;
                font-size: 23px;
                font-family: arial;
                color:white;
            }
            p.contenido{
                margin-left: 106px;
                font-size: 23px;
                font-family: arial;
                color:#54514a; 
            }
            p.contenido2{
                margin-left: 106px;
                font-size: 23px;
                font-family: arial;
                color:#54514a;
                margin-top: 0%;
            }
            p.contenido3{
                margin-left: 106px;
                font-size: 19px;
                font-family: arial;
                color:#54514a;
                margin-top: 0%;
            }
            p.contenidoPequeño{
                margin-left: 106px;
                font-size: 16px;
                font-family: arial;
                color:#54514a;
                margin-top: 0%;
            }
            .titulo {
                display: flex;
                background-color:#9B782B;
                border-style: ridge;
                border-color:#A78948;
                border-width: 8px;
                margin-top: 0px;
                margin-left: 0px;
                margin-right: 0px;
                background-size:auto;
                height: 65px;
                justify-content: left;
            }
        </style>
    </head>
<body>
    <div class="titulo">
        <img src="imagen/Logo_Animal_Crossing.webp" height="180px">
        <h1>Charlitas con gatitos</h1><img src="imagen/leaf_1.png" height="35px" style="margin-top:10px; margin-left:5px;">
    </div>
    
    <br><br><br><br><br>
    
    <% request.setCharacterEncoding("UTF-8"); 
    //Declaración de variables
    String gato1Tipo="";
    String gato2Tipo="";
    String parametroTipo1="";
    String parametroTipo2="";
    
    //Establecer el primer gato
    parametroTipo1=request.getParameter("tipoG1");
    if (parametroTipo1.equals("Fran")){
        gato1Tipo="imagen/"+parametroTipo1+".png"; //solo hay una imagen de gato en formato png
    } else {
        gato1Tipo="imagen/"+parametroTipo1+".webp";
    }
    //Establecer el segundo gato
    parametroTipo2=request.getParameter("tipoG2");
    if (parametroTipo2.equals("Fran")){
        gato2Tipo="imagen/"+parametroTipo2+".png";
    } else {
        gato2Tipo="imagen/"+parametroTipo2+".webp";
    }
    
    //Establecer el nombre del primer gato
    String gato1Nombre=request.getParameter("nombreG1");
    //Establecer el nombre del segundo gato
    String gato2Nombre=request.getParameter("nombreG2");
    
    //Establecer los objetos
    ArrayList<Gato> gatitos = new ArrayList<Gato>();
    Gato g1 = new Gato(gato1Nombre, gato1Tipo);
    gatitos.add(g1);
    Gato g2 = new Gato(gato2Nombre, gato2Tipo);
    gatitos.add(g2);
    
    //Establecer los bocadillos
    for(Gato gato : gatitos){
        if(gato.getImagen().equals("imagen/Fran.png")){
            gato.setBocadillo("bocadilloAzul");
        } else if(gato.getImagen().equals("imagen/Feli.png")){
            gato.setBocadillo("bocadilloRosa");
        } else {
            gato.setBocadillo("bocadilloRojo");
        }    
    }   
%>
    <%--Los gatos se presentan--%>
    <div style="display:flex;"><%out.println(g1);%></div>
    <div style="display:flex;"><%out.println(g2);%></div>
    
    <%--Los gatos mantienen una conversación con frases al azar--%>
    <%--Habla el primer gato--%>
    <div style="display:flex;">
        <img src="<%out.println(g1.getImagen());%>" width="130">
        <div class="<%out.println(g1.getBocadillo());%>"><br><br>
            <p class="nombre"><%out.println(g1.getNombre());%></p>
            <div style="width:80%; height: 38%; margin-top: 0%;">
            <p class='contenido2'><%out.println("Oye "+g2.getNombre()+", que te cuentas?");%></p>
            </div>
        </div><br>
    </div>
    <%--Habla el segundo gato--%>
    <div style="display:flex;">
        <img src="<%out.println(g2.getImagen());%>" width="130">
        <div class="<%out.println(g2.getBocadillo());%>"><br><br>
            <p class="nombre"><%out.println(g2.getNombre());%></p>
            <div style="width:80%; height: 38%; margin-top: 0%;">
                <%
                int opciónAzar1=(int)(Math.random()*4+1);
                switch(opciónAzar1){
                    case 1:
                        out.println("<p class='contenidoPequeño'>El otro día tuve un sueño rarísimo, en el que nuestro pueblo era un juego y nosotros el entretenimiento de una persona. será cierto? que miedo. </p>");
                        break;
                    case 2:
                        out.println("<p class='contenidoPequeño'>Estoy pensando que debería comer esta noche. Quiero innovar, asi que, atún marinado o lubina a la donostiarra?</p>");
                        break;
                    case 3:
                        out.println("<p class='contenidoPequeño'>Dentro de poco es el concurso de pesca intensiva del pueblo. He pensado que podría participar, igual tengo oportunidades de ganar.</p>");
                        break;
                    case 4:
                        out.println("<p class='contenidoPequeño'>No te da la sensación de que nuestro alcalde es un vago? puede tirarse años sin visitar el pueblo. Debería presentarme a las elecciones.</p>");
                        break;
                }%>
            </div>
        </div><br>
    </div>
    <%--Habla el primer gato--%>
    <div style="display:flex;">
        <img src="<%out.println(g1.getImagen());%>" width="130">
        <div class="<%out.println(g1.getBocadillo());%>"><br><br>
            <p class="nombre"><%out.println(g1.getNombre());%></p>
            <div style="width:80%; height: 38%; margin-top: 0%;">
                <%
                int opciónAzar2=(int)(Math.random()*3+1);
                switch(opciónAzar2){
                    case 1:
                        out.println("<p class='contenido3'>Vaya, sorprendente que tu persona sea capaz de pensar semejantes ideas.</p>");
                        break;
                    case 2:
                        out.println("<p class='contenidoPequeño'>Bueno, siempre piensa en lo que te dicta el corazón y ahí tendrás la respuesta.</p>");
                        break;
                    case 3:
                        out.println("<p class='contenidoPequeño'>Yo he tenido pensamientos parecidos, es sorprendente la conexión que hemos tenido. Deberíamos ser compis.</p>");
                        break;
                }%>
            </div>
        </div><br>
    </div>
    <%--Habla el segundo gato--%>
    <div style="display:flex;">
        <img src="<%out.println(g2.getImagen());%>" width="130">
        <div class="<%out.println(g2.getBocadillo());%>"><br><br>
            <p class="nombre"><%out.println(g2.getNombre());%></p>
            <div style="width:80%; height: 38%; margin-top: 0%;">
                <%
                int opciónAzar3=(int)(Math.random()*3+1);
                switch(opciónAzar3){
                    case 1:
                        out.println("<p class='contenidoPequeño'>¿Sabes? ahora que lo pienso, prefiero no darle vueltas al tema, ya te veré otro día...(o no, creo que te has venido arriba)</p>");
                        break;
                    case 2:
                        out.println("<p class='contenidoPequeño'>Oh me alegro de que pienses eso, me caes bien amable gato, debería invitarte a cenar un día.</p>");
                        break;
                    case 3:
                        out.println("<p class='contenido2'>No sabría decir si tu respuesta me ayuda o no.</p>");
                        break;
                }%>
            </div>
        </div><br>
    </div>
</html>

