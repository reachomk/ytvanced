package defpackage;

/* renamed from: bdhq */
public final class bdhq extends aoca {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public bdhq() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhq) {
            bdhq bdhq = (bdhq) obj;
            if (this.a == bdhq.a && this.b == bdhq.b && this.c == bdhq.c && this.d == bdhq.d) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhq.unknownFieldData);
                }
                aocb aocb2 = bdhq.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + (!this.a ? 1237 : 1231)) * 31) + (!this.b ? 1237 : 1231)) * 31) + (!this.c ? 1237 : 1231)) * 31;
        if (this.d) {
            i = 1231;
        }
        hashCode = (hashCode + i) * 31;
        aocb aocb = this.unknownFieldData;
        i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        if (this.a) {
            aoby.a(1, true);
        }
        if (this.b) {
            aoby.a(2, true);
        }
        if (this.c) {
            aoby.a(3, true);
        }
        if (this.d) {
            aoby.a(4, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a) {
            computeSerializedSize += aoby.d(1);
        }
        if (this.b) {
            computeSerializedSize += aoby.d(2);
        }
        if (this.c) {
            computeSerializedSize += aoby.d(3);
        }
        return this.d ? computeSerializedSize + aoby.d(4) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 8) {
                this.a = aobv.c();
            } else if (a == 16) {
                this.b = aobv.c();
            } else if (a == 24) {
                this.c = aobv.c();
            } else if (a == 32) {
                this.d = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
