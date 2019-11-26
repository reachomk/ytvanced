package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: afk */
final class afk extends ads {
    public final amh a;
    public boolean b;
    public final Callback c;
    private boolean d;
    private boolean e;
    private final ArrayList f = new ArrayList();
    private final Runnable g = new afn(this);
    private final ase h = new afm(this);

    afk(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.a = new asj(toolbar, false);
        this.c = new afr(this, callback);
        this.a.a(this.c);
        toolbar.q = this.h;
        this.a.a(charSequence);
    }

    public final void c(boolean z) {
    }

    public final void d(boolean z) {
    }

    public final void g() {
    }

    public final void j() {
    }

    public final void a(View view, adv adv) {
        view.setLayoutParams(adv);
        this.a.a(view);
    }

    public final void a() {
        this.a.a(null);
    }

    public final Context h() {
        return this.a.b();
    }

    public final void a(Drawable drawable) {
        this.a.b(drawable);
    }

    public final void i() {
        this.a.b((int) R.string.abc_action_bar_up_description);
    }

    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void a(int i) {
        amh amh = this.a;
        amh.b(amh.b().getText(i));
    }

    public final void b(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void a(int i, int i2) {
        this.a.a((i & i2) | ((i2 ^ -1) & this.a.n()));
    }

    public final void a(boolean z) {
        a(!z ? 0 : 2, 2);
    }

    public final void b(boolean z) {
        a(4, 4);
    }

    public final void b() {
        a(0, 8);
    }

    public final View c() {
        return this.a.r();
    }

    public final int d() {
        return this.a.n();
    }

    public final void e() {
        this.a.c(0);
    }

    public final void f() {
        this.a.c(8);
    }

    public final boolean k() {
        return this.a.j();
    }

    public final boolean l() {
        return this.a.k();
    }

    public final boolean m() {
        this.a.a().removeCallbacks(this.g);
        abe.a(this.a.a(), this.g);
        return true;
    }

    public final boolean n() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        Menu p = p();
        if (p == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        p.setQwertyMode(z);
        return p.performShortcut(i, keyEvent, 0);
    }

    /* Access modifiers changed, original: final */
    public final void o() {
        this.a.a().removeCallbacks(this.g);
    }

    public final void e(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ((adu) this.f.get(i)).a();
            }
        }
    }

    public final Menu p() {
        if (!this.d) {
            this.a.a(new afp(this), new afo(this));
            this.d = true;
        }
        return this.a.s();
    }
}
