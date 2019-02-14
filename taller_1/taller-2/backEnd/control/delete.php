<?php
require '../model/consultas.php'; //Importacion de dicho archivo

$cardNumber = $_GET["cardNumber"];

$connection = new consultas();//Creacion de un objeto, de la clase php en require

$resultado = $connection -> delete($cardNumber);

echo $resultado;
