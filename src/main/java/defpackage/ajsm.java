package defpackage;

/* renamed from: ajsm */
public final class ajsm extends aoca {
    public ajsr a;
    public ajrq b;

    public ajsm() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajsm)) {
            return false;
        }
        ajsm ajsm = (ajsm) obj;
        ajsr ajsr = this.a;
        if (ajsr == null) {
            if (ajsm.a != null) {
                return false;
            }
        } else if (!ajsr.equals(ajsm.a)) {
            return false;
        }
        ajrq ajrq = this.b;
        if (ajrq == null) {
            if (ajsm.b != null) {
                return false;
            }
        } else if (!ajrq.equals(ajsm.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajsm.unknownFieldData);
        }
        aocb aocb2 = ajsm.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajsr ajsr = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajsr != null ? ajsr.hashCode() : 0;
        ajrq ajrq = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (ajrq != null ? ajrq.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(93764576, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(118523928, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(93764576, aocf);
        }
        aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(118523928, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 750116610) {
                if (this.a == null) {
                    this.a = new ajsr();
                }
                aobv.a(this.a);
            } else if (a == 948191426) {
                if (this.b == null) {
                    this.b = new ajrq();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
