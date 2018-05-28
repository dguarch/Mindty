/*     boton enviar validar */
//$('#bton').click(function (evnt) {
//    evnt.preventDefault();
//    let form_data = ValFormulario();
//    if (form_data.vall) {
//        enviarDatos(form_data.data)
//    }
//});

/*     función  validar */

let ValFormulario = function () {
    $('form .estamal').remove();
    let datos_envio = {};
    let formulario_correcto = true;
    $('form div input').each(function () {
        if (this.checkValidity()) {
            datos_envio[this.name] = this.value;
        } else {
            $(this).before('<div class="estamal">¡¡Error!! campo introducido incorrecto</div>');
            formulario_correcto = false;
        }
    })
    return { vall: formulario_correcto, data: datos_envio };
}


/*     función  enviar datos */

let enviarDatos = function (datos_envio) {

    $.ajax({
        url: ' http://www.mocky.io/v2/5aec64fb3200004e00fa48f4',  /* { "result": "true" }  "true" dice el servidor*/
        /*  url: 'http://www.mocky.io/v2/5aec652d3200006000fa48f6', */  // { "result": "false" }  //* "false" dice el servidor*/
        method: 'POST',
        data: datos_envio
    })
        .done(function (responde_data) {
            if (responde_data.result) {
                location.href = './login';
            } else {
                console.log('Error');
                $('#mesajes').html('Usuario y/o Contraseña incorrectas');
            }
        })
        .fail(function (err) {

            $('#errServidor').text('habido un error de conexión,  inténtalo en unos minutos.');

            $('#btonErr').html('<button  id="btnR" type="submit">refrescar pag</button>');


            $('#errServidor').show();
            $('.pinta').hide();
            $('#bton').hide();
            $('#prue').hide();
            $('#prue2').hide();

        });
}


$(document).ready(function (evnt) {

    $(".pinta").mouseover(function () {

        /* $(".pinta").css("background-color", "white"); */
        $('#prue').text('La primera letra en mayúscula');
        $('#prue2').text('La primera letra en mayúscula');
        $('#prue').show();
        $('#prue2').show();

        $(".pinta").mouseout(function () {
            /*   $(".pinta").css("background-color", "lightgray"); */
            $(".pinta").keydown(function () {
                $('#prue').hide();
                $('#prue2').hide();

            })
        })

    });

    $('#btnR').click(function (env) {

        location.href = '/login.jsp';
        /*  evn= window.reload() */
    });
});




/* 
let valida_form = function () {

    let _formValue = {};
    let _invalido = {}
    let _VVV = true;

    $('form .error').remove();

    $('input[name=usuario]').each(function () {

        let exp = /^([A-Z][a-z]{1}[a-zñáéíóú]+[\s]*)+$/;

        if (!exp.test(this.value)) $('input[name=usuario]').before('<div class="error">incorrecto!</div>') 
        _VVV = false; 
        ;

        _formValue[this.name] = this.value;
    });


    $('input[name=contaseña]').each(function () {

        let exp = /^([A-Z]{1}[a-zñáéíóú]+[\s]*)+$/;

        if (!exp.test(this.value)) $('input[name=contaseña]').before('<div class="error">incorrecto!</div>');

        _formValue[this.name] = this.value;
    });
    console.log(_formValue);

    let enviarDatos = function (data_to_send) {
        console.log('Enviando.....', data_to_send)

        $.ajax({
            url: 'http://www.mocky.io/v2/5ad78b273000006600e584d4',
            method: 'POST',
            data: data_to_send
        })
            .done(function (data) {
                //location.href='/';
                //cuando hay exito
                if (data.result) {
                    location.href = './index.html';
                } else {
                    $('#enviado').html(`usuario o contraseña incorecta`);
                }
            })
            .fail(function (err) {
                //cuando hay error
                $('#mensajes').html(`oooooops.... ha habido un error....:-p`);
            })


    }
};



$('#bton').click(function (evnt) {
    evnt.preventDefault();
    let form_data = valida_form ();

    if (form_data.valid) {
        enviarDatos(form_data.data);
    }
});
 */
/* let validez = function () {
    let data_to_send = {};
    let form_valid = true;
    $('form .error').remove();
    $('form div input').each(function () {

        if (this.checkValidity()) { 
            data_to_send[this.name] = this.value;
        } else {
            $(this).before('<div class="error">Error!!</div>')
            form_valid = false;
        }
    })
    console.log(data_to_send)
    return { valid: form_valid, data: data_to_send };
}
let enviarDatos = function (data_to_send) {
    console.log('Enviando.....', data_to_send)

    $.ajax({
        url: 'http://www.mocky.io/v2/5ae0c3733200008800510d22',
        method: 'POST',
        data: data_to_send
    })
        .done(function (data) {
            //location.href='/';
            console.log(data);
            if (data.result) {
                location.href = '/';
            } else {
                $('#enviado').html(`email o contraseña incorecta`);
            }
        })
        .fail(function (err) {
            //cuando hay error
            $('#mensajes').html(`oooooops.... ha habido un error....:-p`);
        })


}

$('#bton').click(function (evnt) {
    evnt.preventDefault();
    let form_data = validez();

    if (form_data.valid) {
        enviarDatos(form_data.data);
    }

}); */



/*     estilos y venta info de campos para introdcir  */


/* $(document).ready(function (evnt) {

    $(".pinta").mouseover(function () {

        $(".pinta").css("background-color", "white");
        $('#prue').text('el campo requiere XXXXX');
        $('#prue2').text('el campo requiere XXXXX');
        $('#prue').show();
        $('#prue2').show();

        $(".pinta").mouseout(function () {
            $(".pinta").css("background-color", "lightgray");
            $(".pinta").keydown(function () {
                $('#prue').hide();
                $('#prue2').hide();

            })
        })

    });
}); */
/* break; */

/* $(document).ready(function (evnt) {

    if ($(".pinta").mouseover) {
        $(".pinta").css("background-color", "white");
        $('#prue').html('<div>introduzca xxxx</div>');
        $('#prue2').html('<div>introduzca xxxx</div>');

    } else {
        $(".pinta").css("background-color", "lightgray");
        $('#prue').remove();
        $('#prue2').remove();

    }
}); */





/* setTimeout(function () {
    limpiar();

}, 1000); */
