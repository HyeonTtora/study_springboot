<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
   <div class="container container-md">
    <div class="fs-2">Notice/list</div>
    <table class="table">

        <thead class="table-dark">
        <th scope="col">
            ID
        </th>
        <th scope="col">
            Name
        </th>
        <th>
            Num
        </th>


        </thead>

        <tbody>
         <c:forEach items="${result}" var="result" varStatus="status">
            <tr>
                <td scope="row">${result.COMMON_CODE_ID}</td>
                <td scope="row">${result.NAME}</td>
                <td scope="row">${result.ORDER_NUMBER}</td>
              </tr>
               </c:forEach>
        </tbody>
    </table>
      </div>

   <div class="d-flex justify-content-center">
    <a href="/" class="btn btn-dark">Home</a>
    </div>
  
    
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
