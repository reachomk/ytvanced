package defpackage;

/* renamed from: vpd */
public final class vpd {
    private final xci a;
    private final aaga b;
    private final vsm c;
    private final aakj d;
    private final vrh e;
    private final vrd f;

    public vpd(xci xci, aaga aaga, vsm vsm, aakj aakj, vrh vrh, vrd vrd) {
        this.a = (xci) amqw.a((Object) xci);
        this.b = aaga;
        this.c = (vsm) amqw.a((Object) vsm);
        this.d = (aakj) amqw.a((Object) aakj);
        this.e = (vrh) amqw.a((Object) vrh);
        this.f = (vrd) amqw.a((Object) vrd);
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 4) {
            a(vpb.AD_VIDEO_PLAY_REQUESTED);
        } else if (ordinal == 5) {
            a(vpb.AD_VIDEO_PLAYING);
        }
    }

    public final void a() {
        a(vpb.AD_VIDEO_ENDED);
    }

    private final void a(vpb vpb) {
        this.a.d(new vpa(vpb, this.c, this.e, this.d, this.b, this.f));
    }
}
