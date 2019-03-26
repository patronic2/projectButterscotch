<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>DTT Login Page</title>
    
    <!-- CSS dependencies -->
  <link rel="stylesheet" href="./resources/bootstrap-4.3.1-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="./resources/fontawesome-free-5.7.2-web/fontawesome-free-5.7.2-web/css/all.css">
  <link rel="stylesheet" type="text/css" href="<c:url value="./resources/css/main.css"/>" >
	  <link rel="stylesheet" href="c:./resources/css/checkbox.css" type="text/css">
    
    <!-- JS dependencies -->
	  <script src="./resources/js/jquery-3.3.1.min.js"></script>
	  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	  <script src="./resources/js/popper.min.js"></script>
	  <script src="./resources/bootstrap-4.3.1-dist/js/bootstrap.min.js"></script>
	  

    <!-- 
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
     -->
     
     
      <script>
        var login=true;//change value via jsp

        function myfunction() {
            $(".login-form").show();
            $(".login-failed").hide();
        }
        $(document).ready(function() {
        if(login){
            $(".login-form").show();
            $(".login-failed").hide();
        }
        else {
            $(".login-form").hide();
            $(".login-failed").show();
        }
        });
    </script>
</head>

<body>

    <div class="container zoomed">
        <div class="d-flex justify-content-center h-100">
            <div class="card">
                <div class="card-header">
                    <img src='./resources/images/logo.png' id="logo" alt="">
                </div>
                <div class="card-body">
                    <form>
                        <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fas fa-user"></i></span>
                            </div>
                            <input type="text" class="form-control" placeholder="username" id="un">

                        </div>
                        <div class="input-group form-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fas fa-key"></i></span>
                            </div>
                            <input type="password" class="form-control" placeholder="password" id="pw">
                        </div>
                        <div class="row align-items-center remember login-toggle">
                            <label class="toggle">
                                <input class="toggle__input" type="checkbox" checked>
                                <span class="toggle__label">
                                    <span class="toggle__text">Remember Me!</span>
                                </span>
                            </label>
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Login" class="btn float-left login_btn">
                        </div>
                    </form>
                </div>
                 <div class="login-failed">
                    <h6 style="color: white">Sorry, that Username and Password combination doesnt exist</h3>
                    <input type="button" onclick="myfunction()" value="Return to Login" class="btn float-left login_failed_btn"/>
                </div>
                <div class="card-footer">
                    <div class="d-flex justify-content-center">
                        <a href="#">Forgot your password?</a>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>

</html>