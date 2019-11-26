package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: uod */
final class uod implements uob {
    public final ukz a;
    public final int[] b;
    public long c = -1;
    public long d = -1;
    private final List e = new ArrayList();
    private boolean f = true;
    private Iterator g;

    public uod(int[] iArr, ukz ukz) {
        int length;
        this.b = (int[]) uhy.a((Object) iArr);
        this.a = (ukz) uhy.a((Object) ukz);
        int[] iArr2 = ukz.i;
        int length2 = iArr2 == null ? ukz.h.length : iArr2.length;
        Arrays.sort(iArr);
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            length = iArr.length;
            if (i >= length) {
                break;
            }
            length = iArr[i];
            uhy.a(length, ukz.h.length);
            int d = ukz.d(length);
            if (!(i2 == -1 || i3 == d)) {
                this.e.add(new uoc(this, i2, i - i2, uod.a(i3, length2)));
                i2 = -1;
            }
            if (ukz.a(length)) {
                this.e.add(new uoc(this, i, 1, uod.a(d, length2) + aocf.UNSET_ENUM_VALUE));
            } else if (i2 == -1) {
                i2 = i;
                i3 = d;
            }
            i++;
        }
        if (i2 != -1) {
            this.e.add(new uoc(this, i2, length - i2, uod.a(i3, length2)));
        }
    }

    public final synchronized void a(long j, long j2) {
        if (!(this.c == j && this.d == j2)) {
            this.c = j;
            this.d = j2;
            this.f = true;
        }
    }

    public final boolean hasNext() {
        Iterator it = this.g;
        if (it == null || !it.hasNext()) {
            a();
            while (this.e.size() > 0) {
                List list = this.e;
                it = ((uoc) list.remove(list.size() - 1)).iterator();
                if (it.hasNext()) {
                    break;
                }
            }
            it = null;
            this.g = it;
        }
        it = this.g;
        return it != null && it.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final synchronized void a() {
        if (this.f) {
            Collections.sort(this.e);
            this.f = false;
        }
    }

    private static int a(int i, int i2) {
        int i3 = 0;
        uhy.a(i2 > 0);
        uhy.a(i, i2);
        if (i2 > 1) {
            i2--;
            while (i % i2 != 0) {
                i2 >>= 1;
                i3++;
                if (i2 <= 1) {
                    break;
                }
            }
        }
        return i3;
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            return (Integer) this.g.next();
        }
        throw new NoSuchElementException();
    }
}
