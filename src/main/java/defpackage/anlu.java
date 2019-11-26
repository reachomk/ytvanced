package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: anlu */
public abstract class anlu {
    private static WeakReference a;

    public abstract ryi a(anmg... anmgArr);

    public abstract ryi b();

    public static synchronized anlu a() {
        synchronized (anlu.class) {
            anlu anlu = a != null ? (anlu) a.get() : null;
            if (anlu != null) {
                return anlu;
            }
            anna anna = new anna(anlf.c().a());
            a = new WeakReference(anna);
            return anna;
        }
    }
}
