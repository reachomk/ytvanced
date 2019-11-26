package defpackage;

import java.util.Arrays;

/* renamed from: akbz */
public final class akbz extends ajwo {
    public akbw a;
    private byte[] b;

    public akbz() {
        super(117457335);
        this.a = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbz) {
            akbz akbz = (akbz) obj;
            akbw akbw = this.a;
            if (akbw == null) {
                if (akbz.a != null) {
                    return false;
                }
            } else if (!akbw.equals(akbz.a)) {
                return false;
            }
            if (Arrays.equals(this.b, akbz.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akbz.unknownFieldData);
                }
                aocb aocb2 = akbz.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akbw akbw = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (akbw != null ? akbw.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(3, this.b);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(3, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new akbw();
                }
                aobv.a(this.a);
            } else if (a == 26) {
                this.b = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
