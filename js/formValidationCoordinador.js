let validar = (element) => {
    let _valid = true;
    let _formValues = {};

    if (element == document.querySelector("#codigoCurso")) {
        $('form #codigoErrors').remove();
        $('#codigoCurso').each(function () {
            let validezNombre = this.validity;
            if (validezNombre.patternMismatch || validezNombre.valueMissing) {
                $('#codigoCurso').after('<div id="codigoErrors" class="errors"><i class="far fa-times-circle"></i> Código curso inválido.</div>');
                _valid = false;
            }
            _formValues[this.id] = this.value;
        });
    }

    if (element == document.querySelector("#nombreCurso")) {
        $('form #nombreErrors').remove();
        $('#nombreCurso').each(function () {
            let validezNombre = this.validity;
            if (validezNombre.patternMismatch || validezNombre.valueMissing) {
                $('#nombreCurso').after('<div id="nombreErrors" class="errors"><i class="far fa-times-circle"></i> Nombre curso inválido.</div>');
                _valid = false;
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
                _valid = false;
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
                _valid = false;
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
                _valid = false;
            }
            _valid[this.id] = this.checkValidity();
            _formValues[this.id] = this.value;
        });
    }

    // console.log(_valid);
    // console.log(_formValues);
    return { valid: _valid, values: _formValues };
}

document.querySelector("#codigoCurso").addEventListener("blur", function () {
    validar(this);
}, true);

document.querySelector("#nombreCurso").addEventListener("blur", function () {
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

console.log(validar());