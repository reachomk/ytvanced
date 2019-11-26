package defpackage;

/* renamed from: ajxj */
public final class ajxj extends aoca {
    public ajxh a;

    public ajxj() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxj)) {
            return false;
        }
        ajxj ajxj = (ajxj) obj;
        ajxh ajxh = this.a;
        if (ajxh == null) {
            if (ajxj.a != null) {
                return false;
            }
        } else if (!ajxh.equals(ajxj.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxj.unknownFieldData);
        }
        aocb aocb2 = ajxj.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajxh ajxh = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajxh != null ? ajxh.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(120770929, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(120770929, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 966167434) {
                if (this.a == null) {
                    this.a = new ajxh();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
