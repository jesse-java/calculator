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

          <%--calculator display--%>
          <div>

          </div>

          <form action="/" method="post">
            <%--container for char buttons + = operand --%>
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
              <input id="char" type="submit" name="char" value=".">


              <input id="char" type="submit" name="operand" value="=">

            </div>

            <%--container for operands--%>
            <div>
              <input id="operand" type="submit" name="operand" value="/">
              <input id="operand" type="submit" name=       "operand" value="*">
              <input id="operand" type="submit" name="operand" value="-">
              <input id="operand" type="submit" name="operand" value="+">
            </div>
          </form>

        </div>
      </div>

       <%--results display --%>
      <div>
        <h1>Previous Results</h1>
      </div>

  </div>

  <%--test div--%>


  </body>
</html>