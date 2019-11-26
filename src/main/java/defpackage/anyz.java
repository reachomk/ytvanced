package defpackage;

/* renamed from: anyz */
final class anyz {
    public static final anyx a;
    public static final anyx b = new anza();

    static {
        anyx anyx;
        try {
            anyx = (anyx) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            anyx = null;
        }
        a = anyx;
    }
}
