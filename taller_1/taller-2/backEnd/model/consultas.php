<?php
/**
 *
 */
require 'connection.php';//Se encuentra la conexion a la base de datos
class consultas
{

  function __construct(){}

    public function insertarInfo($first_name,$last_name,$email,$credit_card,$card_holder,$card_number,$cvv2,$exp_date,$address
    ,$city,$state,$zip,$country,$phone)
    {
      $connection = new connection(); //estable el objeto conexion
      $conexion = $connection -> conectar(); //guarda la conexion para realizar las consultas
      $insertar = "INSERT INTO cliente(first_name,last_name,email,credit_card,card_holder,card_number,cvv2
      ,exp_date,address,city,state,zip,country,phone) VALUES('$first_name','$last_name','$email','$credit_card','$card_holder'
      ,'$card_number','$cvv2','$exp_date','$address','$city','$state','$zip','$country','$phone')";
      $resultado = mysqli_query($conexion,$insertar);
      mysqli_close($conexion);
      return "Creation Correct!.";
    }

    public function buscar($cardNumber)
    {
      $connection = new connection(); //estable el objeto conexion
      $conexion = $connection -> conectar(); //guarda la conexion para realizar las consultas
      $buscar = "SELECT * FROM cliente WHERE card_number=".$cardNumber;
      $result = mysqli_query($conexion,$buscar);
      $texto = "";
      while( $registro = mysqli_fetch_assoc($result))
      {
        $texto = "Name: ".$registro['first_name']." ".$registro['last_name']."<br>".
        "Email: ".$registro['email']."<br>Card Number: ". $registro['card_number'];
      }
      mysqli_close($conexion);
      return $texto;
    }

    public function delete($cardNumber)
    {
      $connection = new connection(); //estable el objeto conexion
      $conexion = $connection -> conectar(); //guarda la conexion para realizar las consultas
      $buscar = "DELETE FROM cliente WHERE card_number=".$cardNumber;
      $result = mysqli_query($conexion,$buscar);
      mysqli_close($conexion);
      return "Delete!!";
    }
    public function update($first_name,$last_name,$email,$credit_card,$card_holder,$card_number,$cvv2,$exp_date,$address
    ,$city,$state,$zip,$country,$phone,$card_preview)
    {
      $connection = new connection(); //estable el objeto conexion
      $conexion = $connection -> conectar(); //guarda la conexion para realizar las consultas
      $update = "UPDATE cliente SET first_name='".$first_name."'".",last_name='".$last_name."'".",email='".$email."'".",credit_card='".$credit_card."'".",card_holder='".$card_holder."'".",card_number='".$card_number."'".",cvv2='".$cvv2."'".",exp_date='"
                  .$exp_date."'".",address='".$address."'".",city='".$city."'".",state='".$state."'".",zip='".$zip."'".",country='".$country."'".",phone='".$phone."'"." WHERE card_number='".$card_preview."'";
      $resultado = mysqli_query($conexion,$update);
      mysqli_close($conexion);
      return "<div class="."alert alert-success"."role="."alert".">"."Correct Update!!</div>";
    }

    public function cupdate($cardNumber)
    {
      $connection = new connection(); //estable el objeto conexion
      $conexion = $connection -> conectar(); //guarda la conexion para realizar las consultas
      $buscar = "SELECT * FROM cliente WHERE card_number=".$cardNumber;
      $result = mysqli_query($conexion,$buscar);
      $texto = "";
      while( $registro = mysqli_fetch_assoc($result))
      {
        $texto = "<label>Name: <label id='f_n' value=".$registro['first_name'].">".$registro['first_name']."</label> <label id='l_n'>".$registro['last_name']."</label></label><br>".
        "Email: <label id='e'>".$registro['email']."</label><br><label>Credit Card: <label id='c_c'>".$registro['credit_card']."</label> Card Holder: <label id='c_h'>".$registro['card_holder'] ."</label> Card Number: <label id='c_n'>".$registro['card_number']
        ."</label> CVV2:  <label id='c2'>".$registro['cvv2']."</label> Exp Date: <label id='exp'>".$registro['exp_date']."</label></label><br>"
        ."<label>Street Address: <label id='ad'>". $registro['address']."</label>City: <label id='ct'>".$registro['city']."</label> State: <label id='ste'>".$registro['state']."</label><br>"
        ."ZIP: <label id='z'>".$registro['zip']."</label> Country: <label id='ctry'>".$registro['country']."</label> Phone: <label id='ph'>".$registro['phone']."</label></label>";
      }
      mysqli_close($conexion);
      return $texto;
    }

}
