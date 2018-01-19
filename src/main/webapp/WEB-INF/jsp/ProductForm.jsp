<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/1/18
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>input product</title>
</head>
<body>
    <div id="global">
        <form action="save_action" method="post">
            <legend>Add a Product</legend>
            <label for="name">Product Name</label>
            <input id="name" name="name"/>
            <label for="price">Price</label>
            <input id="price" name="price"/>
            <div id="buttons">
                <label for="dummy"></label>
                <input id="reset" type="reset" value="reset"/>
                <input id="submit" type="submit" value="Save"/>
            </div>
        </form>
    </div>
</body>
</html>
