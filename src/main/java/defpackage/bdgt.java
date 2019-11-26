package defpackage;

/* renamed from: bdgt */
public final class bdgt extends aoca {
    public bdgt() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdgt)) {
            return false;
        }
        bdgt bdgt = (bdgt) obj;
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdgt.unknownFieldData);
        }
        aocb aocb2 = bdgt.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        int a;
        do {
            a = aobv.a();
            if (a == 0) {
                break;
            }
        } while (super.storeUnknownField(aobv, a));
        return this;
    }
}
