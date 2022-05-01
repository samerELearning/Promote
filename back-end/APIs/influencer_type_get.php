<?php
//Import variables from 'db_info.php'
include("db_info.php");

$influencer_id = $_POST["influencer_id"];

//Execute query to get all values from 'conversions' table in the database
$query = $mysqli -> prepare("SELECT type_id FROM influencer_has_type WHERE influencer_id = '$influencer_id' ");
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