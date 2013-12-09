<!DOCTYPE html>
<html>
<head>
    <title>Sign up</title>
    <script>
        function check(email){
            var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
            var emailValue = document.getElementById('email').value;
            alert(emailValue);
            if (reg.test(emailValue) == false)
            {
                alert('Invalid Email Address');
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<form id="register"  method="POST" onsubmit="return check(this)">
    <h1>Sign up</h1>
    <fieldset id="inputs" style="width: 150">
        <div>
          Username:  <input id="username" name="username" type="text" placeholder="Username" autofocus required>
        </div>
        <div>
          Password:  <input id="password" name="password" type="password" placeholder="Password" required>
        </div>
        <div>
          Email   :  <input id="email" name="email" type="email" placeholder="Email" required>
        </div>
        <div>
          Date of Birth  <input id="dateOfBirth" name="dateOfBirth" type="date" placeholder="Date of Birth" required>
        </div>

        <input type="submit" id="submit" value="Sign Up">
        Already a user? <a href="/index.jsp">Click here</a>
    </fieldset>
</form>

</body>
</html>