package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ShowContentPillActionOuterClass$ShowContentPillAction;
import java.util.Map;

/* renamed from: gzp */
public final class gzp implements aaap {
    private final fev a;

    public gzp(fev fev) {
        this.a = fev;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowContentPillActionOuterClass$ShowContentPillAction.showContentPillAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        axlh axlh = ((ShowContentPillActionOuterClass$ShowContentPillAction) b).b;
        if (axlh == null) {
            axlh = axlh.c;
        }
        if (axlh.a == 127508420) {
            fey a;
            fev fev = this.a;
            aqlh aqlh = (aqlh) axlh.b;
            if (aqlh != null) {
                int a2;
                int a3;
                arml arml;
                if ((aqlh.a & 4) != 0) {
                    aqkz aqkz = aqlh.d;
                    if (aqkz == null) {
                        aqkz = aqkz.c;
                    }
                    a2 = aqlb.a(aqkz.b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                } else {
                    a2 = 4;
                }
                if ((aqlh.a & 128) != 0) {
                    aqld aqld = aqlh.f;
                    if (aqld == null) {
                        aqld = aqld.c;
                    }
                    a3 = aqlf.a(aqld.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                } else {
                    a3 = 5;
                }
                arwh arwh = arwh.REFRESH;
                if ((aqlh.a & 2) != 0) {
                    arwf arwf = aqlh.c;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh = arwh.a(arwf.b);
                    if (arwh == null) {
                        arwh = arwh.UNKNOWN;
                    }
                }
                fey h = fez.h();
                apxu apxu2 = null;
                if ((aqlh.a & 1) != 0) {
                    arml = aqlh.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                a = h.a(ajqy.a(arml)).b(a2).a(a3).a(arwh);
                if ((aqlh.a & 512) != 0) {
                    apxu2 = aqlh.g;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                }
                a = a.a(apxu2);
            } else {
                a = fez.h();
            }
            acvx acvx = fev.c;
            fez a4 = a.a(new few(aqlh, acvx)).a(new fex(aqlh, acvx)).a();
            fev = this.a;
            amqw.a((Object) a4);
            Object obj = a4 == fev.a.a().c() ? null : 1;
            if (fev.d) {
                if (obj != null) {
                    fev.a();
                } else {
                    return;
                }
            }
            fev.a.a(a4);
            fev.d = true;
            if (fev.a.c().a()) {
                if (obj != null) {
                    ((View) fev.a.c().b()).setOnClickListener(new feu(fev, a4));
                }
                if (a4.d().a()) {
                    ((albc) a4.d().b()).a(a4);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Click target is not available for pill");
        }
    }
}
