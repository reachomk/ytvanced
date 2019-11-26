package defpackage;

import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wif */
final class wif implements OnClickListener {
    private final /* synthetic */ ajsr a;
    private final /* synthetic */ wei b;
    private final /* synthetic */ ajsn c;
    private final /* synthetic */ wid d;

    wif(wid wid, ajsr ajsr, wei wei, ajsn ajsn) {
        this.d = wid;
        this.a = ajsr;
        this.b = wei;
        this.c = ajsn;
    }

    public final void onClick(View view) {
        wda wda = this.d.a;
        ajsr ajsr = this.a;
        wei wei = this.b;
        ajsn ajsn = this.c;
        apxu apxu = ajsr.d;
        if (apxu != null) {
            wda.b.a(apxu, null);
        } else {
            aphj aphj = ajsr.a;
            if (aphj == null) {
                xtl.c("No submit button specified for comment detail simplebox.");
            } else if ((aphj.a & 1) != 0) {
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 2048) != 0) {
                    aphm aphm = (aphm) ((anxo) ajsr.a.toBuilder());
                    aphg aphg2 = ajsr.a.b;
                    if (aphg2 == null) {
                        aphg2 = aphg.s;
                    }
                    aphm.a(wda.a(aphg2));
                    ajsr.a = (aphj) ((anxl) aphm.build());
                    if (wda.a(ajsn) != null) {
                        aphg aphg3;
                        aygk aygk = ajsr.b;
                        Spanned a = ajqy.a(ajsr.c);
                        aphg = ajsr.a.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                        apxu = aphg.l;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        apxu apxu2 = apxu;
                        aphj aphj2 = ajsr.f;
                        if (aphj2 == null || (aphj2.a & 1) == 0) {
                            aphg3 = null;
                        } else {
                            aphg aphg4 = aphj2.b;
                            if (aphg4 == null) {
                                aphg4 = aphg.s;
                            }
                            aphg3 = aphg4;
                        }
                        wda.a(new wdj(1, aygk, wei, ajsn, null, a, null, apxu2, aphg3), null, null, null, null, false);
                    } else if (ajsn.u == apzc.COMMENT_POLL_STATUS_VOTE_NO_COMMENT) {
                        wda.a(ajsr, wei);
                    }
                } else {
                    xtl.c("No service endpoint specified for comment detail simplebox.");
                }
            } else {
                xtl.c("No button renderer specified for comment detail simplebox.");
            }
        }
    }
}
