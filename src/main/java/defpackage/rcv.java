package defpackage;

/* renamed from: rcv */
final class rcv {
    public static final Class a = rcv.a("libcore.io.Memory");
    private static final boolean b = (rcv.a("org.robolectric.Robolectric") != null);

    static boolean a() {
        return (a == null || b) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
