<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="db.DBHandler"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<script type="text/javascript">
    function validate(){
    	
        // =========================================
        // VALIDATE EMAIL -- WORKS
        // - email must must be in format xxx@xxx.xxx
        // =========================================
        var vEmail = /\S+@\S+\.\S+/;
        if(quoteForm.email.value == ''){
        	alert("Email must be entered.");
        	quoteForm.email.focus();
        	return false;
        }
        else if(!quoteForm.email.value.match(vEmail)) {
        	alert("Invalid email format: " + quoteForm.email.value +
        		  "\nCorrect format is example@example.com");
        	quoteForm.email.focus();
        	return false;
        }
        else {} // DO NOTHING, CONTINUE
        
        // =========================================
        // VALIDATE PHONE
        // - phone number must must be in format xxx-xxx-xxxx
        // =========================================
        var vPhone = /^\d{3}\-\d{3}\-\d{4}$/;
        if (quoteForm.phone.value == ''){
        	alert("Phone number must be entered.");
        	quoteForm.phone.focus();
        	return false;
        }
        else if(!quoteForm.phone.value.match(vPhone)){
        	alert("Invalid phone number format: " + quoteForm.phone.value +
        		  "\nCorrect format is XXX-XXX-XXXX");
        	quoteForm.phone.focus();
        	return false;
        }
        	
        // =========================================
        // VALIDATE NAME -- WORKS
        // - name must not start with space
        // - name must not end with space
        // - name must contain only letters
        // =========================================
        //var vName = /^[a-zA-Z]+$/;
        //var vName = /^([a-zA-Z0-9][a-zA-Z0-9 ]*[a-zA-Z0-9]$/;
        if(quoteForm.name.value == ''){
        	alert("Name must be entered.");
        	quoteForm.name.focus();
        	return false;
        }
        else if(!quoteForm.name.value.match("^[a-zA-z]+[(?<=ds]([a-zA-Z ])*[a-zA-Z]+$")){
        	alert("Invalid name: " + quoteForm.name.value +
        		  "\nName must not contain special characters or numbers.");
        	quoteForm.name.focus();
        	return false;
        }
        
        // =========================================
        // VALIDATE PRICE/GALLON -- WORKS
        // - price per gallon must be a two-decimal number
        // =========================================
        if(quoteForm.price.value == '') {
        	alert("Must enter a price per gallon.");
        	quoteForm.price.focus();
        	return false;
        }
        else if(!quoteForm.price.value.match("^[0-9]+\\.?[0-9]{2}$")){
        	alert("Invalid number entered for price per gallon: " + quoteForm.price.value + 
        		  "\nPrice must be a number with exactly 2 decimal places.");
        	quoteForm.price.focus();
        	return false;
        } 	
    }
    
</script>
<title>TOaG Quote</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
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

input:hover {
    background-color: #0099CC;
}

a:active {
    color:#FF0000;
}

input:focus {
    background-color: lightblue;
}

#button:hover {
    background-color: #0099CC;
}

article {
    float: left;
    padding: 20px;
    width: 80%;
    background-color: #f1f1f1;
    height: 400px;
}

label {
    display: inline-block;
    width:250px;
    text-align: right;
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
  <h2>Sign Up</h2>
</header>

<section>
    <nav>
      <ul>
        <li><a href=mainBeforeLogin.html>Back to Main</a></li>
      </ul>
    </nav>
    
    <article>
        <h1></h1>
        <form name="signUpForm" action="${pageContext.request.contextPath}/SignUpServlet" 
        method="post">
          <fieldset>
            <legend>Please fill out the following:</legend>
            <label for="name">Full Name:</label>                        
            <input id="name" type="text" step="0.01" min=0 name="name" required>
            <br>
            <label for="address">Street Address:</label>
            <input type="text" name="address" maxlength="10" required>
            <br>
            <label for="city">City:</label>
            <input type="text" name="city" maxlength="25" required>
            <br>
            <label for="state">State (Abbreviation):</label>
            <input type="text" name="state" maxlength="2" required>
            <br>
            <label for="zip">Zip Code:</label> 
            <input type="text" name="zip" maxlength="12" required>
            <br>
            <label for="email">Email:</label>
            <input type="text" name="email" maxlength="30" required>
            <br>
            <label for="phone">Phone Number:</label>
            <input type="text" name="phone" maxlength="30" required>
            <br><br>
            <input id="button" type="submit" value="Submit">
          </fieldset>
        </form>
    </article>
</section>

<footer>
  <h2>All collected information is kept confidential.</h2>
</footer>

</body>
</html>