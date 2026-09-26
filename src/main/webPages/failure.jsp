<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Failure</title>
</head>
<body>
  <h1><marquee>Failed to register!</marquee></h1>
<% String name = (String)session.getAttribute("name");%>
<h2>Hey <%=name%> You failed to registered to this web app</h2>

</body>
</html>