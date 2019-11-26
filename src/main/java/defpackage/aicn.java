package defpackage;

/* renamed from: aicn */
public final class aicn {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public aicn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) aicn.a((Object) bcaa, 1);
        this.b = (bcaa) aicn.a((Object) bcaa2, 2);
        this.c = (bcaa) aicn.a((Object) bcaa3, 3);
    }

    public final aicl a(aibb aibb, aigc aigc) {
        return new aicl((aizy) aicn.a((aizy) this.a.get(), 1), (xci) aicn.a((xci) this.b.get(), 2), (ajko) aicn.a((ajko) this.c.get(), 3), (aibb) aicn.a((Object) aibb, 4), (aigc) aicn.a((Object) aigc, 5));
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
