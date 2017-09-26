package com.example.bottombar.sample;

/**
 * Created by iiro on 7.6.2016.
 */
public class TabMessage {

    public static String get(int menuItemId, boolean isReselection) {
        return get(menuItemId, isReselection, false);
    }

    public static String get(int menuItemId, boolean isReselection, boolean isLongPress) {
        String message = "Content for ";

        switch (menuItemId) {
            case R.id.tab_recents:
                message += "recents";
                break;
            case R.id.tab_favorites:
                message += "favorites";
                break;
            case R.id.tab_nearby:
                message += "nearby";
                break;
            case R.id.tab_friends:
                message += "friends";
                break;
            case R.id.tab_food:
                message += "food";
                break;
        }

        if (isReselection) {
            message += " WAS RESELECTED! YAY!";
        }

        if (isLongPress) {
            message += " WAS LONG PRESSED! YAY!";
        }

        return message;
    }
}
