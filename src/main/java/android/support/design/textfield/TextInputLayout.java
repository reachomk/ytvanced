package android.support.design.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.internal.CheckableImageButton;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aaj;
import defpackage.abe;
import defpackage.adl;
import defpackage.agb;
import defpackage.aky;
import defpackage.amu;
import defpackage.arz;
import defpackage.dq;
import defpackage.gt;
import defpackage.gu;
import defpackage.hc;
import defpackage.hd;
import defpackage.hl;
import defpackage.hu;
import defpackage.ia;
import defpackage.ke;
import defpackage.ki;
import defpackage.kk;
import defpackage.kl;
import defpackage.ks;
import defpackage.kv;
import defpackage.kw;
import defpackage.kx;
import defpackage.lc;
import defpackage.ld;
import defpackage.le;
import defpackage.lf;
import defpackage.lg;
import defpackage.lh;
import defpackage.li;
import defpackage.lj;
import defpackage.ra;
import defpackage.st;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    private final int A;
    private final int B;
    private int C;
    private final int D;
    private final int E;
    private int F;
    private final Rect G;
    private final Rect H;
    private final RectF I;
    private final CheckableImageButton J;
    private ColorStateList K;
    private boolean L;
    private Mode M;
    private boolean N;
    private Drawable O;
    private final LinkedHashSet P;
    private int Q;
    private final SparseArray R;
    private ColorStateList S;
    private boolean T;
    private Mode U;
    private boolean V;
    private Drawable W;
    public EditText a;
    private Drawable aa;
    private ColorStateList ab;
    private ColorStateList ac;
    private final int ad;
    private final int ae;
    private int af;
    private int ag;
    private final int ah;
    private final int ai;
    private final int aj;
    private boolean ak;
    private ValueAnimator al;
    private boolean am;
    public boolean b;
    public int c;
    public boolean d;
    public TextView e;
    public boolean f;
    public int g;
    public int h;
    public final CheckableImageButton i;
    public final LinkedHashSet j;
    public final gt k;
    public boolean l;
    public boolean m;
    private final FrameLayout n;
    private CharSequence o;
    private final kv p;
    private int q;
    private int r;
    private ColorStateList s;
    private ColorStateList t;
    private boolean u;
    private CharSequence v;
    private hu w;
    private hu x;
    private final ia y;
    private final ia z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        super(hd.b(context, attributeSet2, i2, R.style.f672Widget.Design.TextInputLayout), attributeSet2, i2);
        this.p = new kv(this);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new RectF();
        this.P = new LinkedHashSet();
        this.Q = 0;
        this.R = new SparseArray();
        this.j = new LinkedHashSet();
        this.k = new gt(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.n = new FrameLayout(context2);
        this.n.setAddStatesFromChildren(true);
        addView(this.n);
        this.k.a(dq.a);
        gt gtVar = this.k;
        gtVar.h = dq.a;
        gtVar.c();
        this.k.b(8388659);
        int[] iArr = lc.a;
        int[] iArr2 = new int[]{lc.p, lc.n, lc.x, lc.B, lc.F};
        hd.a(context2, attributeSet2, i2, R.style.f672Widget.Design.TextInputLayout);
        hd.b(context2, attributeSet, iArr, i, R.style.f672Widget.Design.TextInputLayout, iArr2);
        arz a = arz.a(context2, attributeSet2, iArr, i2, R.style.f672Widget.Design.TextInputLayout);
        this.u = a.a(lc.E, true);
        a(a.c(lc.b));
        this.l = a.a(lc.D, true);
        this.y = new ia(context2, attributeSet2, i2, R.style.f672Widget.Design.TextInputLayout);
        this.z = new ia(this.y);
        this.A = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.B = a.c(lc.f, 0);
        this.D = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default);
        this.E = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused);
        this.C = this.D;
        float g = a.g(lc.j);
        float g2 = a.g(lc.i);
        float g3 = a.g(lc.g);
        float g4 = a.g(lc.h);
        if (g >= 0.0f) {
            this.y.a.a = g;
        }
        if (g2 >= 0.0f) {
            this.y.b.a = g2;
        }
        if (g3 >= 0.0f) {
            this.y.c.a = g3;
        }
        if (g4 >= 0.0f) {
            this.y.d.a = g4;
        }
        h();
        ColorStateList a2 = hl.a(context2, a, lc.d);
        if (a2 != null) {
            int defaultColor = a2.getDefaultColor();
            this.ag = defaultColor;
            this.h = defaultColor;
            if (a2.isStateful()) {
                this.ah = a2.getColorForState(new int[]{-16842910}, -1);
                this.ai = a2.getColorForState(new int[]{16843623}, -1);
            } else {
                a2 = agb.a(context2, R.color.mtrl_filled_background_color);
                this.ah = a2.getColorForState(new int[]{-16842910}, -1);
                this.ai = a2.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.h = 0;
            this.ag = 0;
            this.ah = 0;
            this.ai = 0;
        }
        if (a.h(lc.c)) {
            a2 = a.f(lc.c);
            this.ac = a2;
            this.ab = a2;
        }
        a2 = hl.a(context2, a, lc.k);
        if (a2 == null || !a2.isStateful()) {
            this.af = a.e(lc.k);
            this.ad = ra.c(context2, R.color.mtrl_textinput_default_box_stroke_color);
            this.aj = ra.c(context2, R.color.mtrl_textinput_disabled_color);
            this.ae = ra.c(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        } else {
            this.ad = a2.getDefaultColor();
            this.aj = a2.getColorForState(new int[]{-16842910}, -1);
            this.ae = a2.getColorForState(new int[]{16843623}, -1);
            this.af = a2.getColorForState(new int[]{16842908}, -1);
        }
        if (a.f(lc.F, -1) != -1) {
            a(a.f(lc.F, 0));
        }
        int f = a.f(lc.x, 0);
        boolean a3 = a.a(lc.w, false);
        int f2 = a.f(lc.B, 0);
        boolean a4 = a.a(lc.A, false);
        CharSequence c = a.c(lc.z);
        boolean a5 = a.a(lc.l, false);
        b(a.a(lc.m, -1));
        this.r = a.f(lc.p, 0);
        this.q = a.f(lc.n, 0);
        this.J = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this.n, false);
        this.n.addView(this.J);
        this.J.setVisibility(8);
        o();
        if (a.h(lc.N)) {
            Drawable a6 = a.a(lc.N);
            this.J.setImageDrawable(a6);
            if (a6 != null) {
                f(true);
                t();
            } else {
                f(false);
                o();
                e(null);
            }
            if (a.h(lc.M)) {
                e(a.c(lc.M));
            }
        }
        if (a.h(lc.O)) {
            ColorStateList a7 = hl.a(context2, a, lc.O);
            if (this.K != a7) {
                this.K = a7;
                this.L = true;
                t();
            }
        }
        if (a.h(lc.P)) {
            Mode a8 = hc.a(a.a(lc.P, -1), null);
            if (this.M != a8) {
                this.M = a8;
                this.N = true;
                t();
            }
        }
        e(a4);
        b(c);
        this.p.b(f2);
        b(a3);
        this.p.a(f);
        if (a.h(lc.y)) {
            this.p.a(a.f(14));
        }
        if (a.h(lc.C)) {
            this.p.b(a.f(11));
        }
        if (a.h(lc.G)) {
            a2 = a.f(lc.G);
            if (this.ac != a2) {
                if (this.ab == null) {
                    this.k.a(a2);
                }
                this.ac = a2;
                if (this.a != null) {
                    a(false);
                }
            }
        }
        if (a.h(lc.q)) {
            a2 = a.f(lc.q);
            if (this.s != a2) {
                this.s = a2;
                l();
            }
        }
        if (a.h(lc.o)) {
            a2 = a.f(lc.o);
            if (this.t != a2) {
                this.t = a2;
                l();
            }
        }
        c(a5);
        f = a.a(lc.e, 0);
        if (f != this.g) {
            this.g = f;
            if (this.a != null) {
                g();
            }
        }
        this.i = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, this.n, false);
        this.n.addView(this.i);
        this.i.setVisibility(8);
        this.R.append(-1, new ki(this));
        this.R.append(0, new kx(this));
        this.R.append(1, new kw(this));
        this.R.append(2, new ke(this));
        this.R.append(3, new kk(this));
        if (a.h(lc.t)) {
            d(a.a(lc.t, 0));
            if (a.h(lc.s)) {
                a(a.a(lc.s));
            }
            if (a.h(lc.r)) {
                d(a.c(lc.r));
            }
        } else if (a.h(lc.J)) {
            d(1);
            a(a.a(lc.I));
            d(a.c(lc.H));
            if (a.h(lc.K)) {
                b(hl.a(context2, a, lc.K));
            }
            if (a.h(lc.L)) {
                a(hc.a(a.a(lc.L, -1), null));
            }
        }
        if (!a.h(lc.J)) {
            if (a.h(lc.u)) {
                b(hl.a(context2, a, lc.u));
            }
            if (a.h(lc.v)) {
                a(hc.a(a.a(lc.v, -1), null));
            }
        }
        a.a();
        abe.b(this, 2);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.n.addView(view, layoutParams2);
            this.n.setLayoutParams(layoutParams);
            i();
            EditText editText = (EditText) view;
            if (this.a == null) {
                this.a = editText;
                g();
                aaj lhVar = new lh(this);
                View view2 = this.a;
                if (view2 != null) {
                    abe.a(view2, lhVar);
                }
                gt gtVar = this.k;
                Typeface typeface = this.a.getTypeface();
                boolean a = gtVar.a(typeface);
                boolean b = gtVar.b(typeface);
                if (a || b) {
                    gtVar.c();
                }
                gtVar = this.k;
                float textSize = this.a.getTextSize();
                if (gtVar.c != textSize) {
                    gtVar.c = textSize;
                    gtVar.c();
                }
                int gravity = this.a.getGravity();
                this.k.b((gravity & -113) | 48);
                this.k.a(gravity);
                this.a.addTextChangedListener(new ld(this));
                if (this.ab == null) {
                    this.ab = this.a.getHintTextColors();
                }
                if (this.u) {
                    if (TextUtils.isEmpty(this.v)) {
                        this.o = this.a.getHint();
                        a(this.o);
                        this.a.setHint(null);
                    }
                    this.f = true;
                }
                if (this.e != null) {
                    c(this.a.getText().length());
                }
                d();
                this.p.c();
                a(this.J);
                a(this.i);
                Iterator it = this.P.iterator();
                while (it.hasNext()) {
                    ((lg) it.next()).a(this.a);
                }
                a(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public final hu a() {
        int i = this.g;
        if (i == 1 || i == 2) {
            return this.w;
        }
        throw new IllegalStateException();
    }

    private final void g() {
        int i = this.g;
        if (i == 0) {
            this.w = null;
            this.x = null;
        } else if (i == 1) {
            this.w = new hu(this.y);
            this.x = new hu();
        } else if (i == 2) {
            if (!this.u || (this.w instanceof kl)) {
                this.w = new hu(this.y);
            } else {
                this.w = new kl(this.y);
            }
            this.x = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append(i);
            stringBuilder.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        EditText editText = this.a;
        if (!(editText == null || this.w == null || editText.getBackground() != null || this.g == 0)) {
            abe.a(this.a, this.w);
        }
        f();
        if (this.g != 0) {
            i();
        }
    }

    private final void h() {
        int i = this.g;
        float f = i == 2 ? ((float) this.C) / 2.0f : 0.0f;
        if (f > 0.0f) {
            ia iaVar = this.y;
            float f2 = iaVar.a.a;
            ia iaVar2 = this.z;
            iaVar2.a.a = f2 + f;
            iaVar2.b.a = iaVar.b.a + f;
            iaVar2.c.a = iaVar.c.a + f;
            iaVar2.d.a = iaVar.d.a + f;
            if (i != 0) {
                a().a(this.z);
            }
        }
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.o != null) {
            EditText editText = this.a;
            if (editText != null) {
                boolean z = this.f;
                this.f = false;
                CharSequence hint = editText.getHint();
                this.a.setHint(this.o);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.a.setHint(hint);
                    this.f = z;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    private final void i() {
        if (this.g != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.n.getLayoutParams();
            int m = m();
            if (m != layoutParams.topMargin) {
                layoutParams.topMargin = m;
                this.n.requestLayout();
            }
        }
    }

    public int getBaseline() {
        EditText editText = this.a;
        if (editText != null) {
            return (editText.getBaseline() + getPaddingTop()) + m();
        }
        return super.getBaseline();
    }

    public final void a(boolean z) {
        a(z, false);
    }

    private final void a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        EditText editText = this.a;
        Object obj = (editText == null || TextUtils.isEmpty(editText.getText())) ? null : 1;
        EditText editText2 = this.a;
        Object obj2 = (editText2 == null || !editText2.hasFocus()) ? null : 1;
        boolean d = this.p.d();
        ColorStateList colorStateList = this.ab;
        if (colorStateList != null) {
            this.k.a(colorStateList);
            this.k.b(this.ab);
        }
        if (!isEnabled) {
            this.k.a(ColorStateList.valueOf(this.aj));
            this.k.b(ColorStateList.valueOf(this.aj));
        } else if (d) {
            gt gtVar = this.k;
            TextView textView = this.p.h;
            gtVar.a(textView != null ? textView.getTextColors() : null);
        } else {
            if (this.d) {
                TextView textView2 = this.e;
                if (textView2 != null) {
                    this.k.a(textView2.getTextColors());
                }
            }
            if (obj2 != null) {
                ColorStateList colorStateList2 = this.ac;
                if (colorStateList2 != null) {
                    this.k.a(colorStateList2);
                }
            }
        }
        ValueAnimator valueAnimator;
        if (obj != null || (isEnabled() && (obj2 != null || d))) {
            if (z2 || this.ak) {
                valueAnimator = this.al;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.al.cancel();
                }
                if (z && this.l) {
                    a(1.0f);
                } else {
                    this.k.a(1.0f);
                }
                this.ak = false;
                if (x()) {
                    y();
                }
            }
        } else if (z2 || !this.ak) {
            valueAnimator = this.al;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.al.cancel();
            }
            if (z && this.l) {
                a(0.0f);
            } else {
                this.k.a(0.0f);
            }
            if (x() && (((kl) this.w).f.isEmpty() ^ 1) != 0 && x()) {
                ((kl) this.w).a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.ak = true;
        }
    }

    public final void a(CharSequence charSequence) {
        if (this.u) {
            if (!TextUtils.equals(charSequence, this.v)) {
                this.v = charSequence;
                this.k.b(charSequence);
                if (!this.ak) {
                    y();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final CharSequence b() {
        return this.u ? this.v : null;
    }

    public final void c() {
        if (!this.u) {
            this.u = true;
            CharSequence hint = this.a.getHint();
            if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.v)) {
                    a(hint);
                }
                this.a.setHint(null);
            }
            this.f = true;
            if (this.a != null) {
                i();
            }
        }
    }

    public final void a(int i) {
        this.k.c(i);
        this.ac = this.k.d;
        if (this.a != null) {
            a(false);
            i();
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.ab = colorStateList;
        this.ac = colorStateList;
        if (this.a != null) {
            a(false);
        }
    }

    public final void b(boolean z) {
        kv kvVar = this.p;
        if (kvVar.g != z) {
            kvVar.b();
            if (z) {
                kvVar.h = new AppCompatTextView(kvVar.a);
                kvVar.h.setId(R.id.textinput_error);
                kvVar.a(kvVar.i);
                kvVar.a(kvVar.j);
                kvVar.h.setVisibility(4);
                abe.c(kvVar.h, 1);
                kvVar.a(kvVar.h, 0);
            } else {
                kvVar.a();
                kvVar.b(kvVar.h, 0);
                kvVar.h = null;
                kvVar.b.d();
                kvVar.b.f();
            }
            kvVar.g = z;
        }
    }

    private final void e(boolean z) {
        kv kvVar = this.p;
        if (kvVar.l != z) {
            kvVar.b();
            if (z) {
                kvVar.m = new AppCompatTextView(kvVar.a);
                kvVar.m.setId(R.id.textinput_helper_text);
                kvVar.m.setVisibility(4);
                abe.c(kvVar.m, 1);
                kvVar.b(kvVar.n);
                kvVar.b(kvVar.o);
                kvVar.a(kvVar.m, 1);
            } else {
                kvVar.b();
                int i = kvVar.d;
                if (i == 2) {
                    kvVar.e = 0;
                }
                kvVar.a(i, kvVar.e, kvVar.a(kvVar.m, null));
                kvVar.b(kvVar.m, 1);
                kvVar.m = null;
                kvVar.b.d();
                kvVar.b.f();
            }
            kvVar.l = z;
        }
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (j()) {
                e(false);
            }
            return;
        }
        if (!j()) {
            e(true);
        }
        kv kvVar = this.p;
        kvVar.b();
        kvVar.k = charSequence;
        kvVar.m.setText(charSequence);
        int i = kvVar.d;
        if (i != 2) {
            kvVar.e = 2;
        }
        kvVar.a(i, kvVar.e, kvVar.a(kvVar.m, charSequence));
    }

    private final boolean j() {
        return this.p.l;
    }

    public final void c(CharSequence charSequence) {
        if (!this.p.g) {
            if (!TextUtils.isEmpty(charSequence)) {
                b(true);
            } else {
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.p.a();
            return;
        }
        kv kvVar = this.p;
        kvVar.b();
        kvVar.f = charSequence;
        kvVar.h.setText(charSequence);
        int i = kvVar.d;
        if (i != 1) {
            kvVar.e = 1;
        }
        kvVar.a(i, kvVar.e, kvVar.a(kvVar.h, charSequence));
    }

    public final void c(boolean z) {
        if (this.b != z) {
            if (z) {
                this.e = new AppCompatTextView(getContext());
                this.e.setId(R.id.textinput_counter);
                this.e.setMaxLines(1);
                this.p.a(this.e, 2);
                l();
                k();
            } else {
                this.p.b(this.e, 2);
                this.e = null;
            }
            this.b = z;
        }
    }

    public final void b(int i) {
        if (this.c != i) {
            if (i > 0) {
                this.c = i;
            } else {
                this.c = -1;
            }
            if (this.b) {
                k();
            }
        }
    }

    private final void k() {
        if (this.e != null) {
            EditText editText = this.a;
            c(editText != null ? editText.getText().length() : 0);
        }
    }

    public final void c(int i) {
        boolean z = this.d;
        if (this.c == -1) {
            this.e.setText(String.valueOf(i));
            this.e.setContentDescription(null);
            this.d = false;
        } else {
            if (abe.i(this.e) == 1) {
                abe.c(this.e, 0);
            }
            this.d = i > this.c;
            Context context = getContext();
            TextView textView = this.e;
            int i2 = this.c;
            int i3 = !this.d ? R.string.character_counter_content_description : R.string.character_counter_overflowed_content_description;
            r8 = new Object[2];
            r8[0] = Integer.valueOf(i);
            r8[1] = Integer.valueOf(i2);
            textView.setContentDescription(context.getString(i3, r8));
            if (z != this.d) {
                l();
                if (this.d) {
                    abe.c(this.e, 1);
                }
            }
            this.e.setText(getContext().getString(R.string.character_counter_pattern, new Object[]{r10, Integer.valueOf(this.c)}));
        }
        if (this.a != null && z != this.d) {
            a(false);
            f();
            d();
        }
    }

    public final void setEnabled(boolean z) {
        a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    private static void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    private final void l() {
        TextView textView = this.e;
        if (textView != null) {
            int i;
            ColorStateList colorStateList;
            if (this.d) {
                i = this.q;
            } else {
                i = this.r;
            }
            a(textView, i);
            if (!this.d) {
                colorStateList = this.s;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (this.d) {
                colorStateList = this.t;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
        }
    }

    public final void a(TextView textView, int i) {
        try {
            adl.a(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        adl.a(textView, (int) R.style.f354TextAppearance.AppCompat.Caption);
        textView.setTextColor(ra.c(getContext(), R.color.design_error));
    }

    private final int m() {
        if (!this.u) {
            return 0;
        }
        float b;
        int i = this.g;
        if (i == 0 || i == 1) {
            b = this.k.b();
        } else if (i != 2) {
            return 0;
        } else {
            b = this.k.b() / 2.0f;
        }
        return (int) b;
    }

    private final boolean n() {
        return this.C >= 0 && this.F != 0;
    }

    public final void d() {
        EditText editText = this.a;
        if (editText != null && this.g == 0) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (amu.c(background)) {
                    background = background.mutate();
                }
                if (this.p.d()) {
                    background.setColorFilter(aky.a(this.p.e(), Mode.SRC_IN));
                    return;
                }
                if (this.d) {
                    TextView textView = this.e;
                    if (textView != null) {
                        background.setColorFilter(aky.a(textView.getCurrentTextColor(), Mode.SRC_IN));
                        return;
                    }
                }
                st.c(background);
                this.a.refreshDrawableState();
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        li liVar = new li(super.onSaveInstanceState());
        if (this.p.d()) {
            liVar.a = e();
        }
        boolean z = false;
        if (u() && this.i.a) {
            z = true;
        }
        liVar.b = z;
        return liVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof li) {
            li liVar = (li) parcelable;
            super.onRestoreInstanceState(liVar.g);
            c(liVar.a);
            if (liVar.b) {
                this.i.performClick();
                this.i.jumpDrawablesToCurrentState();
            }
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.m = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.m = false;
    }

    public final CharSequence e() {
        kv kvVar = this.p;
        if (kvVar.g) {
            return kvVar.f;
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != null) {
            i = Math.max(this.i.getMeasuredHeight(), this.J.getMeasuredHeight());
            if (this.a.getMeasuredHeight() < i) {
                this.a.setMinimumHeight(i);
                this.a.post(new lf(this));
            }
            w();
        }
    }

    private final void o() {
        a(this.J, null);
    }

    private final void f(boolean z) {
        if (p() != z) {
            this.J.setVisibility(!z ? 8 : 0);
            w();
        }
    }

    private final boolean p() {
        return this.J.getVisibility() == 0;
    }

    private final void e(CharSequence charSequence) {
        if (this.J.getContentDescription() != charSequence) {
            this.J.setContentDescription(charSequence);
        }
    }

    private final void d(int i) {
        int i2 = this.Q;
        this.Q = i;
        d(i != 0);
        if (s().a(this.g)) {
            s().a();
            v();
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((lj) it.next()).a(i2);
            }
            return;
        }
        int i3 = this.g;
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("The current box background mode ");
        stringBuilder.append(i3);
        stringBuilder.append(" is not supported by the end icon mode ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(OnClickListener onClickListener) {
        a(this.i, onClickListener);
    }

    public final void d(boolean z) {
        if (q() != z) {
            this.i.setVisibility(!z ? 4 : 0);
            w();
        }
    }

    private final boolean q() {
        return this.i.getVisibility() == 0;
    }

    public final void a(Drawable drawable) {
        this.i.setImageDrawable(drawable);
    }

    private final Drawable r() {
        return this.i.getDrawable();
    }

    public final void d(CharSequence charSequence) {
        if (this.i.getContentDescription() != charSequence) {
            this.i.setContentDescription(charSequence);
        }
    }

    private final void b(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            v();
        }
    }

    private final void a(Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            v();
        }
    }

    public final void a(lg lgVar) {
        this.P.add(lgVar);
        EditText editText = this.a;
        if (editText != null) {
            lgVar.a(editText);
        }
    }

    private final ks s() {
        ks ksVar = (ks) this.R.get(this.Q);
        return ksVar == null ? (ks) this.R.get(0) : ksVar;
    }

    private final void t() {
        a(this.J, this.L, this.K, this.N, this.M);
    }

    private final boolean u() {
        return this.Q != 0;
    }

    private final void v() {
        a(this.i, this.T, this.S, this.V, this.U);
    }

    private final void w() {
        if (this.a != null) {
            int measuredWidth;
            Drawable[] compoundDrawablesRelative;
            if (this.J.getDrawable() != null && p()) {
                this.O = new ColorDrawable();
                measuredWidth = this.J.getMeasuredWidth();
                int paddingLeft = this.a.getPaddingLeft();
                this.O.setBounds(0, 0, (measuredWidth - paddingLeft) + ((MarginLayoutParams) this.J.getLayoutParams()).getMarginEnd(), 1);
                compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                this.a.setCompoundDrawablesRelative(this.O, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
            } else if (this.O != null) {
                compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                this.a.setCompoundDrawablesRelative(null, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                this.O = null;
            }
            if (u() && q()) {
                if (this.W == null) {
                    this.W = new ColorDrawable();
                    measuredWidth = this.i.getMeasuredWidth();
                    int paddingRight = this.a.getPaddingRight();
                    this.W.setBounds(0, 0, (measuredWidth - paddingRight) + ((MarginLayoutParams) this.i.getLayoutParams()).getMarginStart(), 1);
                }
                compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[2];
                Drawable drawable2 = this.W;
                if (drawable != drawable2) {
                    this.aa = drawable;
                }
                this.a.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable2, compoundDrawablesRelative[3]);
            } else if (this.W != null) {
                compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative[2] == this.W) {
                    this.a.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.aa, compoundDrawablesRelative[3]);
                }
                this.W = null;
            }
        }
    }

    private static void a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = st.d(drawable).mutate();
            if (z) {
                st.a(drawable, colorStateList);
            }
            if (z2) {
                st.a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static void a(View view, OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener);
        boolean z = onClickListener != null;
        view.setFocusable(z);
        view.setClickable(z);
    }

    private final void a(View view) {
        int paddingTop;
        int paddingBottom;
        if (this.g == 1) {
            paddingTop = view.getPaddingTop();
        } else {
            EditText editText = this.a;
            paddingTop = editText != null ? editText.getPaddingTop() : 0;
        }
        if (this.g == 1) {
            paddingBottom = view.getPaddingBottom();
        } else {
            EditText editText2 = this.a;
            paddingBottom = editText2 != null ? editText2.getPaddingBottom() : 0;
        }
        abe.a(view, 0, paddingTop, 0, paddingBottom);
        view.bringToFront();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a;
        if (view != null) {
            Rect rect = this.G;
            gu.a((ViewGroup) this, view, rect);
            if (this.x != null) {
                this.x.setBounds(rect.left, rect.bottom - this.E, rect.right, rect.bottom);
            }
            if (this.u) {
                gt gtVar = this.k;
                if (this.a != null) {
                    Rect rect2 = this.H;
                    rect2.bottom = rect.bottom;
                    i3 = this.g;
                    if (i3 == 1) {
                        rect2.left = rect.left + this.a.getCompoundPaddingLeft();
                        rect2.top = rect.top + this.B;
                        rect2.right = rect.right - this.a.getCompoundPaddingRight();
                    } else if (i3 != 2) {
                        rect2.left = rect.left + this.a.getCompoundPaddingLeft();
                        rect2.top = getPaddingTop();
                        rect2.right = rect.right - this.a.getCompoundPaddingRight();
                    } else {
                        rect2.left = rect.left + this.a.getPaddingLeft();
                        rect2.top = rect.top - m();
                        rect2.right = rect.right - this.a.getPaddingRight();
                    }
                    gtVar.b(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    gtVar = this.k;
                    if (this.a != null) {
                        int centerY;
                        rect2 = this.H;
                        TextPaint textPaint = gtVar.g;
                        textPaint.setTextSize(gtVar.c);
                        textPaint.setTypeface(gtVar.e);
                        float f = -gtVar.g.ascent();
                        rect2.left = rect.left + this.a.getCompoundPaddingLeft();
                        if (this.g == 1) {
                            centerY = (int) (((float) rect.centerY()) - (f / 2.0f));
                        } else {
                            centerY = rect.top + this.a.getCompoundPaddingTop();
                        }
                        rect2.top = centerY;
                        rect2.right = rect.right - this.a.getCompoundPaddingRight();
                        if (this.g == 1) {
                            i = (int) (((float) rect2.top) + f);
                        } else {
                            i = rect.bottom - this.a.getCompoundPaddingBottom();
                        }
                        rect2.bottom = i;
                        gtVar.a(rect2.left, rect2.top, rect2.right, rect2.bottom);
                        this.k.c();
                        if (x() && !this.ak) {
                            y();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.u) {
            this.k.a(canvas);
        }
        hu huVar = this.x;
        if (huVar != null) {
            Rect bounds = huVar.getBounds();
            bounds.top = bounds.bottom - this.C;
            this.x.draw(canvas);
        }
    }

    private final boolean x() {
        return this.u && !TextUtils.isEmpty(this.v) && (this.w instanceof kl);
    }

    private final void y() {
        if (x()) {
            float a;
            RectF rectF = this.I;
            gt gtVar = this.k;
            boolean a2 = gtVar.a(gtVar.f);
            if (a2) {
                a = ((float) gtVar.b.right) - gtVar.a();
            } else {
                a = (float) gtVar.b.left;
            }
            rectF.left = a;
            rectF.top = (float) gtVar.b.top;
            rectF.right = a2 ? (float) gtVar.b.right : rectF.left + gtVar.a();
            rectF.bottom = ((float) gtVar.b.top) + gtVar.b();
            rectF.left -= (float) this.A;
            rectF.top -= (float) this.A;
            rectF.right += (float) this.A;
            rectF.bottom += (float) this.A;
            rectF.offset((float) (-getPaddingLeft()), 0.0f);
            ((kl) this.w).a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void drawableStateChanged() {
        if (!this.am) {
            boolean z = true;
            this.am = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            gt gtVar = this.k;
            boolean a = gtVar != null ? gtVar.a(drawableState) : false;
            if (!(abe.D(this) && isEnabled())) {
                z = false;
            }
            a(z);
            d();
            f();
            if (a) {
                invalidate();
            }
            this.am = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:17:0x002c, code skipped:
            if (r3.isHovered() != false) goto L_0x002e;
     */
    public final void f() {
        /*
        r5 = this;
        r0 = r5.w;
        if (r0 == 0) goto L_0x013d;
    L_0x0004:
        r0 = r5.g;
        if (r0 == 0) goto L_0x013d;
    L_0x0008:
        r0 = r5.isFocused();
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x001d;
    L_0x0010:
        r0 = r5.a;
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r0.hasFocus();
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x001d;
    L_0x001b:
        r0 = 0;
        goto L_0x001e;
    L_0x001d:
        r0 = 1;
    L_0x001e:
        r3 = r5.isHovered();
        if (r3 != 0) goto L_0x002e;
    L_0x0024:
        r3 = r5.a;
        if (r3 == 0) goto L_0x002f;
    L_0x0028:
        r3 = r3.isHovered();
        if (r3 == 0) goto L_0x002f;
    L_0x002e:
        r1 = 1;
    L_0x002f:
        r3 = r5.isEnabled();
        if (r3 != 0) goto L_0x003a;
    L_0x0035:
        r3 = r5.aj;
        r5.F = r3;
        goto L_0x006c;
    L_0x003a:
        r3 = r5.p;
        r3 = r3.d();
        if (r3 == 0) goto L_0x004b;
    L_0x0042:
        r3 = r5.p;
        r3 = r3.e();
        r5.F = r3;
        goto L_0x006c;
    L_0x004b:
        r3 = r5.d;
        if (r3 == 0) goto L_0x005a;
    L_0x004f:
        r3 = r5.e;
        if (r3 == 0) goto L_0x005a;
    L_0x0053:
        r3 = r3.getCurrentTextColor();
        r5.F = r3;
        goto L_0x006c;
    L_0x005a:
        if (r0 == 0) goto L_0x0061;
    L_0x005c:
        r3 = r5.af;
        r5.F = r3;
        goto L_0x006c;
    L_0x0061:
        if (r1 == 0) goto L_0x0068;
    L_0x0063:
        r3 = r5.ae;
        r5.F = r3;
        goto L_0x006c;
    L_0x0068:
        r3 = r5.ad;
        r5.F = r3;
    L_0x006c:
        r3 = r5.p;
        r3 = r3.d();
        if (r3 == 0) goto L_0x00a0;
    L_0x0074:
        r3 = r5.s();
        r3 = r3.b();
        if (r3 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x00a0;
    L_0x007f:
        r3 = r5.r();
        if (r3 == 0) goto L_0x00a0;
    L_0x0085:
        r3 = r5.r();
        r3 = defpackage.st.d(r3);
        r3 = r3.mutate();
        r4 = r5.p;
        r4 = r4.e();
        defpackage.st.a(r3, r4);
        r4 = r5.i;
        r4.setImageDrawable(r3);
        goto L_0x00a3;
    L_0x00a0:
        r5.v();
    L_0x00a3:
        if (r1 == 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00a8;
    L_0x00a6:
        if (r0 == 0) goto L_0x00b6;
    L_0x00a8:
        r0 = r5.isEnabled();
        if (r0 == 0) goto L_0x00b6;
    L_0x00ae:
        r0 = r5.E;
        r5.C = r0;
        r5.h();
        goto L_0x00bd;
    L_0x00b6:
        r0 = r5.D;
        r5.C = r0;
        r5.h();
    L_0x00bd:
        r0 = r5.g;
        if (r0 != r2) goto L_0x00d7;
    L_0x00c1:
        r0 = r5.isEnabled();
        if (r0 != 0) goto L_0x00cc;
    L_0x00c7:
        r0 = r5.ah;
        r5.h = r0;
        goto L_0x00d7;
    L_0x00cc:
        if (r1 == 0) goto L_0x00d3;
    L_0x00ce:
        r0 = r5.ai;
        r5.h = r0;
        goto L_0x00d7;
    L_0x00d3:
        r0 = r5.ag;
        r5.h = r0;
    L_0x00d7:
        r0 = r5.w;
        if (r0 != 0) goto L_0x00dc;
    L_0x00db:
        goto L_0x013d;
    L_0x00dc:
        r0 = r5.g;
        r1 = 2;
        if (r0 != r1) goto L_0x00f1;
    L_0x00e1:
        r0 = r5.n();
        if (r0 == 0) goto L_0x00f1;
    L_0x00e7:
        r0 = r5.w;
        r1 = r5.C;
        r1 = (float) r1;
        r3 = r5.F;
        r0.a(r1, r3);
    L_0x00f1:
        r0 = r5.h;
        r1 = r5.g;
        if (r1 == r2) goto L_0x00f8;
    L_0x00f7:
        goto L_0x0109;
    L_0x00f8:
        r0 = r5.getContext();
        r1 = 2130772028; // 0x7f01003c float:1.7147163E38 double:1.052741258E-314;
        r0 = defpackage.fp.a(r0, r1);
        r1 = r5.h;
        r0 = defpackage.sc.a(r1, r0);
    L_0x0109:
        r5.h = r0;
        r1 = r5.w;
        r0 = android.content.res.ColorStateList.valueOf(r0);
        r1.a(r0);
        r0 = r5.Q;
        r1 = 3;
        if (r0 != r1) goto L_0x0122;
    L_0x0119:
        r0 = r5.a;
        r0 = r0.getBackground();
        r0.invalidateSelf();
    L_0x0122:
        r0 = r5.x;
        if (r0 == 0) goto L_0x013a;
    L_0x0126:
        r0 = r5.n();
        if (r0 == 0) goto L_0x0137;
    L_0x012c:
        r0 = r5.x;
        r1 = r5.F;
        r1 = android.content.res.ColorStateList.valueOf(r1);
        r0.a(r1);
    L_0x0137:
        r5.invalidate();
    L_0x013a:
        r5.invalidate();
    L_0x013d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.textfield.TextInputLayout.f():void");
    }

    private final void a(float f) {
        if (this.k.a != f) {
            if (this.al == null) {
                this.al = new ValueAnimator();
                this.al.setInterpolator(dq.b);
                this.al.setDuration(167);
                this.al.addUpdateListener(new le(this));
            }
            this.al.setFloatValues(new float[]{this.k.a, f});
            this.al.start();
        }
    }
}
