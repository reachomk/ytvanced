package defpackage;

/* renamed from: adeh */
public final class adeh implements aamt {
    public adqe a;

    public final void a(asib asib) {
        adqe adqe = this.a;
        if (adqe != null && adqe.d() != 2) {
            ashr ashr;
            adqe = this.a;
            Object obj = null;
            if (!(adqe == null || adqe.d() == 2)) {
                obj = adqe.g();
            }
            if ("tvlite".equals(obj)) {
                ashr = ashr.TVLITE;
            } else if ("xbox".equals(obj)) {
                ashr = ashr.XBOX;
            } else if (adqe == null || !adqe.f()) {
                ashr = ashr.TVHTML5;
            } else {
                ashr = ashr.TVHTML5_AUDIO;
            }
            anxl anxl = ((ashy) asib.instance).c;
            if (anxl == null) {
                anxl = ashl.O;
            }
            ashn ashn = (ashn) ((anxo) anxl.toBuilder());
            ashn.a(ashr);
            asib.copyOnWrite();
            ashy ashy = (ashy) asib.instance;
            ashy.c = (ashl) ((anxl) ashn.build());
            ashy.a = 2 | ashy.a;
            String.valueOf(ashr).length();
        }
    }

    static {
        xtl.b("MDX.innertube");
    }
}
