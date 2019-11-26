package defpackage;

import android.app.Activity;
import android.content.Context;
import android.preference.Preference;
import java.util.List;

/* renamed from: jba */
public final class jba extends uwc {
    private final alct g;
    private final bapu h;
    private final jac i;
    private final jbn j;
    private final ztq k;

    public jba(Context context, aaas aaas, acvx acvx, alct alct, aldg aldg, akkq akkq, aldn aldn, bapu bapu, jac jac, jbn jbn, ztq ztq, uvn uvn, uwm uwm) {
        super(context, aaas, acvx, alct, aldg, uvn, uwm);
        this.g = alct;
        this.h = bapu;
        this.i = jac;
        this.j = jbn;
        this.k = ztq;
    }

    public final Preference a(akaf akaf, String str) {
        int a;
        arml arml;
        CharSequence a2;
        axgk axgk = akaf.b;
        arml arml2 = null;
        boolean z = true;
        if (axgk != null) {
            a = axhi.a(axgk.b);
            if (a != 0 && a == 271) {
                jac jac = this.i;
                jaa jaa = new jaa((Context) jac.a((Context) jac.a.get(), 1), (jec) jac.a((jec) jac.b.get(), 2), (acwa) jac.a((acwa) jac.c.get(), 3), (axgk) jac.a(axgk, 4));
                if ((axgk.a & 8) != 0) {
                    arml = axgk.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    jaa.setTitle(ajqy.a(arml));
                }
                if (axgk.f && (axgk.a & 1024) != 0) {
                    arml = axgk.j;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a2 = ajqy.a(arml);
                } else if (axgk.e || (axgk.a & 512) == 0) {
                    if ((axgk.a & 16) != 0) {
                        arml2 = axgk.d;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    }
                    a2 = ajqy.a(arml2);
                } else {
                    arml = axgk.i;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a2 = ajqy.a(arml);
                }
                jaa.setSummary(a2);
                return jaa;
            }
        }
        if (axgk != null) {
            a = axhi.a(axgk.b);
            if (a != 0 && a == 274) {
                jbn jbn = this.j;
                jbo jbo = new jbo((Context) jbn.a((Context) jbn.a.get(), 1), (jen) jbn.a((jen) jbn.b.get(), 2), (acwa) jbn.a((acwa) jbn.c.get(), 3), (axgk) jbn.a(axgk, 4));
                if ((axgk.a & 8) != 0) {
                    arml = axgk.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    jbo.setTitle(ajqy.a(arml));
                }
                if (axgk.f && (axgk.a & 1024) != 0) {
                    arml = axgk.j;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a2 = ajqy.a(arml);
                } else if (axgk.e || (axgk.a & 512) == 0) {
                    if ((axgk.a & 16) != 0) {
                        arml2 = axgk.d;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    }
                    a2 = ajqy.a(arml2);
                } else {
                    arml = axgk.i;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a2 = ajqy.a(arml);
                }
                jbo.setSummary(a2);
                return jbo;
            }
        }
        axgb axgb = akaf.h;
        if (axgb == null) {
            arqh arqh = akaf.i;
            if (arqh == null) {
                return super.a(akaf, str);
            }
            ztq ztq = this.k;
            return new ztk((Activity) ztq.a((Activity) ztq.a.get(), 1), (aaas) ztq.a((aaas) ztq.b.get(), 2), (akkq) ztq.a((akkq) ztq.c.get(), 3), (zta) ztq.a((zta) ztq.d.get(), 4), (arqh) ztq.a(arqh, 5));
        }
        jbq jbq = new jbq(this.c);
        hpr hpr = (hpr) this.h.get();
        arml2 = axgb.b;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        jbq.setTitle(ajqy.a(arml2));
        arml arml3 = axgb.c;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        jbq.setSummary(ajqy.a(arml3));
        jbq.c = true;
        int b = hpr.b();
        if (b <= 100) {
            z = false;
        }
        amqw.b(z);
        jbq.a = 100;
        jbq.b = b;
        jbq.a();
        jbq.setDefaultValue(Integer.valueOf(100));
        jbq.d = new jbc(this, hpr);
        jbq.setKey(this.g.a(77));
        return jbq;
    }

    public final List a(akaf akaf) {
        axgb axgb = akaf.h;
        if (axgb == null) {
            return super.a(akaf);
        }
        return axgb.d;
    }
}
