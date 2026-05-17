package com.example.movieslistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends
        RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    ArrayList<Movie> movieList;

    public MovieAdapter(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public static class ViewHolder
            extends RecyclerView.ViewHolder {

        ImageView imgMovie;
        TextView tvMovieName, tvRating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgMovie =
                    itemView.findViewById(R.id.imgMovie);

            tvMovieName =
                    itemView.findViewById(R.id.tvMovieName);

            tvRating =
                    itemView.findViewById(R.id.tvRating);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(
                        parent.getContext())
                .inflate(
                        R.layout.movie_item,
                        parent,
                        false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ViewHolder holder,
            int position) {

        Movie movie =
                movieList.get(position);

        holder.imgMovie.setImageResource(
                movie.getImage());

        holder.tvMovieName.setText(
                movie.getName());

        holder.tvRating.setText(
                movie.getRating());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}