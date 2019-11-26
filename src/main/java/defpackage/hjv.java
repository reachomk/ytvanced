package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: hjv */
public final class hjv implements xcp {
    public final Activity a;
    public final xci b;
    public final ahcn c;
    public final ahcd d;
    public final akkq e;
    public final hjy f;
    public final hsy g;
    public final hmc h;
    public final hmj i;
    public final akoe j;
    public final aaas k;
    public final zyw l;
    public final hqp m;
    public final hng n;
    public final String o;
    public final Bundle p;
    public final agvz q;
    public final HashSet r = new HashSet();
    public LoadingFrameLayout s;
    public ListView t;
    public TextView u;
    public akpk v;
    public hjw w;
    public hju x;
    private final Executor y;

    public hjv(Activity activity, xci xci, ahcn ahcn, ahcd ahcd, agwc agwc, akkq akkq, hjy hjy, Executor executor, hsy hsy, hmc hmc, hmj hmj, akoe akoe, aaas aaas, zyw zyw, hqp hqp, hng hng, String str, Bundle bundle) {
        this.a = activity;
        this.b = xci;
        this.c = ahcn;
        this.d = ahcd;
        this.q = agwc.b();
        this.e = akkq;
        this.f = hjy;
        this.y = executor;
        this.g = hsy;
        this.h = hmc;
        this.i = hmj;
        this.j = akoe;
        this.k = aaas;
        this.l = zyw;
        this.m = hqp;
        this.n = hng;
        this.o = str;
        this.p = bundle;
    }

    public final void a() {
        b();
        this.s.a();
        this.x = new hju(this);
        this.x.executeOnExecutor(this.y, new String[]{this.o});
    }

    public final void b() {
        hju hju = this.x;
        if (hju != null && !hju.isCancelled()) {
            this.x.cancel(false);
            this.x = null;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{aglm.class, agll.class};
        } else if (i == 0) {
            aglm aglm = (aglm) obj;
            if (this.r.contains(aglm.a.a()) && aglm.a.u() == agqs.PLAYABLE) {
                this.w.a();
                return null;
            }
        } else if (i == 1) {
            if (this.r.contains(((agll) obj).a)) {
                a();
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
