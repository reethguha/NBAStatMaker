import java.io.*;
import java.net.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.*;

import java.nio.Buffer;
import java.util.Map;

public class Request {
    private static final String URL = "https://www.balldontlie.io/api/v1/players";
    private static final String avgURL = "https://www.balldontlie.io/api/v1/season_averages";
    private String firstName;
    private String lastName;
    private String seasons;
    private String seasonavg;
    private long nameID;

    public String getFirstName() {
        UserInterface firstNameUI = new UserInterface();
        firstName.equals(firstNameUI.inputFirstName());
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        UserInterface lastNameUI = new UserInterface();
        lastName.equals(lastNameUI.inputLastName());
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String setName() throws Exception
    {
        String URLrequest;
        URLrequest = URL + "?search=" + firstName + "_" + lastName;
        URL url = new URL(URLrequest);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        JSONParser parser = new JSONParser();
        Map playerName = (Map) parser.parse(in);
        JSONArray a = (JSONArray)playerName.get("data");
        Map m = (Map)a.get(0);
        nameID = (long)m.get("id");
        System.out.println("Player id:" + m.get("id"));
        return URLrequest;
    }
    public String getSeasons() {
        UserInterface seasonsUI = new UserInterface();
        seasons.equals(seasonsUI.seasons());
        return seasons;
    }

    public void setSeasons(String seasons) { this.seasons = seasons; }

    public String getSeasonavg()
    {
        return seasonavg;
    }

    public void setSeasonavg(String seasonavg) throws Exception
    {
        seasonavg = avgURL + "?season=" + seasons + "&player_ids[]="+nameID;
        URL a = new URL(seasonavg);
        System.out.println(seasonavg);
        BufferedReader q = new BufferedReader(new InputStreamReader(a.openStream()));
        JSONParser p = new JSONParser();
        Map data = (Map) p.parse(q);
        JSONArray l = (JSONArray) data.get("data");
        System.out.println(l);

    }
}