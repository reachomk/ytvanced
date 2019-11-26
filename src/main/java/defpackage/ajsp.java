package defpackage;

import java.util.Arrays;

/* renamed from: ajsp */
public final class ajsp extends aoca {
    private asfx a;
    private ajtk b;
    private byte[] c;

    public ajsp() {
        this.b = null;
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsp) {
            ajsp ajsp = (ajsp) obj;
            asfx asfx = this.a;
            if (asfx == null) {
                if (ajsp.a != null) {
                    return false;
                }
            } else if (!asfx.equals(ajsp.a)) {
                return false;
            }
            ajtk ajtk = this.b;
            if (ajtk == null) {
                if (ajsp.b != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajsp.b)) {
                return false;
            }
            if (Arrays.equals(this.c, ajsp.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajsp.unknownFieldData);
                }
                aocb aocb2 = ajsp.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        asfx asfx = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = asfx != null ? asfx.hashCode() : 0;
        ajtk ajtk = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajtk != null ? ajtk.hashCode() : 0)) * 31) + Arrays.hashCode(this.c)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(5, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        return !Arrays.equals(this.c, aock.c) ? computeSerializedSize + aoby.b(5, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                asfx asfx = (asfx) aobv.a(asfx.a.getParserForType());
                asfx asfx2 = this.a;
                if (asfx2 != null) {
                    asfw asfw = (asfw) ((anxo) asfx2.toBuilder());
                    asfw.mergeFrom(asfx);
                    asfx = (asfx) ((anxl) asfw.build());
                }
                this.a = asfx;
            } else if (a == 26) {
                if (this.b == null) {
                    this.b = new ajtk();
                }
                aobv.a(this.b);
            } else if (a == 42) {
                this.c = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
