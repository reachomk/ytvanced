package defpackage;

/* renamed from: ajwu */
public final class ajwu extends aoca {
    public static volatile ajwu[] a;
    public ajtc b;

    public ajwu() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajwu)) {
            return false;
        }
        ajwu ajwu = (ajwu) obj;
        ajtc ajtc = this.b;
        if (ajtc == null) {
            if (ajwu.b != null) {
                return false;
            }
        } else if (!ajtc.equals(ajwu.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajwu.unknownFieldData);
        }
        aocb aocb2 = ajwu.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtc ajtc = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajtc != null ? ajtc.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(73920376, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(73920376, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 591363010) {
                if (this.b == null) {
                    this.b = new ajtc();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
