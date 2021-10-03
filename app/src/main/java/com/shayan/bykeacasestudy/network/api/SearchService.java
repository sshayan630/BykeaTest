package com.shayan.bykeacasestudy.network.api;

import com.shayan.bykeacasestudy.network.model.SearchResultModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {

    String ENTITY_TYPE_MUSIC_TRACK = "musicTrack";

    @GET("search")
    Call<SearchResultModel> getSearchResults(
            @Query("term") CharSequence searchTerm,
            @Query("entity") String entityType
    );
}
