<?php
include ("db_info.php");

$influencer_id = $_POST["influencer_id"];
$business_id = $_POST["business_id"];


$query = $mysqli -> prepare("INSERT INTO `matches` (`influencer_id`, `business_id`) VALUES (?, ?);");
$query -> bind_param("ii", $influencer_id, $business_id);
$query -> execute();
?>