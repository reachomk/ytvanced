package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: afpp */
public final class afpp implements xcp {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private static final long b = TimeUnit.MINUTES.toSeconds(30);
    private final wya c;
    private final String d;

    public afpp(wya wya, String str) {
        this.c = (wya) amqw.a((Object) wya);
        this.d = xvd.a(str);
    }

    public final synchronized void a() {
        this.c.a(this.d, 0, 1, true, 1, false, null, null, true, false);
    }

    public final synchronized void b() {
        this.c.a(this.d, a, b, false, 1, false, null, null, true);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class, afqh.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
