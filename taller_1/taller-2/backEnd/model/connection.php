<?php
/**
 *
 */
class connection
{

  private $usuario = "admin";
  private $host = "localhost";
  private $password = "toor";
  private $DB = "taller_punto_2";
  private $conexion;

  function __construct(){}


  public function conectar()
  {
      $this -> conexion = mysqli_connect($this -> host, $this -> usuario, $this -> password, $this -> DB) or die ("Error en conexion.");
      return $this -> conexion;//retorno de la sentencia para la conexion a la base de datos
  }

}
