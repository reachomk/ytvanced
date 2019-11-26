package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: bdh */
final class bdh {
    private static final Comparator f = new bdk();
    public final int[] a;
    public final int[] b;
    public final List c;
    private final bdq[] d;
    private final float[] e = new float[3];

    bdh(int[] iArr, int i, bdq[] bdqArr) {
        int i2;
        int i3;
        int i4;
        this.d = bdqArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        int i5 = 0;
        for (i2 = 0; i2 < iArr.length; i2++) {
            i3 = iArr[i2];
            i3 = bdh.b(Color.blue(i3), 8, 5) | ((bdh.b(Color.red(i3), 8, 5) << 10) | (bdh.b(Color.green(i3), 8, 5) << 5));
            iArr[i2] = i3;
            iArr2[i3] = iArr2[i3] + 1;
        }
        i2 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                sc.a(bdh.d(i6), this.e);
                if (a(this.e)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i2++;
            }
        }
        iArr = new int[i2];
        this.a = iArr;
        int i7 = 0;
        for (i3 = 0; i3 < 32768; i3++) {
            if (iArr2[i3] > 0) {
                i4 = i7 + 1;
                iArr[i7] = i3;
                i7 = i4;
            }
        }
        if (i2 <= i) {
            this.c = new ArrayList();
            i = iArr.length;
            while (i5 < i) {
                int i8 = iArr[i5];
                this.c.add(new bds(bdh.d(i8), iArr2[i8]));
                i5++;
            }
            return;
        }
        bdj bdj;
        int i9;
        int i10;
        PriorityQueue<bdj> priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new bdj(this, 0, this.a.length - 1));
        while (priorityQueue.size() < i) {
            bdj = (bdj) priorityQueue.poll();
            if (bdj == null || !bdj.b()) {
                break;
            } else if (bdj.b()) {
                int i11 = bdj.e - bdj.d;
                i3 = bdj.g - bdj.f;
                i7 = bdj.i - bdj.h;
                i11 = (i11 < i3 || i11 < i7) ? (i3 < i11 || i3 < i7) ? -1 : -2 : -3;
                bdh bdh = bdj.j;
                int[] iArr3 = bdh.a;
                int[] iArr4 = bdh.b;
                bdh.a(iArr3, i11, bdj.a, bdj.b);
                Arrays.sort(iArr3, bdj.a, bdj.b + 1);
                bdh.a(iArr3, i11, bdj.a, bdj.b);
                i11 = bdj.c / 2;
                i4 = bdj.a;
                i9 = 0;
                while (true) {
                    i10 = bdj.b;
                    if (i4 > i10) {
                        i11 = bdj.a;
                        break;
                    }
                    i9 += iArr4[iArr3[i4]];
                    if (i9 >= i11) {
                        i11 = Math.min(i10 - 1, i4);
                        break;
                    }
                    i4++;
                }
                bdj bdj2 = new bdj(bdj.j, i11 + 1, bdj.b);
                bdj.b = i11;
                bdj.c();
                priorityQueue.offer(bdj2);
                priorityQueue.offer(bdj);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (bdj bdj3 : priorityQueue) {
            bdh bdh2 = bdj3.j;
            int[] iArr5 = bdh2.a;
            iArr2 = bdh2.b;
            i7 = 0;
            i4 = 0;
            i9 = 0;
            i10 = 0;
            for (i3 = bdj3.a; i3 <= bdj3.b; i3++) {
                int i12 = iArr5[i3];
                int i13 = iArr2[i12];
                i7 += i13;
                i4 += bdh.a(i12) * i13;
                i9 += bdh.b(i12) * i13;
                i10 += i13 * bdh.c(i12);
            }
            float f = (float) i7;
            bds bds = new bds(bdh.a(Math.round(((float) i4) / f), Math.round(((float) i9) / f), Math.round(((float) i10) / f)), i7);
            if (!a(bds.a())) {
                arrayList.add(bds);
            }
        }
        this.c = arrayList;
    }

    static int a(int i) {
        return (i >> 10) & 31;
    }

    static int b(int i) {
        return (i >> 5) & 31;
    }

    private static int b(int i, int i2, int i3) {
        return (i3 <= i2 ? i >> (i2 - i3) : i << (i3 - i2)) & ((1 << i3) - 1);
    }

    static int c(int i) {
        return i & 31;
    }

    private static void a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                i = iArr[i2];
                iArr[i2] = bdh.c(i) | ((bdh.b(i) << 10) | (bdh.a(i) << 5));
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                i = iArr[i2];
                iArr[i2] = bdh.a(i) | ((bdh.c(i) << 10) | (bdh.b(i) << 5));
                i2++;
            }
        }
    }

    private final boolean a(float[] fArr) {
        bdq[] bdqArr = this.d;
        if (bdqArr != null) {
            int length = bdqArr.length;
            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    if (!this.d[i].a(fArr)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int a(int i, int i2, int i3) {
        return Color.rgb(bdh.b(i, 5, 8), bdh.b(i2, 5, 8), bdh.b(i3, 5, 8));
    }

    private static int d(int i) {
        return bdh.a(bdh.a(i), bdh.b(i), bdh.c(i));
    }
}
