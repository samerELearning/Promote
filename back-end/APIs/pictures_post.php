<?php
include ("db_info.php");

$id = $_POST["id"];
$name = $_POST["name"];
$business_id = $_POST["business_id"];


$query = $mysqli -> prepare("INSERT INTO `pictures` (`id`, `name`, `business_id`) VALUES (?, ?, ?);");
$query -> bind_param("ibi", $id, $name, $business_id);
$query -> execute();
?>