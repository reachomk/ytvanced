package defpackage;

/* renamed from: oqe */
public final class oqe implements oqi {
    public final opm[] a;
    private final int[] b;

    public oqe(int[] iArr, opm[] opmArr) {
        this.b = iArr;
        this.a = opmArr;
    }

    public final ofy a(int i, int i2) {
        i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                StringBuilder stringBuilder = new StringBuilder(36);
                stringBuilder.append("Unmatched track of type: ");
                stringBuilder.append(i2);
                oyp.b("BaseMediaChunkOutput", stringBuilder.toString());
                return new ofn();
            } else if (i2 == iArr[i]) {
                return this.a[i];
            } else {
                i++;
            }
        }
    }

    public final void a(long j) {
        for (opm opm : this.a) {
            if (!(opm == null || opm.c == j)) {
                opm.c = j;
                opm.b = true;
            }
        }
    }
}
