package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: afqs */
public final class afqs extends afsv implements afrg {
    public final afpt a;
    public final xsc b;
    public final String k;
    public final long l;
    public final long m;
    public final List n;
    public final Set o;
    private final List q;
    private final byte[] r;
    private final Map s;
    private final afqw t;
    private final afsd u;

    public afqs(int i, String str, String str2, long j, long j2, List list, byte[] bArr, Map map, afqw afqw, bqk bqk, List list2, xsc xsc, int i2, afpt afpt, afsd afsd) {
        int i3 = i;
        byte[] bArr2 = bArr;
        Map map2 = map;
        String str3 = str;
        super(i, str, bqk);
        boolean z = true;
        boolean z2 = i3 != 0 || (map2 == null && bArr2 == null);
        amqw.b(z2);
        if (!(map2 == null || bArr2 == null)) {
            z = false;
        }
        amqw.b(z);
        this.f = new bqc((int) TimeUnit.SECONDS.toMillis((long) i2), 0, 0.0f);
        this.i = false;
        this.k = (String) amqw.a((Object) str2);
        this.l = j;
        this.m = j2;
        this.n = list;
        this.r = bArr2;
        this.s = map2;
        this.t = (afqw) amqw.a((Object) afqw);
        this.q = (List) amqw.a((Object) list2);
        this.b = (xsc) amqw.a((Object) xsc);
        this.a = (afpt) amqw.a((Object) afpt);
        this.u = (afsd) amqw.a((Object) afsd);
        this.o = new HashSet();
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        for (afsa afsa : this.q) {
            if (this.u.a(afsa.a())) {
                this.o.add(afsa.a());
                try {
                    afsa.a(hashMap, this);
                } catch (bpx e) {
                    String valueOf = String.valueOf(e.toString());
                    String str = "HttpPingRequest: AuthFailureError";
                    xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
            }
        }
        return hashMap;
    }

    public final byte[] a() {
        byte[] bArr = this.r;
        if (bArr == null) {
            Map map = this.s;
            if (map == null || map.isEmpty()) {
                bArr = null;
            } else {
                try {
                    return xhb.a(this.s, "UTF-8").d();
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return bArr;
    }

    public final bqh a(bqd bqd) {
        return bqh.a(null, null);
    }

    public final void b(bqn bqn) {
        afqw afqw = this.t;
        aftp.a(bqn);
        afqw.b();
    }

    public final afpt bm_() {
        return this.a;
    }
}
