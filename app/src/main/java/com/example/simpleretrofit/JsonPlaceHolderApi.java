package com.example.simpleretrofit;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;


public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts")
    Call<List<Post>> getPosts(@Query("id") int id);

    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("id") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId") Integer userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String, String> parametrs);

    @GET("/posts/2/comments")
    Call<List<Comment>> getCommets();

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int id);

    @GET
    Call<List<Comment>> getCommets(@Url String url);

    @POST("posts")
    Call<Post> createPost(@Body Post post);

}
