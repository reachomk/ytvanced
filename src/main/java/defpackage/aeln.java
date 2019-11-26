package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aeln */
final class aeln extends aell {
    public final amro a;
    public final long b;
    public final xsc c;
    public final ScheduledExecutorService d;
    public final aelx e;
    public final boolean f;
    public final long g;
    public final ArrayList h;
    public boolean i;
    private final aelp j;
    private String k;
    private boolean l;

    public final synchronized void a(long j) {
        this.k = null;
        this.i = true;
        if (!this.l) {
            this.l = true;
            this.d.schedule(this.j, j, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void a(String str) {
        this.k = str;
        this.i = false;
    }

    public final synchronized aepg a() {
        return c(null);
    }

    public final synchronized aepg b(String str) {
        return c(str);
    }

    public final synchronized long b() {
        return ((aelq) this.h.get(0)).c;
    }

    public final String c() {
        return this.k;
    }

    private final aepg c(String str) {
        aepg a;
        int size;
        int i = 0;
        if (this.f) {
            if (str != null) {
                a = this.e.a(str);
            } else {
                a = this.e.a();
            }
            if (a != null) {
                ArrayList arrayList = this.h;
                size = arrayList.size();
                while (i < size) {
                    aelo c = ((aelq) arrayList.get(i)).c();
                    if (c.b() != null && TextUtils.equals(a.a, c.b().getAuthority())) {
                        a.a(c.a(), c.b());
                        break;
                    }
                    i++;
                }
                return a;
            }
        }
        ArrayList arrayList2 = this.h;
        size = arrayList2.size();
        while (i < size) {
            aelq aelq = (aelq) arrayList2.get(i);
            String a2 = aelq.a();
            if (a2 == null || TextUtils.equals(a2, str)) {
                i++;
            } else {
                aelo c2 = aelq.c();
                a = new aepg(a2, -1);
                a.a(c2.a(), c2.b());
                return a;
            }
        }
        return null;
    }

    /* synthetic */ aeln(amro amro, String str, long j, long j2, int i, xsc xsc, ScheduledExecutorService scheduledExecutorService, xhv xhv, aelx aelx, boolean z, boolean z2, boolean z3, aajk aajk) {
        boolean z4 = z2;
        aajk aajk2 = aajk;
        this.a = (amro) amqw.a((Object) amro);
        this.b = j > 0 ? j : 25000;
        this.g = j2;
        this.c = (xsc) amqw.a((Object) xsc);
        this.d = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.e = aelx;
        this.f = z3;
        this.l = false;
        this.k = "ns";
        int i2 = i;
        this.j = new aelp(this, xhv, z, i);
        Uri parse = Uri.parse(xvd.a(str));
        this.h = new ArrayList();
        this.h.add(new aelq(this, parse, z4, aajk2));
        this.h.add(new aelq(this, aell.a(parse), z4, aajk2));
        this.h.add(new aelq(this, parse.buildUpon().appendQueryParameter("cmo", "pf=1").build(), z4, aajk2));
    }
}
