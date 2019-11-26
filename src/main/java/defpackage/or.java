package defpackage;

import java.util.ArrayList;

/* renamed from: or */
public abstract class or {
    private boolean a = true;
    public final ArrayList d = new ArrayList();
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public String l;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    public boolean s = false;

    public abstract int a();

    public or a(nf nfVar) {
        throw null;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, nf nfVar, String str, int i2) {
        throw null;
    }

    public abstract int b();

    public or b(nf nfVar) {
        throw null;
    }

    public or c(nf nfVar) {
        throw null;
    }

    public abstract void c();

    public abstract void d();

    /* Access modifiers changed, original: final */
    public final void b(oq oqVar) {
        this.d.add(oqVar);
        oqVar.c = this.e;
        oqVar.d = this.f;
        oqVar.e = this.g;
        oqVar.f = this.h;
    }

    public final or a(nf nfVar, String str) {
        a(0, nfVar, str, 1);
        return this;
    }

    public final or a(int i, nf nfVar) {
        a(i, nfVar, null, 1);
        return this;
    }

    public final or a(int i, nf nfVar, String str) {
        a(i, nfVar, str, 1);
        return this;
    }

    public final or b(int i, nf nfVar) {
        return b(i, nfVar, null);
    }

    public final or b(int i, nf nfVar, String str) {
        if (i != 0) {
            a(i, nfVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final or a(int i, int i2) {
        this.e = i;
        this.f = i2;
        this.g = 0;
        this.h = 0;
        return this;
    }

    public final or f() {
        if (this.a) {
            this.k = true;
            this.l = null;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final or g() {
        if (this.k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.a = false;
        return this;
    }
}
