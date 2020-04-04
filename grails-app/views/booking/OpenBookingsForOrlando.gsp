<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Open Bookings For Orlando</title>
</head>
<body>

Open Bookings:
<ul>
    <g:each var="booking" in="${bookings}">
        <li>${bookings}</li>
    </g:each>
</ul>

</body>
</html>