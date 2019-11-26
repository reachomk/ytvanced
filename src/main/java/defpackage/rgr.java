package defpackage;

/* renamed from: rgr */
final class rgr {
    public static final rgp a;
    public static final rgp b = new rgs();

    static {
        rgp rgp;
        try {
            rgp = (rgp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rgp = null;
        }
        a = rgp;
    }
}
