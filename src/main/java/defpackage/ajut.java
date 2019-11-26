package defpackage;

import java.util.Arrays;

/* renamed from: ajut */
public final class ajut extends aoca {
    public ajrj a;
    public byte[] b;

    public ajut() {
        this.a = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajut) {
            ajut ajut = (ajut) obj;
            ajrj ajrj = this.a;
            if (ajrj == null) {
                if (ajut.a != null) {
                    return false;
                }
            } else if (!ajrj.equals(ajut.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajut.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajut.unknownFieldData);
                }
                aocb aocb2 = ajut.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajrj ajrj = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (ajrj != null ? ajrj.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
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
            aoby.a(4, this.b);
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
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(4, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajrj();
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
