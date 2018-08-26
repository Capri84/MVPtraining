package com.example.android.mvptraining;

public class Presenter implements Contract.Presenter {

    private Contract.View view;
    private Contract.Model model;
    String input;

    public Presenter(Contract.View view) {
        this.view = view;
        this.model = new Model();
    }

    @Override
    public void onButtonClicked() {
        input = view.readUserInput();
        model.saveUserInput(input);
        input = model.returnUserInput();
        view.clearField();
        view.displayText(input);
    }

    @Override
    public void onDestroy() {
        // Empty
    }
}
