<%-- 
    Document   : formulario
    Created on : 14 may. 2023, 13:40:44
    Author     : Irene Martín Barea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elige a tus gatitos</title>
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
            h2{
              color:#EBC031;
              text-shadow:1px 1px 2px black;  
              background-color:#9B782B;
              border-style: ridge;
              border-color:#A78948;
              border-width: 8px;
            }
            div.titulo {
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
            p.introduccion{
                font-size: 15px;
                font-family: arial;
            }
            div.principal{
                background-color:#EEE3C2;
                width: 65%;
                margin: auto;
                padding: 10px;
            }
            
        </style>
    </head>
    <body>
        <div class="titulo">
            <img src="imagen/Logo_Animal_Crossing.webp" height="180px">
            <h1>Elige a tus gatitos</h1><img src="imagen/leaf_1.png" height="35px" style="margin-top:10px; margin-left:5px">
        </div>
        
        <div class="principal">
            <p class="introduccion">En el siguiente programa, vamos a generar conversaciones aleatorias entre algunos
                de los vecinos gatitos de Animal Crossing, para ello, primero introduce a los dos personajes que
                participarán de los siguientes:
            </p>
            <hr>
            <%--Mostrar imágenes gatos a seleccionar--%>
            <div align="center"> 
            <img src="imagen/Fran.png" width="80px" style="padding:15px;"/>
            <img src="imagen/Feli.webp" width="75px" style="padding:15px;"/>
            <img src="imagen/gatoman.webp" width="85px" style="padding:15px;"/>
            </div>
            <hr>
            <%--Seleccionar e insertar datos--%>
            <form method="post" action="charlas_gatos.jsp">
                <h2>Introduce a los participantes:</h2>
                Primer gato <select name="tipoG1">
                    <option value="Fran">Gato con suéter</option>
                    <option value="Feli">Gata atigrada</option>
                    <option value="gatoman">Gato con casco rojo</option>
                </select>
                Segundo gato <select name="tipoG2">
                    <option value="Fran">Gato con suéter</option>
                    <option value="Feli" selected>Gata atigrada</option>
                    <option value="gatoman">Gato con casco rojo</option> 
                </select> 

                <h2>Introduce los nombres de los participantes:</h2>
                <h3>Gato 1</h3>
                <input type="text" name="nombreG1" required>
                <h3>Gato 2</h3>
                <input type="text" name="nombreG2" required><br><br>
                <input type="submit" value="Enviar"> 
            </form>
        </div>
    </body>
</html>
