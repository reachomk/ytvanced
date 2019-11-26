package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: upc */
public final class upc implements Iterable {
    public final TreeMap a = new TreeMap();
    private final ukz b;

    public upc(ukz ukz) {
        this.b = (ukz) uhy.a((Object) ukz);
    }

    public final uor a(uor uor) {
        return (uor) this.a.put(Integer.valueOf(uor.a), uor);
    }

    public final uor a(int i) {
        return (uor) this.a.get(Integer.valueOf(i));
    }

    public final void a() {
        this.a.clear();
    }

    public final uor a(long j, boolean z) {
        int a = this.b.a(j);
        Entry ceilingEntry = this.a.ceilingEntry(Integer.valueOf(a));
        while (z && ceilingEntry != null && ((uor) ceilingEntry.getValue()).e() != 2) {
            ceilingEntry = this.a.higherEntry((Integer) ceilingEntry.getKey());
        }
        Entry floorEntry = this.a.floorEntry(Integer.valueOf(a));
        while (z && floorEntry != null && ((uor) floorEntry.getValue()).e() != 2) {
            floorEntry = this.a.lowerEntry((Integer) floorEntry.getKey());
        }
        if (ceilingEntry != null && floorEntry != null) {
            return (uor) (this.b.b(((Integer) ceilingEntry.getKey()).intValue()) - j > j - this.b.b(((Integer) floorEntry.getKey()).intValue()) ? floorEntry.getValue() : ceilingEntry.getValue());
        } else if (ceilingEntry != null) {
            return (uor) ceilingEntry.getValue();
        } else {
            return floorEntry != null ? (uor) floorEntry.getValue() : null;
        }
    }

    public final Iterator iterator() {
        return this.a.values().iterator();
    }
}
