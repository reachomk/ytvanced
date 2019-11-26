package defpackage;

/* renamed from: ajzt */
public final class ajzt extends ajwo {
    public static final aobz a = aobz.a(ajzt.class, 1572129578);
    public ajzw b;

    public ajzt() {
        super(196516197);
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajzt)) {
            return false;
        }
        ajzt ajzt = (ajzt) obj;
        ajzw ajzw = this.b;
        if (ajzw == null) {
            if (ajzt.b != null) {
                return false;
            }
        } else if (!ajzw.equals(ajzt.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajzt.unknownFieldData);
        }
        aocb aocb2 = ajzt.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzw ajzw = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(1, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.b == null) {
                    this.b = new ajzw();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
