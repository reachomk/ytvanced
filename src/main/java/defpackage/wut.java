package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: wut */
public final class wut implements akot {
    public final View a;
    private final aaas b;
    private final wuq c;
    private final YouTubeTextView d = ((YouTubeTextView) this.a.findViewById(R.id.title_view));
    private final YouTubeTextView e = ((YouTubeTextView) this.a.findViewById(R.id.purchase_button));
    private final akyy f;
    private final YouTubeTextView g;
    private final FrameLayout h;
    private final FrameLayout i;
    private final YouTubeTextView j;
    private final YouTubeTextView k;
    private final wud l;
    private final YouTubeTextView m = ((YouTubeTextView) this.a.findViewById(R.id.above_purchase_button_text_view));
    private final View n;

    public wut(Context context, aaas aaas, bcaa bcaa, akzb akzb, bcaa bcaa2) {
        this.b = aaas;
        this.l = (wud) bcaa2.get();
        this.a = LayoutInflater.from(context).inflate(R.layout.sponsorships_tier_layout, null, false);
        this.f = akzb.a(this.e);
        this.g = (YouTubeTextView) this.a.findViewById(R.id.disclaimer_view);
        this.h = (FrameLayout) this.a.findViewById(R.id.expandable_message_view);
        this.h.addView(this.l.a);
        this.i = (FrameLayout) this.a.findViewById(R.id.perks_view);
        this.c = (wuq) bcaa.get();
        this.i.addView(this.c.a);
        this.j = (YouTubeTextView) this.a.findViewById(R.id.toggle_expand);
        this.j.setOnClickListener(new wus(this));
        this.k = (YouTubeTextView) this.a.findViewById(R.id.toggle_collapse);
        this.k.setOnClickListener(new wuv(this));
        this.n = this.a.findViewById(R.id.bottom_border);
        Drawable a = xoe.a(ra.a(context, (int) R.drawable.quantum_ic_arrow_drop_down_black_24), xwe.b(context, 16842907), Mode.SRC_ATOP);
        Drawable a2 = xoe.a(ra.a(context, (int) R.drawable.quantum_ic_arrow_drop_up_black_24), xwe.b(context, 16842907), Mode.SRC_ATOP);
        this.j.setCompoundDrawablesWithIntrinsicBounds(null, null, a, null);
        this.k.setCompoundDrawablesWithIntrinsicBounds(null, null, a2, null);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, axtl axtl) {
        arml arml;
        axak axak;
        arml arml2;
        axak axak2;
        arml arml3;
        acvx acvx = akor.a;
        TextView textView = this.m;
        arml arml4 = null;
        if ((axtl.a & 256) != 0) {
            arml = axtl.j;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        boolean z = true;
        if ((axtl.a & 1) != 0) {
            arml = axtl.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        akyy akyy = this.f;
        if ((axtl.a & 128) != 0) {
            axak = axtl.i;
            if (axak == null) {
                axak = axak.a;
            }
        } else {
            axak = null;
        }
        akyy.a((aphg) ajzv.a(ajzv.a(axak), aphg.class), acvx);
        TextView textView2 = this.g;
        if ((axtl.a & 4) != 0) {
            arml2 = axtl.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(textView2, aabb.a(arml2, this.b, false));
        if ((axtl.a & 8) != 0) {
            axak2 = axtl.e;
            if (axak2 == null) {
                axak2 = axak.a;
            }
        } else {
            axak2 = null;
        }
        axsn axsn = (axsn) ajzv.a(ajzv.a(axak2), axsn.class);
        View view = this.h;
        if (axsn == null) {
            z = false;
        }
        xpr.a(view, z);
        if (axsn != null) {
            this.l.a_(akor, axsn);
        }
        if ((axtl.a & 16) != 0) {
            axak2 = axtl.f;
            if (axak2 == null) {
                axak2 = axak.a;
            }
        } else {
            axak2 = null;
        }
        axtj axtj = (axtj) ajzv.a(ajzv.a(axak2), axtj.class);
        if (axtj != null) {
            this.c.a_(akor, axtj);
        }
        if ((axtl.a & 32) != 0) {
            arml3 = axtl.g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        } else {
            arml3 = null;
        }
        CharSequence a = ajqy.a(arml3);
        xpr.a(this.j, a, 8);
        textView2 = this.k;
        if ((axtl.a & 64) != 0) {
            arml4 = axtl.h;
            if (arml4 == null) {
                arml4 = arml.f;
            }
        }
        xpr.a(textView2, ajqy.a(arml4), 8);
        a(TextUtils.isEmpty(a));
        xpr.a(this.n, axtl.k);
    }

    public final void a(boolean z) {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            wur wur = (wur) arrayList.get(i);
            View view = wur.c;
            boolean z4 = z && !TextUtils.isEmpty(view.getText());
            xpr.a(view, z4);
            view = wur.d;
            if (!z || TextUtils.isEmpty(view.getText())) {
                z3 = false;
            }
            xpr.a(view, z3);
            wur.a.a(z);
            i++;
        }
        View view2 = this.j;
        boolean z5 = (z || TextUtils.isEmpty(view2.getText())) ? false : true;
        xpr.a(view2, z5);
        view2 = this.k;
        if (z && !TextUtils.isEmpty(view2.getText())) {
            z2 = true;
        }
        xpr.a(view2, z2);
    }
}
