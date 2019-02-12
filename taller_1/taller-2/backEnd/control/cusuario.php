<?php

$primerNombre = $_GET["primerNombre"];
$apellido = $_GET["apellido"];
$email = $_GET["email"];
$typeCard = $_GET["typeCard"];
$cardHolder = $_GET["cardHolder"];
$cardNumber = $_GET["cardNumber"];
$cvv2 = $_GET["cvv2"];
$month = $_GET["month"];
$year = $_GET["year"];
$streetAddress = $_GET["streetAddress"];
$city = $_GET["city"];
$state = $_GET["state"];
$zip = $_GET["zip"];
$country = $_GET["Country"];
$phone = $_GET["phone"];
$securityCode = $_GET["securityCode"];

echo $primerNombre," ",$apellido ," ",$email , " ",$typeCard," ",$cardHolder," ",$cardNumber," ", $cvv2," ",$month," ",$year," ",$streetAddress," ",$city," ",$state," ",$zip," ",$country,
" ",$phone," ",$securityCode;
