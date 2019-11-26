package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdbc */
public class bdbc extends bcue implements bcuo {
    private static final boolean c;
    private static final int d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private static final AtomicReference f = new AtomicReference();
    private static volatile Object g;
    private static final Object h = new Object();
    private volatile boolean a;
    public final ScheduledExecutorService b;

    public static void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (((ScheduledExecutorService) f.get()) == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new bdcg("RxSchedulerPurge-"));
            if (f.compareAndSet(null, newScheduledThreadPool)) {
                bdbf bdbf = new bdbf();
                int i = d;
                newScheduledThreadPool.scheduleAtFixedRate(bdbf, (long) i, (long) i, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static void a(ScheduledExecutorService scheduledExecutorService) {
        e.remove(scheduledExecutorService);
    }

    static void a() {
        try {
            Iterator it = e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    it.remove();
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        } catch (Throwable th) {
            bcva.b(th);
            bdeh.a(th);
        }
    }

    public static boolean b(ScheduledExecutorService scheduledExecutorService) {
        if (c) {
            Method c;
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = g;
                if (obj == h) {
                    return false;
                }
                if (obj == null) {
                    c = bdbc.c(scheduledExecutorService);
                    g = c == null ? h : c;
                } else {
                    c = (Method) obj;
                }
            } else {
                c = bdbc.c(scheduledExecutorService);
            }
            if (c != null) {
                try {
                    c.invoke(scheduledExecutorService, new Object[]{Boolean.valueOf(true)});
                    return true;
                } catch (InvocationTargetException e) {
                    bdeh.a(e);
                } catch (IllegalAccessException e2) {
                    bdeh.a(e2);
                } catch (IllegalArgumentException e22) {
                    bdeh.a(e22);
                }
            }
        }
        return false;
    }

    private static Method c(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public bdbc(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!bdbc.b(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            bdbc.a((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.b = newScheduledThreadPool;
    }

    public final bcuo a(bcvl bcvl) {
        return a(bcvl, 0, null);
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        if (this.a) {
            return bdfz.a;
        }
        return b(bcvl, j, timeUnit);
    }

    public final bdbe b(bcvl bcvl, long j, TimeUnit timeUnit) {
        Future submit;
        bdbe bdbe = new bdbe(bdeh.a(bcvl));
        if (j <= 0) {
            submit = this.b.submit(bdbe);
        } else {
            submit = this.b.schedule(bdbe, j, timeUnit);
        }
        bdbe.a(submit);
        return bdbe;
    }

    public final void b() {
        this.a = true;
        this.b.shutdownNow();
        bdbc.a(this.b);
    }

    public final boolean c() {
        return this.a;
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i = bdce.a;
        boolean z2 = true;
        if (z || (i != 0 && i < 21)) {
            z2 = false;
        }
        c = z2;
    }
}
