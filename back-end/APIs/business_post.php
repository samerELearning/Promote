<?php
include ("db_info.php");

$email = $_POST["email"];
$password = $_POST["password"];
$picture = $_POST["picture"];
$name = $_POST["name"];
$type = $_POST["type"];
$instagram = $_POST["instagram"];

$query = $mysqli -> prepare("INSERT INTO `business` (`email`, `password`, `picture`, 'name', 'type', 'instagram' ) VALUES (?, ?, ?, ?, ?, ?);");
$query -> bind_param("ssssss", $email, $password, $picture, $name, $type, $instagram);
$query -> execute();
?>