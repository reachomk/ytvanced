package defpackage;

/* renamed from: bdgd */
public final class bdgd extends aoca {
    public static final aobz a = aobz.a(bdgd.class, 1539800066);
    public bdgc b;
    public boolean c;
    public float d;
    public float e;
    public int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private azse k;
    private azsc l;
    private azsr m;
    private azsr n;

    public bdgd() {
        this.g = -1;
        this.h = -1;
        this.b = null;
        this.c = false;
        this.i = false;
        this.d = 0.0f;
        this.e = 1.0f;
        this.j = 0;
        this.f = 1;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgd) {
            bdgd bdgd = (bdgd) obj;
            bdgc bdgc = this.b;
            if (bdgc == null) {
                if (bdgd.b != null) {
                    return false;
                }
            } else if (!bdgc.equals(bdgd.b)) {
                return false;
            }
            if (this.c == bdgd.c && this.i == bdgd.i && Float.floatToIntBits(this.d) == Float.floatToIntBits(bdgd.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(bdgd.e) && this.j == bdgd.j && this.f == bdgd.f) {
                int i = this.g;
                if (i == bdgd.g) {
                    if (i == 0) {
                        azse azse = this.k;
                        if (azse == null) {
                            if (bdgd.k != null) {
                                return false;
                            }
                        } else if (!azse.equals(bdgd.k)) {
                            return false;
                        }
                    }
                    i = this.g;
                    if (i == bdgd.g) {
                        if (i == 1) {
                            azsc azsc = this.l;
                            if (azsc == null) {
                                if (bdgd.l != null) {
                                    return false;
                                }
                            } else if (!azsc.equals(bdgd.l)) {
                                return false;
                            }
                        }
                        i = this.h;
                        if (i == bdgd.h) {
                            azsr azsr;
                            if (i == 0) {
                                azsr = this.m;
                                if (azsr == null) {
                                    if (bdgd.m != null) {
                                        return false;
                                    }
                                } else if (!azsr.equals(bdgd.m)) {
                                    return false;
                                }
                            }
                            i = this.h;
                            if (i == bdgd.h) {
                                if (i == 1) {
                                    azsr = this.n;
                                    if (azsr == null) {
                                        if (bdgd.n != null) {
                                            return false;
                                        }
                                    } else if (!azsr.equals(bdgd.n)) {
                                        return false;
                                    }
                                }
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(bdgd.unknownFieldData);
                                }
                                aocb aocb2 = bdgd.unknownFieldData;
                                return aocb2 == null || aocb2.b();
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdgc bdgc = this.b;
        int i = 0;
        int i2 = 1237;
        hashCode = (((((hashCode + 527) * 31) + (bdgc != null ? bdgc.hashCode() : 0)) * 31) + (!this.c ? 1237 : 1231)) * 31;
        if (this.i) {
            i2 = 1231;
        }
        hashCode = (((((((hashCode + i2) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.j) * 31;
        int i3 = this.f;
        if (i3 == 0) {
            i3 = 0;
        }
        hashCode += i3;
        anxl anxl = this.k;
        if (this.g != 0) {
            anxl = null;
        }
        hashCode = (hashCode * 31) + (anxl != null ? anxl.hashCode() : 0);
        anxl = this.l;
        if (this.g != 1) {
            anxl = null;
        }
        hashCode = (hashCode * 31) + (anxl != null ? anxl.hashCode() : 0);
        anxl = this.m;
        if (this.h != 0) {
            anxl = null;
        }
        hashCode = (hashCode * 31) + (anxl != null ? anxl.hashCode() : 0);
        anxl = this.n;
        if (this.h != 1) {
            anxl = null;
        }
        hashCode = ((hashCode * 31) + (anxl != null ? anxl.hashCode() : 0)) * 31;
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
        if (this.c) {
            aoby.a(2, true);
        }
        if (this.i) {
            aoby.a(3, true);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            aoby.a(4, this.d);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(1.0f)) {
            aoby.a(5, this.e);
        }
        int i = this.j;
        if (i != 0) {
            aoby.a(6, i);
        }
        i = this.f;
        if (!(i == 1 || i == 0)) {
            aoby.a(7, i - 1);
        }
        if (this.g == 0) {
            aoby.a(8, this.k);
        }
        if (this.g == 1) {
            aoby.a(9, this.l);
        }
        if (this.h == 0) {
            aoby.a(10, this.m);
        }
        if (this.h == 1) {
            aoby.a(11, this.n);
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
        if (this.c) {
            computeSerializedSize += aoby.d(2);
        }
        if (this.i) {
            computeSerializedSize += aoby.d(3);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(4);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(1.0f)) {
            computeSerializedSize += aoby.c(5);
        }
        int i = this.j;
        if (i != 0) {
            computeSerializedSize += aoby.c(6, i);
        }
        i = this.f;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(7, i - 1);
        }
        if (this.g == 0) {
            computeSerializedSize += anwm.c(8, this.k);
        }
        if (this.g == 1) {
            computeSerializedSize += anwm.c(9, this.l);
        }
        if (this.h == 0) {
            computeSerializedSize += anwm.c(10, this.m);
        }
        return this.h == 1 ? computeSerializedSize + anwm.c(11, this.n) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            azsr azsr;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new bdgc();
                    }
                    aobv.a(this.b);
                    continue;
                case 16:
                    this.c = aobv.c();
                    continue;
                case 24:
                    this.i = aobv.c();
                    continue;
                case 37:
                    this.d = aobv.b();
                    continue;
                case 45:
                    this.e = aobv.b();
                    continue;
                case 48:
                    this.j = aobv.f();
                    continue;
                case cv.ba /*56*/:
                    int i2 = aobv.b;
                    int f = aobv.f();
                    if (f == 0 || f == 1 || f == 2 || f == 3) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f == 2) {
                            i = 3;
                        } else if (f == 3) {
                            i = 4;
                        }
                        this.f = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 66:
                    azse azse = (azse) aobv.a(azse.a.getParserForType());
                    azse azse2 = this.k;
                    if (azse2 != null) {
                        azsh azsh = (azsh) ((anxo) azse2.toBuilder());
                        azsh.mergeFrom(azse);
                        azse = (azse) ((anxl) azsh.build());
                    }
                    this.k = azse;
                    this.g = 0;
                    continue;
                case 74:
                    azsc azsc = (azsc) aobv.a(azsc.a.getParserForType());
                    azsc azsc2 = this.l;
                    if (azsc2 != null) {
                        azsf azsf = (azsf) ((anxo) azsc2.toBuilder());
                        azsf.mergeFrom(azsc);
                        azsc = (azsc) ((anxl) azsf.build());
                    }
                    this.l = azsc;
                    this.g = 1;
                    continue;
                case 82:
                    azsr = (azsr) aobv.a(azsr.a.getParserForType());
                    azsr azsr2 = this.m;
                    if (azsr2 != null) {
                        azsq azsq = (azsq) ((anxo) azsr2.toBuilder());
                        azsq.mergeFrom(azsr);
                        azsr = (azsr) ((anxl) azsq.build());
                    }
                    this.m = azsr;
                    this.h = 0;
                    continue;
                case 90:
                    azsr = (azsr) aobv.a(azsr.a.getParserForType());
                    azsr azsr3 = this.n;
                    if (azsr3 != null) {
                        azsq azsq2 = (azsq) ((anxo) azsr3.toBuilder());
                        azsq2.mergeFrom(azsr);
                        azsr = (azsr) ((anxl) azsq2.build());
                    }
                    this.n = azsr;
                    this.h = 1;
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
