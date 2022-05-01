<?php
//Import variables from 'db_info.php'
include("db_info.php");

$email = $_POST["email"];
$password = $_POST["password"];
//Execute query to get all values from 'conversions' table in the database
$query = $mysqli -> prepare("SELECT id, email, picture, name, type, instagram, bio FROM business WHERE email = '$email' AND password = '$password' ");
$query -> execute();

//Assign values to an array
$array = $query -> get_result();

$response = [];

while ($business_information = $array -> fetch_assoc())
{
    $response[] = $business_information;
}

$json_response = json_encode($response);

echo $json_response;

?>