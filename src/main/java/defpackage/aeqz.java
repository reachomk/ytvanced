package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aeqz */
public final class aeqz {
    public final xhv a;
    public final SharedPreferences b;
    public final xto c = new aerb(this, "recentBandwidthSamples");
    public volatile boolean d = false;
    private final zzl e;
    private final ScheduledExecutorService f;

    public aeqz(xhv xhv, SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService, zzl zzl) {
        this.a = xhv;
        this.b = sharedPreferences;
        this.f = scheduledExecutorService;
        this.e = zzl;
        this.c.a((Executor) scheduledExecutorService);
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, long j2) {
        avwg c = c();
        if (c != null) {
            boolean z = c.b;
            int i = c.c;
            int i2 = c.d;
            if (z && j2 > 0 && j > 0) {
                int i3;
                afii afii = (afii) afij.d.createBuilder();
                afii.copyOnWrite();
                ((afij) afii.instance).c = j;
                afii.copyOnWrite();
                ((afij) afii.instance).a = j2;
                afii.a(0);
                afij afij = (afij) ((anxl) afii.build());
                synchronized (this) {
                    i3 = this.d ^ 1;
                    this.d = true;
                    ArrayDeque arrayDeque = (ArrayDeque) this.c.get();
                    arrayDeque.add(afij);
                    while (arrayDeque.size() > i) {
                        arrayDeque.pop();
                    }
                }
                if (i3 != 0) {
                    try {
                        this.f.schedule(new aerc(this), (long) i2, TimeUnit.MILLISECONDS);
                    } catch (RejectedExecutionException e) {
                        afpc.a(2, afpf.onesie, "Could not schedule the persisting of bandwidth samples.", e);
                        synchronized (this) {
                            this.d = false;
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (b()) {
            int k = this.a.k();
            synchronized (this) {
                Iterator it = ((ArrayDeque) this.c.get()).iterator();
                while (it.hasNext()) {
                    afij afij = (afij) it.next();
                    if (k != 2) {
                        int i = afij.b;
                        if (!(i == 0 || i == k)) {
                        }
                    }
                    arrayList.add(Long.valueOf(afij.a));
                }
            }
        }
        return arrayList;
    }

    private final avwg c() {
        zzl zzl = this.e;
        if (zzl != null) {
            arvt b = zzl.b();
            if (b != null) {
                auuo auuo = b.k;
                if (auuo == null) {
                    auuo = auuo.k;
                }
                avwg avwg = auuo.f;
                if (avwg == null) {
                    avwg = avwg.e;
                }
                return avwg;
            }
        }
        return null;
    }

    public final boolean b() {
        avwg c = c();
        if (c == null) {
            return false;
        }
        return c.b;
    }
}
