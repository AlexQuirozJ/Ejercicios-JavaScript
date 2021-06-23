let btnFarenheit = document.getElementById('farenheit');
let btnKelvin = document.getElementById('kelvin');
let temperatura = document.getElementById('temperatura');
let resultado = document.getElementById('resultado');
let btnCelsius= document.getElementById('celsius');

btnFarenheit.addEventListener('click', event => {
    let far= temperatura.value * 9;
    let far2=far / 5 + 32;
    resultado.textContent = `El resultado en Fahrenheit es: ${far2}ºF`;
    })

    btnKelvin.addEventListener('click', event => {
        let kel= parseInt(temperatura.value ) + 273.15;
        resultado.textContent = `El resultado en Fahrenheit es: ${kel}ºF`;
        })

    btnCelsius.addEventListener('click', event => {
        let celsi= parseInt(temperatura.value ) + 273.15;
    resultado.textContent=  `El resultado en Fahrenheit es: ${celsi}ºF`;
    })

