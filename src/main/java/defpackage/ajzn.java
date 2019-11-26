package defpackage;

/* renamed from: ajzn */
public final class ajzn extends aoca {
    public static volatile ajzn[] a;
    public ajzm b;

    public ajzn() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajzn)) {
            return false;
        }
        ajzn ajzn = (ajzn) obj;
        ajzm ajzm = this.b;
        if (ajzm == null) {
            if (ajzn.b != null) {
                return false;
            }
        } else if (!ajzm.equals(ajzn.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajzn.unknownFieldData);
        }
        aocb aocb2 = ajzn.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzm ajzm = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajzm != null ? ajzm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(138661147, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(138661147, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 1109289178) {
                if (this.b == null) {
                    this.b = new ajzm();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
