document.getElementById('btn_form').onclick = (function(){
    localStorage.setItem('modulo', [document.getElementById('code_modulo').value, document.getElementById('nombre_modulo').value]);
});

// ==================================================API LOCAL STORAGE PROFESSOR.HTML==========================================================//