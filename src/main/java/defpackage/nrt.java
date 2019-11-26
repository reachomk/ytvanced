package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: nrt */
final class nrt extends nrw {
    public nrt() {
        super(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(nwz nwz) {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(nwz nwz, long j) {
        if (nwz.d() == 2) {
            if (!"onMetaData".equals(nrt.c(nwz))) {
                return;
            }
            if (nwz.d() == 8) {
                HashMap d = nrt.d(nwz);
                String str = "duration";
                if (d.containsKey(str)) {
                    double doubleValue = ((Double) d.get(str)).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.b = (long) (doubleValue * 1000000.0d);
                    }
                }
                return;
            }
            throw new nnc();
        }
        throw new nnc();
    }

    private static Double b(nwz nwz) {
        return Double.valueOf(Double.longBitsToDouble(nwz.l()));
    }

    private static String c(nwz nwz) {
        int e = nwz.e();
        int i = nwz.b;
        nwz.d(e);
        return new String(nwz.a, i, e);
    }

    private static HashMap d(nwz nwz) {
        int n = nwz.n();
        HashMap hashMap = new HashMap(n);
        for (int i = 0; i < n; i++) {
            hashMap.put(nrt.c(nwz), nrt.a(nwz, nwz.d()));
        }
        return hashMap;
    }

    private static Object a(nwz nwz, int i) {
        if (i == 0) {
            return nrt.b(nwz);
        }
        boolean z = false;
        if (i == 1) {
            if (nwz.d() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return nrt.c(nwz);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String c = nrt.c(nwz);
                    int d = nwz.d();
                    if (d == 9) {
                        return hashMap;
                    }
                    hashMap.put(c, nrt.a(nwz, d));
                }
            } else if (i == 8) {
                return nrt.d(nwz);
            } else {
                if (i == 10) {
                    i = nwz.n();
                    ArrayList arrayList = new ArrayList(i);
                    int i2;
                    while (i2 < i) {
                        arrayList.add(nrt.a(nwz, nwz.d()));
                        i2++;
                    }
                    return arrayList;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) nrt.b(nwz).doubleValue());
                    nwz.d(2);
                    return date;
                }
            }
        }
    }
}
