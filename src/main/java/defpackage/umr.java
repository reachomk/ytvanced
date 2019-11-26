package defpackage;

import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: umr */
public final class umr implements nlp {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    private final nlp b;
    private boolean c;
    private int d;

    public umr() {
        nlp a = nlr.a(5, 0, 0);
        this.b = a;
        this.d = 5;
    }

    public final Looper a() {
        return this.b.a();
    }

    public final void a(nlu nlu) {
        this.b.a(nlu);
    }

    public final void b(nlu nlu) {
        this.b.b(nlu);
    }

    public final int b() {
        return this.b.b();
    }

    public final void a(nnj... nnjArr) {
        this.d = nnjArr.length;
        this.b.a(nnjArr);
    }

    @Deprecated
    public final void b(boolean z) {
        a(4, !z ? -1 : 0);
    }

    public final int c() {
        return this.b.c();
    }

    public final nmx a(int i) {
        return this.b.a(i);
    }

    public final void a(int i, int i2) {
        this.b.a(i, i2);
        if (this.c && k()) {
            c(true);
        }
    }

    public final int b(int i) {
        return this.b.b(i);
    }

    public final void a(boolean z) {
        this.c = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            umu umu = (umu) it.next();
            this.b.b();
            umu.b();
        }
        if (!z || k()) {
            c(z);
        }
    }

    public final boolean d() {
        return this.c || this.b.d();
    }

    public final boolean e() {
        return !this.c && this.b.e();
    }

    public final void a(long j) {
        this.b.a(j);
    }

    public final void f() {
        this.b.f();
    }

    public final void g() {
        this.b.g();
    }

    public final void a(nls nls, int i, Object obj) {
        this.b.a(nls, i, obj);
    }

    public final void b(nls nls, int i, Object obj) {
        this.b.b(nls, i, obj);
    }

    public final long h() {
        return this.b.h();
    }

    public final long i() {
        return this.b.i();
    }

    public final long j() {
        return this.b.j();
    }

    private final void c(boolean z) {
        this.b.a(z);
        this.c = false;
    }

    private final boolean k() {
        for (int i = 0; i < this.d; i++) {
            if (this.b.b(i) < 0) {
                return false;
            }
        }
        return true;
    }
}
