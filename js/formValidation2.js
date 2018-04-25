const elementosEspera = () => {
    document.querySelector("#codigo_curso").onblur = validarCampo;
};

const validarCampo = () => {
    let _valid = true;
    let _formValues = {};
    $('form .error').remove();
    $('#codigo_curso').each(function () {
        let validezNombre = this.validity;
        console.log(validezNombre);
        if (validezNombre.patternMismatch) {
            $('#codigo_curso').after('<div class="error"><i class="far fa-times-circle"></i> Código inválido.</div>');
        }
        if (validezNombre.valueMissing) {
            $('#codigo_curso').after('<div class="error"><i class="far fa-times-circle"></i> Código inválido.</div>');
        }
        _formValues[this.name] = this.value;
    });
}

elementosEspera();

$('#enviar').click(function (evnt) {
    evnt.preventDefault();
    console.log('Hello');
});
