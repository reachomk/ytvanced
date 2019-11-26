package defpackage;

import java.util.Arrays;

/* renamed from: bdgx */
public final class bdgx extends aoca {
    public int a;
    public byte[] b;
    private float c;
    private String d;
    private boolean e;
    private int f;
    private int g;
    private bdgv h;
    private aztb i;
    private int j;

    public final void a(byte[] bArr) {
        if (bArr == null) {
            this.b = null;
            if (this.a == 4) {
                this.a = -1;
            }
            return;
        }
        this.a = -1;
        this.b = bArr;
        this.a = 4;
    }

    public final void a(int i) {
        this.a = -1;
        this.f = i;
        this.a = 5;
    }

    public bdgx() {
        this.a = -1;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgx) {
            bdgx bdgx = (bdgx) obj;
            if (this.j == bdgx.j && Float.floatToIntBits(this.c) == Float.floatToIntBits(bdgx.c)) {
                String str = this.d;
                if (str == null) {
                    if (bdgx.d != null) {
                        return false;
                    }
                } else if (!str.equals(bdgx.d)) {
                    return false;
                }
                if (this.e == bdgx.e && Arrays.equals(this.b, bdgx.b) && this.f == bdgx.f && this.g == bdgx.g) {
                    bdgv bdgv = this.h;
                    if (bdgv == null) {
                        if (bdgx.h != null) {
                            return false;
                        }
                    } else if (!bdgv.equals(bdgx.h)) {
                        return false;
                    }
                    int i = this.a;
                    if (i == bdgx.a) {
                        if (i == 8) {
                            aztb aztb = this.i;
                            if (aztb == null) {
                                if (bdgx.i != null) {
                                    return false;
                                }
                            } else if (!aztb.equals(bdgx.i)) {
                                return false;
                            }
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(bdgx.unknownFieldData);
                        }
                        aocb aocb2 = bdgx.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int i = this.j;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        hashCode = (((hashCode + i) * 31) + Float.floatToIntBits(this.c)) * 31;
        String str = this.d;
        hashCode = ((((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.e ? 1237 : 1231)) * 31) + Arrays.hashCode(this.b)) * 31) + this.f) * 31) + this.g;
        bdgv bdgv = this.h;
        if (this.a != 7) {
            bdgv = null;
        }
        hashCode = (hashCode * 31) + (bdgv != null ? bdgv.hashCode() : 0);
        anxl anxl = this.i;
        if (this.a != 8) {
            anxl = null;
        }
        hashCode = ((hashCode * 31) + (anxl != null ? anxl.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        if (this.a == 0 && this.j != 0) {
            aoby.a(1, 0);
        }
        if (this.a == 1) {
            aoby.a(2, this.c);
        }
        if (this.a == 2) {
            aoby.a(3, this.d);
        }
        if (this.a == 3) {
            aoby.a(4, this.e);
        }
        if (this.a == 4) {
            aoby.a(5, this.b);
        }
        if (this.a == 7) {
            aoby.a(6, this.h);
        }
        if (this.a == 8) {
            aoby.a(7, this.i);
        }
        if (this.a == 5) {
            aoby.a(8, this.f);
        }
        if (this.a == 6) {
            aoby.b(9, this.g);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.a == 0 && this.j != 0) {
            computeSerializedSize += aoby.c(1, 0);
        }
        if (this.a == 1) {
            computeSerializedSize += aoby.c(2);
        }
        if (this.a == 2) {
            computeSerializedSize += aoby.b(3, this.d);
        }
        if (this.a == 3) {
            computeSerializedSize += aoby.d(4);
        }
        if (this.a == 4) {
            computeSerializedSize += aoby.b(5, this.b);
        }
        if (this.a == 7) {
            computeSerializedSize += aoby.b(6, this.h);
        }
        if (this.a == 8) {
            computeSerializedSize += anwm.c(7, this.i);
        }
        if (this.a == 5) {
            computeSerializedSize += aoby.c(8, this.f);
        }
        return this.a == 6 ? computeSerializedSize + aoby.d(9, this.g) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 8) {
                this.a = 0;
                int i = aobv.b;
                int f = aobv.f();
                if (f != 0) {
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                } else {
                    this.j = aztj.a(f);
                }
            } else if (a == 21) {
                this.c = aobv.b();
                this.a = 1;
            } else if (a == 26) {
                this.d = aobv.d();
                this.a = 2;
            } else if (a == 32) {
                this.e = aobv.c();
                this.a = 3;
            } else if (a == 42) {
                this.b = aobv.e();
                this.a = 4;
            } else if (a == 50) {
                if (this.h == null) {
                    this.h = new bdgv();
                }
                aobv.a(this.h);
                this.a = 7;
            } else if (a == 58) {
                aztb aztb = (aztb) aobv.a(aztb.a.getParserForType());
                aztb aztb2 = this.i;
                if (aztb2 != null) {
                    azta azta = (azta) ((anxo) aztb2.toBuilder());
                    azta.mergeFrom(aztb);
                    aztb = (aztb) ((anxl) azta.build());
                }
                this.i = aztb;
                this.a = 8;
            } else if (a == 64) {
                this.f = aobv.f();
                this.a = 5;
            } else if (a == 72) {
                this.g = aobv.f();
                this.a = 6;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
