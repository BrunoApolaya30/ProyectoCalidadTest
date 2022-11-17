<%
    
    String monto = request.getParameter("abc");
    String importe = request.getParameter("importe");
    
    double importe2 = 0, monto2 = 0, vuelto = 0;
    
    monto2 = Double.parseDouble(monto);
    importe2 = Double.parseDouble(importe);
    

    vuelto = importe2 - monto2;
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>comprar</title>
    </head>
    <body>
        <form id="principal" name="principal" method="get" action="principal.jsp">
            <table>
                <tr>
                    <td colspan="2">Operación</td>
                </tr>
                <tr>
                    <td>Monto a pagar</td>
                    <td id="monto"><% out.print(monto2); %></td>
                </tr>
                <tr>
                    <td>Pago del cliente</td>
                    <td id="monto2"><% out.print(importe2); %></td>
                </tr>
                <tr>
                    <td>Vuelto</td>
                    <td id="vuelto"><% out.print(vuelto);%></td>
                </tr>
                <tr>
                    <td colspan="2"><input id="inicio" type="submit" value="inicio"></td>
                </tr> 
            </table>
        </form>     
    </body>
</html>

