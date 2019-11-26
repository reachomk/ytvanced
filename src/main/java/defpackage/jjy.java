package defpackage;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jjy */
public final class jjy implements fal {
    public final DefaultTabsBar a;
    public final RtlAwareViewPager b;
    public final ArrayList c;
    public final List d;
    private final ViewGroup e;
    private final ezq f;
    private final jkc g;
    private int h = -1;
    private final ArrayList i;
    private jkf j;

    public jjy(ezq ezq, AppTabsBar appTabsBar, ConstraintLayout constraintLayout, RtlAwareViewPager rtlAwareViewPager) {
        this.f = (ezq) amqw.a((Object) ezq);
        this.b = (RtlAwareViewPager) amqw.a((Object) rtlAwareViewPager);
        this.a = (DefaultTabsBar) amqw.a((Object) appTabsBar);
        this.e = constraintLayout;
        this.i = new ArrayList(10);
        this.c = new ArrayList(10);
        this.e.setVisibility(8);
        this.a.v = new jka(this);
        this.g = new jkc(this);
        this.b.a(this.g);
        this.b.l = new jkd(this);
        this.d = new ArrayList();
    }

    public final void a() {
        this.c.clear();
        this.g.d();
        this.i.clear();
        this.j = null;
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
        if (i >= 0 && i < this.a.b()) {
            if (i == this.b.a()) {
                a(i, z);
            }
            this.b.a(i, z2);
        }
    }

    public final int b() {
        return this.b.a();
    }

    public final View a(int i) {
        return this.a.c(i);
    }

    public final ViewTreeObserver e() {
        return this.b.getViewTreeObserver();
    }

    public final void a(fao fao) {
        this.d.add(fao);
    }

    public final void b(fao fao) {
        this.d.remove(fao);
    }

    public final void c() {
        jkf jkf = this.j;
        if (jkf != null) {
            for (RecyclerView e : jkf.a) {
                e.e(0);
            }
            this.f.f();
        }
    }

    public final void a(int i, boolean z) {
        int i2 = this.h;
        if (i2 != -1) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                if (!((fao) it.next()).a(i2)) {
                    it.remove();
                }
            }
        }
        this.a.b(i, false);
        this.h = i;
        this.j = (jkf) this.i.get(i);
        for (fao a : this.d) {
            a.a(i, z);
        }
    }

    private final void a(faj faj) {
        this.e.setVisibility(this.a.b() > 1 ? 0 : 8);
        jkf jkf = new jkf();
        for (ezm ezm : faj.b) {
            if (ezm.a()) {
                jkf.a((RecyclerView) ezm.b());
            } else {
                jkf.getClass();
                ezm.a(new jkb(jkf));
            }
        }
        this.c.add(faj.a);
        this.i.add(jkf);
        this.g.d();
    }

    public final void d() {
        this.f.f();
    }
}
