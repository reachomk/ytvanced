package defpackage;

import android.content.res.Configuration;

/* renamed from: cqx */
public class cqx {
    private static cqx a;
    private final Configuration b;

    static synchronized cqx a(Configuration configuration) {
        cqx cqx;
        synchronized (cqx.class) {
            if (a == null || !a.b.equals(configuration)) {
                a = new cpu(new Configuration(configuration));
            }
            cqx = a;
        }
        return cqx;
    }

    protected cqx(Configuration configuration) {
        this.b = configuration;
    }
}
