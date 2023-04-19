/*
package com.sharma.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class APICall {
    public static void main(String[] args) throws IOException {
        int result = Result.getWinnerTotalGoals();
    }
}

class Result {

    */
/*
     * Complete the 'getWinnerTotalGoals' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING competition
     *  2. INTEGER year
     *//*


    public static int getWinnerTotalGoals() {
        try {
            String footapi = "https://jsonmock.hackerrank.com/api/football_competitions?name=UEFA%20Champions%20League&year=2011";
            URL urlForGetRequest = new URL(footapi);
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");

            int responseCode = conection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                // print result
                System.out.println("JSON String Result 1" + response.toString());
                // typecasting obj to JSONObject

                //Read JSON response and print
                JSONObject jsonObject = new JSONObject();
                // parser.

                JSONParser jparsr = new JSONParser();
                jsonObject = (JSONObject) jparsr.parse(response.toString());

                System.out.println("statusCode- " + jsonObject);

                System.out.println("statusCode- " + jsonObject.get("data"));
                JSONArray jarr = (JSONArray) jsonObject.get("data");
                System.out.println("statusCode- " + jarr);


                //GetAndPost.POSTRequest(response.toString());
            } else {
                System.out.println("GET NOT WORKED");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            String footapi = "https://jsonmock.hackerrank.com/api/football_competitions?name=English%20Premier%20League&year=2014";
            URL urlForGetRequest = new URL(footapi);
            String readLine = null;
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestMethod("GET");

            int responseCode = conection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conection.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in.readLine()) != null) {
                    response.append(readLine);
                }
                in.close();
                // print result
                System.out.println("JSON String Result 2" + response.toString());
                //GetAndPost.POSTRequest(response.toString());
            } else {
                System.out.println("GET NOT WORKED");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return 1;

    }

}



*/
