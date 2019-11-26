package defpackage;

import java.util.Arrays;

/* renamed from: ajry */
public final class ajry extends ajwo {
    public ajsa[] a;
    public apjs b;
    public apjo c;
    public byte[] d;
    public ajzw e;
    public aygk[] f;
    public int g;
    private int h;
    private int i;
    private boolean j;

    public ajry() {
        super(144757704);
        if (ajsa.a == null) {
            synchronized (aocd.b) {
                if (ajsa.a == null) {
                    ajsa.a = new ajsa[0];
                }
            }
        }
        this.a = ajsa.a;
        this.h = 0;
        this.i = 0;
        this.d = aock.c;
        this.j = false;
        this.g = 1;
        this.e = null;
        this.f = new aygk[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajry) {
            ajry ajry = (ajry) obj;
            if (aocd.a(this.a, ajry.a)) {
                apjs apjs = this.b;
                if (apjs == null) {
                    if (ajry.b != null) {
                        return false;
                    }
                } else if (!apjs.equals(ajry.b)) {
                    return false;
                }
                if (this.h == ajry.h && this.i == ajry.i) {
                    apjo apjo = this.c;
                    if (apjo == null) {
                        if (ajry.c != null) {
                            return false;
                        }
                    } else if (!apjo.equals(ajry.c)) {
                        return false;
                    }
                    if (Arrays.equals(this.d, ajry.d) && this.j == ajry.j && this.g == ajry.g) {
                        ajzw ajzw = this.e;
                        if (ajzw == null) {
                            if (ajry.e != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajry.e)) {
                            return false;
                        }
                        if (aocd.a(this.f, ajry.f)) {
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajry.unknownFieldData);
                            }
                            aocb aocb2 = ajry.unknownFieldData;
                            return aocb2 == null || aocb2.b();
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        apjs apjs = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = apjs != null ? apjs.hashCode() : 0;
        int i = this.h;
        int i2 = this.i;
        apjo apjo = this.c;
        hashCode = (((((((((((hashCode + hashCode2) * 31) + i) * 31) + i2) * 31) + (apjo != null ? apjo.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.j ? 1237 : 1231)) * 31;
        hashCode2 = this.g;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        ajzw ajzw = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31) + aocd.a(this.f)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajsa[] ajsaArr = this.a;
        int i2 = 0;
        if (ajsaArr != null && ajsaArr.length > 0) {
            i = 0;
            while (true) {
                ajsa[] ajsaArr2 = this.a;
                if (i >= ajsaArr2.length) {
                    break;
                }
                aocf aocf = ajsaArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        i = this.h;
        if (i != 0) {
            aoby.a(3, i);
        }
        i = this.i;
        if (i != 0) {
            aoby.b(4, i);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(7, this.d);
        }
        if (this.j) {
            aoby.a(8, true);
        }
        i = this.g;
        if (!(i == 1 || i == 0)) {
            aoby.a(9, i - 1);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            aoby.a(10, aocf2);
        }
        aygk[] aygkArr = this.f;
        if (aygkArr != null && aygkArr.length > 0) {
            while (true) {
                aygkArr = this.f;
                if (i2 >= aygkArr.length) {
                    break;
                }
                anze = aygkArr[i2];
                if (anze != null) {
                    aoby.a(11, anze);
                }
                i2++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajsa[] ajsaArr = this.a;
        int i2 = 0;
        if (ajsaArr != null && ajsaArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajsa[] ajsaArr2 = this.a;
                if (computeSerializedSize >= ajsaArr2.length) {
                    break;
                }
                aocf aocf = ajsaArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        i = this.h;
        if (i != 0) {
            computeSerializedSize += aoby.c(3, i);
        }
        i = this.i;
        if (i != 0) {
            computeSerializedSize += aoby.d(4, i);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(7, this.d);
        }
        if (this.j) {
            computeSerializedSize += aoby.d(8);
        }
        i = this.g;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(9, i - 1);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(10, aocf2);
        }
        aygk[] aygkArr = this.f;
        if (aygkArr != null && aygkArr.length > 0) {
            while (true) {
                aygkArr = this.f;
                if (i2 >= aygkArr.length) {
                    break;
                }
                anze = aygkArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(11, anze);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            int length;
            switch (a) {
                case 0:
                    break;
                case 10:
                    aocf ajsa;
                    a = aock.a(aobv, 10);
                    ajsa[] ajsaArr = this.a;
                    length = ajsaArr != null ? ajsaArr.length : 0;
                    ajsa[] ajsaArr2 = new ajsa[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajsaArr, 0, ajsaArr2, 0, length);
                    }
                    while (length < ajsaArr2.length - 1) {
                        ajsa = new ajsa();
                        ajsaArr2[length] = ajsa;
                        aobv.a(ajsa);
                        aobv.a();
                        length++;
                    }
                    ajsa = new ajsa();
                    ajsaArr2[length] = ajsa;
                    aobv.a(ajsa);
                    this.a = ajsaArr2;
                    continue;
                case 18:
                    apjs apjs = (apjs) aobv.a(apjs.c.getParserForType());
                    apjs apjs2 = this.b;
                    if (apjs2 != null) {
                        apjr apjr = (apjr) ((anxo) apjs2.toBuilder());
                        apjr.mergeFrom(apjs);
                        apjs = (apjs) ((anxl) apjr.build());
                    }
                    this.b = apjs;
                    continue;
                case 24:
                    this.h = aobv.f();
                    continue;
                case 32:
                    this.i = aobv.f();
                    continue;
                case 42:
                    apjo apjo = (apjo) aobv.a(apjo.f.getParserForType());
                    apjo apjo2 = this.c;
                    if (apjo2 != null) {
                        apjn apjn = (apjn) ((anxo) apjo2.toBuilder());
                        apjn.mergeFrom(apjo);
                        apjo = (apjo) ((anxl) apjn.build());
                    }
                    this.c = apjo;
                    continue;
                case 58:
                    this.d = aobv.e();
                    continue;
                case 64:
                    this.j = aobv.c();
                    continue;
                case 72:
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length == 0 || length == 1 || length == 2) {
                        if (length == 0) {
                            i = 1;
                        } else if (length == 1) {
                            i = 2;
                        } else if (length == 2) {
                            i = 3;
                        }
                        this.g = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 82:
                    if (this.e == null) {
                        this.e = new ajzw();
                    }
                    aobv.a(this.e);
                    continue;
                case 90:
                    a = aock.a(aobv, 90);
                    aygk[] aygkArr = this.f;
                    length = aygkArr != null ? aygkArr.length : 0;
                    aygk[] aygkArr2 = new aygk[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aygkArr, 0, aygkArr2, 0, length);
                    }
                    while (length < aygkArr2.length - 1) {
                        aygkArr2[length] = (aygk) aobv.a(aygk.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aygkArr2[length] = (aygk) aobv.a(aygk.f.getParserForType());
                    this.f = aygkArr2;
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
