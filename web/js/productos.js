document.getElementById('elegirProducto').addEventListener('change', function (event) {
    const formularioPelicula = document.querySelector('.formularioPelicula');
    const formularioVideojuego = document.querySelector('.formularioVideojuego');
    formularioPelicula.style.display = "none";
    formularioVideojuego.style.display = "none";
    if (event.target.value == 'pelicula') {
        formularioPelicula.style.display = "flex";
        formularioVideojuego.style.display = "none";
    } else if (event.target.value == 'videojuego') {
        formularioVideojuego.style.display = "flex";
        formularioPelicula.style.display = "none";
    }
});

function verificarDatos() {
    const formularioActivo = document.querySelector('#elegirProducto').value;
    const campos = document.querySelectorAll("[data-grupo=" + formularioActivo + "]");
    const idCampoMostrado = (formularioActivo === 'pelicula') ? '#valorSemanalp' : '#valorSemanalj';
    const valorNumerico = document.querySelector(idCampoMostrado).value;
    if (valorNumerico <= 0) {
        alert("El valor del alquiler debe ser mayor a 0");
        return false;
    }
    for (let campo of campos) {
        if (campo.value.trim() == "") {
            alert("El campo señalado no debe estar vacío");
            campo.style.borderBottom = "1px solid red";
            return false;
        }
    }
    return true;
}