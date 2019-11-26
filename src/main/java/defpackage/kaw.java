package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kaw */
public final class kaw extends jxx {
    private final Context n;
    private final akvp o;
    private final akou p;
    private final akoj q;
    private final aaas r;
    private final ViewGroup s = ((ViewGroup) this.d.findViewById(R.id.top_standalone_badges_container));
    private final TextView t = ((TextView) this.d.findViewById(R.id.top_metadata));
    private final TextView u = ((TextView) this.d.findViewById(R.id.bottom_metadata));
    private final ViewGroup v = ((ViewGroup) this.d.findViewById(R.id.bottom_frame));
    private final akyy w;

    public kaw(Context context, akkq akkq, akvp akvp, akop akop, aaas aaas, akvo akvo, akzb akzb, flu flu) {
        super(context, akkq, akvo);
        this.q = akop.a(flu);
        this.r = aaas;
        this.n = (Context) amqw.a((Object) context);
        this.o = (akvp) amqw.a((Object) akvp);
        this.p = (akou) amqw.a((Object) flu);
        this.w = akzb.a((TextView) this.d.findViewById(R.id.action_button));
        flu.a(this.d);
    }

    public final View K_() {
        return this.p.a();
    }

    public final void a(akpb akpb) {
        this.q.a();
    }

    private final void a(int i) {
        i = xss.a(this.n.getResources().getDisplayMetrics(), i) / 2;
        kaw.a(this.i, 0, i);
        kaw.a(this.t, i, i);
        kaw.a(this.j, i, i);
        kaw.a(this.s, i, i);
        kaw.a(this.m, i, 0);
    }

    private static void a(View view, int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    private final CharSequence a(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(System.getProperty("line.separator"));
            Object obj = 1;
            for (arml arml : list) {
                if (obj == null) {
                    arrayList.add(spannableStringBuilder);
                }
                arrayList.add(aabb.a(arml, this.r, false));
                obj = null;
            }
            if (arrayList.size() > 0) {
                return TextUtils.concat((CharSequence[]) arrayList.toArray(new CharSequence[0]));
            }
        }
        return null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        int i;
        auvn auvn;
        aqfg aqfg = (aqfg) obj;
        akoj akoj = this.q;
        acvx acvx = akor.a;
        if ((aqfg.a & 65536) != 0) {
            apxu = aqfg.s;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(aqfg.x.d(), null);
        arml arml2 = aqfg.r;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(ajqy.a(arml2));
            this.h.setContentDescription(ajqy.b(arml2));
        }
        aygk aygk = aqfg.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            this.b.a(imageView, aygk);
        }
        if ((aqfg.a & 8) != 0) {
            arml2 = aqfg.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        Spanned a = ajqy.a(arml2);
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setText(a);
        }
        fan.a(this.n, this.s, aqfg.d);
        ViewGroup viewGroup = this.s;
        viewGroup.setVisibility(viewGroup.getChildCount() > 0 ? 0 : 8);
        if ((aqfg.a & 16) != 0) {
            arml2 = aqfg.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a2 = ajqy.a(arml2);
        textView2 = this.j;
        if (textView2 != null) {
            xpr.a(textView2, a2);
        }
        TextView textView3 = this.t;
        if ((aqfg.a & 32) != 0) {
            arml = aqfg.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView3, ajqy.a(arml));
        a2 = a(aqfg.g);
        textView2 = this.k;
        if (textView2 != null) {
            xpr.a(textView2, a2);
        }
        if ((aqfg.a & 64) != 0) {
            arml2 = aqfg.h;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        a2 = ajqy.a(arml2);
        textView2 = this.l;
        if (textView2 != null) {
            xpr.a(textView2, a2);
        }
        xpr.a(this.u, a(aqfg.i));
        aphj aphj = aqfg.j;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aqfg.a & 128) == 0 || aphj == null || (aphj.a & 1) == 0) {
            apdx[] apdxArr = (apdx[]) aqfg.k.toArray(new apdx[0]);
            ViewGroup viewGroup2 = this.m;
            if (viewGroup2 != null) {
                fan.a(this.a, viewGroup2, apdxArr);
                View view = this.m;
                xpr.a(view, view.getChildCount() > 0);
            }
            this.w.a(null, null);
            this.l.setMaxLines(4);
        } else {
            aphg aphg;
            this.m.setVisibility(8);
            akyy akyy = this.w;
            if ((aphj.a & 1) != 0) {
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            } else {
                aphg = null;
            }
            akyy.a(aphg, akor.a);
            this.l.setMaxLines(3);
        }
        if (aqfg.y) {
            this.f.setScaleType(ScaleType.FIT_XY);
            a(8);
            i = R.fraction.movie_poster_aspect_ratio;
        } else {
            this.f.setScaleType(ScaleType.CENTER_CROP);
            a(2);
            kaw.a(this.v, xss.a(this.n.getResources().getDisplayMetrics(), 2), 0);
            if (this.s.getChildCount() > 0) {
                this.t.setVisibility(8);
            }
            this.l.setVisibility(8);
            this.u.setVisibility(8);
            this.w.a(null, null);
            i = R.fraction.rounded_aspect_ratio_16_9;
        }
        this.e.a = this.n.getResources().getFraction(i, 1, 1);
        LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) this.n.getResources().getDimension(R.dimen.list_item_thumbnail_width);
        }
        View a3 = this.p.a();
        auvr auvr = aqfg.w;
        if (auvr == null) {
            auvr = auvr.c;
        }
        acvx acvx2 = akor.a;
        xpr.a(this.g, true);
        akvo akvo = this.c;
        View view2 = this.g;
        if (auvr == null || (1 & auvr.a) == 0) {
            auvn = null;
        } else {
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(a3, view2, auvn, aqfg, acvx2);
        this.p.a(akor);
    }
}
