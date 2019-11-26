package defpackage;

/* renamed from: bdgk */
public final class bdgk extends aoca {
    public static volatile bdgk[] a;
    public bdhc[] b;

    public bdgk() {
        this.b = bdhc.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgk) {
            bdgk bdgk = (bdgk) obj;
            if (aocd.a(this.b, bdgk.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgk.unknownFieldData);
                }
                aocb aocb2 = bdgk.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        bdhc[] bdhcArr = this.b;
        if (bdhcArr != null && bdhcArr.length > 0) {
            int i = 0;
            while (true) {
                bdhc[] bdhcArr2 = this.b;
                if (i >= bdhcArr2.length) {
                    break;
                }
                aocf aocf = bdhcArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        bdhc[] bdhcArr = this.b;
        if (bdhcArr != null && bdhcArr.length > 0) {
            int i = 0;
            while (true) {
                bdhc[] bdhcArr2 = this.b;
                if (i >= bdhcArr2.length) {
                    break;
                }
                aocf aocf = bdhcArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf bdhc;
                a = aock.a(aobv, 10);
                bdhc[] bdhcArr = this.b;
                int length = bdhcArr != null ? bdhcArr.length : 0;
                bdhc[] bdhcArr2 = new bdhc[(a + length)];
                if (length != 0) {
                    System.arraycopy(bdhcArr, 0, bdhcArr2, 0, length);
                }
                while (length < bdhcArr2.length - 1) {
                    bdhc = new bdhc();
                    bdhcArr2[length] = bdhc;
                    aobv.a(bdhc);
                    aobv.a();
                    length++;
                }
                bdhc = new bdhc();
                bdhcArr2[length] = bdhc;
                aobv.a(bdhc);
                this.b = bdhcArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
