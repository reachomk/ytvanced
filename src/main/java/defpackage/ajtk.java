package defpackage;

/* renamed from: ajtk */
public final class ajtk extends aoca {
    public static volatile ajtk[] a;

    public ajtk() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtk)) {
            return false;
        }
        ajtk ajtk = (ajtk) obj;
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtk.unknownFieldData);
        }
        aocb aocb2 = ajtk.unknownFieldData;
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
