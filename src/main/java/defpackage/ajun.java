package defpackage;

/* renamed from: ajun */
public final class ajun extends aoca {
    private static volatile ajun[] b;
    public ajuo a;

    public static ajun[] a() {
        if (b == null) {
            synchronized (aocd.b) {
                if (b == null) {
                    b = new ajun[0];
                }
            }
        }
        return b;
    }

    public ajun() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajun)) {
            return false;
        }
        ajun ajun = (ajun) obj;
        ajuo ajuo = this.a;
        if (ajuo == null) {
            if (ajun.a != null) {
                return false;
            }
        } else if (!ajuo.equals(ajun.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajun.unknownFieldData);
        }
        aocb aocb2 = ajun.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajuo ajuo = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (ajuo != null ? ajuo.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(138681066, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(138681066, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 1109448530) {
                if (this.a == null) {
                    this.a = new ajuo();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
