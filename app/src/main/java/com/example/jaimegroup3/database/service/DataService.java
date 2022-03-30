package com.example.jaimegroup3.database.service;

import android.content.Context;
import android.os.AsyncTask;

import com.example.jaimegroup3.database.DatabaseClient;
import com.example.jaimegroup3.database.EventModel;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class DataService {

    private Context context;

    public DataService(Context context) {
        this.context = context;
    }

    //cart data
    public List<EventModel> getAllEvent() {
        try {
            return new GetEventDataAsyncTask().execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private class GetEventDataAsyncTask extends AsyncTask<Void, Void, List<EventModel>> {
        @Override
        protected List<EventModel> doInBackground(Void... url) {
            return DatabaseClient.getInstance(context).getAppDatabase().eventMasterDao().getAllEvent();
        }
    }

    //get user wise event
    public List<EventModel> getUserWiseEvent(String id) {
        try {
            return new GetUserWiseDataAsyncTask(id).execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private class GetUserWiseDataAsyncTask extends AsyncTask<Void, Void, List<EventModel>> {
        String id;

        public GetUserWiseDataAsyncTask(String id) {
            this.id = id;
        }

        @Override
        protected List<EventModel> doInBackground(Void... url) {
            return DatabaseClient.getInstance(context).getAppDatabase().eventMasterDao().getAllEvent();
        }
    }
}
