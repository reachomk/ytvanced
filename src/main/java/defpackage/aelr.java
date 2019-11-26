package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: aelr */
public final class aelr implements ovx {
    public final aell a;
    private final ovx b;
    private final awts c;
    private final xsc d;
    private final xto e = new aelu(this, "bandaidConnectionRtt");

    public aelr(ovx ovx, awts awts, aell aell, xsc xsc) {
        this.b = (ovx) amqw.a((Object) ovx);
        this.c = (awts) amqw.a((Object) awts);
        this.a = aell;
        this.d = (xsc) amqw.a((Object) xsc);
    }

    public final void a(owt owt) {
        this.b.a(owt);
    }

    public final long a(ovm ovm) {
        if (Math.random() < this.c.c) {
            long intValue = (long) ((Integer) this.e.get()).intValue();
            long min = (long) Math.min(10000, this.c.f);
            if (intValue > 0) {
                double d = (double) intValue;
                double d2 = this.c.d;
                Double.isNaN(d);
                intValue = Math.round(d * d2);
            } else {
                intValue = (long) this.c.e;
            }
            intValue = Math.max(0, Math.min(intValue, min));
            if (intValue > 0) {
                try {
                    this.d.a(intValue);
                } catch (InterruptedException unused) {
                    throw new owb("InterruptedException during injecting delay", ovm, 1);
                }
            }
        }
        return this.b.a(ovm);
    }

    public final void a() {
        this.b.a();
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.b.a(bArr, i, i2);
    }

    public final Uri b() {
        return this.b.b();
    }

    public final void a(String str, String str2) {
        this.b.a(str, str2);
    }

    public final void d() {
        this.b.d();
    }

    public final Map c() {
        return this.b.c();
    }
}
