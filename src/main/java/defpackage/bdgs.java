package defpackage;

/* renamed from: bdgs */
public final class bdgs extends aoca {
    public bdgo[] a;

    public bdgs() {
        if (bdgo.a == null) {
            synchronized (aocd.b) {
                if (bdgo.a == null) {
                    bdgo.a = new bdgo[0];
                }
            }
        }
        this.a = bdgo.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgs) {
            bdgs bdgs = (bdgs) obj;
            if (aocd.a(this.a, bdgs.a)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgs.unknownFieldData);
                }
                aocb aocb2 = bdgs.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.a)) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        bdgo[] bdgoArr = this.a;
        if (bdgoArr != null && bdgoArr.length > 0) {
            int i = 0;
            while (true) {
                bdgo[] bdgoArr2 = this.a;
                if (i >= bdgoArr2.length) {
                    break;
                }
                aocf aocf = bdgoArr2[i];
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
        bdgo[] bdgoArr = this.a;
        if (bdgoArr != null && bdgoArr.length > 0) {
            int i = 0;
            while (true) {
                bdgo[] bdgoArr2 = this.a;
                if (i >= bdgoArr2.length) {
                    break;
                }
                aocf aocf = bdgoArr2[i];
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
                aocf bdgo;
                a = aock.a(aobv, 10);
                bdgo[] bdgoArr = this.a;
                int length = bdgoArr != null ? bdgoArr.length : 0;
                bdgo[] bdgoArr2 = new bdgo[(a + length)];
                if (length != 0) {
                    System.arraycopy(bdgoArr, 0, bdgoArr2, 0, length);
                }
                while (length < bdgoArr2.length - 1) {
                    bdgo = new bdgo();
                    bdgoArr2[length] = bdgo;
                    aobv.a(bdgo);
                    aobv.a();
                    length++;
                }
                bdgo = new bdgo();
                bdgoArr2[length] = bdgo;
                aobv.a(bdgo);
                this.a = bdgoArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
