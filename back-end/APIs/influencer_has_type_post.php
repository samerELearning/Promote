<?php
include ("db_info.php");

$influencer_id = $_POST["influencer_id"];
$type_id = $_POST["type_id"];


$query = $mysqli -> prepare("INSERT INTO `influencer_has_type` (`influencer_id`, `type_id`) VALUES (?, ?);");
$query -> bind_param("ii", $influencer_id, $type_id);
$query -> execute();
?>