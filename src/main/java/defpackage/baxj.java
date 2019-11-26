package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: baxj */
public final class baxj implements bazz, bbel {
    public final bbel a;
    public final bbem b;
    public final Queue c = new ArrayDeque();
    private final baxu d;

    public baxj(bbel bbel, baxu baxu, bbem bbem) {
        this.a = (bbel) amqw.a((Object) bbel, (Object) "listener");
        this.d = (baxu) amqw.a((Object) baxu, (Object) "transportExecutor");
        bbem.a = this;
        this.b = bbem;
    }

    public final void b(int i) {
        this.b.b = i;
    }

    public final void a(basz basz) {
        this.b.a(basz);
    }

    public final void a(bbcd bbcd) {
        this.b.a(bbcd);
    }

    public final void c(int i) {
        this.a.a(new baxr(this, new baxm(this, i)));
    }

    public final void a(bbff bbff) {
        this.a.a(new baxr(this, new baxl(this, bbff)));
    }

    public final void a() {
        this.a.a(new baxr(this, new baxo(this)));
    }

    public final void close() {
        this.b.c = true;
        this.a.a(new baxr(this, new baxn(this)));
    }

    public final void a(int i) {
        this.d.a(new baxq(this, i));
    }

    public final void a(bbhp bbhp) {
        while (true) {
            InputStream a = bbhp.a();
            if (a != null) {
                this.c.add(a);
            } else {
                return;
            }
        }
    }

    public final void a(boolean z) {
        this.d.a(new baxp(this, z));
    }

    public final void a(Throwable th) {
        this.d.a(new baxs(this, th));
    }
}
