package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: aek */
final class aek extends ael implements aiv, Factory2 {
    private static final Map s = new zj();
    private static final boolean t = (VERSION.SDK_INT < 21);
    private static final int[] u = new int[]{16842836};
    private static boolean v = true;
    private CharSequence A;
    private aev B;
    private aff C;
    private boolean D;
    private ViewGroup E;
    private TextView F;
    private View G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private afc[] O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private aey W;
    private aey X;
    private final Runnable Y;
    private boolean Z;
    public final Context a;
    private Rect aa;
    private Rect ab;
    private afj ac;
    public Window b;
    public final aei c;
    public ame d;
    public ahv e;
    public ActionBarContextView f;
    public PopupWindow g;
    public Runnable h;
    public abr i;
    public boolean j;
    public boolean k;
    public afc l;
    public boolean m;
    public boolean n;
    public int o;
    private final Object w;
    private aew x;
    private ads y;
    private MenuInflater z;

    aek(Activity activity, aei aei) {
        this(activity, null, aei, activity);
    }

    aek(Dialog dialog, aei aei) {
        this(dialog.getContext(), dialog.getWindow(), aei, dialog);
    }

    private aek(Context context, Window window, aei aei, Object obj) {
        aej aej = null;
        this.i = null;
        this.j = true;
        this.S = -100;
        this.Y = new aem(this);
        this.a = context;
        this.c = aei;
        this.w = obj;
        if (this.S == -100 && (this.w instanceof Dialog)) {
            context = this.a;
            while (context != null) {
                if (!(context instanceof aej)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    aej = (aej) context;
                    break;
                }
            }
            if (aej != null) {
                this.S = aej.h().r();
            }
        }
        if (this.S == -100) {
            Integer num = (Integer) s.get(this.w.getClass());
            if (num != null) {
                this.S = num.intValue();
                s.remove(this.w.getClass());
            }
        }
        if (window != null) {
            a(window);
        }
        aky.a();
    }

    public final void a() {
        a(false);
        this.Q = true;
    }

    public final void b() {
        this.Q = true;
        a(false);
        v();
        Object obj = this.w;
        if (obj instanceof Activity) {
            String b;
            try {
                b = qa.b((Activity) obj);
            } catch (IllegalArgumentException unused) {
                b = null;
            }
            if (b != null) {
                ads ads = this.y;
                if (ads != null) {
                    ads.c(true);
                } else {
                    this.Z = true;
                }
            }
        }
        this.R = true;
    }

    public final void c() {
        w();
    }

    public final ads d() {
        t();
        return this.y;
    }

    /* Access modifiers changed, original: final */
    public final Callback e() {
        return this.b.getCallback();
    }

    private final void t() {
        w();
        if (this.k && this.y == null) {
            Object obj = this.w;
            if (obj instanceof Activity) {
                this.y = new afv((Activity) obj, this.J);
            } else if (obj instanceof Dialog) {
                this.y = new afv((Dialog) obj);
            }
            ads ads = this.y;
            if (ads != null) {
                ads.c(this.Z);
            }
        }
    }

    public final void a(Toolbar toolbar) {
        if (this.w instanceof Activity) {
            ads d = d();
            if (d instanceof afv) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.z = null;
            if (d != null) {
                d.o();
            }
            if (toolbar != null) {
                afk afk = new afk(toolbar, x(), this.x);
                this.y = afk;
                this.b.setCallback(afk.c);
            } else {
                this.y = null;
                this.b.setCallback(this.x);
            }
            m();
        }
    }

    private final Context u() {
        ads d = d();
        Context h = d != null ? d.h() : null;
        return h == null ? this.a : h;
    }

    public final MenuInflater f() {
        if (this.z == null) {
            Context context;
            t();
            ads ads = this.y;
            if (ads == null) {
                context = this.a;
            } else {
                context = ads.h();
            }
            this.z = new aia(context);
        }
        return this.z;
    }

    public final View a(int i) {
        w();
        return this.b.findViewById(i);
    }

    public final void g() {
        if (this.k && this.D) {
            ads d = d();
            if (d != null) {
                d.j();
            }
        }
        aky.b().a(this.a);
        a(false);
    }

    public final void h() {
        q();
        synchronized (ael.r) {
            ael.b((ael) this);
            ael.q.add(new WeakReference(this));
        }
    }

    public final void i() {
        ael.a((ael) this);
        ads d = d();
        if (d != null) {
            d.d(false);
        }
    }

    public final void j() {
        ads d = d();
        if (d != null) {
            d.d(true);
        }
    }

    public final void a(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.x.a.onContentChanged();
    }

    public final void b(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a).inflate(i, viewGroup);
        this.x.a.onContentChanged();
    }

    public final void a(View view, LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.x.a.onContentChanged();
    }

    public final void b(View view, LayoutParams layoutParams) {
        w();
        ((ViewGroup) this.E.findViewById(16908290)).addView(view, layoutParams);
        this.x.a.onContentChanged();
    }

    public final void k() {
        if (this.S != -100) {
            s.put(this.w.getClass(), Integer.valueOf(this.S));
        }
    }

    public final void l() {
        ael.a((ael) this);
        if (this.n) {
            this.b.getDecorView().removeCallbacks(this.Y);
        }
        this.m = true;
        ads ads = this.y;
        if (ads != null) {
            ads.o();
        }
        aey aey = this.W;
        if (aey != null) {
            aey.e();
        }
        aey = this.X;
        if (aey != null) {
            aey.e();
        }
    }

    public final void c(int i) {
        this.T = i;
    }

    private final void v() {
        if (this.b == null) {
            Object obj = this.w;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.b == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void a(Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.b == null) {
            Callback callback = window.getCallback();
            if (callback instanceof aew) {
                throw new IllegalStateException(str);
            }
            this.x = new aew(this, callback);
            window.setCallback(this.x);
            arz a = arz.a(this.a, null, u);
            Drawable b = a.b(0);
            if (b != null) {
                window.setBackgroundDrawable(b);
            }
            a.a();
            this.b = window;
            return;
        }
        throw new IllegalStateException(str);
    }

    private final void w() {
        if (!this.D) {
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(afy.ar);
            if (obtainStyledAttributes.hasValue(afy.aw)) {
                ViewGroup viewGroup;
                if (obtainStyledAttributes.getBoolean(afy.aD, false)) {
                    d(1);
                } else if (obtainStyledAttributes.getBoolean(afy.aw, false)) {
                    d(108);
                }
                if (obtainStyledAttributes.getBoolean(afy.ax, false)) {
                    d(109);
                }
                if (obtainStyledAttributes.getBoolean(afy.ay, false)) {
                    d(10);
                }
                this.L = obtainStyledAttributes.getBoolean(afy.at, false);
                obtainStyledAttributes.recycle();
                v();
                this.b.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.a);
                if (this.M) {
                    if (this.K) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, null);
                    } else {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple, null);
                    }
                    if (VERSION.SDK_INT >= 21) {
                        abe.a((View) viewGroup, new aep(this));
                    } else {
                        ((anc) viewGroup).a(new aeo(this));
                    }
                } else if (this.L) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, null);
                    this.J = false;
                    this.k = false;
                } else if (this.k) {
                    TypedValue typedValue = new TypedValue();
                    this.a.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ahw(this.a, typedValue.resourceId) : this.a).inflate(R.layout.abc_screen_toolbar, null);
                    this.d = (ame) viewGroup.findViewById(R.id.decor_content_parent);
                    this.d.a(e());
                    if (this.J) {
                        this.d.a(109);
                    }
                    if (this.H) {
                        this.d.a(2);
                    }
                    if (this.I) {
                        this.d.a(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (this.d == null) {
                        this.F = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    asy.b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.b.setContentView(viewGroup);
                    contentFrameLayout.h = new aer(this);
                    this.E = viewGroup;
                    CharSequence x = x();
                    if (!TextUtils.isEmpty(x)) {
                        ame ame = this.d;
                        if (ame != null) {
                            ame.a(x);
                        } else {
                            ads ads = this.y;
                            if (ads != null) {
                                ads.b(x);
                            } else {
                                TextView textView = this.F;
                                if (textView != null) {
                                    textView.setText(x);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.E.findViewById(16908290);
                    View decorView = this.b.getDecorView();
                    contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (abe.D(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.a.obtainStyledAttributes(afy.ar);
                    if (contentFrameLayout2.a == null) {
                        contentFrameLayout2.a = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(10, contentFrameLayout2.a);
                    if (contentFrameLayout2.b == null) {
                        contentFrameLayout2.b = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(11, contentFrameLayout2.b);
                    if (obtainStyledAttributes2.hasValue(afy.aB)) {
                        if (contentFrameLayout2.c == null) {
                            contentFrameLayout2.c = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(6, contentFrameLayout2.c);
                    }
                    if (obtainStyledAttributes2.hasValue(afy.aC)) {
                        if (contentFrameLayout2.d == null) {
                            contentFrameLayout2.d = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(8, contentFrameLayout2.d);
                    }
                    if (obtainStyledAttributes2.hasValue(afy.az)) {
                        if (contentFrameLayout2.e == null) {
                            contentFrameLayout2.e = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(9, contentFrameLayout2.e);
                    }
                    if (obtainStyledAttributes2.hasValue(afy.aA)) {
                        if (contentFrameLayout2.f == null) {
                            contentFrameLayout2.f = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(7, contentFrameLayout2.f);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.D = true;
                    afc e = e(0);
                    if (!this.m) {
                        if (e == null || e.h == null) {
                            h(108);
                            return;
                        }
                        return;
                    }
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
                stringBuilder.append(this.k);
                stringBuilder.append(", windowActionBarOverlay: ");
                stringBuilder.append(this.J);
                stringBuilder.append(", android:windowIsFloating: ");
                stringBuilder.append(this.L);
                stringBuilder.append(", windowActionModeOverlay: ");
                stringBuilder.append(this.K);
                stringBuilder.append(", windowNoTitle: ");
                stringBuilder.append(this.M);
                stringBuilder.append(" }");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final boolean d(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.M && i == 108) {
            return false;
        }
        if (this.k && i == 1) {
            this.k = false;
        }
        if (i == 1) {
            y();
            this.M = true;
            return true;
        } else if (i == 2) {
            y();
            this.H = true;
            return true;
        } else if (i == 5) {
            y();
            this.I = true;
            return true;
        } else if (i == 10) {
            y();
            this.K = true;
            return true;
        } else if (i == 108) {
            y();
            this.k = true;
            return true;
        } else if (i != 109) {
            return this.b.requestFeature(i);
        } else {
            y();
            this.J = true;
            return true;
        }
    }

    public final void a(CharSequence charSequence) {
        this.A = charSequence;
        ame ame = this.d;
        if (ame != null) {
            ame.a(charSequence);
        } else {
            ads ads = this.y;
            if (ads != null) {
                ads.b(charSequence);
                return;
            }
            TextView textView = this.F;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    private final CharSequence x() {
        Object obj = this.w;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.A;
    }

    public final boolean a(aiw aiw, MenuItem menuItem) {
        Callback e = e();
        if (!(e == null || this.m)) {
            afc a = a(aiw.m());
            if (a != null) {
                return e.onMenuItemSelected(a.a, menuItem);
            }
        }
        return false;
    }

    public final void a(aiw aiw) {
        ame ame = this.d;
        if (ame == null || !ame.b() || (ViewConfiguration.get(this.a).hasPermanentMenuKey() && !this.d.d())) {
            afc e = e(0);
            e.o = true;
            a(e, false);
            b(e, null);
            return;
        }
        Callback e2 = e();
        if (this.d.c()) {
            this.d.f();
            if (!this.m) {
                e2.onPanelClosed(108, e(0).h);
            }
        } else if (!(e2 == null || this.m)) {
            if (this.n && (1 & this.o) != 0) {
                this.b.getDecorView().removeCallbacks(this.Y);
                this.Y.run();
            }
            afc e3 = e(0);
            aiw aiw2 = e3.h;
            if (!(aiw2 == null || e3.p || !e2.onPreparePanel(0, e3.g, aiw2))) {
                e2.onMenuOpened(108, e3.h);
                this.d.e();
            }
        }
    }

    public final void m() {
        ads d = d();
        if (d == null || !d.m()) {
            h(0);
        }
    }

    /* Access modifiers changed, original: final */
    public final ahv a(ahu ahu) {
        o();
        ahv ahv = this.e;
        if (ahv != null) {
            ahv.c();
        }
        aei aei = this.c;
        if (!(aei == null || this.m)) {
            try {
                aei.d_();
            } catch (AbstractMethodError unused) {
            }
        }
        if (this.f == null) {
            if (this.L) {
                Context ahw;
                TypedValue typedValue = new TypedValue();
                Theme theme = this.a.getTheme();
                theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Theme newTheme = this.a.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    ahw = new ahw(this.a, 0);
                    ahw.getTheme().setTo(newTheme);
                } else {
                    ahw = this.a;
                }
                this.f = new ActionBarContextView(ahw);
                this.g = new PopupWindow(ahw, null, R.attr.actionModePopupWindowStyle);
                adi.a(this.g, 2);
                this.g.setContentView(this.f);
                this.g.setWidth(-1);
                ahw.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                this.f.e = TypedValue.complexToDimensionPixelSize(typedValue.data, ahw.getResources().getDisplayMetrics());
                this.g.setHeight(-2);
                this.h = new aeq(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.E.findViewById(R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.a = LayoutInflater.from(u());
                    this.f = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.f != null) {
            o();
            this.f.a();
            ahv = new ahz(this.f.getContext(), this.f, ahu);
            if (ahu.a(ahv, ahv.a)) {
                ahv.d();
                this.f.a(ahv);
                this.e = ahv;
                if (n()) {
                    this.f.setAlpha(0.0f);
                    abr p = abe.p(this.f);
                    p.a(1.0f);
                    this.i = p;
                    this.i.a(new aes(this));
                } else {
                    this.f.setAlpha(1.0f);
                    this.f.setVisibility(0);
                    this.f.sendAccessibilityEvent(32);
                    if (this.f.getParent() instanceof View) {
                        abe.u((View) this.f.getParent());
                    }
                }
                if (this.g != null) {
                    this.b.getDecorView().post(this.h);
                }
            } else {
                this.e = null;
            }
        }
        if (this.e != null) {
            aei aei2 = this.c;
            if (aei2 != null) {
                aei2.b_();
            }
        }
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final boolean n() {
        if (this.D) {
            ViewGroup viewGroup = this.E;
            if (viewGroup != null && abe.D(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final void o() {
        abr abr = this.i;
        if (abr != null) {
            abr.a();
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:57:0x00bd, code skipped:
            if (a(r0, r7) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Missing block: B:60:0x00c7, code skipped:
            if (r7 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Missing block: B:78:0x0108, code skipped:
            if (r7.n() != false) goto L_0x010c;
     */
    public final boolean a(android.view.KeyEvent r7) {
        /*
        r6 = this;
        r0 = r6.w;
        r1 = r0 instanceof defpackage.aar;
        r2 = 1;
        if (r1 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r0 instanceof defpackage.afe;
        if (r0 == 0) goto L_0x001b;
    L_0x000b:
        r0 = r6.b;
        r0 = r0.getDecorView();
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = defpackage.aao.a(r0, r7);
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        return r2;
    L_0x001b:
        r0 = r7.getKeyCode();
        r1 = 82;
        if (r0 != r1) goto L_0x002f;
    L_0x0023:
        r0 = r6.x;
        r0 = r0.a;
        r0 = r0.dispatchKeyEvent(r7);
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        return r2;
    L_0x002f:
        r0 = r7.getKeyCode();
        r3 = r7.getAction();
        r4 = 4;
        r5 = 0;
        if (r3 != 0) goto L_0x0061;
    L_0x003b:
        if (r0 == r4) goto L_0x0054;
    L_0x003d:
        if (r0 == r1) goto L_0x0040;
    L_0x003f:
        goto L_0x0065;
    L_0x0040:
        r0 = r7.getRepeatCount();
        if (r0 != 0) goto L_0x010c;
    L_0x0046:
        r0 = r6.e(r5);
        r1 = r0.m;
        if (r1 == 0) goto L_0x0050;
    L_0x004e:
        goto L_0x010c;
    L_0x0050:
        r6.a(r0, r7);
        return r2;
    L_0x0054:
        r7 = r7.getFlags();
        r7 = r7 & 128;
        if (r7 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x005e;
    L_0x005d:
        r2 = 0;
    L_0x005e:
        r6.P = r2;
        return r5;
    L_0x0061:
        if (r0 == r4) goto L_0x00e1;
    L_0x0063:
        if (r0 == r1) goto L_0x0068;
    L_0x0065:
        r2 = 0;
        goto L_0x010c;
    L_0x0068:
        r0 = r6.e;
        if (r0 != 0) goto L_0x010c;
    L_0x006c:
        r0 = r6.e(r5);
        r1 = r6.d;
        if (r1 == 0) goto L_0x00a6;
    L_0x0074:
        r1 = r1.b();
        if (r1 == 0) goto L_0x00a6;
    L_0x007a:
        r1 = r6.a;
        r1 = android.view.ViewConfiguration.get(r1);
        r1 = r1.hasPermanentMenuKey();
        if (r1 != 0) goto L_0x00a6;
    L_0x0086:
        r1 = r6.d;
        r1 = r1.c();
        if (r1 != 0) goto L_0x009f;
    L_0x008e:
        r1 = r6.m;
        if (r1 != 0) goto L_0x010c;
    L_0x0092:
        r7 = r6.a(r0, r7);
        if (r7 == 0) goto L_0x010c;
    L_0x0098:
        r7 = r6.d;
        r7 = r7.e();
        goto L_0x00c7;
    L_0x009f:
        r7 = r6.d;
        r7 = r7.f();
        goto L_0x00c7;
    L_0x00a6:
        r1 = r0.m;
        if (r1 != 0) goto L_0x00c3;
    L_0x00aa:
        r3 = r0.l;
        if (r3 == 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00c3;
    L_0x00af:
        r1 = r0.k;
        if (r1 == 0) goto L_0x010c;
    L_0x00b3:
        r1 = r0.p;
        if (r1 == 0) goto L_0x00bf;
    L_0x00b7:
        r0.k = r5;
        r1 = r6.a(r0, r7);
        if (r1 == 0) goto L_0x010c;
    L_0x00bf:
        r6.b(r0, r7);
        goto L_0x00c9;
    L_0x00c3:
        r6.a(r0, r2);
        r7 = r1;
    L_0x00c7:
        if (r7 == 0) goto L_0x010c;
    L_0x00c9:
        r7 = r6.a;
        r0 = "audio";
        r7 = r7.getSystemService(r0);
        r7 = (android.media.AudioManager) r7;
        if (r7 != 0) goto L_0x00dd;
    L_0x00d5:
        r7 = "AppCompatDelegate";
        r0 = "Couldn't get audio manager";
        android.util.Log.w(r7, r0);
        goto L_0x010c;
    L_0x00dd:
        r7.playSoundEffect(r5);
        goto L_0x010c;
    L_0x00e1:
        r7 = r6.P;
        r6.P = r5;
        r0 = r6.e(r5);
        if (r0 == 0) goto L_0x00f6;
    L_0x00eb:
        r1 = r0.m;
        if (r1 == 0) goto L_0x00f6;
    L_0x00ef:
        if (r7 == 0) goto L_0x00f2;
    L_0x00f1:
        goto L_0x010c;
    L_0x00f2:
        r6.a(r0, r2);
        return r2;
    L_0x00f6:
        r7 = r6.e;
        if (r7 == 0) goto L_0x00fe;
    L_0x00fa:
        r7.c();
        goto L_0x010c;
    L_0x00fe:
        r7 = r6.d();
        if (r7 == 0) goto L_0x0065;
    L_0x0104:
        r7 = r7.n();
        if (r7 != 0) goto L_0x010c;
    L_0x010a:
        goto L_0x0065;
    L_0x010c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aek.a(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Missing block: B:16:0x0056, code skipped:
            if (((org.xmlpull.v1.XmlPullParser) r13).getDepth() <= 1) goto L_0x007d;
     */
    private final android.view.View a(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
        r9 = this;
        r0 = r9.ac;
        r1 = 0;
        if (r0 != 0) goto L_0x0046;
    L_0x0005:
        r0 = r9.a;
        r2 = defpackage.afy.ar;
        r0 = r0.obtainStyledAttributes(r2);
        r2 = defpackage.afy.av;
        r0 = r0.getString(r2);
        if (r0 == 0) goto L_0x003f;
    L_0x0015:
        r2 = defpackage.afj.class;
        r2 = r2.getName();
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x003f;
    L_0x0022:
        r0 = java.lang.Class.forName(r0);	 Catch:{ all -> 0x0037 }
        r2 = new java.lang.Class[r1];	 Catch:{ all -> 0x0037 }
        r0 = r0.getDeclaredConstructor(r2);	 Catch:{ all -> 0x0037 }
        r2 = new java.lang.Object[r1];	 Catch:{ all -> 0x0037 }
        r0 = r0.newInstance(r2);	 Catch:{ all -> 0x0037 }
        r0 = (defpackage.afj) r0;	 Catch:{ all -> 0x0037 }
        r9.ac = r0;	 Catch:{ all -> 0x0037 }
        goto L_0x0046;
    L_0x0037:
        r0 = new afj;
        r0.<init>();
        r9.ac = r0;
        goto L_0x0046;
    L_0x003f:
        r0 = new afj;
        r0.<init>();
        r9.ac = r0;
    L_0x0046:
        r0 = t;
        r2 = 1;
        if (r0 == 0) goto L_0x007d;
    L_0x004b:
        r0 = r13 instanceof org.xmlpull.v1.XmlPullParser;
        if (r0 == 0) goto L_0x005b;
    L_0x004f:
        r0 = r13;
        r0 = (org.xmlpull.v1.XmlPullParser) r0;
        r0 = r0.getDepth();
        if (r0 > r2) goto L_0x0059;
    L_0x0058:
        goto L_0x007d;
    L_0x0059:
        r5 = 1;
        goto L_0x007e;
    L_0x005b:
        r0 = r10;
        r0 = (android.view.ViewParent) r0;
        if (r0 != 0) goto L_0x0061;
    L_0x0060:
        goto L_0x007d;
    L_0x0061:
        r3 = r9.b;
        r3 = r3.getDecorView();
    L_0x0067:
        if (r0 == 0) goto L_0x0059;
    L_0x0069:
        if (r0 == r3) goto L_0x007d;
    L_0x006b:
        r5 = r0 instanceof android.view.View;
        if (r5 == 0) goto L_0x007d;
    L_0x006f:
        r5 = r0;
        r5 = (android.view.View) r5;
        r5 = defpackage.abe.H(r5);
        if (r5 != 0) goto L_0x007d;
    L_0x0078:
        r0 = r0.getParent();
        goto L_0x0067;
    L_0x007d:
        r5 = 0;
    L_0x007e:
        r0 = r9.ac;
        r6 = t;
        r7 = 1;
        r8 = defpackage.asr.a();
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r4 = r13;
        r0 = r0.createView(r1, r2, r3, r4, r5, r6, r7, r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aek.a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p() {
        LayoutInflater from = LayoutInflater.from(this.a);
        if (from.getFactory() == null) {
            aaq.b(from, this);
        } else {
            from.getFactory2();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(view, str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return a(null, str, context, attributeSet);
    }

    /* JADX WARNING: Missing block: B:69:0x0155, code skipped:
            if (r14.f != null) goto L_0x0157;
     */
    private final void b(defpackage.afc r14, android.view.KeyEvent r15) {
        /*
        r13 = this;
        r0 = r14.m;
        if (r0 != 0) goto L_0x01c6;
    L_0x0004:
        r0 = r13.m;
        if (r0 != 0) goto L_0x01c6;
    L_0x0008:
        r0 = r14.a;
        if (r0 != 0) goto L_0x001f;
    L_0x000c:
        r0 = r13.a;
        r0 = r0.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;
        r0 = r0 & 15;
        r1 = 4;
        if (r0 == r1) goto L_0x001e;
    L_0x001d:
        goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r0 = r13.e();
        r1 = 1;
        if (r0 == 0) goto L_0x0035;
    L_0x0026:
        r2 = r14.a;
        r3 = r14.h;
        r0 = r0.onMenuOpened(r2, r3);
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0035;
    L_0x0031:
        r13.a(r14, r1);
        return;
    L_0x0035:
        r0 = r13.a;
        r2 = "window";
        r0 = r0.getSystemService(r2);
        r0 = (android.view.WindowManager) r0;
        if (r0 == 0) goto L_0x01c6;
    L_0x0041:
        r15 = r13.a(r14, r15);
        if (r15 == 0) goto L_0x01c6;
    L_0x0047:
        r15 = r14.e;
        r2 = -1;
        r3 = 0;
        r4 = -2;
        if (r15 == 0) goto L_0x0067;
    L_0x004e:
        r5 = r14.o;
        if (r5 != 0) goto L_0x0067;
    L_0x0052:
        r15 = r14.g;
        if (r15 == 0) goto L_0x0064;
    L_0x0056:
        r15 = r15.getLayoutParams();
        if (r15 == 0) goto L_0x0064;
    L_0x005c:
        r15 = r15.width;
        if (r15 == r2) goto L_0x0061;
    L_0x0060:
        goto L_0x0064;
    L_0x0061:
        r6 = -1;
        goto L_0x01a7;
    L_0x0064:
        r6 = -2;
        goto L_0x01a7;
    L_0x0067:
        if (r15 != 0) goto L_0x00e0;
    L_0x0069:
        r15 = r13.u();
        r2 = new android.util.TypedValue;
        r2.<init>();
        r5 = r15.getResources();
        r5 = r5.newTheme();
        r6 = r15.getTheme();
        r5.setTo(r6);
        r6 = 2130772444; // 0x7f0101dc float:1.7148007E38 double:1.0527414637E-314;
        r5.resolveAttribute(r6, r2, r1);
        r6 = r2.resourceId;
        if (r6 == 0) goto L_0x0090;
    L_0x008b:
        r6 = r2.resourceId;
        r5.applyStyle(r6, r1);
    L_0x0090:
        r6 = 2130772512; // 0x7f010220 float:1.7148145E38 double:1.0527414973E-314;
        r5.resolveAttribute(r6, r2, r1);
        r6 = r2.resourceId;
        if (r6 == 0) goto L_0x00a0;
    L_0x009a:
        r2 = r2.resourceId;
        r5.applyStyle(r2, r1);
        goto L_0x00a6;
    L_0x00a0:
        r2 = 2132017928; // 0x7f140308 float:1.9674148E38 double:1.0533568145E-314;
        r5.applyStyle(r2, r1);
    L_0x00a6:
        r2 = new ahw;
        r2.<init>(r15, r3);
        r15 = r2.getTheme();
        r15.setTo(r5);
        r14.j = r2;
        r15 = defpackage.afy.ar;
        r15 = r2.obtainStyledAttributes(r15);
        r2 = defpackage.afy.au;
        r2 = r15.getResourceId(r2, r3);
        r14.b = r2;
        r2 = defpackage.afy.as;
        r2 = r15.getResourceId(r2, r3);
        r14.d = r2;
        r15.recycle();
        r15 = new afd;
        r2 = r14.j;
        r15.<init>(r13, r2);
        r14.e = r15;
        r15 = 81;
        r14.c = r15;
        r15 = r14.e;
        if (r15 == 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00ef;
    L_0x00df:
        return;
    L_0x00e0:
        r2 = r14.o;
        if (r2 == 0) goto L_0x00ef;
    L_0x00e4:
        r15 = r15.getChildCount();
        if (r15 <= 0) goto L_0x00ef;
    L_0x00ea:
        r15 = r14.e;
        r15.removeAllViews();
    L_0x00ef:
        r15 = r14.g;
        if (r15 == 0) goto L_0x00f6;
    L_0x00f3:
        r14.f = r15;
        goto L_0x0157;
    L_0x00f6:
        r15 = r14.h;
        if (r15 == 0) goto L_0x01c6;
    L_0x00fa:
        r15 = r13.C;
        if (r15 != 0) goto L_0x0105;
    L_0x00fe:
        r15 = new aff;
        r15.<init>(r13);
        r13.C = r15;
    L_0x0105:
        r15 = r13.C;
        r2 = r14.h;
        if (r2 == 0) goto L_0x0150;
    L_0x010b:
        r2 = r14.i;
        if (r2 != 0) goto L_0x0121;
    L_0x010f:
        r2 = new ais;
        r5 = r14.j;
        r2.<init>(r5);
        r14.i = r2;
        r2 = r14.i;
        r2.e = r15;
        r15 = r14.h;
        r15.a(r2);
    L_0x0121:
        r15 = r14.i;
        r2 = r14.e;
        r5 = r15.c;
        if (r5 != 0) goto L_0x014d;
    L_0x0129:
        r5 = r15.a;
        r6 = 2131034125; // 0x7f05000d float:1.7678759E38 double:1.0528707513E-314;
        r2 = r5.inflate(r6, r2, r3);
        r2 = (android.support.v7.view.menu.ExpandedMenuView) r2;
        r15.c = r2;
        r2 = r15.f;
        if (r2 != 0) goto L_0x0141;
    L_0x013a:
        r2 = new aiu;
        r2.<init>(r15);
        r15.f = r2;
    L_0x0141:
        r2 = r15.c;
        r5 = r15.f;
        r2.setAdapter(r5);
        r2 = r15.c;
        r2.setOnItemClickListener(r15);
    L_0x014d:
        r15 = r15.c;
        goto L_0x0151;
    L_0x0150:
        r15 = 0;
    L_0x0151:
        r14.f = r15;
        r15 = r14.f;
        if (r15 == 0) goto L_0x01c6;
    L_0x0157:
        r15 = r14.f;
        if (r15 == 0) goto L_0x01c6;
    L_0x015b:
        r15 = r14.g;
        if (r15 != 0) goto L_0x016c;
    L_0x015f:
        r15 = r14.i;
        r15 = r15.c();
        r15 = r15.getCount();
        if (r15 > 0) goto L_0x016c;
    L_0x016b:
        goto L_0x01c6;
    L_0x016c:
        r15 = r14.f;
        r15 = r15.getLayoutParams();
        if (r15 != 0) goto L_0x0179;
    L_0x0174:
        r15 = new android.view.ViewGroup$LayoutParams;
        r15.<init>(r4, r4);
    L_0x0179:
        r2 = r14.b;
        r5 = r14.e;
        r5.setBackgroundResource(r2);
        r2 = r14.f;
        r2 = r2.getParent();
        r5 = r2 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x0191;
    L_0x018a:
        r2 = (android.view.ViewGroup) r2;
        r5 = r14.f;
        r2.removeView(r5);
    L_0x0191:
        r2 = r14.e;
        r5 = r14.f;
        r2.addView(r5, r15);
        r15 = r14.f;
        r15 = r15.hasFocus();
        if (r15 != 0) goto L_0x0064;
    L_0x01a0:
        r15 = r14.f;
        r15.requestFocus();
        goto L_0x0064;
    L_0x01a7:
        r14.l = r3;
        r15 = new android.view.WindowManager$LayoutParams;
        r7 = -2;
        r8 = 0;
        r9 = 0;
        r10 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r11 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r12 = -3;
        r5 = r15;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12);
        r2 = r14.c;
        r15.gravity = r2;
        r2 = r14.d;
        r15.windowAnimations = r2;
        r2 = r14.e;
        r0.addView(r2, r15);
        r14.m = r1;
    L_0x01c6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aek.b(afc, android.view.KeyEvent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7 A:{RETURN} */
    public final boolean a(defpackage.afc r12, android.view.KeyEvent r13) {
        /*
        r11 = this;
        r0 = r11.m;
        r1 = 0;
        if (r0 != 0) goto L_0x0157;
    L_0x0005:
        r0 = r12.k;
        r2 = 1;
        if (r0 != 0) goto L_0x0156;
    L_0x000a:
        r0 = r11.l;
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0014;
    L_0x000f:
        if (r0 == r12) goto L_0x0014;
    L_0x0011:
        r11.a(r0, r1);
    L_0x0014:
        r0 = r11.e();
        if (r0 == 0) goto L_0x0022;
    L_0x001a:
        r3 = r12.a;
        r3 = r0.onCreatePanelView(r3);
        r12.g = r3;
    L_0x0022:
        r3 = r12.a;
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r3 != 0) goto L_0x002a;
    L_0x0028:
        r3 = 1;
        goto L_0x002e;
    L_0x002a:
        if (r3 != r4) goto L_0x002d;
    L_0x002c:
        goto L_0x0028;
    L_0x002d:
        r3 = 0;
    L_0x002e:
        if (r3 == 0) goto L_0x0037;
    L_0x0030:
        r5 = r11.d;
        if (r5 == 0) goto L_0x0037;
    L_0x0034:
        r5.g();
    L_0x0037:
        r5 = r12.g;
        if (r5 == 0) goto L_0x003d;
    L_0x003b:
        goto L_0x0150;
    L_0x003d:
        if (r3 != 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0046;
    L_0x0040:
        r5 = r11.y;
        r5 = r5 instanceof defpackage.afk;
        if (r5 != 0) goto L_0x0150;
    L_0x0046:
        r5 = r12.h;
        r6 = 0;
        if (r5 == 0) goto L_0x0051;
    L_0x004b:
        r7 = r12.p;
        if (r7 != 0) goto L_0x0051;
    L_0x004f:
        goto L_0x0102;
    L_0x0051:
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        goto L_0x00c8;
    L_0x0055:
        r5 = r11.a;
        r7 = r12.a;
        if (r7 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x005f;
    L_0x005c:
        if (r7 == r4) goto L_0x005f;
    L_0x005e:
        goto L_0x00b8;
    L_0x005f:
        r4 = r11.d;
        if (r4 == 0) goto L_0x00b8;
    L_0x0063:
        r4 = new android.util.TypedValue;
        r4.<init>();
        r7 = r5.getTheme();
        r8 = 2130772447; // 0x7f0101df float:1.7148013E38 double:1.052741465E-314;
        r7.resolveAttribute(r8, r4, r2);
        r8 = r4.resourceId;
        r9 = 2130772448; // 0x7f0101e0 float:1.7148015E38 double:1.0527414657E-314;
        if (r8 == 0) goto L_0x008d;
    L_0x0079:
        r8 = r5.getResources();
        r8 = r8.newTheme();
        r8.setTo(r7);
        r10 = r4.resourceId;
        r8.applyStyle(r10, r2);
        r8.resolveAttribute(r9, r4, r2);
        goto L_0x0091;
    L_0x008d:
        r7.resolveAttribute(r9, r4, r2);
        r8 = r6;
    L_0x0091:
        r9 = r4.resourceId;
        if (r9 != 0) goto L_0x0096;
    L_0x0095:
        goto L_0x00a9;
    L_0x0096:
        if (r8 == 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00a4;
    L_0x0099:
        r8 = r5.getResources();
        r8 = r8.newTheme();
        r8.setTo(r7);
    L_0x00a4:
        r4 = r4.resourceId;
        r8.applyStyle(r4, r2);
    L_0x00a9:
        if (r8 == 0) goto L_0x00b8;
    L_0x00ab:
        r4 = new ahw;
        r4.<init>(r5, r1);
        r5 = r4.getTheme();
        r5.setTo(r8);
        goto L_0x00b9;
    L_0x00b8:
        r4 = r5;
    L_0x00b9:
        r5 = new aiw;
        r5.<init>(r4);
        r5.b = r11;
        r12.a(r5);
        r4 = r12.h;
        if (r4 != 0) goto L_0x00c8;
    L_0x00c7:
        return r1;
    L_0x00c8:
        if (r3 == 0) goto L_0x00e2;
    L_0x00ca:
        r4 = r11.d;
        if (r4 == 0) goto L_0x00e2;
    L_0x00ce:
        r4 = r11.B;
        if (r4 != 0) goto L_0x00d9;
    L_0x00d2:
        r4 = new aev;
        r4.<init>(r11);
        r11.B = r4;
    L_0x00d9:
        r4 = r11.d;
        r5 = r12.h;
        r7 = r11.B;
        r4.a(r5, r7);
    L_0x00e2:
        r4 = r12.h;
        r4.f();
        r4 = r12.a;
        r5 = r12.h;
        r4 = r0.onCreatePanelMenu(r4, r5);
        if (r4 != 0) goto L_0x0100;
    L_0x00f1:
        r12.a(r6);
        if (r3 == 0) goto L_0x00ff;
    L_0x00f6:
        r12 = r11.d;
        if (r12 == 0) goto L_0x00ff;
    L_0x00fa:
        r13 = r11.B;
        r12.a(r6, r13);
    L_0x00ff:
        return r1;
    L_0x0100:
        r12.p = r1;
    L_0x0102:
        r4 = r12.h;
        r4.f();
        r4 = r12.q;
        if (r4 == 0) goto L_0x0112;
    L_0x010b:
        r5 = r12.h;
        r5.b(r4);
        r12.q = r6;
    L_0x0112:
        r4 = r12.g;
        r5 = r12.h;
        r0 = r0.onPreparePanel(r1, r4, r5);
        if (r0 == 0) goto L_0x013e;
    L_0x011c:
        if (r13 == 0) goto L_0x0123;
    L_0x011e:
        r13 = r13.getDeviceId();
        goto L_0x0124;
    L_0x0123:
        r13 = -1;
    L_0x0124:
        r13 = android.view.KeyCharacterMap.load(r13);
        r13 = r13.getKeyboardType();
        if (r13 == r2) goto L_0x0130;
    L_0x012e:
        r13 = 1;
        goto L_0x0131;
    L_0x0130:
        r13 = 0;
    L_0x0131:
        r12.n = r13;
        r0 = r12.h;
        r0.setQwertyMode(r13);
        r13 = r12.h;
        r13.g();
        goto L_0x0150;
    L_0x013e:
        if (r3 != 0) goto L_0x0141;
    L_0x0140:
        goto L_0x014a;
    L_0x0141:
        r13 = r11.d;
        if (r13 == 0) goto L_0x014a;
    L_0x0145:
        r0 = r11.B;
        r13.a(r6, r0);
    L_0x014a:
        r12 = r12.h;
        r12.g();
        return r1;
    L_0x0150:
        r12.k = r2;
        r12.l = r1;
        r11.l = r12;
    L_0x0156:
        return r2;
    L_0x0157:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aek.a(afc, android.view.KeyEvent):boolean");
    }

    /* Access modifiers changed, original: final */
    public final void b(aiw aiw) {
        if (!this.N) {
            this.N = true;
            this.d.h();
            Callback e = e();
            if (!(e == null || this.m)) {
                e.onPanelClosed(108, aiw);
            }
            this.N = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(afc afc, boolean z) {
        if (z && afc.a == 0) {
            ame ame = this.d;
            if (ame != null && ame.c()) {
                b(afc.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
        if (windowManager != null && afc.m) {
            ViewGroup viewGroup = afc.e;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    a(afc.a, afc, null);
                }
            }
        }
        afc.k = false;
        afc.l = false;
        afc.m = false;
        afc.f = null;
        afc.o = true;
        if (this.l == afc) {
            this.l = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, afc afc, Menu menu) {
        if (menu == null) {
            if (afc == null && i >= 0) {
                afc[] afcArr = this.O;
                if (i < afcArr.length) {
                    afc = afcArr[i];
                }
            }
            if (afc != null) {
                menu = afc.h;
            }
        }
        if ((afc == null || afc.m) && !this.m) {
            this.x.a.onPanelClosed(i, menu);
        }
    }

    /* Access modifiers changed, original: final */
    public final afc a(Menu menu) {
        afc[] afcArr = this.O;
        int i = 0;
        int length = afcArr != null ? afcArr.length : 0;
        while (i < length) {
            afc afc = afcArr[i];
            if (afc != null && afc.h == menu) {
                return afc;
            }
            i++;
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final afc e(int i) {
        afc[] afcArr = this.O;
        if (afcArr == null || afcArr.length <= i) {
            afc[] afcArr2 = new afc[(i + 1)];
            if (afcArr != null) {
                System.arraycopy(afcArr, 0, afcArr2, 0, afcArr.length);
            }
            this.O = afcArr2;
            afcArr = afcArr2;
        }
        afc afc = afcArr[i];
        if (afc != null) {
            return afc;
        }
        afc = new afc(i);
        afcArr[i] = afc;
        return afc;
    }

    public final boolean a(afc afc, int i, KeyEvent keyEvent) {
        if (!keyEvent.isSystem() && (afc.k || a(afc, keyEvent))) {
            aiw aiw = afc.h;
            if (aiw != null) {
                return aiw.performShortcut(i, keyEvent, 1);
            }
        }
        return false;
    }

    private final void h(int i) {
        this.o = (1 << i) | this.o;
        if (!this.n) {
            abe.a(this.b.getDecorView(), this.Y);
            this.n = true;
        }
    }

    /* Access modifiers changed, original: final */
    public final void f(int i) {
        afc e = e(i);
        if (e.h != null) {
            Bundle bundle = new Bundle();
            e.h.a(bundle);
            if (bundle.size() > 0) {
                e.q = bundle;
            }
            e.h.f();
            e.h.clear();
        }
        e.p = true;
        e.o = true;
        if ((i == 108 || i == 0) && this.d != null) {
            e = e(0);
            if (e != null) {
                e.k = false;
                a(e, null);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int g(int i) {
        Object obj;
        ActionBarContextView actionBarContextView = this.f;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            obj = null;
        } else {
            Object obj2;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f.getLayoutParams();
            obj = 1;
            if (this.f.isShown()) {
                if (this.aa == null) {
                    this.aa = new Rect();
                    this.ab = new Rect();
                }
                Rect rect = this.aa;
                Rect rect2 = this.ab;
                rect.set(0, i, 0, 0);
                asy.a(this.E, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.G;
                    if (view == null) {
                        this.G = new View(this.a);
                        this.G.setBackgroundColor(this.a.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.E.addView(this.G, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.G.setLayoutParams(layoutParams);
                        }
                    }
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (this.G == null) {
                    obj = null;
                }
                if (!(this.K || r3 == null)) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                this.f.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.G;
        if (view2 != null) {
            if (obj == null) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    private final void y() {
        if (this.D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final boolean q() {
        return a(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f A:{SYNTHETIC, Splitter:B:34:0x007f} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f A:{SYNTHETIC, Splitter:B:34:0x007f} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    private final boolean a(boolean r12) {
        /*
        r11 = this;
        r0 = r11.m;
        r1 = 0;
        if (r0 != 0) goto L_0x019f;
    L_0x0005:
        r0 = r11.S;
        r2 = -100;
        if (r0 != r2) goto L_0x000d;
    L_0x000b:
        r0 = defpackage.ael.p;
    L_0x000d:
        r3 = 3;
        r4 = 2;
        r5 = 23;
        r6 = -1;
        r7 = 1;
        if (r0 == r2) goto L_0x004f;
    L_0x0015:
        if (r0 == r6) goto L_0x004d;
    L_0x0017:
        if (r0 == 0) goto L_0x0030;
    L_0x0019:
        if (r0 == r7) goto L_0x004d;
    L_0x001b:
        if (r0 == r4) goto L_0x004d;
    L_0x001d:
        if (r0 != r3) goto L_0x0028;
    L_0x001f:
        r2 = r11.A();
        r2 = r2.a();
        goto L_0x0050;
    L_0x0028:
        r12 = new java.lang.IllegalStateException;
        r0 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.";
        r12.<init>(r0);
        throw r12;
    L_0x0030:
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 < r5) goto L_0x0044;
    L_0x0034:
        r2 = r11.a;
        r8 = android.app.UiModeManager.class;
        r2 = r2.getSystemService(r8);
        r2 = (android.app.UiModeManager) r2;
        r2 = r2.getNightMode();
        if (r2 == 0) goto L_0x004f;
    L_0x0044:
        r2 = r11.z();
        r2 = r2.a();
        goto L_0x0050;
    L_0x004d:
        r2 = r0;
        goto L_0x0050;
    L_0x004f:
        r2 = -1;
    L_0x0050:
        r6 = r11.a;
        r6 = r6.getApplicationContext();
        r6 = r6.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.uiMode;
        r6 = r6 & 48;
        if (r2 == r7) goto L_0x006b;
    L_0x0064:
        if (r2 == r4) goto L_0x0068;
    L_0x0066:
        r2 = r6;
        goto L_0x006d;
    L_0x0068:
        r2 = 32;
        goto L_0x006d;
    L_0x006b:
        r2 = 16;
    L_0x006d:
        r4 = r11.V;
        if (r4 != 0) goto L_0x00a4;
    L_0x0071:
        r4 = r11.w;
        r4 = r4 instanceof android.app.Activity;
        if (r4 == 0) goto L_0x00a4;
    L_0x0077:
        r4 = r11.a;
        r4 = r4.getPackageManager();
        if (r4 == 0) goto L_0x00a2;
    L_0x007f:
        r8 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x009f }
        r9 = r11.a;	 Catch:{ NameNotFoundException -> 0x009f }
        r10 = r11.w;	 Catch:{ NameNotFoundException -> 0x009f }
        r10 = r10.getClass();	 Catch:{ NameNotFoundException -> 0x009f }
        r8.<init>(r9, r10);	 Catch:{ NameNotFoundException -> 0x009f }
        r4 = r4.getActivityInfo(r8, r1);	 Catch:{ NameNotFoundException -> 0x009f }
        if (r4 == 0) goto L_0x009b;
    L_0x0092:
        r4 = r4.configChanges;	 Catch:{ NameNotFoundException -> 0x009f }
        r4 = r4 & 512;
        if (r4 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x009b;
    L_0x0099:
        r4 = 1;
        goto L_0x009c;
    L_0x009b:
        r4 = 0;
    L_0x009c:
        r11.U = r4;	 Catch:{ NameNotFoundException -> 0x009f }
        goto L_0x00a4;
    L_0x009f:
        r11.U = r1;
        goto L_0x00a4;
    L_0x00a2:
        r4 = 0;
        goto L_0x00a8;
    L_0x00a4:
        r11.V = r7;
        r4 = r11.U;
    L_0x00a8:
        r8 = 17;
        if (r2 == r6) goto L_0x00d9;
    L_0x00ac:
        if (r4 != 0) goto L_0x00d9;
    L_0x00ae:
        r6 = android.os.Build.VERSION.SDK_INT;
        if (r6 < r8) goto L_0x00d9;
    L_0x00b2:
        r6 = r11.Q;
        if (r6 != 0) goto L_0x00d9;
    L_0x00b6:
        r6 = r11.w;
        r6 = r6 instanceof android.view.ContextThemeWrapper;
        if (r6 == 0) goto L_0x00d9;
    L_0x00bc:
        r6 = new android.content.res.Configuration;
        r6.<init>();
        r9 = r6.uiMode;
        r9 = r9 & -49;
        r9 = r9 | r2;
        r6.uiMode = r9;
        r9 = r11.w;	 Catch:{ IllegalStateException -> 0x00d1 }
        r9 = (android.view.ContextThemeWrapper) r9;	 Catch:{ IllegalStateException -> 0x00d1 }
        r9.applyOverrideConfiguration(r6);	 Catch:{ IllegalStateException -> 0x00d1 }
        r1 = 1;
        goto L_0x00d9;
    L_0x00d1:
        r6 = move-exception;
        r9 = "AppCompatDelegate";
        r10 = "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()";
        android.util.Log.e(r9, r10, r6);
    L_0x00d9:
        if (r1 == 0) goto L_0x00dd;
    L_0x00db:
        goto L_0x017b;
    L_0x00dd:
        if (r4 != 0) goto L_0x017b;
    L_0x00df:
        r4 = r11.a;
        r4 = r4.getResources();
        r4 = r4.getConfiguration();
        r4 = r4.uiMode;
        r4 = r4 & 48;
        if (r4 == r2) goto L_0x017b;
    L_0x00ef:
        r4 = 28;
        if (r12 == 0) goto L_0x011c;
    L_0x00f3:
        r12 = r11.Q;
        if (r12 == 0) goto L_0x011c;
    L_0x00f7:
        r12 = android.os.Build.VERSION.SDK_INT;
        if (r12 < r8) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0101;
    L_0x00fc:
        r12 = r11.R;
        if (r12 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x011c;
    L_0x0101:
        r12 = r11.w;
        r6 = r12 instanceof android.app.Activity;
        if (r6 == 0) goto L_0x011c;
    L_0x0107:
        r12 = (android.app.Activity) r12;
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r4) goto L_0x0112;
    L_0x010d:
        r12.recreate();
    L_0x0110:
        r1 = 1;
        goto L_0x011c;
    L_0x0112:
        r1 = defpackage.mv.a(r12);
        if (r1 != 0) goto L_0x0110;
    L_0x0118:
        r12.recreate();
        goto L_0x0110;
    L_0x011c:
        if (r1 != 0) goto L_0x017b;
    L_0x011e:
        r12 = r11.a;
        r12 = r12.getResources();
        r1 = new android.content.res.Configuration;
        r6 = r12.getConfiguration();
        r1.<init>(r6);
        r6 = r12.getConfiguration();
        r6 = r6.uiMode;
        r6 = r6 & -49;
        r2 = r2 | r6;
        r1.uiMode = r2;
        r2 = 0;
        r12.updateConfiguration(r1, r2);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 26;
        if (r1 < r2) goto L_0x0143;
    L_0x0142:
        goto L_0x0162;
    L_0x0143:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 >= r4) goto L_0x0162;
    L_0x0147:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 24;
        if (r1 < r2) goto L_0x0151;
    L_0x014d:
        defpackage.afl.c(r12);
        goto L_0x0162;
    L_0x0151:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r5) goto L_0x0159;
    L_0x0155:
        defpackage.afl.b(r12);
        goto L_0x0162;
    L_0x0159:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x0162;
    L_0x015f:
        defpackage.afl.a(r12);
    L_0x0162:
        r12 = r11.T;
        if (r12 == 0) goto L_0x017c;
    L_0x0166:
        r1 = r11.a;
        r1.setTheme(r12);
        r12 = android.os.Build.VERSION.SDK_INT;
        if (r12 < r5) goto L_0x017c;
    L_0x016f:
        r12 = r11.a;
        r12 = r12.getTheme();
        r1 = r11.T;
        r12.applyStyle(r1, r7);
        goto L_0x017c;
    L_0x017b:
        r7 = r1;
    L_0x017c:
        if (r0 == 0) goto L_0x0190;
    L_0x017e:
        r12 = r11.W;
        if (r12 != 0) goto L_0x0183;
    L_0x0182:
        goto L_0x0186;
    L_0x0183:
        r12.e();
    L_0x0186:
        if (r0 != r3) goto L_0x0197;
    L_0x0188:
        r12 = r11.A();
        r12.c();
        goto L_0x019e;
    L_0x0190:
        r12 = r11.z();
        r12.c();
    L_0x0197:
        r12 = r11.X;
        if (r12 == 0) goto L_0x019e;
    L_0x019b:
        r12.e();
    L_0x019e:
        return r7;
    L_0x019f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aek.a(boolean):boolean");
    }

    public final int r() {
        return this.S;
    }

    private final aey z() {
        if (this.W == null) {
            Context context = this.a;
            if (aft.a == null) {
                context = context.getApplicationContext();
                aft.a = new aft(context, (LocationManager) context.getSystemService("location"));
            }
            this.W = new afa(this, aft.a);
        }
        return this.W;
    }

    private final aey A() {
        if (this.X == null) {
            this.X = new aez(this, this.a);
        }
        return this.X;
    }

    static {
        if (t && !v) {
            Thread.setDefaultUncaughtExceptionHandler(new aen(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }
}
