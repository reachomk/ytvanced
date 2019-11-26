package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.youtube.R;

/* renamed from: mjv */
public final class mjv implements eib, ejc, fjk, fjm, heu {
    public final Activity a;
    public final fjg b;
    public final eif c;
    public final bcaa d;
    public final fjn e;
    public final bdfu f = new bdfu();
    public final bcaa g;
    public boolean h = false;
    public boolean i;
    private final zyw j;
    private final zzl k;
    private final SharedPreferences l;
    private float m = 0.0f;

    public mjv(Activity activity, zyw zyw, zzl zzl, fjg fjg, eif eif, bcaa bcaa, bcaa bcaa2, SharedPreferences sharedPreferences) {
        this.a = activity;
        this.j = zyw;
        this.k = zzl;
        this.b = fjg;
        this.c = eif;
        this.d = bcaa;
        this.g = bcaa2;
        this.l = sharedPreferences;
        this.e = new fjn(activity);
    }

    public final void a() {
        if (this.h) {
            if (this.i || this.m >= 0.9f) {
                b();
            } else {
                ejd c = this.c.c();
                if (c == null || !c.c()) {
                    if (gzd.a(this.b.a(), this.k, this.j)) {
                        b();
                    } else {
                        c();
                    }
                } else if (lva.a(((lum) this.d.get()).f().b(), this.l) != 2) {
                    c();
                } else {
                    b();
                }
            }
        }
    }

    private final void b() {
        fjn fjn = this.e;
        Activity activity = this.a;
        if (fjn.a) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(null, fjp.d, 0, R.style.f276NavigationBar.Dark);
            fjn.a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }

    private final void c() {
        this.e.a(this.a);
    }

    public final void a(ejd ejd, ejd ejd2) {
        a();
    }

    public final void a(fjl fjl) {
        a();
    }

    public final void a(fja fja) {
        a();
    }

    public final void a(MdxWatchDrawerLayout mdxWatchDrawerLayout) {
        this.m = mdxWatchDrawerLayout.c();
        a();
    }

    public final void a(eja eja) {
        a();
    }
}
