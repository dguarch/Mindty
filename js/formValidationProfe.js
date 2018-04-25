
/*   var elem = null;

const elementosEspera = () => {
    elem = document.querySelector('#code_modulo');
    elem.onblur = validarCampo;
};

const validarCampo = () => {
    let _valid = true;
    let _formValues = {};
    $('form .error').remove();
    $('#code_modulo').each(function () {
        let validezNombre = this.validity;
        console.log(validezNombre);
        if (validezNombre.patternMismatch) {
            $('#code_modulo').after('<div class="error"> Código inválido.</div>')
        }
        if(validezNombre.valueMissing){
            $('#code_modulo').after('<div class="error">Código inválido.</div>');
        }
        _formValues[this.name] = this.value
     })
}

elementosEspera();   *///


document.getElementById('btn_form').addEventListener('click', function (event) {
    event.preventDefault();


    let form_code = document.getElementById('code_modulo');
    let name_modulo = document.getElementById('nombre_modulo');

    if (!form_code.checkValidity() && !name_modulo.checkValidity()) {

        document.getElementById("error").innerHTML = 'datos incorrectos';
        document.getElementById('ok').innerHTML = '';
        document.getElementById("error1").innerHTML = 'datos incorrectos';
        document.getElementById('ok1').innerHTML = '';
    } else{
        document.getElementById('ok1').innerHTML = '<img id="check" src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
        document.getElementById("error1").innerHTML = '';
        document.getElementById('ok').innerHTML = '<img id="check" src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">';
        document.getElementById("error").innerHTML = '';
    }

});  

    //            <img src="./images/users/Custom-Icon-Design-Pretty-Office-8-Accept.ico">                 //



    // ==================================================!!!FORM VALIDATION PROFESSOR!!!!==========================================================================================














