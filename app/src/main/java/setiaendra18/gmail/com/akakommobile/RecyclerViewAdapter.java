package setiaendra18.gmail.com.akakommobile;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.NewsViewHolder>{

    private List<News> newses;
    private Context context;

    public RecyclerViewAdapter(List<News> newses, Context context) {
        this.newses = newses;
        this.context=context;
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        ImageView news_photo;
        TextView news_title;
        TextView news_desc;
        Button readMore;

        public NewsViewHolder(final View itemView) {
            super(itemView);
            cardView= (CardView) itemView.findViewById(R.id.card_view);
            news_photo= (ImageView) itemView.findViewById(R.id.news_photo);
            news_title= (TextView) itemView.findViewById(R.id.news_title);
            news_desc= (TextView) itemView.findViewById(R.id.news_desc);
            readMore= (Button) itemView.findViewById(R.id.btn_more);

        }


    }
    @Override
    public RecyclerViewAdapter.NewsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(context).inflate(R.layout.news_item,viewGroup,false);
        NewsViewHolder nvh=new NewsViewHolder(v);
        return nvh;
    }



    @Override
    public void onBindViewHolder(RecyclerViewAdapter.NewsViewHolder personViewHolder, int i) {
        final int j=i;
        personViewHolder.news_photo.setImageResource(newses.get(i).getPhotoId());
        personViewHolder.news_title.setText(newses.get(i).getTitle());
        personViewHolder.news_desc.setText(newses.get(i).getDesc());

        personViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,NewsActivity.class);
                intent.putExtra("News",newses.get(j));
                context.startActivity(intent);
            }
        });

        personViewHolder.readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,NewsActivity.class);
                intent.putExtra("News",newses.get(j));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return newses.size();
    }
}
