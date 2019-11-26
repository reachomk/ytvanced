package defpackage;

import java.util.Arrays;

/* renamed from: akcj */
public final class akcj extends aoca {
    public byte[] a = aock.c;
    public apxu b;
    public apxu[] c;
    public arzy d;
    public String[] e;
    private String f;
    private asac g;
    private byte[] h;
    private boolean i;
    private byte[] j;
    private String k;
    private String l;
    private asae m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private byte[] q;
    private byte[] r;
    private int s;
    private int t;

    public akcj() {
        String str = "";
        this.f = str;
        this.h = aock.c;
        this.i = false;
        this.j = aock.c;
        this.k = str;
        this.c = new apxu[0];
        this.l = str;
        this.e = aock.b;
        this.n = aock.c;
        this.o = aock.c;
        this.s = 1;
        this.t = 1;
        this.p = aock.c;
        this.q = aock.c;
        this.r = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcj) {
            akcj akcj = (akcj) obj;
            if (Arrays.equals(this.a, akcj.a)) {
                String str = this.f;
                if (str == null) {
                    if (akcj.f != null) {
                        return false;
                    }
                } else if (!str.equals(akcj.f)) {
                    return false;
                }
                asac asac = this.g;
                if (asac == null) {
                    if (akcj.g != null) {
                        return false;
                    }
                } else if (!asac.equals(akcj.g)) {
                    return false;
                }
                if (Arrays.equals(this.h, akcj.h) && this.i == akcj.i && Arrays.equals(this.j, akcj.j)) {
                    str = this.k;
                    if (str == null) {
                        if (akcj.k != null) {
                            return false;
                        }
                    } else if (!str.equals(akcj.k)) {
                        return false;
                    }
                    apxu apxu = this.b;
                    if (apxu == null) {
                        if (akcj.b != null) {
                            return false;
                        }
                    } else if (!apxu.equals(akcj.b)) {
                        return false;
                    }
                    if (aocd.a(this.c, akcj.c)) {
                        arzy arzy = this.d;
                        if (arzy == null) {
                            if (akcj.d != null) {
                                return false;
                            }
                        } else if (!arzy.equals(akcj.d)) {
                            return false;
                        }
                        str = this.l;
                        if (str == null) {
                            if (akcj.l != null) {
                                return false;
                            }
                        } else if (!str.equals(akcj.l)) {
                            return false;
                        }
                        if (aocd.a(this.e, akcj.e)) {
                            asae asae = this.m;
                            if (asae == null) {
                                if (akcj.m != null) {
                                    return false;
                                }
                            } else if (!asae.equals(akcj.m)) {
                                return false;
                            }
                            if (Arrays.equals(this.n, akcj.n) && Arrays.equals(this.o, akcj.o) && this.s == akcj.s && this.t == akcj.t && Arrays.equals(this.p, akcj.p) && Arrays.equals(this.q, akcj.q) && Arrays.equals(this.r, akcj.r)) {
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(akcj.unknownFieldData);
                                }
                                aocb aocb2 = akcj.unknownFieldData;
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
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.a)) * 31;
        String str = this.f;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        asac asac = this.g;
        hashCode = (((((((((hashCode + hashCode2) * 31) + (asac != null ? asac.hashCode() : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + (!this.i ? 1237 : 1231)) * 31) + Arrays.hashCode(this.j)) * 31;
        str = this.k;
        hashCode2 = str != null ? str.hashCode() : 0;
        apxu apxu = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.c);
        arzy arzy = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (arzy != null ? arzy.hashCode() : 0)) * 31;
        str = this.l;
        hashCode2 = str != null ? str.hashCode() : 0;
        a = aocd.a(this.e);
        asae asae = this.m;
        hashCode = (((((((((hashCode + hashCode2) * 31) + a) * 31) + (asae != null ? asae.hashCode() : 0)) * 31) + Arrays.hashCode(this.n)) * 31) + Arrays.hashCode(this.o)) * 31;
        hashCode2 = this.s;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = this.t;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (((((((hashCode + hashCode2) * 31) + Arrays.hashCode(this.p)) * 31) + Arrays.hashCode(this.q)) * 31) + Arrays.hashCode(this.r)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        if (!Arrays.equals(this.a, aock.c)) {
            aoby.a(4, this.a);
        }
        String str = this.f;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.f);
        }
        anze anze = this.g;
        if (anze != null) {
            aoby.a(6, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(9, this.h);
        }
        if (this.i) {
            aoby.a(10, true);
        }
        if (!Arrays.equals(this.j, aock.c)) {
            aoby.a(11, this.j);
        }
        str = this.k;
        if (!(str == null || str.equals(str2))) {
            aoby.a(12, this.k);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(16, anze);
        }
        apxu[] apxuArr = this.c;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(17, anze2);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(18, anze);
        }
        str = this.l;
        if (!(str == null || str.equals(str2))) {
            aoby.a(19, this.l);
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.e;
                if (i2 >= strArr.length) {
                    break;
                }
                str = strArr[i2];
                if (str != null) {
                    aoby.a(20, str);
                }
                i2++;
            }
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(21, anze);
        }
        if (!Arrays.equals(this.n, aock.c)) {
            aoby.a(22, this.n);
        }
        if (!Arrays.equals(this.o, aock.c)) {
            aoby.a(23, this.o);
        }
        i = this.s;
        if (!(i == 1 || i == 0)) {
            aoby.a(24, i - 1);
        }
        i = this.t;
        if (!(i == 1 || i == 0)) {
            aoby.a(25, i - 1);
        }
        if (!Arrays.equals(this.p, aock.c)) {
            aoby.a(26, this.p);
        }
        if (!Arrays.equals(this.q, aock.c)) {
            aoby.a(27, this.q);
        }
        if (!Arrays.equals(this.r, aock.c)) {
            aoby.a(28, this.r);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.a, aock.c)) {
            computeSerializedSize += aoby.b(4, this.a);
        }
        String str = this.f;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(5, this.f);
        }
        anze anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(9, this.h);
        }
        if (this.i) {
            computeSerializedSize += aoby.d(10);
        }
        if (!Arrays.equals(this.j, aock.c)) {
            computeSerializedSize += aoby.b(11, this.j);
        }
        str = this.k;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(12, this.k);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        apxu[] apxuArr = this.c;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(17, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        str = this.l;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(19, this.l);
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i2];
                if (str3 != null) {
                    i3++;
                    i += aoby.b(str3);
                }
                i2++;
            }
            computeSerializedSize = (computeSerializedSize + i) + (i3 + i3);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        if (!Arrays.equals(this.n, aock.c)) {
            computeSerializedSize += aoby.b(22, this.n);
        }
        if (!Arrays.equals(this.o, aock.c)) {
            computeSerializedSize += aoby.b(23, this.o);
        }
        i = this.s;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(24, i - 1);
        }
        i = this.t;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(25, i - 1);
        }
        if (!Arrays.equals(this.p, aock.c)) {
            computeSerializedSize += aoby.b(26, this.p);
        }
        if (!Arrays.equals(this.q, aock.c)) {
            computeSerializedSize += aoby.b(27, this.q);
        }
        return !Arrays.equals(this.r, aock.c) ? computeSerializedSize + aoby.b(28, this.r) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 3;
            int length;
            int i2;
            int f;
            switch (a) {
                case 0:
                    break;
                case 34:
                    this.a = aobv.e();
                    continue;
                case 42:
                    this.f = aobv.d();
                    continue;
                case cv.aU /*50*/:
                    asac asac = (asac) aobv.a(asac.a.getParserForType());
                    asac asac2 = this.g;
                    if (asac2 != null) {
                        asaf asaf = (asaf) ((anxo) asac2.toBuilder());
                        asaf.mergeFrom(asac);
                        asac = (asac) ((anxl) asaf.build());
                    }
                    this.g = asac;
                    continue;
                case 74:
                    this.h = aobv.e();
                    continue;
                case 80:
                    this.i = aobv.c();
                    continue;
                case 90:
                    this.j = aobv.e();
                    continue;
                case 98:
                    this.k = aobv.d();
                    continue;
                case 130:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.b;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.b = apxu;
                    continue;
                case 138:
                    a = aock.a(aobv, 138);
                    apxu[] apxuArr = this.c;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxu[] apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.c = apxuArr2;
                    continue;
                case 146:
                    arzy arzy = (arzy) aobv.a(arzy.d.getParserForType());
                    arzy arzy2 = this.d;
                    if (arzy2 != null) {
                        asab asab = (asab) ((anxo) arzy2.toBuilder());
                        asab.mergeFrom(arzy);
                        arzy = (arzy) ((anxl) asab.build());
                    }
                    this.d = arzy;
                    continue;
                case 154:
                    this.l = aobv.d();
                    continue;
                case 162:
                    a = aock.a(aobv, 162);
                    String[] strArr = this.e;
                    length = strArr != null ? strArr.length : 0;
                    String[] strArr2 = new String[(a + length)];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = aobv.d();
                        aobv.a();
                        length++;
                    }
                    strArr2[length] = aobv.d();
                    this.e = strArr2;
                    continue;
                case 170:
                    asae asae = (asae) aobv.a(asae.a.getParserForType());
                    asae asae2 = this.m;
                    if (asae2 != null) {
                        asah asah = (asah) ((anxo) asae2.toBuilder());
                        asah.mergeFrom(asae);
                        asae = (asae) ((anxl) asah.build());
                    }
                    this.m = asae;
                    continue;
                case 178:
                    this.n = aobv.e();
                    continue;
                case 186:
                    this.o = aobv.e();
                    continue;
                case 192:
                    i2 = aobv.b;
                    f = aobv.f();
                    switch (f) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            switch (f) {
                                case 0:
                                    i = 1;
                                    break;
                                case 1:
                                    i = 2;
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    i = 4;
                                    break;
                                case 4:
                                    i = 5;
                                    break;
                                case 5:
                                    i = 6;
                                    break;
                                case 6:
                                    i = 7;
                                    break;
                                case 7:
                                    i = 8;
                                    break;
                                case 8:
                                    i = 9;
                                    break;
                                case 9:
                                    i = 10;
                                    break;
                                case 10:
                                    i = 11;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            this.s = i;
                            break;
                        default:
                            aobv.e(i2);
                            storeUnknownField(aobv, a);
                            continue;
                    }
                case 200:
                    i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f != 2) {
                            i = 0;
                        }
                        this.t = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 210:
                    this.p = aobv.e();
                    continue;
                case 218:
                    this.q = aobv.e();
                    continue;
                case 226:
                    this.r = aobv.e();
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
