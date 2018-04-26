let validar = () => {
    let _valid = true;
    let _formValues = {};

    $('form .errors').remove();

    $('#codigoCurso').each(function () {
        let validezNombre = this.validity;
        if (validezNombre.patternMismatch || validezNombre.valueMissing) {
            $('#codigoCurso').after('<div class="errors"><i class="far fa-times-circle"></i> Código curso inválido.</div>');
            _valid = false;
        }
        _formValues[this.id] = this.value;
    });

    $('#nombreCurso').each(function () {
        let validezCurso = this.validity;
        if (validezCurso.patternMismatch || validezCurso.valueMissing) {
            $('#nombreCurso').after('<div class="errors"><i class="far fa-times-circle"></i> Nombre curso inválido.</div>');
            _valid = false;
        }
        _formValues[this.id] = this.value;
    });

    $('#profes').each(function () {
        if (this.value == 0) {
            $('#profes').after('<div class="errors"><i class="far fa-times-circle"></i> No has seleccionado a ningún formador.</div>');
            _valid = false;
        }
        _formValues[this.id] = this.value;
    });

    $('#modulos').each(function () {
        if (this.value < 1 || this.value > 10) {
            $('#modulos').after('<div class="errors"><i class="far fa-times-circle"></i> Nº de módulos inválido.</div>');
            _valid = false;
        }
        _valid[this.id] = this.checkValidity();
        _formValues[this.id] = this.value;
    });

    $('#horas').each(function () {
        if (this.value < 20 || this.value > 200) {
            $('#horas').after('<div class="errors"><i class="far fa-times-circle"></i> Nº de horas inválidas.</div>');
            _valid = false;
        }
        _valid[this.id] = this.checkValidity();
        _formValues[this.id] = this.value;
    });
    
    return { valid: _valid, values: _formValues };
}

$('#enviar').click(function (evnt) {
    evnt.preventDefault();
    let formValido = validar();

    if(formValido.valid){
        console.log(formValido);
        console.log('Muy bien campeón');
    } else {console.log('Fatal total!')}
});

$('#lupa').click(function (evnt) {
    evnt.preventDefault();
});