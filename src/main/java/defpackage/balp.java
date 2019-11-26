package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/* renamed from: balp */
public final class balp extends bakv {
    private final baky d;
    private final int e;
    private final int f;

    public balp(baky baky, long j, long j2) {
        String str = ((bakv) baky).a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 6);
        stringBuilder.append("crop(");
        stringBuilder.append(str);
        stringBuilder.append(")");
        super(stringBuilder.toString());
        this.d = baky;
        this.e = (int) j;
        this.f = (int) j2;
    }

    public final void close() {
        this.d.close();
    }

    public final List h() {
        return this.d.h().subList(this.e, this.f);
    }

    public final cjs j() {
        return this.d.j();
    }

    public final synchronized long[] i() {
        long[] jArr;
        jArr = new long[(this.f - this.e)];
        System.arraycopy(this.d.i(), this.e, jArr, 0, jArr.length);
        return jArr;
    }

    public final List a() {
        List a = this.d.a();
        long j = (long) this.e;
        long j2 = (long) this.f;
        if (a == null || a.isEmpty()) {
            return null;
        }
        ciw ciw;
        long j3;
        ListIterator listIterator = a.listIterator();
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        while (true) {
            ciw = (ciw) listIterator.next();
            j3 = ((long) ciw.a) + j4;
            if (j3 > j) {
                break;
            }
            j4 = j3;
        }
        if (j3 >= j2) {
            arrayList.add(new ciw((int) (j2 - j), ciw.b));
        } else {
            arrayList.add(new ciw((int) (j3 - j), ciw.b));
            int i = ciw.a;
            while (true) {
                j4 += (long) i;
                if (!listIterator.hasNext()) {
                    break;
                }
                ciw = (ciw) listIterator.next();
                if (((long) ciw.a) + j4 >= j2) {
                    break;
                }
                arrayList.add(ciw);
                i = ciw.a;
            }
            arrayList.add(new ciw((int) (j2 - j4), ciw.b));
        }
        return arrayList;
    }

    public final synchronized long[] b() {
        if (this.d.b() == null) {
            return null;
        }
        long[] b = this.d.b();
        int length = b.length;
        int i = 0;
        while (i < b.length && b[i] < ((long) this.e)) {
            i++;
        }
        while (length > 0) {
            int i2 = length - 1;
            if (((long) this.f) >= b[i2]) {
                break;
            }
            length = i2;
        }
        b = Arrays.copyOfRange(this.d.b(), i, length);
        for (int i3 = 0; i3 < b.length; i3++) {
            b[i3] = b[i3] - ((long) this.e);
        }
        return b;
    }

    public final List c() {
        return (this.d.c() == null || this.d.c().isEmpty()) ? null : this.d.c().subList(this.e, this.f);
    }

    public final balb k() {
        return this.d.k();
    }

    public final String l() {
        return this.d.l();
    }

    public final cjx d() {
        return this.d.d();
    }
}
