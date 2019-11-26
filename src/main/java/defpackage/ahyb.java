package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahyb */
public class ahyb implements ahyi {
    private final List a;

    public ahyb(acwc... acwcArr) {
        this.a = Arrays.asList(acwcArr);
    }

    public final void a(acvx acvx, apxu apxu, ahyh ahyh) {
        anxo anxo = apxu != null ? (apxx) ((anxo) apxu.toBuilder()) : null;
        if (anxo == null) {
            apxu = null;
        } else if (ahyh == null) {
            apxu = (apxu) ((anxl) anxo.build());
        } else {
            int isEmpty = TextUtils.isEmpty(ahyh.a()) ^ 1;
            acwc b = ahyh.b();
            if (isEmpty == 0 && b == null) {
                apxu = (apxu) ((anxl) anxo.build());
            } else {
                avjh avjh;
                if (ahyb.a((apxu) ((anxl) anxo.build())) != null) {
                    avjh = (avjh) ((anxo) ahyb.a((apxu) ((anxl) anxo.build())).toBuilder());
                } else {
                    avjh = (avjh) avjf.h.createBuilder();
                }
                if (isEmpty != 0) {
                    String a = ahyh.a();
                    if (a != null) {
                        avjh.a(a);
                    } else {
                        avjh.copyOnWrite();
                        avjf avjf = (avjf) avjh.instance;
                        avjf.a &= -2;
                        avjf.b = avjf.h.b;
                    }
                }
                if (b != null) {
                    avjh.a(ahyh.b().dU);
                }
                anxo.a(avjd.b, (avjf) ((anxl) avjh.build()));
                apxu = (apxu) ((anxl) anxo.build());
            }
        }
        acvx.a(acwl.aD, acww.DEFAULT, apxu);
        for (acwc b2 : this.a) {
            acvx.b(b2, null);
        }
    }

    public void a(acvx acvx) {
        acvx.b();
    }

    private static avjf a(apxu apxu) {
        if (apxu == null) {
            return null;
        }
        anxr access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (avjf) b;
    }
}
