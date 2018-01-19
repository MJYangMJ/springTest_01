<%--@elvariable id="product" type="com.yang.bean.Product"--%>
<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2018/1/18
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<head>
    <title>Product Details</title>
</head>
<body>
    <div id="global">
        <h4>The Product has been saved!</h4>
        <p>
            <h5>Details</h5>
            Product Name:${product.name}<br>
            Price:${product.price}<br>
        </p>
    </div>
</body>
</html>
