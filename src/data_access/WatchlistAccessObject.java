package data_access;

import entity.User;
import entity.Watchlist;
import use_case.add_to_watchlist.AddToWatchlistDataAccessInterface;

public class WatchlistAccessObject implements AddToWatchlistDataAccessInterface {

    @Override
    public Watchlist getWatchlist(String user) {
        return null;
    }
}
