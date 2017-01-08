package org.asdtm.inmovie.service;

import org.asdtm.inmovie.model.Movie;
import org.asdtm.inmovie.model.MovieResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieService {

    @GET("movie/{movie_id}")
    Call<Movie> movieDetails(
            @Path("movie_id") String id,
            @Query("api_key") String api_key,
            @Query("language") String lang
    );

    @GET("movie/now_playing")
    Call<MovieResults> nowPlaying(
            @Query("api_key") String api_key,
            @Query("language") String lang,
            @Query("page") int page
    );

    @GET("movie/popular")
    Call<MovieResults> popular(
            @Query("api_key") String api_key,
            @Query("language") String lang,
            @Query("page") int page
    );

    @GET("movie/top_rated")
    Call<MovieResults> topRated(
            @Query("api_key") String api_key,
            @Query("language") String lang,
            @Query("page") int page
    );

    @GET("movie/upcoming")
    Call<MovieResults> upcoming(
            @Query("api_key") String api_key,
            @Query("language") String lang,
            @Query("page") int page

    );
}
