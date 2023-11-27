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
                "geo:" + location
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


}
