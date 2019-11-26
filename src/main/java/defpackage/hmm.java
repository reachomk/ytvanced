package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: hmm */
public final class hmm implements akox {
    public final ahcn a;
    public final ahcd b;
    public final agwh c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final Context l;
    private final xci m;
    private final agvz n;
    private final akkq o;
    private final String p;
    private final eqf q;
    private final hsy r;
    private final hmc s;
    private final hmj t;
    private final aaas u;
    private final zyw v;
    private final hqp w;
    private final hng x;

    public hmm(Context context, xci xci, ahcn ahcn, ahcd ahcd, agvz agvz, akkq akkq, String str, String str2, eqe eqe, hsy hsy, hmc hmc, hmj hmj, aaas aaas, zyw zyw, hqp hqp, hng hng) {
        String str3 = str;
        this.l = (Context) amqw.a((Object) context);
        this.m = (xci) amqw.a((Object) xci);
        this.a = (ahcn) amqw.a((Object) ahcn);
        this.b = (ahcd) amqw.a((Object) ahcd);
        this.n = (agvz) amqw.a((Object) agvz);
        this.c = (agwh) amqw.a(agvz.k());
        this.o = (akkq) amqw.a((Object) akkq);
        this.d = str3;
        this.p = str2;
        this.r = (hsy) amqw.a((Object) hsy);
        this.s = hmc;
        this.t = (hmj) amqw.a((Object) hmj);
        this.u = (aaas) amqw.a((Object) aaas);
        this.v = (zyw) amqw.a((Object) zyw);
        this.w = (hqp) amqw.a((Object) hqp);
        this.x = (hng) amqw.a((Object) hng);
        eqk hmp = new hmp(this);
        eqk hmo = new hmo(this, str3);
        eqk hmr = new hmr(this, str3);
        eqk hmq = new hmq(this);
        eqk hmt = new hmt(this);
        eqk hms = new hms(this);
        ahcn ahcn2 = ahcn;
        eqk hmv = new hmv(this, ahcn);
        this.q = new eqf(eqe.a);
        this.k = this.q.a((int) R.string.menu_offline_immediately, hms);
        this.e = this.q.a((int) R.string.pause_offline, hmq);
        this.f = this.q.a((int) R.string.resume_offline, hmt);
        this.g = this.q.a((int) R.string.readd_to_offline, hmo);
        this.h = this.q.a((int) R.string.offline_retry_failed_videos_menu_item, hmr);
        this.i = this.q.a((int) R.string.renew_offline, hmv);
        this.j = this.q.a((int) R.string.remove_offline, hmp);
    }

    public final void a(int i, boolean z) {
        eqh eqh;
        eqg eqg;
        if (z) {
            eqh = this.q.c;
            eqg = (eqg) eqh.b.get(i);
            if (eqg != null) {
                eqg.a(true);
            }
            eqh.notifyDataSetChanged();
            return;
        }
        eqh = this.q.c;
        eqg = (eqg) eqh.b.get(i);
        if (eqg != null) {
            eqg.a(false);
        }
        eqh.notifyDataSetChanged();
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        Context context = this.l;
        hmk hmk = r1;
        hmk hmk2 = new hmk(context, new flu(context), this.n, this.o, this.d, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        Object obj = hmk;
        this.m.a(obj);
        return obj;
    }
}
