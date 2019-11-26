package defpackage;

/* renamed from: baal */
public final class baal extends aoca {
    public baai[] a;

    public baal() {
        if (baai.a == null) {
            synchronized (aocd.b) {
                if (baai.a == null) {
                    baai.a = new baai[0];
                }
            }
        }
        this.a = baai.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baal) {
            baal baal = (baal) obj;
            if (aocd.a(this.a, baal.a)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(baal.unknownFieldData);
                }
                aocb aocb2 = baal.unknownFieldData;
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
        baai[] baaiArr = this.a;
        if (baaiArr != null && baaiArr.length > 0) {
            int i = 0;
            while (true) {
                baai[] baaiArr2 = this.a;
                if (i >= baaiArr2.length) {
                    break;
                }
                aocf aocf = baaiArr2[i];
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
        baai[] baaiArr = this.a;
        if (baaiArr != null && baaiArr.length > 0) {
            int i = 0;
            while (true) {
                baai[] baaiArr2 = this.a;
                if (i >= baaiArr2.length) {
                    break;
                }
                aocf aocf = baaiArr2[i];
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
                aocf baai;
                a = aock.a(aobv, 10);
                baai[] baaiArr = this.a;
                int length = baaiArr != null ? baaiArr.length : 0;
                baai[] baaiArr2 = new baai[(a + length)];
                if (length != 0) {
                    System.arraycopy(baaiArr, 0, baaiArr2, 0, length);
                }
                while (length < baaiArr2.length - 1) {
                    baai = new baai();
                    baaiArr2[length] = baai;
                    aobv.a(baai);
                    aobv.a();
                    length++;
                }
                baai = new baai();
                baaiArr2[length] = baai;
                aobv.a(baai);
                this.a = baaiArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
