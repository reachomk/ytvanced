package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import java.util.concurrent.Future;

/* renamed from: hmx */
public final class hmx implements akot, jih, xcp {
    public final hmj a;
    public akor b;
    public hkv c;
    public jif d;
    public apxu e;
    public Future f;
    private final Context g;
    private final akou h;
    private final xci i;
    private final hpd j;
    private final hnc k;
    private final hng l;
    private final View m;
    private final TextView n = ((TextView) this.m.findViewById(R.id.title));
    private final TextView o = ((TextView) this.m.findViewById(R.id.subtitle));
    private final AppCompatImageView p = ((AppCompatImageView) this.m.findViewById(R.id.icon));
    private final OfflineArrowView q = ((OfflineArrowView) this.m.findViewById(R.id.offline_arrow));
    private final hnj r = new hmw(this);
    private hlp s;

    public hmx(Context context, flu flu, aaas aaas, xci xci, hmj hmj, hpd hpd, hnc hnc, hng hng) {
        this.g = context;
        this.h = (akou) amqw.a((Object) flu);
        this.i = xci;
        this.a = hmj;
        this.j = hpd;
        this.k = hnc;
        this.l = hng;
        this.m = LayoutInflater.from(context).inflate(R.layout.offline_videos_link_list_item, null);
        flu.a(this.m);
        flu.a(new hmz(this, aaas));
    }

    public final View K_() {
        return this.h.a();
    }

    public final void b() {
        c();
        if (ekc.a(this.e)) {
            this.f = this.j.a(new hmy(this));
        }
    }

    public final void a(hkt hkt) {
        xpr.a(this.o, hkt.b[0]);
        this.o.setTextColor(xwe.a(this.g, hkt.a, 0));
        TextView textView = this.o;
        textView.setTypeface(textView.getTypeface(), 0);
    }

    private final void c() {
        Future future = this.f;
        if (future != null) {
            future.cancel(false);
            this.f = null;
        }
    }

    public final void a(akpb akpb) {
        c();
        this.i.b(this);
        this.l.b(this.r);
        this.s = null;
        jif jif = this.d;
        if (jif != null) {
            jif.a((jih) this);
        }
    }

    public final void a(boolean z) {
        flt.a(this.g, this.b, this.h, z);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        hkv hkv = (hkv) obj;
        this.b = akor;
        this.c = hkv;
        amqp a = jif.a(akor);
        if (a.a()) {
            this.d = (jif) a.b();
            this.d.b(this, hkv);
        } else {
            this.d = null;
        }
        this.e = hkv.c;
        this.h.a(this.e != null);
        this.n.setText(this.g.getString(hkv.a));
        this.p.setImageResource(hkv.b);
        this.i.a((Object) this);
        this.l.a(this.r);
        b();
        if (ekc.a(this.e)) {
            hnc hnc = this.k;
            OfflineArrowView offlineArrowView = this.q;
            eki eki = (eki) hnc.a((eki) hnc.a.get(), 1);
            bcaa bcaa = hnc.b;
            hnc.a((hlr) hnc.c.get(), 3);
            this.s = new hnd(eki, bcaa, (OfflineArrowView) hnc.a(offlineArrowView, 6));
        }
        this.s.a();
        this.q.setImportantForAccessibility(2);
        this.h.a(akor);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class, aglm.class, aglu.class};
        } else if (i == 0) {
            b();
        } else if (i != 1) {
            if (i == 2) {
                aglu aglu = (aglu) obj;
                if (ekc.a(this.e)) {
                    this.s.a(hks.a(aglu.a));
                    return null;
                }
            }
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (ekc.a(this.e)) {
            a(this.a.b());
            return null;
        }
        return clsArr;
    }
}
