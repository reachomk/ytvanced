package defpackage;

/* renamed from: akop */
public final class akop {
    private final bcaa a;

    public akop(bcaa bcaa) {
        this.a = (bcaa) akop.a((Object) bcaa, 1);
    }

    public final akoj a(akou akou) {
        return new akoj((aaas) akop.a((aaas) this.a.get(), 1), (akou) akop.a((Object) akou, 2));
    }

    public final akoj a(akou akou, akok akok) {
        return new akoj((aaas) akop.a((aaas) this.a.get(), 1), (akou) akop.a((Object) akou, 2), (akok) akop.a((Object) akok, 3));
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
