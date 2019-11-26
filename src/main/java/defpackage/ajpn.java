package defpackage;

/* renamed from: ajpn */
public final class ajpn implements ajpa {
    public ajpb a;
    private volatile boolean b = false;
    private final /* synthetic */ ajpe c;

    public ajpn(ajpe ajpe) {
        this.c = ajpe;
        ajpe.c.b();
    }

    public final void a() {
        b();
        if (this.a != null && this.b) {
            this.b = false;
            this.c.a.b();
        }
        ajpe ajpe = this.c;
        ajpe.b.execute(new ajpi(ajpe, this));
        ajpe = this.c;
        ajpe.e = null;
        ajpe.b();
    }

    public final void a(aakj aakj, String str, ajpb ajpb) {
        b();
        this.a = (ajpb) amqw.a((Object) ajpb);
        this.c.a.a(aakj, str);
        this.b = true;
    }

    private final void b() {
        if (this.c.e != this) {
            throw new ajpq();
        }
    }
}
