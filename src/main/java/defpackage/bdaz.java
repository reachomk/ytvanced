package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdaz */
public final class bdaz implements bdbi {
    public static final ScheduledExecutorService[] a = new ScheduledExecutorService[0];
    public static final ScheduledExecutorService b;
    public static final bdaz c = new bdaz();
    public static int e;
    public final AtomicReference d = new AtomicReference(a);

    private bdaz() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors >>= 1;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = Executors.newScheduledThreadPool(1, bday.a);
        }
        if (this.d.compareAndSet(a, scheduledExecutorServiceArr)) {
            availableProcessors = scheduledExecutorServiceArr.length;
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!bdbc.b(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    bdbc.a((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        availableProcessors = scheduledExecutorServiceArr.length;
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }

    public final void b() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = (ScheduledExecutorService[]) this.d.get();
            scheduledExecutorServiceArr2 = a;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!this.d.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            bdbc.a(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        b = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }
}
