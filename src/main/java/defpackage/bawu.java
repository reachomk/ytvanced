package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: bawu */
final class bawu extends bbch {
    public final Object a;
    public final Queue b = new LinkedList();
    public boolean c;
    public boolean d = false;
    public int e;
    public bavx f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ bawq i;

    public bawu(bawq bawq, int i, bbho bbho, Object obj, bbht bbht) {
        this.i = bawq;
        super(i, bbho, bbht);
        this.a = amqw.a(obj, (Object) "lock");
    }

    public final void a(bavx bavx, boolean z, baum baum) {
        amqw.a(this.i.j, (Object) "stream must not be null");
        this.i.j.c();
        b(bavx, z, baum);
    }

    public final void a(Throwable th) {
        a(bavx.a(th), true, new baum());
    }

    public final void a(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    public final void a(int i) {
        amqw.a(this.i.j, (Object) "stream must not be null");
        int i2 = this.e - i;
        this.e = i2;
        if (i2 == 0 && !this.g) {
            this.i.j.a(ByteBuffer.allocateDirect(4096));
        }
    }
}
