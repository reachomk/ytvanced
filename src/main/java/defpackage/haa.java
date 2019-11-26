package defpackage;

import com.google.protos.youtube.api.innertube.ShowInterstitialActionOuterClass$ShowInterstitialAction;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: haa */
public final class haa implements aaap {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private final acwa b;
    private final fpc c;
    private final fni d;

    public haa(acwa acwa, fpb fpb, fni fni) {
        this.b = acwa;
        this.c = fpb.a(ebn.RATE_LIMIT_SHOW_INTERSTITIAL_PROMO_LAST_ALLOWED, a, TimeUnit.SECONDS);
        this.d = fni;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            if (((ShowInterstitialActionOuterClass$ShowInterstitialAction) obj).c || this.c.a()) {
                access$000 = anxl.checkIsLite(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    b2 = access$000.b;
                } else {
                    b2 = access$000.a(b2);
                }
                ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = (ShowInterstitialActionOuterClass$ShowInterstitialAction) b2;
                axlq axlq = showInterstitialActionOuterClass$ShowInterstitialAction.b;
                if (axlq == null) {
                    axlq = axlq.c;
                }
                if (axlq.a == 86135402) {
                    anze anze;
                    axlq axlq2 = showInterstitialActionOuterClass$ShowInterstitialAction.b;
                    if (axlq2 == null) {
                        axlq2 = axlq.c;
                    }
                    if (axlq2.a == 86135402) {
                        anze = (atuf) axlq2.b;
                    } else {
                        anze = atuf.j;
                    }
                    ajwn ajwn = (ajwn) ajzv.a(anze, ajwn.class);
                    this.b.t().a(ajwn.f);
                    this.d.a(ajwn);
                    this.c.b();
                }
            }
        }
    }
}
