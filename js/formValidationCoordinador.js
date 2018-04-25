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
        $('form #profes_error').remove();
        $('#profes').each(function () {
            let validezNombre = this.validity;
            if (element.value == 0) {
                $('#profes').after('<div id="profes_error" class="error"><i class="far fa-times-circle"></i> No has seleccionado a ningún formador.</div>');
            }
            // _formValues[this.name] = this.value;
        });
    }
    if (element == document.querySelector("#modulos")) {
        $('form #modulos_error').remove();
        $('#modulos').each(function () {
            let validezNombre = this.validity;
            if (element.value >= 0 || element.value < 20) {
                $('#modulos').after('<div id="modulos_error" class="error"><i class="far fa-times-circle"></i> No has seleccionado a ningún formador.</div>');
            }
            // _formValues[this.name] = this.value;
        });
    }
    if (element == document.querySelector("#modulos")) {
        $('form #modulos_error').remove();
        $('#modulos').each(function () {
            let validezNombre = this.validity;
            if (element.value < 1 || element.value > 10) {
                $('#modulos').after('<div id="modulos_error" class="error"><i class="far fa-times-circle"></i> Nº de módulos inválido.</div>');
            }
            // _formValues[this.name] = this.value;
        });
    }
    if (element == document.querySelector("#horas")) {
        $('form #horas_error').remove();
        $('#horas').each(function () {
            let validezNombre = this.validity;
            if (element.value < 20 || element.value > 200) {
                $('#horas').after('<div id="horas_error" class="error"><i class="far fa-times-circle"></i> Nº de horas inválidas.</div>');
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

document.querySelector("#modulos").addEventListener("blur", function () {
    validar(this);
}, true);

document.querySelector("#horas").addEventListener("blur", function () {
    validar(this);
}, true);


$('#enviar').click(function (evnt) {
    evnt.preventDefault();
    console.log('Hello');
});

$('#lupa').click(function (evnt) {
    evnt.preventDefault();
    console.log('Hello');
});