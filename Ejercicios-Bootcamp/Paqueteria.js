var payaso=prompt("ingresa los payasos");
var muneca=prompt("ingresa las muñecas ");


PQ=( parseInt(payaso)+ parseInt(muneca));
PQ2=(PQ/2);
var PesoTotal=1000;
var sumap=payaso*112;
var sumaM=muneca*72;
var PM=(sumaM+sumap);


if(PM> PesoTotal)
alert("el peso es mayo a 1kg, no es posible enviar");
else
alert("el peso es correcto, paquete enviado");
document.write("La Cantidad de paquetes enviados son : " + PQ2 + " " + " " + "y el peso es de:" + PM + " " + "KG");