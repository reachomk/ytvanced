package defpackage;

/* renamed from: acvl */
public final class acvl implements acvz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public acvl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) acvl.a(bcaa, 1);
        this.b = (bcaa) acvl.a(bcaa2, 2);
        this.c = (bcaa) acvl.a(bcaa3, 3);
        this.d = (bcaa) acvl.a(bcaa4, 4);
        this.e = (bcaa) acvl.a(bcaa5, 5);
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

    public final /* synthetic */ acvx a(acxe acxe) {
        return new acvj((xuu) acvl.a((xuu) this.a.get(), 1), (xci) acvl.a((xci) this.b.get(), 2), (acwe) acvl.a((acwe) this.c.get(), 3), (acwh) acvl.a((acwh) this.d.get(), 4), (acxa) acvl.a((acxa) this.e.get(), 5), (acxe) acvl.a(acxe, 6));
    }
}
