package defpackage;

/* renamed from: ysw */
final class ysw extends bbze {
    private final /* synthetic */ yss a;

    ysw(yss yss) {
        this.a = yss;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yss yss = this.a;
        ylb ylb = (ylb) aadz.c();
        if (ylb != null) {
            yss.g.b.setOnClickListener(new zaj(new yst(yss, ylb)));
            zak zak = yss.g;
            zak.a.a(zak.c, ylb.getThumbnail());
            zak = yss.g;
            zak.d.setText(ylb.getTitle());
            zak = yss.g;
            zak.e.setText(String.valueOf(((awht) ylb.getEntity()).getVideoCount().intValue()));
            yss.a(yss.k);
            yss.k = yss.e.a(ylb.getOwnerChannelModelKey(), new ysv(yss), false, yss.f_);
        }
    }
}
