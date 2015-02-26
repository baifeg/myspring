<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
  <tr>
    <th>ID</th>
    <th>Name</th>
  </tr>

<c:forEach items="${companyList }" var="company">
  <tr>
    <td>${company.getId() }</td>
    <td>${company.getName() }</td>
  </tr>
</c:forEach>
</table>