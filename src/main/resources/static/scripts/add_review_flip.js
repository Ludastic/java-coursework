let lastScrollTop1 = 0;
const button = document.getElementsByClassName("floating-open-button");
// const scrollThreshold = 30; // Установите порог скролла

window.addEventListener("scroll", function() {
    let currentScroll = window.pageYOffset || document.documentElement.scrollTop;
    let scrollDifference = Math.abs(currentScroll - lastScrollTop1);

    if (currentScroll > lastScrollTop1 && currentScroll > scrollThreshold && scrollDifference > 20) {
        // Скроллируем вниз, и разница скролла больше 20 пикселей
        button[0].classList.add('hidden1');
    } else if (currentScroll < lastScrollTop1 && scrollDifference > 20) {
        // Скроллируем вверх, и разница скролла больше 20 пикселей
        button[0].classList.remove('hidden1');
    }
    lastScrollTop1 = currentScroll <= 0 ? 0 : currentScroll;
}, false);