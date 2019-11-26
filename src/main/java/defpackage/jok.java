package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* renamed from: jok */
public final class jok extends jmz implements jni {
    public jng a;
    private View i;

    public jok(ViewGroup viewGroup, akwy akwy, akpe akpe, akvz akvz, aana aana, xci xci, xoi xoi, acvx acvx) {
        super(viewGroup, akwy, akpe, akvz, aana, xci, xoi, acvx);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.i = ((ViewStub) this.b.findViewById(R.id.translucent_panel_stub)).inflate();
        Resources resources = this.b.getResources();
        this.a = new jng(new xoj(this.b.getContext()), resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_expanded) - resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed));
        this.a.a((jni) this);
        if (VERSION.SDK_INT < 21) {
            Context context = this.d.getContext();
            eza eza = new eza(new ColorDrawable(xwe.a(context, R.attr.ytBrandBackgroundSolid, 0)), xwe.a(context, R.attr.ytSeparator, 0), context.getResources().getDimensionPixelSize(R.dimen.section_list_drawer_separator_width));
            eza.a(8388613);
            this.d.setBackground(eza);
        }
        RecyclerView recyclerView = this.d;
        this.b.getContext();
        recyclerView.a(new ans());
        this.d.a(this.a);
        this.i.bringToFront();
        this.d.bringToFront();
        a(this.d.getResources().getConfiguration().orientation);
        this.i.setOnClickListener(new jon(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akpk akpk, axeg axeg, boolean z) {
        if (z) {
            akpk.a(0, (Object) axeg);
        } else {
            akpk.add(axeg);
        }
        int i = 0;
        while (i < axeg.e.size()) {
            axec axec;
            axek axek = (axek) axeg.e.get(i);
            if (axek.a == 105604662) {
                axec = (axec) axek.b;
            } else {
                axec = axec.o;
            }
            if (axec.k) {
                axec axec2;
                if (axek.a == 105604662) {
                    axec2 = (axec) axek.b;
                } else {
                    axec2 = axec.o;
                }
                a(axec2, i != 0);
            }
            i++;
        }
    }

    public final void a(float f) {
        Resources resources = this.d.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_expanded);
        LayoutParams layoutParams = this.d.getLayoutParams();
        layoutParams.width = dimensionPixelSize + ((int) (((float) (dimensionPixelSize2 - dimensionPixelSize)) * f));
        this.d.setLayoutParams(layoutParams);
        int i = resources.getConfiguration().orientation;
        if (f == 0.0f || i != 1) {
            this.i.setVisibility(8);
        } else if (f > 0.0f) {
            this.i.setAlpha(f);
            this.i.setVisibility(0);
        }
        xrn.a(f <= 0.0f ? this.b : this.d);
    }

    public final void a(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (i == 1) {
            layoutParams.setMarginStart(this.d.getResources().getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed));
            this.a.c(false);
        } else {
            this.i.setVisibility(8);
            layoutParams.addRule(17, this.d.getId());
            this.a.b(false);
        }
        this.e.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akor akor, aknh aknh, int i) {
        super.a(akor, aknh, i);
        akor.a("drawer_expansion_state_controller", this.a);
    }

    public final void a(axef axef) {
        super.a(axef);
        if (((axec) axef.instance).d == 11 && axef.a().a == 60487319 && this.a.b() > 0.0f && this.d.getResources().getConfiguration().orientation == 1) {
            this.a.c(true);
        }
    }
}
