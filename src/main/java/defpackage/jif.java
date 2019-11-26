package defpackage;

/* renamed from: jif */
public final class jif implements akww {
    public static final String a = jif.class.getName().concat(".PRESENT_CONTEXT_KEY");
    public final boolean b;
    public akoq c;
    public Object d;
    public boolean e;
    private final aaal f;
    private jih g;

    public jif(aaal aaal, boolean z) {
        this.f = (aaal) amqw.a((Object) aaal);
        this.b = z;
    }

    public final akyd E_() {
        throw null;
    }

    public jif(aaal aaal, akyd akyd) {
        amqw.a(akyd instanceof jik);
        this.f = aaal;
        jik jik = (jik) akyd;
        this.d = jik.a;
        this.b = jik.b;
    }

    public final void a(jih jih, Object obj) {
        amqw.a((Object) jih);
        amqw.a(obj);
        jih jih2 = this.g;
        if (jih2 != null) {
            jih2.a(false);
        }
        if (this.e) {
            jih.a(true);
        }
        this.g = jih;
        this.d = obj;
    }

    /* JADX WARNING: Missing block: B:11:0x0032, code skipped:
            if (r0.h.a(r1.d) != false) goto L_0x008c;
     */
    public final void b(defpackage.jih r6, java.lang.Object r7) {
        /*
        r5 = this;
        defpackage.amqw.a(r6);
        defpackage.amqw.a(r7);
        r0 = r5.d;
        r1 = 4;
        if (r0 != 0) goto L_0x0090;
    L_0x000b:
        r0 = r5.b;
        if (r0 == 0) goto L_0x0035;
    L_0x000f:
        r0 = r7 instanceof defpackage.aqey;
        if (r0 == 0) goto L_0x008f;
    L_0x0013:
        r0 = r7;
        r0 = (defpackage.aqey) r0;
        r2 = r0.b;
        if (r2 != r1) goto L_0x001f;
    L_0x001a:
        r0 = r0.c;
        r0 = (defpackage.apxu) r0;
        goto L_0x0021;
    L_0x001f:
        r0 = defpackage.apxu.d;
    L_0x0021:
        r1 = com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass.downloadsPageEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r1 = r1.d;
        r0 = r0.a(r1);
        if (r0 == 0) goto L_0x008f;
    L_0x0034:
        goto L_0x008c;
    L_0x0035:
        r0 = r7 instanceof defpackage.aqeq;
        if (r0 == 0) goto L_0x008f;
    L_0x0039:
        r0 = r7;
        r0 = (defpackage.aqeq) r0;
        r2 = r0.b;
        if (r2 != r1) goto L_0x0045;
    L_0x0040:
        r2 = r0.c;
        r2 = (defpackage.apxu) r2;
        goto L_0x0047;
    L_0x0045:
        r2 = defpackage.apxu.d;
    L_0x0047:
        r3 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r3 = r3.d;
        r2 = r2.a(r3);
        if (r2 == 0) goto L_0x008f;
    L_0x005a:
        r2 = r0.b;
        if (r2 != r1) goto L_0x0063;
    L_0x005e:
        r0 = r0.c;
        r0 = (defpackage.apxu) r0;
        goto L_0x0065;
    L_0x0063:
        r0 = defpackage.apxu.d;
    L_0x0065:
        r1 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r2 = r1.d;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x007b;
    L_0x0078:
        r0 = r1.b;
        goto L_0x007f;
    L_0x007b:
        r0 = r1.a(r0);
    L_0x007f:
        r0 = (defpackage.apge) r0;
        r0 = r0.b;
        r1 = "FEhistory";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x008c;
    L_0x008b:
        return;
    L_0x008c:
        r5.a(r6, r7);
    L_0x008f:
        return;
    L_0x0090:
        if (r7 == 0) goto L_0x0112;
    L_0x0092:
        r2 = r7.getClass();
        r3 = r0.getClass();
        if (r2 != r3) goto L_0x0112;
    L_0x009c:
        r2 = r7 instanceof defpackage.aqeq;
        if (r2 == 0) goto L_0x00c2;
    L_0x00a0:
        r2 = r5.f;
        r3 = r7;
        r3 = (defpackage.aqeq) r3;
        r4 = r3.b;
        if (r4 != r1) goto L_0x00ae;
    L_0x00a9:
        r3 = r3.c;
        r3 = (defpackage.apxu) r3;
        goto L_0x00b0;
    L_0x00ae:
        r3 = defpackage.apxu.d;
    L_0x00b0:
        r0 = (defpackage.aqeq) r0;
        r4 = r0.b;
        if (r4 != r1) goto L_0x00bb;
    L_0x00b6:
        r0 = r0.c;
        r0 = (defpackage.apxu) r0;
        goto L_0x00bd;
    L_0x00bb:
        r0 = defpackage.apxu.d;
    L_0x00bd:
        r0 = r2.a(r3, r0);
        goto L_0x010d;
    L_0x00c2:
        r2 = r7 instanceof defpackage.aqey;
        if (r2 == 0) goto L_0x00e8;
    L_0x00c6:
        r2 = r5.f;
        r3 = r7;
        r3 = (defpackage.aqey) r3;
        r4 = r3.b;
        if (r4 != r1) goto L_0x00d4;
    L_0x00cf:
        r3 = r3.c;
        r3 = (defpackage.apxu) r3;
        goto L_0x00d6;
    L_0x00d4:
        r3 = defpackage.apxu.d;
    L_0x00d6:
        r0 = (defpackage.aqey) r0;
        r4 = r0.b;
        if (r4 != r1) goto L_0x00e1;
    L_0x00dc:
        r0 = r0.c;
        r0 = (defpackage.apxu) r0;
        goto L_0x00e3;
    L_0x00e1:
        r0 = defpackage.apxu.d;
    L_0x00e3:
        r0 = r2.a(r3, r0);
        goto L_0x010d;
    L_0x00e8:
        r1 = r7 instanceof defpackage.agqi;
        if (r1 == 0) goto L_0x00fa;
    L_0x00ec:
        r1 = r7;
        r1 = (defpackage.agqi) r1;
        r1 = r1.a;
        r0 = (defpackage.agqi) r0;
        r0 = r0.a;
        r0 = r1.equals(r0);
        goto L_0x010d;
    L_0x00fa:
        r1 = r7 instanceof defpackage.hkv;
        if (r1 == 0) goto L_0x0112;
    L_0x00fe:
        r1 = r5.f;
        r2 = r7;
        r2 = (defpackage.hkv) r2;
        r2 = r2.c;
        r0 = (defpackage.hkv) r0;
        r0 = r0.c;
        r0 = r1.a(r2, r0);
    L_0x010d:
        if (r0 == 0) goto L_0x0112;
    L_0x010f:
        r5.a(r6, r7);
    L_0x0112:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jif.b(jih, java.lang.Object):void");
    }

    public final void a(jih jih) {
        amqw.a((Object) jih);
        if (jih.equals(this.g)) {
            this.g = null;
        }
    }

    public static amqp a(akor akor) {
        amqw.a((Object) akor);
        Object a = akor.a(a);
        if (a instanceof jif) {
            return amqp.b((jif) a);
        }
        return ampo.a;
    }
}
