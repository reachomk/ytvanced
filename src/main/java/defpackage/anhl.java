package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: anhl */
public abstract class anhl extends anky implements anjv {
    public static final boolean b = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger c;
    public static final anho d;
    public static final Object e = new Object();
    public volatile anhs listeners;
    public volatile Object value;
    public volatile ania waiters;

    private final void a(ania ania) {
        ania.thread = null;
        while (true) {
            ania = this.waiters;
            if (ania != ania.a) {
                ania ania2 = null;
                while (ania != null) {
                    ania ania3 = ania.next;
                    if (ania.thread != null) {
                        ania2 = ania;
                    } else if (ania2 != null) {
                        ania2.next = ania3;
                        if (ania2.thread != null) {
                        }
                    } else if (d.a(this, ania, ania3)) {
                    }
                    ania = ania3;
                }
                return;
            }
            return;
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: protected */
    public void c() {
    }

    protected anhl() {
    }

    public Object get(long j, TimeUnit timeUnit) {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long toNanos = timeUnit2.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        int i = 1;
        if (((obj != null ? 1 : 0) & ((obj instanceof anhu) ^ 1)) != 0) {
            return anhl.b(obj);
        }
        Object obj2;
        long nanoTime = toNanos > 0 ? System.nanoTime() + toNanos : 0;
        if (toNanos >= 1000) {
            ania ania = this.waiters;
            if (ania != ania.a) {
                ania ania2 = new ania((byte) 0);
                while (true) {
                    ania2.a(ania);
                    if (!d.a(this, ania, ania2)) {
                        ania = this.waiters;
                        if (ania == ania.a) {
                            break;
                        }
                    } else {
                        do {
                            LockSupport.parkNanos(this, toNanos);
                            if (Thread.interrupted()) {
                                a(ania2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & ((obj2 instanceof anhu) ^ 1)) != 0) {
                                return anhl.b(obj2);
                            }
                            toNanos = nanoTime - System.nanoTime();
                        } while (toNanos >= 1000);
                        a(ania2);
                    }
                }
            }
            return anhl.b(this.value);
        }
        while (toNanos > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & ((obj2 instanceof anhu) ^ 1)) != 0) {
                return anhl.b(obj2);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            toNanos = nanoTime - System.nanoTime();
        }
        String anhl = toString();
        String toLowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String toLowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(toLowerCase2).length() + 28);
        stringBuilder.append("Waited ");
        stringBuilder.append(j2);
        String str = " ";
        stringBuilder.append(str);
        stringBuilder.append(toLowerCase2);
        Object stringBuilder2 = stringBuilder.toString();
        if (toNanos + 1000 < 0) {
            stringBuilder2 = String.valueOf(stringBuilder2).concat(" (plus ");
            toNanos = -toNanos;
            nanoTime = timeUnit2.convert(toNanos, TimeUnit.NANOSECONDS);
            toNanos -= timeUnit2.toNanos(nanoTime);
            if (nanoTime != 0 && toNanos <= 1000) {
                i = 0;
            }
            if (nanoTime > 0) {
                String valueOf = String.valueOf(stringBuilder2);
                StringBuilder stringBuilder3 = new StringBuilder((valueOf.length() + 21) + String.valueOf(toLowerCase).length());
                stringBuilder3.append(valueOf);
                stringBuilder3.append(nanoTime);
                stringBuilder3.append(str);
                stringBuilder3.append(toLowerCase);
                stringBuilder2 = stringBuilder3.toString();
                if (i != 0) {
                    stringBuilder2 = String.valueOf(stringBuilder2).concat(",");
                }
                stringBuilder2 = String.valueOf(stringBuilder2).concat(str);
            }
            if (i != 0) {
                str = String.valueOf(stringBuilder2);
                StringBuilder stringBuilder4 = new StringBuilder(str.length() + 33);
                stringBuilder4.append(str);
                stringBuilder4.append(toNanos);
                stringBuilder4.append(" nanoseconds ");
                stringBuilder2 = stringBuilder4.toString();
            }
            stringBuilder2 = String.valueOf(stringBuilder2).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(stringBuilder2).concat(" but future completed as timeout expired"));
        }
        StringBuilder stringBuilder5 = new StringBuilder((String.valueOf(stringBuilder2).length() + 5) + String.valueOf(anhl).length());
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(" for ");
        stringBuilder5.append(anhl);
        throw new TimeoutException(stringBuilder5.toString());
    }

    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & ((obj instanceof anhu) ^ 1)) != 0) {
            return anhl.b(obj);
        }
        ania ania = this.waiters;
        if (ania != ania.a) {
            ania ania2 = new ania((byte) 0);
            while (true) {
                ania2.a(ania);
                if (!d.a(this, ania, ania2)) {
                    ania = this.waiters;
                    if (ania == ania.a) {
                        break;
                    }
                } else {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            a(ania2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (((obj != null ? 1 : 0) & ((obj instanceof anhu) ^ 1)) == 0);
                    return anhl.b(obj);
                }
            }
        }
        return anhl.b(this.value);
    }

    private static Object b(Object obj) {
        if (obj instanceof anhn) {
            Throwable th = ((anhn) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (!(obj instanceof anhq)) {
            return obj == e ? null : obj;
        } else {
            throw new ExecutionException(((anhq) obj).b);
        }
    }

    public boolean isDone() {
        Object obj = this.value;
        return ((obj instanceof anhu) ^ 1) & (obj != null ? 1 : 0);
    }

    public boolean isCancelled() {
        return this.value instanceof anhn;
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof anhu)) == 0) {
            return false;
        }
        Object anhn = b ? new anhn(z, new CancellationException("Future.cancel() was called.")) : !z ? anhn.b : anhn.a;
        boolean z2 = false;
        Object obj2 = obj;
        anhl anhl = this;
        while (true) {
            if (d.a(anhl, obj2, anhn)) {
                if (z) {
                    anhl.c();
                }
                anhl.a(anhl);
                if (!(obj2 instanceof anhu)) {
                    return true;
                }
                anjv anjv = ((anhu) obj2).b;
                if (anjv instanceof anhw) {
                    anhl = (anhl) anjv;
                    obj2 = anhl.value;
                    if (((obj2 == null ? 1 : 0) | (obj2 instanceof anhu)) == 0) {
                        return true;
                    }
                    z2 = true;
                } else {
                    anjv.cancel(z);
                    return true;
                }
            }
            obj2 = anhl.value;
            if (!(obj2 instanceof anhu)) {
                return z2;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        Object obj = this.value;
        return (obj instanceof anhn) && ((anhn) obj).c;
    }

    public void a(Runnable runnable, Executor executor) {
        amqw.a((Object) runnable, (Object) "Runnable was null.");
        amqw.a((Object) executor, (Object) "Executor was null.");
        if (!isDone()) {
            anhs anhs = this.listeners;
            if (anhs != anhs.a) {
                anhs anhs2 = new anhs(runnable, executor);
                while (true) {
                    anhs2.next = anhs;
                    if (!d.a(this, anhs, anhs2)) {
                        anhs = this.listeners;
                        if (anhs == anhs.a) {
                            break;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        anhl.b(runnable, executor);
    }

    public boolean a_(Object obj) {
        if (obj == null) {
            obj = e;
        }
        if (!d.a(this, null, obj)) {
            return false;
        }
        anhl.a(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(Throwable th) {
        if (!d.a(this, null, new anhq((Throwable) amqw.a((Object) th)))) {
            return false;
        }
        anhl.a(this);
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(anjv anjv) {
        Object anhq;
        amqw.a((Object) anjv);
        Object obj = this.value;
        if (obj == null) {
            if (anjv.isDone()) {
                if (!d.a(this, null, anhl.b(anjv))) {
                    return false;
                }
                anhl.a(this);
                return true;
            }
            obj = new anhu(this, anjv);
            if (d.a(this, null, obj)) {
                try {
                    anjv.a(obj, aniv.a);
                } catch (Throwable unused) {
                    anhq = anhq.a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof anhn) {
            anjv.cancel(((anhn) obj).c);
        }
        return false;
        d.a(this, obj, anhq);
        return true;
    }

    public static Object b(anjv anjv) {
        String valueOf;
        String str = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
        Throwable th;
        if (anjv instanceof anhw) {
            Object obj = ((anhl) anjv).value;
            if (obj instanceof anhn) {
                anhn anhn = (anhn) obj;
                if (anhn.c) {
                    th = anhn.d;
                    obj = th != null ? new anhn(false, th) : anhn.b;
                }
            }
            return obj;
        }
        if (anjv instanceof anky) {
            Throwable e = ((anky) anjv).e();
            if (e != null) {
                return new anhq(e);
            }
        }
        boolean isCancelled = anjv.isCancelled();
        if (((b ^ 1) & isCancelled) != 0) {
            return anhn.b;
        }
        try {
            Object b = anhl.b((Future) anjv);
            if (isCancelled) {
                String valueOf2 = String.valueOf(anjv);
                StringBuilder stringBuilder = new StringBuilder(valueOf2.length() + 84);
                stringBuilder.append(str);
                stringBuilder.append(valueOf2);
                return new anhn(false, new IllegalArgumentException(stringBuilder.toString()));
            }
            if (b == null) {
                b = e;
            }
            return b;
        } catch (ExecutionException e2) {
            if (!isCancelled) {
                return new anhq(e2.getCause());
            }
            valueOf = String.valueOf(anjv);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 84);
            stringBuilder2.append(str);
            stringBuilder2.append(valueOf);
            return new anhn(false, new IllegalArgumentException(stringBuilder2.toString(), e2));
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new anhn(false, e3);
            }
            valueOf = String.valueOf(anjv);
            StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 77);
            stringBuilder3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            stringBuilder3.append(valueOf);
            return new anhq(new IllegalArgumentException(stringBuilder3.toString(), e3));
        } catch (Throwable th2) {
            return new anhq(th2);
        }
    }

    private static Object b(Future future) {
        Object obj = null;
        while (true) {
            try {
                future = future.get();
                break;
            } catch (InterruptedException unused) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj != null) {
            Thread.currentThread().interrupt();
        }
        return future;
    }

    public static void a(anhl anhl) {
        anhs anhs = null;
        while (true) {
            ania ania = anhl.waiters;
            if (d.a(anhl, ania, ania.a)) {
                anhs anhs2;
                anhs anhs3;
                while (ania != null) {
                    Thread thread = ania.thread;
                    if (thread != null) {
                        ania.thread = null;
                        LockSupport.unpark(thread);
                    }
                    ania = ania.next;
                }
                anhl.b();
                do {
                    anhs2 = anhl.listeners;
                } while (!d.a(anhl, anhs2, anhs.a));
                while (true) {
                    anhs3 = anhs;
                    anhs = anhs2;
                    if (anhs == null) {
                        break;
                    }
                    anhs2 = anhs.next;
                    anhs.next = anhs3;
                }
                while (anhs3 != null) {
                    anhs = anhs3.next;
                    Runnable runnable = anhs3.b;
                    if (runnable instanceof anhu) {
                        Object obj = (anhu) runnable;
                        anhl = obj.a;
                        if (anhl.value == obj) {
                            if (d.a(anhl, obj, anhl.b(obj.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        anhl.b(runnable, anhs3.c);
                    }
                    anhs3 = anhs;
                }
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Throwable e() {
        if (this instanceof anhw) {
            Object obj = this.value;
            if (obj instanceof anhq) {
                return ((anhq) obj).b;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a(Future future) {
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(d());
        }
    }

    public final String toString() {
        String ax_;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        String str = "]";
        if (isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (isDone()) {
            a(stringBuilder);
        } else {
            try {
                ax_ = ax_();
            } catch (RuntimeException e) {
                ax_ = String.valueOf(e.getClass());
                StringBuilder stringBuilder2 = new StringBuilder(ax_.length() + 38);
                stringBuilder2.append("Exception thrown from implementation: ");
                stringBuilder2.append(ax_);
                ax_ = stringBuilder2.toString();
            }
            if (ax_ != null && !ax_.isEmpty()) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append(ax_);
                stringBuilder.append(str);
            } else if (isDone()) {
                a(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected */
    public String ax_() {
        Object obj = this.value;
        StringBuilder stringBuilder;
        if (obj instanceof anhu) {
            String c = c(((anhu) obj).b);
            stringBuilder = new StringBuilder(String.valueOf(c).length() + 12);
            stringBuilder.append("setFuture=[");
            stringBuilder.append(c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            stringBuilder = new StringBuilder(41);
            stringBuilder.append("remaining delay=[");
            stringBuilder.append(delay);
            stringBuilder.append(" ms]");
            return stringBuilder.toString();
        }
    }

    private final void a(StringBuilder stringBuilder) {
        String str = "]";
        try {
            Object b = anhl.b((Future) this);
            stringBuilder.append("SUCCESS, result=[");
            stringBuilder.append(c(b));
            stringBuilder.append(str);
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[");
            stringBuilder.append(e.getCause());
            stringBuilder.append(str);
        } catch (CancellationException unused) {
            stringBuilder.append("CANCELLED");
        } catch (RuntimeException e2) {
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(e2.getClass());
            stringBuilder.append(" thrown from get()]");
        }
    }

    private final String c(Object obj) {
        return obj != this ? String.valueOf(obj) : "this future";
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 57) + valueOf2.length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", stringBuilder.toString(), e);
        }
    }

    static {
        Throwable th;
        Throwable th2;
        anho anhy;
        Class cls = anhl.class;
        c = Logger.getLogger(cls.getName());
        try {
            th = null;
            th2 = th;
            anhy = new anhy();
        } catch (Throwable th3) {
            Throwable th4 = th3;
            anhy = new anht();
            th = th4;
            th2 = th;
        }
        d = anhy;
        if (th != null) {
            c.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
