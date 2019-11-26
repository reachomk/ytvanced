package defpackage;

import android.app.Activity;
import android.content.Context;
import android.preference.ListPreference;
import java.util.List;

/* renamed from: uwi */
public final class uwi extends ListPreference implements uum {
    public int a = -1;
    public List b = null;
    public final aldg c;

    public uwi(Context context, aldg aldg) {
        super(context);
        this.c = aldg;
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void b() {
        ((Activity) getContext()).runOnUiThread(new uwh(this));
    }
}
