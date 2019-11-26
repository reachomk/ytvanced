package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: admp */
public final class admp extends adnc {
    private static final String e = xtl.b("MDX.player.defaultLocalPlaybackControl");

    public admp(xci xci, ajam ajam, bcaa bcaa, adqf adqf) {
        super(xci, (adnd) ajam.k(), bcaa, adqf);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(adpw adpw) {
        if ((adpw.a(((aizy) amqw.a(c())).k()) ^ 1) != 0 || c(adpw)) {
            d(adpw);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(adpw adpw) {
        if (c(adpw)) {
            d(adpw);
        } else {
            c().e();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        ajis ajis;
        aizy c = c();
        aiqq aiqq = null;
        if (TextUtils.isEmpty(c.k())) {
            ajis = null;
        } else {
            String i;
            boolean a = aebk.a(c.m());
            aiqq aiqq2 = c.B().a;
            if (aiqq2 != null) {
                i = aiqq2.i();
            }
            ajmq p = c.p();
            long d = p != null ? p.d() : 0;
            aiqs a2 = aiqq.a();
            a2.a = (apxu) ((anxl) airn.a(c.k(), a ? "" : c.m(), !a ? c.l() : -1, (float) TimeUnit.MILLISECONDS.toSeconds(d), i).build());
            a2.a(true);
            aiqq = a2.b();
            ajis = c.A();
        }
        c.h();
        if (aiqq != null) {
            String valueOf = String.valueOf(aiqq.b());
            String str = "Reload video ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            c.a(aiqq);
            if (ajis != null) {
                c.a(ajis);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        c().h();
    }

    private final boolean c(adpw adpw) {
        return adpw.b(((aizy) amqw.a(c())).m()) ^ 1;
    }

    private final void d(adpw adpw) {
        aizy aizy = (aizy) amqw.a(c());
        aiqs a = aiqq.a();
        a.a = (apxu) ((anxl) airn.a(adpw.a(), adpw.e(), adpw.f(), (float) TimeUnit.MILLISECONDS.toSeconds(adpw.c()), adpw.h()).build());
        if (adpw.a().equals(aizy.k())) {
            a.a();
        }
        aiqq b = a.b();
        String.valueOf(b).length();
        aizy.a(b);
    }
}
