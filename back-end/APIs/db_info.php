<?php

$db_host = "localhost";
$db_user = "root";
$db_pass = null;
$db_name = "promotedb";

$mysqli = new mysqli($db_host, $db_user, $db_pass, $db_name);

if(mysqli_connect_errno())
{
    die("Connection Failed!");
}

?>