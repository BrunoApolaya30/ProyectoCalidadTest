<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>D’TODO</title>
    </head>
    <body>
        <form id="calcular" name="calcular" method="get" action="calcular.jsp">
            <table>
                <tr>
                    <td colspan=2"">BODEGA D’TODO</td>
                </tr><br>
                
                <input name="chec" type="checkbox" id="chec" onChange="activarleche(this);"/>
                <label for="chec">LECHE          :</label>
                <input name="cantleche" value="0" id="cantleche" readonly /><br>
                
                <input name="chec2" type="checkbox" id="chec2" onChange="activarcafe(this);"/>
                <label for="chec2">CAFÉ          :</label>
                <input name="cantcafe" value="0" id="cantcafe" readonly /><br>
                
                <input name="chec3" type="checkbox" id="chec3" onChange="activarmanzanilla(this);"/>
                <label for="chec3">MANZANILLA    :</label>
                <input name="cantmanzanilla" value="0" id="cantmanzanilla" readonly /><br>
                
                <input name="chec4" type="checkbox" id="chec4" onChange="activarazucar(this);"/>
                <label for="chec4">AZÚCAR        :</label>
                <input name="cantazucar" value="0" id="cantazucar" readonly /><br>
                
                <input name="chec5" type="checkbox" id="chec5" onChange="activarmantequilla(this);"/>
                <label for="chec5">MANTEQUILLA   :</label>
                <input name="cantmantequilla" value="0" id="cantmantequilla" readonly /><br>
                
                <tr>
                    <td colspan="2"><input id="iniciar" type="submit" value="calcular"></td>
                </tr>
            </table>
        </form>
        <script type="text/javascript">
            function activarleche(){   
                if (document.getElementById("chec").checked){
                    document.getElementById('cantleche').readOnly = false;
                }else{
                    document.getElementById('cantleche').readOnly = true;
                }
            }
            function activarcafe(){   
                if (document.getElementById("chec2").checked){
                    document.getElementById('cantcafe').readOnly = false;
                }else{
                    document.getElementById('cantcafe').readOnly = true;
                }
            }
            function activarmanzanilla(){   
                if (document.getElementById("chec3").checked){
                    document.getElementById('cantmanzanilla').readOnly = false;
                }else{
                    document.getElementById('cantmanzanilla').readOnly = true;
                }
            }
            function activarazucar(){   
                if (document.getElementById("chec4").checked){
                    document.getElementById('cantazucar').readOnly = false;
                }else{
                    document.getElementById('cantazucar').readOnly = true;
                }
            }
            function activarmantequilla(){   
                if (document.getElementById("chec5").checked){
                    document.getElementById('cantmantequilla').readOnly = false;
                }else{
                    document.getElementById('cantmantequilla').readOnly = true;
                }
            }
        </script>
    </body>
</html>
