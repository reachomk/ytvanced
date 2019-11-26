package defpackage;

/* renamed from: adnc */
public abstract class adnc {
    public final xci a;
    public final adnd b;
    public final adqf c;
    public final adnb d = new adnb(this);
    private final bcaa e;
    private aizy f;

    public adnc(xci xci, adnd adnd, bcaa bcaa, adqf adqf) {
        this.a = xci;
        this.b = adnd;
        this.e = bcaa;
        this.c = adqf;
    }

    public abstract void a();

    public abstract void a(adpw adpw);

    public abstract void b();

    public abstract void b(adpw adpw);

    /* Access modifiers changed, original: protected|final */
    public final aizy c() {
        if (this.f == null) {
            this.f = (aizy) this.e.get();
        }
        return this.f;
    }

    static {
        xtl.b("MDX.player.localPlaybackControl");
    }
}
