<?php
//Import variables from 'db_info.php'
include("db_info.php");

$influencer_id = $_POST["influencer_id"];

//Execute query to get all values from 'conversions' table in the database
$query = $mysqli -> prepare("SELECT business_id FROM matches WHERE influencer_id = '$influencer_id' ");
$query -> execute();

//Assign values to an array
$array = $query -> get_result();

$response = [];

while ($influencer_matches = $array -> fetch_assoc())
{
    $response[] = $influencer_matches;
}

$json_response = json_encode($response);

echo $json_response;

?>