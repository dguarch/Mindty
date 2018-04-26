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

const enviarCurso = (dataSend) => {
    $.ajax({
        //url: 'http://www.mocky.io/v2/5ad782d73000006900e584a344', // URL WRONG
        //url: 'http://www.mocky.io/v2/5ad78aa33000004b00e584d0', // URL FALSE
        url: 'http://www.mocky.io/v2/5ad782d73000006900e584a3', // URL TRUE
        method: 'POST',
        data: dataSend
    })
        .done(function (respuesta) {
            // Cuando hay exito
            if (respuesta.result) {
                $('#mensajes').html(`<div class="alert alert-success col-6" role="alert">
            Los datos se han envíado correctamente!!!!!!
          </div>`);
                $('#formCurso').trigger("reset");
            } else {
                $('#mensajes').html(`<div class="alert alert-danger" role="alert">
        No lo he podido guardar en el servidor, en un ratito lo intentaré de nuevo.
      </div>`)
            };
        })
        .fail(function (err) {
            // Cuando hay error
            $('#mensajes').html(`<div class="alert alert-danger" role="alert">
        No lo he podido guardar en el servidor, en un ratito lo intentaré de nuevo.
      </div>`);
        });
};

$('#enviar').click(function (evnt) {
    evnt.preventDefault();
    let formValido = validar();
    localStorage.setItem('infoCurso', JSON.stringify(formValido.values,' '));
    if (formValido.valid) {
        enviarCurso(formValido);
    }
});

$('#lupa').click(function (evnt) {
    evnt.preventDefault();
});