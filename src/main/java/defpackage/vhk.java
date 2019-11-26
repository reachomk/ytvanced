package defpackage;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vhk */
public final class vhk {
    public final AtomicReference a;
    public volatile boolean b;
    private final ajmq c;
    private final Executor d;
    private final List e;
    private final ExecutorService f;
    private final long g;
    private ajqm[] h;
    private Future i;

    public vhk(ajmq ajmq, Executor executor, List list, long j, long j2) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.c = ajmq;
        this.d = executor;
        this.f = newSingleThreadExecutor;
        this.e = list;
        this.a = new AtomicReference(new vhq(j, j2));
        j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += TimeUnit.SECONDS.toMillis((long) ((vsl) list.get(i)).f());
        }
        this.g = j;
    }

    public final void a(boolean z) {
        xak.a();
        if (this.b != z) {
            this.b = z;
            a((vhq) this.a.get(), z);
        }
    }

    public final synchronized void a(vhq vhq, boolean z) {
        FutureTask futureTask = new FutureTask(new vhn(this, vhq, z), null);
        Future future = this.i;
        if (future != null) {
            future.cancel(false);
        }
        String.valueOf(futureTask).length();
        this.i = this.f.submit(futureTask);
    }

    public final synchronized void b(vhq vhq, boolean z) {
        ajqi g = this.c.g();
        if (g != null) {
            if (this.h == null) {
                this.h = new ajqm[this.e.size()];
                for (int i = 0; i < this.e.size(); i++) {
                    vsl vsl = (vsl) this.e.get(i);
                    String.valueOf(vsl).length();
                    this.h[i] = this.c.g().a(vsn.a(vsl), vsl.j, 1);
                    String.valueOf(this.h[i]).length();
                }
            }
            try {
                int size;
                ajqm ajqm;
                for (ajqm ajqm2 : this.h) {
                    String str = "PACF remove segment: ";
                    String valueOf = String.valueOf(ajqm2.e);
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        str.concat(valueOf);
                    }
                    g.b(ajqm2.e);
                }
                if (z) {
                    g.a(vhq.a, vhq.b, this.h);
                    long j = (vhq.b - vhq.a) - this.g;
                    if (j < 0) {
                        j = -j;
                        size = this.e.size();
                        while (true) {
                            size--;
                            if (j <= 0) {
                                break;
                            } else if (size >= 0) {
                                vsl vsl2 = (vsl) this.e.get(size);
                                long toMillis = TimeUnit.SECONDS.toMillis((long) vsl2.f());
                                if (j < toMillis) {
                                    ajqm2 = this.h[size];
                                    if (ajqm2 != null) {
                                        ajqm2.b(toMillis - j);
                                    }
                                } else {
                                    g.b(vsl2.j);
                                }
                                j -= toMillis;
                            }
                        }
                        this.d.execute(new vho(g));
                        return;
                    }
                    this.d.execute(new vhp(g));
                    return;
                }
                this.d.execute(new vhm(g));
            } catch (Throwable th) {
                this.d.execute(new vhr(g));
            }
        }
    }
}
