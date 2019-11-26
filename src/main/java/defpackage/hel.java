package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.youtube.R;

/* renamed from: hel */
public final class hel implements hfk, xcp {
    public final xci a;
    public final adqf b;
    public final bcaa c;
    public final hfv d;
    public final aaat e;
    public final hep f;
    public final hex g;
    public final heu h;
    public final fjg i;
    public final boolean j;
    public int k;
    public hdy l;
    public MdxWatchDrawerLayout m;
    public View n;
    public ViewGroup o;
    public ViewGroup p;
    public boolean q;
    public heq r;
    public her s;
    public heu t;
    private final hfk u;
    private final lcn v;
    private final ezy w;

    public hel(Context context, xci xci, adqf adqf, bcaa bcaa, hfv hfv, aaat aaat, hfk hfk, lcn lcn, ezy ezy, hep hep, hex hex, heu heu, fjg fjg, boolean z) {
        this.a = xci;
        this.b = adqf;
        this.c = bcaa;
        this.d = hfv;
        this.u = hfk;
        this.v = lcn;
        this.e = aaat;
        this.w = ezy;
        this.f = hep;
        this.g = hex;
        this.h = heu;
        this.i = fjg;
        this.j = z;
        ezy.a(1, ra.c(context, R.color.mdx_status_bar_color));
    }

    public final boolean a() {
        return this.q && this.m.c() == 1.0f;
    }

    public final void b() {
        this.v.a(this.b.c() != null, this.o.getHeight());
    }

    public final void a(boolean z) {
        if (a()) {
            z = false;
        }
        this.m.b();
        this.u.a(z);
    }

    public final void c() {
        this.u.c();
    }

    public final void a(float f) {
        this.w.a(1, f);
    }

    public final void b(float f) {
        View view = this.n;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adng.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((adng) obj) == adng.CONNECTED_ONLY) {
            c();
            return null;
        }
        return clsArr;
    }
}
