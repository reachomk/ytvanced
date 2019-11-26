package defpackage;

/* renamed from: akix */
public final class akix implements sxm {
    private final boolean a;

    public akix(amqp amqp) {
        this.a = ((Boolean) amqp.a(Boolean.valueOf(false))).booleanValue();
    }

    public final aobz a() {
        return azrz.a;
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
                swn.a(new akja(akeg, azfa));
                swn.a(new akiz(akeg, azfa));
                return;
            } else if (this.a) {
                swn.b(new akjc(akeg, aukw));
                return;
            } else {
                swn.a(new akjb(akeg, aukw));
                return;
            }
        }
        xtl.d("Missing YouTube element builder!");
    }
}
