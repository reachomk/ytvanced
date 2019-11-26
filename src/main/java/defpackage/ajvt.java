package defpackage;

/* renamed from: ajvt */
public final class ajvt extends aoca {
    public akbq[] a;
    public ajtk[] b;

    public ajvt() {
        if (akbq.a == null) {
            synchronized (aocd.b) {
                if (akbq.a == null) {
                    akbq.a = new akbq[0];
                }
            }
        }
        this.a = akbq.a;
        if (ajtk.a == null) {
            synchronized (aocd.b) {
                if (ajtk.a == null) {
                    ajtk.a = new ajtk[0];
                }
            }
        }
        this.b = ajtk.a;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvt) {
            ajvt ajvt = (ajvt) obj;
            if (aocd.a(this.a, ajvt.a) && aocd.a(this.b, ajvt.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvt.unknownFieldData);
                }
                aocb aocb2 = ajvt.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.a)) * 31) + aocd.a(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        akbq[] akbqArr = this.a;
        int i = 0;
        if (akbqArr != null && akbqArr.length > 0) {
            int i2 = 0;
            while (true) {
                akbq[] akbqArr2 = this.a;
                if (i2 >= akbqArr2.length) {
                    break;
                }
                aocf aocf = akbqArr2[i2];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i2++;
            }
        }
        ajtk[] ajtkArr = this.b;
        if (ajtkArr != null && ajtkArr.length > 0) {
            while (true) {
                ajtkArr = this.b;
                if (i >= ajtkArr.length) {
                    break;
                }
                aocf aocf2 = ajtkArr[i];
                if (aocf2 != null) {
                    aoby.a(4, aocf2);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        akbq[] akbqArr = this.a;
        int i = 0;
        if (akbqArr != null && akbqArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akbq[] akbqArr2 = this.a;
                if (computeSerializedSize >= akbqArr2.length) {
                    break;
                }
                aocf aocf = akbqArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(3, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        ajtk[] ajtkArr = this.b;
        if (ajtkArr != null && ajtkArr.length > 0) {
            while (true) {
                ajtkArr = this.b;
                if (i >= ajtkArr.length) {
                    break;
                }
                aocf aocf2 = ajtkArr[i];
                if (aocf2 != null) {
                    computeSerializedSize += aoby.b(4, aocf2);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            aocf akbq;
            if (a == 0) {
                break;
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                akbq[] akbqArr = this.a;
                length = akbqArr != null ? akbqArr.length : 0;
                akbq[] akbqArr2 = new akbq[(a + length)];
                if (length != 0) {
                    System.arraycopy(akbqArr, 0, akbqArr2, 0, length);
                }
                while (length < akbqArr2.length - 1) {
                    akbq = new akbq();
                    akbqArr2[length] = akbq;
                    aobv.a(akbq);
                    aobv.a();
                    length++;
                }
                akbq = new akbq();
                akbqArr2[length] = akbq;
                aobv.a(akbq);
                this.a = akbqArr2;
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                ajtk[] ajtkArr = this.b;
                length = ajtkArr != null ? ajtkArr.length : 0;
                ajtk[] ajtkArr2 = new ajtk[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajtkArr, 0, ajtkArr2, 0, length);
                }
                while (length < ajtkArr2.length - 1) {
                    akbq = new ajtk();
                    ajtkArr2[length] = akbq;
                    aobv.a(akbq);
                    aobv.a();
                    length++;
                }
                akbq = new ajtk();
                ajtkArr2[length] = akbq;
                aobv.a(akbq);
                this.b = ajtkArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
