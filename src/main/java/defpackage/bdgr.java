package defpackage;

/* renamed from: bdgr */
public final class bdgr extends aoca {
    public static final aobz a = aobz.a(bdgr.class, 1507920826);
    public bdgq[] b;
    public int c;

    public bdgr() {
        if (bdgq.a == null) {
            synchronized (aocd.b) {
                if (bdgq.a == null) {
                    bdgq.a = new bdgq[0];
                }
            }
        }
        this.b = bdgq.a;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgr) {
            bdgr bdgr = (bdgr) obj;
            if (aocd.a(this.b, bdgr.b) && this.c == bdgr.c) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgr.unknownFieldData);
                }
                aocb aocb2 = bdgr.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.b)) * 31) + this.c) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        bdgq[] bdgqArr = this.b;
        if (bdgqArr != null && bdgqArr.length > 0) {
            i = 0;
            while (true) {
                bdgq[] bdgqArr2 = this.b;
                if (i >= bdgqArr2.length) {
                    break;
                }
                aocf aocf = bdgqArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        i = this.c;
        if (i != 0) {
            aoby.a(2, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        bdgq[] bdgqArr = this.b;
        if (bdgqArr != null && bdgqArr.length > 0) {
            i = 0;
            while (true) {
                bdgq[] bdgqArr2 = this.b;
                if (i >= bdgqArr2.length) {
                    break;
                }
                aocf aocf = bdgqArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        i = this.c;
        return i != 0 ? computeSerializedSize + aoby.c(2, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf bdgq;
                a = aock.a(aobv, 10);
                bdgq[] bdgqArr = this.b;
                int length = bdgqArr != null ? bdgqArr.length : 0;
                bdgq[] bdgqArr2 = new bdgq[(a + length)];
                if (length != 0) {
                    System.arraycopy(bdgqArr, 0, bdgqArr2, 0, length);
                }
                while (length < bdgqArr2.length - 1) {
                    bdgq = new bdgq();
                    bdgqArr2[length] = bdgq;
                    aobv.a(bdgq);
                    aobv.a();
                    length++;
                }
                bdgq = new bdgq();
                bdgqArr2[length] = bdgq;
                aobv.a(bdgq);
                this.b = bdgqArr2;
            } else if (a == 16) {
                this.c = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
