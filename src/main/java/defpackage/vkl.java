package defpackage;

/* renamed from: vkl */
public final class vkl implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private vkl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static vkl a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new vkl(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new vki(this.a, this.b, this.c);
    }
}
