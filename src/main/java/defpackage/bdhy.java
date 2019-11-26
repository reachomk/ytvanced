package defpackage;

/* renamed from: bdhy */
public final class bdhy extends aoca {
    public static final aobz a = aobz.a(bdhy.class, 1376282002);
    public String b;

    public bdhy() {
        this.b = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdhy)) {
            return false;
        }
        bdhy bdhy = (bdhy) obj;
        String str = this.b;
        if (str == null) {
            if (bdhy.b != null) {
                return false;
            }
        } else if (!str.equals(bdhy.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdhy.unknownFieldData);
        }
        aocb aocb2 = bdhy.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
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
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(1, this.b);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
