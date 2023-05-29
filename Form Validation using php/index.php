<?php

if(isset($_POST["submit"])){
    $username = $_POST["username"];
    $email = $_POST["email"];
    $pass = $_POST["pass"];
    $cpass = $_POST["cpass"];

    if(empty($username) && empty($email) && empty($pass)&& empty($cpass))
        echo "<script type='text/javascript'>alert('Enter all the value')</script>";
    if(strlen($username)<3)
        echo "<script type='text/javascript'>alert('Username should be more than 3 characters')</script>";
    if(strlen($pass)<3)
         echo "<script type='text/javascript'>alert('Password should be of length 3')</script>";
    else if($pass != $cpass)
         echo "<script type='text/javascript'>alert('Password and confirm Password not matching')</script>";
    else
        echo "<script type='text/javascript'>alert('Form submitted')</script>";
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Form Validation using PHP</h1>
    <p>All values are to be filled</p>
    <form action="" method="post">
        <input type="text" placeholder="Username" name="username">
        <br><br>
        <input type="email" name="email" placeholder="Email">
        <br><br>
        <input type="password" name="pass" placeholder="Password">
        <br><br>
        <input type="password" name="cpass" placeholder="Confirm Password">
        <br><br>
        <input type="submit" value="submit" name="submit">
    </form>
</body>
</html>
