Specification Heading
=====================


Baslangic
---
* "5" saniye kadar bekle
* Decline butonuna bas
* "3" saniye kadar bekle
* "com.m.qr:id/rvmp_home_inspiration_title" id'li element "Travel Inspiration" degerini iceriyor mu kontrol et
* "5" saniye kadar bekle

Book tabına gecis
---
* "com.m.qr:id/nav_menu_book" id'li elemente tıkla
* "5" saniye kadar bekle

One Way seyahat tipi secilir
---
* "//*[@content-desc='One-way']" xpath'li elemente tıkla
* "5" saniye kadar bekle

Kalkıs yeri secilir
---
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_origin_holder" id'li elemente tıkla
* "5" saniye kadar bekle
* "com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext" id'li elementi bul ve "Ankara" degerini yaz
* "5" saniye kadar bekle
* "//*[@text='ESB - Esenboga Airport']" xpath'li elemente tıkla

Varıs yeri secilir
---
* "com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext" id'li elemente tıkla
* "5" saniye kadar bekle
* "com.m.qr:id/rvmp_fragment_ond_selection_filter_edittext" id'li elementi bul ve "Dubai" degerini yaz
* "5" saniye kadar bekle
* "//*[@text='DXB - Dubai International Airport']" xpath'li elemente tıkla

Gidis tarihi secilir
---
* "com.m.qr:id/rvmp_fragment_rtow_flight_selection_departure_date_holder" id'li elemente tıkla
* "5" saniye kadar bekle
* "//*[@text='17']" xpath'li elemente tıkla

Confirm butonuna basılır
---
* "com.m.qr:id/fragment_calendar_confirm_button" id'li elemente tıkla
* "5" saniye kadar bekle

Ucus arama
---
* "com.m.qr:id/rvmp_booking_search_flights_button" id'li elemente tıkla
* "5" saniye kadar bekle

Ucus arama ekranın geldiği kontrol edilir
---
* "com.m.qr:id/booking_activity_conversational_messagecom.m.qr:id/booking_activity_conversational_message" id'li element "Select Your Departure" degerini iceriyor mu kontrol et

Rastgele uçuş seçimi
---
* Elementler "//*[@resource-id='com.m.qr:id/rvmp_item_search_result_root_view']" arasından rastgele bir tanesi seç ve tıkla
* "5" saniye kadar bekle










