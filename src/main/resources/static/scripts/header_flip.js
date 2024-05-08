let lastScrollTop = 0;
const header = document.getElementsByClassName("header");
const scrollThreshold = 30; // Установите порог скролла

window.addEventListener("scroll", function() {
    let currentScroll = window.pageYOffset || document.documentElement.scrollTop;
    let scrollDifference = Math.abs(currentScroll - lastScrollTop);

    if (currentScroll > lastScrollTop && currentScroll > scrollThreshold && scrollDifference > 20) {
        // Скроллируем вниз, и разница скролла больше 20 пикселей
        header[0].classList.add('hidden');
    } else if (currentScroll < lastScrollTop && scrollDifference > 20) {
        // Скроллируем вверх, и разница скролла больше 20 пикселей
        header[0].classList.remove('hidden');
    }
    lastScrollTop = currentScroll <= 0 ? 0 : currentScroll;
}, false);