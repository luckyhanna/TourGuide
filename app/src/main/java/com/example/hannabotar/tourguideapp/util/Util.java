package com.example.hannabotar.tourguideapp.util;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Event;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.model.Restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Util {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private static final SimpleDateFormat SDF = new SimpleDateFormat("MMM dd, yyyy, h:mm a");

    public static List<Monument> getMonuments() {
        List<Monument> monumentList = new ArrayList<>();

        Monument monument = new Monument.Builder()
                .withName("National Village Museum")
                .withAddress("Kiseleff Road 28-30, Bucharest 011347, Romania")
                .withWebsite("http://muzeul-satului.ro/en/")
                .withPhone("+40 21 317 9103")
                .withEmail("contact@muzeul-satului.ro")
                .withDescription("Herăstrău lakeside, in the middle of the Romanian capital, " +
                        "the visitor everywhere have the joy of meeting a “village” really, monuments and artefacts sec. seventeenth century until the early century. XX; " +
                        "Building representative from important areas of ethnography regained a second life at the National Village Museum “Dimitrie Gusti”.\n" +
                        "\n" +
                        "The idea of an outdoor museum arrives in Romania since the second half of the nineteenth century. " +
                        "In 1867 Odobescu, eminent scholar, proposes presenting in Universal Exhibition in Paris in a special pavilion, " +
                        "some of folk architecture. Later, scientist Alexander Tzigara Samurcaş would envisage bringing Ethnographic Museum, National Art, " +
                        "Decorative Art and Industrial Art in Bucharest, " +
                        "founded by him in 1906 of “households authentic and complete in all regions most significant inhabited by Romanian” " +
                        "the project materialized in 1909 by exposing the museum of peasant houses in Gorj county.")
                .withPhotoId(R.drawable.village_museum_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("Herastrau Park")
                .withAddress("B-dul Aviatorilor, Bucharest, Romania")
                .withPhone("+40 786 042 404")
                .withWebsite("http://www.herastrauparc.ro/")
                .withDescription("Herăstrău Park (Romanian: Parcul Herăstrău) or King Michael I Park " +
                        "is a large park on the northern side of Bucharest, Romania, around Lake Herăstrău, one of the lakes formed by the Colentina River.")
                .withPhotoId(R.drawable.herastrau_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("Palace of Parliament")
                .withAddress("Izvor St., 2-4, Bucharest 050711, Romania")
                .withPhone("+40 733 558 102")
                .withWebsite("http://cic.cdep.ro/en")
                .withDescription("Starting from an old idea, " +
                        "the building of the Palace of Parliament was built under Nicolae Ceauşescu during a period with high economic hardship. " +
                        "The dictator’s tendency was, on the one hand, to focus all the main bodies of the state in one building and, on the other hand, " +
                        "Ceauşescu wanted a safe place to live under a seismic risk, that would hold up to even a nuclear attack.\n" +
                        "\nFrom an architectural point of view, the Parliament Palace is one of the most controversial buildings in Romania: " +
                        "Anca Petrescu identified it with the Buckingham Palace in London and the Versailles Palace in France, " +
                        "and the architects of the time with the „little Phenian”, with an eclectic style, loaded with contradictory elements.")
                .withPhotoId(R.drawable.parliament_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("Romanian Athenaeum")
                .withAddress("Str. Franklin 1, Bucharest, Romania")
                .withPhone("+40 21 315 6875")
                .withWebsite("https://www.fge.org.ro/")
                .withDescription("The Romanian Athenaeum is a concert hall in the center of Bucharest, Romania and a landmark of the Romanian capital city. " +
                        "Opened in 1888, the ornate, domed, circular building is the city's main concert hall " +
                        "and home of the \"George Enescu\" Philharmonic and of the George Enescu annual international music festival.\n" +
                        "The overall style is neoclassical, with some more romantic touches. In front of the building there is a small park and a statue of Romanian poet Mihai Eminescu.\n" +
                        "\n" +
                        "Inside, the ground floor hosts an ornate conference hall as large as the auditorium above; the auditorium seats 600 in the stalls and another 52 in loge seating.\n" +
                        "\n" +
                        "A 75-sqm long and 3-m wide fresco by Costin Petrescu decorates the inside of the circular wall of the concert hall. Painted using the al fresco technique, the piece depicts the most important moments of Romanian history, starting with the conquest of Dacia by Roman emperor Trajan and ending with the realization of Greater Romania in 1918.\n" +
                        "\n" +
                        "Recognized as a symbol of Romanian culture, the building has been inscribed in 2007 on the list of the Label of European Heritage sites.")
                .withPhotoId(R.drawable.atheneum_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("The Art Collections Museum")
                .withAddress("111, Calea Victoriei, Bucharest, Romania")
                .withPhone("+40 21 650 6132")
                .withWebsite("http://mnar.arts.ro/en/museum-of-art-collections")
                .withDescription("Inaugurated in 1978 as a Department of the National Museum of Art of Romania, " +
                        "the Art Collections Museum showcases artistic interests that prevailed in Romanian society from the early 20th century onward. " +
                        "Over 30 collections on permanent display incorporate a variety of art pieces and collectibles, " +
                        "ranging from Romanian and European fine and decorative arts to Oriental art. " +
                        "Donated over nearly a century by both collectors and artists, they bear witness to their owners’ taste and economic power, " +
                        "their leaning toward famous names or contemporary art, as well as to the artists’ particular interests, surroundings, and daily studio practice.\n" +
                        "\n" +
                        "Works by well-known Romanian painters such as Theodor Aman, Nicolae Grigorescu, Ioan Andreescu, Nicolae Tonitza, Gheorghe Petraşcu, " +
                        "Theodor Pallady, Lucian Grigorescu, Iosif Iser, Camil Ressu, Francisc Şirato, Alexandru Ciucurencu, " +
                        "Dimitrie Ghiaţă are exhibited alongside European and Japanese prints and drawings, " +
                        "French furniture, Oriental carpets, and folk icons from Transylvania.\n" +
                        "\n" +
                        "This unique museum is hosted by the former Romanit palace. The building, an example of modern Bucharest architecture, " +
                        "was recently restored and refurbished. Wherever possible, displays suggest the original layout and atmosphere of individual collections.")
                .withPhotoId(R.drawable.art_collections_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("Patriarchal Cathedral")
                .withAddress("Str Dealul Mitropoliei Piata Unirii, Bucharest, Romania")
                .withDescription("The Romanian Orthodox Patriarchal Cathedral (also known as the Metropolitan Church) " +
                        "is a functioning religious and civic landmark, on Dealul Mitropoliei, in Bucharest, Romania. " +
                        "It is located near the Palace of the Chamber of Deputies of the Patriarchate of the Romanian Orthodox Church. " +
                        "Since it is a working cathedral, it is the site of many religious holidays and " +
                        "observances that take place for those who follow the Orthodox Christian faith in Bucharest, " +
                        "including a Palm Sunday pilgrimage. The Orthodox Divine Liturgy at the cathedral is known for its a cappella choir, " +
                        "a common practice shared by all the Orthodox churches, in both their prayer services and liturgical rites. " +
                        "The Romanian Orthodox Patriarchal Cathedral is a designated Historical monument—Monument istoric of Romania.")
                .withPhotoId(R.drawable.cathedral_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("Triumph Arch")
                .withAddress("Piata Arcul de Triumf, Bucharest, Romania")
                .withDescription("The Triumphal Arch (Arcul de Triumf) of Bucharest, which is located on the Kiseleff Street, " +
                        "was declared a historical monument in 2004. It is one of the most notable landmarks of the capital and, " +
                        "next to the Parliament Palace, it can be deemed a symbol of Bucharest. " +
                        "The structure of the current Triumphal Arch dates back to 1922, " +
                        "whereas the present decorative elements were added only 16 years later, in 1938, " +
                        "the year when the monument, in its final form, was inaugurated.\n" +
                        "\n" +
                        "However, the history of the monument dates back to the mid 19th century. " +
                        "Until 1922, previous versions of the arch were hastily and repeatedly built in 1848, 1859, 1878, 1906 and 1918, " +
                        "in order to mark certain military and political achievements of Romania. " +
                        "Yet, given the perishable nature of the construction material (chiefly wood), these versions did not survive.\n" +
                        "\n" +
                        "The reinforced concrete structure was inaugurated in 1922, in order to celebrate the victory of Romania in World War One, " +
                        "and the event was attended by the most important political figures of the time, " +
                        "including foreign politicians from Europe, Japan and the USA. The bearing structure of the edifice survived in time, " +
                        "but the decorative elements (bas-reliefs chiefly) were made of plaster, and they decayed rapidly. " +
                        "This is why they were replaced with marble and stone elements, " +
                        "mainly allegorical sculptures realized by sundry artists of the time, " +
                        "under the supervision of Petre Antonescu, the same architect who designed the bearing structure of the 1922 arch.\n" +
                        "\n" +
                        "At present, the Triumphal Arch dominates the surroundings of the Kiseleff Street, " +
                        "marking the intersection of this thoroughfare with the Constantin Brezan Boulevard, " +
                        "the Alexandru Averescu Boulevard and with the Alexandru Constantinescu Boulevard. " +
                        "It is one of the emblematic monuments of the capital and a tourist sight just as important as the C.E.C. Palace, " +
                        "the Parliament Palace or the Romanian Athenaeum.")
                .withPhotoId(R.drawable.triumph_arch_r)
                .build();
        monumentList.add(monument);

        return monumentList;
    }

    public static List<Event> getEvents() {
        List<Event> eventList = new ArrayList<>();

        Event event = new Event.Builder()
                .withName("Bucharest Jazz Festival 2018")
                .withLocation("Bucharest, Romania")
                .withDate(getDate("02/07/2018 11:55"))
                .withDescription("Bucharest Jazz Festival returns in July with seven days of free live concerts and events for " +
                        "Bucharest-based jazz enthusiasts and tourists. Organized by the City Hall of Bucharest through ARCUB, " +
                        "the festival's sixth edition brings to Romania's capital, between July 3rd and 9th, 2017, " +
                        "renown names of the international jazz scene, young talents, journalists, theoreticians, musicians and jazz specialists " +
                        "for live concerts in George Enescu Square and special events at ARCUB.")
                .withPhotoId(R.drawable.bjf_r)
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName("Love Yard Sale")
                .withLocation("Copper's Pub, Bucuresti, Romania")
                .withDate(getDate("07/07/2018 11:00"))
                .withDescription("LOVE Yard Sale este târgul multor lucruri frumoase care merită încă o șansă să fie iubite, cumpărate și purtate cu drag.\n" +
                        "\n" +
                        "Va invităm la ediţia lunii IULIE în strada HRISTO BOTEV 25, în frumoasa curte de la Copper's Pub.\n" +
                        "\n" +
                        "În cele două zile de târg, organizate în aer liber, vă așteaptă o varietate de articole în stare foarte bună și bună," +
                        " multe din ele chiar noi. Ele sunt aduse spre vânzare din motive care de cele mai multe ori țin de o nepotrivire de stil sau de o măsură prea mică sau prea mare. " +
                        "Prețurile nu îți vor da bugetul peste cap, sunt foarte prietenoase.\n" +
                        "\n" +
                        "Tineți minte: 7 – 8 IULIE, sâmbătă și duminică, două zile de LOVE Yard Sale, la Coppers Pub.\n" +
                        "\n" +
                        "INTRAREA ESTE GRATUITĂ PENTRU VIZITATORI")
                .withPhotoId(R.drawable.love_yard_sale_r)
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName("Sorry nature, I’m late!")
                .withLocation("Strada Leonida 19, Bucharest, Romania")
                .withDate(getDate("21/06/2018 18:00"))
                .withPhotoId(R.drawable.sorry_r)
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName("Summer Well 2018")
                .withLocation("Strada Știrbei Vodă 36, Buftea 070000")
                .withDate(getDate("10/08/2018 18:00"))
                .withPhotoId(R.drawable.summerwell_r)
                .build();
        eventList.add(event);

        return eventList;
    }

    public static List<Hotel> getHotels() {
        List<Hotel> hotelList = new ArrayList<>();

        Hotel hotel = new Hotel.Builder()
                .withName("Athenee Palace Hilton Bucharest")
                .withAddress("Str. Episcopiei nr. 1-3, Sector 1, Bucharest 010292, Romania")
//                .withAddress("1-3 EPISCOPIEI ST., DISTRICT 1, BUCHAREST, 010292, ROMANIA")
                .withWebsite("http://www.hiltonhotels.com/ro_RO/romania/athenee-palace-hilton-bucharest/")
                .withPhone("+40-21-303-3777")
                .withStars(5)
                /*.withDescription("Explore Bucharest from the glorious Athenee Palace Hilton Bucharest hotel, " +
                        "one of the city’s most sophisticated and prestigious landmarks dating back to 1914. " +
                        "Situated within the heart of the city and conveniently connected to Henri Coanda International Airport, " +
                        "our hotel provides spectacular views over Revolution Square and the Romanian Athenaeum. " +
                        "While you're here, enjoy resort amenities including a health club with sauna and indoor pool, " +
                        "beauty salon and fitness center, and our fabulous dining venues.")*/
                .withDescription("Near many beautiful and historic attractions, theatres, shops and cafes\n" +
                        "2 restaurants with a range of cuisine, hotel bar and summer terrace\n" +
                        "Fitness center and health club with sauna, whirlpool and beauty salon\n" +
                        "13 meeting/functions rooms accommodating up to 900 guests\n" +
                        "Business center, Executive Floor and Lounge\n" +
                        "Complimentary WiFi in rooms, restaurants and all public areas\n" +
                        "Over a century of hotel history")
                .withPhotoId(R.drawable.hilton_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Sheraton Bucharest Hotel")
                .withAddress("Calea Dorobanti 5 - 7, Bucharest 010551, Romania")
                .withWebsite("http://sheratonbucharest.com/ro/")
                .withPhone("+4021 201 5000")
                .withStars(5)
                .withDescription("Here, at Sheraton, you can explore the genuine comfort and the higher level of services of our 270 luxurious rooms & suites, including a Presidential Suite and 27 smart and executive suites, all equipped with our signature Sheraton Sleep Experience® Bed, 42 inch flat screen TV and in-room entertainment, relaxing window corners, from where you can admire a spectacular city view and amazing sunsets on clear sky days.\n" +
                        "Everything you need for an effortless stay awaits you at the Sheraton Club. Enhance your stay and experience a higher level of comfort, complete with special touches that will make your visit to Bucharest an unforgettable one.\n" +
                        "Our elegant restaurants, Avalon and Benihana Japanese Steakhouse & Sushi Bar, combine the best ingredients with the latest cooking techniques, to deliver amazing taste sensations.\n" +
                        "Whether you like to start a day with a workout or just need a boost of energy, our fitness center offers effective training programs for maximum results in minimal time.\n" +
                        "We know how important it is to escape from routine and relax, so we recently launched the Skyview Pool and SPA, a true oasis with with a beautiful panorama both over the city and the blue sky. The pool is provided with a special system that allows you to swim against the current of air or water, three hydromassage areas and also two fountains for cervical massage. All these in a heated water pool, at the perfect temperature.\n" +
                        "For a complete pampering session, we have also prepared a variety of wellness & SPA treatments.\n" +
                        "Due to its strategic positioning, Sheraton Bucharest Hotel gives you easy access to all city’s areas, among the closest tourist attractions being the old city, famous for its night life and restaurants, the Romanian Atheneum, the romantic Ioanid park, Herastrau park, the biggest park of the city, House of Parliament, the second largest building in the world and Victoriei Avenue, the most famous shopping street.\n" +
                        "The attention to details is part of our philosophy of making a closer connection to our guests needs and interests. We are just a click away, at your service!")
                .withPhotoId(R.drawable.sheraton_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Radisson Blu Hotel Bucharest")
                .withAddress("63-81 Calea Victoriei, Sector 1, Bucharest 010065, Romania")
                .withPhone("+40 21 311 9000")
                .withEmail("info.bucharest@radissonblu.com")
                .withWebsite("https://www.radissonblu.com/en/hotel-bucharest")
                .withDescription("This centrally-located Bucharest hotel lies near the former Royal Palace, " +
                        "the National Museum of Art and historic Revolution Square. " +
                        "718 modern rooms designed by Uri Blumenthal and Buki Zuker offer Free high-speed, " +
                        "wireless Internet and individual climate control. " +
                        "Sample steak, seafood, Italian specialties and Mediterranean dishes at the hotel’s on-site restaurants, " +
                        "and have a drink in the cozy lounge or by the pool. " +
                        "A spa and fitness center, outdoor pool and Jacuzzi, and casino provide abundant opportunities for fun and relaxation. " +
                        "12 meeting rooms with floor-to-ceiling windows and state-of-the-art audiovisual equipment accommodate conferences and special events.")
                .withStars(5)
                .withPhotoId(R.drawable.radissonblu_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("InterContinental Bucharest")
                .withAddress("Bulevardul Nicolae Bălcescu 4, București 010051, Romania")
                .withPhone("+40-21-3102020")
                .withEmail("info.bucharest@radissonblu.com")
                .withWebsite("https://www.ihg.com/intercontinental/hotels/gb/en/bucharest/buhha/hoteldetail")
                .withDescription("In a striking curved tower overlooking the Old Town, " +
                        "the luxury InterContinental® Bucharest hotel is perfectly placed to explore iconic sights like the giant Palace of Parliament. " +
                        "You can pick out the next city attraction to visit from your private balcony or the rooftop Health Club and terrace. " +
                        "After a meeting with clients, enjoy the sunset from our 21st-floor Club InterContinental Lounge.")
                .withStars(5)
                .withPhotoId(R.drawable.intercontinental_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Rembrandt Hotel")
                .withAddress("Strada Smârdan 11, București 030167, Romania")
                .withPhone("+40 727 353-393")
                .withEmail("info@rembrandt.ro")
                .withWebsite("http://rembrandt.ro/")
                .withDescription("Rembrandt Hotel is an intimate and stylish hotel with 16 spacious rooms, located in the middle of the Old City Centre of Bucharest, ideally positioned whether you come for business or leisure.\n" +
                        "\n" +
                        "Consistently a top hotel in Bucharest on the Trip Advisor ranking list, our hotel is well known for its personal service and genuine hospitality, offering guest rooms with comfortable beds, hardwood floors, leather armchairs and spacious bathrooms.\n" +
                        "\n" +
                        "We are in operation since January 2005 in a beautiful historical building in the Old City, right across the National Bank of Romania. Our street is pedestrian (car access only through National Bank security) so you can enjoy a good night’s sleep away from traffic noises.\n" +
                        "\n" +
                        "In our many years on the Bucharest accommodation and food service scene, a great number of institutions, companies and people have enjoyed our hospitality. We are always here to welcome you with an intimate and captivating atmosphere!")
                .withStars(3)
                .withPhotoId(R.drawable.rembrandt_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Novotel Bucarest City Centre")
                .withAddress("Calea Victoriei 37B | Sector 1, Bucharest 010061, Romania")
                .withPhone("+4021 3088500")
                .withEmail("H5558@accor.com")
                .withWebsite("https://www.accorhotels.com/gb/hotel-5558-novotel-bucharest-city-centre/index.shtml")
                .withDescription("Enjoy contemporary 4-star comfort a few minutes' walk from the Old Town at Novotel Bucharest City Centre hotel. " +
                        "Clean lines and muted colours make your airy room a haven for work or pleasure. " +
                        "Start your day brightly with a tasty buffet breakfast in the sunlit restaurant, " +
                        "and savour drinks with a view on the terrace at Novotel.")
                .withStars(4)
                .withPhotoId(R.drawable.novotel_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Hotel Cismigiu")
                .withAddress("Bulevardul Regina Elisabeta 38, Bucharest 050017, Romania")
                .withPhone("+40 314 03 05 00")
                .withEmail("reservations@hotelcismigiu.ro")
                .withWebsite("http://www.hotelcismigiu.ro/en/Bucharest-Hotel-Cismigiu")
                .withDescription("Conveniently located downtown Bucharest, the newly rebuilt Cismigiu Hotel 4*, " +
                        "one century old and one million stories rich, has come to life again.\n" +
                        "Creating a fantastic ambiance, its design melts heritage and novelty, mixing Art Nouveau architecture with contemporary style.")
                .withStars(4)
                .withPhotoId(R.drawable.cismigiu_r)
                .build();
        hotelList.add(hotel);

        return hotelList;
    }

    public static List<Restaurant> getRestaurants() {
        List<Restaurant> restaurantList = new ArrayList<>();

        Restaurant restaurant = new Restaurant.Builder()
                .withName("Journey Pub")
                .withType("Pub & more")
                .withCuisineType("European, International, Vegetarian Friendly")
                .withAddress("Str. George Enescu Nr. 25 | Sector 1, Bucharest 010306, Romania")
                .withPhone("+40 752 285 286")
                .withEmail("rezervari@journey-pub.ro")
                .withWebsite("https://www.journey-pub.ro/")
                .withPhotoId(R.drawable.journeypub_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName("RE:Modelier")
                .withType("Eatery")
                .withCuisineType("American, International, Bar")
                .withAddress("Strada Patrichi Gina 3 | Close to Victoriei Square, Bucharest 010449, Romania")
                .withPhone("+40 751 277 476")
                .withWebsite("https://www.facebook.com/remodelier")
                .withPhotoId(R.drawable.remodelier_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName("Ad Hoc Bistro")
                .withType("Bistro")
                .withCuisineType("Romanian, Seafood, Soups")
                .withAddress("C. A. Rosetti 10, Bucharest 010283, Romania")
                .withPhone("+40 770 214 214")
                .withWebsite("https://www.facebook.com/AdHocBistro")
                .withDescription("Unique creations and food design, culinary emersion in Romanian old recipes and flavours.")
                .withPhotoId(R.drawable.adhoc2_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName("Fior Di Latte")
                .withType("Restaurant")
                .withCuisineType("Italian, Mediterranean, European")
                .withAddress("Bulevardul Primaverii 19-21, Bucharest 011972, Romania")
                .withPhone("+40 784 420 555")
                .withWebsite("http://www.fiordilatte.ro/")
                .withEmail("office@fiordilatte.ro")
                .withPhotoId(R.drawable.fiordilatte_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName("High Life Bistro")
                .withType("Restaurant")
                .withCuisineType("European, Italian, Mediterranean")
                .withAddress("Strada Alexandrescu Grigore 1, Bucharest 010621, Romania")
                .withPhone("+40 21 317 3973")
                .withWebsite("http://www.high-life.ro/home.php")
                .withPhotoId(R.drawable.highlife_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName("Rocca by The Jar")
                .withType("Restaurant")
                .withCuisineType("Asian, Bar, European")
                .withAddress("Strada pictor Aman Theodor nr. 36, Bucharest 010778, Romania")
                .withPhone("+40 21 314 9133")
                .withEmail("contact@roccabythejar.ro")
                .withWebsite("http://www.roccabythejar.ro/en/")
                .withDescription("Some people collect stamps, paintings or even shells.\n" +
                        "As for ourselves, we’ve tried to put together images, sounds, emotions and flavours fom all the places we’ve seen so far. Especially flavours.\n" +
                        "We’ve found out that it could be hard to put into words the way a fisherman from Philippines taught us about some thousands of spices which can change the taste of a meal from ordinary to delicious.\n" +
                        "We’ve found out, as well, that it could be hard to express the same feeling of a „cubano” guy who’s talking freely about „Cuba Libre”. Under Castro.\n" +
                        "That’s why we’re trying now to reveal all those unspeakable emotions in a different way. Cause we’ve always believed that a „food experience” has to appeal all the six senses. And even more: to generate a seventh one. We’ve brought here, in the Rocca cuisine, all we’ve learnt about the cuisines from abroad.\n" +
                        "Along with the little secrets, we’ve came back with something hard to define and even harder to find: patience.\n" +
                        "Patience to wait. For a meal to be cooked in its right way.\n" +
                        "That is why we will ask you, our precious guest, to have „a bit-little-bit of patience” – as one of our greatest writers used to say – himself being a real „bon-viveur”.\n" +
                        "Because, first and foremost, we want you to become our friend more than our occasionally visitor.")
                .withPhotoId(R.drawable.rocca_r)
                .build();
        restaurantList.add(restaurant);

        return restaurantList;
    }

    public static String formatDate(Date date) {
        if (date == null) {
            return "";
        }
        return SDF.format(date);
    }

    public static Date getDate(String dateString) {
        Date date = null;
        try {
            date = DATE_FORMAT.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
