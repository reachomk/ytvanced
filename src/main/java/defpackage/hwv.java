package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.youtube.R;

/* renamed from: hwv */
public final class hwv {
    public final adqf a;
    public aiee b;
    private final SharedPreferences c;
    private final hwr d;

    public hwv(Activity activity, SharedPreferences sharedPreferences, adqf adqf) {
        this.c = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.a = (adqf) amqw.a((Object) adqf);
        this.d = new hwr(R.id.controls_overlay_menu_nerd_stats, activity.getResources().getString(R.string.setting_nerd_stats), new hwy(this));
        this.d.d = ra.a((Context) activity, (int) R.drawable.ic_overflow_nerd_stats);
        this.d.a(sharedPreferences.getBoolean(xay.NERD_STATS_ENABLED, false));
    }

    public final hwr a() {
        this.d.a(this.c.getBoolean(xay.NERD_STATS_ENABLED, false));
        return this.d;
    }
}
