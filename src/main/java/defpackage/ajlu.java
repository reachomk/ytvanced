package defpackage;

/* renamed from: ajlu */
final class ajlu implements ajmn {
    private final /* synthetic */ ajln a;

    ajlu(ajln ajln) {
        this.a = ajln;
    }

    public final void a(airi airi) {
        this.a.c(airi);
    }

    public final airi a() {
        return this.a.m;
    }

    public final ajpu b() {
        return this.a.D();
    }

    public final void a(ajmo ajmo) {
        this.a.c(ajmo);
    }

    public final ajmo c() {
        return this.a.l;
    }

    public final void a(String str) {
        this.a.b(str);
    }

    public final void d() {
        this.a.j = null;
    }

    public final void e() {
        this.a.J();
    }

    public final void a(boolean z) {
        ajln ajln = this.a;
        if (ajln.j != null) {
            ajlv.a(ajln.F(), 0);
            if (!ajlv.a(ajln.D())) {
                ajln.j.a.a().d();
            }
            ajln.a(airh.ENDED, ajln.j.a);
        }
        if (ajln.i != null) {
            ajln.O();
            ajpe W;
            ajpb ajpb;
            if (z) {
                W = ajln.h.a.W();
                ajpb = W.e.a;
                ajpb.getClass();
                W.a(new ajpf(ajpb));
            } else {
                W = ajln.h.a.W();
                ajpb = W.e.a;
                ajpb.getClass();
                W.a(new ajpg(ajpb));
            }
        } else if (!(ajlv.a(ajln.D()) || ajln.a.a)) {
            ajln.a.a = true;
            afpc.a(2, afpf.player, "got onInterstitialVideoEnded without a savedContentVideoState. This should not happen");
        }
    }

    public final void f() {
        ajln ajln = this.a;
        ajln.i = ajln.a(false, false, 0, true);
    }

    public final void a(airh airh, ajpu ajpu) {
        this.a.a(airh, ajpu);
    }

    public final boolean g() {
        return this.a.M();
    }

    public final void a(int i, String str) {
        ajll ajll = this.a.c;
        aiod aiod = new aiod(i, str);
        for (ajps a : ajll.b) {
            a.a(aiod);
        }
    }

    public final boolean h() {
        return this.a.N();
    }

    public final void a(ajpu ajpu, int i, long j, long j2, long j3) {
        this.a.a(ajpu, i, j, j2, j3);
    }

    public final void a(int i) {
        this.a.o = i;
    }

    public final void a(ahjc ahjc) {
        this.a.a(ahjc, 4);
    }

    public final void a(ajpu ajpu, int i) {
        this.a.a(ajpu, i, 0);
    }
}
