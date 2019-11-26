package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: otr */
final class otr implements ork {
    private final List a;
    private final int b;
    private final long[] c;
    private final long[] d;

    public otr(List list) {
        this.a = list;
        int size = list.size();
        this.b = size;
        this.c = new long[(size + size)];
        for (size = 0; size < this.b; size++) {
            otj otj = (otj) list.get(size);
            int i = size + size;
            long[] jArr = this.c;
            jArr[i] = otj.e;
            jArr[i + 1] = otj.f;
        }
        long[] jArr2 = this.c;
        this.d = Arrays.copyOf(jArr2, jArr2.length);
        Arrays.sort(this.d);
    }

    public final int a(long j) {
        int a = ozp.a(this.d, j, false, false);
        return a >= this.d.length ? -1 : a;
    }

    public final int a() {
        return this.d.length;
    }

    public final long a(int i) {
        boolean z = true;
        oxz.a(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        oxz.a(z);
        return this.d[i];
    }

    public final List b(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        otj otj = null;
        ArrayList arrayList = otj;
        for (int i = 0; i < this.b; i++) {
            long[] jArr = this.c;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                otj otj2 = (otj) this.a.get(i);
                if (otj2.b != Float.MIN_VALUE || otj2.c != Float.MIN_VALUE) {
                    arrayList.add(otj2);
                } else if (otj != null) {
                    String str = "\n";
                    if (spannableStringBuilder != null) {
                        spannableStringBuilder.append(str).append(otj2.a);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(otj.a).append(str).append(otj2.a);
                    }
                } else {
                    otj = otj2;
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new otj(spannableStringBuilder));
        } else if (otj != null) {
            arrayList.add(otj);
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }
}
