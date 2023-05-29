<?php

if(isset($_POST["submit"])){
    $reg = $_POST["reg"];
    $name = $_POST["name"];

    $serverName = "localhost";
    $dbUsername = "root";
    $dpPassword = "";
    $dbname = "sample";
    $conn = new mysqli($serverName,$dbUsername,$dpPassword,$dbname);

    if($conn->connect_error){
        echo"<script type='text/javascript'>alert('Connection failed')</script>";
    }
    $sql = "INSERT INTO student (reg,name) VALUES ('$reg','$name')";
    if($conn->query($sql) === true){
        echo"<script type='text/javascript'>alert('Inserted successfully')</script>";
    }
    else{
        echo"<script type='text/javascript'>alert('Some Error')</script>";
    }

}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Data store</title>
</head>
<body>
    <h1>Saving the Data in php</h1>
    <p>Student form</p>
    <br><br>
    <form action="" method="post">
        <input type="text" placeholder="Register Number" name="reg">
        <br><br>
        <input type="text" name="name" placeholder="Name of the student">
        <br><br>
        <input type="submit" value="submit" name="submit">
    </form>
</body>
</html>
