package defpackage;

import java.util.Arrays;

/* renamed from: ajvi */
public final class ajvi extends aoca {
    public ajun a;
    public byte[] b;
    private ajzw c;

    public ajvi() {
        this.c = null;
        this.a = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvi) {
            ajvi ajvi = (ajvi) obj;
            ajzw ajzw = this.c;
            if (ajzw == null) {
                if (ajvi.c != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajvi.c)) {
                return false;
            }
            ajun ajun = this.a;
            if (ajun == null) {
                if (ajvi.a != null) {
                    return false;
                }
            } else if (!ajun.equals(ajvi.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajvi.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvi.unknownFieldData);
                }
                aocb aocb2 = ajvi.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzw ajzw = this.c;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajun ajun = this.a;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajun != null ? ajun.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(5, this.b);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(5, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.c == null) {
                    this.c = new ajzw();
                }
                aobv.a(this.c);
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new ajun();
                }
                aobv.a(this.a);
            } else if (a == 42) {
                this.b = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
