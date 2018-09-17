package com.evontech.demo.demodagger.mvvm.Adapters;

import android.databinding.BindingAdapter;
import android.text.TextWatcher;
import android.widget.EditText;

public class EditTextBindingAdapter {
    @BindingAdapter("textChangedListener")
    public static void bindTextWatcher(EditText editText, TextWatcher textWatcher) {
        editText.addTextChangedListener(textWatcher);
    }
}
