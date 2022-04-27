<?php
include ("db_info.php");

$email = $_POST["email"];
$password = $_POST["password"];
$picture = $_POST["picture"];
$first_name = $_POST["first_name"];
$last_name = $_POST["last_name"];
$gender = $_POST["gender"];
$instagram = $_POST["instagram"];
$age = $_POST["age"];
$bio = $_POST["bio"];


$query = $mysqli -> prepare("INSERT INTO `business` (`email`, `password`, `picture`, 'first_name', 'last_name', 'gender', 'instagram', 'age', 'bio' ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
$query -> bind_param("sssssssis", $email, $password, $picture, $first_name, $last_name, $gender, $instagram, $age, $bio);
$query -> execute();
?>