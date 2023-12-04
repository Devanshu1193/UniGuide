package com.devanshusuthar.uniguide;

import android.content.Intent;
import android.net.Uri;

import java.util.Arrays;
import java.util.List;

public class Accommodations {

    private static Intent call(String number) {
        return new Intent(Intent.ACTION_DIAL, Uri.parse(
                "tel:" + number
        ));
    }

    private static Intent message(String message) {
        return new Intent(Intent.ACTION_SENDTO, Uri.parse(
                "smsto:" + message
        ));
    }

    private static Intent location(String location) {
        return new Intent(Intent.ACTION_VIEW, Uri.parse(
                "geo:0,0?q=" + location.replace(" ", "+")
        ));
    }


    // List of Houses in Calgary for Rent.
    public static final List<Accommodation> CALGARY_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.calgary_h1, "3 Beds 2.5 Baths - House", "$2,250/month",
                    "New renovation 2 storey home, located on a quiet street in the neighborhood of Silverado, over 1600 square feet. 3 bedrooms, 2.5 baths, Big wooden deck perfect for summer BBQs.\n" +
                            "The backyard has a gravel parking pad.\n" +
                            "With its unbeatable location across from green space and pathways; walking distance to bus stop (Route 78/102), 5-7 mins bus to Somerset LRT station.\n" +
                            "Close to shopping centre and schools.\n" + "Recent upgrades include: painting,vinyl plank flooring, brand new stainless steel appliances (fridge, stove, hood fan and dishwasher).\n" +
                            "Basement is undeveloped. \n" +
                            "We are looking for a non-smoking, no pets, long-term renter.\n" +
                            "Rental fee $2250/month (Utilities not included). Available to move in: Nov 25,2023. \n" +
                            "If you are interested in it, please call or text for details/viewing.", call("5192345671"), message("5192345671"), location("House 2 location")),

            // HOUSE #2
            new Accommodation(R.drawable.calgary_h2, "1 Bed 1 Bath - House", "$1,500/month", "Modern 1 bedroom, 1 bathroom lower unit in the trending area of Marda Loop.\n" +
                    "• 1 Bedroom\n" +
                    "• 1 Bathroom\n" +
                    "• Luxury vinyl plank flooring throughout\n" +
                    "• The kitchen is equipped with a fridge, electric stove, dishwasher, and over-the-range hood microwave\n" +
                    "YUS\n" +
                    "• Quartz countertops\n" +
                    "• In-floor heating system\n" +
                    "• Stackable washer and dryer\n" +
                    "• Caged storage on the patio\n" +
                    "• Parking is on the street, no permit is required\n" +
                    "• Numerous amenities along 33 ave in Marda Loop", call("5192345673"), message("5192345673"), location("1711 33 Ave SW, Calgary, AB T2T 1Y8")),

            // HOUSE #3
            new Accommodation(R.drawable.calgary_h3, "2 beds 1 bath House", "$1,300/month", "Renting 2 bedroom basement with kitchen, full bathroom and separate entrance. Available from 01-Jan-2024.\n" +
                    "\n" +
                    "3-4 minutes walk to bust stop, close to airport, grocery stores and restaurants. \n" +
                    "\n" +
                    "Rent is 1300 including internet + 35% utilities.", call("5192344673"), message("5192344673"), location("200 Saddlebrook Cir NE, Calgary, AB")),

            // HOUSE #4
            new Accommodation(R.drawable.calgary_h4, "2 beds 1 bathroom – House", "$700/month", "The property is in North-west. This property is located at walking distance to SAIT, train station, grocery stores, restaurants, 10 min drive to UFC and very close to downtown. It has three rooms upstairs and three downstairs. We are renting out two bedrooms from December 1 for 700+ utilities & 750+ utilities. These are bigger room, can easily accommodate 2-3 people. If anyone wants to move-in, we will help them to move their stuff. Immediately available. Pets not allowed.", call("5192344683"), message("5192344683"), location("House 4 location"))

    );



    // List of houses in Edmonton for Rent.
    public static final List<Accommodation> EDMONTON_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.edmonton_h1, "3 Beds 1 Bath House", "$1,525/month", "For rent is a beautifully updated and spacious 3 bedroom, 1 bathroom main floor suite in the fantastic Miller neighbourhood! The home was built in 2001 and has been extremely well maintained. Perfect for any renter: working professionals, couples, young families, or students.\n" +
                    "\n" +
                    "MAIN FLOOR FEATURES:\n" +
                    "- 3 large bedrooms and 1 full bathroom\n" +
                    "- 1,064 Sq.Ft.\n" +
                    "- Private Separate Entrance\n" +
                    "- Full Size In-Suite Laundry\n" +
                    "- 4 piece appliance set including Dishwasher\n" +
                    "- Large windows let in lots of natural light\n" +
                    "\n" +
                    "RECENT UPDATES:\n" +
                    "- Brand new paint throughout the entire unit\n" +
                    "- Brand new flooring in the living room\n" +
                    "- Brand new hot water tank\n" +
                    "- Gutters freshly cleaned in preparation for winter\n" +
                    "\n" +
                    "OTHER FEATURES & AMENITIES:\n" +
                    "- One off-street outdoor parking stall behind the house\n" +
                    "- Additional street parking\n" +
                    "- Large shared fenced yard\n" +
                    "- Shared side deck\n" +
                    "\n" +
                    "NEARBY CONVENIENCE:\n" +
                    "- Only 20 minute drive to downtown Edmonton\n" +
                    "- 5 minute drive to Manning Town Centre and Clareview Town Centre with plenty of shopping, dining and groceries\n" +
                    "- Several bus stops and an LRT station within a short walking distance\n" +
                    "- 10 minute walk to Miller Park and Casselman Park\n" +
                    "- Quick access to Fort Rd and Anthony Henday Dr\n" +
                    "- Several nearby elementary and secondary schools\n" +
                    "\n" +
                    "RENTAL INFORMATION:\n" +
                    "- Available December 1st\n" +
                    "- Utilities additional $250/month flat rate\n" +
                    "- Small pets negotiable for additional fee\n" +
                    "- One year lease required\n" +
                    "- Security Deposit equal to 1 month rent\n" +
                    "- Applicants must be credit & reference approved with full-time employment\n" +
                    "- Co-signers may be considered if application doesn’t quite meet standards\n" +
                    "\n" +
                    "Please note, some photos contain furnishings but the unit is being rented unfurnished.\n" +
                    "Looking for responsible renters who will treat the home and neighbourhood with respect!\n" +
                    "\n" +
                    "PLEASE MESSAGE ME OR CALL/TEXT [hidden information] FOR FURTHER INFORMATION AND TO ARRANGE A VIEWING", call("5193457755"), message("5193457755"), location("4504 150 Ave NW, Edmonton, AB")),

            // HOUSE #2
            new Accommodation(R.drawable.edmonton_h2, "3 Beds 2.5 Baths - House", "$1,785/month", "NEW WEST END PROPERTY!  MAIN FLOOR - Rosenthal Community\n" +
                    "\n" +
                    "BASEMENT RENTED SEPARATELY\n" +
                    "\n" +
                    "22636 - 80th Avenue NW\n" +
                    "22664 - 80th Avenue NW\n" +
                    "22676 - 80th Avenue NW\n" +
                    "22680 - 80th Avenue NW\n" +
                    "\n" +
                    "Available for Immediate occupancy! \uD83D\uDE0A\n" +
                    "*FREE EARLY MOVE IN FOR NOVEMBER!*\n" +
                    "\n" +
                    "3 bedrooms and 2.5 bath Utilities Included\n" +
                    "\n" +
                    "Open Concept living room / dining room / kitchen.  Bright and modern colors.  \n" +
                    "\n" +
                    "3 bedrooms with 2nd floor laundry and 2 full baths - ensuite for master bedroom and 2nd full bathroom.\n" +
                    "\n" +
                    "Includes rear detached double garage and front and a small back yard.\n" +
                    "\n" +
                    "This home has a basement suite rented separately and a Suite above the garage w/ tenants and both have separate entrances.\n" +
                    "\n" +
                    "$1785+400 Utilities (2185) Rent Per Month Includes Utilities (gas, power, water, garbage)\n" +
                    "\n" +
                    "$2185 damage deposit required upon signing of lease.\n" +
                    "\n" +
                    "Small-Medium dogs are ok \n" +
                    "Cats are fine as well (Pet fees will apply)\n" +
                    "\n" +
                    "1 year lease Minimum", call("5193457766"),message("5193457766"),location("House 1 location")),

            // HOUSE #3
            new Accommodation(R.drawable.edmonton_h3, "1 Bed 1 Bath House", "$1,145/month", "Brand New Space above the garage to call your home.\n" +
                    "Garden Suites" +
                    "\n" +
                    "22668 80 Ave NW \n" +
                    "22672 80 Ave NW\n" +
                    "22676 80 Ave NW\n" +
                    "22680 80 Ave NW \n" +
                    "Rosenthal Community\n" +
                    "\n" +
                    "Open Concept.  Bright and modern colors - consistent throughout the suite. Big windows that give you an open feel.\n" +
                    "\n" +
                    "1 bedroom/1 bathroom\n" +
                    "\n" +
                    "Insuite Laundry.\n" +
                    "Pet Friendly cats are 25$ and dogs are a 50$ monthly pet fee.\n" +
                    "\n" +
                    "$1145 rent and $225 utilities (including gas, electricity, water)\n" +
                    "Total monthly rent $1,370\n" +
                    "\n" +
                    "One months damage deposit of $1,370 required upon signing of lease.\n" +
                    "\n" +
                    "Garage is not included", call("5193457777"),message("5193457777"),location("House 3 location")),

            // HOUSE #4
            new Accommodation(R.drawable.edmonton_h4, "3 Beds 1 Bath House", "$1,550/month", "Stunning character home in Forest Heights features gorgeous original hardwood, mid-century stepped ceiling in the living and dining room, with a gorgeous built in china cabinet.  This suite is 1,135 sq. ft. with 3 bedrooms, 1 bath.   There is a shared washer and dryer with the basement suite, so say good bye to coin laundry.  There is an amazing river valley to explore within minutes from this beautiful home. Central location with many amenities close by, such as transit, groceries stores, medical centres and much more.  This location is great for university/ college students (U of A, NorQuest, Kings, MacEwan, and Concordia), Ukrainian's or working professionals. Suite will be available November 1, 2023 and can be yours for just $1,550 per month, plus shared utilities. Please no pets", call("5193457788"),message("5193457788"),location("House 4 location"))

    );

    // List of houses in Edmonton for Rent.
    public static final List<Accommodation> RED_DEER_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.red_deer_h1, "2 Beds 1 Bath - House", "$1,600/month", "Walk out basement for rent in Sylvan Lake two bedroom, one washroom, laundry, kitchen ￼ separate entrance mailbox garbage bin rent is $1600 plus utilities \n" +
                    "￼ 140B Bowman Cir sylvan lake AB", call("5193458833"),message("5193458833"),location("140B Bowman Cir sylvan lake AB")),

            // HOUSE #2
            new Accommodation(R.drawable.red_deer_h2, "4 Beds 2 Bath - House", "$2,350/month", "Beautiful home on quiet close available for rent. This home offers 4 bedroom plus office/den area, 2 full bathroom. Main floor offers master bedroom with large walk in closet, second bedroom, large open concept living, kitchen and dining area with high ceiling. Back door opens up to spacious cover deck that over looks huge back yard for kids to play, and planter boxes to plant your very own garden in the spring.\n" +
                    "Walk out basement has washroom with washer and dryer, under stair storage,2 large bedrooms 1 full bathroom, large family play area and small room for office or kids play area additional small storage room for all the other stuff. Walk out to paved under deck that offers space for bbq and even a hot tub if you have one. 2 storage shed available outside for tires etc. Parking pad to fit 2 large vehicles. Paved back alley offers lots of route to go for walks for kids to ride bike undisturbed.\n" +
                    "\n" +
                    "CENTRAL AC for the Hot Months. Large park 1 min away from house, public transit 3 mins Walk. Walking distance to east hill shopping center.\n" +
                    "Close to school.\n" +
                    "Very quiet family friendly area.\n" +
                    "Can be available December 15th or Jan 1st.\n" +
                    "Available in Inglewood Red deer\n" +
                    "Msg for address and to schedule viewing.\n" +
                    "Serious enquiries only.\n" +
                    "No pets.\n" +
                    "Rent $2350DOES NOT INCLUDE UTILITIES.", call("5193458844"),message("5193458844"),location("House 2 location")),

            // HOUSE #3
            new Accommodation(R.drawable.red_deer_h3, "2 Beds 2.5 Baths House", "$2,200/month", "VACANT & READY. FULLY FINISHED HALF DUPLEX LOCATED IN THE DESIRABLE VANIER WOODS ACROSS FROM A PLAYGROUND. This property will impress you with the modern floor plan which features a really nice KITCHEN with GRANITE COUNTERTOPS, PANTRY, LOTS OF CUPBOARDS, a RAISED EATING BAR. The LIVING ROOM is nice & bright as it allows for lots of natural light to come through the windows & there is also a DINNING AREA with a GARDEN DOOR to the fully fenced & landscaped backyard! Upstairs you'll find 2 big MASTER BEDROOMs each with its own full EN-SUITE and can have your desk as well. The LAUNDRY ROOM with STACKABLE WASHER & DRYER! The FULLY FINISHED BASEMENT features the FAMILY ROOM( that can be used as a bedroom) along with the FURNACE/UTILITY ROOM! and Tankless hot water/on demand. The BACKYARD is FENCED & LANDSCAPED & it offers a really nice DECK...perfect for summer entertaining. The SINGLE ATTACHED GARAGE completes this beautiful home. Located right across from a PLAYGROUND & minutes away to SCHOOLS, SHOPPING & WALKING TRAILS. ", call("5193458844"),message("5193458844"),location("\n" +
                    "40 Van Slyke Way, Red Deer, AB")),

            // HOUSE #4
            new Accommodation(R.drawable.red_deer_h4, "3 Beds 2 Bath - House", "$1,600/month", "Spacious residence situated in a tranquil cul-de-sac, ready for leasing. This dwelling boasts 4 bedrooms and an additional office/den space, along with 2 full bathrooms. The main level features a master bedroom with an expansive walk-in closet, a second bedroom, and a generously sized open-concept living, kitchen, and dining area with lofty ceilings. Accessible through the back door is a capacious covered deck that overlooks an extensive backyard, ideal for children's play, complemented by planter boxes for cultivating your garden come spring.\n" +
                    "\n" +
                    "The walk-out basement comprises a restroom with a washer and dryer, storage beneath the stairs, 2 large bedrooms, a full bathroom, a spacious family play area, and a small room suitable for an office or a children's play zone, with an additional compact storage room for miscellaneous items. Exiting leads to a paved area beneath the deck, providing space for a barbecue and even a potential hot tub. Two external storage sheds are available for items like tires, and the parking pad accommodates 2 large vehicles. The paved back alley offers a plethora of routes for undisturbed walks or kids riding bikes.\n" +
                    "\n" +
                    "For the warmer months, the dwelling is equipped with central air conditioning. A large park is just a minute away, and public transit is a brief 3-minute walk. The residence is within walking distance of the East Hill Shopping Center, close to schools, and situated in a very quiet, family-friendly locale. It can be made available on either December 15th or January 1st in Inglewood, Red Deer. For the address and to arrange a viewing, please message. Serious inquiries only. No pets. Rent is $2350 and does not include utilities.", call("5193458833"),message("5193458833"),location("Danielle Dr, Red Deer, AB"))

            );


    public static final List<Accommodation> VANCOUVER_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.vancouver_h1,"4 Beds 1 Bath - House", "$3,950/month", "Character home in East Vancouver near E. 1st Ave and Renfrew. Spacious backyard, close to Highway no. 1 and 15 mins drive to downtown. Convenient shopping near by: Hastings-Sunrise neighbourhood, Superstore, T&T, Donald's Market. Easy 20 mins walk to Commercial Drive shops. Minutes walk from Notre Dame highschool. Located between Lord Nelson Elementary and Sir Matthew Begbie Elementary schools.\n" +
                    "\n" +
                    "4 bedrooms plus den over the top two levels of the house. Large sunny south facing back deck. Includes use of 1/2 garage space. (All rooms have windows. One of the rooms is smaller, so it's considered a den)\n" +
                    "\n" +
                    "*Maximum 4 people",call("2267891234"),message("2267891234"),location("2917 E 1st Ave, Vancouver, BC V5M 1B1")),

            // HOUSE #2
            new Accommodation(R.drawable.vancouver_h1,"3 Beds 2 Baths House","$2,780/month","his unit is available now\n" +
                    "\n" +
                    "Sorry - no pets, no smoking, no parties, no drugs (no exceptions!). Maximum 3 occupants\n" +
                    "\n" +
                    "If interested, please send us the following:\n" +
                    "1. Full name and contact phone number to be reached at\n" +
                    "2. Number of occupant(s)\n" +
                    "3. Relationship to each other\n" +
                    "4. Current occupation(s)\n" +
                    "5. Duration of intended rental term and planned move in date\n" +
                    "6. Email for open house invitation\n" +
                    "7. Optional: hobbies!\n" +
                    "\n" +
                    "What we have to offer:\n" +
                    "● 3 bedroom / 2 full bathroom laneway house in a safe and quiet neighbourhood\n" +
                    "● Fully self-contained with private entrances\n" +
                    "● Bright with lots of natural light\n" +
                    "● Utilities and internet not included\n" +
                    "● Clean and modern space\n" +
                    "● Quartz countertops in kitchen and bathrooms\n" +
                    "● Large ground floor windows\n" +
                    "● Stainless steel appliances\n" +
                    "● Plenty of street parking (corner lot), plenty of natural light\n" +
                    "● Short walk to multiple bus stops, groceries, parks, and community centre\n" +
                    "● Victoria Drive, Kingsway, and Knight Street easily accessed by foot for restaurants, shops, and services\n" +
                    "● Great view of Northshore mountains in the smaller bedroom, perfect for an office.\n" +
                    "\n" +
                    "Please note that the furnishings pictured in the photos will NOT be included.\n" +
                    "\n" +
                    "Included appliances:\n" +
                    "● Private laundry washer & dryer\n" +
                    "● Stainless steel kitchen range (stove and oven) and refrigerator\n" +
                    "● Microwave\n" +
                    "\n" +
                    "What we need before signing:\n" +
                    "● References\n" +
                    "● Proof of income\n" +
                    "● Background check\n" +
                    "\n" +
                    "Due to the amount of interest, we regret that we are unable to respond to all inquiries. To be considered, please be sure to answer the questions above. Thanks for your interest!\n" +
                    "\n" +
                    "Search terms:\n" +
                    "3 bdrm, 3 beds, 2 bath, move-in ready, modern, w/d",call("2269615678"),message("2269615678"),location("1508 E 33rd Ave, Vancouver, BC V5N 3C8")),

            // HOUSE #3
            new Accommodation(R.drawable.vancouver_h3, "2 Beds 1 Bath House","$2,900/month","Cozy 2 BR, 1 bath house (Upper Level of 2 level house).  Ideal for a couple or 2 roommates.  Very central location by Broadway and Nanaimo.  Close to public transit, elementary and secondary school, grocery stores, restaurants and shopping.  Has fireplace, and shared large back yard.  Washer dryer on site.  No pets no smoking please.",call("2269621234"),message("2269621234"), location("2414 E 11th Ave, Vancouver, BC V5M 2B4")),

            // HOUSE #4
            new Accommodation(R.drawable.vancouver_h4,"3 Beds 3 Baths - House","$3,900/month","Home built in 2018. Across the street from Earles Park. Walking distance to Killarney High School and walking distance to 41st bus stop.\n" +
                    "A/C unit in house.",call("2269625678"),message("2269625678"),location("2885 E 41st Ave, Vancouver, BC V5R 2X4"))
    );

    public static final List<Accommodation> SURREY_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.surrey_h1,"3 Beds 1 Bath - House","$2,500/month","3 bedroom 1 Bathroom Basement ground level 7518 149A St Surrey \n" +
                    "Available Dec 1st ", call("2268617565"),message("2268617565"), location("7518 149a St, Surrey, BC V3S 3H5")),

            // HOUSE #2
            new Accommodation(R.drawable.surrey_h2,"2 Beds 1 Bath - House","$1,600/month","Newton, Surrey\n" +
                    "69 Ave & 149 Street\n" +
                    "2 Bedroom Basement Suite \n" +
                    "WiFi Included\n" +
                    "Utilities Included\n" +
                    "No Smoking\n" +
                    "No Pets\n" +
                    "No Laundry\n" +
                    "Walking distance to Pizza, Groceries, Salon, Barber, Restaurant, Laundromat, Gurdwara, Church.", call("2268617566"),message("2268617566"), call("14908 69 Ave, Surrey, BC V3S 0Y8")),

            // HOUSE #3
            new Accommodation(R.drawable.surrey_h3,"2 Beds 1 Bath House","$1,750/month","Basement suite for rent\n" +
                    "*Utilities and Internet included (No Laundry)\n" +
                    "*No Pets, No Smoking ",call("2268617566"),message("2268617566"),location("13808 79 Ave, Surrey, BC V3W 2Y9")),

            // HOUSE #4
            new Accommodation(R.drawable.surrey_h4, "1 Bed 1 Bath House","$900/month","Need two boys to share a room in a two bed room basement suite near 145A/ 74 ave. quiet place and near to park. No pets/no smoking. Portable washer/WiFi included. From December 1st", call("2268617568"), message("2268617568"), location("14572 74 Ave, Surrey, BC V3S 2G6"))
    );

    public static final List<Accommodation> BURNABY_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.burnaby_h1, "3 Beds 1 Bath - House", "$2,700/month", "Full rancher house for rent 3 bedroom and 1 washroom near by Gateway station city centre 2 min walk distance bus stop plus utilities available from today for more information please call or message.",call("2268617569"),message("2268617569"), location("14796 106a Ave, Surrey, BC V3R 1T6")),

            // HOUSE #2
            new Accommodation(R.drawable.burnaby_h2, "4 Beds 1 Bath House", "$3,300/month", "RENT: $3,300 per month\n" +
                    "SQFT: Approx. 2000\n" +
                    "DETAILS: 4 BED / 1 BATH\n" +
                    "AVAILABLE: December 1st, 2023\n" +
                    "LEASE TERM: Dec 1st/2023 - Feb 29th/2024\n" +
                    "\n" +
                    "Features:\n" +
                    "• Clean and well kept house!\n" +
                    "• 9' ft high ceilings\n" +
                    "• Chef inspired kitchenette\n" +
                    "• In-house washer and dryer\n" +
                    "• Tile flooring in washroom\n" +
                    "• Laminate flooring in common area\n" +
                    "• Private parking available\n" +
                    "• Ample green space to enjoy in the backyard\n" +
                    "\n" +
                    "Location offers:\n" +
                    "• Family oriented neighborhood with great schools, parks and walking distance to tons of amenities\n" +
                    "• Transit conveniently located less than 5 min.\n" +
                    "• Lots of restaurants, banks, various stores\n" +
                    "\n" +
                    "We are looking for:\n" +
                    "• Quiet and respectful tenants\n" +
                    "• No smoking / no drugs on the property\n" +
                    "• Pets allowed on a case-by-case basis\n" +
                    "• References from work and past landlords will be required\n" +
                    "• Proof of stable income will be requested\n" +
                    "• Security deposit\n" +
                    "• Further checks may be required\n" +
                    "\n" +
                    "Please inquire by txt or email WITH a brief introduction of yourself, employment, number of occupants etc. and I will reply back to you asap.", call("2268617569"),message("2268617569"), location("7724 Nursery St, Burnaby, BC V5E 2B4")),

            // HOUSE #3
            new Accommodation(R.drawable.burnaby_h3,"4 Beds 1.5 Baths House", "$600/month", "hared Rental Space near Vancouver Downtown for $600/$700\n" + "It is a lovely, cozy house with large rooms near Vancouver Downtown. We have only three beds left in three separate rooms. There are four rooms in total. This fully furnished place has a fully equipped kitchen and laundry area; all you need to bring is your own clothes. We have two categories: 2 beds available in a large room will cost $700 each, and a bed in a smaller room will cost $600.\n" +
                    "\n" +
                    " - Distances through Transit, and you can reach in half of the time with your own vehicle:\n" +
                    "- 30 minutes to Gas Town\n" +
                    "- 35 minutes to Granville \n" +
                    "- 37 minutes to UCW \n" +
                    "\n" +
                    "Lease: 3 months\n" +
                    "\n" +
                    "Rent Includes WIFI, furniture, dryer-washer, parking \n" +
                    "Excluding: Hydro-heater (utilities will be divided into all existing tenants) \n" +
                    "\n" +
                    "No pets allowed, no parties, no drugs, no smoking.\n" +
                    "\n" +
                    "Please send me a message with your small introduction ", call("2268617589"), message("2268617589"), location("4540 Parker St, Burnaby, BC V5C 3C9")),

            // HOUSE #4
            new Accommodation(R.drawable.burnaby_h4,"3 Beds 2 Baths - House", "$3,450/month", "METROTOWN/DEER LAKE-UPPER SUITE- LARGE 3BR-BRAND NEW RENO-FLEXIBLE DATE (Burnaby)\n" +
                    "\n" +
                    "New Large renovated cat friendly 3 BR 2 Bath Upper suite-Duplex\n" +
                    "Areas/Location:\n" +
                    "•  Metrotown/Deer Lake –cul de sac quiet residential street-private access to walking trails.\n" +
                    "• One block to Royal Oak, short driving distance to freeway  and walking distance to transit connecting to Skytrain\n" +
                    "• Surrounded by amenities :  park, variety of restaurants, grocery stores and Metropolis shopping mall.\n" +
                    "Features: \n" +
                    "• Brand new renovated suite with 3 good sized bedrooms 2 baths.\n" +
                    "• Large modern kitchen with quartz counter top , garburator, brand new fixtures including dishwasher and eating area\n" +
                    "• Bright living room with formal dining room with front patio over looking nice front yard.\n" +
                    "• Brand new hardwood flooring, lightings and interior finishing wood work through out the suite.\n" +
                    "• Parking for up to 2 cars in carport in the back of the house\n" +
                    "• Front patio  and huge back sundeck overlooking beautiful views of city and green nature.\n" +
                    "\n" +
                    "Contact\n" +
                    "Please respond by providing name, phone, moving date and number of people-Suitable for  working small family.\n" +
                    "Flexible move in date as just finished renovation.\n" +
                    "Viewing: Saturday Nov.25 11:30 to 12:30\n" +
                    "Sunday 2:30-3:00",call("2268617581"),message("2268617581"), location("6069 Dufferin Ave, Burnaby, BC V5H 3S9"))
    );

    public static final List<Accommodation> HALIFAX_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.halifax_h1, "2 Beds 1 Bath - House", "$746/month", "Available from jan 1st\n" +
                    "\n" +
                    "One private living room available to rent in a 2 bedroom apartment. The living room is separated by curtain\n" +
                    "\n" +
                    "Great location. Its 900m from the downsview plaza and nearest bus stop is just 250m with direct busses to downtown halifax\n" +
                    "\n" +
                    "One guy lives in the other room and one guy lives in living room.\n" +
                    "\n" +
                    "We are all from punjab india. Very friendly people\n" +
                    "\n" +
                    "Everything is included except wifi which is $30 per person.\n" +
                    "\n" +
                    "Parking is available(free)\n" +
                    "\n" +
                    "Total rent is 2240 which is divided among 3 people. No more than 3 people are allowed in the apartment.\n" +
                    "\n" +
                    "No drinking/ no smoking\n" +
                    "\n" +
                    "Its the basement unit in the house\n" +
                    "\n" +
                    "Its a fairly small apartment. Text me for more pictures.", call("2269871122"), message("2269871122"), location("9 NS-354, Lower Sackville, NS B4E 1G3")),

            // HOUSE #2
            new Accommodation(R.drawable.halifax_h2,"3 Beds 3.5 Baths - House", "$2,600/month", "3 bedroom, 3.5 bathrooms semi-detached home in the new and upcoming neighbourhood of Mcintosh in Herring Cove. Beautiful private backyard view of Mcintosh Run.\n" +
                    "\n" +
                    "Elegant fixtures and finishing touches throughout the house. Easy access to walking trails, lakes and streams. Open concept with beautiful floors. Beautiful kitchen space with quartz counters and large breakfast bar and pantry. Spacious dining area with patio doors to deck. Large living area with tons of natural light.\n" +
                    "\n" +
                    "Heated with baseboard heaters and heat pump providing economic heating and cooling year-round. Attached a driveway fit for 2 cars.\n" +
                    "\n" +
                    "No smokers or pets please.\n" +
                    "\n" +
                    "Available NOW for a minimum of one year.\n" +
                    "\n" +
                    "All blinds and mirrors and appliances will be installed and the unit will be move-in ready for January 1st.\n" +
                    "\n" +
                    "Appliances: Fridge, stove and oven, dishwasher, washer, dryer, microwave\n" +
                    "\n" +
                    "Air conditioning: yes\n" +
                    "\n" +
                    "Utilities: Not included in Rent price. \n" +
                    "Water and Electricity\n" +
                    "\n" +
                    "Please contact me at [hidden information] or DM for a rental application and to book a time for viewing.", call("2269872233"), message("2269872233"), location("11 Hartlen Ave, Halifax, NS B3R 1R5")),

            // HOUSE #3
            new Accommodation(R.drawable.halifax_h3, "4 Beds 1 Bath - House", "$3,200/month", "Beautiful renovated four- bedroom apartment (3 large rooms that fit king/queen size bed sets and one smaller room that fits a single or double bed) on the main level in a triplex. The apartment offers 1,300 sq ft of living area, a front porch, a back deck, fully fenced sunny back yard.\n" +
                    "\n" +
                    "The house is located in Halifax, Cunard St, between Windsor St and Robbie st, within walking distance to Commons, Downtown, Universities, Hospitals, Quinpool shopping area ( Superstore, Canadian Tire, Restaurants, Banks, Gas Stations) Sobeys.\n" +
                    "\n" +
                    "Near bus stations that take you directly to DAL or SMU(10 minutes), to Downtown, to Bedford.\n" +
                    "\n" +
                    "The apartment was renovated during the past few years and is well maintained year round.\n" +
                    "The apartment features:\n" +
                    "Real hardwood/ceramic floors\n" +
                    "9 foot high ceilings and Victorian characters\n" +
                    "5 energy saving appliances: Fridge, Stove, Dishwasher, Washer (coin operated $2) & Dryer (coin operated $2)\n" +
                    "New large bathroom (4 piece)\n" +
                    "Renovated kitchen\n" +
                    "New light fixtures\n" +
                    "Freshly painted\n" +
                    "\n" +
                    "Lease Terms: \n" +
                    "Fixed term lease take over starting on January 1,2024 and ending on August 31,2024 with possibility to renew \n" +
                    "\n" +
                    "One small pet (spayed/neutered/ socialized and well behaved) is accepted per apartment.\n" +
                    "\n" +
                    "The rent is $3,200 and includes:\n" +
                    "Heating (natural gas)\n" +
                    "Hot water(natural gas)\n" +
                    "Wifi Fibe from Bell\n" +
                    "Landscaping\n" +
                    "\n" +
                    "Electricity account must be taken over and the bill should be expected to be in the range of $120-$130 every two months.\n" +
                    "\n" +
                    "Parking is available on request for $100/month.\n" +
                    "\n" +
                    "This apartment is feasible just for young professionals with stable employment or mature student. If you are student, you will require to have a Guarantor(s) living and working in Canada with a yearly income of at least $75,000.\n" +
                    "The property owners will perform credit check, landlord and employment checks.", call("2269873344"), message("2269873344"), location("2150 Robie St, Halifax, NS B3K 4M5")),

            // HOUSE #4
            new Accommodation(R.drawable.halifax_h4, "4 Beds 2.5 Baths - House","$3,700/month" ,"Available for Rent\n" +
                    "\n" +
                    "6208 Lawrence Street Halifax, NS\n" +
                    "Monthly Rent: $3700.00\n" +
                    "Included In Rent: Water, Parking (2 Spots)\n" +
                    "Move In: December or January 1st\n" +
                    "Pets: Limited\n" +
                    "\n" +
                    "Property Details: \n" +
                    "\n" +
                    "1,805 sqft\n" +
                    "3 Levels\n" +
                    "4 Bedrooms\n" +
                    "2.5 Bathrooms\n" +
                    "In-suite Laundry/Mudroom\n" +
                    "Fridge, Stove, Dishwasher, Over-The-Range Microwave, Propane Stove\n" +
                    "Included in Rent: Water, Parking (2 Spots)\n" +
                    "\n" +
                    "Property Features: \n" +
                    "\n" +
                    "Modern High End Finishes \n" +
                    "Original Architectural Features\n" +
                    "10ft Ceilings\n" +
                    "Ductless Heat Pumps \n" +
                    "Driveway Parking (2 Spots)\n" +
                    "Propane Stove\n" +
                    "Private Fenced Backyard\n" +
                    "Tool Shed\n" +
                    "Pet-Friendly (limited)\n" +
                    "Near Major Bus Routes\n" +
                    "Prime Halifax Peninsula Location\n" +
                    "\n" +
                    "This executive 4-bedroom 2.5-bathroom home is located on a quiet tree-lined street in the heart of the Halifax Peninsula. This home has undergone renovations providing high-end finishes while maintaining its character and charm with french doors, high ceilings, original staircase and crown moldings. As you enter the home, you are welcomed into a vestibule finished with slate flooring, original hardwood doors and a transom window. The flow of the layout provides a cozy and comforting feel as you first enter the living room with a propane stove which leads into the formal dining area followed by the renovated and modern kitchen with gas range and quartz countertops. On the back of the home is where you will find a 3-pc bathroom, beautiful mudroom/laundry and direct access to the private fenced backyard with a tool shed, maintained gardens and a large platform deck with a pergola. The upper-level features 3 bedrooms, and a 4-pc bathroom. The basement includes a rec area, a bedroom, a 2-pc bath with painted concrete floors and an unfinished area great for storage. This home has 3 ductless heat pumps combined with electric baseboard heating for comfortable and efficient heating in the winter months and air conditioning in the summer months. This property is within a short walking distance to hospitals, universities and community amenities such as schools, grocery stores, The Halifax Commons, Quinpool Road and The Public Gardens.", call("2269874455"), message("2269874455"), location("6208 Lawrence St, Halifax, NS B3L 1J9"))
    );


    public static final List<Accommodation> NEW_GLASGOW_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.new_glasgow_h1, "2 Beds 1 Bath House", "$1,500/month", "Country living at its best. Nicely renovated 2 bedroom mini home located in Eureka. 10 minutes from Stellerton.  Freshly painted, new flooring all new appliances. washer dryer hook up. no pets, no smoking on property.  $1500 plus heat and light. Available immediately.", call("2269875566"), message("2269875566"), location("27 Foster Ave, Stellarton, NS B0K 0A2")),

            // HOUSE #2
            new Accommodation(R.drawable.new_glasgow_h2, "1 Bed 1 Bath Apartment", "$1,250/month", "Great Location, close to downtown, shopping, restaurants and more.  Good size one bedroom and bath.  Includes heat and hot water.  Dont miss out it wont last long.", call("2269875566"), message("2269875566"), location("369 Pleasant St, New Glasgow, NS B2H 2Z2")),

            // HOUSE #3
            new Accommodation(R.drawable.new_glasgow_h3, "2 Beds 1 Bath Apartment", "$1,400/month", "Lower unit in duplex is for rent! 2bd/1bth unit, over 1000sq.f of space. Amazing location that is just minutes away from amenities, shopping and parks, just 15min from beaches.\n" +
                    "\n" +
                    "$1400/monthly + utilities (electrical heating).\n" +
                    "\n" +
                    "Application, confirmation of employment and credit report will be required!", call("2269876677"), message("2269876677"), location("123 Herbert St, New Glasgow, NS B2H 1J6")),

            // HOUSE #4
            new Accommodation(R.drawable.new_glasgow_h4, "4 Beds 1.5 Baths - House", "$1,500/month", "4 Beds 1.5 Baths - House\n" +
                    "Four bedroom (4th room currently has hookups for washer and dryer), 1 1/2 bath. Roof is 3 years old. For sale TO BE MOVED at buyers expense. House is being sold as is asking $50,000. Located outside of Pictou.", call("2269877788"), message("2269877788"), location("4 Battist Rd, Pictou, NS B0K 1H0"))
    );

    public static final List<Accommodation> TORONTO_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.toronto_h1,"3 Beds 1 Bath - House", "$2,600/month", "3 Beds 1 Bath - House" +
                    "\n" +
                    "9 Janray Dr, Scarborough, ON M1G 1X9, Canada ", call("2269878899"), message("2269878899"), location("5 Janray Dr, Scarborough, ON M1G 1X9")),

            // HOUSE #2
            new Accommodation(R.drawable.toronto_h2, "4 beds 3 baths House", "$3,200/month", "MAIN FLOOR ONLY ---ALL\n" +
                    "\n" +
                    "(Main and upper level only)Explore this rare 4-bedroom, 2-story home with a double garage in the heart of Bridlewood. Located on a quiet, child-safe cul-de-sac, this sun-filled beauty boasts meticulous maintenance, fresh paint, new doors, LED lights, and a new roof. Enjoy the convenience of being steps away from schools, parks, supermarkets, shopping plaza, TTC, and easy access to Hwy 401/404 and all amenities. Don't miss out!\n" +
                    "\n" +
                    "3 PARKING SPOTS ONLY",call("2264351122"), message("2264351122"), location("61 Richbourne Ct, Scarborough, ON M1T 1T5")),

            // HOUSE #3
            new Accommodation(R.drawable.toronto_h3, "2 Beds 1 Bath House", "$2,300/month", "236 Roywood Dr, Toronto, ON\n" + "Available January 1,2024\n" +
                    "2 Bedroom Basement apartment\n" +
                    "Utilities included ", call("2264352233"), message("2264352233"), location("236 Roywood Dr, Toronto, ON M3A 2E6")),

            // HOUSE #4
            new Accommodation(R.drawable.toronto_h4, "3 Beds 2 Baths - House", "$3,300/month", "Location!! Location!! Location!! A Fantastic Opportunity to rent a Beautiful Home in Prime Bendale Community! This Stunning Home Feature 3 Bedrooms, 2 Washrooms. Canadian Oak Hardwood Floors Throughout Main Floor, Modern Open Concept Kitchen W/Quartz Countertops. Open Concept Living & Dining. Pot Lights Throughout. Freshly Painted Throughout Large Lot with Lovely oversize Deck for Your Entertainment. Separate Laundries for Each Floor. Be A Part of A Great Community And Live The location is highly accessible with Walking Distance To Catholic And Public Schools. Minutes To Scarborough Town Centre, Ttc, Go Platform Relocation to Stc, Future Subway Extension, Hospital, Shopping, All Amenities & 401\n" +
                    "Extras:**Tenants To Pay 60% All Utilities (Hydro, Gas and Water). 2 Car Parking**",call("2264353344"),message("2264353344"),location("922 McCowan Rd, Scarborough, ON M1P 3H6"))
    );

    public static final List<Accommodation> BRAMPTON_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.brampton_h1, "4 Beds 3 Baths - House", "$3,500/month", "Very Spacious and bright 4 bedroom / 3 washroom house for rent located near William Pkwy & Kennedy in the heart of Brampton. Very close to all amenities, groceries, highway and school.\n" +
                    "\n" +
                    "Property features :\n" +
                    "- Bright and Spacious bedrooms with large windows and closets\n" +
                    "- 3 bedrooms\n" +
                    "- 2 Washrooms\n" +
                    "- New kitchen with new stainless steel appliances\n" +
                    "- Separate laundry\n" +
                    "- Plenty of storage\n" +
                    "- Family friendly quiet neighborhood \n" +
                    "- Two car parking\n" +
                    "- Smoke free home\n" +
                    "\n" +
                    "Requirements : ID Proof, Employment verification and credit report\n" +
                    "\n" +
                    "Rent + 60% Utilities\n" +
                    "No pets allowed", call("2264354455"), message("2264354455"), location("24 Blenheim Dr, Brampton, ON L6Z 1H9")),

            // HOUSE #2
            new Accommodation(R.drawable.brampton_h2, "4 Beds 4 Baths - House", "$3,400/month", "Detached house \n" +
                    "4 Bedrooms \n" +
                    "4 washrooms \n" +
                    "Laundry on Main level \n" +
                    "3  car parking \n" +
                    "Stainless steel appliances \n" +
                    "Close to Plaza and school",call("2264355566"), message("2264355566"), location("91 Brisdale Dr, Brampton, ON L7A 1S5")),

            // HOUSE #3
            new Accommodation(R.drawable.brampton_h3, "4 Beds 3 Baths - House", "$3,650/month", "4 Bedroom 3 Washroom\n" +
                    "- Close to ammenties\n" +
                    "- Parking Available ", call("2264356677"), message("2264356677"), location("91 Nelson St W, Brampton, ON L6X 1C7")),

            // HOUSE #4
            new Accommodation(R.drawable.brampton_h4, "3 beds 2 baths House", "$3,200/month", "A beautiful house available on rent near to Sheridan college. \n" +
                    "\n" +
                    "- 3 good size bedrooms with B/I Closet\n" +
                    "- 2 washrooms\n" +
                    "- Big front and backyard for your kids\n" +
                    "- Close to Brampton go and other amenities\n" +
                    "- 4 parkings on driveway\n" +
                    "\n" +
                    "To book a viewing please call Prabhdeep Singh.", call("2264357788"), message("2264357788"), location("21 Lockwood Rd, Brampton, ON L6Y 4T7"))
    );

    public static final List<Accommodation> WINDSOR_ACCOMMODATIONS = Arrays.asList(

            // HOUSE #1
            new Accommodation(R.drawable.windsor_h1, "3 Beds 1 Bath - House", "$2,000/month", "Cozy 3-Bedroom Rental in South Central Windsor!" +
                    "\n" +
                    "This main floor unit offers:\n" +
                    "\n" +
                    "3 bedrooms\n" +
                    "1 bathroom\n" +
                    "Kitchen and laundry\n" +
                    "Separate garage\n" +
                    "Available for immediate move-in. Tenant covers hydro and gas. Rent includes water. Credit and reference checks apply. Call today!", call("2264358899"), message("2264358899"), location("2241 Mercer St, Windsor, ON N8X 3R2")),

            // HOUSE #2
            new Accommodation(R.drawable.windsor_h2,"2 beds 1 bathroom – House", "$1,395/month", "Very spacious 2 Bed Apartment on rent \n" +
                    "\n" +
                    "Only AAA tenants \n" +
                    "\n" +
                    "Available- 1st Dec\n" +
                    "\n" +
                    "Utilities extra\n" +
                    "\n" +
                    "Contact us for viewing.", call("2267568787"), message("2267568787"),location("1200 George Ave, Windsor, ON N8Y 2X6")),

            // HOUSE #3
            new Accommodation(R.drawable.windsor_h3,"4 Beds 3 Baths - House", "$3,100/month", "Full Home  - 4 Bedroom + Extra Room / 3 Bathrooms / available for rent in Southwood Lakes. \n" +
                    "\n" +
                    "Located nearby, St Clair College & Talbot Trail Public School, with quick access too Walker Road, Howard & Dougall. Fantastic Location in South Windsor. \n" +
                    "\n" +
                    "Credit Check, References, First and Last Month Rent Required. \n" +
                    "\n" +
                    "Asking for $3,100/Month + utilities. \n" +
                    "\n" +
                    "Message me for more information.", call("2267569898"), message("2267569898"), location("4383 Concession Rd 6, Windsor, ON N9G 3A3")),

            // HOUSE #4
            new Accommodation(R.drawable.windsor_h4,"4 Beds 1 Bath - House", "$650/month", " bedrooms available for rent on room-by-room basis. 1 bath, 1 washroom, 1 kitchen with indoor laundry.\n" +
                    "$650/room, Utilities inclusive.\n" +
                    "Located on the busiest bus route in the City.\n" +
                    "10 minutes walk to Metro, and major Grocery Stores Walmart, Food Basics and walking distance to Tecumseh Mall and Saint Claire College. \n" +
                    "Major Intersections - Tecumseh and Pillette.\n" +
                    "Good reference, employment and background check required\n" +
                    "First and last rent required.\n" +
                    "Parking space available.\n" +
                    "\n" +
                    "To arrange for viewing, please contact", call("2267566575"), message("2267566575"), location("2367 Pillette Rd, Windsor, ON N8T 1P7"))
    );
}
