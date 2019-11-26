package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aekr */
public final class aekr implements ovx {
    public static final aekt a = new aeku();
    private static final AtomicInteger d = new AtomicInteger();
    private final ovx b;
    private final aeqo c;

    aekr(ovx ovx, aeqo aeqo) {
        this.b = (ovx) amqw.a((Object) ovx);
        this.c = (aeqo) amqw.a((Object) aeqo);
    }

    public final void a(owt owt) {
        this.b.a(owt);
    }

    public final long a(ovm ovm) {
        xvo a = xvo.a(ovm.a);
        a.a("rn", String.valueOf(d.incrementAndGet()));
        if (ovm.b == 2) {
            if ("/initplayback".equals(ovm.a.getPath())) {
                a.a("srn", String.valueOf(d.incrementAndGet()));
            }
        }
        aequ e = this.c.e();
        if (e != aequ.a) {
            long j = e.b;
            int i = e.c;
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(j / 8);
            stringBuilder.append(":");
            stringBuilder.append(i);
            a.b("bwe", stringBuilder.toString());
            int i2 = e.d;
            int i3 = i2 - 1;
            if (i2 != 0) {
                a.b("nt", Integer.toString(i3));
            } else {
                throw null;
            }
        }
        return this.b.a(ovm.a(a.a()));
    }

    public final int a(byte[] bArr, int i, int i2) {
        return this.b.a(bArr, i, i2);
    }

    public final void a() {
        this.b.a();
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
