package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: lkl */
public final class lkl extends ekk implements ejc, ewg {
    private static final long c = TimeUnit.HOURS.toMillis(1);
    public final SharedPreferences a;
    public final xsc b;
    private final eif d;
    private final lud e;
    private final albv f;

    public lkl(elm elm, eif eif, lud lud, xsc xsc, SharedPreferences sharedPreferences, albv albv) {
        super(elm);
        this.d = eif;
        this.e = lud;
        this.b = xsc;
        this.a = sharedPreferences;
        this.f = albv;
    }

    public final int a() {
        return 2700;
    }

    public final void d() {
    }

    public final void A_() {
        this.d.a(this);
    }

    public final void ar_() {
        this.d.b(this);
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 == ejd.WATCH_WHILE_MINIMIZED && ejd != ejd.NONE) {
            c();
        }
    }

    public final void c() {
        if (e() < 2) {
            long j = this.a.getLong(ebn.FLOATY_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, -1);
            if (j == -1 || this.b.a() - j >= c) {
                lui lui = this.e.a;
                if (lui != null) {
                    lkb h = lui.h();
                    if (h != null) {
                        albv albv = this.f;
                        View d = h.d();
                        albv.a(this.f.a().a(d).c(d.getResources().getString(R.string.floaty_bar_tutorial_description)).e(1).d(3).a(new lko(this)).b());
                    }
                }
            }
        }
    }

    public final int e() {
        return this.a.getInt(ebn.FLOATY_BAR_TUTORIAL_SHOWN_COUNT, 0);
    }
}
