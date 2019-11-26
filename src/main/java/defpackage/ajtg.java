package defpackage;

/* renamed from: ajtg */
public final class ajtg extends aoca {
    public ajtd a;

    public ajtg() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtg)) {
            return false;
        }
        ajtg ajtg = (ajtg) obj;
        ajtd ajtd = this.a;
        if (ajtd == null) {
            if (ajtg.a != null) {
                return false;
            }
        } else if (!ajtd.equals(ajtg.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtg.unknownFieldData);
        }
        aocb aocb2 = ajtg.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtd ajtd = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajtd != null ? ajtd.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(95060329, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(95060329, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 760482634) {
                if (this.a == null) {
                    this.a = new ajtd();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
