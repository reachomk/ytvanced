package defpackage;

/* renamed from: bdgv */
public final class bdgv extends aoca {
    public static final aobz a = aobz.a(bdgv.class, 1507963706);
    public bdgu[] b;

    public bdgv() {
        if (bdgu.a == null) {
            synchronized (aocd.b) {
                if (bdgu.a == null) {
                    bdgu.a = new bdgu[0];
                }
            }
        }
        this.b = bdgu.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgv) {
            bdgv bdgv = (bdgv) obj;
            if (aocd.a(this.b, bdgv.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgv.unknownFieldData);
                }
                aocb aocb2 = bdgv.unknownFieldData;
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
        bdgu[] bdguArr = this.b;
        if (bdguArr != null && bdguArr.length > 0) {
            int i = 0;
            while (true) {
                bdgu[] bdguArr2 = this.b;
                if (i >= bdguArr2.length) {
                    break;
                }
                aocf aocf = bdguArr2[i];
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
        bdgu[] bdguArr = this.b;
        if (bdguArr != null && bdguArr.length > 0) {
            int i = 0;
            while (true) {
                bdgu[] bdguArr2 = this.b;
                if (i >= bdguArr2.length) {
                    break;
                }
                aocf aocf = bdguArr2[i];
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
                aocf bdgu;
                a = aock.a(aobv, 10);
                bdgu[] bdguArr = this.b;
                int length = bdguArr != null ? bdguArr.length : 0;
                bdgu[] bdguArr2 = new bdgu[(a + length)];
                if (length != 0) {
                    System.arraycopy(bdguArr, 0, bdguArr2, 0, length);
                }
                while (length < bdguArr2.length - 1) {
                    bdgu = new bdgu();
                    bdguArr2[length] = bdgu;
                    aobv.a(bdgu);
                    aobv.a();
                    length++;
                }
                bdgu = new bdgu();
                bdguArr2[length] = bdgu;
                aobv.a(bdgu);
                this.b = bdguArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
