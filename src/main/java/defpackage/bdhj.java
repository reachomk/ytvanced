package defpackage;

/* renamed from: bdhj */
public final class bdhj extends aoca {
    public String a;
    public int b;
    private String c;

    public bdhj() {
        String str = "";
        this.c = str;
        this.a = str;
        this.b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhj) {
            bdhj bdhj = (bdhj) obj;
            String str = this.c;
            if (str == null) {
                if (bdhj.c != null) {
                    return false;
                }
            } else if (!str.equals(bdhj.c)) {
                return false;
            }
            str = this.a;
            if (str == null) {
                if (bdhj.a != null) {
                    return false;
                }
            } else if (!str.equals(bdhj.a)) {
                return false;
            }
            if (this.b == bdhj.b) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhj.unknownFieldData);
                }
                aocb aocb2 = bdhj.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.c;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.a;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.b) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.c;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.c);
        }
        str = this.a;
        if (!(str == null || str.equals(str2))) {
            aoby.a(2, this.a);
        }
        int i = this.b;
        if (i != 0) {
            aoby.b(3, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.c;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.c);
        }
        str = this.a;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(2, this.a);
        }
        int i = this.b;
        return i != 0 ? computeSerializedSize + aoby.d(3, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.c = aobv.d();
            } else if (a == 18) {
                this.a = aobv.d();
            } else if (a == 24) {
                this.b = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
