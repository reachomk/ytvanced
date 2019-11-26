package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: wda */
public final class wda {
    public final Context a;
    public final aaas b;
    public final wlx c;
    public final xhv d;
    public final wcv e;
    public wdo f;
    private final Activity g;
    private final akkl h;
    private final akvp i;
    private final xoi j;
    private final xpa k;

    public wda(Activity activity, Context context, akkl akkl, aaas aaas, akvp akvp, xoi xoi, wlx wlx, xhv xhv, xpa xpa, wcv wcv) {
        this.g = (Activity) amqw.a((Object) activity);
        this.a = (Context) amqw.a((Object) context);
        this.h = (akkl) amqw.a((Object) akkl);
        this.b = (aaas) amqw.a((Object) aaas);
        this.i = akvp;
        this.j = (xoi) amqw.a((Object) xoi);
        this.c = (wlx) amqw.a((Object) wlx);
        this.d = xhv;
        this.k = xpa;
        this.e = wcv;
    }

    public final void a(ajsr ajsr, akvy akvy) {
        apxu apxu = ajsr.d;
        Map map = null;
        if (apxu != null) {
            this.b.a(apxu, null);
            return;
        }
        aphj aphj = ajsr.a;
        if (aphj == null) {
            xtl.c("No submit button specified for comment simplebox.");
        } else if ((aphj.a & 1) != 0) {
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) != 0) {
                azrq azrq;
                aphm aphm = (aphm) ((anxo) ajsr.a.toBuilder());
                aphg aphg2 = ajsr.a.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                aphm.a(a(aphg2));
                ajsr.a = (aphj) ((anxl) aphm.build());
                azru azru = ajsr.e;
                if (azru == null) {
                    azrq = null;
                } else {
                    azrq azrq2 = azru.b;
                    if (azrq2 == null) {
                        azrq2 = azrq.f;
                    }
                    azrq = azrq2;
                }
                aygk aygk = ajsr.b;
                Spanned a = ajqy.a(ajsr.c);
                aphg2 = ajsr.a.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu2 = aphg2.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                apxu apxu3 = apxu2;
                aphj aphj2 = ajsr.f;
                if (aphj2 != null) {
                    map = aphj2.b;
                    if (map == null) {
                        map = aphg.s;
                    }
                }
                wdj wdj = new wdj(1, aygk, null, null, null, a, azrq, apxu3, map);
                a(wdj, akvy, new wey(akvy), null, null, false);
                return;
            }
            xtl.c("No service endpoint specified for comment simplebox.");
        } else {
            xtl.c("No button renderer specified for comment simplebox.");
        }
    }

    public final void a(aqak aqak, wei wei, ajsn ajsn) {
        if ((aqak.a & 32) != 0) {
            aphj aphj = aqak.e;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj = aqak.e;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 2048) != 0) {
                    arml arml;
                    aphg aphg2;
                    aqak = a(aqak);
                    aygk aygk = aqak.b;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    aygk aygk2 = aygk;
                    arml arml2 = null;
                    if ((aqak.a & 4096) != 0) {
                        arml = aqak.l;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    Spanned a = ajqy.a(arml);
                    if ((aqak.a & 16) != 0) {
                        arml = aqak.d;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    Spanned a2 = ajqy.a(arml);
                    aphj = aqak.e;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    apxu apxu = aphg.l;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    apxu apxu2 = apxu;
                    if ((aqak.a & 128) != 0) {
                        aphj = aqak.g;
                        if (aphj == null) {
                            aphj = aphj.d;
                        }
                        aphg = aphj.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                        aphg2 = aphg;
                    } else {
                        aphg2 = null;
                    }
                    wdj wdj = new wdj(1, aygk2, wei, ajsn, a, a2, null, apxu2, aphg2);
                    if ((aqak.a & 8) != 0) {
                        arml2 = aqak.c;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    }
                    a(wdj, null, null, aabb.a(arml2, this.b, false), null, false);
                    return;
                }
                xtl.c("No service endpoint specified for comment reply dialog.");
                return;
            }
            xtl.c("No button renderer specified for comment reply dialog.");
            return;
        }
        xtl.c("No reply button specified for comment reply dialog.");
    }

    public final void a(ajsr ajsr, wei wei) {
        apxu apxu = ajsr.d;
        Map map = null;
        if (apxu != null) {
            this.b.a(apxu, null);
            return;
        }
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
                aphm.a(a(aphg2));
                ajsr.a = (aphj) ((anxl) aphm.build());
                aygk aygk = ajsr.b;
                Spanned a = ajqy.a(ajsr.c);
                aphg2 = ajsr.a.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                apxu apxu2 = aphg2.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
                apxu apxu3 = apxu2;
                aphj aphj2 = ajsr.f;
                if (!(aphj2 == null || (aphj2.a & 1) == 0)) {
                    map = aphj2.b;
                    if (map == null) {
                        map = aphg.s;
                    }
                }
                a(new wdj(1, aygk, wei, null, null, a, null, apxu3, map), null, null, null, null, false);
                return;
            }
            xtl.c("No service endpoint specified for comment detail simplebox.");
        } else {
            xtl.c("No button renderer specified for comment detail simplebox.");
        }
    }

    public static CharSequence a(ajsn ajsn) {
        ajrn ajrn = ajsn.k;
        arml arml = null;
        if (ajrn == null) {
            return null;
        }
        awly awly = ajrn.d;
        if (awly == null) {
            return null;
        }
        for (awlw awlw : awly.c) {
            if (awlw.d) {
                if ((awlw.a & 1) != 0) {
                    arml = awlw.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return ajqy.a(arml);
            }
        }
        return null;
    }

    public final void a(wdj wdj, akvy akvy, wef wef, CharSequence charSequence, String str, boolean z) {
        if (z || this.d.c()) {
            wkt wkt = new wkt(this.a, this.h);
            wkt.a(charSequence, z);
            if (str != null) {
                wkt.n = str;
            }
            new akle(wkt.c, new xna(), wkt.k, false).a(wdj.a);
            Spanned spanned = wdj.e;
            if (!TextUtils.isEmpty(spanned)) {
                wkt.d.setHint(spanned);
            }
            azrq azrq = wdj.f;
            if (azrq == null) {
                spanned = wdj.d;
                if (spanned != null) {
                    wkt.g.setText(spanned);
                    xpr.a(wkt.g, TextUtils.isEmpty(spanned) ^ 1);
                    xpr.a(wkt.h, TextUtils.isEmpty(spanned) ^ 1);
                }
            } else {
                arml arml = azrq.b;
                if (arml == null) {
                    arml = arml.f;
                }
                spanned = ajqy.a(arml);
                wkt.f.setText(spanned);
                xpr.a(wkt.f, TextUtils.isEmpty(spanned) ^ 1);
                arml = wdj.f.c;
                if (arml == null) {
                    arml = arml.f;
                }
                spanned = aabb.a(arml, this.b, false);
                wkt.i.setText(spanned);
                xpr.a(wkt.j, TextUtils.isEmpty(spanned) ^ 1);
                xpr.a(wkt.i, TextUtils.isEmpty(spanned) ^ 1);
            }
            wkt.a.setOnCancelListener(new wcz(this, wdj, akvy, wef, wkt));
            wkt.q = new wdc(this, wkt, wdj, akvy, wef);
            aphg aphg = wdj.h;
            if (aphg != null) {
                int i = aphg.a;
                if (!((i & 16) == 0 || (i & 4096) == 0)) {
                    akvp akvp = this.i;
                    arwf arwf = aphg.e;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    int a2 = akvp.a(a);
                    wkt.p = new wdb(this, wdj, wkt);
                    wkt.m.setVisibility(0);
                    wkt.l.setVisibility(0);
                    wkt.l.setImageResource(a2);
                }
            }
            wkt.a.setOnShowListener(new wde(this, wdj, z));
            wkt.a.setOnDismissListener(new wdd(this));
            if (!wkt.a.isShowing()) {
                wkt.a.show();
                Window window = wkt.a.getWindow();
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                window.setBackgroundDrawable(wkt.o);
                window.setSoftInputMode(5);
                wkt.d.requestFocus();
            }
            return;
        }
        this.k.a();
    }

    public final void a(CharSequence charSequence, wdj wdj, akvy akvy, wef wef, wkt wkt) {
        if (wkt.r) {
            AlertDialog create = new Builder(this.a).setMessage(charSequence).setNegativeButton(R.string.comments_discard_negative_button, new wdf(this, wdj, akvy, wef, wkt)).setPositiveButton(R.string.comments_discard_positive_button, wdi.a).setCancelable(false).create();
            create.setOnShowListener(new wdh(this));
            create.setOnDismissListener(new wdk(this));
            create.show();
        }
    }

    public final void a(wkt wkt, bqn bqn, wdj wdj, akvy akvy, wef wef, CharSequence charSequence, String str) {
        wkt.d();
        if (bqn != null) {
            this.j.c(bqn);
        } else {
            xpr.a(this.a, (int) R.string.error_comment_failed, 1);
        }
        a(wdj, akvy, wef, charSequence, str, true);
    }

    public final void a() {
        wdo wdo = this.f;
        if (wdo != null) {
            wdo.a();
        }
    }

    public final void b() {
        wdo wdo = this.f;
        if (wdo != null) {
            wdo.b();
        }
    }

    public final aphg a(aphg aphg) {
        acvx c = c();
        if (c == null) {
            return aphg;
        }
        axfq axfq = (axfq) axfr.c.createBuilder();
        axfq.a(c.d());
        axfr axfr = (axfr) ((anxl) axfq.build());
        aphf aphf = (aphf) ((anxo) aphg.toBuilder());
        anxl anxl = aphg.l;
        if (anxl == null) {
            anxl = apxu.d;
        }
        apxx apxx = (apxx) ((anxo) anxl.toBuilder());
        apxx.a(axft.b, axfr);
        aphf.a(apxx);
        return (aphg) ((anxl) aphf.build());
    }

    public final aqak a(aqak aqak) {
        acvx c = c();
        if (c == null) {
            return aqak;
        }
        axfq axfq = (axfq) axfr.c.createBuilder();
        axfq.a(c.d());
        axfr axfr = (axfr) ((anxl) axfq.build());
        aphj aphj = aqak.e;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        anxl anxl = aphg.l;
        if (anxl == null) {
            anxl = apxu.d;
        }
        apxx apxx = (apxx) ((anxo) anxl.toBuilder());
        apxx.a(axft.b, axfr);
        apxu apxu = (apxu) ((anxl) apxx.build());
        aphj = aqak.e;
        if (aphj == null) {
            aphj = aphj.d;
        }
        anxl = aphj.b;
        if (anxl == null) {
            anxl = aphg.s;
        }
        aphf aphf = (aphf) ((anxo) anxl.toBuilder());
        aphf.a(apxu);
        aphg aphg2 = (aphg) ((anxl) aphf.build());
        anxl = aqak.e;
        if (anxl == null) {
            anxl = aphj.d;
        }
        aphm aphm = (aphm) ((anxo) anxl.toBuilder());
        aphm.a(aphg2);
        aphj aphj2 = (aphj) ((anxl) aphm.build());
        aqan aqan = (aqan) ((anxo) aqak.toBuilder());
        aqan.copyOnWrite();
        aqak aqak2 = (aqak) aqan.instance;
        if (aphj2 != null) {
            aqak2.e = aphj2;
            aqak2.a |= 32;
            return (aqak) ((anxl) aqan.build());
        }
        throw new NullPointerException();
    }

    public final acvx c() {
        Activity activity = this.g;
        return activity instanceof acwa ? ((acwa) activity).t() : null;
    }

    public static amur a(akvy akvy) {
        return akvy != null ? amur.a("sectionController", akvy) : null;
    }
}
