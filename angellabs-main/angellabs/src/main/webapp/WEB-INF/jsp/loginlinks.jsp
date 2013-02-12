<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">        
    </head>
<body>
<!-- Contentleft Start Here -->
                              <div id="enpageleftcontent">

                              			<form name='f' action="<c:url value='/j_spring_security_check' />" method='POST'>

                              			  <table class="enpagelogintable">
    <th class="enpagetabletitle"> <div align="left">Login</div></th>
  <tr>
    <td style="border-top:1px solid #e8e8e8"></td>
  </tr>
  <tr class="userinput">
    <td><p  class="pblack">Email</p></td>
  </tr>
  <tr class="userinput">
    <td><label>

      <input type="email" name="j_username" id="username" required placeholder="user@domain.com" class="forminput">

    </label></td>
  </tr>
  <tr class="userinput">
    <td><p  class="pblack">Password</p></td>
  </tr>
  <tr class="userinput">
    <td><label>
      <input type="password" name="j_password" id="password" required placeholder="Enter password" class="forminput">
    </label></td>
  </tr>
  <tr class="userinput">
    <td><label>
<input type="submit" name="login" id="loginbutton" value="Login">
    </label></td>
  </tr>
  <tr class="userinput">
    <td><a href="#" class="aenlink">Forget Password? </a></td>
  </tr>
  <tr class="userinput">
    <td><label>
      <input type="image" name="facebook" id="social2" src="<c:url value="/resources/images/facebook.png"/>">
      <input type="image" name="twitter" id="social2" src="<c:url value="/resources/images/twitter.png"/>">
      <input type="image" name="plus" id="social2" src="<c:url value="/resources/images/plus.png"/>">
      <input type="image" name="linkedin" id="social2" src="<c:url value="/resources/images/linkedin.png"/>">
    </label></td>
  </tr>
  <tr class="userinput">
    <td><p class="pblack">Need An Account? <a href="join.htm" class="aenlink">Sign up.</a> </p></td>
  </tr>
                                          </table>
                       			        </form>
                              <!-- Contentleft Ends Here -->
                              </div>
                              
                              
      <div></div>                        
</body>
</html>
