<%
    String cantleche = request.getParameter("cantleche");
    String cantcafe = request.getParameter("cantcafe");
    String cantmanzanilla = request.getParameter("cantmanzanilla");
    String cantazucar = request.getParameter("cantazucar");
    String cantmantequilla = request.getParameter("cantmantequilla");

    int Cleche, Ccafe, Cmantequilla, Cazucar, Cmanzanilla, descuento;
    double Pleche, Pcafe, Pmantequilla, Pazucar, Pmanzanilla, resultado;
    resultado = 0;

    Cleche = Integer.parseInt(cantleche);
    Pleche = Cleche * 3.00;

    Ccafe = Integer.parseInt(cantcafe);
    Pcafe = Ccafe * 4.50;

    Cmanzanilla = Integer.parseInt(cantmanzanilla);
    Pmanzanilla = Cmanzanilla * 0.80;

    Cazucar = Integer.parseInt(cantazucar);
    Pazucar = Cazucar * 3.20;

    Cmantequilla = Integer.parseInt(cantmantequilla);
    Pmantequilla = Cmantequilla * 2.80;

    resultado = Pleche + Pcafe + Pmantequilla + Pazucar + Pmanzanilla;
    double monto = 0;
    descuento = 0;

    if (resultado >= 20 && resultado < 30) {
        descuento = 5;
        monto = resultado - descuento;
        out.print("<td>Aplica descuento</td><br>");
    } else if (resultado >= 30 && resultado < 40) {
        descuento = 7;
        monto = resultado - descuento;
        out.print("<td>Aplica descuento</td><br>");
    } else if (resultado >= 40) {
        descuento = 8;
        monto = resultado - descuento;
        out.print("<td>Aplica descuento</td><br>");
    } else {
        monto = resultado;
        out.print("<td>NO Aplica descuento</td><br>");
    }

    if (Cmanzanilla >= 1) {
        if (Cleche >= 3) {
            out.print("<td>Una mazanilla de regalo</td><br>");
        }
        else{
            out.print("<td>No cumple los requisitos para una mazanilla de regalo</td><br>"); 
        }
    }else{
        out.print("<td>No cumple los requisitos para una mazanilla de regalo</td><br>");
    }
%>
<html>
    <head>
        <title>calcular</title>
    </head>
    <body>
        <form id="comprar" name="comprar" method="get" action="comprar.jsp">
            <table>
                <tr>
                    <td>Importe a Pagar</td>
                    <td id="resultado"><% out.print(resultado); %></td>   
                </tr><br>
                <tr>
                    <td>Descuento</td>
                    <td id="descuento"><% out.print(descuento); %></td>   
                </tr><br>
                <tr>
                    <td>Total a Pagar</td>
                    <td><input id="abc" type="text" name="abc" value="<% out.print(monto); %>" readonly>
                </tr><br>
                <tr>
                    <td id="abcd" style="color: #fff"><% out.print(monto); %></td>   
                </tr><br>
                <tr>
                    <td>Pago del cliente</td>
                    <td><input id="importe" type="text" name="importe">
                </tr><br>
                <tr>
                    <td colspan="2"><input id="pagar" type="submit" value="pagar"></td>
                </tr> 
            </table>
        </form>
    </body>
</html>
