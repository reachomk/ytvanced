package defpackage;

/* renamed from: akje */
public final class akje implements sxo {
    private final boolean a;

    public akje(amqp amqp) {
        this.a = ((Boolean) amqp.a(Boolean.valueOf(false))).booleanValue();
    }

    public final anwy a() {
        return aukw.d;
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        aukw aukw = (aukw) obj;
        if (swn instanceof akeg) {
            akeg akeg = (akeg) swn;
            anxr access$000 = anxl.checkIsLite(aukx.a);
            aukw.a(access$000);
            if (aukw.h.a(access$000.d)) {
                anvu anvu = aukw.b;
                azfd azfd = (azfd) azfa.h.createBuilder();
                if (anvu != null) {
                    azfd.a(anvu);
                }
                azfa azfa = (azfa) ((anxl) azfd.build());
                swn.a(new akjd(akeg, azfa));
                swn.a(new akjg(akeg, azfa));
                return;
            } else if (this.a) {
                swn.b(new akjf(akeg, aukw));
                return;
            } else {
                swn.a(new akji(akeg, aukw));
                return;
            }
        }
        xtl.d("Missing YouTube element builder!");
    }
}
