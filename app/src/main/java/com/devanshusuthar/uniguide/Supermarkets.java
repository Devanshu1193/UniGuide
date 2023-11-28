package com.devanshusuthar.uniguide;

import android.content.Intent;
import android.net.Uri;

import java.util.Arrays;
import java.util.List;


public class Supermarkets {

    private static Intent call(String number) {
        return new Intent(Intent.ACTION_DIAL, Uri.parse(
                "tel:" + number
        ));
    }

    private static Intent location(String location) {
        return new Intent(Intent.ACTION_VIEW, Uri.parse(
                "geo:" + location
        ));
    }

    public static final List<Supermarket> CALGARY_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.calgary_sm1,"Lucky Supermarket","4527 8 Ave SE",3.8,"9:00 AM - 9:00 PM",call("4035690778"),location("4527 8 Ave SE, Calgary, AB T2A 0A7")),
            new Supermarket(R.drawable.calgary_sm2, "Calgary Co-op Midtown", "1130 11 Ave SW",4.4,"7:00 AM - 10:00 PM",call("4032994257"),location("1130 11 Ave SW, Calgary, AB T2R 0G4")),
            new Supermarket(R.drawable.calgary_sm3,"Real Canadian Superstore 20th Avenue", "3575 20 Ave NE", 4.0,"7:00 AM - 10:00 PM",call("4032808222"),location("3575 20 Ave NE, Calgary, AB T1Y 6R3")),
            new Supermarket(R.drawable.calgary_sm4,"Save-On-Foods","8855 Macleod Trail SW #100",4.2,"7:00 AM - 10:00 PM",call("4036402447"),location("8855 Macleod Trail SW #100, Calgary, AB T2H 0M2")),
            new Supermarket(R.drawable.calgary_sm5,"LUCKY SUPERMARKET", "3333 Sunridge Way NE",4.1,"7:00 AM - 10:00 PM", call("4037170770"),location("3333 Sunridge Way NE, Calgary, AB T1Y 7H5"))
    );

    public static final List<Supermarket> EDMONTON_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.edmonton_sm1, "Real Canadian Superstore Baseline Road", "Sherwood Park, AB",4.1,"7:00 AM - 10:00 PM",call("7804175237"),location("410 Baseline Rd #100, Sherwood Park, AB T8H 2A7")),
            new Supermarket(R.drawable.edmonton_sm2,"Blush Lane Organic Market Whyte Ave","Edmonton, Alberta",4.3,"9:00 AM - 9:00 PM",call("7809885655"),location("8135 102 St NW, Edmonton, AB T6E 4A4")),
            new Supermarket(R.drawable.edmonton_sm1, "Real Canadian Superstore Baseline Road", "Sherwood Park, AB",4.1,"7:00 AM - 10:00 PM",call("7804175237"),location("410 Baseline Rd #100, Sherwood Park, AB T8H 2A7")),
            new Supermarket(R.drawable.edmonton_sm2,"Blush Lane Organic Market Whyte Ave","Edmonton, Alberta",4.3,"9:00 AM - 9:00 PM",call("7809885655"),location("8135 102 St NW, Edmonton, AB T6E 4A4")),
            new Supermarket(R.drawable.edmonton_sm1, "Real Canadian Superstore Baseline Road", "Sherwood Park, AB",4.1,"7:00 AM - 10:00 PM",call("7804175237"),location("410 Baseline Rd #100, Sherwood Park, AB T8H 2A7"))
    );

    public static final List<Supermarket> RED_DEER_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.red_deer_sm1,"Real Canadian Superstore 51 Avenue","5016 51 Ave A",4.1,"7:00 AM - 10:00 PM",call("4033503527"),location("5016 51 Ave A, Red Deer, AB T4N 4H5")),
            new Supermarket(R.drawable.red_deer_sm1,"Real Canadian Superstore 51 Avenue","5016 51 Ave A",4.1,"7:00 AM - 10:00 PM",call("4033503527"),location("5016 51 Ave A, Red Deer, AB T4N 4H5")),
            new Supermarket(R.drawable.red_deer_sm1,"Real Canadian Superstore 51 Avenue","5016 51 Ave A",4.1,"7:00 AM - 10:00 PM",call("4033503527"),location("5016 51 Ave A, Red Deer, AB T4N 4H5")),
            new Supermarket(R.drawable.red_deer_sm1,"Real Canadian Superstore 51 Avenue","5016 51 Ave A",4.1,"7:00 AM - 10:00 PM",call("4033503527"),location("5016 51 Ave A, Red Deer, AB T4N 4H5")),
            new Supermarket(R.drawable.red_deer_sm1,"Real Canadian Superstore 51 Avenue","5016 51 Ave A",4.1,"7:00 AM - 10:00 PM",call("4033503527"),location("5016 51 Ave A, Red Deer, AB T4N 4H5"))
    );

    public static final List<Supermarket> VANCOUVER_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.vancouver_sm1, "FreshCo No 2 & Blundell", "Richmond, British Columbia", 3.9,"7:00 AM - 10:00 PM",call("6042747244"),location("6140 Blundell Rd, Richmond, BC V7C 1H8")),
            new Supermarket(R.drawable.vancouver_sm1, "FreshCo No 2 & Blundell", "Richmond, British Columbia", 3.9,"7:00 AM - 10:00 PM",call("6042747244"),location("6140 Blundell Rd, Richmond, BC V7C 1H8")),
            new Supermarket(R.drawable.vancouver_sm1, "FreshCo No 2 & Blundell", "Richmond, British Columbia", 3.9,"7:00 AM - 10:00 PM",call("6042747244"),location("6140 Blundell Rd, Richmond, BC V7C 1H8")),
            new Supermarket(R.drawable.vancouver_sm1, "FreshCo No 2 & Blundell", "Richmond, British Columbia", 3.9,"7:00 AM - 10:00 PM",call("6042747244"),location("6140 Blundell Rd, Richmond, BC V7C 1H8")),
            new Supermarket(R.drawable.vancouver_sm1, "FreshCo No 2 & Blundell", "Richmond, British Columbia", 3.9,"7:00 AM - 10:00 PM",call("6042747244"),location("6140 Blundell Rd, Richmond, BC V7C 1H8"))
    );

    public static final List<Supermarket> SURREY_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.surrey_sm1,"FreshCo 202 St & Dewdney Trunk","Maple Ridge, BC",4.1,"7:00 AM - 10:00 PM",call("6044601553"),location("20201 Lougheed Hwy. #300, Maple Ridge, BC V2X 2P6")),
            new Supermarket(R.drawable.surrey_sm1,"FreshCo 202 St & Dewdney Trunk","Maple Ridge, BC",4.1,"7:00 AM - 10:00 PM",call("6044601553"),location("20201 Lougheed Hwy. #300, Maple Ridge, BC V2X 2P6")),
            new Supermarket(R.drawable.surrey_sm1,"FreshCo 202 St & Dewdney Trunk","Maple Ridge, BC",4.1,"7:00 AM - 10:00 PM",call("6044601553"),location("20201 Lougheed Hwy. #300, Maple Ridge, BC V2X 2P6")),
            new Supermarket(R.drawable.surrey_sm1,"FreshCo 202 St & Dewdney Trunk","Maple Ridge, BC",4.1,"7:00 AM - 10:00 PM",call("6044601553"),location("20201 Lougheed Hwy. #300, Maple Ridge, BC V2X 2P6")),
            new Supermarket(R.drawable.surrey_sm1,"FreshCo 202 St & Dewdney Trunk","Maple Ridge, BC",4.1,"7:00 AM - 10:00 PM",call("6044601553"),location("20201 Lougheed Hwy. #300, Maple Ridge, BC V2X 2P6"))
    );

    public static final List<Supermarket> BURNABY_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.burnaby_sm1, "FreshCo No 3 & Williams", "Richmond, British Columbia", 3.8,"7:00 AM - 10:00 PM",call("6042413153"),location("10151 No. 3 Rd, Richmond, BC V7A 4R6")),
            new Supermarket(R.drawable.burnaby_sm1, "FreshCo No 3 & Williams", "Richmond, British Columbia", 3.8,"7:00 AM - 10:00 PM",call("6042413153"),location("10151 No. 3 Rd, Richmond, BC V7A 4R6")),
            new Supermarket(R.drawable.burnaby_sm1, "FreshCo No 3 & Williams", "Richmond, British Columbia", 3.8,"7:00 AM - 10:00 PM",call("6042413153"),location("10151 No. 3 Rd, Richmond, BC V7A 4R6")),
            new Supermarket(R.drawable.burnaby_sm1, "FreshCo No 3 & Williams", "Richmond, British Columbia", 3.8,"7:00 AM - 10:00 PM",call("6042413153"),location("10151 No. 3 Rd, Richmond, BC V7A 4R6")),
            new Supermarket(R.drawable.burnaby_sm1, "FreshCo No 3 & Williams", "Richmond, British Columbia", 3.8,"7:00 AM - 10:00 PM",call("6042413153"),location("10151 No. 3 Rd, Richmond, BC V7A 4R6"))
    );

    public static final List<Supermarket> HALIFAX_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.halifax_sm1, "Atlantic Superstore Barrington Street", "Halifax, NS", 4.3,"7:00 AM - 10:00 PM",call("9024923240"),location("1075 Barrington St, Halifax, NS B3H 2P8")),
            new Supermarket(R.drawable.halifax_sm1, "Atlantic Superstore Barrington Street", "Halifax, NS", 4.3,"7:00 AM - 10:00 PM",call("9024923240"),location("1075 Barrington St, Halifax, NS B3H 2P8")),
            new Supermarket(R.drawable.halifax_sm1, "Atlantic Superstore Barrington Street", "Halifax, NS", 4.3,"7:00 AM - 10:00 PM",call("9024923240"),location("1075 Barrington St, Halifax, NS B3H 2P8")),
            new Supermarket(R.drawable.halifax_sm1, "Atlantic Superstore Barrington Street", "Halifax, NS", 4.3,"7:00 AM - 10:00 PM",call("9024923240"),location("1075 Barrington St, Halifax, NS B3H 2P8")),
            new Supermarket(R.drawable.halifax_sm1, "Atlantic Superstore Barrington Street", "Halifax, NS", 4.3,"7:00 AM - 10:00 PM",call("9024923240"),location("1075 Barrington St, Halifax, NS B3H 2P8"))
    );

    public static final List<Supermarket> NEW_GLASGOW_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.new_glasgow_sm1, "Atlantic Superstore Westville Road", "394 Westville Rd", 4.3,"7:00 AM - 9:00 PM",call("9029280066"),location("394 Westville Rd, New Glasgow, NS B2H 2J7")),
            new Supermarket(R.drawable.new_glasgow_sm1, "Atlantic Superstore Westville Road", "394 Westville Rd", 4.3,"7:00 AM - 9:00 PM",call("9029280066"),location("394 Westville Rd, New Glasgow, NS B2H 2J7")),
            new Supermarket(R.drawable.new_glasgow_sm1, "Atlantic Superstore Westville Road", "394 Westville Rd", 4.3,"7:00 AM - 9:00 PM",call("9029280066"),location("394 Westville Rd, New Glasgow, NS B2H 2J7")),
            new Supermarket(R.drawable.new_glasgow_sm1, "Atlantic Superstore Westville Road", "394 Westville Rd", 4.3,"7:00 AM - 9:00 PM",call("9029280066"),location("394 Westville Rd, New Glasgow, NS B2H 2J7")),
            new Supermarket(R.drawable.new_glasgow_sm1, "Atlantic Superstore Westville Road", "394 Westville Rd", 4.3,"7:00 AM - 9:00 PM",call("9029280066"),location("394 Westville Rd, New Glasgow, NS B2H 2J7"))
    );

    public static final List<Supermarket> TORONTO_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.toronto_sm1, "Super Asia Foods", "Vaughan, ON", 4.8,"8:00 AM - 6:00 PM",call("4167465550"),location("8905 Hwy 50 Unit 7, Vaughan, ON L4H 5A1")),
            new Supermarket(R.drawable.toronto_sm1, "Super Asia Foods", "Vaughan, ON", 4.8,"8:00 AM - 6:00 PM",call("4167465550"),location("8905 Hwy 50 Unit 7, Vaughan, ON L4H 5A1")),
            new Supermarket(R.drawable.toronto_sm1, "Super Asia Foods", "Vaughan, ON", 4.8,"8:00 AM - 6:00 PM",call("4167465550"),location("8905 Hwy 50 Unit 7, Vaughan, ON L4H 5A1")),
            new Supermarket(R.drawable.toronto_sm1, "Super Asia Foods", "Vaughan, ON", 4.8,"8:00 AM - 6:00 PM",call("4167465550"),location("8905 Hwy 50 Unit 7, Vaughan, ON L4H 5A1")),
            new Supermarket(R.drawable.toronto_sm1, "Super Asia Foods", "Vaughan, ON", 4.8,"8:00 AM - 6:00 PM",call("4167465550"),location("8905 Hwy 50 Unit 7, Vaughan, ON L4H 5A1"))
    );

    public static final List<Supermarket> BRAMPTON_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.brampton_sm1, "Ample Food Market", "235 Fletchers Creek Blvd", 3.7,"9:00 AM - 9:00 PM",call("9054553575"),location("235 Fletchers Creek Blvd, Brampton, ON L6X 0Y7")),
            new Supermarket(R.drawable.brampton_sm1, "Ample Food Market", "235 Fletchers Creek Blvd", 3.7,"9:00 AM - 9:00 PM",call("9054553575"),location("235 Fletchers Creek Blvd, Brampton, ON L6X 0Y7")),
            new Supermarket(R.drawable.brampton_sm1, "Ample Food Market", "235 Fletchers Creek Blvd", 3.7,"9:00 AM - 9:00 PM",call("9054553575"),location("235 Fletchers Creek Blvd, Brampton, ON L6X 0Y7")),
            new Supermarket(R.drawable.brampton_sm1, "Ample Food Market", "235 Fletchers Creek Blvd", 3.7,"9:00 AM - 9:00 PM",call("9054553575"),location("235 Fletchers Creek Blvd, Brampton, ON L6X 0Y7")),
            new Supermarket(R.drawable.brampton_sm1, "Ample Food Market", "235 Fletchers Creek Blvd", 3.7,"9:00 AM - 9:00 PM",call("9054553575"),location("235 Fletchers Creek Blvd, Brampton, ON L6X 0Y7"))
    );

    public static final List<Supermarket> WINDSOR_SUPERMARKET = Arrays.asList(
            new Supermarket(R.drawable.windsor_sm1, "Walmart Supercenter", "3120 Dougall Ave", 3.8,"7:00 AM - 10:00 PM",call("5199698121"),location("3120 Dougall Ave, Windsor, ON N9E 1S7")),
            new Supermarket(R.drawable.windsor_sm1, "Walmart Supercenter", "3120 Dougall Ave", 3.8,"7:00 AM - 10:00 PM",call("5199698121"),location("3120 Dougall Ave, Windsor, ON N9E 1S7")),
            new Supermarket(R.drawable.windsor_sm1, "Walmart Supercenter", "3120 Dougall Ave", 3.8,"7:00 AM - 10:00 PM",call("5199698121"),location("3120 Dougall Ave, Windsor, ON N9E 1S7")),
            new Supermarket(R.drawable.windsor_sm1, "Walmart Supercenter", "3120 Dougall Ave", 3.8,"7:00 AM - 10:00 PM",call("5199698121"),location("3120 Dougall Ave, Windsor, ON N9E 1S7")),
            new Supermarket(R.drawable.windsor_sm1, "Walmart Supercenter", "3120 Dougall Ave", 3.8,"7:00 AM - 10:00 PM",call("5199698121"),location("3120 Dougall Ave, Windsor, ON N9E 1S7"))
    );
}
