package defpackage;

/* renamed from: ajux */
public final class ajux extends aoca {
    public ajto a = null;
    private String b;
    private String c;

    public ajux() {
        String str = "";
        this.b = str;
        this.c = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajux)) {
            return false;
        }
        ajux ajux = (ajux) obj;
        ajto ajto = this.a;
        if (ajto == null) {
            if (ajux.a != null) {
                return false;
            }
        } else if (!ajto.equals(ajux.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (ajux.b != null) {
                return false;
            }
        } else if (!str.equals(ajux.b)) {
            return false;
        }
        str = this.c;
        if (str == null) {
            if (ajux.c != null) {
                return false;
            }
        } else if (!str.equals(ajux.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajux.unknownFieldData);
        }
        aocb aocb2 = ajux.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajto ajto = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajto != null ? ajto.hashCode() : 0)) * 31;
        String str = this.b;
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
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(3, this.b);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(3, this.b);
        }
        str = this.c;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(5, this.c);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajto();
                }
                aobv.a(this.a);
            } else if (a == 26) {
                this.b = aobv.d();
            } else if (a == 42) {
                this.c = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
