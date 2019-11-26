package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kqw */
public final class kqw {
    private boolean A;
    public Integer a;
    private final akvp b;
    private final int c = 2;
    private final int d = 2;
    private final int e = 3;
    private final View f;
    private final View g;
    private final ImageView h;
    private final ImageView i;
    private final TextView j;
    private final TextView k;
    private final View l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final TextView q;
    private final View r;
    private final View s;
    private final ImageView t;
    private final TextView u;
    private final TextView v;
    private final eph w;
    private final GradientDrawable x;
    private final boolean y = true;
    private boolean z;

    public kqw(akkq akkq, akvp akvp, View view) {
        this.b = (akvp) amqw.a((Object) akvp);
        this.f = (View) amqw.a((Object) view);
        this.g = view.findViewById(R.id.thumbnail_wrapper);
        this.h = (ImageView) this.g.findViewById(R.id.thumbnail);
        this.i = (ImageView) this.g.findViewById(R.id.icon);
        this.k = (TextView) view.findViewById(R.id.title);
        this.j = (TextView) view.findViewById(R.id.description);
        this.l = view.findViewById(R.id.overlay_badge_layout);
        this.m = view.findViewById(R.id.cta_button_wrapper);
        this.n = this.m.findViewById(R.id.cta_button_start_filler);
        this.o = this.m.findViewById(R.id.cta_button_touchable_wrapper);
        this.p = this.m.findViewById(R.id.cta_button_end_filler);
        this.q = (TextView) this.m.findViewById(R.id.cta_button);
        this.r = this.m.findViewById(R.id.ad_cta_button);
        this.s = view.findViewById(R.id.one_point_five_click_overlay);
        this.t = (ImageView) this.s.findViewById(R.id.one_point_five_click_overlay_icon);
        this.u = (TextView) this.s.findViewById(R.id.one_point_five_click_overlay_text);
        this.v = (TextView) this.s.findViewById(R.id.one_point_five_click_overlay_text_secondary);
        if (this.r != null) {
            this.w = new eph(akkq, view.getContext(), akvp, null, this.r);
        } else {
            this.w = null;
        }
        this.x = new GradientDrawable();
        this.x.setShape(0);
    }

    public final void a() {
        boolean z = true;
        this.z = this.k.getVisibility() == 0;
        if (this.j.getVisibility() != 0) {
            z = false;
        }
        this.A = z;
    }

    public final void a(arwf arwf, arwf arwf2, Spanned spanned, Spanned spanned2, aohe aohe, awqz awqz, awqa awqa, boolean z, boolean z2) {
        ImageView imageView;
        View view;
        arwf arwf3 = arwf;
        arwf arwf4 = arwf2;
        CharSequence charSequence = spanned;
        CharSequence charSequence2 = spanned2;
        Object obj = aohe;
        awqa awqa2 = awqa;
        xpr.a(this.k, this.z);
        xpr.a(this.j, this.A);
        int i = 1;
        int i2 = 0;
        if (!z || (arwf4 == null && charSequence == null && charSequence2 == null)) {
            i = 0;
        }
        if (arwf3 != null && i == 0) {
            ImageView imageView2 = this.i;
            akvp akvp = this.b;
            arwh a = arwh.a(arwf3.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView2.setImageResource(akvp.a(a));
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        xpr.a(this.l, i ^ 1);
        this.s.setVisibility(i == 0 ? 8 : 0);
        if (z) {
            if (arwf4 != null) {
                imageView = this.t;
                akvp akvp2 = this.b;
                arwh a2 = arwh.a(arwf4.b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                imageView.setImageResource(akvp2.a(a2));
                this.t.setVisibility(0);
            } else {
                this.t.setVisibility(8);
            }
            xpr.a(this.u, charSequence);
            xpr.a(this.v, charSequence2);
        }
        if (obj == null || this.r == null || this.w == null || !z) {
            view = null;
        } else {
            this.m.setVisibility(0);
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            View view2 = this.r;
            this.w.a(obj);
            view = view2;
        }
        if (this.y && this.m.getVisibility() == 0) {
            View view3 = this.n;
            if (view3 != null) {
                View view4 = this.o;
                if (view4 != null) {
                    View view5 = this.p;
                    if (!(view5 == null || view == null)) {
                        krc.a(this.m, view3, view4, view5, view, awqz);
                    }
                }
            }
        }
        if (z) {
            if (awqa2 != null) {
                this.x.setColor(awqa2.b);
                xpr.a(this.f, this.x);
            } else {
                xpr.a(this.f, null);
            }
        }
        if (z2) {
            int i3;
            this.h.setScaleType(ScaleType.CENTER_CROP);
            if (z) {
                i3 = this.d;
            } else {
                i3 = this.c;
            }
            if (this.d != this.c) {
                kqw.b(this.k, i3);
            } else {
                kqw.a(this.k, i3);
            }
            if (z) {
                i2 = this.e;
            }
            if (this.e != 0) {
                kqw.b(this.j, i2);
                return;
            } else {
                kqw.a(this.j, i2);
                return;
            }
        }
        ScaleType scaleType;
        int i4;
        imageView = this.h;
        if (z) {
            scaleType = ScaleType.FIT_XY;
        } else {
            scaleType = ScaleType.CENTER_CROP;
        }
        imageView.setScaleType(scaleType);
        Integer num = this.a;
        if (num != null) {
            i2 = num.intValue();
        } else if (z) {
            i2 = this.e;
        }
        TextView textView = this.k;
        if (z) {
            i4 = this.d;
        } else {
            i4 = this.c;
        }
        kqw.a(textView, i4);
        kqw.a(this.j, i2);
    }

    private static void a(TextView textView, int i) {
        if (TextUtils.isEmpty(textView.getText())) {
            textView.setVisibility(8);
        } else if (i > 0) {
            textView.setMaxLines(i);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    private static void b(TextView textView, int i) {
        if (TextUtils.isEmpty(textView.getText())) {
            textView.setVisibility(8);
            return;
        }
        int measuredHeight = textView.getVisibility() != 8 ? textView.getMeasuredHeight() : 0;
        if (i > 0) {
            textView.setMaxLines(i);
            textView.measure(0, 0);
        }
        int measuredHeight2 = (i > 0 ? textView.getMeasuredHeight() : 0) - measuredHeight;
        textView.getLayoutParams().height = measuredHeight;
        textView.setVisibility(0);
        kqz kqz = new kqz(textView, measuredHeight2, measuredHeight, i);
        kqz.setDuration((long) ((int) ((((float) Math.abs(measuredHeight2)) / textView.getContext().getResources().getDisplayMetrics().density) * 5.0f)));
        textView.startAnimation(kqz);
    }
}
