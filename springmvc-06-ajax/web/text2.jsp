<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/3/23
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                /**
                 * $.post(url,param[可省略]，success
                 */
                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    // console.log(data)
                    var html="";

                    for (let i = 0; i < data.length; i++) {
                        html+="<tr>" +
                            "<td>" + data[i].name+"</td>"+
                            "<td>" + data[i].age+"</td>"+
                            "<td>" + data[i].sex+"</td>"+
                            "</tr>"
                    }
                    $("#content").html(html)
                })
            })
        })

    </script>
</head>
<body>

<input type="button" value="加载数据" id="btn">
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>

    <tbody id="content">
    <%--数据在后台--%>

    </tbody>
</table>

</body>
</html>
