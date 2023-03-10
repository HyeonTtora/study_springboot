<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

<table class="table">
        <thead>
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
        </thead>  
        <tbody>
            <tr>
                <td scope="row">갈비탕 맛있다</td>
                <td scope="row"><img src="https://img.freepik.com/free-vector/fast-food-isometric-set_1284-21631.jpg?w=826&t=st=1672930165~exp=1672930765~hmac=302f0ace380a34934b77109ce9fb65610ccf160e1dbdd3ec41e8fa30705a8988"width="200px" ></td>
                <td scope="row">김 길동</td>
                <td scope="row">23-1-1</td>
              </tr>
    </table>
    <div class= "d-flex justify-content-center m-lg-auto">
      <form action="/board/list"><button class="btn btn-dark btn-lg me-2">List</button></form>
      <form action="/board/edit"><button class="btn btn-dark btn-lg">Edit</button></form>
    </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>