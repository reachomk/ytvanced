package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gpo */
public final class gpo {
    public final View a;
    public final gpq b;
    public TextView c;
    public eso d;
    private final Context e;
    private final acwa f;
    private final est g;
    private esu h;

    public gpo(Context context, View view, acwa acwa, est est, gpq gpq) {
        this.e = (Context) amqw.a((Object) context);
        this.a = (View) amqw.a((Object) view);
        this.f = (acwa) amqw.a((Object) acwa);
        this.g = est;
        this.b = gpq;
    }

    public final void a(axwa axwa, awyb awyb, boolean z) {
        if (axwa != null && axwa.q && this.c != null) {
            arml arml;
            CharSequence a;
            if ((axwa.a & 536870912) != 0 && z) {
                this.f.t().b(new acvs(axwa.H.d()));
            }
            Spanned spanned = null;
            if (awyb != null) {
                CharSequence obj;
                if ((awyb.a & 8) != 0) {
                    arml arml2 = awyb.e;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    obj = ajqy.a(arml2).toString();
                } else {
                    obj = null;
                }
                if ((obj == null || obj.trim().isEmpty()) && (awyb.a & 1) != 0) {
                    arml = awyb.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    obj = ajqy.a(arml).toString();
                }
                if (obj != null) {
                    axwd axwd = (axwd) ((anxo) axwa.toBuilder());
                    evj.a(this.e, axwd, obj);
                    axwa = (axwa) ((anxl) axwd.build());
                }
            }
            this.d = this.g.a(this.c, null);
            this.d.a(new esr(eso.a, R.color.yt_white1_opacity70, R.color.yt_white1_opacity70), new esr(eso.b, R.color.yt_white1, R.color.yt_white1));
            this.h = new gpr(this, axwa);
            this.d.a(this.h);
            this.d.a(axwa, z ? this.f.t() : null);
            ggh.a(this.c, true);
            if ((axwa.a & 4) != 0) {
                arml = axwa.g;
                if (arml == null) {
                    arml = arml.f;
                }
                a = ajqy.a(arml);
            } else {
                a = null;
            }
            if ((axwa.a & 128) != 0) {
                arml arml3 = axwa.l;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
                spanned = ajqy.a(arml3);
            }
            if ((a == null && spanned != null) || !(a == null || spanned == null || spanned.length() <= a.length())) {
                a = spanned;
            }
            if (a != null) {
                this.c.setHint(a);
            }
            a(axwa.o);
        }
    }

    public final void a(boolean z) {
        if (abe.H(this.c)) {
            this.c.setBackground(this.e.getResources().getDrawable(!z ? R.drawable.reel_subs_bg_subscribe : R.drawable.reel_subs_bg_subscribed));
        }
    }
}
