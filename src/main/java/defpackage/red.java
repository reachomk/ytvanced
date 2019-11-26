package defpackage;

/* renamed from: red */
final class red {
    public static final Class a;

    public static reg a() {
        if (a != null) {
            try {
                return red.a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return reg.b;
    }

    public static final reg a(String str) {
        return (reg) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
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
