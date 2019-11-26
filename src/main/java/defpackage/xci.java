package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: xci */
public final class xci {
    public static final Object a = xci.a();
    private static final xcm[] d = new xcm[]{new xcr(), new xct()};
    private static final xcj e = new xch();
    public final Map b = new HashMap(256);
    public final ReadWriteLock c;
    private final Map f = new xuc(new xcl(this));
    private final Executor g;
    private final xcj h;
    private final xcm[] i;
    private final xsc j;

    public xci(Executor executor, xsc xsc) {
        xsc = (xsc) amqw.a((Object) xsc);
        Object reentrantReadWriteLock = new ReentrantReadWriteLock();
        Object obj = e;
        Object obj2 = d;
        this.g = (Executor) amqw.a((Object) executor);
        this.c = (ReadWriteLock) amqw.a(reentrantReadWriteLock);
        this.j = xsc;
        this.h = (xcj) amqw.a(obj);
        this.i = (xcm[]) amqw.a(obj2);
    }

    public static Object a() {
        return new Object();
    }

    public final void a(Object obj) {
        a(amqw.a(obj, (Object) "target cannot be null"), obj.getClass());
    }

    public final void a(Object obj, Class cls) {
        a(obj, cls, a);
    }

    public final void a(Object obj, Object obj2) {
        a(obj, obj.getClass(), obj2);
    }

    public final void a(Object obj, Class cls, Object obj2) {
        amqw.a(obj, (Object) "target cannot be null");
        amqw.a((Object) cls, (Object) "clazz cannot be null");
        amqw.a(obj2, (Object) "eventId cannot be null. Use DEFAULT_EVENT_ID instead");
        amqw.a(cls.isAssignableFrom(obj.getClass()), (Object) "clazz must be a superclass of target");
        int i = 0;
        for (xcm a : this.i) {
            xcq[] a2 = a.a(obj, cls, obj2);
            if (a2 != null) {
                int length = a2.length;
                if (length > 0) {
                    this.c.writeLock().lock();
                    while (i < length) {
                        try {
                            xcq xcq = a2[i];
                            a(obj, xcq.a, xcq);
                            i++;
                        } catch (Throwable th) {
                            this.c.writeLock().unlock();
                        }
                    }
                    this.c.writeLock().unlock();
                    return;
                }
            }
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
        stringBuilder.append("target ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" could not be registered!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final xcq a(Object obj, Class cls, xcn xcn) {
        Object obj2 = a;
        amqw.a(obj, (Object) "target cannot be null");
        amqw.a((Object) cls, (Object) "eventType cannot be null");
        amqw.a(obj2, (Object) "eventId cannot be null. Use DEFAULT_EVENT_ID instead");
        amqw.a((Object) xcn, (Object) "eventHandler cannot be null");
        obj.getClass();
        xcq xcq = new xcq(obj, cls, obj2, xcn);
        this.c.writeLock().lock();
        try {
            a(obj, cls, xcq);
            return xcq;
        } finally {
            this.c.writeLock().unlock();
        }
    }

    private final void a(Object obj, Class cls, xcq xcq) {
        xsb.a(this.b, (Object) cls, (Object) xcq);
        xsb.a(this.f, obj, (Object) xcq);
    }

    public final void b(Object obj) {
        if (obj != null) {
            this.c.writeLock().lock();
            try {
                if (this.f.containsKey(obj)) {
                    Collection collection = (Set) this.f.remove(obj);
                    if (!(collection == null || collection.isEmpty())) {
                        a(collection);
                    }
                }
                this.c.writeLock().unlock();
            } catch (Throwable th) {
                this.c.writeLock().unlock();
            }
        }
    }

    public final void a(xcq... xcqArr) {
        a(Arrays.asList(xcqArr));
    }

    public final void a(Collection collection) {
        this.c.writeLock().lock();
        try {
            for (xcq xcq : collection) {
                a(xcq);
                Object a = xcq.a();
                if (a != null && xsb.b(this.f, a, xcq)) {
                    xsb.a(this.f, a);
                }
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    public final void a(xcq xcq) {
        Object obj = xcq.a;
        if (xsb.b(this.b, obj, xcq)) {
            xsb.a(this.b, obj);
        }
    }

    public final void c(Object obj) {
        a(a, obj, true);
    }

    public final void d(Object obj) {
        a(a, obj, false);
    }

    public final void a(Object obj, Object obj2, boolean z) {
        obj2.getClass();
        if (this.j != null && (obj2 instanceof xcy)) {
            xcy xcy = (xcy) obj2;
            if (!xcy.b()) {
                xcy.a(this.j.b());
            }
        }
        Runnable a = this.h.a(this, obj, obj2);
        if (Looper.myLooper() == Looper.getMainLooper() && z) {
            a.run();
        } else {
            this.g.execute(a);
        }
    }
}
