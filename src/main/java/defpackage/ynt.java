package defpackage;

/* renamed from: ynt */
final class ynt extends bbze {
    private final /* synthetic */ yns a;

    ynt(yns yns) {
        this.a = yns;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        yns yns = this.a;
        ykk ykk = (ykk) aadz.c();
        if (ykk == null || !ykk.getMessageKeys().isEmpty()) {
            xpr.a(yns.f.a, false);
        } else if (yns.i.getParticipantEntityKeys().size() > 1) {
            yns.g.a(yns.i.getParticipantEntityKeys(), new ynu(yns), yns.c);
        }
    }
}
