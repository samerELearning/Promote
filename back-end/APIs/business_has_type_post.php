<?php
include ("db_info.php");

$business_id = $_POST["business_id"];
$type_id = $_POST["type_id"];


$query = $mysqli -> prepare("INSERT INTO `business_has_type` (`business_id`, `type_id`) VALUES (?, ?);");
$query -> bind_param("ii", $business_id, $type_id);
$query -> execute();
?>