package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: cwk */
public class cwk {
    public cwh a;
    private cqw b;

    /* Access modifiers changed, original: protected|final */
    public final void a(cwj cwj, cwh cwh) {
        this.a = cwh;
        this.b = new cqw(cwj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.a = null;
        this.b.a();
        this.b = null;
    }

    protected static void a(int i, BitSet bitSet, String[] strArr) {
        if (bitSet != null) {
            int i2 = 0;
            if (bitSet.nextClearBit(0) < i) {
                ArrayList arrayList = new ArrayList();
                while (i2 < i) {
                    if (!bitSet.get(i2)) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
                String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
                String str = "The following props are not marked as optional and were not supplied: ";
                throw new IllegalStateException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }
}
