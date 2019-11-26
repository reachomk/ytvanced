package defpackage;

/* renamed from: akcg */
public final class akcg extends aoca {
    public static volatile akcg[] a;
    public akbc b;

    public akcg() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akcg)) {
            return false;
        }
        akcg akcg = (akcg) obj;
        akbc akbc = this.b;
        if (akbc == null) {
            if (akcg.b != null) {
                return false;
            }
        } else if (!akbc.equals(akcg.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akcg.unknownFieldData);
        }
        aocb aocb2 = akcg.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akbc akbc = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (akbc != null ? akbc.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(58174010, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(58174010, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 465392082) {
                if (this.b == null) {
                    this.b = new akbc();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
