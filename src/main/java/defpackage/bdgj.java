package defpackage;

/* renamed from: bdgj */
public final class bdgj extends aoca {
    public static final aobz a = aobz.a(bdgj.class, 1236832202);
    private int b;
    private float c;
    private int d;
    private float e;
    private boolean f;

    public final float a() {
        if (this.b != 0) {
            return 0.0f;
        }
        return this.e;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean c() {
        if (this.b != 1) {
            return false;
        }
        return this.f;
    }

    public final boolean d() {
        return this.b == 1;
    }

    public bdgj() {
        this.b = -1;
        this.c = 0.0f;
        this.d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgj) {
            bdgj bdgj = (bdgj) obj;
            if (Float.floatToIntBits(this.c) == Float.floatToIntBits(bdgj.c) && this.d == bdgj.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(bdgj.e) && this.f == bdgj.f) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgj.unknownFieldData);
                }
                aocb aocb2 = bdgj.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + (!this.f ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            aoby.a(1, this.c);
        }
        int i = this.d;
        if (i != 0) {
            aoby.b(2, i);
        }
        if (this.b == 0) {
            aoby.a(3, this.e);
        }
        if (this.b == 1) {
            aoby.a(4, this.f);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(1);
        }
        int i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.d(2, i);
        }
        if (this.b == 0) {
            computeSerializedSize += aoby.c(3);
        }
        return this.b == 1 ? computeSerializedSize + aoby.d(4) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 13) {
                this.c = aobv.b();
            } else if (a == 16) {
                this.d = aobv.f();
            } else if (a == 29) {
                this.e = aobv.b();
                this.b = 0;
            } else if (a == 32) {
                this.f = aobv.c();
                this.b = 1;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
