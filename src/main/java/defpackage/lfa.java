package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: lfa */
public final class lfa implements xqf {
    public FrameLayout a;
    public FrameLayout b;
    public View c;
    public xqc d;
    public xqc e;
    public xqc f;
    public xqc g;
    public xqa h;
    public xqa i;
    public final LinkedList j = new LinkedList();
    private lev k;

    lfa() {
    }

    public final lev a() {
        LinkedList linkedList = this.j;
        return linkedList != null ? (lev) linkedList.peekLast() : null;
    }

    public final void a(lev lev, boolean z) {
        d();
        lev lev2 = (lev) this.j.peekLast();
        this.j.addLast(lev);
        if (z && lev2 != null) {
            if (((FrameLayout) this.e.d()).indexOfChild(lev2.b.f()) >= 0) {
                e();
            } else if (((FrameLayout) this.g.d()).indexOfChild(lev2.b.f()) < 0) {
                a(lev2.b);
            }
            b(lev.b);
            c(true);
            return;
        }
        a(lev);
        if (lev2 != null) {
            lev2.a(3);
        }
    }

    public final boolean a(boolean z) {
        if (this.j.size() <= 1) {
            return false;
        }
        d();
        lev lev = (lev) this.j.removeLast();
        lev lev2 = (lev) this.j.getLast();
        if (z) {
            if (((FrameLayout) this.g.d()).indexOfChild(lev.b.f()) >= 0) {
                e();
            } else if (((FrameLayout) this.e.d()).indexOfChild(lev.b.f()) < 0) {
                b(lev.b);
            }
            if (((FrameLayout) this.g.d()).indexOfChild(lev2.b.f()) < 0) {
                a(lev2.b);
            }
            this.k = lev;
            d(true);
        } else {
            a(lev2);
            lev.a(5);
        }
        return true;
    }

    public final void b() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((lev) it.next()).a(5);
        }
        if (this.d != null) {
            this.e.b((xqf) this);
            ((FrameLayout) this.d.d()).animate().cancel();
            ((FrameLayout) this.e.d()).animate().cancel();
            ((FrameLayout) this.f.d()).animate().cancel();
            b(null);
            a(null);
        }
        this.j.clear();
    }

    public final int c() {
        return this.j.size();
    }

    public final void a(int i, xqc xqc) {
        if (i == 0) {
            this.k.a(5);
            this.k = null;
            b(true);
        } else if (i != 2) {
            b(false);
        } else {
            this.g.b(false);
            if (this.j.size() > 1) {
                LinkedList linkedList = this.j;
                ((lev) linkedList.get(linkedList.size() - 2)).a(3);
            }
            b(true);
        }
    }

    private final void d() {
        if (this.e.b()) {
            c(false);
        } else {
            d(false);
        }
    }

    private final void b(boolean z) {
        xpr.a(this.c, z ^ 1);
    }

    private final void a(lev lev) {
        if (((FrameLayout) this.g.d()).indexOfChild(lev.b.f()) >= 0) {
            e();
        } else if (((FrameLayout) this.e.d()).indexOfChild(lev.b.f()) < 0) {
            b(lev.b);
        }
        c(false);
    }

    private final void e() {
        this.a.bringChildToFront(this.f.d());
        this.b.bringChildToFront(this.g.d());
        xqc xqc = this.d;
        this.d = this.f;
        this.f = xqc;
        xqc = this.e;
        this.e = this.g;
        this.g = xqc;
        this.d.a(this.h);
        this.f.a(this.i);
        this.g.b((xqf) this);
        this.e.a((xqf) this);
    }

    private final void a(leh leh) {
        ((FrameLayout) this.f.d()).removeAllViews();
        ((FrameLayout) this.g.d()).removeAllViews();
        if (leh != null) {
            ((FrameLayout) this.f.d()).addView(leh.n().a());
            ((FrameLayout) this.g.d()).addView(leh.f());
        }
    }

    private final void b(leh leh) {
        ((FrameLayout) this.d.d()).removeAllViews();
        ((FrameLayout) this.e.d()).removeAllViews();
        if (leh != null) {
            ((FrameLayout) this.d.d()).addView(leh.n().a());
            ((FrameLayout) this.e.d()).addView(leh.f());
        }
    }

    private final void c(boolean z) {
        if (z) {
            this.f.a(false);
            this.g.a(false);
            this.d.b(false);
            this.e.b((xqf) this);
            this.e.b(false);
            this.e.a((xqf) this);
        }
        this.f.b(z);
        this.d.a(z);
        this.e.a(z);
    }

    private final void d(boolean z) {
        if (z) {
            this.f.b(false);
            this.d.a(false);
            this.e.b((xqf) this);
            this.e.a(false);
            this.e.a((xqf) this);
        }
        this.f.a(z);
        this.g.a(false);
        this.d.b(z);
        this.e.b(z);
    }

    public static float a(View view, float f) {
        return abe.g(view) == 1 ? -f : f;
    }
}
