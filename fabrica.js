var temperaturaA=prompt("ingresa la temperatura");
var HA=prompt("ingresa la humedad ambiental");
var NT=prompt("ingresa el numero de trabjadores");
var NLT=prompt("ingresa el nivel de liquido en los tanques");

var TM=(HA % 2);
var LM=90;
var TME=90;
var TMM=30;


if( HA > TM)
    alert("CUIDADO, HUMEDAD AMBIENTAL ARRIBA DE 50%");
else
    alert("Humedad ambiental: Estable ");
if (temperaturaA > TME)
    alert("CUIDADO, TEMPERATURA AMBIENTE ARRIBA DE 90%");
else
alert("temperatura: Estable ");
      if (NT > 100)
      alert("CUIDADO, LIMITE DE PERSONAS SUPERADO");
      else
      alert("Capacidad de personas: Estable ");
      if (NLT > LM)
      alert("CUIDADO, LIMITE DE LIQUIDO SUPERADO");
      else
      alert("Capacidad de liquido: Estable ");
    

      function ejecuta() {

        /*document.querySelector("#parrafo1 p:last-child").onclick=saludo;*/
    
        var elementos=document.querySelectorAll ("#principal p, span")
        for (var i=0; i<elementos.length; i++) {
        
        elementos[i].onclick =saludo;
    }
    }
    
    function saludo() {
    alert("hola, que hay de nuevo?");
    }
    
    window.onload=ejecuta;
    