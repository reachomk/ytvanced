package defpackage;

/* renamed from: ajzs */
public final class ajzs extends aoca {
    public ajzp a;

    public ajzs() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajzs)) {
            return false;
        }
        ajzs ajzs = (ajzs) obj;
        ajzp ajzp = this.a;
        if (ajzp == null) {
            if (ajzs.a != null) {
                return false;
            }
        } else if (!ajzp.equals(ajzs.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajzs.unknownFieldData);
        }
        aocb aocb2 = ajzs.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzp ajzp = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajzp != null ? ajzp.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(139970731, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(139970731, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 1119765850) {
                if (this.a == null) {
                    this.a = new ajzp();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
