package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ivs */
public final class ivs implements akot, iwu {
    private final LayoutInflater a;
    private final akkq b;
    private final akoj c;
    private final ViewGroup d;
    private boolean e;
    private ivv f;
    private ivv g;

    public ivs(Context context, akkq akkq, aaas aaas) {
        this.a = LayoutInflater.from(context);
        this.b = akkq;
        this.d = new FrameLayout(context);
        this.d.setClickable(true);
        this.d.setLayoutParams(new LayoutParams(-1, -2));
        this.c = new akoj(aaas, this.d);
    }

    public final void a(akpb akpb) {
        this.c.a();
    }

    public final View K_() {
        return this.d;
    }

    private final ivv h() {
        if (this.e) {
            if (this.f == null) {
                this.f = new ivv(this.a.inflate(R.layout.watch_card_hero_one_vs_one_event, this.d, false));
            }
            return this.f;
        }
        if (this.g == null) {
            this.g = new ivv(this.a.inflate(R.layout.watch_card_hero_one_vs_one_event_no_thumbnail, this.d, false));
        }
        return this.g;
    }

    public final TextView b() {
        return h().b;
    }

    public final TextView c() {
        return h().c;
    }

    public final TextView d() {
        return h().d;
    }

    public final TextView e() {
        return h().e;
    }

    public final TextView f() {
        return h().f;
    }

    public final TextView g() {
        return h().g;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        axtn axtn = (axtn) obj;
        boolean z = true;
        if ((axtn.a & 1) == 0) {
            z = false;
        }
        this.e = z;
        ivv h = h();
        this.d.removeAllViews();
        this.d.addView(h.a);
        akoj akoj = this.c;
        acvx acvx = akor.a;
        if ((axtn.a & 2) != 0) {
            apxu = axtn.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(axtn.g.d(), null);
        if (this.e) {
            arml arml;
            arml arml2;
            akkq akkq = this.b;
            ImageView imageView = h.i;
            aygk aygk = axtn.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
            TextView textView = h.h;
            if ((axtn.a & 8) != 0) {
                arml = axtn.e;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            Spanned a = ajqy.a(arml);
            if ((axtn.a & 8) != 0) {
                arml2 = axtn.e;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            exx.a(textView, a, ajqy.b(arml2), axtn.f, null);
        }
        axtp axtp = axtn.d;
        if (axtp == null) {
            axtp = axtp.i;
        }
        iwv.a((iwu) this, axtp);
    }
}
