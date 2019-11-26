package defpackage;

import java.util.Arrays;

/* renamed from: ajwd */
public final class ajwd extends ajwo {
    public ajwg[] a;
    public arml b;
    public byte[] c;
    public int d;
    public int e;
    private arvp[] f;
    private apxu g;
    private int h;
    private ajzw i;
    private ajzw j;

    public ajwd() {
        super(51431404);
        if (ajwg.a == null) {
            synchronized (aocd.b) {
                if (ajwg.a == null) {
                    ajwg.a = new ajwg[0];
                }
            }
        }
        this.a = ajwg.a;
        this.c = aock.c;
        this.f = new arvp[0];
        this.d = 0;
        this.e = 0;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwd) {
            ajwd ajwd = (ajwd) obj;
            if (aocd.a(this.a, ajwd.a)) {
                arml arml = this.b;
                if (arml == null) {
                    if (ajwd.b != null) {
                        return false;
                    }
                } else if (!arml.equals(ajwd.b)) {
                    return false;
                }
                if (Arrays.equals(this.c, ajwd.c) && aocd.a(this.f, ajwd.f) && this.d == ajwd.d && this.e == ajwd.e) {
                    apxu apxu = this.g;
                    if (apxu == null) {
                        if (ajwd.g != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajwd.g)) {
                        return false;
                    }
                    if (this.h == ajwd.h) {
                        ajzw ajzw = this.i;
                        if (ajzw == null) {
                            if (ajwd.i != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajwd.i)) {
                            return false;
                        }
                        ajzw = this.j;
                        if (ajzw == null) {
                            if (ajwd.j != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajwd.j)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajwd.unknownFieldData);
                        }
                        aocb aocb2 = ajwd.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        arml arml = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.c);
        int a2 = aocd.a(this.f);
        int i = this.d;
        int i2 = this.e;
        apxu apxu = this.g;
        hashCode = (((((((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a2) * 31) + i) * 31) + i2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        hashCode3 = this.h;
        ajzw ajzw = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw ajzw2 = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajwg[] ajwgArr = this.a;
        int i2 = 0;
        if (ajwgArr != null && ajwgArr.length > 0) {
            i = 0;
            while (true) {
                ajwg[] ajwgArr2 = this.a;
                if (i >= ajwgArr2.length) {
                    break;
                }
                aocf aocf = ajwgArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        arvp[] arvpArr = this.f;
        if (arvpArr != null && arvpArr.length > 0) {
            while (true) {
                arvpArr = this.f;
                if (i2 >= arvpArr.length) {
                    break;
                }
                anze = arvpArr[i2];
                if (anze != null) {
                    aoby.a(5, anze);
                }
                i2++;
            }
        }
        i = this.d;
        if (i != 0) {
            aoby.a(6, i);
        }
        i = this.e;
        if (i != 0) {
            aoby.a(7, i);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(8, anze);
        }
        i = this.h;
        if (i != 0) {
            aoby.a(9, i);
        }
        aocf aocf2 = this.i;
        if (aocf2 != null) {
            aoby.a(11, aocf2);
        }
        aocf2 = this.j;
        if (aocf2 != null) {
            aoby.a(12, aocf2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajwg[] ajwgArr = this.a;
        int i2 = 0;
        if (ajwgArr != null && ajwgArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajwg[] ajwgArr2 = this.a;
                if (computeSerializedSize >= ajwgArr2.length) {
                    break;
                }
                aocf aocf = ajwgArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        arvp[] arvpArr = this.f;
        if (arvpArr != null && arvpArr.length > 0) {
            while (true) {
                arvpArr = this.f;
                if (i2 >= arvpArr.length) {
                    break;
                }
                anze = arvpArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(5, anze);
                }
                i2++;
            }
        }
        i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.c(6, i);
        }
        i = this.e;
        if (i != 0) {
            computeSerializedSize += aoby.c(7, i);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        i = this.h;
        if (i != 0) {
            computeSerializedSize += aoby.c(9, i);
        }
        aocf aocf2 = this.i;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(11, aocf2);
        }
        aocf2 = this.j;
        return aocf2 != null ? computeSerializedSize + aoby.b(12, aocf2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            switch (a) {
                case 0:
                    break;
                case 10:
                    aocf ajwg;
                    a = aock.a(aobv, 10);
                    ajwg[] ajwgArr = this.a;
                    length = ajwgArr != null ? ajwgArr.length : 0;
                    ajwg[] ajwgArr2 = new ajwg[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajwgArr, 0, ajwgArr2, 0, length);
                    }
                    while (length < ajwgArr2.length - 1) {
                        ajwg = new ajwg();
                        ajwgArr2[length] = ajwg;
                        aobv.a(ajwg);
                        aobv.a();
                        length++;
                    }
                    ajwg = new ajwg();
                    ajwgArr2[length] = ajwg;
                    aobv.a(ajwg);
                    this.a = ajwgArr2;
                    continue;
                case 26:
                    arml arml = (arml) aobv.a(arml.f.getParserForType());
                    arml arml2 = this.b;
                    if (arml2 != null) {
                        armk armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 34:
                    this.c = aobv.e();
                    continue;
                case 42:
                    a = aock.a(aobv, 42);
                    arvp[] arvpArr = this.f;
                    length = arvpArr != null ? arvpArr.length : 0;
                    arvp[] arvpArr2 = new arvp[(a + length)];
                    if (length != 0) {
                        System.arraycopy(arvpArr, 0, arvpArr2, 0, length);
                    }
                    while (length < arvpArr2.length - 1) {
                        arvpArr2[length] = (arvp) aobv.a(arvp.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    arvpArr2[length] = (arvp) aobv.a(arvp.d.getParserForType());
                    this.f = arvpArr2;
                    continue;
                case 48:
                    this.d = aobv.f();
                    continue;
                case cv.ba /*56*/:
                    this.e = aobv.f();
                    continue;
                case 66:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case 72:
                    this.h = aobv.f();
                    continue;
                case 90:
                    if (this.i == null) {
                        this.i = new ajzw();
                    }
                    aobv.a(this.i);
                    continue;
                case 98:
                    if (this.j == null) {
                        this.j = new ajzw();
                    }
                    aobv.a(this.j);
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
