
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>hsr</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>

    <body>
        <style>
            .border {
                margin-right: 10px;
            }
            .row div {
                height: 200px;
            }
            .custom-button {
                margin-top: 5px;
                height: 40px; /* Adjust the height as desired */
                width: 100%;
            }
        </style>

        <div class="container">
            <div class="row">
                <div class="col-md-2 d-flex justify-content-center border">
                    <button class="btn btn-primary custom-button">Chọn nhân vật</button>
                </div>
                <div class="col-md-2 d-flex justify-content-center border">
                    <button class="btn btn-primary custom-button">Chọn nhân vật</button>
                </div>
                <div class="col-md-2 d-flex justify-content-center border">
                    <button class="btn btn-primary custom-button">Chọn nhân vật</button>
                </div>
                <div class="col-md-2 d-flex justify-content-center border">
                    <button class="btn btn-primary custom-button">Chọn nhân vật</button>
                </div>
            </div>
        </div>
    </body>
</html>
