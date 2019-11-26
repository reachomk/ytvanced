package defpackage;

/* renamed from: anwx */
final class anwx {
    public static final Class a;

    public static anxa a() {
        if (a != null) {
            try {
                return anwx.a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return anxa.a;
    }

    public static final anxa a(String str) {
        return (anxa) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    static {
        Class cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
