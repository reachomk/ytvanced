package defpackage;

/* renamed from: acaw */
public final class acaw {
    private static acaw b;
    public boolean a = false;

    public static acaw a() {
        if (b == null) {
            b = new acaw();
        }
        return b;
    }

    private acaw() {
    }
}
