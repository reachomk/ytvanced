package defpackage;

/* renamed from: ajtq */
public final class ajtq extends aoca {
    public ajwp a;

    public ajtq() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtq)) {
            return false;
        }
        ajtq ajtq = (ajtq) obj;
        ajwp ajwp = this.a;
        if (ajwp == null) {
            if (ajtq.a != null) {
                return false;
            }
        } else if (!ajwp.equals(ajtq.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtq.unknownFieldData);
        }
        aocb aocb2 = ajtq.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwp ajwp = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajwp != null ? ajwp.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(97628151, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(97628151, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 781025210) {
                if (this.a == null) {
                    this.a = new ajwp();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
