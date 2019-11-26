package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: kmt */
public final class kmt implements akot, jni {
    public jnf a;
    private final akpk b;
    private final akvp c;
    private final ViewGroup d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final eza g;
    private final ImageView h;
    private final akpd i;
    private final int j;
    private final int k;
    private final ese l;
    private final ViewGroup m;
    private kmv n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    public kmt(Context context, akvp akvp, akvz akvz, esh esh, akpe akpe, ViewGroup viewGroup) {
        Object viewGroup2;
        this.c = (akvp) amqw.a((Object) akvp);
        if (viewGroup2 == null) {
            viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.vertical_drawer_list, null);
        }
        this.d = (ViewGroup) amqw.a(viewGroup2);
        this.e = (YouTubeTextView) viewGroup2.findViewById(R.id.title);
        this.h = (ImageView) viewGroup2.findViewById(R.id.collapsed_icon);
        this.f = (ImageView) viewGroup2.findViewById(R.id.chevron);
        this.m = (ViewGroup) viewGroup2.findViewById(R.id.sort_filter_sub_menu_container);
        this.i = akpe.a((akpb) akvz.get());
        this.b = new akpk();
        this.i.a(this.b);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.drawer_results);
        recyclerView.a(new ans());
        recyclerView.a(this.i);
        Resources resources = context.getResources();
        this.g = new eza(xwe.a(context, R.attr.ytSeparator, 0), resources.getDimensionPixelSize(R.dimen.channel_list_sub_menu_bottom_separator_height));
        viewGroup2.setBackground(this.g);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.section_list_drawer_chevron_padding_expanded);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.section_list_drawer_chevron_padding_collapsed);
        this.k = dimensionPixelSize2;
        this.j = dimensionPixelSize - dimensionPixelSize2;
        this.l = esh.c(viewGroup2);
        this.m.addView(this.l.c);
    }

    public final View K_() {
        return this.d;
    }

    private final void b(float f) {
        if (this.r) {
            this.f.setVisibility(0);
            int i = this.k + ((int) (((float) this.j) * f));
            abe.a(this.f, i, 0, i, 0);
            this.f.setRotation((1.0f - f) * 180.0f);
        } else {
            this.f.setVisibility(8);
        }
        kmt.a(this.m, f, this.o);
        kmt.a(this.e, f, this.p);
        kmt.a(this.h, 1.0f - f, this.q);
    }

    private static void a(View view, float f, boolean z) {
        view.setAlpha(f);
        boolean z2 = false;
        if (z && f != 0.0f) {
            z2 = true;
        }
        xpr.a(view, z2);
    }

    public final void a(akpb akpb) {
        this.f.setOnClickListener(null);
        this.l.a(akpb);
        this.a.b(this);
        this.b.clear();
    }

    public final void a(float f) {
        b(f);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        obj = (axeg) obj;
        amqw.a(obj);
        this.a = (jnf) akor.a("drawer_expansion_state_controller");
        this.a.a(this);
        if (this.n == null) {
            this.n = new kmv(akor);
            this.i.a(this.n);
        }
        boolean z = false;
        this.o = (obj.b == 1 ? (axei) obj.c : axei.c).a == 76818770;
        Spanned a = ajqy.a(obj.b == 2 ? (arml) obj.c : null);
        boolean z2 = (this.o || TextUtils.isEmpty(a)) ? false : true;
        this.p = z2;
        z2 = akor.a("is_first_drawer_list", false);
        this.r = z2;
        if (!(z2 || (obj.a & 4) == 0)) {
            z = true;
        }
        this.q = z;
        if (z2) {
            this.f.setOnClickListener(new kms(this));
            this.g.a(80);
        } else {
            this.g.a(48);
        }
        if (this.o) {
            axei axei;
            axqn axqn;
            if (obj.b == 1) {
                axei = (axei) obj.c;
            } else {
                axei = axei.c;
            }
            if (axei.a == 76818770) {
                axqn = (axqn) axei.b;
            } else {
                axqn = axqn.f;
            }
            this.l.a_(akor, axqn);
        }
        if (this.p) {
            this.e.setText(a);
        }
        xpr.a(this.h, this.q);
        if (this.q) {
            akvp akvp = this.c;
            arwf arwf = obj.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            this.h.setImageResource(akvp.a(a2));
            if (this.p) {
                this.h.setContentDescription(a);
            }
        }
        this.b.clear();
        for (axek axek : obj.e) {
            if (axek.a == 105604662) {
                this.b.add((axec) axek.b);
            }
        }
        this.b.a();
        b(this.a.b());
        akor.a.a(obj.f.d(), null);
    }
}
