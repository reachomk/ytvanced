package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* renamed from: xiw */
public final class xiw extends xgq {
    public final xlg a;
    private final bcaa b;
    private final bcaa c;
    private final boolean d;
    private final int e;
    private final int f;
    private final boolean g;
    private final xje h;
    private final xji i;

    public xiw(xiv xiv) {
        super(xib.a);
        this.b = xiv.a();
        this.c = xiv.c();
        this.d = xiv.f().d();
        this.e = xiv.f().a();
        this.f = xiv.f().b();
        this.i = xiv.j();
        this.a = xiv.i();
        this.g = xiv.h();
        this.h = (xje) xiv.b().get();
    }

    public final xho a(xhc xhc) {
        String b = xhc.b();
        nlg a = ((xvq) this.c.get()).a(b);
        String a2 = a.a(b);
        if (a2 != null) {
            int i;
            if (this.a != null) {
                xlg.a(a2);
            }
            Integer g = xhc.g();
            if (g == null) {
                i = this.e;
            } else {
                i = g.intValue();
            }
            long j = (long) i;
            g = xhc.f();
            if (g == null) {
                i = this.f;
            } else {
                i = g.intValue();
            }
            Executor xjf = new xjf(j, (long) i);
            xir xir = new xir(xjf, this.d, this, this.i);
            bckw a3 = ((bciz) this.b.get()).a(a2, xir, xjf);
            if (this.g) {
                a3.f();
            }
            a3.b(xhc.a());
            xgy c = xhc.c();
            xje xje = this.h;
            ArrayList arrayList = new ArrayList(c.b.size());
            for (Entry entry : c.b) {
                arrayList.add(new SimpleImmutableEntry((String) entry.getKey(), (String) entry.getValue()));
            }
            xje.a(a3, Collections.unmodifiableList(arrayList));
            this.i.a(a3);
            if (xhc.d() != null) {
                bcks xis;
                xhb d = xhc.d();
                ByteBuffer e = d.e();
                if (e == null) {
                    xis = new xis(d);
                } else {
                    xis = new bckv(e.slice());
                }
                a3.b(xis, xjf);
            }
            a3.b(xhc.e());
            bckx d2 = a3.d();
            d2.a();
            if (!xjf.c) {
                xjf.a(d2, xjf.a + xjf.b);
            }
            while (!xjf.c) {
                xjf.a(d2, xjf.b);
            }
            xir.a();
            xir.a();
            if (xir.b) {
                return (xho) xir.c;
            }
            throw new IOException();
        }
        String str = a.a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(b).length());
        stringBuilder.append("Request blocked by ");
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(b);
        xtl.d(stringBuilder.toString());
        throw new xld(a);
    }
}
