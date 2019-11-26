package defpackage;

/* renamed from: rgd */
final class rgd {
    public static final rgb a;
    public static final rgb b = new rge();

    static {
        rgb rgb;
        try {
            rgb = (rgb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rgb = null;
        }
        a = rgb;
    }
}
