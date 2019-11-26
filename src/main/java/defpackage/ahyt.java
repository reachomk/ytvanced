package defpackage;

/* renamed from: ahyt */
final class ahyt extends ajmp {
    private final /* synthetic */ ahys a;

    ahyt(ahys ahys, long j, ajms ajms, ajmr ajmr) {
        this.a = ahys;
        super(j, Long.MAX_VALUE, ajms, ajmr, null);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        for (ahzj ahzj : this.a.i) {
            ahys ahys = this.a;
            akkq akkq = ahys.b;
            int width = ahys.h.getWidth();
            this.a.h.getHeight();
            ajuh ajuh = ahzj.b;
            width = (int) (((float) width) * ajuh.f);
            akkq.a(ajuh.a, width, (int) (((float) width) / ajuh.h));
        }
    }
}
