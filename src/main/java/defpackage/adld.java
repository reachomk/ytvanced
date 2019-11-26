package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;

/* renamed from: adld */
public final class adld {
    public static boolean a(xsc xsc) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(xsc.a());
        int i = instance.get(11);
        return i >= 0 && i < 7;
    }

    public static boolean a(autt autt) {
        return ((autt.a & 1) ^ 1) != 0;
    }

    public static amqp a(aurg aurg, SharedPreferences sharedPreferences, adhn adhn, Context context) {
        Object obj = null;
        if (sharedPreferences.getBoolean("MdxNotifUseScreenNameOnly", false) && (aurg.a & 1) != 0 && adhn.a(aurg.b, context).size() == 1) {
            obj = (bbs) adhn.a(aurg.b, context).get(0);
        } else if (aurg != null && (aurg.a & 2) != 0) {
            for (bbs bbs : adhn.a(context)) {
                if (adhn.a(aurg.c, bbs.c)) {
                    obj = bbs;
                    break;
                }
            }
        } else {
            xtl.b(adhn.a, "Invalid MdxScreen.");
        }
        return amqp.c(obj);
    }
}
