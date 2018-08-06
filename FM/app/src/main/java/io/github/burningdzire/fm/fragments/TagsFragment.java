package io.github.burningdzire.fm.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.github.burningdzire.fm.R;
import io.github.burningdzire.fm.adapters.TagsFragmentAdapter;
import io.github.burningdzire.fm.rest.Meta;
import io.github.burningdzire.fm.models.modelTags.Tag;
import io.github.burningdzire.fm.models.modelTags.TagsResponse;
import io.github.burningdzire.fm.rest.NetworkClient;
import io.github.burningdzire.fm.rest.NetworkInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TagsFragment extends Fragment implements TagsFragmentAdapter.TagsFragmentClickListener{

    private static String LOG_TAG = TagsFragment.class.getSimpleName();
    private RecyclerView recyclerView;
    private TagsFragmentAdapter tagsFragmentAdapter;
    private List<Tag> mTags;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tags, container, false);

        NetworkInterface networkInterface = NetworkClient.getClient().create(NetworkInterface.class);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_fragment_container_tags);
        recyclerView.setAdapter(tagsFragmentAdapter);

        Call<TagsResponse> call = networkInterface.getTopTags(Meta.GET_TOP_TAGS, Meta.API_KEY, Meta.FORMAT);
        call.enqueue(new Callback<TagsResponse>() {
            @Override
            public void onResponse(Call<TagsResponse> call, Response<TagsResponse> response) {
                mTags = response.body().getToptags().getTag();
                tagsFragmentAdapter = new TagsFragmentAdapter(mTags, R.layout.fragment_tags, getContext(), TagsFragment.this);
                recyclerView.setAdapter(tagsFragmentAdapter);
            }

            @Override
            public void onFailure(Call<TagsResponse> call, Throwable t) {

            }
        });
        return rootView;
    }

    @Override
    public void onTagClick(String tag) {

    }
}
