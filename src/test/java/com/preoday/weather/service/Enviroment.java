package com.preoday.weather.service;

public class Enviroment {

    public static String getWeatherNoSol() {
        return "{\n" +
               "    \"sol_keys\": []\n" +
               "}";
    }

    public static String getWeatherFull() {
        return "{\n" +
               "  \"410\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -68.223,\n" +
               "      \"ct\": 235191,\n" +
               "      \"mn\": -97.503,\n" +
               "      \"mx\": -12.526\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-21T11:41:41Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 5.028,\n" +
               "      \"ct\": 108604,\n" +
               "      \"mn\": 0.20800000000000002,\n" +
               "      \"mx\": 19.692\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-22T12:21:15Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 634.056,\n" +
               "      \"ct\": 118395,\n" +
               "      \"mn\": 613.0104,\n" +
               "      \"mx\": 642.518\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 188\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 282\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 794\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 1929\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 2603\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 8215\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 18983\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 26080\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 13118\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 6792\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 5144\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 8405\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 14332\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1528\n" +
               "      },\n" +
               "      \"15\": {\n" +
               "        \"compass_degrees\": 337.5,\n" +
               "        \"compass_point\": \"NNW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 211\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 26080\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"411\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -63.387,\n" +
               "      \"ct\": 345562,\n" +
               "      \"mn\": -96.357,\n" +
               "      \"mx\": -16.701\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-22T12:21:16Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 5.19,\n" +
               "      \"ct\": 157831,\n" +
               "      \"mn\": 0.23199999999999998,\n" +
               "      \"mx\": 22.711\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-23T13:00:50Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 633.201,\n" +
               "      \"ct\": 159914,\n" +
               "      \"mn\": 613.3752,\n" +
               "      \"mx\": 646.0127\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 276\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 420\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 792\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 3960\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 6108\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 15291\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 27243\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 29929\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 22461\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 9016\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 8735\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 17057\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 15119\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1000\n" +
               "      },\n" +
               "      \"15\": {\n" +
               "        \"compass_degrees\": 337.5,\n" +
               "        \"compass_point\": \"NNW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 424\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 29929\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"412\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -63.898,\n" +
               "      \"ct\": 223325,\n" +
               "      \"mn\": -96.889,\n" +
               "      \"mx\": -14.483\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-23T13:00:51Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 5.479,\n" +
               "      \"ct\": 101049,\n" +
               "      \"mn\": 0.205,\n" +
               "      \"mx\": 19.680999999999997\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-24T10:40:03Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 633.033,\n" +
               "      \"ct\": 108946,\n" +
               "      \"mn\": 610.9265,\n" +
               "      \"mx\": 645.6487\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 295\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 539\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1750\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 4675\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 3357\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 9834\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 18811\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 26663\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 14920\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 9381\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 2498\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 2720\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 3654\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1610\n" +
               "      },\n" +
               "      \"15\": {\n" +
               "        \"compass_degrees\": 337.5,\n" +
               "        \"compass_point\": \"NNW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 342\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 26663\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"413\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -62.178,\n" +
               "      \"ct\": 194990,\n" +
               "      \"mn\": -96.491,\n" +
               "      \"mx\": -15.965\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-24T14:04:52Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 5.537,\n" +
               "      \"ct\": 70955,\n" +
               "      \"mn\": 0.20800000000000002,\n" +
               "      \"mx\": 19.764\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-25T14:20:00Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 632.005,\n" +
               "      \"ct\": 96980,\n" +
               "      \"mn\": 609.6062,\n" +
               "      \"mx\": 644.5435\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 222\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 143\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 257\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 1414\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 4082\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 10063\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 16228\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 12694\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 739\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 1775\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 5198\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 15612\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 1890\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 402\n" +
               "      },\n" +
               "      \"15\": {\n" +
               "        \"compass_degrees\": 337.5,\n" +
               "        \"compass_point\": \"NNW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 236\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 16228\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"414\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -62.603,\n" +
               "      \"ct\": 177556,\n" +
               "      \"mn\": -95.676,\n" +
               "      \"mx\": -15.883\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-25T14:20:01Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 4.829,\n" +
               "      \"ct\": 81676,\n" +
               "      \"mn\": 0.251,\n" +
               "      \"mx\": 21.258000000000003\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-26T14:59:37Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 630.505,\n" +
               "      \"ct\": 88775,\n" +
               "      \"mn\": 609.3487,\n" +
               "      \"mx\": 644.6166\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 159\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 154\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1490\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 5563\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 4664\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 9170\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 11175\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 11240\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 7106\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 3334\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 2177\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 14683\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 8875\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1556\n" +
               "      },\n" +
               "      \"15\": {\n" +
               "        \"compass_degrees\": 337.5,\n" +
               "        \"compass_point\": \"NNW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 330\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 14683\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"415\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -63.985,\n" +
               "      \"ct\": 195324,\n" +
               "      \"mn\": -95.061,\n" +
               "      \"mx\": -14.304\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-26T14:59:38Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 4.717,\n" +
               "      \"ct\": 86479,\n" +
               "      \"mn\": 0.24100000000000002,\n" +
               "      \"mx\": 20.748\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-27T15:39:11Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 631.46,\n" +
               "      \"ct\": 97661,\n" +
               "      \"mn\": 609.3724,\n" +
               "      \"mx\": 646.2223\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 6\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 29\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 360\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 2098\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 3532\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 12532\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 13528\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 6643\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 12420\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 2286\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 3085\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 28219\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 1740\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 28219\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"416\": {\n" +
               "    \"AT\": {\n" +
               "      \"av\": -67.565,\n" +
               "      \"ct\": 235303,\n" +
               "      \"mn\": -93.946,\n" +
               "      \"mx\": -14.501\n" +
               "    },\n" +
               "    \"First_UTC\": \"2020-01-27T15:39:12Z\",\n" +
               "    \"HWS\": {\n" +
               "      \"av\": 4.655,\n" +
               "      \"ct\": 110611,\n" +
               "      \"mn\": 0.239,\n" +
               "      \"mx\": 20.153\n" +
               "    },\n" +
               "    \"Last_UTC\": \"2020-01-28T16:18:46Z\",\n" +
               "    \"PRE\": {\n" +
               "      \"av\": 629.499,\n" +
               "      \"ct\": 159825,\n" +
               "      \"mn\": 607.2901,\n" +
               "      \"mx\": 644.7109\n" +
               "    },\n" +
               "    \"Season\": \"summer\",\n" +
               "    \"WD\": {\n" +
               "      \"0\": {\n" +
               "        \"compass_degrees\": 0.0,\n" +
               "        \"compass_point\": \"N\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": 1.0,\n" +
               "        \"ct\": 371\n" +
               "      },\n" +
               "      \"1\": {\n" +
               "        \"compass_degrees\": 22.5,\n" +
               "        \"compass_point\": \"NNE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 612\n" +
               "      },\n" +
               "      \"2\": {\n" +
               "        \"compass_degrees\": 45.0,\n" +
               "        \"compass_point\": \"NE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1379\n" +
               "      },\n" +
               "      \"3\": {\n" +
               "        \"compass_degrees\": 67.5,\n" +
               "        \"compass_point\": \"ENE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 5186\n" +
               "      },\n" +
               "      \"5\": {\n" +
               "        \"compass_degrees\": 112.5,\n" +
               "        \"compass_point\": \"ESE\",\n" +
               "        \"compass_right\": 0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 4182\n" +
               "      },\n" +
               "      \"6\": {\n" +
               "        \"compass_degrees\": 135.0,\n" +
               "        \"compass_point\": \"SE\",\n" +
               "        \"compass_right\": 0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 7687\n" +
               "      },\n" +
               "      \"7\": {\n" +
               "        \"compass_degrees\": 157.5,\n" +
               "        \"compass_point\": \"SSE\",\n" +
               "        \"compass_right\": 0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 13042\n" +
               "      },\n" +
               "      \"8\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 20633\n" +
               "      },\n" +
               "      \"9\": {\n" +
               "        \"compass_degrees\": 202.5,\n" +
               "        \"compass_point\": \"SSW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": -0.923879532511,\n" +
               "        \"ct\": 19001\n" +
               "      },\n" +
               "      \"10\": {\n" +
               "        \"compass_degrees\": 225.0,\n" +
               "        \"compass_point\": \"SW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": -0.707106781187,\n" +
               "        \"ct\": 4721\n" +
               "      },\n" +
               "      \"11\": {\n" +
               "        \"compass_degrees\": 247.5,\n" +
               "        \"compass_point\": \"WSW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": -0.382683432365,\n" +
               "        \"ct\": 8012\n" +
               "      },\n" +
               "      \"12\": {\n" +
               "        \"compass_degrees\": 270.0,\n" +
               "        \"compass_point\": \"W\",\n" +
               "        \"compass_right\": -1.0,\n" +
               "        \"compass_up\": -0.0,\n" +
               "        \"ct\": 18984\n" +
               "      },\n" +
               "      \"13\": {\n" +
               "        \"compass_degrees\": 292.5,\n" +
               "        \"compass_point\": \"WNW\",\n" +
               "        \"compass_right\": -0.923879532511,\n" +
               "        \"compass_up\": 0.382683432365,\n" +
               "        \"ct\": 5106\n" +
               "      },\n" +
               "      \"14\": {\n" +
               "        \"compass_degrees\": 315.0,\n" +
               "        \"compass_point\": \"NW\",\n" +
               "        \"compass_right\": -0.707106781187,\n" +
               "        \"compass_up\": 0.707106781187,\n" +
               "        \"ct\": 1269\n" +
               "      },\n" +
               "      \"15\": {\n" +
               "        \"compass_degrees\": 337.5,\n" +
               "        \"compass_point\": \"NNW\",\n" +
               "        \"compass_right\": -0.382683432365,\n" +
               "        \"compass_up\": 0.923879532511,\n" +
               "        \"ct\": 426\n" +
               "      },\n" +
               "      \"most_common\": {\n" +
               "        \"compass_degrees\": 180.0,\n" +
               "        \"compass_point\": \"S\",\n" +
               "        \"compass_right\": 0.0,\n" +
               "        \"compass_up\": -1.0,\n" +
               "        \"ct\": 20633\n" +
               "      }\n" +
               "    }\n" +
               "  },\n" +
               "  \"sol_keys\": [\n" +
               "    \"410\",\n" +
               "    \"411\",\n" +
               "    \"412\",\n" +
               "    \"413\",\n" +
               "    \"414\",\n" +
               "    \"415\",\n" +
               "    \"416\"\n" +
               "  ],\n" +
               "  \"validity_checks\": {\n" +
               "    \"410\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"411\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"412\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"413\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          1,\n" +
               "          2,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          1,\n" +
               "          2,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"414\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"415\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"416\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9,\n" +
               "          10,\n" +
               "          11,\n" +
               "          12,\n" +
               "          13,\n" +
               "          14,\n" +
               "          15,\n" +
               "          16,\n" +
               "          17,\n" +
               "          18,\n" +
               "          19,\n" +
               "          20,\n" +
               "          21,\n" +
               "          22,\n" +
               "          23\n" +
               "        ],\n" +
               "        \"valid\": true\n" +
               "      }\n" +
               "    },\n" +
               "    \"417\": {\n" +
               "      \"AT\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9\n" +
               "        ],\n" +
               "        \"valid\": false\n" +
               "      },\n" +
               "      \"HWS\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9\n" +
               "        ],\n" +
               "        \"valid\": false\n" +
               "      },\n" +
               "      \"PRE\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9\n" +
               "        ],\n" +
               "        \"valid\": false\n" +
               "      },\n" +
               "      \"WD\": {\n" +
               "        \"sol_hours_with_data\": [\n" +
               "          0,\n" +
               "          1,\n" +
               "          2,\n" +
               "          3,\n" +
               "          4,\n" +
               "          5,\n" +
               "          6,\n" +
               "          7,\n" +
               "          8,\n" +
               "          9\n" +
               "        ],\n" +
               "        \"valid\": false\n" +
               "      }\n" +
               "    },\n" +
               "    \"sol_hours_required\": 18,\n" +
               "    \"sols_checked\": [\n" +
               "      \"410\",\n" +
               "      \"411\",\n" +
               "      \"412\",\n" +
               "      \"413\",\n" +
               "      \"414\",\n" +
               "      \"415\",\n" +
               "      \"416\",\n" +
               "      \"417\"\n" +
               "    ]\n" +
               "  }\n" +
               "}";
    }
}
