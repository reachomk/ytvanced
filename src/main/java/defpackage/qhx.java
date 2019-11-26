package defpackage;

/* renamed from: qhx */
public abstract class qhx {
    private static qhx a;

    public abstract qia b();

    public static synchronized qhx a() {
        qhx qhx;
        synchronized (qhx.class) {
            if (a == null) {
                a = new qir();
            }
            qhx = a;
        }
        return qhx;
    }
}
