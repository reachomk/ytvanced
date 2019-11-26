package defpackage;

/* renamed from: iwb */
public final class iwb implements akox {
    private final bcaa a;

    public iwb(bcaa bcaa) {
        this.a = (bcaa) iwb.a((Object) bcaa);
    }

    private static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }
}
