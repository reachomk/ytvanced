package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ahz */
public final class ahz extends ahv implements aiv {
    public final aiw a;
    private final Context b;
    private final ActionBarContextView e;
    private final ahu f;
    private WeakReference g;
    private boolean h;

    public ahz(Context context, ActionBarContextView actionBarContextView, ahu ahu) {
        this.b = context;
        this.e = actionBarContextView;
        this.f = ahu;
        aiw aiw = new aiw(actionBarContextView.getContext());
        aiw.a();
        this.a = aiw;
        this.a.a((aiv) this);
    }

    public final void b(CharSequence charSequence) {
        this.e.a(charSequence);
    }

    public final void a(CharSequence charSequence) {
        this.e.b(charSequence);
    }

    public final void a(int i) {
        b(this.b.getString(i));
    }

    public final void b(int i) {
        a(this.b.getString(i));
    }

    public final void a(boolean z) {
        this.d = z;
        this.e.a(z);
    }

    public final boolean g() {
        return this.e.j;
    }

    public final void a(View view) {
        this.e.a(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    public final void d() {
        this.f.b(this, this.a);
    }

    public final void c() {
        if (!this.h) {
            this.h = true;
            this.e.sendAccessibilityEvent(32);
            this.f.a(this);
        }
    }

    public final Menu b() {
        return this.a;
    }

    public final CharSequence e() {
        return this.e.g;
    }

    public final CharSequence f() {
        return this.e.h;
    }

    public final View h() {
        WeakReference weakReference = this.g;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    public final MenuInflater a() {
        return new aia(this.e.getContext());
    }

    public final boolean a(aiw aiw, MenuItem menuItem) {
        return this.f.a((ahv) this, menuItem);
    }

    public final void a(aiw aiw) {
        d();
        this.e.b();
    }
}
