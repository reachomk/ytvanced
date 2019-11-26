package defpackage;

import java.util.Arrays;

/* renamed from: ajui */
public final class ajui extends aoca {
    public arci a;
    public byte[] b;

    public ajui() {
        this.b = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajui) {
            ajui ajui = (ajui) obj;
            arci arci = this.a;
            if (arci == null) {
                if (ajui.a != null) {
                    return false;
                }
            } else if (!arci.equals(ajui.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajui.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajui.unknownFieldData);
                }
                aocb aocb2 = ajui.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arci arci = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (arci != null ? arci.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(5, this.b);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        return !Arrays.equals(this.b, aock.c) ? computeSerializedSize + aoby.b(5, this.b) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                arci arci = (arci) aobv.a(arci.c.getParserForType());
                arci arci2 = this.a;
                if (arci2 != null) {
                    arcl arcl = (arcl) ((anxo) arci2.toBuilder());
                    arcl.mergeFrom(arci);
                    arci = (arci) ((anxl) arcl.build());
                }
                this.a = arci;
            } else if (a == 42) {
                this.b = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
