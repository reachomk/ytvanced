package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: afz */
public final class afz extends ahv implements aiv {
    public final aiw a;
    public ahu b;
    private final Context e;
    private WeakReference f;
    private final /* synthetic */ afv g;

    public afz(afv afv, Context context, ahu ahu) {
        this.g = afv;
        this.e = context;
        this.b = ahu;
        aiw aiw = new aiw(context);
        aiw.a();
        this.a = aiw;
        this.a.a((aiv) this);
    }

    public final MenuInflater a() {
        return new aia(this.e);
    }

    public final Menu b() {
        return this.a;
    }

    public final void c() {
        afv afv = this.g;
        if (afv.g == this) {
            if (afv.a(afv.k, afv.l, false)) {
                this.b.a(this);
            } else {
                afv = this.g;
                afv.h = this;
                afv.i = this.b;
            }
            this.b = null;
            this.g.g(false);
            ActionBarContextView actionBarContextView = this.g.e;
            if (actionBarContextView.i == null) {
                actionBarContextView.a();
            }
            this.g.d.a().sendAccessibilityEvent(32);
            afv afv2 = this.g;
            afv2.b.a(afv2.n);
            this.g.g = null;
        }
    }

    public final void d() {
        if (this.g.g == this) {
            this.a.f();
            try {
                this.b.b(this, this.a);
            } finally {
                this.a.g();
            }
        }
    }

    public final void a(View view) {
        this.g.e.a(view);
        this.f = new WeakReference(view);
    }

    public final void a(CharSequence charSequence) {
        this.g.e.b(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.g.e.a(charSequence);
    }

    public final void a(int i) {
        b(this.g.a.getResources().getString(i));
    }

    public final void b(int i) {
        a(this.g.a.getResources().getString(i));
    }

    public final CharSequence e() {
        return this.g.e.g;
    }

    public final CharSequence f() {
        return this.g.e.h;
    }

    public final void a(boolean z) {
        this.d = z;
        this.g.e.a(z);
    }

    public final boolean g() {
        return this.g.e.j;
    }

    public final View h() {
        WeakReference weakReference = this.f;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    public final boolean a(aiw aiw, MenuItem menuItem) {
        ahu ahu = this.b;
        if (ahu == null) {
            return false;
        }
        return ahu.a((ahv) this, menuItem);
    }

    public final void a(aiw aiw) {
        if (this.b != null) {
            d();
            this.g.e.b();
        }
    }
}
