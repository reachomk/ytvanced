package defpackage;

/* renamed from: bdgq */
public final class bdgq extends aoca {
    public static volatile bdgq[] a;
    public String b;
    public int c;

    public bdgq() {
        this.b = "";
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgq) {
            bdgq bdgq = (bdgq) obj;
            String str = this.b;
            if (str == null) {
                if (bdgq.b != null) {
                    return false;
                }
            } else if (!str.equals(bdgq.b)) {
                return false;
            }
            if (this.c == bdgq.c) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgq.unknownFieldData);
                }
                aocb aocb2 = bdgq.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.b;
        if (!(str == null || str.equals(""))) {
            aoby.a(1, this.b);
        }
        int i = this.c;
        if (i != 0) {
            aoby.a(2, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        int i = this.c;
        return i != 0 ? computeSerializedSize + aoby.c(2, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (a == 16) {
                this.c = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
