<%--
  Created by IntelliJ IDEA.
  User: KotoSovik
  Date: 13.04.2018
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
    <link rel="stylesheet" href="resources/css/style.css" media="screen" type="text/css" />

    <link rel="icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
    <link rel="shortcut icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>


    <span class="right">
        <a href="http://vladmaxi.net/web-developer/css/22-luchshix-formy-vxoda-i-registracii-na-sajte-v-html-css.html">
                <strong>Вернуться назад к статье</strong>
            </a>
        </span>
    <div class="clr"></div>
</div>
<!--/ vladmaxi top bar -->

<div id="login-form">
    <h1>Авторизация на сайте</h1>

    <fieldset>
        <form action="javascript:void(0);" method="get">
            <input type="email" required value="Логин" onBlur="if(this.value=='')this.value='Логин'" onFocus="if(this.value=='Логин')this.value='' ">
            <input type="password" required value="Пароль" onBlur="if(this.value=='')this.value='Пароль'" onFocus="if(this.value=='Пароль')this.value='' ">
            <input type="submit" value="ВОЙТИ">
            <footer class="clearfix">
                <p><span class="info">?</span><a href="#">Забыли пароль?</a></p>
            </footer>
        </form>
    </fieldset>

</div>
</body>
</html>
