package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcnx */
final class bcnx extends bcku {
    public final AtomicReference a = new AtomicReference(Integer.valueOf(3));
    public final HttpURLConnection b;
    public WritableByteChannel c;
    public OutputStream d;
    public final bcou e;
    public ByteBuffer f;
    public long g;
    public long h;
    public final /* synthetic */ bcmw i;
    private final Executor j;
    private final Executor k;
    private final AtomicBoolean l = new AtomicBoolean(false);

    bcnx(bcmw bcmw, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, bcou bcou) {
        this.i = bcmw;
        this.j = new bcoa(this, executor);
        this.k = executor2;
        this.b = httpURLConnection;
        this.e = bcou;
    }

    public final void a(boolean z) {
        if (this.a.compareAndSet(Integer.valueOf(0), Integer.valueOf(2))) {
            this.k.execute(this.i.a(new bcnz(this, z)));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not expecting a read result, expecting: ");
        stringBuilder.append(this.a.get());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a() {
        if (this.a.compareAndSet(Integer.valueOf(1), Integer.valueOf(2))) {
            b();
            return;
        }
        throw new IllegalStateException("Not expecting a read result");
    }

    public final void a(Exception exception) {
        this.i.a((Throwable) exception);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.k.execute(this.i.a(new bcob(this)));
    }

    public final void a(bcnw bcnw) {
        try {
            this.j.execute(this.i.b(bcnw));
        } catch (RejectedExecutionException e) {
            this.i.a(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (this.c != null && this.l.compareAndSet(false, true)) {
            this.c.close();
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        c();
        this.i.d();
    }
}
