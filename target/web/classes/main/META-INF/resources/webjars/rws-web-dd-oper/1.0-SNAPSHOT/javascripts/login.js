const checkbox = document.querySelector('#keep-credentials');
const spinner = document.querySelector('#spinner');
const inputEmail = document.querySelector('#input_email');
const inputPassword = document.querySelector('#input_password');

const errEmail = document.querySelector('#err_email_pattern');
const errCred = document.querySelector('#err_cred');

let keepCredentials = false;

keepCredentials = JSON.parse(localStorage.getItem('keepCred'));
checkbox.checked = keepCredentials;

function loading() {
    keepCredentials = checkbox.checked;

    if (!keepCredentials) {
        localStorage.setItem('keepCred', "false");
    } else {
        localStorage.setItem('keepCred', "true");
    }

    spinner.classList.add('is-active');
}

function login() {
    let email = inputEmail.value;
    let password = inputPassword.value;

    errEmail.setAttribute('hidden', 'true');
    errCred.setAttribute('hidden', 'true');

    if (email !== "" && password !== "") {

        if (email.includes('@') && email.includes('.')) {
            loading();

            let credentials = {
                "email": email,
                "password": password
            }

            $.ajax({
                type: "POST",
                url: "/login",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(credentials),
                error: function (e) {
                    if (e.status === 403) {
                        errCred.removeAttribute('hidden');
                        spinner.classList.remove('is-active');
                    } else {
                        window.location.reload();
                    }
                },
                success: () => {
                    localStorage.setItem('email', email);
                    window.location.href = "/start";
                }
            })
        } else {
            errEmail.removeAttribute('hidden');
        }
    }
}



