package defpackage;

/* renamed from: xlc */
public final class xlc implements baqa {
    private final bcaa a;
    private final bcaa b;

    public xlc(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public final /* synthetic */ Object get() {
        Object xie;
        xax xax = (xax) this.a.get();
        bcaa bcaa = this.b;
        int a = aotj.a(xax.f().b);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 2 || a == 3) {
            xie = new xie(bcaa);
        } else {
            xie = xfs.a;
        }
        return (xfs) baqd.a(xie, "Cannot return null from a non-@Nullable @Provides method");
    }
}
