package defpackage;

/* renamed from: bdht */
public final class bdht extends aoca {
    public static final aobz a = aobz.a(bdht.class, 1350196394);
    public int b;
    public float c;
    public int d;
    public float e;
    public float f;
    public bdhq g;
    public bdhs h;
    public float i;
    public float j;
    private boolean k;
    private boolean l;

    public bdht() {
        this.b = 0;
        this.c = 1.0f;
        this.d = 0;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = null;
        this.k = true;
        this.l = false;
        this.h = null;
        this.i = 0.0f;
        this.j = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdht) {
            bdht bdht = (bdht) obj;
            if (this.b == bdht.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(bdht.c) && this.d == bdht.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(bdht.e) && Float.floatToIntBits(this.f) == Float.floatToIntBits(bdht.f)) {
                bdhq bdhq = this.g;
                if (bdhq == null) {
                    if (bdht.g != null) {
                        return false;
                    }
                } else if (!bdhq.equals(bdht.g)) {
                    return false;
                }
                if (this.k == bdht.k && this.l == bdht.l) {
                    bdhs bdhs = this.h;
                    if (bdhs == null) {
                        if (bdht.h != null) {
                            return false;
                        }
                    } else if (!bdhs.equals(bdht.h)) {
                        return false;
                    }
                    if (Float.floatToIntBits(this.i) == Float.floatToIntBits(bdht.i) && Float.floatToIntBits(this.j) == Float.floatToIntBits(bdht.j)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(bdht.unknownFieldData);
                        }
                        aocb aocb2 = bdht.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int i = this.b;
        int floatToIntBits = Float.floatToIntBits(this.c);
        int i2 = this.d;
        int floatToIntBits2 = Float.floatToIntBits(this.e);
        int floatToIntBits3 = Float.floatToIntBits(this.f);
        bdhq bdhq = this.g;
        hashCode = (((((((((((hashCode + 527) * 31) + i) * 31) + floatToIntBits) * 31) + i2) * 31) + floatToIntBits2) * 31) + floatToIntBits3) * 31;
        i = 0;
        i2 = 1237;
        hashCode = (((hashCode + (bdhq != null ? bdhq.hashCode() : 0)) * 31) + (!this.k ? 1237 : 1231)) * 31;
        if (this.l) {
            i2 = 1231;
        }
        bdhs bdhs = this.h;
        hashCode = (((((((hashCode + i2) * 31) + (bdhs != null ? bdhs.hashCode() : 0)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(this.j)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i = this.b;
        if (i != 0) {
            aoby.b(1, i);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(1.0f)) {
            aoby.a(2, this.c);
        }
        i = this.d;
        if (i != 0) {
            aoby.b(3, i);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            aoby.a(4, this.e);
        }
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(0.0f)) {
            aoby.a(5, this.f);
        }
        aocf aocf = this.h;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        if (!this.k) {
            aoby.a(7, false);
        }
        if (this.l) {
            aoby.a(8, true);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(9, aocf);
        }
        if (Float.floatToIntBits(this.i) != Float.floatToIntBits(0.0f)) {
            aoby.a(10, this.i);
        }
        if (Float.floatToIntBits(this.j) != Float.floatToIntBits(0.0f)) {
            aoby.a(11, this.j);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.d(1, i);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(1.0f)) {
            computeSerializedSize += aoby.c(2);
        }
        i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.d(3, i);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(4);
        }
        if (Float.floatToIntBits(this.f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(5);
        }
        aocf aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        if (!this.k) {
            computeSerializedSize += aoby.d(7);
        }
        if (this.l) {
            computeSerializedSize += aoby.d(8);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(9, aocf);
        }
        if (Float.floatToIntBits(this.i) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(10);
        }
        return Float.floatToIntBits(this.j) != Float.floatToIntBits(0.0f) ? computeSerializedSize + aoby.c(11) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = aobv.f();
                    continue;
                case 21:
                    this.c = aobv.b();
                    continue;
                case 24:
                    this.d = aobv.f();
                    continue;
                case 37:
                    this.e = aobv.b();
                    continue;
                case 45:
                    this.f = aobv.b();
                    continue;
                case cv.aU /*50*/:
                    if (this.h == null) {
                        this.h = new bdhs();
                    }
                    aobv.a(this.h);
                    continue;
                case cv.ba /*56*/:
                    this.k = aobv.c();
                    continue;
                case 64:
                    this.l = aobv.c();
                    continue;
                case 74:
                    if (this.g == null) {
                        this.g = new bdhq();
                    }
                    aobv.a(this.g);
                    continue;
                case 85:
                    this.i = aobv.b();
                    continue;
                case 93:
                    this.j = aobv.b();
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
