package defpackage;

/* renamed from: bdhe */
public final class bdhe extends aoca {
    public static final aobz a = aobz.a(bdhe.class, 1550445914);
    public bdgf b;
    public int c;
    public bdgf d;
    public bdgf e;
    public bdgf f;
    public bdgf g;
    public boolean h;
    public int i;
    private boolean j;
    private float k;

    public bdhe() {
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.j = true;
        this.i = 1;
        this.f = null;
        this.g = null;
        this.h = false;
        this.k = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhe) {
            bdhe bdhe = (bdhe) obj;
            bdgf bdgf = this.b;
            if (bdgf == null) {
                if (bdhe.b != null) {
                    return false;
                }
            } else if (!bdgf.equals(bdhe.b)) {
                return false;
            }
            if (this.c == bdhe.c) {
                bdgf = this.d;
                if (bdgf == null) {
                    if (bdhe.d != null) {
                        return false;
                    }
                } else if (!bdgf.equals(bdhe.d)) {
                    return false;
                }
                bdgf = this.e;
                if (bdgf == null) {
                    if (bdhe.e != null) {
                        return false;
                    }
                } else if (!bdgf.equals(bdhe.e)) {
                    return false;
                }
                if (this.j == bdhe.j && this.i == bdhe.i) {
                    bdgf = this.f;
                    if (bdgf == null) {
                        if (bdhe.f != null) {
                            return false;
                        }
                    } else if (!bdgf.equals(bdhe.f)) {
                        return false;
                    }
                    bdgf = this.g;
                    if (bdgf == null) {
                        if (bdhe.g != null) {
                            return false;
                        }
                    } else if (!bdgf.equals(bdhe.g)) {
                        return false;
                    }
                    if (this.h == bdhe.h && Float.floatToIntBits(this.k) == Float.floatToIntBits(bdhe.k)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(bdhe.unknownFieldData);
                        }
                        aocb aocb2 = bdhe.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdgf bdgf = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdgf != null ? bdgf.hashCode() : 0;
        int i2 = this.c;
        bdgf bdgf2 = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + i2) * 31;
        hashCode2 = bdgf2 != null ? bdgf2.hashCode() : 0;
        bdgf bdgf3 = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (bdgf3 != null ? bdgf3.hashCode() : 0)) * 31;
        i2 = 1237;
        hashCode = (hashCode + (!this.j ? 1237 : 1231)) * 31;
        hashCode2 = this.i;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        bdgf bdgf4 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdgf4 != null ? bdgf4.hashCode() : 0;
        bdgf4 = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (bdgf4 != null ? bdgf4.hashCode() : 0)) * 31;
        if (this.h) {
            i2 = 1231;
        }
        hashCode = (((hashCode + i2) * 31) + Float.floatToIntBits(this.k)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        int i = this.c;
        if (i != 0) {
            aoby.b(2, i);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (!this.j) {
            aoby.a(5, false);
        }
        aocf = this.f;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        if (this.h) {
            aoby.a(8, true);
        }
        if (Float.floatToIntBits(this.k) != Float.floatToIntBits(0.0f)) {
            aoby.a(9, this.k);
        }
        i = this.i;
        if (!(i == 1 || i == 0)) {
            aoby.a(10, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        int i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.d(2, i);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        if (!this.j) {
            computeSerializedSize += aoby.d(5);
        }
        aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(8);
        }
        if (Float.floatToIntBits(this.k) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(9);
        }
        i = this.i;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(10, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new bdgf();
                    }
                    aobv.a(this.b);
                    continue;
                case 16:
                    this.c = aobv.f();
                    continue;
                case 26:
                    if (this.d == null) {
                        this.d = new bdgf();
                    }
                    aobv.a(this.d);
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new bdgf();
                    }
                    aobv.a(this.e);
                    continue;
                case 40:
                    this.j = aobv.c();
                    continue;
                case cv.aU /*50*/:
                    if (this.f == null) {
                        this.f = new bdgf();
                    }
                    aobv.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new bdgf();
                    }
                    aobv.a(this.g);
                    continue;
                case 64:
                    this.h = aobv.c();
                    continue;
                case 77:
                    this.k = aobv.b();
                    continue;
                case 80:
                    int i = aobv.b;
                    int f = aobv.f();
                    int i2 = 3;
                    if (f == 0 || f == 1 || f == 2 || f == 3) {
                        if (f == 0) {
                            i2 = 1;
                        } else if (f == 1) {
                            i2 = 2;
                        } else if (f != 2) {
                            i2 = f != 3 ? 0 : 4;
                        }
                        this.i = i2;
                        break;
                    }
                    aobv.e(i);
                    storeUnknownField(aobv, a);
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
