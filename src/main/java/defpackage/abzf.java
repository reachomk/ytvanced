package defpackage;

/* renamed from: abzf */
public final /* synthetic */ class abzf implements Runnable {
    private final abza a;
    private final abzj b;

    public abzf(abza abza, abzj abzj) {
        this.a = abza;
        this.b = abzj;
    }

    public final void run() {
        abza abza = this.a;
        abzj abzj = this.b;
        abzi abzi = abza.b;
        if (abzi.b == null) {
            abzi.b = new abyq();
        }
        abzj.a();
    }
}
