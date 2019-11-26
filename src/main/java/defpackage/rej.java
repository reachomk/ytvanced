package defpackage;

/* renamed from: rej */
final class rej {
    public static final rei a = new reh();
    private static final rei b;

    static rei a() {
        rei rei = b;
        if (rei != null) {
            return rei;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static {
        rei rei;
        try {
            rei = (rei) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            rei = null;
        }
        b = rei;
    }
}
