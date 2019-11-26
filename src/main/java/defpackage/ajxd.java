package defpackage;

/* renamed from: ajxd */
public final class ajxd extends aoca {
    public static volatile ajxd[] a;
    public akba b;

    public ajxd() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxd)) {
            return false;
        }
        ajxd ajxd = (ajxd) obj;
        akba akba = this.b;
        if (akba == null) {
            if (ajxd.b != null) {
                return false;
            }
        } else if (!akba.equals(ajxd.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxd.unknownFieldData);
        }
        aocb aocb2 = ajxd.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akba akba = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (akba != null ? akba.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(64172177, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(64172177, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 513377418) {
                if (this.b == null) {
                    this.b = new akba();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
