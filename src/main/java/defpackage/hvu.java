package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: hvu */
public abstract class hvu implements hvg {
    private long A;
    private awfe B;
    public hvx a;
    private final int b;
    private final int c;
    private final Context d;
    private final acvx e;
    private final akkq f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private View r;
    private hvi s;
    private View t;
    private TextView u;
    private View v;
    private TextView w;
    private View x;
    private ejd y;
    private boolean z;

    hvu(Context context, acvx acvx, akkq akkq, int i, int i2) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (acvx) amqw.a((Object) acvx);
        this.f = (akkq) amqw.a((Object) akkq);
        this.b = i;
        this.c = i2;
        this.i = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_vertical_margin);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_vertical_margin_fullscreen);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_height);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_height_fullscreen);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.autonav_info_panel_margin_bottom);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.autonav_info_panel_margin_bottom_fullscreen);
        int i3 = this.k;
        int i4 = this.i;
        this.g = i3 + (i4 + i4);
        i3 = this.l;
        i4 = this.j;
        this.h = i3 + (i4 + i4);
    }

    public abstract void a(TextView textView, TextView textView2, boolean z);

    public final void a(hvx hvx, ViewGroup viewGroup) {
        this.a = (hvx) amqw.a((Object) hvx);
        LayoutInflater.from(this.d).inflate(this.b, viewGroup, true);
        this.o = (TextView) viewGroup.findViewById(R.id.countdown_text);
        this.p = (TextView) viewGroup.findViewById(R.id.title);
        this.q = (ImageView) viewGroup.findViewById(R.id.close_button);
        this.q.setOnClickListener(new hvt(this));
        this.t = viewGroup.findViewById(R.id.cancel);
        this.t.setOnClickListener(new hvw(this));
        this.u = (TextView) viewGroup.findViewById(R.id.cancel_text);
        this.v = viewGroup.findViewById(R.id.play);
        this.v.setOnClickListener(new hvv(this));
        this.w = (TextView) viewGroup.findViewById(R.id.play_text);
        this.x = viewGroup.findViewById(R.id.action_bar);
        this.r = viewGroup.findViewById(R.id.info_panel);
        this.s = new hvi(this.r, this.f);
    }

    public final void a(awfe awfe, boolean z) {
        xpr.a(this.o, z ^ 1);
        a(this.p, this.w, z);
        if (!amqq.a(this.B, awfe)) {
            this.B = awfe;
            this.s.a(awfe, true);
            aphg b = ahlr.b(awfe);
            arml arml = null;
            if (b != null) {
                arml arml2;
                CharSequence charSequence;
                this.s.a(new hvy(this));
                xpr.a(this.v, true);
                TextView textView = this.w;
                if ((b.a & 128) != 0) {
                    arml2 = b.g;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                textView.setText(ajqy.a(arml2));
                View view = this.v;
                if ((b.a & 16384) != 0) {
                    aodv aodv = b.p;
                    if (aodv == null) {
                        aodv = aodv.c;
                    }
                    charSequence = aodv.b;
                } else {
                    charSequence = null;
                }
                view.setContentDescription(charSequence);
                this.e.a(new acvs(b.r.d()), null);
            } else {
                this.s.a(null);
                xpr.a(this.v, false);
            }
            b = ahlr.c(awfe);
            if (b != null) {
                aodv aodv2;
                CharSequence charSequence2;
                arml arml3;
                ImageView imageView = this.q;
                if ((b.a & 16384) != 0) {
                    aodv2 = b.p;
                    if (aodv2 == null) {
                        aodv2 = aodv.c;
                    }
                    charSequence2 = aodv2.b;
                } else {
                    charSequence2 = null;
                }
                imageView.setContentDescription(charSequence2);
                TextView textView2 = this.u;
                if ((b.a & 128) != 0) {
                    arml3 = b.g;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                textView2.setText(ajqy.a(arml3));
                View view2 = this.t;
                if ((b.a & 16384) != 0) {
                    aodv2 = b.p;
                    if (aodv2 == null) {
                        aodv2 = aodv.c;
                    }
                    charSequence2 = aodv2.b;
                } else {
                    charSequence2 = null;
                }
                view2.setContentDescription(charSequence2);
                xpr.a(this.t, true);
                this.e.a(new acvs(b.r.d()), null);
            } else {
                ImageView imageView2 = this.q;
                imageView2.setContentDescription(imageView2.getResources().getString(R.string.accessibility_close_button));
                xpr.a(this.t, false);
            }
            TextView textView3 = this.p;
            if ((1 & awfe.a) != 0) {
                arml = awfe.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView3.setText(ajqy.a(arml));
        }
    }

    public final void a(long j, long j2) {
        j = hwn.a(j, j2);
        if (this.A != j) {
            this.A = j;
            hwn.a(this.o, this.c, j);
        }
    }

    public final void a(ejd ejd) {
        ejd ejd2 = this.y;
        if (ejd2 != ejd) {
            if (ejd2 == null || ejd2.a() != ejd.a()) {
                int i;
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.x.getLayoutParams();
                marginLayoutParams.height = !ejd.a() ? this.k : this.l;
                if (ejd.a()) {
                    i = this.j;
                } else {
                    i = this.i;
                }
                marginLayoutParams.bottomMargin = i;
                this.x.setLayoutParams(marginLayoutParams);
                marginLayoutParams = (MarginLayoutParams) this.r.getLayoutParams();
                if (ejd.a()) {
                    i = this.n;
                } else {
                    i = this.m;
                }
                marginLayoutParams.bottomMargin = i;
                this.r.setLayoutParams(marginLayoutParams);
                b(ejd);
            }
            this.y = ejd;
        }
    }

    public final void a(int i, int i2) {
        boolean z = false;
        if (this.z != (i2 > i)) {
            if (i2 > i) {
                z = true;
            }
            this.z = z;
            b(this.y);
        }
    }

    public final int a() {
        ejd ejd = this.y;
        return (ejd != null && ejd.a()) ? this.h : this.g;
    }

    private final void b(ejd ejd) {
        hvi hvi = this.s;
        boolean a = ejd.a();
        int i = R.style.f477TextAppearance.YouTube.Spec.Body2a;
        if (a && !this.z) {
            i = R.style.f480TextAppearance.YouTube.Spec.Display1;
        }
        YouTubeTextView youTubeTextView = hvi.b;
        youTubeTextView.setTextAppearance(youTubeTextView.getContext(), i);
        youTubeTextView = hvi.b;
        youTubeTextView.setTextColor(xwe.a(youTubeTextView.getContext(), R.attr.ytOverlayTextPrimary));
    }
}
