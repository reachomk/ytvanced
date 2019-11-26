package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;

/* renamed from: hrc */
public final class hrc implements xcp {
    public final Context a;
    public final eki b;
    public final xci c;
    public final akop d;
    public final akoj e;
    public final hng f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final OnGlobalLayoutListener k = hsu.a(this.g, this.h);
    public final hnj l = new hrb(this);
    public final int m;
    public akor n;
    public akou o;
    public aqfs p;
    public String q;
    public akoj r;
    public Future s;
    private final bcaa t;
    private final hmj u;
    private final hpd v;
    private final zyw w;

    public hrc(Context context, eki eki, bcaa bcaa, hmj hmj, xci xci, akop akop, hpd hpd, zyw zyw, hng hng, View view, akoj akoj) {
        this.a = context;
        this.b = eki;
        this.t = bcaa;
        this.u = hmj;
        this.c = xci;
        this.d = akop;
        this.v = hpd;
        this.f = hng;
        this.e = akoj;
        this.w = zyw;
        this.g = (TextView) view.findViewById(R.id.owner);
        this.h = (TextView) view.findViewById(R.id.overflow_playlist_size_bytes);
        this.i = (TextView) view.findViewById(R.id.video_count);
        this.j = (TextView) view.findViewById(R.id.subtitle);
        TypedValue typedValue = new TypedValue();
        this.m = this.a.getTheme().resolveAttribute(16842808, typedValue, true) ? this.a.getResources().getColor(typedValue.resourceId) : -1;
    }

    public final void a() {
        if (!amqu.a(this.q)) {
            a(((agwc) this.t.get()).b().n().f(this.q));
        }
    }

    private final void a(agqh agqh) {
        xpr.a(this.i, false);
        arml arml = null;
        if (agqh == null || agqh.e()) {
            xpr.a(this.j, false);
        } else {
            hkt a = this.u.a(agqh);
            String[] strArr = a.b;
            xpr.a(this.j, strArr.length > 0 ? strArr[0] : null);
            this.j.setTextColor(xwe.a(this.a, a.a, 0));
            TextView textView = this.j;
            textView.setTypeface(textView.getTypeface(), 0);
        }
        if (agqh == null || !foh.u(this.w)) {
            TextView textView2 = this.g;
            aqfs aqfs = this.p;
            if ((aqfs.a & 16) != 0) {
                arml = aqfs.g;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView2.setText(ajqy.a(arml));
            xpr.a(this.h, false);
            return;
        }
        b();
        hpd hpd = this.v;
        this.s = hpd.d.submit(new hpl(hpd, agqh.a(), new hrd(this)));
    }

    public final void b() {
        Future future = this.s;
        if (future != null) {
            future.cancel(false);
            this.s = null;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class, aglb.class};
        } else if (i == 0) {
            a();
        } else if (i == 1) {
            aglb aglb = (aglb) obj;
            if (aglb.a.a().equals(this.q)) {
                a(aglb.a);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
