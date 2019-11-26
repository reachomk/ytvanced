package defpackage;

import java.util.Arrays;

/* renamed from: ajvg */
public final class ajvg extends aoca {
    public ajtk a;
    public byte[] b;
    private ajwz c;

    public ajvg() {
        this.c = null;
        this.a = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvg) {
            ajvg ajvg = (ajvg) obj;
            ajwz ajwz = this.c;
            if (ajwz == null) {
                if (ajvg.c != null) {
                    return false;
                }
            } else if (!ajwz.equals(ajvg.c)) {
                return false;
            }
            ajtk ajtk = this.a;
            if (ajtk == null) {
                if (ajvg.a != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajvg.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajvg.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvg.unknownFieldData);
                }
                aocb aocb2 = ajvg.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwz ajwz = this.c;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajwz != null ? ajwz.hashCode() : 0;
        ajtk ajtk = this.a;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajtk != null ? ajtk.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.a;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(6, this.b);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(6, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                if (this.c == null) {
                    this.c = new ajwz();
                }
                aobv.a(this.c);
            } else if (a == 34) {
                if (this.a == null) {
                    this.a = new ajtk();
                }
                aobv.a(this.a);
            } else if (a == 50) {
                this.b = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
