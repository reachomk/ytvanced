package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: ani */
public final class ani implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    private static Comparator f = new anh();
    public final ArrayList b = new ArrayList();
    public long c;
    private long d;
    private final ArrayList e = new ArrayList();

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.q && this.d == 0) {
            this.d = RecyclerView.r();
            recyclerView.post(this);
        }
        ank ank = recyclerView.K;
        ank.a = i;
        ank.b = i2;
    }

    private static aqj a(RecyclerView recyclerView, int i, long j) {
        int b = recyclerView.g.b();
        for (int i2 = 0; i2 < b; i2++) {
            aqj d = RecyclerView.d(recyclerView.g.c(i2));
            if (d.c == i && !d.j()) {
                return null;
            }
        }
        apw apw = recyclerView.e;
        try {
            recyclerView.l();
            aqj a = apw.a(i, j);
            if (a != null) {
                if (!a.l() || a.j()) {
                    apw.a(a, false);
                } else {
                    apw.a(a.a);
                }
            }
            recyclerView.b(false);
            return a;
        } catch (Throwable th) {
            recyclerView.b(false);
        }
    }

    public final void run() {
        Throwable th;
        long j = 0;
        try {
            if (this.b.isEmpty()) {
                this.d = 0;
                return;
            }
            int size = this.b.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) this.b.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 != 0) {
                int i2;
                long toNanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.c;
                size = this.b.size();
                int i3 = 0;
                for (i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView2 = (RecyclerView) this.b.get(i2);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        recyclerView2.K.a(recyclerView2, false);
                        i3 += recyclerView2.K.d;
                    }
                }
                this.e.ensureCapacity(i3);
                i3 = 0;
                for (i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.b.get(i2);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        ank ank = recyclerView3.K;
                        int abs = Math.abs(ank.a) + Math.abs(ank.b);
                        int i4 = i3;
                        i3 = 0;
                        while (true) {
                            int i5 = ank.d;
                            if (i3 >= i5 + i5) {
                                break;
                            }
                            anj anj;
                            if (i4 >= this.e.size()) {
                                anj = new anj();
                                this.e.add(anj);
                            } else {
                                anj = (anj) this.e.get(i4);
                            }
                            int[] iArr = ank.c;
                            try {
                                int i6 = iArr[i3 + 1];
                                anj.a = i6 <= abs;
                                anj.b = abs;
                                anj.c = i6;
                                anj.d = recyclerView3;
                                anj.e = iArr[i3];
                                i4++;
                                i3 += 2;
                            } catch (Throwable th2) {
                                th = th2;
                                j = 0;
                                this.d = j;
                                throw th;
                            }
                        }
                        i3 = i4;
                    }
                }
                Collections.sort(this.e, f);
                for (size = 0; size < this.e.size(); size++) {
                    anj anj2 = (anj) this.e.get(size);
                    RecyclerView recyclerView4 = anj2.d;
                    if (recyclerView4 == null) {
                        break;
                    }
                    aqj a = ani.a(recyclerView4, anj2.e, !anj2.a ? toNanos : Long.MAX_VALUE);
                    if (a != null && a.b != null && a.l() && !a.j()) {
                        recyclerView4 = (RecyclerView) a.b.get();
                        if (recyclerView4 != null) {
                            if (recyclerView4.x && recyclerView4.g.b() != 0) {
                                recyclerView4.b();
                            }
                            ank ank2 = recyclerView4.K;
                            ank2.a(recyclerView4, true);
                            if (ank2.d != 0) {
                                aqh aqh = recyclerView4.L;
                                apa apa = recyclerView4.m;
                                aqh.d = 1;
                                aqh.e = apa.a();
                                aqh.g = false;
                                aqh.h = false;
                                aqh.i = false;
                                i3 = 0;
                                while (true) {
                                    int i7 = ank2.d;
                                    if (i3 >= i7 + i7) {
                                        break;
                                    }
                                    ani.a(recyclerView4, ank2.c[i3], toNanos);
                                    i3 += 2;
                                }
                            }
                        }
                    }
                    anj2.a = false;
                    anj2.b = 0;
                    anj2.c = 0;
                    anj2.d = null;
                    anj2.e = 0;
                }
                this.d = 0;
                return;
            }
            this.d = 0;
        } catch (Throwable th3) {
            th = th3;
            this.d = j;
            throw th;
        }
    }
}
