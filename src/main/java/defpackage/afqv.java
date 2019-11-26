package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: afqv */
public final class afqv {
    public final afre a;
    public final xhv b;
    public final afmj c;
    public final afrd d;
    private final afpu e;
    private final List f;
    private final xhf g;
    private final xsc h;
    private final afmr i;
    private final Executor j;
    private final Executor k;

    public afqv(afpu afpu, List list, xhf xhf, afre afre, xsc xsc, xhv xhv, afmr afmr, Executor executor, Executor executor2, afmj afmj, afrd afrd) {
        this.e = (afpu) amqw.a((Object) afpu);
        this.f = (List) amqw.a((Object) list);
        this.g = (xhf) amqw.a((Object) xhf);
        this.a = (afre) amqw.a((Object) afre);
        this.h = (xsc) amqw.a((Object) xsc);
        this.b = (xhv) amqw.a((Object) xhv);
        this.i = (afmr) amqw.a((Object) afmr);
        this.j = (Executor) amqw.a((Object) executor);
        this.k = (Executor) amqw.a((Object) executor2);
        this.c = (afmj) amqw.a((Object) afmj);
        this.d = (afrd) amqw.a((Object) afrd);
    }

    @Deprecated
    public final void a(afqy afqy, bqk bqk) {
        a(null, afqy, bqk);
    }

    public final void a(afmq afmq, afqy afqy, bqk bqk) {
        afqy afqy2 = afqy;
        Uri uri = afqy2.c;
        if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
            this.j.execute(new afqu(bqk, uri));
            return;
        }
        int a;
        boolean e;
        int i = afqy2.a;
        String uri2 = afqy2.c.toString();
        String str = afqy2.b;
        long j = afqy2.f;
        afmr afmr = this.i;
        if (afmq != null) {
            a = afmq.a();
        } else {
            a = afmr.b();
        }
        long a2 = this.h.a() + TimeUnit.HOURS.toMillis((long) a);
        long j2 = (j <= 0 || j >= a2) ? a2 : j;
        long toMillis = afmq != null ? TimeUnit.MINUTES.toMillis((long) afmq.c()) : 0;
        ArrayList arrayList = new ArrayList();
        if (afmq != null) {
            for (Integer intValue : afmq.b()) {
                int intValue2 = intValue.intValue();
                if (intValue2 > 0) {
                    arrayList.add(Long.valueOf(TimeUnit.SECONDS.toMillis((long) intValue2)));
                }
            }
        }
        byte[] bArr = afqy2.d;
        Map map = afqy2.g;
        afqw afqw = afqy2.i;
        List list = this.f;
        xsc xsc = this.h;
        int d = this.i.d();
        afpt afpt = afqy2.h;
        if (afpt == null) {
            afpt = this.e.c();
        }
        afqs afqs = new afqs(i, uri2, str, j2, toMillis, arrayList, bArr, map, afqw, bqk, list, xsc, d, afpt, afqy2.j);
        if (afmq == null) {
            e = this.i.e();
        } else {
            e = afmq.d();
        }
        boolean z = afqy2.e;
        amqw.a(afrj.a);
        if (e && z && this.a != afre.d) {
            this.k.execute(new afqx(this, afqs));
        } else {
            this.g.b(afqs);
        }
    }

    public static afqy a(String str) {
        return new afqy(0, str);
    }

    public static afqy b(String str) {
        return new afqy(1, str);
    }

    public static afqy a(byte[] bArr, String str) {
        return new afqy(bArr, str);
    }
}
