package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: anmd */
public abstract class anmd {
    private static WeakReference a;

    public abstract ryi a(anlp anlp);

    public static synchronized anmd a() {
        synchronized (anmd.class) {
            anmd anmd = a != null ? (anmd) a.get() : null;
            if (anmd != null) {
                return anmd;
            }
            annj annj = new annj(anlf.c().a());
            a = new WeakReference(annj);
            return annj;
        }
    }
}
