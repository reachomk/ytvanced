package defpackage;

/* renamed from: anxe */
final class anxe {
    public static final anxc a = new anxb();
    private static final anxc b;

    static anxc a() {
        anxc anxc = b;
        if (anxc != null) {
            return anxc;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static {
        anxc anxc;
        try {
            anxc = (anxc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            anxc = null;
        }
        b = anxc;
    }
}
