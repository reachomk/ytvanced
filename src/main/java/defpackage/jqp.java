package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.LinearLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: jqp */
public final class jqp {
    public static final long b = TimeUnit.DAYS.toMillis(30);
    public final albv a;
    public final LinearLayout c;
    public final SharedPreferences d;
    public final xsc e;
    public final Activity f;

    public jqp(Activity activity, alck alck, LinearLayout linearLayout, xsc xsc, SharedPreferences sharedPreferences) {
        this.f = activity;
        this.a = alck;
        this.d = sharedPreferences;
        this.c = linearLayout;
        this.e = xsc;
    }

    public final int a() {
        return this.d.getInt(ebn.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT, 0);
    }
}
