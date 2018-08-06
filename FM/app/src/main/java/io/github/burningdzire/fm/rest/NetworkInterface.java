package io.github.burningdzire.fm.rest;

import io.github.burningdzire.fm.models.modelAlbums.*;
import io.github.burningdzire.fm.models.modelArtists.*;
import io.github.burningdzire.fm.models.modelTracks.*;
import io.github.burningdzire.fm.models.modelTags.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NetworkInterface {

//    http://ws.audioscrobbler.com/2.0/?method=tag.getTopTags&api_key=YOUR_API_KEY&format=json
    @GET("2.0")
    Call<TagsResponse> getTopTags(@Query("method") String method,
                                  @Query("api_key") String api_key,
                                  @Query("format") String format);

//    http://ws.audioscrobbler.com/2.0/?method=tag.gettopalbums&tag=disco&api_key=YOUR_API_KEY&format=json
    @GET("2.0")
    Call<ModelAlbums_Root> getTopAlbums(@Query("method") String method,
                                        @Query("tag") String tag,
                                        @Query("api_key") String api_key,
                                        @Query("format") String format);


//    http://ws.audioscrobbler.com/2.0/?method=tag.gettopartists&tag=disco&api_key=YOUR_API_KEY&format=json
    @GET("2.0")
    Call<ModelArtist_Root> getTopArtists(@Query("method") String method,
                                         @Query("tag") String tag,
                                         @Query("api_key") String api_key,
                                         @Query("format") String format);

//    http://ws.audioscrobbler.com/2.0/?method=tag.gettopalbums&tag=disco&api_key=YOUR_API_KEY&format=json
    @GET("2.0")
    Call<ModelTrack_Root> getTopTracks(@Query("method") String method,
                                       @Query("tag") String tag,
                                       @Query("api_key") String api_key,
                                       @Query("format") String format);


}
