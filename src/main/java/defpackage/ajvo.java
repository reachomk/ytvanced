package defpackage;

import java.util.Arrays;

/* renamed from: ajvo */
public final class ajvo extends aoca {
    public ajyg a;
    public byte[] b;
    private ajtk c;

    public ajvo() {
        this.a = null;
        this.c = null;
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvo) {
            ajvo ajvo = (ajvo) obj;
            ajyg ajyg = this.a;
            if (ajyg == null) {
                if (ajvo.a != null) {
                    return false;
                }
            } else if (!ajyg.equals(ajvo.a)) {
                return false;
            }
            ajtk ajtk = this.c;
            if (ajtk == null) {
                if (ajvo.c != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajvo.c)) {
                return false;
            }
            if (Arrays.equals(this.b, ajvo.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvo.unknownFieldData);
                }
                aocb aocb2 = ajvo.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajyg ajyg = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajyg != null ? ajyg.hashCode() : 0;
        ajtk ajtk = this.c;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajtk != null ? ajtk.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
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
        aocf = this.c;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(7, this.b);
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
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(7, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajyg();
                }
                aobv.a(this.a);
            } else if (a == 42) {
                if (this.c == null) {
                    this.c = new ajtk();
                }
                aobv.a(this.c);
            } else if (a == 58) {
                this.b = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
