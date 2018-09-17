package com.evontech.demo.demodagger.mvvm.screens.demo_list.tutoriallist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evontech.demo.demodagger.R;
import com.evontech.demo.demodagger.databinding.TutorialListCardBinding;

import java.util.List;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialAdapter.MyHolder>{

    private List<TutorialModel> tutorialViewModel;
    private final String TAG = getClass().getSimpleName();

    TutorialAdapter(List<TutorialModel> tutorialViewModel){
        this.tutorialViewModel = tutorialViewModel;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        TutorialListCardBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(viewGroup.getContext()),
                R.layout.tutorial_list_card, viewGroup, false);

        MyHolder viewHolder = new MyHolder(binding);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        TutorialModel tutorialModel = tutorialViewModel.get(i);
        myHolder.tutorialListCardBinding.setTutorialmodel(tutorialModel);
    }

    @Override
    public int getItemCount() {
        return tutorialViewModel.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        TutorialListCardBinding tutorialListCardBinding;

        MyHolder(@NonNull TutorialListCardBinding binding) {
            super(binding.getRoot());
            this.tutorialListCardBinding = binding;
        }
    }
}
