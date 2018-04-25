let validar = (element) => {
    
    if (element == document.querySelector("#codigo_curso")) {
        $('form #codigo_error').remove();
        $('#codigo_curso').each(function () {
            let validezNombre = this.validity;
            if (validezNombre.patternMismatch || validezNombre.valueMissing) {
                $('#codigo_curso').after('<div id="codigo_error" class="error"><i class="far fa-times-circle"></i> Código curso inválido.</div>');
            }
           // _formValues[this.name] = this.value;
        });
    }

    if (element == document.querySelector("#nombre_curso")) {
        $('form #nombre_error').remove();
        $('#nombre_curso').each(function () {
            let validezNombre = this.validity;
            if (validezNombre.patternMismatch || validezNombre.valueMissing) {
                $('#nombre_curso').after('<div id="nombre_error" class="error"><i class="far fa-times-circle"></i> Nombre curso inválido.</div>');
            }
           // _formValues[this.name] = this.value;
        });
    }
    if (element == document.querySelector("#profes")) {
        console.log(element.value);
        $('form #profes_error').remove();
        $('#profes').each(function () {
            let validezNombre = this.validity;
            if (element.value==0) {
                $('#profes').after('<div id="profes_error" class="error"><i class="far fa-times-circle"></i> No has seleccionado a ningún formador.</div>');
            }
           // _formValues[this.name] = this.value;
        });
    }
}

document.querySelector("#codigo_curso").addEventListener("blur", function () {
    validar(this);
}, true);

document.querySelector("#nombre_curso").addEventListener("blur", function () {
    validar(this);
}, true);

document.querySelector("#profes").addEventListener("blur", function () {
    validar(this);
}, true);


$('#enviar').click(function (evnt) {
    evnt.preventDefault();
    console.log('Hello');
});