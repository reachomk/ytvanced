package defpackage;

/* renamed from: ajwj */
public final class ajwj extends aoca {
    public ajwf a;

    public ajwj() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajwj)) {
            return false;
        }
        ajwj ajwj = (ajwj) obj;
        ajwf ajwf = this.a;
        if (ajwf == null) {
            if (ajwj.a != null) {
                return false;
            }
        } else if (!ajwf.equals(ajwj.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajwj.unknownFieldData);
        }
        aocb aocb2 = ajwj.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwf ajwf = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajwf != null ? ajwf.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(61737181, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(61737181, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 493897450) {
                if (this.a == null) {
                    this.a = new ajwf();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
