package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: afv */
public final class afv extends ads implements akd {
    private static final Interpolator o = new AccelerateInterpolator();
    private static final Interpolator p = new DecelerateInterpolator();
    private final abs A = new afx(this);
    private final abu B = new afw(this);
    public Context a;
    public ActionBarOverlayLayout b;
    public ActionBarContainer c;
    public amh d;
    public ActionBarContextView e;
    public View f;
    public afz g;
    public ahv h;
    public ahu i;
    public boolean j = true;
    public boolean k;
    public boolean l;
    public aif m;
    public boolean n;
    private Context q;
    private boolean r;
    private boolean s;
    private final ArrayList t = new ArrayList();
    private boolean u;
    private int v = 0;
    private boolean w;
    private boolean x = true;
    private boolean y;
    private final abs z = new afu(this);

    public afv(Activity activity, boolean z) {
        ArrayList arrayList = new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        return !z3 ? (z || z2) ? false : true : true;
    }

    public afv(Dialog dialog) {
        ArrayList arrayList = new ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    private final void a(View view) {
        int i;
        amh amh;
        this.b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.g.b(actionBarOverlayLayout.a);
                i = actionBarOverlayLayout.f;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    abe.u(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof amh) {
            amh = (amh) findViewById;
        } else if (findViewById instanceof Toolbar) {
            amh = ((Toolbar) findViewById).j();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't make a decor toolbar out of ");
            stringBuilder.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.d = amh;
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        amh amh2 = this.d;
        if (amh2 == null || this.e == null || this.c == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(getClass().getSimpleName());
            stringBuilder2.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(stringBuilder2.toString());
        }
        this.a = amh2.b();
        if ((this.d.n() & 4) != 0) {
            this.r = true;
        }
        ahs a = ahs.a(this.a);
        i = a.a.getApplicationInfo().targetSdkVersion;
        g();
        h(a.b());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, afy.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(afy.m, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2.c) {
                this.n = true;
                actionBarOverlayLayout2.a(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(afy.k, 0);
        if (dimensionPixelSize != 0) {
            abe.d(this.c, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void j() {
        h(ahs.a(this.a).b());
    }

    private final void h(boolean z) {
        this.u = z;
        if (z) {
            this.c.a();
            this.d.o();
        } else {
            this.d.o();
            this.c.a();
        }
        this.d.q();
        amh amh = this.d;
        boolean z2 = this.u;
        amh.a(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        boolean z3 = this.u;
        actionBarOverlayLayout.d = false;
    }

    public final void b(int i) {
        this.v = i;
    }

    public final void d(boolean z) {
        this.y = z;
        if (!z) {
            aif aif = this.m;
            if (aif != null) {
                aif.b();
            }
        }
    }

    public final void e(boolean z) {
        if (z != this.s) {
            this.s = z;
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                ((adu) this.t.get(i)).a();
            }
        }
    }

    public final void a(boolean z) {
        a(!z ? 0 : 2, 2);
    }

    public final void b(boolean z) {
        a(!z ? 0 : 4, 4);
    }

    public final void b() {
        a(0, 8);
    }

    public final void g() {
        this.d.p();
    }

    public final void a(int i) {
        a(this.a.getString(i));
    }

    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public final void a(int i, int i2) {
        int n = this.d.n();
        if ((i2 & 4) != 0) {
            this.r = true;
        }
        this.d.a((i & i2) | ((i2 ^ -1) & n));
    }

    public final View c() {
        return this.d.r();
    }

    public final int d() {
        return this.d.n();
    }

    public final ahv a(ahu ahu) {
        afz afz = this.g;
        if (afz != null) {
            afz.c();
        }
        this.b.a(false);
        this.e.a();
        ahv afz2 = new afz(this, this.e.getContext(), ahu);
        afz2.a.f();
        try {
            Object a = afz2.b.a(afz2, afz2.a);
            if (a == null) {
                return null;
            }
            this.g = afz2;
            afz2.d();
            this.e.a(afz2);
            g(true);
            this.e.sendAccessibilityEvent(32);
            return afz2;
        } finally {
            afz2 = afz2.a;
            afz2.g();
        }
    }

    public final void f(boolean z) {
        this.j = z;
    }

    public final void e() {
        if (this.k) {
            this.k = false;
            i(false);
        }
    }

    public final void p() {
        if (this.l) {
            this.l = false;
            i(true);
        }
    }

    public final void f() {
        if (!this.k) {
            this.k = true;
            i(false);
        }
    }

    public final void q() {
        if (!this.l) {
            this.l = true;
            i(true);
        }
    }

    private final void i(boolean z) {
        aif aif;
        int[] iArr;
        View view;
        if (afv.a(this.k, this.l, this.w)) {
            if (!this.x) {
                this.x = true;
                aif = this.m;
                if (aif != null) {
                    aif.b();
                }
                this.c.setVisibility(0);
                if (this.v == 0 && (this.y || z)) {
                    this.c.setTranslationY(0.0f);
                    float f = (float) (-this.c.getHeight());
                    if (z) {
                        iArr = new int[]{0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.c.setTranslationY(f);
                    aif aif2 = new aif();
                    abr p = abe.p(this.c);
                    p.c(0.0f);
                    p.a(this.B);
                    aif2.a(p);
                    if (this.j) {
                        View view2 = this.f;
                        if (view2 != null) {
                            view2.setTranslationY(f);
                            abr p2 = abe.p(this.f);
                            p2.c(0.0f);
                            aif2.a(p2);
                        }
                    }
                    aif2.a(p);
                    aif2.c();
                    aif2.a(this.A);
                    this.m = aif2;
                    aif2.a();
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j) {
                        view = this.f;
                        if (view != null) {
                            view.setTranslationY(0.0f);
                        }
                    }
                    this.A.a(null);
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                if (actionBarOverlayLayout != null) {
                    abe.u(actionBarOverlayLayout);
                }
            }
        } else if (this.x) {
            this.x = false;
            aif = this.m;
            if (aif != null) {
                aif.b();
            }
            if (this.v == 0 && (this.y || z)) {
                this.c.setAlpha(1.0f);
                this.c.a(true);
                aif = new aif();
                float f2 = (float) (-this.c.getHeight());
                if (z) {
                    iArr = new int[]{0, 0};
                    this.c.getLocationInWindow(iArr);
                    f2 -= (float) iArr[1];
                }
                abr p3 = abe.p(this.c);
                p3.c(f2);
                p3.a(this.B);
                aif.a(p3);
                if (this.j) {
                    view = this.f;
                    if (view != null) {
                        p3 = abe.p(view);
                        p3.c(f2);
                        aif.a(p3);
                    }
                }
                aif.a(o);
                aif.c();
                aif.a(this.z);
                this.m = aif;
                aif.a();
                return;
            }
            this.z.a(null);
        }
    }

    public final void g(boolean z) {
        if (z) {
            if (!this.w) {
                this.w = true;
                i(false);
            }
        } else if (this.w) {
            this.w = false;
            i(false);
        }
        if (abe.D(this.c)) {
            Object a;
            abr a2;
            if (z) {
                a = this.d.a(4, 100);
                a2 = this.e.a(0, 200);
            } else {
                a2 = this.d.a(0, 200);
                a = this.e.a(8, 100);
            }
            aif aif = new aif();
            aif.a.add(a);
            View view = (View) a.a.get();
            a2.b(view != null ? view.animate().getDuration() : 0);
            aif.a.add(a2);
            aif.a();
        } else if (z) {
            this.d.c(4);
            this.e.setVisibility(0);
        } else {
            this.d.c(0);
            this.e.setVisibility(8);
        }
    }

    public final Context h() {
        if (this.q == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.q = new ContextThemeWrapper(this.a, i);
            } else {
                this.q = this.a;
            }
        }
        return this.q;
    }

    public final void a(Drawable drawable) {
        this.d.b(drawable);
    }

    public final void i() {
        this.d.b((int) R.string.abc_action_bar_up_description);
    }

    public final void r() {
        aif aif = this.m;
        if (aif != null) {
            aif.b();
            this.m = null;
        }
    }

    public final boolean n() {
        amh amh = this.d;
        if (amh == null || !amh.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    public final void a(View view, adv adv) {
        view.setLayoutParams(adv);
        this.d.a(view);
    }

    public final void a() {
        this.d.a(null);
    }

    public final void c(boolean z) {
        if (!this.r) {
            b(z);
        }
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        afz afz = this.g;
        if (afz != null) {
            aiw aiw = afz.a;
            if (aiw != null) {
                boolean z = true;
                if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                    z = false;
                }
                aiw.setQwertyMode(z);
                return aiw.performShortcut(i, keyEvent, 0);
            }
        }
        return false;
    }
}
