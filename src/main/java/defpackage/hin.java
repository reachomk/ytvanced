package defpackage;

import android.app.Activity;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hin */
public final class hin implements xcp {
    public akot A;
    public hir B;
    public final Activity a;
    public final xci b;
    public final akkq c;
    public final ahcn d;
    public final ahcd e;
    public final hiw f;
    public final hsy g;
    public final hmc h;
    public final hpt i;
    public final hmj j;
    public final akoe k;
    public final aaas l;
    public final zyw m;
    public final hqp n;
    public final akpb o;
    public final hng p;
    public final acvx q;
    public final agvz r;
    public final String s;
    public final boolean t;
    public final Set u = new HashSet();
    public LoadingFrameLayout v;
    public ListView w;
    public akpk x;
    public wxi y;
    public TextView z;

    public hin(Activity activity, xci xci, akkq akkq, ahcn ahcn, ahcd ahcd, hiw hiw, hsy hsy, hmc hmc, hpt hpt, hmj hmj, akoe akoe, aaas aaas, zyw zyw, hqp hqp, akpb akpb, hng hng, acvx acvx, agvz agvz, String str, boolean z) {
        this.a = activity;
        this.b = xci;
        this.c = akkq;
        this.d = ahcn;
        this.e = ahcd;
        this.f = hiw;
        this.g = hsy;
        this.h = hmc;
        this.i = hpt;
        this.j = hmj;
        this.k = akoe;
        this.l = aaas;
        this.m = zyw;
        this.n = hqp;
        this.o = akpb;
        this.p = hng;
        this.q = acvx;
        this.r = agvz;
        this.s = str;
        this.t = z;
    }

    public final void a(boolean z) {
        wxi wxi = this.y;
        if (!(wxi == null || wxi.b())) {
            this.y.a();
        }
        this.v.a();
        this.y = wxi.a(new him(this, z));
        this.r.n().a(this.s, wxc.a(this.a, this.y));
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{agle.class, agld.class, agll.class, aglp.class};
        } else if (i == 0) {
            if (this.s.equals(((agle) obj).a)) {
                a(false);
                return null;
            }
        } else if (i == 1) {
            if (this.s.equals(((agld) obj).a.a())) {
                a(false);
                return null;
            }
        } else if (i == 2) {
            if (this.u.contains(((agll) obj).a)) {
                a(true);
                return null;
            }
        } else if (i == 3) {
            if (this.u.contains(((aglp) obj).a)) {
                a(false);
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
