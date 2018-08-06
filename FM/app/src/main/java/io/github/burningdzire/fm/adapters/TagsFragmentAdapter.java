package io.github.burningdzire.fm.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.burningdzire.fm.R;
import io.github.burningdzire.fm.fragments.TagsFragment;
import io.github.burningdzire.fm.models.modelTags.Tag;

public class TagsFragmentAdapter extends RecyclerView.Adapter<TagsFragmentAdapter.TagsFragmentViewHolder> {

    private List<Tag> mTags;
    private Context mContext;
    private int mRowLayout;
    private final TagsFragmentClickListener mTagsFragmentClickListener;

//    Click Listener
    public interface TagsFragmentClickListener{
        void onTagClick(String tag);
    }

//    Constructor
    public TagsFragmentAdapter(List<Tag> tags, int rowLayout, Context context, TagsFragmentClickListener tagsFragmentClickListener)
    {
        this.mTags = tags;
        this.mRowLayout = rowLayout;
        this.mContext = context;
        this.mTagsFragmentClickListener = tagsFragmentClickListener;
    }

    @NonNull
    @Override
    public TagsFragmentAdapter.TagsFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(mRowLayout, parent, false);
        return new TagsFragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TagsFragmentAdapter.TagsFragmentViewHolder holder, int position) {
        String tag = mTags.get(position).getName();
        tag.
    }

    @Override
    public int getItemCount() {
        return mTags.size();
    }

    public class TagsFragmentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView TagName;
        public TagsFragmentViewHolder(View itemView) {
            super(itemView);
            TagName = (TextView) itemView.findViewById(R.id.tv_tags_name);
            TagName.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            String tag = mTags.get(clickedPosition).getName();
            mTagsFragmentClickListener.onTagClick(tag);

        }
    }
}
