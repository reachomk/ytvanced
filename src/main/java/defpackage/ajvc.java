package defpackage;

import java.util.Arrays;

/* renamed from: ajvc */
public final class ajvc extends aoca {
    public ajvb a;
    private byte[] b;

    public ajvc() {
        this.a = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvc) {
            ajvc ajvc = (ajvc) obj;
            ajvb ajvb = this.a;
            if (ajvb == null) {
                if (ajvc.a != null) {
                    return false;
                }
            } else if (!ajvb.equals(ajvc.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajvc.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvc.unknownFieldData);
                }
                aocb aocb2 = ajvc.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajvb ajvb = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (ajvb != null ? ajvb.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(5, this.b);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(5, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajvb();
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
