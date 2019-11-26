package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wud */
public final class wud implements akot {
    public final View a;
    public final ViewGroup b;
    private final aaas c;
    private final YouTubeTextView d = ((YouTubeTextView) this.a.findViewById(R.id.message));
    private final ImageView e = ((ImageView) this.a.findViewById(R.id.expand_icon));
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.check_icon));
    private final ViewGroup g;
    private final View h;
    private final View i;
    private final View j;
    private final bcaa k;
    private final bcaa l;

    public wud(Context context, aaas aaas, bcaa bcaa, bcaa bcaa2) {
        this.c = aaas;
        this.k = bcaa;
        this.l = bcaa2;
        this.a = LayoutInflater.from(context).inflate(R.layout.sponsorships_expandable_message_layout, null, false);
        this.e.setColorFilter(xwe.a(context, R.attr.ytTextSecondary));
        this.b = (ViewGroup) this.a.findViewById(R.id.expanded_content);
        this.g = (ViewGroup) this.a.findViewById(R.id.message_container);
        this.h = this.a.findViewById(R.id.border_top);
        this.i = this.a.findViewById(R.id.border_bottom);
        this.j = this.a.findViewById(R.id.margin_bottom);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, axsn axsn) {
        arml arml;
        int a;
        boolean z;
        boolean z2;
        boolean z3;
        TextView textView = this.d;
        boolean z4 = true;
        OnClickListener onClickListener = null;
        if ((axsn.a & 1) != 0) {
            arml = axsn.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        int i = 0;
        xpr.a(textView, aabb.a(arml, this.c, false));
        boolean isEmpty = axsn.c.isEmpty() ^ 1;
        xpr.a(this.e, isEmpty);
        View view = this.a;
        if (isEmpty) {
            onClickListener = new wuc(this);
        }
        view.setOnClickListener(onClickListener);
        this.b.removeAllViews();
        for (axak a2 : axsn.c) {
            ajzw a3 = ajzv.a(a2);
            axtj axtj = (axtj) ajzv.a(a3, axtj.class);
            if (axtj != null) {
                wuq wuq = (wuq) this.k.get();
                wuq.a_(akor, axtj);
                this.b.addView(wuq.a);
            } else {
                axtl axtl = (axtl) ajzv.a(a3, axtl.class);
                if (axtl != null) {
                    wut wut = (wut) this.l.get();
                    wut.a_(akor, axtl);
                    this.b.addView(wut.a);
                }
            }
        }
        a(axsn.e);
        int a4 = axsd.a(axsn.d);
        if (a4 == 0) {
            a4 = 1;
        }
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        int a5 = xwe.a(this.a.getContext(), R.attr.ytGeneralBackgroundB, 0);
        int a6 = xwe.a(this.a.getContext(), R.attr.ytGeneralBackgroundB, 0);
        int a7 = xwe.a(this.a.getContext(), R.attr.ytTextSecondary, 0);
        int a8 = xss.a(displayMetrics, 8);
        int a9 = xss.a(displayMetrics, 16);
        int a10 = xss.a(displayMetrics, 16);
        int a11 = xss.a(displayMetrics, 16);
        a4--;
        int i2 = R.style.f477TextAppearance.YouTube.Spec.Body2a;
        if (a4 != 2) {
            boolean z5;
            if (a4 == 3) {
                z5 = false;
                a8 = xss.a(displayMetrics, 20);
                a5 = xss.a(displayMetrics, 42);
                a10 = xss.a(displayMetrics, 0);
                a = xss.a(displayMetrics, 24);
                a7 = xwe.a(this.a.getContext(), R.attr.ytTextPrimary, 0);
                z = z5;
                i = a5;
                a4 = 0;
                a5 = 0;
                z2 = true;
            } else if (a4 != 4) {
                a4 = a6;
                a = 0;
                z = false;
                z4 = false;
                z2 = false;
            } else {
                z5 = true;
                a8 = xss.a(displayMetrics, 20);
                a5 = xss.a(displayMetrics, 42);
                a10 = xss.a(displayMetrics, 0);
                a = xss.a(displayMetrics, 24);
                a7 = xwe.a(this.a.getContext(), R.attr.ytTextPrimary, 0);
                z = z5;
                i = a5;
                a4 = 0;
                a5 = 0;
                z2 = true;
            }
            z3 = false;
        } else {
            a8 = xss.a(displayMetrics, 24);
            a7 = xwe.a(this.a.getContext(), R.attr.ytTextPrimary, 0);
            a4 = xwe.a(this.a.getContext(), R.attr.ytGeneralBackgroundA, 0);
            a11 = xss.a(displayMetrics, 0);
            a10 = xss.a(displayMetrics, 12);
            i2 = R.style.f485TextAppearance.YouTube.Subhead;
            a = 0;
            z = false;
            z4 = false;
            z2 = false;
            z3 = true;
        }
        this.g.setBackgroundColor(a5);
        this.g.setPadding(a9, a8, a9, a8);
        this.d.setTextAppearance(this.a.getContext(), i2);
        this.d.setTextColor(a7);
        this.b.setBackgroundColor(a4);
        this.b.setPadding(i + a11, a10, a11, a + a10);
        xpr.a(this.f, z4);
        xpr.a(this.h, z);
        xpr.a(this.i, z2);
        xpr.a(this.j, z3);
    }

    public final void a(boolean z) {
        xpr.a(this.b, z);
        this.e.setImageResource(!z ? R.drawable.quantum_ic_arrow_drop_down_black_24 : R.drawable.quantum_ic_arrow_drop_up_black_24);
    }
}
