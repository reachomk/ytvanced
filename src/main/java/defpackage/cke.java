package defpackage;

import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: cke */
public final class cke extends bakp {
    private static Map b = new WeakHashMap();
    public List a = Collections.emptyList();

    public cke() {
        super("stts");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.a.size() << 3) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.a.add(new ckd(cio.a(byteBuffer), cio.a(byteBuffer)));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.size());
        for (ckd ckd : this.a) {
            cin.a(byteBuffer, ckd.a);
            cin.a(byteBuffer, ckd.b);
        }
    }

    public final String toString() {
        int size = this.a.size();
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("TimeToSampleBox[entryCount=");
        stringBuilder.append(size);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static synchronized long[] a(List list) {
        synchronized (cke.class) {
            long[] jArr;
            SoftReference softReference = (SoftReference) b.get(list);
            if (softReference != null) {
                jArr = (long[]) softReference.get();
                if (jArr != null) {
                    return jArr;
                }
            }
            long j = 0;
            for (ckd ckd : list) {
                j += ckd.a;
            }
            jArr = new long[((int) j)];
            int i = 0;
            for (ckd ckd2 : list) {
                int i2 = i;
                i = 0;
                while (((long) i) < ckd2.a) {
                    int i3 = i2 + 1;
                    jArr[i2] = ckd2.b;
                    i++;
                    i2 = i3;
                }
                i = i2;
            }
            b.put(list, new SoftReference(jArr));
            return jArr;
        }
    }
}
