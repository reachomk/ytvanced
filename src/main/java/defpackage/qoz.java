package defpackage;

/* renamed from: qoz */
public final class qoz {
    private static qpb a;

    public static synchronized qpb a() {
        qpb qpb;
        synchronized (qoz.class) {
            if (a == null) {
                a = new qpc();
            }
            qpb = a;
        }
        return qpb;
    }
}
