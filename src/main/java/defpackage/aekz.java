package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aekz */
public final class aekz implements ovx {
    private final ovx a;
    private final aelb b;
    private final xsc c;
    private final aeqo d;
    private final xhv e;
    private aelc f;

    public aekz(ovx ovx, aelb aelb, xsc xsc, aeqo aeqo, xhv xhv) {
        this.a = ovx;
        this.b = aelb;
        this.c = xsc;
        this.d = aeqo;
        this.e = xhv;
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        e();
        Uri uri = ovm.a;
        int i = -1;
        if (uri != null) {
            try {
                i = Integer.parseInt(uri.getQueryParameter("rn"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f = new aelc(i, this.c.b());
        try {
            long a = this.a.a(ovm);
            this.f.d = a;
            long b = this.c.b();
            aelc aelc = this.f;
            aelc.e = b;
            aelc.j = b - aelc.b;
            aelc.h = this.d.e();
            return a;
        } catch (owb e) {
            a(e);
            throw e;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        try {
            long d = this.c.d();
            int a = this.a.a(bArr, i, i2);
            aelc aelc = this.f;
            if (!(aelc == null || aelc.a == -1)) {
                long d2 = this.c.d();
                aelc aelc2 = this.f;
                aelc2.g += (long) a;
                long min = Math.min(4095, TimeUnit.NANOSECONDS.toMillis(d2) - this.f.e);
                aelc aelc3 = this.f;
                long min2 = Math.min(4095, (aelc3.g - (aelc3.f << 10)) / 1024);
                if (TimeUnit.NANOSECONDS.toMillis(d2 - d) > 0 && min2 > 0) {
                    aekz.a(this.f.c, (int) min, (int) min2);
                    aelc = this.f;
                    aelc.f += min2;
                    aelc.e += min;
                }
            }
            return a;
        } catch (owb e) {
            a(e);
            throw e;
        }
    }

    public final void a() {
        try {
            this.a.a();
            e();
            this.a.a();
        } catch (owb e) {
            a(e);
            throw e;
        }
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void d() {
        this.a.d();
    }

    public final Map c() {
        return this.a.c();
    }

    public final Uri b() {
        return this.a.b();
    }

    private static void a(StringBuilder stringBuilder, int i, int i2) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_";
        stringBuilder.append(str.charAt((i >> 6) & 63));
        stringBuilder.append(str.charAt(i & 63));
        stringBuilder.append(str.charAt((i2 >> 6) & 63));
        stringBuilder.append(str.charAt(i2 & 63));
    }

    private final void e() {
        aelc aelc = this.f;
        if (aelc != null && aelc.a != -1) {
            long b = this.c.b();
            aelc aelc2 = this.f;
            long min = Math.min(4095, (aelc2.g - (aelc2.f << 10)) / 1024);
            long min2 = Math.min(4095, b - this.f.e);
            if (min > 0) {
                aekz.a(this.f.c, (int) min2, (int) min);
            }
            aelc2 = this.f;
            aelc2.i = b - aelc2.b;
            this.b.a(aelc2);
            this.f = null;
        }
    }

    private final void a(owb owb) {
        aelc aelc = this.f;
        if (aelc != null && aelc.a != -1) {
            aelc.k = aevl.a((IOException) owb, 0, this.e, 8).a();
            e();
        }
    }
}
