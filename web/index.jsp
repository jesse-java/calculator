<%--
  Created by IntelliJ IDEA.
  User: jesse
  Date: 2/22/18
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%--main container--%>
  <div>
      <h1>Prototype Calculator</h1>

      <%--calculator--%>
      <div>

        <%--container for buttons + display--%>
        <div>

          <form action="/" method="post">

            <%--calculator display--%>
            <div>
              <input type="text" name="input_box" value="<c:out value="${calcString}"/>">
            </div>


            <%--container for char buttons + = char --%>
            <div>

              <input id="char" type="submit" name="char" value="1">
              <input id="char" type="submit" name="char" value="2">
              <input id="char" type="submit" name="char" value="3">
              <input id="char" type="submit" name="char" value="4">
              <input id="char" type="submit" name="char" value="5">
              <input id="char" type="submit" name="char" value="6">
              <input id="char" type="submit" name="char" value="7">
              <input id="char" type="submit" name="char" value="8">
              <input id="char" type="submit" name="char" value="9">
              <input id="char" type="submit" name="char" value="0">
              <%--<input id="char" type="submit" name="char" value=".">--%>


              <input id="char" type="submit" name="calculate" value="=">

            </div>

            <%--container for operands--%>
            <div>
              <input id="char" type="submit" name="char" value="/">
              <input id="char" type="submit" name="char" value="*">
              <input id="char" type="submit" name="char" value="-">
              <input id="char" type="submit" name="char" value="+">
            </div>
          </form>

        </div>
      </div>

       <%--results display --%>
      <div>
        <h1>Previous Results</h1>
        <c:forEach items="${cResults}" var="res" varStatus="loop">
          <p><c:out value="${loop.index + 1}"/>) <c:out value="${res.getResults()}"/></p>
        </c:forEach>


      </div>

  </div>

  <%--test div--%>


  </body>
</html>
