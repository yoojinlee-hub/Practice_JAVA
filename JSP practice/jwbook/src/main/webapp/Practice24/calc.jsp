<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>계산기</title>
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
            	<form method="post" action="calc_result.jsp">
				<input type="text"value="0"name="num1" style = "text-align:center;">
				<br><br>
			
				<select name="op">
                    <option value="+" selected>+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
				<br><br>
				
				<input type="text" value="0"name="num2"style = "text-align:center;">
				<br><br>

				<input type="submit" value="=">
				<br><br>
				</form>
				<input type="text" disabled>
            </td>
        </tr>
        <tr>
            <td  colspan="2" style="background-color: #32CCFE; height:80px;"></td>
        </tr>
    </table>
    </center>
</body>
</html>