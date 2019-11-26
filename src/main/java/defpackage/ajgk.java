package defpackage;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ajgk */
public final class ajgk {
    public final ScheduledExecutorService a;
    public final aahr b;
    public final TreeMap c;
    public final String d;
    public final ajmv e;
    public final ajid f;
    public final String g;
    public Future h;
    public Integer i;
    public Integer j;
    public int k;
    public boolean l;
    public boolean m;

    public ajgk(String str, ScheduledExecutorService scheduledExecutorService, aahr aahr, String str2, ajmv ajmv, xsd xsd) {
        ajid ajia;
        this.g = str;
        this.b = aahr;
        this.a = scheduledExecutorService;
        this.d = str2;
        this.e = ajmv;
        int b = aahr.b();
        if (b == 386) {
            ajia = new ajia(xsd);
        } else if (b != 387) {
            ajia = null;
        } else {
            ajia = new ajif(xsd);
        }
        this.f = ajia;
        this.c = new TreeMap();
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = false;
    }

    public final synchronized void a() {
        this.m = true;
        this.c.clear();
        Future future = this.h;
        if (!(future == null || future.isDone())) {
            this.h.cancel(true);
        }
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = false;
    }

    public final Integer a(long j) {
        TreeMap treeMap = this.c;
        Long valueOf = Long.valueOf(j);
        Entry floorEntry = treeMap.floorEntry(valueOf);
        Entry ceilingEntry = this.c.ceilingEntry(valueOf);
        if (floorEntry == null && ceilingEntry == null) {
            floorEntry = null;
        } else if ((floorEntry == null && ceilingEntry != null) || ((floorEntry == null || ceilingEntry != null) && j - ((Long) floorEntry.getKey()).longValue() >= ((Long) ceilingEntry.getKey()).longValue() - j)) {
            floorEntry = ceilingEntry;
        }
        if (floorEntry != null) {
            return Integer.valueOf((int) (((float) ((Integer) floorEntry.getValue()).intValue()) + (((float) (j - ((Long) floorEntry.getKey()).longValue())) / ((float) this.j.intValue()))));
        }
        return null;
    }
}
