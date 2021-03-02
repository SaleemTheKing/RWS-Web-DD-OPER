const checkbox = document.querySelector('#keep-credentials');
const spinner = document.querySelector('#spinner');
const inputEmail = document.querySelector('#input_email');
const inputPassword = document.querySelector('#input_password');

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

