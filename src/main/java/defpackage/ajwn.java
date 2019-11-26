package defpackage;

import java.util.Arrays;

/* renamed from: ajwn */
public final class ajwn extends ajwo {
    public arml a;
    public arml b;
    public aphj c;
    public aygk d;
    public String e;
    public byte[] f = aock.c;
    public aphj g;
    public apxu[] h = new apxu[0];
    public boolean i = false;
    public aygo j;
    public atud k;
    public int l;
    private arml m;
    private aygk n;
    private apxu o;
    private String p;
    private apxu[] q;

    public ajwn() {
        super(86135402);
        String str = "";
        this.e = str;
        this.p = str;
        this.q = new apxu[0];
        this.l = 1;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwn) {
            ajwn ajwn = (ajwn) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajwn.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajwn.a)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (ajwn.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajwn.b)) {
                return false;
            }
            aphj aphj = this.c;
            if (aphj == null) {
                if (ajwn.c != null) {
                    return false;
                }
            } else if (!aphj.equals(ajwn.c)) {
                return false;
            }
            arml = this.m;
            if (arml == null) {
                if (ajwn.m != null) {
                    return false;
                }
            } else if (!arml.equals(ajwn.m)) {
                return false;
            }
            aygk aygk = this.d;
            if (aygk == null) {
                if (ajwn.d != null) {
                    return false;
                }
            } else if (!aygk.equals(ajwn.d)) {
                return false;
            }
            aygk = this.n;
            if (aygk == null) {
                if (ajwn.n != null) {
                    return false;
                }
            } else if (!aygk.equals(ajwn.n)) {
                return false;
            }
            String str = this.e;
            if (str == null) {
                if (ajwn.e != null) {
                    return false;
                }
            } else if (!str.equals(ajwn.e)) {
                return false;
            }
            if (Arrays.equals(this.f, ajwn.f)) {
                aphj = this.g;
                if (aphj == null) {
                    if (ajwn.g != null) {
                        return false;
                    }
                } else if (!aphj.equals(ajwn.g)) {
                    return false;
                }
                apxu apxu = this.o;
                if (apxu == null) {
                    if (ajwn.o != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajwn.o)) {
                    return false;
                }
                if (aocd.a(this.h, ajwn.h) && this.i == ajwn.i) {
                    aygo aygo = this.j;
                    if (aygo == null) {
                        if (ajwn.j != null) {
                            return false;
                        }
                    } else if (!aygo.equals(ajwn.j)) {
                        return false;
                    }
                    str = this.p;
                    if (str == null) {
                        if (ajwn.p != null) {
                            return false;
                        }
                    } else if (!str.equals(ajwn.p)) {
                        return false;
                    }
                    if (aocd.a(this.q, ajwn.q)) {
                        atud atud = this.k;
                        if (atud == null) {
                            if (ajwn.k != null) {
                                return false;
                            }
                        } else if (!atud.equals(ajwn.k)) {
                            return false;
                        }
                        if (this.l == ajwn.l) {
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajwn.unknownFieldData);
                            }
                            aocb aocb2 = ajwn.unknownFieldData;
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
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        aphj aphj = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        arml2 = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        aygk aygk = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        aygk = this.n;
        hashCode = (((hashCode + hashCode2) * 31) + (aygk != null ? aygk.hashCode() : 0)) * 31;
        String str = this.e;
        hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.f);
        aphj aphj2 = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        apxu apxu = this.o;
        hashCode = (((((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31) + aocd.a(this.h)) * 31;
        hashCode2 = !this.i ? 1237 : 1231;
        aygo aygo = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (aygo != null ? aygo.hashCode() : 0)) * 31;
        str = this.p;
        hashCode2 = str != null ? str.hashCode() : 0;
        hashCode3 = aocd.a(this.q);
        atud atud = this.k;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (atud != null ? atud.hashCode() : 0)) * 31;
        hashCode2 = this.l;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(6, anze);
        }
        String str = this.e;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(7, this.e);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            aoby.a(9, this.f);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(11, anze);
        }
        apxu[] apxuArr = this.h;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.h;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(12, anze2);
                }
                i++;
            }
        }
        if (this.i) {
            aoby.a(13, true);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(14, anze);
        }
        str = this.p;
        if (!(str == null || str.equals(str2))) {
            aoby.a(16, this.p);
        }
        apxuArr = this.q;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.q;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    aoby.a(19, anze);
                }
                i2++;
            }
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(20, anze);
        }
        i = this.l;
        if (!(i == 1 || i == 0)) {
            aoby.a(22, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        String str = this.e;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(7, this.e);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            computeSerializedSize += aoby.b(9, this.f);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        apxu[] apxuArr = this.h;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.h;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(12, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (this.i) {
            computeSerializedSize += aoby.d(13);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        str = this.p;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(16, this.p);
        }
        apxuArr = this.q;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.q;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(19, anze);
                }
                i2++;
            }
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        i = this.l;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(22, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            arml arml;
            arml arml2;
            armk armk;
            aphj aphj;
            aphj aphj2;
            aphm aphm;
            aygk aygk;
            aygk aygk2;
            aygj aygj;
            apxu[] apxuArr;
            int length;
            apxu[] apxuArr2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.a;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 18:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 26:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.c;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.c = aphj;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.m;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.m = arml;
                    continue;
                case 42:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.d;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.d = aygk;
                    continue;
                case cv.aU /*50*/:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.n;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.n = aygk;
                    continue;
                case 58:
                    this.e = aobv.d();
                    continue;
                case 74:
                    this.f = aobv.e();
                    continue;
                case 82:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.g;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.g = aphj;
                    continue;
                case 90:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.o;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.o = apxu;
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    apxuArr = this.h;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.h = apxuArr2;
                    continue;
                case 104:
                    this.i = aobv.c();
                    continue;
                case 114:
                    aygo aygo = (aygo) aobv.a(aygo.c.getParserForType());
                    aygo aygo2 = this.j;
                    if (aygo2 != null) {
                        aygr aygr = (aygr) ((anxo) aygo2.toBuilder());
                        aygr.mergeFrom(aygo);
                        aygo = (aygo) ((anxl) aygr.build());
                    }
                    this.j = aygo;
                    continue;
                case 130:
                    this.p = aobv.d();
                    continue;
                case 154:
                    a = aock.a(aobv, 154);
                    apxuArr = this.q;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.q = apxuArr2;
                    continue;
                case 162:
                    atud atud = (atud) aobv.a(atud.c.getParserForType());
                    atud atud2 = this.k;
                    if (atud2 != null) {
                        atuc atuc = (atuc) ((anxo) atud2.toBuilder());
                        atuc.mergeFrom(atud);
                        atud = (atud) ((anxl) atuc.build());
                    }
                    this.k = atud;
                    continue;
                case 176:
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length == 0 || length == 1) {
                        if (length == 0) {
                            i = 1;
                        } else if (length == 1) {
                            i = 2;
                        }
                        this.l = i;
                        break;
                    }
                    aobv.e(i2);
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
