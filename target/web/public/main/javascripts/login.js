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

function login() {
    let email = inputEmail.value;
    let password = inputPassword.value;

    if (email !== "" && password !== "") {
        loading();

        let credentials = {
            "email": email,
            "password": password
        }

        $.ajax({
            type: "POST",
            url: "/register",
            dataType: 'json',
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(credentials),
            error: function (e) {
                if (e.status === 403) {
                    // window.location.reload();
                    console.log("Status was 403: Reloading...");
                }
            }
        })
    }
}


