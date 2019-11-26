package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: ewu */
final /* synthetic */ class ewu implements addr {
    private final ewr a;

    ewu(ewr ewr) {
        this.a = ewr;
    }

    public final void a(adiq adiq) {
        afsw afsw = this.a;
        Map m = adiq.m();
        String str = null;
        String str2 = m != null ? (String) m.get("offerParams") : null;
        if (m != null) {
            str = (String) m.get("remoteTransactionSessionId");
        }
        ewv ewv = new ewv(adiq.k.g(), str2, str);
        if (!(ewv.a == null || afsw.e.contains(ewv.b))) {
            ewv ewv2 = afsw.d;
            if (ewv2 == null || !ewv2.a.equals(ewv.a) || !TextUtils.equals(afsw.d.b, ewv.b)) {
                ewv2 = afsw.d;
                if (ewv2 == null || ewv2.a.equals(ewv.a)) {
                    ewv2 = afsw.d;
                    if (ewv2 != null && !TextUtils.isEmpty(ewv2.b) && afsw.d.a.equals(ewv.a) && TextUtils.isEmpty(ewv.b)) {
                        afsw.b.removeCallbacks(new ewt(afsw));
                        afsw.b.post(new eww(afsw));
                    } else if (!TextUtils.isEmpty(ewv.b)) {
                        String.valueOf(ewv).length();
                        afsw.d = ewv;
                        ablj ablj = afsw.c;
                        aaml abmc = new abmc(ablj.c, ablj.d.c());
                        abmc.a = aali.b(afsw.d.b);
                        abmc.g();
                        String valueOf = String.valueOf(afsw.d.b);
                        str = "YPCGetOfferDetailsRequest with offerParams: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            str.concat(valueOf);
                        }
                        afsw.c.l.a(abmc, afsw);
                        afsw.a("deviceDetected");
                        aupy aupy = (aupy) aupv.d.createBuilder();
                        aupy.a(9);
                        aupy.a(afsw.d.c);
                        aupv aupv = (aupv) ((anxl) aupy.build());
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        if (aupv != null) {
                            asmw.c = aupv;
                            asmw.b = 146;
                            afsw.a.a((asmw) ((anxl) asmz.build()));
                            return;
                        }
                        throw new NullPointerException();
                    }
                }
            }
        }
    }
}
