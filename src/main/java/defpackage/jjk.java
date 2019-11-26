package defpackage;

/* renamed from: jjk */
public final class jjk {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public jjk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) jjk.a(bcaa, 1);
        this.b = (bcaa) jjk.a(bcaa2, 2);
        this.c = (bcaa) jjk.a(bcaa3, 3);
    }

    public final jjj a(akao akao, akbp akbp, akyd akyd, akoq akoq) {
        return new jjj((akvz) jjk.a((akvz) this.a.get(), 1), (xci) jjk.a((xci) this.b.get(), 2), (akdk) jjk.a((akdk) this.c.get(), 3), (akao) jjk.a(akao, 4), (akbp) jjk.a(akbp, 5), akyd, akoq);
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
