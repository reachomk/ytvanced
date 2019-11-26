package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: oeo */
public final class oeo extends ouz implements ovx {
    private static final Pattern b = Pattern.compile("(^|&)rn=[0-9]+");
    private static final AtomicInteger c = new AtomicInteger();
    public int a;
    private final ovx d;
    private final long e;
    private long f;
    private Uri g;
    private ovm h;
    private Uri j;
    private long k;
    private boolean l;
    private boolean m;

    public oeo(ovx ovx, int i, long j) {
        super(true);
        this.d = (ovx) oxz.a((Object) ovx);
        this.a = i;
        this.e = j;
    }

    public final long a(ovm ovm) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        if (this.j != null && elapsedRealtime - this.k > this.e) {
            e();
        }
        if (!ovm.a.equals(this.g)) {
            e();
            this.g = ovm.a;
        }
        Uri uri = ovm.a;
        Uri uri2 = this.j;
        if (uri2 != null) {
            uri = uri2;
        }
        String encodedQuery = uri.getEncodedQuery();
        int incrementAndGet = c.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder(14);
        stringBuilder.append("rn=");
        stringBuilder.append(incrementAndGet);
        String stringBuilder2 = stringBuilder.toString();
        if (encodedQuery != null) {
            Matcher matcher = b.matcher(encodedQuery);
            if (matcher.find()) {
                encodedQuery = String.valueOf(stringBuilder2);
                stringBuilder2 = "$1";
                stringBuilder2 = matcher.replaceFirst(encodedQuery.length() == 0 ? new String(stringBuilder2) : stringBuilder2.concat(encodedQuery));
            } else if (!encodedQuery.isEmpty()) {
                StringBuilder stringBuilder3 = new StringBuilder((encodedQuery.length() + 1) + String.valueOf(stringBuilder2).length());
                stringBuilder3.append(encodedQuery);
                stringBuilder3.append("&");
                stringBuilder3.append(stringBuilder2);
                stringBuilder2 = stringBuilder3.toString();
            }
        }
        ovm = ovm.a(uri.buildUpon().encodedQuery(stringBuilder2).build());
        b(ovm);
        this.h = ovm;
        try {
            elapsedRealtime = this.d.a(ovm);
            if (this.j == null) {
                this.j = this.d.b();
                this.k = SystemClock.elapsedRealtime();
            }
            c(ovm);
            this.m = true;
            return elapsedRealtime;
        } catch (owb e) {
            g();
            throw e;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        try {
            if (this.a > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
                if (elapsedRealtime > ((long) this.a)) {
                    throw new oen((ovm) oxz.a(this.h), elapsedRealtime);
                }
            }
            int a = this.d.a(bArr, i, i2);
            a(a);
            return a;
        } catch (owb e) {
            g();
            throw e;
        }
    }

    public final void a() {
        try {
            this.d.a();
            if (this.m) {
                f();
                this.m = false;
            }
        } catch (owb e) {
            g();
            throw e;
        } catch (Throwable th) {
            if (this.m) {
                f();
                this.m = false;
            }
        }
    }

    public final Uri b() {
        return this.d.b();
    }

    public final Map c() {
        return this.d.c();
    }

    public final void a(String str, String str2) {
        this.d.a(str, str2);
    }

    public final void d() {
        this.d.d();
    }

    private final void e() {
        this.j = null;
        this.k = 0;
        this.l = false;
    }

    private final void g() {
        this.j = null;
        this.k = 0;
        this.l = false;
    }

    static {
        oeo.class.getSimpleName();
    }
}
