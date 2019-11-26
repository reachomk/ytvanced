package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: acpr */
final class acpr implements acfl {
    public final /* synthetic */ int a;
    public final /* synthetic */ acpe b;

    acpr(acpe acpe, int i) {
        this.b = acpe;
        this.a = i;
    }

    public final void a(ajuw ajuw) {
        if (aclo.a(this.b)) {
            auyw auyw;
            this.b.ag.a(2);
            acpe acpe = this.b;
            auze auze = ajuw.a.b;
            if (auze == null) {
                auze = auze.d;
            }
            auzg auzg = auze.b;
            if (auzg == null) {
                auzg = auzg.c;
            }
            avac avac = auzg.b;
            if (avac == null) {
                avac = avac.u;
            }
            acpe.al = avac;
            acpv acpv = this.b.au;
            auze = ajuw.a.b;
            if (auze == null) {
                auze = auze.d;
            }
            auzc auzc = auze.c;
            if (auzc == null) {
                auzc = auzc.c;
            }
            axak axak = null;
            if ((auzc.a & 1) != 0) {
                auze = ajuw.a.b;
                if (auze == null) {
                    auze = auze.d;
                }
                auzc = auze.c;
                if (auzc == null) {
                    auzc = auzc.c;
                }
                auyw = auzc.b;
                if (auyw == null) {
                    auyw = auyw.y;
                }
            } else {
                auyw = null;
            }
            acpv.b(auyw);
            this.b.Y();
            avaf avaf = (avaf) ((anxo) this.b.al.toBuilder());
            acpe acpe2 = this.b;
            acpe2.a(acpe2.K, avaf);
            this.b.al = (avac) ((anxl) avaf.build());
            this.b.W();
            aspn aspn = ajuw.c;
            acpe acpe3;
            if (aspn != null) {
                acpe3 = this.b;
                aqhy aqhy = aspn.b;
                if (aqhy == null) {
                    aqhy = aqhy.q;
                }
                amqw.a((Object) aqhy);
                acpe3.au.a(aqhy);
            } else {
                asph asph = ajuw.d;
                if (asph != null) {
                    acpe = this.b;
                    avxz avxz = asph.b;
                    if (avxz == null) {
                        avxz = avxz.g;
                    }
                    amqw.a((Object) avxz);
                    acpe.au.a(avxz);
                    return;
                }
                acpe3 = this.b;
                if (!acpe3.a.getBoolean("IS_FIRST_STREAM", true)) {
                    acpe3.ab.requestFocus();
                    ((InputMethodManager) acpe3.p().getSystemService("input_method")).showSoftInput(acpe3.ab, 1);
                }
                avac avac2 = this.b.al;
                if ((avac2.a & 32768) != 0) {
                    axak = avac2.q;
                    if (axak == null) {
                        axak = axak.a;
                    }
                }
                ajzw a = ajzv.a(axak);
                if (a != null) {
                    ayvi ayvi = (ayvi) ajzv.a(a, ayvi.class);
                    if (ayvi != null) {
                        Context M_ = this.b.M_();
                        akkl c = this.b.aq.c();
                        acpe = this.b;
                        new abvk(ayvi, M_, c, acpe.ap, acpe.aB).b();
                    }
                }
            }
        }
    }

    public final void a(int i, aqhy aqhy) {
        if (aclo.a(this.b)) {
            if (i == 4) {
                Toast.makeText(this.b.p(), R.string.lc_error_state_account_not_enabled, 1).show();
                this.b.au.y();
            } else if (i == 22) {
                acpe acpe = this.b;
                if (aqhy != null) {
                    akcq.a(acpe.p(), aqhy, acpe.ap, acpe.aB, new acpt(acpe), null);
                }
            } else if (i != 27) {
                this.b.ao.postDelayed(new acpu(this), 400);
            } else {
                this.b.au.A();
            }
        }
    }
}
