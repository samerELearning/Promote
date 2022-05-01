<?php
//Import variables from 'db_info.php'
include("db_info.php");

$business_id = $_POST["business_id"];

//Execute query to get all values from 'conversions' table in the database
$query = $mysqli -> prepare("SELECT type_id FROM business_has_type WHERE business_id = '$business_id' ");
$query -> execute();

//Assign values to an array
$array = $query -> get_result();

$response = [];

while ($business_type = $array -> fetch_assoc())
{
    $response[] = $business_type;
}

$json_response = json_encode($response);

echo $json_response;

?>