package com.example.lims_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.levitnudi.legacytableview.LegacyTableView;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DisplayBatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_batch);


        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url =Config.URL_SAMPLE;

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
//                        Gson gson = new Gson();
//                        ArrayList<DataModal> datamodal = new ArrayList();
//                         dataModal = gson.fromJson(response, DataModal.class);
//                        dataResponse.getBatchid();

                        Gson gson = new Gson();

                        Type founderListType = new TypeToken<ArrayList<DataModal>>(){}.getType();

                        List<DataModal> founderList = gson.fromJson(response, founderListType);


//                        for(int i=0;i<founderList.size();i++){


                        LegacyTableView.insertLegacyTitle("Batch Id", "Recieved By", "Site", "Batch No");
                        //set table contents as string arrays

                        for (int i = 0; i<founderList.size(); i++){
                            LegacyTableView.insertLegacyContent(founderList.get(i).getBatchid(),
                                    founderList.get(i).getReceivedby(),founderList.get(i).getSite(), founderList.get(i).getCocnumber());
                        }

                        LegacyTableView legacyTableView = (LegacyTableView)findViewById(R.id.legacy_table_view);
                        legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
                        legacyTableView.setContent(LegacyTableView.readLegacyContent());
                        legacyTableView.setTableFooterTextSize(18);
                        legacyTableView.setTableFooterTextColor("#f32853");
                        legacyTableView.setHeaderBackgroundLinearGradientBOTTOM("#f32853");
                        //depending on the phone screen size default table scale is 100
                        //you can change it using this method
                        //legacyTableView.setInitialScale(100);//default initialScale is zero (0)

                        //if you want a smaller table, change the padding setting
                        legacyTableView.setTablePadding(7);

                        //to enable users to zoom in and out:
                        legacyTableView.setZoomEnabled(true);
                        legacyTableView.setShowZoomControls(true);

                        //remember to build your table as the last step
                        legacyTableView.build();

                        //  }



                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });
        queue.add(stringRequest);

    }
}
