package defpackage;

/* renamed from: ajrl */
public final class ajrl extends aoca {
    public int a;
    public asam[] b;
    public int c;

    public ajrl() {
        this.a = 0;
        this.b = new asam[0];
        this.c = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrl) {
            ajrl ajrl = (ajrl) obj;
            if (this.a == ajrl.a && aocd.a(this.b, ajrl.b) && this.c == ajrl.c) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajrl.unknownFieldData);
                }
                aocb aocb2 = ajrl.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.a) * 31) + aocd.a(this.b)) * 31) + this.c) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i = this.a;
        if (i != 0) {
            aoby.b(2, i);
        }
        asam[] asamArr = this.b;
        if (asamArr != null && asamArr.length > 0) {
            i = 0;
            while (true) {
                asam[] asamArr2 = this.b;
                if (i >= asamArr2.length) {
                    break;
                }
                anze anze = asamArr2[i];
                if (anze != null) {
                    aoby.a(3, anze);
                }
                i++;
            }
        }
        i = this.c;
        if (i != 0) {
            aoby.b(5, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.a;
        if (i != 0) {
            computeSerializedSize += aoby.d(2, i);
        }
        asam[] asamArr = this.b;
        if (asamArr != null && asamArr.length > 0) {
            i = 0;
            while (true) {
                asam[] asamArr2 = this.b;
                if (i >= asamArr2.length) {
                    break;
                }
                anze anze = asamArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(3, anze);
                }
                i++;
            }
        }
        i = this.c;
        return i != 0 ? computeSerializedSize + aoby.d(5, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 16) {
                this.a = aobv.f();
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                asam[] asamArr = this.b;
                int length = asamArr != null ? asamArr.length : 0;
                asam[] asamArr2 = new asam[(a + length)];
                if (length != 0) {
                    System.arraycopy(asamArr, 0, asamArr2, 0, length);
                }
                while (length < asamArr2.length - 1) {
                    asamArr2[length] = (asam) aobv.a(asam.f.getParserForType());
                    aobv.a();
                    length++;
                }
                asamArr2[length] = (asam) aobv.a(asam.f.getParserForType());
                this.b = asamArr2;
            } else if (a == 40) {
                this.c = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
