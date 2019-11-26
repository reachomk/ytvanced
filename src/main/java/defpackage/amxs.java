package defpackage;

/* renamed from: amxs */
public final class amxs extends amxq {
    private static final amxt b = new amxt();

    @Deprecated
    public static amxs a(String str) {
        if ((str.isEmpty() ^ 1) != 0) {
            return new amxs(amyv.a(str.replace('/', '.')));
        }
        throw new IllegalArgumentException("injected class name is empty");
    }

    private amxs(amyr amyr) {
        super(amyr);
    }
}
