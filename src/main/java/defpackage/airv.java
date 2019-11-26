package defpackage;

import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: airv */
public class airv {
    public static final byte[] a = zzp.b;
    public static final long b = TimeUnit.SECONDS.toMillis(15);
    public final Executor c;
    public final xci d;
    public final xsc e;
    public final LruCache f;
    public final zzl g;
    public final xua h;
    public final ConditionVariable i;
    private final abfc j;
    private final Executor k;
    private final Set l;
    private final abfd m;
    private final long n;

    protected airv() {
        this.i = new ConditionVariable();
        this.m = null;
        this.d = null;
        this.j = null;
        this.c = null;
        this.k = null;
        this.l = Collections.emptySet();
        this.n = b;
        this.e = new xvf();
        this.f = null;
        this.g = null;
        this.h = null;
    }

    /* Access modifiers changed, original: protected */
    public aakj a(String str, aakj aakj) {
        return aakj;
    }

    public airv(xci xci, abfc abfc, Executor executor, Executor executor2, Set set, ahhq ahhq, abfd abfd, xsc xsc, zzl zzl, xua xua) {
        this.i = new ConditionVariable();
        this.d = (xci) amqw.a((Object) xci);
        this.j = (abfc) amqw.a((Object) abfc);
        this.c = (Executor) amqw.a((Object) executor);
        this.k = (Executor) amqw.a((Object) executor2);
        this.l = (Set) amqw.a((Object) set);
        this.n = ahhq.k();
        this.m = abfd;
        this.e = xsc;
        this.f = new LruCache(16);
        this.g = (zzl) amqw.a((Object) zzl);
        this.h = (xua) amqw.a((Object) xua);
    }

    public airv(xci xci, abfc abfc, Executor executor, Executor executor2, List list, xua xua) {
        this.i = new ConditionVariable();
        this.h = (xua) amqw.a((Object) xua);
        this.d = (xci) amqw.a((Object) xci);
        this.j = (abfc) amqw.a((Object) abfc);
        this.c = (Executor) amqw.a((Object) executor);
        this.k = (Executor) amqw.a((Object) executor2);
        this.l = new HashSet(list);
        this.n = b;
        this.e = new xvf();
        this.f = null;
        this.g = null;
        this.m = null;
    }

    public final void a(String str, byte[] bArr, String str2, String str3, int i, wxg wxg) {
        amqw.a((Object) wxg);
        this.c.execute(new airu(this, str, str3, str2, bArr, i, wxg));
    }

    public final anjv a(aiqq aiqq, String str, int i, boolean z, aiqw aiqw) {
        aiqq aiqq2 = aiqq;
        xvd.a(aiqq.b());
        aaje a = aiqq.a(str);
        if (a != null) {
            a.a(aiqq.b());
        }
        aajf aajf = null;
        if (!(a != null || (aiqq2.a.a & 65536) == 0 || TextUtils.isEmpty(str))) {
            avtk avtk = aiqq2.a.q;
            if (avtk == null) {
                avtk = avtk.f;
            }
            if (!avtk.b.isEmpty()) {
                Uri parse = Uri.parse(avtk.b);
                boolean z2 = avtk.c;
                boolean z3 = avtk.d;
                avti avti = avtk.e;
                if (avti == null) {
                    avti = avti.c;
                }
                aajf aajf2 = new aajf(parse, z2, z3, str, avti);
            }
        }
        return a(aiqq, str, i, aajf, a, z, aiqw);
    }

    public anjv a(aiqq aiqq, String str, int i, aajf aajf, aaje aaje, boolean z, aiqw aiqw) {
        aajf aajf2 = aajf;
        xvd.a(aiqq.b());
        abfd abfd = this.m;
        if (!(abfd == null || aajf2 == null)) {
            abfd.a(aiqq.b(), aajf);
        }
        abfj a = a(aiqq.b(), aiqq.k(), aiqq.i(), aiqq.c(), aiqq.d(), i, aiqw.a());
        if (aiqq.n()) {
            a.z = true;
        }
        if (aiqq.o()) {
            a.A = true;
        }
        if (!aiqq.r().isEmpty()) {
            for (Entry entry : aiqq.r().entrySet()) {
                a.f().put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        a.C = aiqq.q();
        return a(aiqq.b(), str, a, aaje, z, aiqw.a());
    }

    public final void a(aiqq aiqq, int i) {
        if (this.f != null && !TextUtils.isEmpty(aiqq.b()) && aiqq.k() != null) {
            a(a(aiqq.b(), aiqq.k(), aiqq.i(), aiqq.c(), aiqq.d(), i, null).a());
        }
    }

    private final void a(String str) {
        LruCache lruCache = this.f;
        if (lruCache != null) {
            lruCache.remove(str);
        }
    }

    public final abfj a(String str, byte[] bArr, String str2, String str3, int i, int i2, acxt acxt) {
        abfj a = this.j.a(new aisa(this.d, acxt));
        a.a(aall.DISABLED);
        a.a(bArr);
        a.a = str;
        a.c = str3;
        a.d = i;
        a.I = i2;
        a.b = str2;
        for (abfg a2 : this.l) {
            a2.a(a);
        }
        return a;
    }

    public final anjv a(String str, String str2, abfj abfj, aaje aaje, boolean z, acxt acxt) {
        Pair pair;
        anjv anjv;
        xvd.a(str);
        amqw.a((Object) abfj);
        this.d.d(new ahjs());
        if (acxt != null) {
            acxt.a("ps_s");
        }
        LruCache lruCache = this.f;
        if (lruCache == null) {
            pair = null;
        } else if (abfj.i) {
            pair = (Pair) lruCache.get(abfj.a());
        } else {
            pair = (Pair) lruCache.remove(abfj.a());
        }
        if (pair == null || this.e.b() > ((Long) pair.second).longValue() || aira.a((aakj) pair.first, this.e)) {
            if (pair != null) {
                a(abfj.a());
            }
            airy airy = new airy(this, abfj, str, acxt);
            this.j.a(abfj, airy, str2, aaje, z);
            anjv = airy;
        } else {
            aakj aakj = (aakj) pair.first;
            this.d.d(new ahjt(true));
            if (acxt != null) {
                acxt.a("ps_r");
                atyl atyl = (atyl) atyi.l.createBuilder();
                atyl.a(true);
                acxt.a((atyi) ((anxl) atyl.build()));
            }
            anjv = new afsx();
            anjv.a_(aakj);
            abfd abfd = this.m;
            if (!(abfd == null || aaje == null || aakj == null)) {
                abfd.a(aaje, aakj);
                return anjv;
            }
        }
        return anjv;
    }
}
