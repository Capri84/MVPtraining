package com.example.android.mvptraining;

public class Model implements Contract.Model {

    String etMessage;

    @Override
    public void saveUserInput(String input) {
        etMessage = input;
    }

    @Override
    public String returnUserInput() {
        return etMessage;
    }
}
