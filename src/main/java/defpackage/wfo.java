package defpackage;

import android.content.Context;
import android.text.Spanned;

/* renamed from: wfo */
public final class wfo {
    private final Context a;
    private final aaas b;
    private final acvx c;
    private final wda d;
    private final wlx e;

    public wfo(Context context, aaas aaas, acvx acvx, wda wda, wlx wlx) {
        this.a = context;
        this.b = aaas;
        this.d = wda;
        this.c = acvx;
        this.e = wlx;
    }

    public final void a(wdx wdx, aqqu aqqu, apya apya, apya apya2) {
        wdx wdx2 = wdx;
        aqqu aqqu2 = aqqu;
        apya apya3 = apya;
        apya apya4 = apya2;
        ajsn ajsn = null;
        if (wdx2 == null) {
            if (aqqu2.a == 97806346) {
                aqak aqak = (aqak) aqqu2.b;
                akor akor = this.e.b;
                this.d.a(aqak, akor != null ? (wei) akor.a("commentThreadMutator") : null, null);
            }
            return;
        }
        aqhy aqhy;
        wei wei = wdx2.a;
        apzc a = this.e.a(wdx2.b, wei.a());
        if (a == apzc.COMMENT_POLL_STATUS_NO_VOTE && (apya3.a & 1) != 0) {
            aqhy = apya3.b;
            if (aqhy == null) {
                aqhy = aqhy.q;
            }
        } else if (a != apzc.COMMENT_POLL_STATUS_VOTE_AND_COMMENT || (apya4.a & 1) == 0) {
            aqhy = null;
        } else {
            aqhy = apya4.b;
            if (aqhy == null) {
                aqhy = aqhy.q;
            }
        }
        if (aqhy == null) {
            if (aqqu2.a == 97806346) {
                aqak aqak2 = (aqak) aqqu2.b;
                ajsn ajsn2 = wdx2.b;
                ajrn ajrn = ajsn2.k;
                if (ajrn == null || ajrn.d == null) {
                    this.d.a(aqak2, wei, ajsn2);
                } else {
                    wda wda = this.d;
                    if ((aqak2.a & 32) != 0) {
                        aphj aphj = aqak2.e;
                        if (aphj == null) {
                            aphj = aphj.d;
                        }
                        if ((aphj.a & 1) != 0) {
                            aphj = aqak2.e;
                            if (aphj == null) {
                                aphj = aphj.d;
                            }
                            aphg aphg = aphj.b;
                            if (aphg == null) {
                                aphg = aphg.s;
                            }
                            if ((aphg.a & 2048) != 0) {
                                aqak2 = wda.a(aqak2);
                                if (wda.a(ajsn2) != null) {
                                    arml arml;
                                    aygk aygk = aqak2.b;
                                    if (aygk == null) {
                                        aygk = aygk.f;
                                    }
                                    aygk aygk2 = aygk;
                                    if ((aqak2.a & 16) != 0) {
                                        arml = aqak2.d;
                                        if (arml == null) {
                                            arml = arml.f;
                                        }
                                    } else {
                                        arml = null;
                                    }
                                    Spanned a2 = ajqy.a(arml);
                                    aphj aphj2 = aqak2.e;
                                    if (aphj2 == null) {
                                        aphj2 = aphj.d;
                                    }
                                    aphg aphg2 = aphj2.b;
                                    if (aphg2 == null) {
                                        aphg2 = aphg.s;
                                    }
                                    apxu apxu = aphg2.l;
                                    if (apxu == null) {
                                        apxu = apxu.d;
                                    }
                                    apxu apxu2 = apxu;
                                    if ((aqak2.a & 128) != 0) {
                                        aphj aphj3 = aqak2.g;
                                        if (aphj3 == null) {
                                            aphj3 = aphj.d;
                                        }
                                        ajsn = aphj3.b;
                                        if (ajsn == null) {
                                            ajsn = aphg.s;
                                        }
                                    }
                                    wda.a(new wdj(1, aygk2, wei, ajsn2, null, a2, null, apxu2, ajsn), null, null, null, null, false);
                                    return;
                                } else if (ajsn2.u == apzc.COMMENT_POLL_STATUS_VOTE_NO_COMMENT) {
                                    wda.a(aqak2, wei, ajsn2);
                                    return;
                                }
                            }
                            xtl.c("No service endpoint specified for comment reply dialog.");
                            return;
                        }
                        xtl.c("No button renderer specified for comment reply dialog.");
                        return;
                    }
                    xtl.c("No reply button specified for comment reply dialog.");
                    return;
                }
            }
            return;
        }
        akcq.a(this.a, aqhy, this.b, this.c, null);
    }
}
