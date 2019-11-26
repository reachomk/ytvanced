package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: trn */
final class trn {
    private final LinkedHashMap a;

    trn() {
        this(new double[]{tqw.FULL.f, tqw.THREE_QUARTER.f, tqw.HALF.f, tqw.QUARTER.f, tqw.NONE.f});
    }

    trn(double[] dArr) {
        this.a = new LinkedHashMap(dArr.length);
        double d = -1.0d;
        int i = 0;
        while (i < dArr.length) {
            double d2 = dArr[i];
            boolean z = true;
            amqw.a(d2 >= 0.0d);
            if (i > 0) {
                if (d2 >= d) {
                    z = false;
                }
                amqw.a(z);
            }
            this.a.put(Double.valueOf(d2), new trk());
            i++;
            d = d2;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(double d, long j) {
        for (Entry entry : this.a.entrySet()) {
            double doubleValue = ((Double) entry.getKey()).doubleValue();
            trk trk = (trk) entry.getValue();
            if (d <= 0.0d || d < doubleValue) {
                trk.a();
            } else {
                trk.a(j);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final long a(int i, double d) {
        return b(d).a(i);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        for (Entry value : this.a.entrySet()) {
            ((trk) value.getValue()).a();
        }
    }

    /* Access modifiers changed, original: final */
    public final Long[] a(int i, boolean z) {
        Long[] lArr = new Long[this.a.size()];
        int i2 = 0;
        for (Entry value : this.a.entrySet()) {
            int i3 = i2 + 1;
            lArr[i2] = Long.valueOf(((trk) value.getValue()).a(i));
            i2 = i3;
        }
        if (!z) {
            i = lArr.length - 1;
            while (i > 0) {
                int i4 = i - 1;
                lArr[i] = Long.valueOf(lArr[i].longValue() - lArr[i4].longValue());
                i = i4;
            }
        }
        return lArr;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        for (Entry value : this.a.entrySet()) {
            ((trk) value.getValue()).d();
        }
    }

    /* Access modifiers changed, original: final */
    public final long a(double d) {
        return b(d).c();
    }

    private final trk b(double d) {
        for (Entry entry : this.a.entrySet()) {
            if (d >= ((Double) entry.getKey()).doubleValue()) {
                return (trk) entry.getValue();
            }
        }
        throw new IllegalArgumentException(String.format("No matching bucket for value %s", new Object[]{Double.valueOf(d)}));
    }
}
