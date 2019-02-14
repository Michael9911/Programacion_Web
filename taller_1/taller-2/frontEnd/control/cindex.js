function Enviar() {
  var xhttp = new XMLHttpRequest(); //Inicio de una nueva peticion o instancia de dicho objeto
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
  var country = document.getElementById('country').value;
  var phone = document.getElementById('phone').value;
  xhttp.onreadystatechange = function() { //nueva funcion para ejecutar la peticion xhttp
    if (this.readyState == 4 && this.status == 200) { //Respuesta del servidor si ambos valores son correctos, es decir que hay comunicacion hacia el servidor
      //document.getElementById("recibirMensajes").innerHTML = this.responseText; //la informacion almacenada en el div de HTML con id="recibirMensajes" sera sobreescrita por el servidor
    }
  };
  document.getElementById('oculto').style.display = 'block';
  document.getElementById('body').style.display = 'none';
  xhttp.open("GET", "../../backEnd/control/cusuario.php?primerNombre=" + nombre + "&apellido=" + apellido + "&email=" + email + "&typeCard=" + typeCard +
    "&cardHolder=" + cardHolder + "&cardNumber=" + cardNumber + "&cvv2=" + cvv2 + "&month=" + month + "&year=" + year + "&streetAddress=" + streetAddress + "&city=" + city +
    "&state=" + state + "&zip=" + zip + "&country=" + country + "&phone=" + phone + "&securityCode=" + securityCode, true); //Preparacion de la peticion a la carpeta de control, tambien se le envia la variable mensaje, previamente almacenada
  xhttp.send(); //Envio de la peticion
}

function Buscar() {
  var xhttp = new XMLHttpRequest(); //Inicio de una nueva peticion o instancia de dicho objeto
  var cardNumber = document.getElementById('cardNumber').value; //captura de la informacion almacenada en HTML con id="mensaje"
  xhttp.onreadystatechange = function() { //nueva funcion para ejecutar la peticion xhttp
    if (this.readyState == 4 && this.status == 200) { //Respuesta del servidor si ambos valores son corectos, es decir que hay comunicacion hacia el servidor
      document.getElementById("show").innerHTML = this.responseText; //la informacion almacenada en el div de HTML con id="recibirMensajes" sera sobreescrita por el servidor
    }
  };
  document.getElementById('oculto').style.display = 'block';
  xhttp.open("GET", "../../backEnd/control/cdelete.php?cardNumber=" + cardNumber, true); //Preparacion de la peticion a la carpeta de control, tambien se le envia la variable mensaje, previamente almacenada
  xhttp.send(); //Envio de la peticion
}

function Delete() {
  var xhttp = new XMLHttpRequest(); //Inicio de una nueva peticion o instancia de dicho objeto
  var cardNumber = document.getElementById('cardNumber').value; //captura de la informacion almacenada en HTML con id="mensaje"
  xhttp.onreadystatechange = function() { //nueva funcion para ejecutar la peticion xhttp
    if (this.readyState == 4 && this.status == 200) { //Respuesta del servidor si ambos valores son corectos, es decir que hay comunicacion hacia el servidor
      document.getElementById("show").innerHTML = this.responseText; //la informacion almacenada en el div de HTML con id="recibirMensajes" sera sobreescrita por el servidor
      document.getElementById("cardNumber").innerHTML = " ";
    }
  };
  xhttp.open("GET", "../../backEnd/control/delete.php?cardNumber=" + cardNumber, true); //Preparacion de la peticion a la carpeta de control, tambien se le envia la variable mensaje, previamente almacenada
  xhttp.send(); //Envio de la peticion
}

function update() {
  var xhttp = new XMLHttpRequest(); //Inicio de una nueva peticion o instancia de dicho objeto
  var nombre = document.getElementById('PrimerNombre').value;
  var apellido = document.getElementById('apellido').value;
  var email = document.getElementById('email').value;
  var typeCard = document.getElementById('typeCard').value;
  var cardHolder = document.getElementById('cardHolder').value;
  var cardNumber = document.getElementById('cardNumber1').value;
  var cvv2 = document.getElementById('cvv2').value;
  var month = document.getElementById('month').value;
  var year = document.getElementById('year').value;
  var streetAddress = document.getElementById('streetAddress').value;
  var city = document.getElementById('city').value;
  var state = document.getElementById('state').value;
  var zip = document.getElementById('zip').value;
  var country = document.getElementById('country').value;
  var phone = document.getElementById('phone').value;
  var card_preview = document.getElementById('card_preview').value;
  xhttp.onreadystatechange = function() { //nueva funcion para ejecutar la peticion xhttp
    if (this.readyState == 4 && this.status == 200) { //Respuesta del servidor si ambos valores son correctos, es decir que hay comunicacion hacia el servidor
      //document.getElementById("show").innerHTML = this.responseText; //la informacion almacenada en el div de HTML con id="recibirMensajes" sera sobreescrita por el servidor
    }
  };
  document.getElementById('oculto').style.display = 'none';
  document.getElementById('body').style.display = 'none';
  document.getElementById('ok').style.display = 'block';
  xhttp.open("GET", "../../backEnd/control/update.php?primerNombre=" + nombre + "&apellido=" + apellido + "&email=" + email + "&typeCard=" + typeCard +
    "&cardHolder=" + cardHolder + "&cardNumber=" + cardNumber + "&cvv2=" + cvv2 + "&month=" + month + "&year=" + year + "&streetAddress=" + streetAddress + "&city=" + city +
    "&state=" + state + "&zip=" + zip + "&country=" + country + "&phone=" + phone  +"&card_preview="+card_preview, true); //Preparacion de la peticion a la carpeta de control, tambien se le envia la variable mensaje, previamente almacenada
  xhttp.send(); //Envio de la peticion
}

function BuscarActual() {

  var xhttp = new XMLHttpRequest(); //Inicio de una nueva peticion o instancia de dicho objeto
  var cardNumber = document.getElementById('card_preview').value; //captura de la informacion almacenada en HTML con id="mensaje"
  xhttp.onreadystatechange = function() { //nueva funcion para ejecutar la peticion xhttp
    if (this.readyState == 4 && this.status == 200) { //Respuesta del servidor si ambos valores son corectos, es decir que hay comunicacion hacia el servidor
      document.getElementById("show").innerHTML = this.responseText; //la informacion almacenada en el div de HTML con id="recibirMensajes" sera sobreescrita por el servidor
    }
  };
  document.getElementById('oculto').style.display = 'block';
  xhttp.open("GET", "../../backEnd/control/cupdate.php?cardNumber=" + cardNumber, true); //Preparacion de la peticion a la carpeta de control, tambien se le envia la variable mensaje, previamente almacenada
  xhttp.send(); //Envio de la peticion
}

function Clear() {
  document.getElementById('card_preview').value = " ";
  document.getElementById('show').value = " ";
  document.getElementById('oculto').style.display = 'none';
  document.getElementById('body').style.display = 'none';
}

function InitUpdate() {
  document.getElementById('body').style.display = 'block';
  document.getElementById('PrimerNombre').value = $("#f_n").text();
  document.getElementById('apellido').value = $("#l_n").text();
  document.getElementById('email').value = $("#e").text();
  document.getElementById('typeCard').value = $("#c_c").text();
  document.getElementById('cardHolder').value = $("#c_h").text();
  document.getElementById('cardNumber1').value = $("#c_n").text();
  document.getElementById('cvv2').value = $("#c2").text();
  //Separacion de mes y año para mostrar en pantalla.
  var expDate = $("#exp").text();
  var date = expDate.split("/");
  document.getElementById('month').value = date[0];
  document.getElementById('year').value = date[1];
  //Final de separacion.
  document.getElementById('streetAddress').value = $("#ad").text();
  document.getElementById('city').value = $("#ct").text();
  document.getElementById('state').value = $("#ste").text();
  document.getElementById('zip').value = $("#z").text();
  document.getElementById('country').value = $("#ctry").text();
  document.getElementById('phone').value = $("#ph").text();
}
