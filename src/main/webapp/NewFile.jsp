<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calculator</title>
<style>
	img{
		height: 20%;
		width: 20%;
	}
	body {
  font-size: 40px;
  text-align:center;
  background: linear-gradient(to right,  #2b40ff,#07121a);
}

h1,h3{
color: white;
margin:15px;
}
input, button {
  font-size:40px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}

img{
width: 20%;
height:20%;
margin-top: 20px;
}
img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
   transform: scale(1.1); 
}
	
	</style>
</head>
<body>
	<h1>Wellcome</h1>
	<h3>hii =<%=request.getParameter("s")%>🚩</h3>
<img src="images/hii/mp4">	
<form>
	<input name="num1" placeholder="Enter Number"></input>
	<input name="num2" placeholder="Enter Number"></input>
	<button name="bt1" value="1" > + </button>
	<button name="bt1" value="2" > - </button>
	<button name="bt1" value="3" > * </button>
	<button name="bt1" value="4" > / </button>
</form>
<h1>Ans=<%=request.getParameter("ans")%>🚩</h1>

</body>
</html>