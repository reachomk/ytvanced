package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: upa */
final class upa implements upe, upf {
    public upf a;
    private final List b = new CopyOnWriteArrayList();

    private upa() {
    }

    public final void f() {
    }

    public final upf a(upf upf) {
        upf upf2 = this.a;
        if (upf2 != null) {
            upf2.b(this);
        }
        this.a = upf;
        upf = this.a;
        if (upf != null) {
            upf.a((upe) this);
        }
        return upf2;
    }

    public final uor a(long j) {
        upf upf = this.a;
        return upf != null ? upf.a(j) : null;
    }

    public final uor a(long j, boolean z) {
        upf upf = this.a;
        return upf != null ? upf.a(j, z) : null;
    }

    public final boolean e() {
        upf upf = this.a;
        return upf != null ? upf.e() : false;
    }

    public final void a(upe upe) {
        boolean e;
        synchronized (this.b) {
            this.b.add(upe);
            e = e();
        }
        if (e) {
            upe.b(this);
        }
    }

    public final void b(upe upe) {
        this.b.remove(upe);
    }

    public final void a(uor uor) {
        for (upe a : this.b) {
            a.a(uor);
        }
    }

    public final void b(upf upf) {
        synchronized (this.b) {
        }
        for (upe b : this.b) {
            b.b(this);
        }
    }

    public final void a(Exception exception) {
        synchronized (this.b) {
        }
        for (upe a : this.b) {
            a.a(exception);
        }
    }

    /* synthetic */ upa(byte b) {
    }
}
