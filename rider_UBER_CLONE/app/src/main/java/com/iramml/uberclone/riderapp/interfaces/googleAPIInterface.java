package com.iramml.uberclone.riderapp.interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface googleAPIInterface {
    @GET
    Call<String> getPath( @Url String url);
    //@Url
}
