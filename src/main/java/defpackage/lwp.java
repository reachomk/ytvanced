package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.watch.watchwhile.WatchWhileLayout;

/* renamed from: lwp */
public final class lwp extends xoj {
    public float a = 0.0f;
    public final /* synthetic */ WatchWhileLayout b;

    public lwp(WatchWhileLayout watchWhileLayout, Context context) {
        this.b = watchWhileLayout;
        super(context, 400);
    }

    public final int a(int i, int i2) {
        float f = this.a;
        if (f == 0.0f) {
            return i2;
        }
        double d = (double) i;
        double cos = Math.cos((double) f);
        Double.isNaN(d);
        d *= cos;
        double d2 = (double) i2;
        cos = Math.sin((double) this.a);
        Double.isNaN(d2);
        return (int) (d + (d2 * cos));
    }
}
