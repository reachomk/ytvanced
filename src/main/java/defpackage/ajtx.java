package defpackage;

/* renamed from: ajtx */
public final class ajtx extends aoca {
    public ajsn a;

    public ajtx() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtx)) {
            return false;
        }
        ajtx ajtx = (ajtx) obj;
        ajsn ajsn = this.a;
        if (ajsn == null) {
            if (ajtx.a != null) {
                return false;
            }
        } else if (!ajsn.equals(ajtx.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtx.unknownFieldData);
        }
        aocb aocb2 = ajtx.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajsn ajsn = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajsn != null ? ajsn.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(62285947, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(62285947, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 498287578) {
                if (this.a == null) {
                    this.a = new ajsn();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
