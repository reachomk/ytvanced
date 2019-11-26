package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wjk */
final class wjk implements OnClickListener {
    private final /* synthetic */ wei a;
    private final /* synthetic */ awly b;
    private final /* synthetic */ awlz c;
    private final /* synthetic */ akor d;
    private final /* synthetic */ wjl e;

    wjk(wjl wjl, wei wei, awly awly, awlz awlz, akor akor) {
        this.e = wjl;
        this.a = wei;
        this.b = awly;
        this.c = awlz;
        this.d = akor;
    }

    public final void onClick(View view) {
        ajsn ajsn = this.a.b().a.a;
        apzc a = this.e.b.a(ajsn, this.a.a());
        if (a != apzc.COMMENT_POLL_STATUS_VOTING) {
            this.e.b.a(ajsn.g, this.b.i, apzc.COMMENT_POLL_STATUS_VOTING);
            wdt wdt = this.e.a;
            wei wei = this.a;
            awly awly = this.b;
            awlw awlw = (awlw) ((anxl) this.c.build());
            acvx acvx = this.d.a;
            int i = awlw.a;
            if ((i & 64) != 0) {
                aaas aaas = wdt.b;
                apxu apxu = awlw.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            } else if (((i & 128) == 0 || (i & 256) == 0) && (i & 8) == 0) {
                xtl.c("Endpoint not filled in poll choice.");
            } else {
                if (a == apzc.COMMENT_POLL_STATUS_VOTE_AND_COMMENT) {
                    awlu awlu = awly.h;
                    if (awlu == null) {
                        awlu = awlu.c;
                    }
                    if (awlu.a == 64099105) {
                        aqhy aqhy;
                        Context context = wdt.a;
                        awlu = awly.h;
                        if (awlu == null) {
                            awlu = awlu.c;
                        }
                        if (awlu.a == 64099105) {
                            aqhy = (aqhy) awlu.b;
                        } else {
                            aqhy = aqhy.q;
                        }
                        akcq.a(context, aqhy, wdt.b, acvx, new wdw(wdt, wei, awly, awlw, acvx), null);
                        return;
                    }
                }
                wdt.a(wei, awly, awlw, a, acvx);
            }
        }
    }
}
