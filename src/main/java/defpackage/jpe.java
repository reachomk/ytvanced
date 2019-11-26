package defpackage;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: jpe */
public final class jpe implements jpt {
    public Animation a;
    public final DecelerateInterpolator b = new DecelerateInterpolator();
    public final aaas c;
    public String d;
    public int e;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final Context k;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    public jpe(android.content.Context r3, defpackage.zyw r4, defpackage.aaas r5) {
        /*
        r2 = this;
        r2.<init>();
        r0 = new android.view.animation.DecelerateInterpolator;
        r0.<init>();
        r2.b = r0;
        r2.k = r3;
        r3 = r4.a();
        r0 = 1;
        r1 = 0;
        if (r3 == 0) goto L_0x0021;
    L_0x0014:
        r3 = r3.e;
        if (r3 != 0) goto L_0x001a;
    L_0x0018:
        r3 = defpackage.aulu.bw;
    L_0x001a:
        r3 = r3.ac;
        if (r3 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0021;
    L_0x001f:
        r3 = 1;
        goto L_0x0022;
    L_0x0021:
        r3 = 0;
    L_0x0022:
        r2.g = r3;
        r3 = defpackage.foh.z(r4);
        r2.h = r3;
        r3 = r4.a();
        if (r3 == 0) goto L_0x003d;
    L_0x0030:
        r3 = r3.e;
        if (r3 != 0) goto L_0x0036;
    L_0x0034:
        r3 = defpackage.aulu.bw;
    L_0x0036:
        r3 = r3.af;
        if (r3 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 1;
        goto L_0x003e;
    L_0x003d:
        r3 = 0;
    L_0x003e:
        r2.i = r3;
        r3 = r4.a();
        if (r3 == 0) goto L_0x0052;
    L_0x0046:
        r3 = r3.e;
        if (r3 != 0) goto L_0x004c;
    L_0x004a:
        r3 = defpackage.aulu.bw;
    L_0x004c:
        r3 = r3.ag;
        if (r3 != 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r1 = 1;
    L_0x0052:
        r2.j = r1;
        r2.c = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpe.<init>(android.content.Context, zyw, aaas):void");
    }

    public final View a(LayoutInflater layoutInflater) {
        if (this.h) {
            return layoutInflater.inflate(R.layout.action_bar_ringo, null);
        }
        View inflate = layoutInflater.inflate(R.layout.search_bar, null);
        inflate.findViewById(R.id.search_layout).setBackgroundDrawable(a());
        return inflate;
    }

    public final View b(LayoutInflater layoutInflater) {
        View inflate;
        if (this.j) {
            inflate = layoutInflater.inflate(R.layout.action_bar_search_view_mic_out, null);
            inflate.findViewById(R.id.search_box).setBackgroundDrawable(a());
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.action_bar_search_view_grey, null);
        inflate.setBackgroundDrawable(a());
        return inflate;
    }

    public final View c(LayoutInflater layoutInflater) {
        View inflate;
        if (this.i) {
            inflate = layoutInflater.inflate(R.layout.action_bar_search_results_view_mic, null);
            inflate.findViewById(R.id.search_box).setBackgroundDrawable(a());
            return inflate;
        }
        inflate = layoutInflater.inflate(R.layout.action_bar_search_results_view_grey, null);
        inflate.setBackgroundDrawable(a());
        return inflate;
    }

    private final InsetDrawable a() {
        PaintDrawable paintDrawable = new PaintDrawable(xwe.a(this.k, R.attr.ytGeneralBackgroundA, 0));
        paintDrawable.setCornerRadius((float) xss.a(this.k.getResources().getDisplayMetrics(), 2));
        return new InsetDrawable(paintDrawable, this.k.getResources().getDimensionPixelSize(R.dimen.search_bar_inset_start), xss.a(this.k.getResources().getDisplayMetrics(), 8), this.k.getResources().getDimensionPixelSize(R.dimen.search_bar_inset_end), xss.a(this.k.getResources().getDisplayMetrics(), 8));
    }

    public final void a(View view, apxu apxu) {
        if (!this.h) {
            ImageView imageView = (ImageView) view.findViewById(R.id.youtube_logo);
            view = view.findViewById(R.id.search_layout);
            if (this.g) {
                imageView.animate().alpha(0.0f).setStartDelay(1000).setDuration(150).setInterpolator(this.b).setListener(new jph(this, imageView, view, apxu));
            } else {
                imageView.setVisibility(8);
                view.setVisibility(0);
                b(view, apxu);
            }
        }
    }

    public final void b(View view, apxu apxu) {
        view.setOnClickListener(new jpg(this, apxu));
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void a(int i) {
        this.e = i;
    }
}
