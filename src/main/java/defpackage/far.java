package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: far */
public final class far extends fan {
    private final int a;

    public far(ViewStub viewStub, int i) {
        super(viewStub);
        this.a = i;
    }

    public far(View view, int i) {
        super(view);
        this.a = i;
    }

    public final void a(aped aped) {
        if (aped != null) {
            this.f = b();
            this.f.setVisibility(0);
            TextView textView = (TextView) this.f.findViewById(R.id.ypc_badge_icon);
            TextView textView2 = (TextView) this.f.findViewById(R.id.ypc_badge_label);
            TextView textView3 = (TextView) this.f.findViewById(R.id.ypc_badge_discount);
            TextView textView4 = (TextView) this.f.findViewById(R.id.ypc_badge_text);
            int i = aped.a;
            arml arml = null;
            if ((i & 4) == 0) {
                xpr.a(textView, aped.b);
                if ((aped.a & 2) != 0) {
                    arml = aped.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                xpr.a(textView2, ajqy.a(arml));
                xpr.a((View) textView3, false);
                xpr.a((View) textView4, false);
            } else {
                arml arml2;
                if ((8 & i) == 0) {
                    arml2 = null;
                } else {
                    arml2 = aped.e;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                xpr.a(textView3, ajqy.a(arml2));
                if ((aped.a & 4) != 0) {
                    arml = aped.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                xpr.a(textView4, ajqy.a(arml));
                xpr.a((View) textView, false);
                xpr.a((View) textView2, false);
            }
            int i2 = this.a;
            if (i2 == 0) {
                adl.a(textView, (int) R.style.StandaloneBadgesLight);
                textView.setBackgroundResource(R.drawable.standalone_badge_light_background);
                far.a(textView3, R.color.yt_grey1);
                far.a(textView4, R.color.yt_grey1);
                textView3.setBackgroundResource(R.drawable.standalone_badge_dark_background);
                textView4.setBackgroundResource(R.drawable.standalone_badge_dark_background);
                adl.a(textView2, (int) R.style.f469TextAppearance.YouTube.Caption.Inverse);
            } else if (i2 != 2) {
                adl.a(textView, (int) R.style.StandaloneBadges);
                textView.setBackground(fan.a(textView.getContext()));
                far.b(textView3, R.attr.ytTextSecondary);
                far.b(textView4, R.attr.ytTextSecondary);
                textView3.setBackground(fan.a(textView3.getContext()));
                textView4.setBackground(fan.a(textView4.getContext()));
                adl.a(textView2, (int) R.style.f468TextAppearance.YouTube.Caption);
            } else {
                adl.a(textView, (int) R.style.StandaloneBadges);
                textView.setBackgroundResource(R.drawable.standalone_badge_red_background);
                far.b(textView3, R.attr.ytTextSecondary);
                far.b(textView4, R.attr.ytBrandRed);
                textView3.setBackgroundResource(R.drawable.standalone_badge_red_background);
                textView4.setBackgroundResource(R.drawable.standalone_badge_red_background);
                adl.a(textView2, (int) R.style.f469TextAppearance.YouTube.Caption.Inverse);
            }
            if ((aped.a & 32) != 0) {
                apef apef = aped.f;
                if (apef == null) {
                    apef = apef.c;
                }
                int a = apee.a(apef.b);
                if (a != 0 && a == 2) {
                    far.a(textView4, R.color.quantum_vanillagreen600);
                }
            }
            return;
        }
        ViewStub viewStub = this.d;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private static void a(TextView textView, int i) {
        textView.setTextColor(rz.b(textView.getResources(), i, textView.getContext().getTheme()));
    }

    private static void b(TextView textView, int i) {
        textView.setTextColor(xwe.a(textView.getContext(), i, 0));
    }
}
