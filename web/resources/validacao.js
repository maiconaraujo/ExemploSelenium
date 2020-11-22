$(document).ready(function () {
    $("#formCliente").validate({
        rules: {
            nome: {
                required: true,
                minlength: 5
            },
            cpf: {
                required: true,
                minlength: 11,
                maxlength:11
            },
            email: {
                required: true
            },
            sexo: {
                required: true
            }
        },
        messages: {
            nome: {
                required: "Por favor, informe seu nome",
                minlength: "O nome deve ter pelo menos 5 caracteres"
            },
            cpf: {
                required: "Por favor, informe seu cpf",
                minlength: "O cpf deve ter 11 caracteres",
                maxlength: "O cpf deve ter 11 caracteres"
            },
            email: {
                required: "É necessário informar um email",
                email: "Informe um email válido"
            },
            sexo: {
                required: "Informe o sexo"
            }
        }
    });

});
