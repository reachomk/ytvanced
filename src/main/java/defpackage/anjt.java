package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: anjt */
abstract class anjt extends AtomicReference implements Runnable {
    private static final Runnable a = new anjw();
    private static final Runnable b = new anjw();
    private static final Runnable c = new anjw();

    anjt() {
    }

    public abstract String a();

    public abstract void a(Object obj, Throwable th);

    public abstract Object b();

    public abstract boolean c();

    public final void run() {
        Object b;
        Object obj;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            int c = c() ^ 1;
            if (c != 0) {
                try {
                    b = b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, a)) {
                        Runnable runnable = (Runnable) get();
                        obj = null;
                        int i = 0;
                        while (true) {
                            if (runnable != b && runnable != c) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = c;
                                if (runnable == runnable2 || compareAndSet(b, runnable2)) {
                                    b = (!Thread.interrupted() && obj == null) ? null : 1;
                                    LockSupport.park(this);
                                    obj = b;
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = (Runnable) get();
                        }
                        if (obj != null) {
                            currentThread.interrupt();
                        }
                    }
                    a(null, th);
                    return;
                }
            }
            b = null;
            if (!compareAndSet(currentThread, a)) {
                Runnable runnable3 = (Runnable) get();
                Object obj2 = null;
                int i2 = 0;
                while (true) {
                    if (runnable3 != b && runnable3 != c) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = c;
                        if (runnable3 == runnable4 || compareAndSet(b, runnable4)) {
                            obj = (!Thread.interrupted() && obj2 == null) ? null : 1;
                            LockSupport.park(this);
                            obj2 = obj;
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = (Runnable) get();
                }
                if (obj2 != null) {
                    currentThread.interrupt();
                }
            }
            if (c != 0) {
                a(b, null);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, b)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (((Runnable) getAndSet(a)) == c) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (((Runnable) getAndSet(a)) == c) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    public final String toString() {
        Object obj;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            obj = "running=[DONE]";
        } else if (runnable == b) {
            obj = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 21);
            stringBuilder.append("running=[RUNNING ON ");
            stringBuilder.append(name);
            stringBuilder.append("]");
            obj = stringBuilder.toString();
        } else {
            obj = "running=[NOT STARTED YET]";
        }
        String a = a();
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(obj).length() + 2) + String.valueOf(a).length());
        stringBuilder2.append(obj);
        stringBuilder2.append(", ");
        stringBuilder2.append(a);
        return stringBuilder2.toString();
    }
}
