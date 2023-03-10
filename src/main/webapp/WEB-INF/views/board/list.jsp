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
    <div class="fs-2">board/list</div>
    <table class="table">
        <thead class="table-dark">
        <th scope="col">Title
        </th>
        <th>
            Content
        </td>
        <th scope="col">
            UserName
        </td>
        <th scope="col">
            Date
        </th>

        </thead>
        <tbody>
            <tr>
                <td scope="row"> <a href="/board/view"> 갈비탕 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">김 길동</td>
                <td scope="row">23-1-1</td>
              </tr>
            <tr>
                <td scope="row"> <a href="/board/view"> 삼계탕 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">홍 길동</td>
                <td scope="row">23-1-16</td>
              </tr>
            <tr>
                <td scope="row"> <a href="/board/view"> 감자탕 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">박 길동</td>
                <td scope="row">23-1-8</td>
              </tr>
            <tr>
                <td scope="row"> <a href="/board/view"> 우럭탕 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">오 길동</td>
                <td scope="row">23-1-5</td>
              </tr>
            <tr>
                <td scope="row"> <a href="/board/view"> 꽃계탕 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">강 길동</td>
                <td scope="row">23-1-7</td>
              </tr>
            <tr>
                <td scope="row"> <a href="/board/view"> 닭도리탕 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">하 길동</td>
                <td scope="row">23-1-22</td>
              </tr>
            <tr>
                <td scope="row"> <a href="/board/view"> 나는 다 맛있다 </a></td>
                <td scope="row">맛집</td>
                <td scope="row">김 길동</td>
                <td scope="row">23-1-8</td>
              </tr>
        </tbody>
      </table>

          <tbody>
            <tr>
                <th scope=>1 <a href="/board/view"> 갈비탕 맛있다 </a></th>
                <td scope="row">맛집</td>
                <td scope="row">김 길동</td>
                <td scope="row">23-1-1</td>
              </tr>
           
        </tbody>
    </table>
      </div>
   <div class="d-flex justify-content-center">
    <form action="/board/form" method="get"><button class="btn btn-dark btn-lg">Form</button></form></div>
  
    
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
