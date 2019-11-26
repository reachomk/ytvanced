package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: rze */
final class rze extends ryi {
    public final Object a = new Object();
    public final rzc b = new rzc();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    rze() {
    }

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d) {
                if (this.f == null) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final Object d() {
        Object obj;
        synchronized (this.a) {
            g();
            i();
            Exception exception = this.f;
            if (exception == null) {
                obj = this.e;
            } else {
                throw new ryj(exception);
            }
        }
        return obj;
    }

    public final Object a(Class cls) {
        Object obj;
        synchronized (this.a) {
            g();
            i();
            if (cls.isInstance(this.f)) {
                throw ((Throwable) cls.cast(this.f));
            }
            Exception exception = this.f;
            if (exception == null) {
                obj = this.e;
            } else {
                throw new ryj(exception);
            }
        }
        return obj;
    }

    public final Exception e() {
        Exception exception;
        synchronized (this.a) {
            exception = this.f;
        }
        return exception;
    }

    public final ryi a(ryg ryg) {
        a(ryk.a, ryg);
        return this;
    }

    public final ryi a(Executor executor, ryg ryg) {
        this.b.a(new rzb(executor, ryg));
        j();
        return this;
    }

    public final ryi a(ryh ryh) {
        a(ryk.a, ryh);
        return this;
    }

    public final ryi a(Executor executor, ryh ryh) {
        this.b.a(new ryz(executor, ryh));
        j();
        return this;
    }

    public final ryi a(rye rye) {
        a(ryk.a, rye);
        return this;
    }

    public final ryi a(Executor executor, rye rye) {
        this.b.a(new ryx(executor, rye));
        j();
        return this;
    }

    public final ryi a(Executor executor, ryc ryc) {
        rze rze = new rze();
        this.b.a(new ryr(executor, ryc, rze));
        j();
        return rze;
    }

    public final ryi a(Executor executor, ryf ryf) {
        this.b.a(new ryv(executor, ryf));
        j();
        return this;
    }

    public final ryi b(Executor executor, ryc ryc) {
        rze rze = new rze();
        this.b.a(new ryt(executor, ryc, rze));
        j();
        return rze;
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = obj;
        }
        this.b.a((ryi) this);
    }

    public final void a(Exception exception) {
        pzr.a((Object) exception, (Object) "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exception;
        }
        this.b.a((ryi) this);
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a((ryi) this);
            return true;
        }
    }

    private final void g() {
        pzr.a(this.c, (Object) "Task is not yet complete");
    }

    private final void h() {
        pzr.a(this.c ^ 1, (Object) "Task is already complete");
    }

    private final void i() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((ryi) this);
                return;
            }
        }
    }
}
