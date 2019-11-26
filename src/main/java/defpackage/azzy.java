package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: azzy */
final class azzy extends bcks {
    public baab a;
    public final azyl b;
    public final long c;
    public int d = 0;
    public int e = 0;
    private final ExecutorService f;
    private final AtomicLong g;
    private final anhi h;
    private final byte[] i;
    private final boolean j;
    private int k = 0;
    private long l;

    azzy(ExecutorService executorService, azyl azyl) {
        anhh anhh = new anhh();
        boolean z = false;
        this.f = executorService;
        long j = 0;
        this.g = new AtomicLong(0);
        this.b = (azyl) amqw.a((Object) azyl);
        this.h = anhh;
        this.i = new byte[65536];
        this.l = anhh.a().a;
        if (azyl.a() == -1) {
            z = true;
        }
        this.j = z;
        if (!z) {
            j = azyl.a() - azyl.d();
        }
        this.c = j;
    }

    public final long a() {
        return !this.j ? Math.min(this.b.a() - this.b.d(), (this.b.c() + this.b.e()) - this.b.d()) : -1;
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        boolean z = false;
        int a = this.b.a(this.i, 0, Math.min(65536, byteBuffer.capacity()));
        if (a > 0) {
            byteBuffer.put(this.i, 0, a);
            int i = this.k + a;
            this.k = i;
            if (i >= this.d) {
                if (this.e > 0) {
                    long j = this.h.a().a;
                    if (j - this.l >= ((long) this.e)) {
                        this.l = j;
                    }
                }
                this.g.getAndAdd((long) this.k);
                baab baab = this.a;
                if (baab != null) {
                    this.f.execute(baab);
                }
                this.k = 0;
            }
        }
        if (this.j && !this.b.g()) {
            z = true;
        }
        bcku.a(z);
    }

    public final void a(bcku bcku) {
        this.b.f();
        bcku.a();
    }
}
