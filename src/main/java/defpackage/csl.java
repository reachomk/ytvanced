package defpackage;

/* renamed from: csl */
final class csl implements cty {
    private final /* synthetic */ csf a;

    public final float a(ctv ctv) {
        cto cto = ctv.b;
        csi csi = (csi) this.a.b.a(ctv.a);
        csk csk = (csk) csi.a.get(cto);
        if (csk != null) {
            return csk.a.c;
        }
        cqo cqo;
        if (csi.c == 0) {
            cqo = csi.e;
        } else {
            cqo = csi.d;
        }
        if (cqo != null) {
            return cto.a((clm) cqo.a());
        }
        throw new RuntimeException("Both LayoutOutputs were null!");
    }

    public final ctn b(ctv ctv) {
        return ((csk) ((csi) this.a.b.a(ctv.a)).a.get(ctv.b)).a;
    }

    /* synthetic */ csl(csf csf) {
        this.a = csf;
    }
}
