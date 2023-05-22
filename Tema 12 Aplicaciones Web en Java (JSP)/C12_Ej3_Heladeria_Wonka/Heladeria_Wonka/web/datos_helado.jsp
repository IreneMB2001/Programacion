<%-- 
    Document   : datos_helado.jsp
    Created on : 21 may. 2023, 20:29:35
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
            h1{
                color:#FFFFFF;
                font-family: cambria;
                font-style: italic;
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
            div.principal{
                background-color: #FFFFFF;
                width:60%;
                margin:auto;
                padding:10px;
                
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
            .contenido {
                display: flex;
                width: 100%;
                justify-content: center;
            }
            elemento{
                text-align: center;
                padding: 16px;
            }
        </style>
    </head>
    <body>
    <div class="titulo">
        <img src="imgs/Wonka-Logo.png" height="140px">
        <h1>Heladería</h1>
    </div>
    <div class="principal" align="center">
        <h3>Bienvenidos queridos amigos a la gran heladería Wonka, inigualable en cuanto a sabor y estilo.</h3>
        <p>Hoy tendrá la oportunidad de degustar nuestros excelentísimos helados, disponibles en sabor chocolate, fresa y vainilla</p>
        <p>Para crear tu perfecto helado elige las cantidades que prefieras de cada sabor, y recuerda no pasarte del 100% o sino el helado rebosará</p>
        <hr>
        <form action="helado_preparado.jsp">
            <div class="contenido">
                <div class="elemento">
                    <img src="imgs/chocolate.png" width="200px"><br>
                    <b>Chocolate:</b> <input type="number" value=0 min="0" max="100" name="chocolate"> %
                </div>
                <div class="elemento">
                    <img src="imgs/fresa.png" width="200px"><br>
                    <b>Fresa:</b> <input type="number" value=0 min="0" max="100" name="fresa"> %
                </div>
                <div class="elemento">
                    <img src="imgs/vainilla.png" width="200px"><br>
                    <b>Vainilla:</b> <input type="number" value=0 min="0" max="100" name="vainilla"> %
                </div>
            </div>
            <br><br>
            <div class="contenido">
                <div>
                    <input type="submit" value="Preparar helado">
                </div>
            </div>
        </form>
        <br><br>
        <div class="tarrina"></div>

    </div>
    </body>
</html>
