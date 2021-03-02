const menuBtn = document.querySelector('.burger');
const menu = document.querySelector('.menu');
const menuItems = document.querySelectorAll('.menu ul li a p');

let menuOpen = false;



menuBtn.addEventListener('click', () => {
    if (!menuOpen) {
        menuBtn.classList.add('open');
        menu.classList.add('menu-open');

        menuItems.forEach(item => {
            item.classList.add('menu-open__text');
        });

        localStorage.setItem('isMenuOpen', "true");
        menuOpen = true;
    } else {
        menuBtn.classList.remove('open');
        menu.classList.remove('menu-open');

        menuItems.forEach(item => {
            item.classList.remove('menu-open__text');
        });

        localStorage.setItem('isMenuOpen', "false");
        menuOpen = false;
    }
});
