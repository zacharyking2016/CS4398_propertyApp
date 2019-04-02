<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>TOaG</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
}
ul.services {
    list-style-type: square;
}
body {
    font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
    background-color: #107795;
    padding: 20px;
    text-align: center;
    font-size: 35px;
    color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
    float: left;
    width: 20%;
    height: 400px;
    background: #ccc;
    padding: 20px;
}

/* Style the list inside the menu */
nav ul {
    list-style-type: none;
    padding: 0;
}

a:link {
    color:#000066;
}

a:visited {
    color:#003366;
}

a:focus {
    color:#FF0000;
}

a:hover {
    color:#0099CC;
}

a:active {
    color:#FF0000;
}

/* Clear floats after the columns */
section:after {
    content: "";
    display: table;
    clear: both;
}

/* Style the footer */
footer {
    background-color: #107795;
    padding: 50px;
    text-align: center;
    font-size: 10px;
    color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
    nav, article {
        width: 100%;
        height: auto;
    }
}
</style>
</head>
<body>

<header>
  <h2>Real Estate MGMT</h2>
</header>

<section>
  <nav>
    <ul>
      <li><a href=signUp.jsp>Sign Up</a></li>
      <li><a href="mainBeforeLogin.html">Return to Main</a></li>
    </ul>
  </nav>
  
  <article>
        <h1></h1>
        <form name="loginForm" method="post" action="${pageContext.request.contextPath}/LoginServlet">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name" required/></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Login" />
                            &nbsp;&nbsp;
                            <input type="reset" value="Reset" />
                        </td>                        
                    </tr>                    
                </tbody>
            </table>
        </form>
    </article>
</section>

<footer>
  <h2></h2>
</footer>

</body>
</html>