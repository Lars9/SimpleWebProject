<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title></title>
    <link href="../../resources/style.css" rel="stylesheet" />
</head>
   <body>
   <h2 align="center"> Web приложение отображающее данные из таблицы БД</h2>
      <table>
          <tr>
             <th>id</th>
             <th>text</th>
             <th>insert_date</th>
          </tr>

              <c:forEach var="object" items="${objects}">
                  <tr>
                     <td>${object.id}</td>
                     <td>${object.text}</td>
                      <td>
                          <fmt:setLocale value="ru_RU" />
                          <fmt:formatDate value="${object.insert_date}" type="both" />
                      </td>
                  </tr>
              </c:forEach>

      </table>
   </body>
</html>
