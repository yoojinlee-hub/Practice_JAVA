<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <style>
        td{
            border: 0.1px solid #F0F0F0;
        }
        table{
            width: 700px;
        }
        .image{
            width:50%;
            background-image: url('image/cal.jpg'); 
            background-size: cover;
        }
    </style>
</head>
<body>
    <center>
    <table>
        <tr>
            <td  colspan="2" style="background-color: #32CCFE; font-size: 50px;text-align: center;height:80px; font-weight: bold;">
                <i>CalCuLator</i>
            </td>
        </tr>
        <tr style="height:500px;">
            <td class="image">
            </td>
            <td style="text-align:center;">
            
            
            <%
            int n1 = Integer.parseInt(request.getParameter("num1"));
            int n2 = Integer.parseInt(request.getParameter("num2"));
            String oper = request.getParameter("op");
            int result;
            if(oper.equals("+")){
            	result = n1+n2;
            }else if(oper.equals("-")){
            	result = n1-n2;
            }else if(oper.equals("*")){
            	result = n1*n2;
            }else{
            	result = n1/n2;
            }
            %>
            	
            	
				<input type="text"" style = "text-align:center;"value=<%=n1 %> readonly>
				<br><br>
			
				<% out.println(oper); %>
				<br><br>
				
				<input type="text" value=<%=n2 %> style = "text-align:center;" readonly>
				<br><br>

				<% out.println("="); %>
				<br><br>
				<input type="text" value=<%=result %> style = "text-align:center;" readonly>
            </td>
        </tr>
        
        <tr>
            <td  colspan="2" style="background-color: #32CCFE; height:80px;"></td>
        </tr>
    </table>
    </center>
</body>
</html>