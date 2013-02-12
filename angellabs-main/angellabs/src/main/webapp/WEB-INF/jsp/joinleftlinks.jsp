<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Join left Start Here -->
                              <div id="jpageleftcontent">
                  			<form class="joinform" action="<c:url value="adduser.htm"/>" commandName="register">

                                  <table class="jointable">
                                        		  <th class="jointabletitle"><div align="left" class="style1">Create an Account</div></th>
                                               <tr>
    <td style="border-top:1px solid #e8e8e8"></td>
  </tr>
                                                  <tr class="userinput">
                                                    <td><p  class="pblack">Name</p></td>
                                    </tr>
                                                <tr class="userinput">
                                                    <td><label>
                                                      <input type="text" name="name" id="name" required placeholder="Enter Your Name " class="forminput">
                                                    </label></td>
                                                </tr>
                                                <tr class="userinput"> 
                                                	<td><p  class="pblack">Email</p></td>
                                    </tr>
                                                <tr>
                                                   <td><label>
                                                     <input type="email" name="email" id="email" required placeholder="user@domain.com" class="forminput">
                                                   </label></td>
                                                </tr>
                                                <tr class="userinput">
                                                    <td><p  class="pblack">Password</p></td>
                                                </tr>
                                                <tr class="userinput">
                                                    <td><label>
                                                      <input type="password" name="password" id="password" required placeholder="Enter password" class="forminput">
                                                    </label></td>
                                                </tr>
                                                <tr class="userinput">
                                                    <td height="30px"><label>
                                                      <input type="submit" name="join" id="join" value="Create Your Account">
                                                    </label></td>
                                                </tr>
                                                <tr class="userinput">
                                                    <td><p  class="pblack">or</p></td>
                                    </tr>
                                                <tr class="userinput">
    <td><label>
      <a href="<c:url value="../Facebook/facebook.htm"/>"><input type="image" name="social2" id="social2" src="../resources/images/facebook.png"/></a>
      <input type="image" name="social2" id="social2" src="../resources/images/twitter.png">
      <input type="image" name="social2" id="social2" src="../resources/images/plus.png">
      <input type="image" name="social2" id="social2" src="../resources/images/linkedin.png">
    </label></td>
  </tr>                                              
                                        </table>
                                        </form>
<!-- Join left Ends Here -->
</div>
</body>
</html>