package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: fej */
public final class fej extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ImageView i = ((ImageView) findViewById(R.id.avatar));
    public fem j;
    public final int k;
    public boolean l = false;
    public int m;
    private final int n;
    private final int o;
    private Drawable p;
    private Drawable q;
    private final ImageView r = ((ImageView) findViewById(R.id.checkbox_icon));
    private final TextView s = ((TextView) findViewById(R.id.text));

    public fej(Context context) {
        super(context, null);
        Resources resources = getResources();
        this.o = resources.getDimensionPixelOffset(R.dimen.cloud_chip_title_start_padding_with_channel);
        this.n = resources.getDimensionPixelOffset(R.dimen.cloud_chip_title_start_padding_with_no_channel);
        this.h = resources.getDimensionPixelSize(R.dimen.cloud_chip_height);
        this.k = resources.getDimensionPixelSize(R.dimen.cloud_chip_ghost_width);
        this.a = xwe.a(context, R.attr.ytThemedBlue);
        this.b = xwe.a(context, R.attr.ytFilledButtonText);
        this.c = xwe.a(context, R.attr.ytIconActiveOther);
        this.d = xwe.a(context, R.attr.ytCloudChipHomeFilterUnselectedTextColor);
        this.e = xwe.a(context, R.attr.ytFilledButtonText);
        this.f = xwe.a(context, R.attr.ytTextPrimary);
        this.g = xwe.a(context, R.attr.ytTextPrimaryInverse);
        View.inflate(context, R.layout.chip_cloud_chip, this);
        setLayoutParams(new LayoutParams(-2, -2));
        setMinimumHeight(this.h);
        setOrientation(0);
    }

    public final void a(aptl aptl) {
        this.j = new fem(this, aptl, false, 0);
        b(aptl);
    }

    public final void b(aptl aptl) {
        arml arml;
        fem fem = this.j;
        int i = 1;
        if (fem.f) {
            this.i.setVisibility(8);
            this.r.setVisibility(0);
            a(true);
            this.q = getResources().getDrawable(R.drawable.quantum_ic_check_box_outline_blank_white_24);
            this.q.mutate().setColorFilter(this.j.e, Mode.SRC_IN);
            this.p = getResources().getDrawable(R.drawable.quantum_ic_check_box_white_24);
            this.p.mutate().setColorFilter(this.j.e, Mode.SRC_IN);
        } else if (fem.g) {
            this.i.setVisibility(0);
            this.r.setVisibility(8);
            a(true);
        } else {
            this.i.setVisibility(8);
            this.r.setVisibility(8);
            a(false);
        }
        if (!aptl.g) {
            i = 2;
        }
        b(i);
        if ((aptl.a & 2) != 0) {
            arml = aptl.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.s.setText(ajqy.a(arml));
    }

    public final void a(int i) {
        this.s.setMinimumWidth(i);
        this.s.setMaxWidth(Integer.MAX_VALUE);
    }

    private final void a(boolean z) {
        int i;
        TextView textView = this.s;
        if (z) {
            i = this.o;
        } else {
            i = this.n;
        }
        abe.a(textView, i, textView.getPaddingTop(), abe.k(this.s), this.s.getPaddingBottom());
    }

    public final void b(int i) {
        Drawable drawable;
        int i2;
        this.m = i;
        setSelected(i == 1);
        fem fem = this.j;
        if (isSelected()) {
            drawable = fem.c;
        } else {
            drawable = fem.a;
        }
        if (!this.j.h || VERSION.SDK_INT < 21) {
            setBackground(drawable);
        } else {
            Context context = getContext();
            fem fem2 = this.j;
            if (this.m != 1) {
                i2 = fem2.j;
            } else {
                i2 = fem2.i;
            }
            setBackground(new RippleDrawable(xwe.b(context, i2), drawable, null));
        }
        TextView textView = this.s;
        fem fem3 = this.j;
        if (isSelected()) {
            i2 = fem3.d;
        } else {
            i2 = fem3.b;
        }
        textView.setTextColor(i2);
        if (this.j.f) {
            this.r.setImageDrawable(!isSelected() ? this.q : this.p);
        }
    }
}
