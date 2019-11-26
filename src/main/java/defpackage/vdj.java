package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: vdj */
public abstract class vdj {
    private static final long a = TimeUnit.MINUTES.toMillis(7);
    private static final long b = TimeUnit.MINUTES.toMillis(15);
    private static final long c = TimeUnit.SECONDS.toMillis(15);
    private static final long d = TimeUnit.SECONDS.toMillis(15);

    vdj() {
    }

    public abstract String a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public static vdi a(String str) {
        vdk vdk = new vdk();
        if (str != null) {
            vdk.a = str;
            vdk.b = Long.valueOf(a);
            vdk.c = Long.valueOf(b);
            vdk.d = Long.valueOf(c);
            vdk.e = Long.valueOf(0);
            vdk.f = Long.valueOf(d);
            vdk.a(false);
            vdk.b(false);
            vdk.c(false);
            vdk.d(false);
            Boolean valueOf = Boolean.valueOf(false);
            vdk.g = valueOf;
            vdk.h = valueOf;
            return vdk;
        }
        throw new NullPointerException("Null getAppVersionForAds");
    }
}
