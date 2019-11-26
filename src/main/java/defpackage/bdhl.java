package defpackage;

/* renamed from: bdhl */
public final class bdhl extends aoca {
    public bdhl() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdhl)) {
            return false;
        }
        bdhl bdhl = (bdhl) obj;
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdhl.unknownFieldData);
        }
        aocb aocb2 = bdhl.unknownFieldData;
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
