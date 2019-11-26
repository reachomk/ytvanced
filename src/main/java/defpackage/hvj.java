package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
import com.google.android.youtube.R;

/* renamed from: hvj */
public final class hvj extends exy implements ell, hvk {
    public final acvx e;
    public final aaas f;
    private final elm g;
    private final bdfu h = new bdfu();
    private final ajam i;
    private final akkq j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private DurationBadgeView o;

    public hvj(elm elm, ajam ajam, acvx acvx, aaas aaas, akkq akkq) {
        this.g = (elm) amqw.a((Object) elm);
        this.i = (ajam) amqw.a((Object) ajam);
        this.e = acvx;
        this.f = aaas;
        this.j = (akkq) amqw.a((Object) akkq);
    }

    public final void A_() {
        this.h.a();
        this.h.a(this.i.t().f().a(bcut.a()).a(new hvm(this), hvl.a));
    }

    public final void ar_() {
        this.h.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        if (this.g.b) {
            A_();
        }
        this.g.a(this);
    }

    public final LayoutParams i() {
        LayoutParams layoutParams;
        ViewStub viewStub = this.d;
        if (viewStub != null) {
            layoutParams = viewStub.getLayoutParams();
        } else if (g() != null) {
            return g().getLayoutParams();
        } else {
            layoutParams = null;
        }
        return layoutParams;
    }

    public final void a(LayoutParams layoutParams) {
        ViewStub viewStub = this.d;
        if (viewStub != null) {
            viewStub.setLayoutParams(layoutParams);
        } else if (g() != null) {
            g().setLayoutParams(layoutParams);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        View g = g();
        this.k = (ImageView) g.findViewById(R.id.thumbnail);
        this.l = (TextView) g.findViewById(R.id.title);
        this.m = (TextView) g.findViewById(R.id.video_title);
        this.n = (TextView) g.findViewById(R.id.byline);
        this.o = (DurationBadgeView) g.findViewById(R.id.duration);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        awfe awfe = (awfe) this.b;
        if (awfe != null) {
            aygk aygk;
            arml arml;
            akkq akkq = this.j;
            ImageView imageView = this.k;
            if ((awfe.a & 512) != 0) {
                aygk = awfe.k;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else {
                aygk = null;
            }
            akkq.a(imageView, aygk);
            TextView textView = this.l;
            if ((awfe.a & 1) != 0) {
                arml = awfe.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = this.m;
            if ((awfe.a & 2) != 0) {
                arml = awfe.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = this.n;
            if ((awfe.a & 4) != 0) {
                arml = awfe.d;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            aphg b = ahlr.b(awfe);
            if (b == null || (b.a & 4096) == 0) {
                g().setOnClickListener(null);
                g().setClickable(false);
                g().setContentDescription(null);
            } else {
                g().setOnClickListener(new hvo(this, b));
                g().setContentDescription(this.m.getText());
            }
            exx.a(this.o, null, null, awfe.l, null);
        }
    }
}
