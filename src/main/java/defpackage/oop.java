package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: oop */
public final class oop {
    public final int a;
    public final ook b;
    public final CopyOnWriteArrayList c;
    private final long d;

    public oop() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private oop(CopyOnWriteArrayList copyOnWriteArrayList, int i, ook ook) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = ook;
        this.d = 0;
    }

    public final oop a(int i, ook ook) {
        return new oop(this.c, i, ook);
    }

    public final void a() {
        ook ook = (ook) oxz.a(this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new ooo(this, ooz.b, ook));
        }
    }

    public final void b() {
        ook ook = (ook) oxz.a(this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oor(this, ooz.b, ook));
        }
    }

    public final void a(int i, int i2, nzw nzw, int i3, Object obj, long j, long j2) {
        Collections.emptyMap();
        a(new ooy(), new opb(nzw, i3, obj, a(j), a(j2)));
    }

    public final void a(ooy ooy, opb opb) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new ooq(this, ooz.b, ooy, opb));
        }
    }

    public final void b(int i, int i2, nzw nzw, int i3, Object obj, long j, long j2) {
        b(new ooy(), new opb(nzw, i3, obj, a(j), a(j2)));
    }

    public final void b(ooy ooy, opb opb) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oot(this, ooz.b, ooy, opb));
        }
    }

    public final void c(int i, int i2, nzw nzw, int i3, Object obj, long j, long j2) {
        c(new ooy(), new opb(nzw, i3, obj, a(j), a(j2)));
    }

    public final void c(ooy ooy, opb opb) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oos(this, ooz.b, ooy, opb));
        }
    }

    public final void a(int i, int i2, nzw nzw, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        a(new ooy(), new opb(nzw, i3, obj, a(j), a(j2)), iOException, z);
    }

    public final void a(ooy ooy, opb opb, IOException iOException, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oov(this, ooz.b, ooy, opb, iOException, z));
        }
    }

    public final void c() {
        ook ook = (ook) oxz.a(this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oou(this, ooz.b, ook));
        }
    }

    public final void a(opb opb) {
        ook ook = (ook) oxz.a(this.b);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oox(this, ooz.b, ook, opb));
        }
    }

    public final void a(int i, nzw nzw, int i2, Object obj, long j) {
        b(new opb(nzw, i2, obj, a(j), -9223372036854775807L));
    }

    public final void b(opb opb) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ooz ooz = (ooz) it.next();
            oop.a(ooz.a, new oow(this, ooz.b, opb));
        }
    }

    public final long a(long j) {
        j = nyr.a(j);
        return j == -9223372036854775807L ? -9223372036854775807L : j;
    }

    private static void a(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
