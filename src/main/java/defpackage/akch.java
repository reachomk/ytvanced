package defpackage;

import java.util.Arrays;

/* renamed from: akch */
public final class akch extends aoca {
    public akck a;
    public byte[] b;

    public akch() {
        this.a = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akch) {
            akch akch = (akch) obj;
            akck akck = this.a;
            if (akck == null) {
                if (akch.a != null) {
                    return false;
                }
            } else if (!akck.equals(akch.a)) {
                return false;
            }
            if (Arrays.equals(this.b, akch.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akch.unknownFieldData);
                }
                aocb aocb2 = akch.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akck akck = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (akck != null ? akck.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
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
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(4, this.b);
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
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(4, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new akck();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                this.b = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
