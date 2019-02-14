<?php

require '../model/consultas.php'; //Importacion de dicho archivo


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
$country = $_GET["country"];
$phone = $_GET["phone"];
$card_preview = $_GET["card_preview"];

$connection = new consultas();//Creacion de un objeto, de la clase php en require
$conexion = $connection -> update($primerNombre,$apellido,$email,$typeCard,$cardHolder,$cardNumber,$cvv2,$month."/".$year,$streetAddress,$city,$state,$zip,$country,$phone,$card_preview);//Ejecucion del metodo insertarMensaje tomando como parametros, "chat 2"(esta maquina) y $mensaje que es la variable enviada por el usuario
echo $conexion;
