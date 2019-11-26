package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aerd */
public final class aerd extends aeqr {
    private final afjr b = new afjr();
    private final awma c;

    public aerd(awma awma) {
        this.c = (awma) amqw.a((Object) awma);
    }

    /* Access modifiers changed, original: protected|final */
    public final int c() {
        return 10;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i) {
        awma awma = this.c;
        return ((awmc) awma.a.get(b(i))).c;
    }

    /* Access modifiers changed, original: protected|final */
    public final float b(float f) {
        return f > 0.0f ? (float) Math.log10((double) (f / 1000.0f)) : -3.4028235E38f;
    }

    /* Access modifiers changed, original: protected|final */
    public final float c(float f) {
        return ((float) Math.pow(10.0d, (double) f)) * 1000.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(int i, List list) {
        Object obj = list;
        int a = a(i);
        if (list.size() != a) {
            ArrayList arrayList = new ArrayList(a);
            Float f = (Float) obj.get(0);
            for (int i2 = 0; i2 < a - list.size(); i2++) {
                arrayList.add(f);
            }
            arrayList.addAll(obj);
            obj = arrayList;
        }
        afjr afjr = this.b;
        Object obj2 = (awmc) this.c.a.get(b(i));
        amqw.a(obj2);
        amqw.a(obj);
        long size = (long) obj2.d.size();
        int i3 = obj2.c;
        int i4 = obj2.b;
        long j = 0;
        for (int i5 = 0; i5 <= i4; i5++) {
            long j2 = (long) i5;
            long j3 = (((long) i3) + j2) - 1;
            long j4 = 1;
            if (j2 <= j3) {
                long j5 = j3;
                j3 = 1;
                long j6 = j3;
                while (j3 <= j2) {
                    j6 = (j6 * j5) / j3;
                    j3++;
                    j5--;
                }
                j4 = j6;
            }
            j += j4;
        }
        boolean z = true;
        amqw.a(size == j);
        if (obj2.c != obj.size()) {
            z = false;
        }
        amqw.a(z);
        afjr.a = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 <= obj2.b; i6++) {
            f2 += afjr.a(obj2, obj, i6, 0);
        }
        return f2;
    }

    private final int b(int i) {
        return Math.min(this.c.a.size() - 1, i);
    }
}
