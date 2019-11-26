package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: agwe */
public final class agwe implements xcp {
    public agwe(xci xci) {
        xci.a((Object) this);
    }

    private final synchronized void a() {
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    static {
        TimeUnit.MINUTES.toMillis(1);
    }
}
