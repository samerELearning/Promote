<?php
include ("db_info.php");

$id = $_POST["id"];
$email = $_POST["email"];
$password = $_POST["password"];
$picture = $_POST["picture"];
$name = $_POST["name"];
$type = $_POST["type"];
$instagram = $_POST["instagram"];
$bio = $_POST["bio"];

$query = $mysqli -> prepare("INSERT INTO `business` (`id`, `email`, `password`, `picture`, `name`, `type`, `instagram`, `bio` ) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
$query -> bind_param("issbssss", $id, $email, $password, $picture, $name, $type, $instagram, $bio);
$query -> execute();
?>