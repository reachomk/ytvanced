package defpackage;

/* renamed from: akoe */
public final class akoe {
    private final bcaa a;

    public akoe(bcaa bcaa) {
        this.a = (bcaa) akoe.a(bcaa, 1);
    }

    public final akoc a(akpb akpb) {
        return new akoc((akpi) akoe.a((akpi) this.a.get(), 1), (akpb) akoe.a(akpb, 2));
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
