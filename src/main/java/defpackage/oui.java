package defpackage;

import android.util.Pair;

/* renamed from: oui */
public abstract class oui extends ous {
    public abstract Pair a(ouh ouh, int[][][] iArr, int[] iArr2);

    public final void a(Object obj) {
    }

    public final ouu a(oao[] oaoArr, opz opz, ook ook, oau oau) {
        int i;
        int length = oaoArr.length + 1;
        int[] iArr = new int[length];
        opx[][] opxArr = new opx[length][];
        int[][][] iArr2 = new int[length][][];
        int i2 = 0;
        for (int i3 = 0; i3 < opxArr.length; i3++) {
            i = opz.b;
            opxArr[i3] = new opx[i];
            iArr2[i3] = new int[i][];
        }
        int[] iArr3 = new int[oaoArr.length];
        for (i = 0; i < iArr3.length; i++) {
            iArr3[i] = oaoArr[i].o();
        }
        for (i = 0; i < opz.b; i++) {
            int[] iArr4;
            opx a = opz.a(i);
            int length2 = oaoArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < oaoArr.length) {
                oao oao = oaoArr[i4];
                int i6 = length2;
                length2 = i5;
                for (i5 = 0; i5 < a.a; i5++) {
                    int a2 = oao.a(a.a(i5)) & 7;
                    if (a2 > length2) {
                        if (a2 == 4) {
                            break;
                        }
                        i6 = i4;
                        length2 = a2;
                    }
                }
                i4++;
                i5 = length2;
                length2 = i6;
            }
            i4 = length2;
            if (i4 != oaoArr.length) {
                oao oao2 = oaoArr[i4];
                iArr4 = new int[a.a];
                for (int i7 = 0; i7 < a.a; i7++) {
                    iArr4[i7] = oao2.a(a.a(i7));
                }
            } else {
                iArr4 = new int[a.a];
            }
            i5 = iArr[i4];
            opxArr[i4][i5] = a;
            iArr2[i4][i5] = iArr4;
            iArr[i4] = i5 + 1;
        }
        int length3 = oaoArr.length;
        opz[] opzArr = new opz[length3];
        int[] iArr5 = new int[length3];
        while (true) {
            int length4 = oaoArr.length;
            if (i2 < length4) {
                length4 = iArr[i2];
                opzArr[i2] = new opz((opx[]) ozp.a(opxArr[i2], length4));
                iArr2[i2] = (int[][]) ozp.a(iArr2[i2], length4);
                iArr5[i2] = oaoArr[i2].a();
                i2++;
            } else {
                opz opz2 = new opz((opx[]) ozp.a(opxArr[length4], iArr[length4]));
                ouh ouh = new ouh(iArr5, opzArr);
                Pair a3 = a(ouh, iArr2, iArr3);
                return new ouu((oan[]) a3.first, (oum[]) a3.second, ouh);
            }
        }
    }
}
