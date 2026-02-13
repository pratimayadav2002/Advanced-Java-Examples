<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GlowBeauty | Login</title>

<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: #f8f0f4;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .container {
        width: 850px;
        height: 480px;
        background: #fff;
        display: flex;
        border-radius: 12px;
        overflow: hidden;
        box-shadow: 0 6px 20px rgba(0,0,0,0.15);
    }

    /* LEFT SIDE */
    .left {
        width: 50%;
        background: linear-gradient(135deg, #ff5fa2, #ff8ccf);
        color: white;
        padding: 40px;
        display: flex;
        flex-direction: column;
        justify-content: center;
    }

    .left h1 {
        font-size: 32px;
        margin-bottom: 10px;
    }

    .left p {
        font-size: 16px;
        line-height: 1.6;
    }

    /* RIGHT SIDE */
    .right {
        width: 50%;
        padding: 40px;
    }

    .right h2 {
        text-align: center;
        margin-bottom: 10px;
        color: #333;
    }

    .msg-success {
        text-align: center;
        color: green;
        font-size: 14px;
    }

    .msg-error {
        text-align: center;
        color: red;
        font-size: 14px;
    }

    .form-group {
        margin-top: 15px;
    }

    label {
        font-weight: 600;
        color: #555;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border-radius: 5px;
        border: 1px solid #ccc;
        font-size: 14px;
    }

    input:focus {
        outline: none;
        border-color: #ff5fa2;
    }

    .btn {
        width: 100%;
        padding: 12px;
        background: #ff5fa2;
        border: none;
        border-radius: 5px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        margin-top: 20px;
    }

    .btn:hover {
        background: #e94a8f;
    }

    .footer {
        text-align: center;
        margin-top: 15px;
        font-size: 14px;
    }

    .footer a {
        color: #ff5fa2;
        text-decoration: none;
        font-weight: 600;
    }
</style>

</head>
<body>

<div class="container">

    <!-- LEFT CONTENT -->
    <div class="left">
        <h1>Welcome Back!</h1>
        <p>
            Login to explore premium beauty products, exclusive offers,  
            and enhance your glow with GlowBeauty.
        </p>
    </div>

    <!-- RIGHT LOGIN FORM -->
    <div class="right">
        <h2>Login</h2>

        <div class="msg-success">${succ}</div>
        <div class="msg-error">${error}</div>

        <form action="login" method="post">
            <div class="form-group">
                <label>Email Address</label>
                <input type="email" name="email" required>
            </div>

            <div class="form-group">
                <label>Password</label>
                <input type="password" name="password" required>
            </div>

            <button type="submit" class="btn">Login</button>
        </form>

        <div class="footer">
            Don’t have an account?
            <a href="register.jsp">Register</a>
        </div>
    </div>

</div>

</body>
</html>
    