package defpackage;

/* renamed from: bdgz */
public final class bdgz extends aoca {
    public static final aobz a = aobz.a(bdgz.class, 1478982474);
    public bdhv b;

    public bdgz() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdgz)) {
            return false;
        }
        bdgz bdgz = (bdgz) obj;
        bdhv bdhv = this.b;
        if (bdhv == null) {
            if (bdgz.b != null) {
                return false;
            }
        } else if (!bdhv.equals(bdgz.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdgz.unknownFieldData);
        }
        aocb aocb2 = bdgz.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdhv bdhv = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (bdhv != null ? bdhv.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(2, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new bdhv();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
