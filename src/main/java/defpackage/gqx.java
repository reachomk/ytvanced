package defpackage;

/* renamed from: gqx */
public final class gqx extends aaml {
    public atek a;
    public String b;

    public gqx(aamd aamd, afpt afpt) {
        super("reel/reel_item_watch", aamd, afpt, aall.DISABLED);
    }

    public final String a() {
        afkr afkr = new afkr();
        afkr.a("serviceName", this.l);
        afkr.a("identity", this.m.a());
        afkr.a("videoId", this.a.a());
        afkr.a("playlistId", aali.b(this.a.c()));
        afkr.a("playlistIndex", (long) aali.a(this.a.d()));
        afkr.a("playerParams", aali.b(this.a.e()));
        return afkr.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
        boolean z = true;
        amqw.b(this.a.c().isEmpty() ^ 1);
        if (this.a.a().isEmpty() && this.a.d() <= 0) {
            z = false;
        }
        amqw.b(z);
    }

    public final /* synthetic */ anzd c() {
        asry asry = (asry) asrv.e.createBuilder();
        ateh ateh = (ateh) ((anxl) this.a.build());
        asry.copyOnWrite();
        asrv asrv = (asrv) asry.instance;
        if (ateh != null) {
            asrv.c = ateh;
            asrv.a |= 2;
            String str = this.b;
            if (str != null) {
                asry.copyOnWrite();
                asrv = (asrv) asry.instance;
                asrv.a |= 4;
                asrv.d = str;
            }
            return asry;
        }
        throw new NullPointerException();
    }
}
