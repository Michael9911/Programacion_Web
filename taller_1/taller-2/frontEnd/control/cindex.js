function Enviar() {
  var xhttp = new XMLHttpRequest();//Inicio de una nueva peticion o instancia de dicho objeto
  var nombre = document.getElementById('PrimerNombre').value;
  var apellido = document.getElementById('apellido').value;
  var email = document.getElementById('email').value;
  var typeCard = document.getElementById('typeCard').value;
  var cardHolder = document.getElementById('cardHolder').value;
  var cardNumber = document.getElementById('cardNumber').value;
  var cvv2 = document.getElementById('cvv2').value;
  var month = document.getElementById('month').value;
  var year = document.getElementById('year').value;
  var streetAddress = document.getElementById('streetAddress').value;
  var city = document.getElementById('city').value;
  var state = document.getElementById('state').value;
  var zip = document.getElementById('zip').value;
  var country = document.getElementById('Country').value;
  var phone = document.getElementById('phone').value;
  var securityCode = document.getElementById('securityCode').value;
  xhttp.onreadystatechange = function() {//nueva funcion para ejecutar la peticion xhttp
    if (this.readyState == 4 && this.status == 200) {//Respuesta del servidor si ambos valores son corectos, es decir que hay comunicacion hacia el servidor
      document.getElementById("recibirMensajes").innerHTML = this.responseText;//la informacion almacenada en el div de HTML con id="recibirMensajes" sera sobreescrita por el servidor
    }
  };
  xhttp.open("GET", "../../backend/control/cusuario.php?primerNombre="+ PrimerNombre+"&apellido="+apellido+"&email="+email+"&typeCard="+typeCard
  +"&cardHolder="+cardHolder+"&cardNumber="+cardNumber+"&cvv2="+cvv2+"&month="+month+"&year="+year+"&streetAddress="+streetAddress+"&city="+city
  +"&zip="+zip+"&country="+Country+"&phone="+phone+"&securityCode="+securityCode, true);//Preparacion de la peticion a la carpeta de control, tambien se le envia la variable mensaje, previamente almacenada
  xhttp.send();//Envio de la peticion
}
