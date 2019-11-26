package defpackage;

/* renamed from: ajvs */
public final class ajvs extends aoca {
    public akal a;

    public ajvs() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajvs)) {
            return false;
        }
        ajvs ajvs = (ajvs) obj;
        akal akal = this.a;
        if (akal == null) {
            if (ajvs.a != null) {
                return false;
            }
        } else if (!akal.equals(ajvs.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajvs.unknownFieldData);
        }
        aocb aocb2 = ajvs.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akal akal = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (akal != null ? akal.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(101423018, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(101423018, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 811384146) {
                if (this.a == null) {
                    this.a = new akal();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
