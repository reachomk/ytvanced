package defpackage;

/* renamed from: bdhg */
public final class bdhg extends aoca {
    public static volatile bdhg[] a;
    private String b;
    private String c;

    public bdhg() {
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
        if (!(obj instanceof bdhg)) {
            return false;
        }
        bdhg bdhg = (bdhg) obj;
        String str = this.b;
        if (str == null) {
            if (bdhg.b != null) {
                return false;
            }
        } else if (!str.equals(bdhg.b)) {
            return false;
        }
        str = this.c;
        if (str == null) {
            if (bdhg.c != null) {
                return false;
            }
        } else if (!str.equals(bdhg.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdhg.unknownFieldData);
        }
        aocb aocb2 = bdhg.unknownFieldData;
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
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.b);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            aoby.a(2, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        str = this.c;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(2, this.c);
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
