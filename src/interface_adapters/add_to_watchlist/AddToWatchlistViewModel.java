package interface_adapters.add_to_watchlist;

import interface_adapters.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AddToWatchlistViewModel extends ViewModel{

    private AddToWatchlistState state;
    private PropertyChangeSupport support;

    public AddToWatchlistViewModel() {
        super("Add to Watchlist");
    }

    public AddToWatchlistState getState() {
        return state;
    }

    public void setState(AddToWatchlistState state) {
        this.state = state;
    }

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
