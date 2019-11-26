package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: ogf */
final class ogf extends oge {
    public long b = -9223372036854775807L;

    public ogf() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(oza oza) {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(oza oza, long j) {
        if (oza.d() == 2) {
            if ("onMetaData".equals(ogf.c(oza)) && oza.d() == 8) {
                HashMap d = ogf.d(oza);
                String str = "duration";
                if (d.containsKey(str)) {
                    double doubleValue = ((Double) d.get(str)).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.b = (long) (doubleValue * 1000000.0d);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new oae();
    }

    private static Double b(oza oza) {
        return Double.valueOf(Double.longBitsToDouble(oza.m()));
    }

    private static String c(oza oza) {
        int e = oza.e();
        int i = oza.b;
        oza.d(e);
        return new String(oza.a, i, e);
    }

    private static HashMap d(oza oza) {
        int o = oza.o();
        HashMap hashMap = new HashMap(o);
        for (int i = 0; i < o; i++) {
            hashMap.put(ogf.c(oza), ogf.a(oza, oza.d()));
        }
        return hashMap;
    }

    private static Object a(oza oza, int i) {
        if (i == 0) {
            return ogf.b(oza);
        }
        boolean z = false;
        if (i == 1) {
            if (oza.d() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return ogf.c(oza);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String c = ogf.c(oza);
                    int d = oza.d();
                    if (d == 9) {
                        return hashMap;
                    }
                    hashMap.put(c, ogf.a(oza, d));
                }
            } else if (i == 8) {
                return ogf.d(oza);
            } else {
                if (i == 10) {
                    i = oza.o();
                    ArrayList arrayList = new ArrayList(i);
                    int i2;
                    while (i2 < i) {
                        arrayList.add(ogf.a(oza, oza.d()));
                        i2++;
                    }
                    return arrayList;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) ogf.b(oza).doubleValue());
                    oza.d(2);
                    return date;
                }
            }
        }
    }
}
