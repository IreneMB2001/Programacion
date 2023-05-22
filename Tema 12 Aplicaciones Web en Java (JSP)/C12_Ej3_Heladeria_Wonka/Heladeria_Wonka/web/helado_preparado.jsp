<%-- 
    Document   : helado_preparado
    Created on : 21 may. 2023, 21:58:07
    Author     : Irene Martín Barea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Heladería</title>
        <style>
            body{
                background-image: url("imgs/fondo_heladería.jpg");
                background-repeat:repeat;
                background-size: 450px 450px;
                top:0px;
            }
            div.principal{
                background-color: #FFFFFF;
                width:60%;
                margin:auto;
                padding:10px;
            }
            div.titulo {
                display: flex;
                background-color:#612D91;
                border-style: ridge;
                border-color:#FFFFFF;
                border-width: 8px;
                margin-top: 0px;
                margin-left: 0px;
                margin-right: 0px;
                background-size:auto;
                height: 65px;
                justify-content: left;
            }
            .mensaje{
                font-family: cambria;
                color:#531c89;
            }
            h1{
                color:#FFFFFF;
                font-family: cambria;
                font-style: italic;
            }
            div.tarrina{
                width:190px;
                height:150px;
                border-style: solid;
                background-image: url('imgs/Wonka-Logo.png');
                background-repeat:no-repeat;
                background-size:contain;
                border-color: gainsboro;
                border-bottom-left-radius: 40px;
                border-bottom-right-radius: 40px;
                overflow: hidden;
                
            }
            div.sabor{
                width:100%;
                opacity: 0.8;
            }
            div#fresa{
                background-color:pink;
            }
            div#chocolate{
                background-color:burlywood;
            }
            div#vainilla{
                background-color:lemonchiffon;
            }
        </style>
    </head>
<body>
    <div class="titulo">
        <img src="imgs/Wonka-Logo.png" height="140px">
        <h1>Heladería</h1>
    </div>
<%
    //declaración de variables
    int cantidadVainilla = Integer.parseInt(request.getParameter("vainilla"));
    int cantidadChocolate = Integer.parseInt(request.getParameter("chocolate"));
    int cantidadFresa = Integer.parseInt(request.getParameter("fresa"));
    int relleno = 100-(cantidadChocolate+cantidadFresa+cantidadVainilla);
    
    //if en caso de que se supere el 100%
    if (cantidadChocolate+cantidadFresa+cantidadVainilla > 100) {%>
        <div class="principal" align="center">
            <h1 style="color: #e25162">Ha ocurrido un error</h1>
            <h2>Se advirtió que el helado rebosaría si llegaba a más del 100% de su capacidad</h2> 
            <img src="imgs/dead_iceCream.png" width="200px"><br>
            <input type="button" value="Volver a preparar el helado" onclick="history.back()"> <%--Con history.back se vuelve a la página anterior--%>
        </div> 
        <br><br>
    <%
    } else {
    %>
        <div class="principal" align="center">
            <h1 class="mensaje">Aquí tiene su tarrina de helado, disfrútela</h1>
            <div class="tarrina">
                <div class="sabor" style="height:<%= relleno %>%;"></div>      
                <div class="sabor" id="chocolate" style="height:<%= cantidadChocolate %>%;" ></div>
                <div class="sabor" id="fresa" style="height:<%= cantidadFresa %>%;"></div>
                <div class="sabor" id="vainilla" style="height:<%= cantidadVainilla %>%;"></div>
            </div>
            <br>
            <img src="imgs/Willy.png" width="200px">
            <br>
            <h3 class="mensaje">¿Quiere volver a preparar otro helado?</h3>
            <input type="button" value="Volver a preparar un helado" onclick="history.back()">
            <br>
        </div>
    <%
    }
    %>
</body>
</html>
