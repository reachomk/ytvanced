package defpackage;

import java.util.Arrays;

/* renamed from: ajzj */
public final class ajzj extends ajwo implements ajyl {
    public aygk a;
    public arml b;
    public arml c;
    public arml d;
    public aygk e;
    public arml f;
    public apxu g;
    public awsw h;
    public String[] i = aock.b;
    public String[] j = aock.b;
    public byte[] k;
    public apxu l;
    public auvr m;
    public aojc n;
    public String o;
    public int p;
    private boolean q;
    private String r;
    private arml s;
    private String t;
    private apxu[] u;
    private arml v;
    private String w;
    private ayfu[] x;

    public ajzj() {
        super(62887855);
        String str = "";
        this.r = str;
        this.t = str;
        this.k = aock.c;
        this.u = new apxu[0];
        this.w = str;
        this.x = new ayfu[0];
        this.p = 1;
        this.o = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzj) {
            ajzj ajzj = (ajzj) obj;
            String str = this.r;
            if (str == null) {
                if (ajzj.r != null) {
                    return false;
                }
            } else if (!str.equals(ajzj.r)) {
                return false;
            }
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajzj.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajzj.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajzj.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajzj.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajzj.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajzj.c)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajzj.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajzj.d)) {
                return false;
            }
            arml = this.s;
            if (arml == null) {
                if (ajzj.s != null) {
                    return false;
                }
            } else if (!arml.equals(ajzj.s)) {
                return false;
            }
            aygk = this.e;
            if (aygk == null) {
                if (ajzj.e != null) {
                    return false;
                }
            } else if (!aygk.equals(ajzj.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajzj.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajzj.f)) {
                return false;
            }
            apxu apxu = this.g;
            if (apxu == null) {
                if (ajzj.g != null) {
                    return false;
                }
            } else if (!apxu.equals(ajzj.g)) {
                return false;
            }
            awsw awsw = this.h;
            if (awsw == null) {
                if (ajzj.h != null) {
                    return false;
                }
            } else if (!awsw.equals(ajzj.h)) {
                return false;
            }
            if (aocd.a(this.i, ajzj.i) && aocd.a(this.j, ajzj.j)) {
                str = this.t;
                if (str == null) {
                    if (ajzj.t != null) {
                        return false;
                    }
                } else if (!str.equals(ajzj.t)) {
                    return false;
                }
                if (Arrays.equals(this.k, ajzj.k) && aocd.a(this.u, ajzj.u)) {
                    apxu = this.l;
                    if (apxu == null) {
                        if (ajzj.l != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajzj.l)) {
                        return false;
                    }
                    auvr auvr = this.m;
                    if (auvr == null) {
                        if (ajzj.m != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajzj.m)) {
                        return false;
                    }
                    arml = this.v;
                    if (arml == null) {
                        if (ajzj.v != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajzj.v)) {
                        return false;
                    }
                    str = this.w;
                    if (str == null) {
                        if (ajzj.w != null) {
                            return false;
                        }
                    } else if (!str.equals(ajzj.w)) {
                        return false;
                    }
                    if (aocd.a(this.x, ajzj.x)) {
                        aojc aojc = this.n;
                        if (aojc == null) {
                            if (ajzj.n != null) {
                                return false;
                            }
                        } else if (!aojc.equals(ajzj.n)) {
                            return false;
                        }
                        if (this.p == ajzj.p) {
                            str = this.o;
                            if (str == null) {
                                if (ajzj.o != null) {
                                    return false;
                                }
                            } else if (!str.equals(ajzj.o)) {
                                return false;
                            }
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajzj.unknownFieldData);
                            }
                            aocb aocb2 = ajzj.unknownFieldData;
                            return aocb2 == null || aocb2.b();
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.r;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        aygk aygk = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.s;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aygk = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        awsw awsw = this.h;
        hashCode = (((((((hashCode + hashCode2) * 31) + (awsw != null ? awsw.hashCode() : 0)) * 31) + aocd.a(this.i)) * 31) + aocd.a(this.j)) * 31;
        str = this.t;
        hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.k);
        int a = aocd.a(this.u);
        apxu apxu2 = this.l;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        auvr auvr = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auvr != null ? auvr.hashCode() : 0;
        arml = this.v;
        hashCode = (((hashCode + hashCode2) * 31) + (arml != null ? arml.hashCode() : 0)) * 31;
        str = this.w;
        hashCode2 = str != null ? str.hashCode() : 0;
        hashCode3 = aocd.a(this.x);
        aojc aojc = this.n;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (aojc != null ? aojc.hashCode() : 0)) * 31;
        hashCode2 = this.p;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        String[] strArr;
        String str;
        String str2 = this.r;
        String str3 = "";
        if (!(str2 == null || str2.equals(str3))) {
            aoby.a(1, this.r);
        }
        anze anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.s;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(10, anze);
        }
        String[] strArr2 = this.i;
        int i2 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.i;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    aoby.a(11, str);
                }
                i++;
            }
        }
        strArr2 = this.j;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            while (true) {
                strArr = this.j;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    aoby.a(12, str);
                }
                i++;
            }
        }
        str2 = this.t;
        if (!(str2 == null || str2.equals(str3))) {
            aoby.a(14, this.t);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            aoby.a(16, this.k);
        }
        apxu[] apxuArr = this.u;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.u;
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
        anze = this.l;
        if (anze != null) {
            aoby.a(18, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(19, anze);
        }
        anze = this.v;
        if (anze != null) {
            aoby.a(20, anze);
        }
        str2 = this.w;
        if (!(str2 == null || str2.equals(str3))) {
            aoby.a(21, this.w);
        }
        ayfu[] ayfuArr = this.x;
        if (ayfuArr != null && ayfuArr.length > 0) {
            while (true) {
                ayfuArr = this.x;
                if (i2 >= ayfuArr.length) {
                    break;
                }
                anze = ayfuArr[i2];
                if (anze != null) {
                    aoby.a(22, anze);
                }
                i2++;
            }
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(25, anze);
        }
        i = this.p;
        if (!(i == 1 || i == 0)) {
            aoby.a(27, i - 1);
        }
        str2 = this.o;
        if (!(str2 == null || str2.equals(str3))) {
            aoby.a(29, this.o);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int i2;
        int i3;
        String[] strArr;
        String str;
        int computeSerializedSize = super.computeSerializedSize();
        String str2 = this.r;
        String str3 = "";
        if (!(str2 == null || str2.equals(str3))) {
            computeSerializedSize += aoby.b(1, this.r);
        }
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.s;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        String[] strArr2 = this.i;
        int i4 = 0;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.i;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += aoby.b(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + i3;
        }
        strArr2 = this.j;
        if (strArr2 != null && strArr2.length > 0) {
            i = 0;
            i2 = 0;
            i3 = 0;
            while (true) {
                strArr = this.j;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    i3++;
                    i2 += aoby.b(str);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + i3;
        }
        str2 = this.t;
        if (!(str2 == null || str2.equals(str3))) {
            computeSerializedSize += aoby.b(14, this.t);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            computeSerializedSize += aoby.b(16, this.k);
        }
        apxu[] apxuArr = this.u;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.u;
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
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(19, anze);
        }
        anze = this.v;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        str2 = this.w;
        if (!(str2 == null || str2.equals(str3))) {
            computeSerializedSize += aoby.b(21, this.w);
        }
        ayfu[] ayfuArr = this.x;
        if (ayfuArr != null && ayfuArr.length > 0) {
            while (true) {
                ayfuArr = this.x;
                if (i4 >= ayfuArr.length) {
                    break;
                }
                anze = ayfuArr[i4];
                if (anze != null) {
                    computeSerializedSize += anwm.c(22, anze);
                }
                i4++;
            }
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(25, anze);
        }
        i = this.p;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(27, i - 1);
        }
        str2 = this.o;
        return (str2 == null || str2.equals(str3)) ? computeSerializedSize : computeSerializedSize + aoby.b(29, this.o);
    }

    public final boolean a() {
        return this.q;
    }

    public final void b() {
        this.q = true;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            aygk aygk;
            aygk aygk2;
            aygj aygj;
            arml arml;
            arml arml2;
            armk armk;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            String[] strArr;
            int length;
            String[] strArr2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.r = aobv.d();
                    continue;
                case 18:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.a;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.a = aygk;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.c;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case cv.aU /*50*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.s;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.s = arml;
                    continue;
                case 58:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.e;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.e = aygk;
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 74:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case 82:
                    awsw awsw = (awsw) aobv.a(awsw.c.getParserForType());
                    awsw awsw2 = this.h;
                    if (awsw2 != null) {
                        awsz awsz = (awsz) ((anxo) awsw2.toBuilder());
                        awsz.mergeFrom(awsw);
                        awsw = (awsw) ((anxl) awsz.build());
                    }
                    this.h = awsw;
                    continue;
                case 90:
                    a = aock.a(aobv, 90);
                    strArr = this.i;
                    length = strArr != null ? strArr.length : 0;
                    strArr2 = new String[(a + length)];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = aobv.d();
                        aobv.a();
                        length++;
                    }
                    strArr2[length] = aobv.d();
                    this.i = strArr2;
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    strArr = this.j;
                    length = strArr != null ? strArr.length : 0;
                    strArr2 = new String[(a + length)];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = aobv.d();
                        aobv.a();
                        length++;
                    }
                    strArr2[length] = aobv.d();
                    this.j = strArr2;
                    continue;
                case 114:
                    this.t = aobv.d();
                    continue;
                case 130:
                    this.k = aobv.e();
                    continue;
                case 138:
                    a = aock.a(aobv, 138);
                    apxu[] apxuArr = this.u;
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
                    this.u = apxuArr2;
                    continue;
                case 146:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.l;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.l = apxu;
                    continue;
                case 154:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.m;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.m = auvr;
                    continue;
                case 162:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.v;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.v = arml;
                    continue;
                case 170:
                    this.w = aobv.d();
                    continue;
                case 178:
                    a = aock.a(aobv, 178);
                    ayfu[] ayfuArr = this.x;
                    length = ayfuArr != null ? ayfuArr.length : 0;
                    ayfu[] ayfuArr2 = new ayfu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ayfuArr, 0, ayfuArr2, 0, length);
                    }
                    while (length < ayfuArr2.length - 1) {
                        ayfuArr2[length] = (ayfu) aobv.a(ayfu.q.getParserForType());
                        aobv.a();
                        length++;
                    }
                    ayfuArr2[length] = (ayfu) aobv.a(ayfu.q.getParserForType());
                    this.x = ayfuArr2;
                    continue;
                case 202:
                    aojc aojc = (aojc) aobv.a(aojc.f.getParserForType());
                    aojc aojc2 = this.n;
                    if (aojc2 != null) {
                        aojf aojf = (aojf) ((anxo) aojc2.toBuilder());
                        aojf.mergeFrom(aojc);
                        aojc = (aojc) ((anxl) aojf.build());
                    }
                    this.n = aojc;
                    continue;
                case 216:
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length == 0 || length == 1 || length == 2 || length == 3 || length == 4 || length == 5) {
                        if (length == 0) {
                            i = 1;
                        } else if (length == 1) {
                            i = 2;
                        } else if (length == 2) {
                            i = 3;
                        } else if (length == 3) {
                            i = 4;
                        } else if (length == 4) {
                            i = 5;
                        } else if (length == 5) {
                            i = 6;
                        }
                        this.p = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 234:
                    this.o = aobv.d();
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
