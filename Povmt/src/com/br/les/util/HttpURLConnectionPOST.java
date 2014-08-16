
package com.br.les.util;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.GsonBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class HttpURLConnectionPOST extends AsyncTask<String, Void, Void> {

    private static final String HEADERVALUE = "application/json";
    private static final String MAIL = "test.dahorta@gmail.com";

    public static HttpResponse makeRequest(final String uri, final String json) {
        try {
            HttpPost httpPost = new HttpPost(uri);
            System.out.println("### 1 ");
            httpPost.setEntity(new StringEntity(json));
            System.out.println("### 2 ");
            httpPost.setHeader("Accept", HEADERVALUE);
            System.out.println("### 3 ");
            httpPost.setHeader("Content-type", HEADERVALUE);
            System.out.println("### 4 ");
            httpPost.setHeader("Request Method", "POST");
            return new DefaultHttpClient().execute(httpPost);

        } catch (UnsupportedEncodingException e) {
            System.out.println("### ERRO1 ");
            Log.e("POST", e.getMessage());
        } catch (ClientProtocolException e) {
            System.out.println("### ERRO2 ");
            Log.e("POST", e.getMessage());
        } catch (IOException e) {
            System.out.println("### ERRO3 ");
            Log.e("POST", e.getMessage());
        }
        System.out.println("#### null");
        return null;
    }

    @Override
    protected final Void doInBackground(final String... params) {
        String url = "http://les-timeitup.appspot.com/put_user";
        String inJson = params[0];

        System.out.println("#### EMAIL: " + MAIL);


        Map<String, String> comment = new HashMap<String, String>();
        comment.put("data", inJson);
        comment.put("mail", MAIL);
        String json = new GsonBuilder().create().toJson(comment, Map.class);
        System.out.println("### JSON MAP: " + json);
        System.out.println("#### RESPONSE: "
                + makeRequest(url, json).getStatusLine());

        return null;
    }

}
