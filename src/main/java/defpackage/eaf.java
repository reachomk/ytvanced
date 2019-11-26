package defpackage;

import android.app.Activity;
import java.util.Map;

/* renamed from: eaf */
public final class eaf implements aaap {
    private final xcx a;
    private final Activity b;
    private final ehn c;

    public eaf(Activity activity, xcx xcx, ehn ehn) {
        this.b = activity;
        this.a = xcx;
        this.c = ehn;
    }

    public final void a(apxu apxu, Map map) {
        this.c.a(new eai(this, apxu));
    }
}
