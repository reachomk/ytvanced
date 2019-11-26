package defpackage;

import java.util.List;

/* renamed from: affg */
public final class affg implements afev {
    private int[] a;
    private int b;

    public final void a() {
    }

    public final void a(float f) {
    }

    public final void a(aevh aevh) {
    }

    public final void a(afgq afgq) {
    }

    public final void a(afjs afjs) {
    }

    public final void a(boolean z) {
    }

    public final void a(List list, long j, long j2, afex[] afexArr, afeu afeu) {
        afex afex;
        afeu.b = 3;
        int length = afexArr.length;
        int i = 0;
        if (length == 1) {
            afex = afexArr[0];
        } else {
            int length2;
            int[] iArr = this.a;
            if (iArr != null) {
                length2 = iArr.length;
                if (length2 == (length - 1) * length) {
                    i = (this.b + 1) % length2;
                    this.b = i;
                    afex = afexArr[this.a[i]];
                }
            }
            this.a = new int[((length - 1) * length)];
            int i2 = 0;
            length2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                int i4 = length2;
                for (length2 = i3; length2 < length; length2++) {
                    int[] iArr2 = this.a;
                    int i5 = i4 + 1;
                    iArr2[i4] = i2;
                    i4 = i5 + 1;
                    iArr2[i5] = length2;
                }
                i2 = i3;
                length2 = i4;
            }
            this.b = 0;
            afex = afexArr[this.a[i]];
        }
        afeu.c = afex;
        afeu.d = aequ.a;
    }
}
