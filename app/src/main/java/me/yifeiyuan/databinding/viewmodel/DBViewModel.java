package me.yifeiyuan.databinding.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import me.yifeiyuan.databinding.model.Student;
/**
 * Created by mingjue on 2019-06-21.
 */
public class DBViewModel extends ViewModel implements Observable {

    public MutableLiveData<Student> student = new MutableLiveData<>();

    private PropertyChangeRegistry callbacks = new PropertyChangeRegistry();

    @Override
    public void addOnPropertyChangedCallback(final OnPropertyChangedCallback callback) {
        callbacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(final OnPropertyChangedCallback callback) {
        callbacks.remove(callback);
    }
}
