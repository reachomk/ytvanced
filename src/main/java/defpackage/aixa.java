package defpackage;

/* renamed from: aixa */
public final class aixa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public aixa(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) aixa.a((Object) bcaa, 1);
        this.b = (bcaa) aixa.a((Object) bcaa2, 2);
        this.c = (bcaa) aixa.a((Object) bcaa3, 3);
        this.d = (bcaa) aixa.a((Object) bcaa4, 4);
        this.e = (bcaa) aixa.a((Object) bcaa5, 5);
    }

    public final aiwu a(aizm aizm, aiwy aiwy) {
        return new aiwu((bctz) aixa.a((bctz) this.a.get(), 1), (bctz) aixa.a((bctz) this.b.get(), 2), (aiyx) aixa.a((aiyx) this.c.get(), 3), (airt) aixa.a((airt) this.d.get(), 4), (aixn) aixa.a((aixn) this.e.get(), 5), (aizm) aixa.a((Object) aizm, 6), aiwy);
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
