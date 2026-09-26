<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Success</title>
</head>
<body>
    <h1><marquee>Registration Successfully!</marquee></h1>
    <% String name = (String)session.getAttribute("name");%>
    <h2>Hey <%=name%> You have registered to this web app</h2>

</body>
</html>