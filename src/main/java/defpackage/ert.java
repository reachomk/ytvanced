package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ert */
public final class ert implements akot {
    public final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.message_text));
    private final TextView c = ((TextView) this.a.findViewById(R.id.message_subtext));
    private final ImageView d = ((ImageView) this.a.findViewById(R.id.message_icon));
    private final ImageView e = ((ImageView) this.a.findViewById(R.id.message_thumbnail));
    private final FrameLayout f = ((FrameLayout) this.a.findViewById(R.id.message_button_layout));
    private final Context g;
    private final akvp h;
    private final aaas i;
    private final akle j;
    private final DisplayMetrics k;
    private final epv l;
    private eps m;

    public ert(Context context, akvp akvp, aaas aaas, akkl akkl, epv epv, int i) {
        this.g = context;
        this.h = akvp;
        this.i = aaas;
        this.l = epv;
        this.a = View.inflate(context, i, null);
        this.j = new akle(akkl, this.e);
        this.k = context.getResources().getDisplayMetrics();
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, esc esc) {
        auwl auwl = esc.a;
        if ((auwl.a & 1) != 0) {
            arml arml = auwl.d;
            if (arml == null) {
                arml = arml.f;
            }
            this.b.setText(aabb.a(arml, this.i, false));
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
        auwt auwt = auwl.e;
        if (auwt == null) {
            auwt = auwt.c;
        }
        if ((auwt.a & 1) == 0) {
            this.c.setVisibility(8);
            this.b.setTextColor(xwe.a(this.g, R.attr.ytTextSecondary, 0));
        } else {
            arml arml2;
            TextView textView = this.c;
            auwt auwt2 = auwl.e;
            if (auwt2 == null) {
                auwt2 = auwt.c;
            }
            auwr auwr = auwt2.b;
            if (auwr == null) {
                auwr = auwr.c;
            }
            if ((auwr.a & 1) != 0) {
                auwt2 = auwl.e;
                if (auwt2 == null) {
                    auwt2 = auwt.c;
                }
                auwr = auwt2.b;
                if (auwr == null) {
                    auwr = auwr.c;
                }
                arml2 = auwr.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView.setText(aabb.a(arml2, this.i, false));
            this.c.setVisibility(0);
            this.c.setLineSpacing((float) xss.a(this.g.getResources().getDisplayMetrics(), akor.a("BaseMessagePresenter.SubtextLineSpacingExtra", 0)), 1.0f);
            this.b.setTextColor(xwe.a(this.g, R.attr.ytTextPrimary, 0));
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        int i = auwl.b;
        if (i != 2) {
            auwx auwx;
            if (i != 7) {
                auwx = auwx.c;
            } else {
                auwx = (auwx) auwl.c;
            }
            if ((auwx.a & 1) != 0) {
                auwv auwv = (auwl.b == 7 ? (auwx) auwl.c : auwx.c).b;
                if (auwv == null) {
                    auwv = auwv.e;
                }
                LayoutParams layoutParams = this.e.getLayoutParams();
                layoutParams.width = a(auwv.c);
                layoutParams.height = a(auwv.d);
                this.e.setLayoutParams(layoutParams);
                akle akle = this.j;
                aygk aygk = auwv.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akle.a(aygk);
                this.e.setVisibility(0);
            }
        } else {
            akvp akvp = this.h;
            arwh a = arwh.a(((auwz) auwl.c).b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            i = akvp.a(a);
            if (i != 0) {
                this.d.setImageResource(i);
                this.d.setVisibility(0);
            }
        }
        this.f.setVisibility(8);
        aphj aphj = auwl.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            aphj aphj2 = auwl.g;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            Object obj = aphj2.b;
            if (obj == null) {
                obj = aphg.s;
            }
            if (this.m == null) {
                this.m = this.l.a(R.layout.wide_button);
            }
            this.m.a_(akor, obj);
            this.f.removeAllViews();
            this.f.addView(this.m.b);
            this.f.setVisibility(0);
        }
    }

    public final void a(akpb akpb) {
        this.c.setLineSpacing(0.0f, 1.0f);
        this.f.removeAllViews();
        eps eps = this.m;
        if (eps != null) {
            eps.a(akpb);
        }
    }

    private final int a(int i) {
        return xss.a(this.k, i);
    }
}
