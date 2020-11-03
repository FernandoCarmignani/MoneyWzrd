package ISpyCorp.MZ.moneywzrd.expenses;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ISpyCorp.MZ.moneywzrd.R;

public class Expenses extends Fragment {

    private ExpensesViewModel mViewModel;

    public static Expenses newInstance() {
        return new Expenses();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.expenses_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ExpensesViewModel.class);
        // TODO: Use the ViewModel
    }

}