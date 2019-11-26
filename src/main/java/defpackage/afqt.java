package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: afqt */
final class afqt extends afsv {
    private final nkg a;
    private final xsc b;
    private final afsw k;
    private final afpu l;
    private final List m;
    private final afsd n;

    public afqt(nkg nkg, afsw afsw, xsc xsc, afmr afmr, afpu afpu, List list) {
        super(nkg.c, ((nkg) amqw.a((Object) nkg)).d, (bqk) afsw);
        this.f = new bqc((int) TimeUnit.SECONDS.toMillis((long) afmr.d()), 0, 0.0f);
        this.a = (nkg) amqw.a((Object) nkg);
        this.k = (afsw) amqw.a((Object) afsw);
        this.b = (xsc) amqw.a((Object) xsc);
        this.l = (afpu) amqw.a((Object) afpu);
        this.m = (List) amqw.a((Object) list);
        this.n = new afru(nkg);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (nkc nkc : this.a.e) {
            int i = nkc.a;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                hashMap.put(nkc.b, nkc.c);
            }
        }
        for (afsa afsa : this.m) {
            if (this.n.a(afsa.a()) && !afsa.b()) {
                try {
                    afsa.a(hashMap, this);
                } catch (bpx e) {
                    String valueOf = String.valueOf(e.toString());
                    String str = "DelayedPingVolleyRequest: AuthFailureError";
                    xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
            }
        }
        hashMap.put("X-Goog-Request-Time", String.valueOf(this.b.a()));
        hashMap.put("X-Goog-Event-Time", String.valueOf(this.a.h));
        return hashMap;
    }

    public final bqh a(bqd bqd) {
        return bqh.a(null, null);
    }

    public final void b(bqn bqn) {
        super.b(bqn);
    }

    public final byte[] a() {
        nkg nkg = this.a;
        return (nkg.a & 16) != 0 ? nkg.g.d() : null;
    }

    public final afpt bm_() {
        String str = this.a.p;
        if (TextUtils.isEmpty(str)) {
            return afpt.g;
        }
        afpt a = this.l.a(str);
        if (a == null) {
            xtl.c("DelayedPingVolleyRequest: AuthFailureError, identity id not found");
            a = afpt.g;
        }
        return a;
    }
}
