package defpackage;

/* renamed from: bdhf */
public final class bdhf extends aoca {
    public static final aobz a = aobz.a(bdhf.class, 1698591770);
    public int b;
    public int c;

    public bdhf() {
        this.b = 0;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhf) {
            bdhf bdhf = (bdhf) obj;
            if (this.b == bdhf.b && this.c == bdhf.c) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhf.unknownFieldData);
                }
                aocb aocb2 = bdhf.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i = this.b;
        if (i != 0) {
            aoby.a(1, i);
        }
        i = this.c;
        if (i != 0) {
            aoby.a(2, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.c(1, i);
        }
        i = this.c;
        return i != 0 ? computeSerializedSize + aoby.c(2, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 8) {
                this.b = aobv.f();
            } else if (a == 16) {
                this.c = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
