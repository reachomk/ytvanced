package defpackage;

/* renamed from: baai */
public final class baai extends aoca {
    public static volatile baai[] a;
    public String b;
    public String c;

    public baai() {
        String str = "";
        this.b = str;
        this.c = str;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof baai)) {
            return false;
        }
        baai baai = (baai) obj;
        String str = this.b;
        if (str == null) {
            if (baai.b != null) {
                return false;
            }
        } else if (!str.equals(baai.b)) {
            return false;
        }
        str = this.c;
        if (str == null) {
            if (baai.c != null) {
                return false;
            }
        } else if (!str.equals(baai.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(baai.unknownFieldData);
        }
        aocb aocb2 = baai.unknownFieldData;
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
        aoby.a(1, this.b);
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            aoby.a(2, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + aoby.b(1, this.b);
        String str = this.c;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(2, this.c);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (a == 18) {
                this.c = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
