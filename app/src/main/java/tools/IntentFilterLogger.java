package tools;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

import static java.util.EnumSet.range;

/**
 * Created by jaffer on 16/7/25.
 */
public class IntentFilterLogger {
    public static void dump(String tag, IntentFilter intentFilter) {
        if (intentFilter == null) {
            Log.v(tag, "no intentFilter found");
            return;
        }
        int aNumber = intentFilter.countActions();
        for (int i=0; i<aNumber; i++){
            Log.v(tag, "Action: " + intentFilter.getAction(0));
        }
        int cNumber = intentFilter.countCategories();
        for (int i=0; i<cNumber; i++){
            Log.v(tag, "Category: " + intentFilter.getCategory(0));
        }
        cNumber = intentFilter.countDataAuthorities();
        for (int i=0; i<cNumber; i++){
            Log.v(tag, "dataAuthorities: " + intentFilter.getCategory(0));
        }
        cNumber = intentFilter.countDataPaths();
        for (int i=0; i<cNumber; i++){
            Log.v(tag, "DataPaths: " + intentFilter.getCategory(0));
        }
        cNumber = intentFilter.countDataSchemes();
        for (int i=0; i<cNumber; i++){
            Log.v(tag, "countDataSchemes: " + intentFilter.getCategory(0));
        }
        cNumber = intentFilter.countDataTypes();
        for (int i=0; i<cNumber; i++){
            Log.v(tag, "DataTypes: " + intentFilter.getCategory(0));
        }
    }
}
