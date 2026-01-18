
    const slides = document.querySelectorAll(".slide");
    const paginationTabs = document.querySelectorAll(".pagination-tabs");
    let currentSlide = 0;

    function showSlide(index) {
      slides[currentSlide].classList.remove("active"); 
      slides[index].classList.add("active");
      paginationTabs[currentSlide].classList.remove('active');
    paginationTabs[index].classList.add("active");
      currentSlide = index;
    }

    function nextSlide() {
      const nextIndex = (currentSlide + 1) % slides.length;
      showSlide(nextIndex);
    }

    showSlide(currentSlide);

    const interval = setInterval(nextSlide, 5000);

