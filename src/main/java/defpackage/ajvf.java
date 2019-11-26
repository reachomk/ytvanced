package defpackage;

import java.util.Arrays;

/* renamed from: ajvf */
public final class ajvf extends aoca {
    public ajwz a;
    public ajtk b;
    public byte[] c;

    public ajvf() {
        this.a = null;
        this.b = null;
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvf) {
            ajvf ajvf = (ajvf) obj;
            ajwz ajwz = this.a;
            if (ajwz == null) {
                if (ajvf.a != null) {
                    return false;
                }
            } else if (!ajwz.equals(ajvf.a)) {
                return false;
            }
            ajtk ajtk = this.b;
            if (ajtk == null) {
                if (ajvf.b != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajvf.b)) {
                return false;
            }
            if (Arrays.equals(this.c, ajvf.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvf.unknownFieldData);
                }
                aocb aocb2 = ajvf.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwz ajwz = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajwz != null ? ajwz.hashCode() : 0;
        ajtk ajtk = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajtk != null ? ajtk.hashCode() : 0)) * 31) + Arrays.hashCode(this.c)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(6, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        return !Arrays.equals(this.c, aock.c) ? computeSerializedSize + aoby.b(6, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new ajwz();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                if (this.b == null) {
                    this.b = new ajtk();
                }
                aobv.a(this.b);
            } else if (a == 50) {
                this.c = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
