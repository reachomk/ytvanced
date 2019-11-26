package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wiz */
public final class wiz implements akot {
    public final aaas a;
    public final wjb b;
    public final LinearLayout c = ((LinearLayout) this.f.findViewById(R.id.comment_replies));
    public akor d;
    private final Animator e;
    private final View f;
    private final TextView g = ((TextView) this.f.findViewById(R.id.detail_view_button));
    private final int h;
    private final int i;
    private final int j;

    public wiz(Context context, akkq akkq, aaas aaas, akvz akvz, wly wly) {
        amqw.a((Object) context);
        amqw.a((Object) akkq);
        amqw.a((Object) wly);
        this.a = aaas;
        this.b = new wjb(context, (akpb) akvz.get());
        this.i = xwe.a(context, R.attr.cmtBgStyleDefault);
        this.j = xwe.a(context, R.attr.ytBorderedButtonChipBackground);
        this.f = View.inflate(context, R.layout.comment_replies, null);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.detail_view_button_margin_bottom);
        this.e = wly.a(this.f, this.i, this.j);
    }

    public final void a(ajsn ajsn) {
        this.c.addView((ViewGroup) this.b.a(this.d, ajsn, this.c.getChildCount()));
        b();
    }

    public final int b(ajsn ajsn) {
        if (ajsn != null) {
            int childCount = this.c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup = (ViewGroup) this.c.getChildAt(i);
                boolean z = true;
                if (viewGroup.getChildCount() != 1) {
                    z = false;
                }
                amqw.b(z);
                akot a = akoz.a(viewGroup.getChildAt(0));
                if ((a instanceof wih) && aocf.messageNanoEquals(ajsn, ((wih) a).D)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final View K_() {
        return this.f;
    }

    public final void a(akpb akpb) {
        if (this.e.isRunning()) {
            this.e.end();
        }
        this.b.a(this.c);
    }

    public final void b() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.g.getLayoutParams();
        marginLayoutParams.bottomMargin = this.c.getChildCount() + -1 > 0 ? this.h : 0;
        this.g.setLayoutParams(marginLayoutParams);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ajsq ajsq = (ajsq) obj;
        arml arml = null;
        akor.a.a(ajsq.d, null);
        this.d = akor;
        aphj aphj = ajsq.e;
        if (aphj == null || (aphj.a & 1) == 0) {
            this.g.setVisibility(8);
        } else {
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            this.g.setVisibility(0);
            TextView textView = this.g;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView.setText(ajqy.a(arml));
            this.g.setOnClickListener(new wiy(this, akor, aphg));
            b();
        }
        int i = 0;
        while (true) {
            ajsu[] ajsuArr = ajsq.b;
            if (i >= ajsuArr.length) {
                break;
            }
            a(ajsuArr[i].a);
            i++;
        }
        if (ajsq.f) {
            this.e.start();
            ajsq.f = false;
        }
    }
}
