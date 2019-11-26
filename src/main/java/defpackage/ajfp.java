package defpackage;

import android.text.TextUtils;

/* renamed from: ajfp */
final /* synthetic */ class ajfp implements Runnable {
    private final ajfm a;
    private final afpt b;
    private final String c;
    private final boolean d;

    ajfp(ajfm ajfm, afpt afpt, String str, boolean z) {
        this.a = ajfm;
        this.b = afpt;
        this.c = str;
        this.d = z;
    }

    public final void run() {
        ajfm ajfm = this.a;
        afpt afpt = this.b;
        String str = this.c;
        boolean z = this.d;
        aqtq aqtq = ajfm.e;
        if (aqtq == null || !aqtq.b || ajfm.c.c()) {
            ajfm.a(afpt);
        } else {
            String a = ajfm.a("e");
            if (a != null) {
                aoxl aoxl = (aoxl) aoxm.c.createBuilder();
                aoxn aoxn = (aoxn) aoxo.d.createBuilder();
                String str2 = ajfm.b;
                aoxn.copyOnWrite();
                aoxo aoxo = (aoxo) aoxn.instance;
                if (str2 != null) {
                    aoxo.a |= 2;
                    aoxo.c = str2;
                    aoxn.copyOnWrite();
                    aoxo aoxo2 = (aoxo) aoxn.instance;
                    aoxo2.a |= 1;
                    aoxo2.b = a;
                    aoxl.copyOnWrite();
                    aoxm aoxm = (aoxm) aoxl.instance;
                    aoxm.b = (anxl) aoxn.build();
                    aoxm.a = 1;
                    aoxm = (aoxm) ((anxl) aoxl.build());
                    afoi afoi = ajfm.d;
                    njz njz = (njz) nka.l.createBuilder();
                    njz.a(aoxm.toByteString());
                    njz.a("attestation");
                    njz.b(afpt.a());
                    if (!TextUtils.isEmpty(str)) {
                        njz.c(str);
                    }
                    njz.a(z);
                    njz njz2 = (njz) ((anxo) ((nka) ((anxl) njz.build())).toBuilder());
                    aqtq aqtq2 = ajfm.e;
                    afoi.a(njz2, aqtq2 != null ? (long) aqtq2.d : 60);
                    return;
                }
                throw new NullPointerException();
            }
        }
    }
}
