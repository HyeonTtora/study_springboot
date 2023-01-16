<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <div class="fs-2">Notice/view</div>
    <table class="table">

        <thead class="table-dark">
        <th scope="col">
            Num
        </th>
        <th scope="col">
            Title
        </th>
        <th>
            UserName
        </th>
        <th scope="col">
            Date
        </th>

        </thead>

        
        <tbody>
            <tr>
                <td scope="row">${noticeBean.getuId()}</td>
                <td scope="row">${noticeBean.getTitle()}</td>
                <td scope="row">${noticeBean.getWriter()}</td>
                <td scope="row">${noticeBean.getDate()}</td>
              </tr>
            <tr class="table-dark">
             <th rowspan="4" scope="col">
                Content
             </th>
            </tr>
            <tr>
            <td colspan="4">
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="8" width="100%">${noticeBean.getContent()}<</textarea>
            </td>
            </tr>
    </table>
    <div class= "d-flex justify-content-center m-lg-auto">
      <form action="/notice/list"><button class="btn btn-dark btn-lg me-2">List</button></form>
      <form action="/notice/edit/>${noticeBean.getuId()}" method="post" ><button class="btn btn-dark btn-lg">Edit</button></form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>