<%@ page import="java.util.*" %>

<html>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <p>
        <%
            List styles = (List) request.getAttribute("styles");
            //ArrayList<String> styles = request.getAttribute("styles");

            Iterator iterator = styles.iterator();
            while (iterator.hasNext()) {
                out.println("<br>try: " + iterator.next());
            }
        %>
</body>
</html>