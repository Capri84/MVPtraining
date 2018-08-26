package com.example.android.mvptraining;

import android.text.Editable;

public interface Contract {

    interface Model {
        void saveUserInput(String input);
        String returnUserInput();
    }

    interface View {
        String readUserInput();
        void clearField();
        void displayText(String message);
    }

    interface Presenter {
        void onButtonClicked();
        void onDestroy();
    }
}
