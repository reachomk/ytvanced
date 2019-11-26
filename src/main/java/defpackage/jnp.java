package defpackage;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jnp */
public final class jnp implements fal {
    private final DefaultTabsBar a;
    private final ViewGroup b;
    private final ViewGroup c;
    private final ezq d;
    private View e;
    private final List f = new ArrayList();
    private jnr g;

    public jnp(ezq ezq, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, ViewGroup viewGroup) {
        this.d = (ezq) amqw.a((Object) ezq);
        this.c = (ViewGroup) amqw.a((Object) viewGroup);
        this.a = (DefaultTabsBar) amqw.a((Object) appTabsBar);
        this.b = constraintLayout;
        this.b.setVisibility(8);
    }

    public final int b() {
        return 0;
    }

    public final void a() {
        this.e = null;
        this.g = null;
    }

    public final View a(CharSequence charSequence, CharSequence charSequence2, boolean z, faj faj) {
        View a = this.a.a(charSequence, charSequence2, z);
        a(faj);
        return a;
    }

    public final View a(int i, boolean z, CharSequence charSequence, faj faj) {
        View a = this.a.a(i, z, charSequence);
        a(faj);
        return a;
    }

    public final void a(int i, boolean z, boolean z2) {
        for (fao a : this.f) {
            a.a(i, z);
        }
    }

    public final View a(int i) {
        return this.a.c(i);
    }

    public final ViewTreeObserver e() {
        return this.c.getViewTreeObserver();
    }

    public final void a(fao fao) {
        this.f.add(fao);
    }

    public final void b(fao fao) {
        this.f.remove(fao);
    }

    public final void c() {
        jnr jnr = this.g;
        if (jnr != null) {
            for (RecyclerView e : jnr.a) {
                e.e(0);
            }
            this.d.f();
        }
    }

    private final void a(faj faj) {
        jnr jnr = new jnr();
        for (ezm ezm : faj.b) {
            if (ezm.a()) {
                jnr.a((RecyclerView) ezm.b());
            } else {
                jnr.getClass();
                ezm.a(new jns(jnr));
            }
        }
        this.e = faj.a;
        this.c.addView(this.e);
        this.g = jnr;
    }

    public final void d() {
        this.d.f();
    }
}
