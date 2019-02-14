<?php

require '../model/consultas.php'; //Importacion de dicho archivo

$cardNumber = $_GET["cardNumber"];


$connection = new consultas();//Creacion de un objeto, de la clase php en require
$conexion = $connection -> cupdate($cardNumber);//Ejecucion del metodo insertarMensaje tomando como parametros, "chat 2"(esta maquina) y $mensaje que es la variable enviada por el usuario
echo $conexion;
