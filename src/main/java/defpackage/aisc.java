package defpackage;

/* renamed from: aisc */
public final class aisc implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aisc(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aisc a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aisc(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        aiqi aiqi = (aiqi) this.a.get();
        airt airt = (airt) this.b.get();
        this.c.get();
        return new aisd(aiqi, airt);
    }
}
