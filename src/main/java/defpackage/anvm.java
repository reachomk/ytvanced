package defpackage;

/* renamed from: anvm */
final class anvm {
    public static final Class a = anvm.a("libcore.io.Memory");
    private static final boolean b = (anvm.a("org.robolectric.Robolectric") != null);

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
