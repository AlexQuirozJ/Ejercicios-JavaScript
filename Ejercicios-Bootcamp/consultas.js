/*const animales= ['zorro','perro','tortuga','pez','ballena','gato','ratón','hurón','guacamaya','mapache',];
const computadoras= ['HP','Compaq', 'Dell','Asus','Lenovo','Apple','Intel','',];
const bootcampers= ['Ana','Sharon', 'Bernardino','Alex','Humberto','Luz','Rogelio',];

const list= document.querySelector('#lista')



let bAnimales=document.querySelector('#animales');
bAnimales.addEventListener('click', event=>{
    animales.forEach(function(animal){
    let item= document.createElement('li');
    item.textContent='${animal}';
    document.write(animal);
   
});
})

let ccomputadoras=document.querySelector('#computadoras');
ccomputadoras.addEventListener('click', event=>{
    computadoras.forEach(function(compu){
    let item= document.createElement('li');
    item.textContent='${compu}';
    document.write(compu);
});
})

let bbotcampers=document.querySelector('#bootcampers');
bbotcampers.addEventListener('click', event=>{
    bootcampers.forEach(function(boot){
    let item= document.createElement('li');
    item.textContent='${boot}';
    document.write(boot);
});
})*/

const animales= ['zorro','perro','tortuga','pez','ballena','gato','ratón','hurón','guacamaya','mapache',];
const computadoras= ['HP','Compaq', 'Dell','Asus','Lenovo','Apple','Intel'];
const bootcampers= ['Ana','Sharon', 'Bernardino','Alex','Humberto','Luz','Rogelio',];

const list= document.querySelector('#lista')



let bAnimales=document.querySelector('#animales');
bAnimales.addEventListener('click', event=>{
    animales.forEach(function(animal){
    let item= document.createElement('li');
    item.textContent=`${animal}`;
    list.appendChild(item);
});
})

let ccomputadoras=document.querySelector('#computadoras');
ccomputadoras.addEventListener('click', event=>{
    computadoras.forEach(function(compu){
    let item= document.createElement('li');
    item.textContent=`${compu}`;
    list.appendChild(item);
});
})

let bbotcampers=document.querySelector('#bootcampers');
bbotcampers.addEventListener('click', event=>{
    bootcampers.forEach(function(boot){
    let item= document.createElement('li');
    item.textContent=`${boot}`;
    list.appendChild(item);
});
})
    


