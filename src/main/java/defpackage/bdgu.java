package defpackage;

/* renamed from: bdgu */
public final class bdgu extends aoca {
    public static volatile bdgu[] a;
    public String b;
    public bdgx c;

    public bdgu() {
        this.b = "";
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdgu)) {
            return false;
        }
        bdgu bdgu = (bdgu) obj;
        String str = this.b;
        if (str == null) {
            if (bdgu.b != null) {
                return false;
            }
        } else if (!str.equals(bdgu.b)) {
            return false;
        }
        bdgx bdgx = this.c;
        if (bdgx == null) {
            if (bdgu.c != null) {
                return false;
            }
        } else if (!bdgx.equals(bdgu.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdgu.unknownFieldData);
        }
        aocb aocb2 = bdgu.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        bdgx bdgx = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (bdgx != null ? bdgx.hashCode() : 0)) * 31;
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
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(2, aocf);
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
        aocf aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(2, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (a == 18) {
                if (this.c == null) {
                    this.c = new bdgx();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
