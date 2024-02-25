<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Add_Character</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>

<body>
    <div class="container" style="width: 600px;">
        <br>
        <h2>Add character</h2><br>
        <form action="addChar" method="post" >

            <div class="form-group">
                <label>Name</label>
                <input class="form-control" type="text" name="name">
            </div>

            <div class="form-group">
                <div class="form-group">
                    <label>Path</label>
                    <select class="form-control" name="path" id="path">
                        
                    </select>
                </div>

            </div>

            <div class="form-group">
                <label>Element</label>
                <select class="form-control" name="element" id="element">
                    
                </select>
            </div>

            <div class="row">

                <div class="col">
                    <label>Image</label>
                    <input class="form-control" type="text" name="image" id="image">
                </div>

                <div class="col">
                    <div class="form-group">
                        <label>HP</label>
                        <input class="form-control" type="number" name="hp">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="form-group">
                        <label>ATK</label>
                        <input class="form-control" type="number" name="atk">
                    </div>
                </div>

                <div class="col">
                    <div class="form-group">
                        <label>DEF</label>
                        <input class="form-control" type="number" name="def">
                    </div>
                </div>
            </div>
            <button class="btn btn-primary" >Submit</button>
        </form>
    </div>

    <script src="js/addJs.js"></script>
</body>

</html>