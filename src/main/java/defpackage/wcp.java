package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: wcp */
final /* synthetic */ class wcp implements OnDismissListener {
    private final wcq a;
    private final wlk b;
    private final ajrq c;

    wcp(wcq wcq, wlk wlk, ajrq ajrq) {
        this.a = wcq;
        this.b = wlk;
        this.c = ajrq;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        wcq wcq = this.a;
        wlk wlk = this.b;
        ajrq ajrq = this.c;
        wlh wlh = wcq.c;
        byte[] bArr = ajrq.q;
        if (bArr != null) {
            apbs apbs = (apbs) apbp.g.createBuilder();
            boolean z = wlh.d == null;
            apbs.copyOnWrite();
            apbp apbp = (apbp) apbs.instance;
            apbp.a |= 2;
            apbp.c = z;
            apbq apbq = (apbq) apbn.e.createBuilder();
            String str = wlh.c;
            apbq.copyOnWrite();
            apbn apbn = (apbn) apbq.instance;
            if (str != null) {
                apbn.a |= 1;
                apbn.b = str;
                anvu a = anvu.a(bArr);
                apbq.copyOnWrite();
                apbn apbn2 = (apbn) apbq.instance;
                if (a != null) {
                    apbn2.a |= 2;
                    apbn2.c = a;
                    long j = wlh.b;
                    apbq.copyOnWrite();
                    apbn apbn3 = (apbn) apbq.instance;
                    apbn3.a |= 4;
                    apbn3.d = j;
                    apbs.copyOnWrite();
                    apbp apbp2 = (apbp) apbs.instance;
                    apbp2.b = (apbn) ((anxl) apbq.build());
                    apbp2.a |= 1;
                    apbv Y = wlk.Y();
                    if (Y != null) {
                        apbs.copyOnWrite();
                        apbp apbp3 = (apbp) apbs.instance;
                        apbp3.d = Y;
                        apbp3.a |= 4;
                    }
                    apbo apbo = (apbo) apbl.e.createBuilder();
                    apbr Z = wlk.Z();
                    if (Z != null) {
                        apbo.copyOnWrite();
                        apbl apbl = (apbl) apbo.instance;
                        apbl.b = Z;
                        apbl.a |= 1;
                    }
                    apbx aa = wlk.aa();
                    if (aa != null) {
                        apbo.copyOnWrite();
                        apbl apbl2 = (apbl) apbo.instance;
                        apbl2.d = aa;
                        apbl2.a |= 4;
                    }
                    apbt ab = wlk.ab();
                    if (ab != null) {
                        apbo.copyOnWrite();
                        apbl apbl3 = (apbl) apbo.instance;
                        apbl3.c = ab;
                        apbl3.a |= 2;
                    }
                    apbs.copyOnWrite();
                    apbp apbp4 = (apbp) apbs.instance;
                    apbp4.e = (apbl) ((anxl) apbo.build());
                    apbp4.a |= 8;
                    String str2 = wlh.d;
                    if (str2 != null) {
                        apbs.copyOnWrite();
                        apbp2 = (apbp) apbs.instance;
                        apbp2.a |= 16;
                        apbp2.f = str2;
                    }
                    asmz asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw asmw = (asmw) asmz.instance;
                    asmw.c = (anxl) apbs.build();
                    asmw.b = 162;
                    wlh.a.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }
}
