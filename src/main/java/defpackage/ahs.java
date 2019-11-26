package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.youtube.R;

/* renamed from: ahs */
public final class ahs {
    public final Context a;

    public static ahs a(Context context) {
        return new ahs(context);
    }

    private ahs(Context context) {
        this.a = context;
    }

    public final int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500 || (i > 480 && i2 > 640)) {
            return 4;
        }
        return i < 360 ? 2 : 3;
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
