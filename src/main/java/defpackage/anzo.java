package defpackage;

/* renamed from: anzo */
final class anzo {
    public static final anzm a;
    public static final anzm b = new anzl();

    static {
        anzm anzm;
        try {
            anzm = (anzm) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            anzm = null;
        }
        a = anzm;
    }
}
