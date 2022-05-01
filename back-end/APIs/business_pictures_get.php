<?php
//Import variables from 'db_info.php'
include("db_info.php");

$business_id = $_POST["business_id"];

//Execute query to get all values from 'conversions' table in the database
$query = $mysqli -> prepare("SELECT name FROM pictures WHERE business_id = '$business_id' ");
$query -> execute();

//Assign values to an array
$array = $query -> get_result();

$response = [];

while ($business_pictures = $array -> fetch_assoc())
{
    $response[] = $business_pictures;
}

$json_response = json_encode($response);

echo $json_response;

?>