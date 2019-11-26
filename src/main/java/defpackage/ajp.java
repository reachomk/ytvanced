package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ajp */
final class ajp extends aji implements ajj, OnKeyListener, OnItemClickListener, OnDismissListener {
    public final aoh a;
    public final OnGlobalLayoutListener b = new ajs(this);
    public View c;
    public ViewTreeObserver d;
    private final Context e;
    private final aiw f;
    private final ait h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final OnAttachStateChangeListener m = new ajr(this);
    private OnDismissListener n;
    private View o;
    private ajm p;
    private boolean q;
    private boolean r;
    private int s;
    private int t = 0;
    private boolean u;

    public ajp(Context context, aiw aiw, View view, int i, int i2, boolean z) {
        this.e = context;
        this.f = aiw;
        this.i = z;
        this.h = new ait(aiw, LayoutInflater.from(context), this.i, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        this.l = i2;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.o = view;
        this.a = new aoh(this.e, this.k, this.l);
        aiw.a((ajj) this, context);
    }

    public final void a(aiw aiw) {
    }

    public final boolean b() {
        return false;
    }

    public final void a(boolean z) {
        this.h.b = z;
    }

    public final void a(int i) {
        this.t = i;
    }

    public final void f_() {
        if (!e()) {
            if (!this.q) {
                View view = this.o;
                if (view != null) {
                    this.c = view;
                    this.a.a((OnDismissListener) this);
                    aoh aoh = this.a;
                    aoh.n = this;
                    aoh.h();
                    view = this.c;
                    ViewTreeObserver viewTreeObserver = this.d;
                    this.d = view.getViewTreeObserver();
                    if (viewTreeObserver == null) {
                        this.d.addOnGlobalLayoutListener(this.b);
                    }
                    view.addOnAttachStateChangeListener(this.m);
                    aoh aoh2 = this.a;
                    aoh2.m = view;
                    aoh2.j = this.t;
                    if (!this.r) {
                        this.s = aji.a(this.h, this.e, this.j);
                        this.r = true;
                    }
                    this.a.d(this.s);
                    this.a.i();
                    this.a.a(this.g);
                    this.a.f_();
                    amt amt = this.a.e;
                    amt.setOnKeyListener(this);
                    if (this.u && this.f.e != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, amt, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(this.f.e);
                        }
                        frameLayout.setEnabled(false);
                        amt.addHeaderView(frameLayout, null, false);
                    }
                    this.a.a(this.h);
                    this.a.f_();
                    return;
                }
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void d() {
        if (e()) {
            this.a.d();
        }
    }

    public final boolean e() {
        return !this.q && this.a.e();
    }

    public final void onDismiss() {
        this.q = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.m);
        OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void a() {
        this.r = false;
        ait ait = this.h;
        if (ait != null) {
            ait.notifyDataSetChanged();
        }
    }

    public final void a(ajm ajm) {
        this.p = ajm;
    }

    public final boolean a(aju aju) {
        if (aju.hasVisibleItems()) {
            ajh ajh = new ajh(this.e, aju, this.c, this.i, this.k, this.l);
            ajh.a(this.p);
            ajh.a(aji.b((aiw) aju));
            ajh.c = this.n;
            this.n = null;
            this.f.a(false);
            aoh aoh = this.a;
            int i = aoh.g;
            int c = aoh.c();
            if ((Gravity.getAbsoluteGravity(this.t, abe.g(this.o)) & 7) == 5) {
                i += this.o.getWidth();
            }
            if (!ajh.f()) {
                if (ajh.a != null) {
                    ajh.a(i, c, true, true);
                }
            }
            ajm ajm = this.p;
            if (ajm != null) {
                ajm.a(aju);
            }
            return true;
        }
        return false;
    }

    public final void a(aiw aiw, boolean z) {
        if (aiw == this.f) {
            d();
            ajm ajm = this.p;
            if (ajm != null) {
                ajm.a(aiw, z);
            }
        }
    }

    public final void a(View view) {
        this.o = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        d();
        return true;
    }

    public final void a(OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public final ListView g_() {
        return this.a.e;
    }

    public final void b(int i) {
        this.a.g = i;
    }

    public final void c(int i) {
        this.a.a(i);
    }

    public final void b(boolean z) {
        this.u = z;
    }
}
