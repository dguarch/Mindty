let validar = (element) => {
    let _valid = true;
    let _formValues = {};

    if (element == document.querySelector("#codigo_curso")) {
        $('form #codigo_errors').remove();
        $('#codigo_curso').each(function () {
            let validezNombre = this.validity;
            if (validezNombre.patternMismatch || validezNombre.valueMissing) {
                $('#codigo_curso').after('<div id="codigo_errors" class="errors"><i class="far fa-times-circle"></i> Código curso inválido.</div>');
            }
            _formValues[this.id] = this.value;
        });
    }

    if (element == document.querySelector("#nombre_curso")) {
        $('form #nombre_errors').remove();
        $('#nombre_curso').each(function () {
            let validezNombre = this.validity;
            if (validezNombre.patternMismatch || validezNombre.valueMissing) {
                $('#nombre_curso').after('<div id="nombre_errors" class="errors"><i class="far fa-times-circle"></i> Nombre curso inválido.</div>');
            }
            _formValues[this.id] = this.value;
        });
    }
    
    if (element == document.querySelector("#profes")) {
        $('form #profes_errors').remove();
        $('#profes').each(function () {
            let validezNombre = this.validity;
            if (element.value == 0) {
                $('#profes').after('<div id="profes_errors" class="errors"><i class="far fa-times-circle"></i> No has seleccionado a ningún formador.</div>');
            }
            _formValues[this.id] = this.value;
        });
    }

    if (element == document.querySelector("#modulos")) {
        $('form #modulos_errors').remove();
        $('#modulos').each(function () {
            let validezNombre = this.validity;
            if (element.value < 1 || element.value > 10) {
                $('#modulos').after('<div id="modulos_errors" class="errors"><i class="far fa-times-circle"></i> Nº de módulos inválido.</div>');
            }
            _valid[this.id] = this.checkValidity();
            _formValues[this.id] = this.value;
        });
    }

    if (element == document.querySelector("#horas")) {
        $('form #horas_errors').remove();
        $('#horas').each(function () {
            let validezNombre = this.validity;
            if (element.value < 20 || element.value > 200) {
                $('#horas').after('<div id="horas_errors" class="errors"><i class="far fa-times-circle"></i> Nº de horas inválidas.</div>');
            }
            _valid[this.id] = this.checkValidity();
            _formValues[this.id] = this.value;
        });
    }

    console.log(_valid);
    console.log(_formValues);
    return { valid: _valid, values: _formValues };
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
});

$('#lupa').click(function (evnt) {
    evnt.preventDefault();
});