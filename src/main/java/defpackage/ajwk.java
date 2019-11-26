package defpackage;

/* renamed from: ajwk */
public final class ajwk extends aoca {
    public static volatile ajwk[] a;
    public ajwh b;

    public ajwk() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajwk)) {
            return false;
        }
        ajwk ajwk = (ajwk) obj;
        ajwh ajwh = this.b;
        if (ajwh == null) {
            if (ajwk.b != null) {
                return false;
            }
        } else if (!ajwh.equals(ajwk.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajwk.unknownFieldData);
        }
        aocb aocb2 = ajwk.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwh ajwh = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajwh != null ? ajwh.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(62127609, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(62127609, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 497020874) {
                if (this.b == null) {
                    this.b = new ajwh();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
