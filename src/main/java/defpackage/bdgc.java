package defpackage;

/* renamed from: bdgc */
public final class bdgc extends aoca {
    public int a;
    public String b;
    private String c;

    public bdgc() {
        this.a = -1;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdgc)) {
            return false;
        }
        bdgc bdgc = (bdgc) obj;
        String str = this.b;
        if (str == null) {
            if (bdgc.b != null) {
                return false;
            }
        } else if (!str.equals(bdgc.b)) {
            return false;
        }
        str = this.c;
        if (str == null) {
            if (bdgc.c != null) {
                return false;
            }
        } else if (!str.equals(bdgc.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdgc.unknownFieldData);
        }
        aocb aocb2 = bdgc.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        if (this.a == 0) {
            aoby.a(1, this.b);
        }
        if (this.a == 1) {
            aoby.a(2, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 0) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        return this.a == 1 ? computeSerializedSize + aoby.b(2, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
                this.a = 0;
            } else if (a == 18) {
                this.c = aobv.d();
                this.a = 1;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
