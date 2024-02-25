<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hsr</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>

<body>


    <div class="container">
        <div class="row">
            <div class="col-md-2 justify-content-center border custom">
                <button class="btn btn-primary custom-button mb-2" onclick="toggleCharacterList(1)">Chọn nhân
                    vật</button>
                <img src="" onclick="handleImageClick(1)" class="imgnv" id="img1" alt="">
                <input type="text" id="id1" hidden />
            </div>

            <div class="col-md-2 justify-content-center border custom">
                <button class="btn btn-primary custom-button mb-2" onclick="toggleCharacterList(2)">Chọn nhân
                    vật</button>
                <img src="" onclick="handleImageClick(2)" class="imgnv" id="img2" alt="">
                <input type="text" id="id2" hidden />
            </div>
            <div class="col-md-2 justify-content-center border custom">
                <button class="btn btn-primary custom-button mb-2" onclick="toggleCharacterList(3)">Chọn nhân
                    vật</button>
                <img src="" onclick="handleImageClick(3)" class="imgnv" id="img3" alt="">
                <input type="text" id="id3" hidden />
            </div>
            <div class="col-md-2 justify-content-center border custom">
                <button class="btn btn-primary custom-button mb-2" onclick="toggleCharacterList(4)">Chọn nhân
                    vật</button>
                <img src="" onclick="handleImageClick(4)" class="imgnv" id="img4" alt="">
                <input type="text" id="id4" hidden />
            </div>
        </div>
    </div>
    <div class="container">
        <div id="frame" class="frame">
            <div class="content">
                <button class="btn btn-light d-flex justify-content-center align-items-center"
                    onclick="toggleCharacterList()" style="width: 40px;height: 40px;padding: 0">
                    <svg xmlns="http://www.w3.org/2000/svg" width="35" height="35" fill="currentColor" class="bi bi-x"
                        viewBox="0 0 16 16">
                        <path
                            d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708" />
                    </svg>
                </button>
                <br><br><br>
                <div id="characterList" class="character-list">

                </div>
            </div>
        </div>
    </div>
    <a href="AddCharacter.jsp">

        Them nhan vat
    </a>

    <script src="js/indexJs.js"></script>

</body>

</html>