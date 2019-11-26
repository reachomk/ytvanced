package defpackage;

/* renamed from: ykk */
public final class ykk extends yie {
    private amuw b;

    public static boolean a(yml yml) {
        if (yml == null || (yml.a & 1) == 0 || !yml.b) {
            return false;
        }
        return true;
    }

    public static ykk a(apsz apsz) {
        return new ykk(apsz.a(), apsz);
    }

    private ykk(String str, apsz apsz) {
        super(str, apsz);
    }

    public final amuw getMessageKeys() {
        if (this.b == null) {
            this.b = amuw.a(((apsz) getEntity()).b());
        }
        return this.b;
    }

    public final axqf getPaginationToken() {
        return ((apsz) getEntity()).getPageToken();
    }
}
