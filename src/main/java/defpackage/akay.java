package defpackage;

import java.util.Arrays;

/* renamed from: akay */
public final class akay extends ajwo {
    public arml a;
    public arml b;
    public arml c;
    public axpe[] d;
    public akav e;
    public arml f;
    public azcm g;
    public apdh[] h;
    public apdx i;
    public apdx j;
    public String k;
    public arml l;
    public byte[] m;
    public apxu n;
    public boolean o;
    public axpg p;
    public axpg q;
    public ajzw r;
    public int s;

    public akay() {
        super(119167901);
        this.d = new axpe[0];
        this.e = null;
        this.h = new apdh[0];
        this.k = "";
        this.m = aock.c;
        this.o = false;
        this.r = null;
        this.s = 1;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akay) {
            akay akay = (akay) obj;
            arml arml = this.a;
            if (arml == null) {
                if (akay.a != null) {
                    return false;
                }
            } else if (!arml.equals(akay.a)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (akay.b != null) {
                    return false;
                }
            } else if (!arml.equals(akay.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (akay.c != null) {
                    return false;
                }
            } else if (!arml.equals(akay.c)) {
                return false;
            }
            if (aocd.a(this.d, akay.d)) {
                akav akav = this.e;
                if (akav == null) {
                    if (akay.e != null) {
                        return false;
                    }
                } else if (!akav.equals(akay.e)) {
                    return false;
                }
                arml = this.f;
                if (arml == null) {
                    if (akay.f != null) {
                        return false;
                    }
                } else if (!arml.equals(akay.f)) {
                    return false;
                }
                azcm azcm = this.g;
                if (azcm == null) {
                    if (akay.g != null) {
                        return false;
                    }
                } else if (!azcm.equals(akay.g)) {
                    return false;
                }
                if (aocd.a(this.h, akay.h)) {
                    apdx apdx = this.i;
                    if (apdx == null) {
                        if (akay.i != null) {
                            return false;
                        }
                    } else if (!apdx.equals(akay.i)) {
                        return false;
                    }
                    apdx = this.j;
                    if (apdx == null) {
                        if (akay.j != null) {
                            return false;
                        }
                    } else if (!apdx.equals(akay.j)) {
                        return false;
                    }
                    String str = this.k;
                    if (str == null) {
                        if (akay.k != null) {
                            return false;
                        }
                    } else if (!str.equals(akay.k)) {
                        return false;
                    }
                    arml = this.l;
                    if (arml == null) {
                        if (akay.l != null) {
                            return false;
                        }
                    } else if (!arml.equals(akay.l)) {
                        return false;
                    }
                    if (Arrays.equals(this.m, akay.m)) {
                        apxu apxu = this.n;
                        if (apxu == null) {
                            if (akay.n != null) {
                                return false;
                            }
                        } else if (!apxu.equals(akay.n)) {
                            return false;
                        }
                        if (this.o == akay.o) {
                            axpg axpg = this.p;
                            if (axpg == null) {
                                if (akay.p != null) {
                                    return false;
                                }
                            } else if (!axpg.equals(akay.p)) {
                                return false;
                            }
                            axpg = this.q;
                            if (axpg == null) {
                                if (akay.q != null) {
                                    return false;
                                }
                            } else if (!axpg.equals(akay.q)) {
                                return false;
                            }
                            ajzw ajzw = this.r;
                            if (ajzw == null) {
                                if (akay.r != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(akay.r)) {
                                return false;
                            }
                            if (this.s == akay.s) {
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(akay.unknownFieldData);
                                }
                                aocb aocb2 = akay.unknownFieldData;
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
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        int a = aocd.a(this.d);
        akav akav = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = akav != null ? akav.hashCode() : 0;
        arml2 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        azcm azcm = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azcm != null ? azcm.hashCode() : 0;
        a = aocd.a(this.h);
        apdx apdx = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = apdx != null ? apdx.hashCode() : 0;
        apdx apdx2 = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (apdx2 != null ? apdx2.hashCode() : 0)) * 31;
        String str = this.k;
        hashCode2 = str != null ? str.hashCode() : 0;
        arml2 = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        a = Arrays.hashCode(this.m);
        apxu apxu = this.n;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        hashCode2 = !this.o ? 1237 : 1231;
        axpg axpg = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axpg != null ? axpg.hashCode() : 0;
        axpg = this.q;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axpg != null ? axpg.hashCode() : 0;
        ajzw ajzw = this.r;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        hashCode2 = this.s;
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
            aoby.a(3, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        axpe[] axpeArr = this.d;
        int i2 = 0;
        if (axpeArr != null && axpeArr.length > 0) {
            i = 0;
            while (true) {
                axpe[] axpeArr2 = this.d;
                if (i >= axpeArr2.length) {
                    break;
                }
                anze anze2 = axpeArr2[i];
                if (anze2 != null) {
                    aoby.a(6, anze2);
                }
                i++;
            }
        }
        aocf aocf = this.e;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(10, anze);
        }
        apdh[] apdhArr = this.h;
        if (apdhArr != null && apdhArr.length > 0) {
            while (true) {
                apdhArr = this.h;
                if (i2 >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[i2];
                if (anze != null) {
                    aoby.a(11, anze);
                }
                i2++;
            }
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(12, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(13, anze);
        }
        String str = this.k;
        if (!(str == null || str.equals(""))) {
            aoby.a(14, this.k);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(15, anze);
        }
        if (!Arrays.equals(this.m, aock.c)) {
            aoby.a(17, this.m);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(18, anze);
        }
        if (this.o) {
            aoby.a(19, true);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(21, anze);
        }
        aocf = this.r;
        if (aocf != null) {
            aoby.a(22, aocf);
        }
        i = this.s;
        if (!(i == 1 || i == 0)) {
            aoby.a(23, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        axpe[] axpeArr = this.d;
        int i2 = 0;
        if (axpeArr != null && axpeArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                axpe[] axpeArr2 = this.d;
                if (computeSerializedSize >= axpeArr2.length) {
                    break;
                }
                anze anze2 = axpeArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(6, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aocf aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        apdh[] apdhArr = this.h;
        if (apdhArr != null && apdhArr.length > 0) {
            while (true) {
                apdhArr = this.h;
                if (i2 >= apdhArr.length) {
                    break;
                }
                anze = apdhArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(11, anze);
                }
                i2++;
            }
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        String str = this.k;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(14, this.k);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        if (!Arrays.equals(this.m, aock.c)) {
            computeSerializedSize += aoby.b(17, this.m);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        if (this.o) {
            computeSerializedSize += aoby.d(19);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        aocf = this.r;
        if (aocf != null) {
            computeSerializedSize += aoby.b(22, aocf);
        }
        i = this.s;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(23, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            arml arml;
            arml arml2;
            armk armk;
            int length;
            apdx apdx;
            apdx apdx2;
            apdw apdw;
            axpg axpg;
            axpg axpg2;
            axpf axpf;
            switch (a) {
                case 0:
                    break;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.a;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.c;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case cv.aU /*50*/:
                    a = aock.a(aobv, 50);
                    axpe[] axpeArr = this.d;
                    length = axpeArr != null ? axpeArr.length : 0;
                    axpe[] axpeArr2 = new axpe[(a + length)];
                    if (length != 0) {
                        System.arraycopy(axpeArr, 0, axpeArr2, 0, length);
                    }
                    while (length < axpeArr2.length - 1) {
                        axpeArr2[length] = (axpe) aobv.a(axpe.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    axpeArr2[length] = (axpe) aobv.a(axpe.c.getParserForType());
                    this.d = axpeArr2;
                    continue;
                case 66:
                    if (this.e == null) {
                        this.e = new akav();
                    }
                    aobv.a(this.e);
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 82:
                    azcm azcm = (azcm) aobv.a(azcm.c.getParserForType());
                    azcm azcm2 = this.g;
                    if (azcm2 != null) {
                        azcl azcl = (azcl) ((anxo) azcm2.toBuilder());
                        azcl.mergeFrom(azcm);
                        azcm = (azcm) ((anxl) azcl.build());
                    }
                    this.g = azcm;
                    continue;
                case 90:
                    a = aock.a(aobv, 90);
                    apdh[] apdhArr = this.h;
                    length = apdhArr != null ? apdhArr.length : 0;
                    apdh[] apdhArr2 = new apdh[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apdhArr, 0, apdhArr2, 0, length);
                    }
                    while (length < apdhArr2.length - 1) {
                        apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                    this.h = apdhArr2;
                    continue;
                case 98:
                    apdx = (apdx) aobv.a(apdx.g.getParserForType());
                    apdx2 = this.i;
                    if (apdx2 != null) {
                        apdw = (apdw) ((anxo) apdx2.toBuilder());
                        apdw.mergeFrom(apdx);
                        apdx = (apdx) ((anxl) apdw.build());
                    }
                    this.i = apdx;
                    continue;
                case 106:
                    apdx = (apdx) aobv.a(apdx.g.getParserForType());
                    apdx2 = this.j;
                    if (apdx2 != null) {
                        apdw = (apdw) ((anxo) apdx2.toBuilder());
                        apdw.mergeFrom(apdx);
                        apdx = (apdx) ((anxl) apdw.build());
                    }
                    this.j = apdx;
                    continue;
                case 114:
                    this.k = aobv.d();
                    continue;
                case afy.av /*122*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.l;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.l = arml;
                    continue;
                case 138:
                    this.m = aobv.e();
                    continue;
                case 146:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.n;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.n = apxu;
                    continue;
                case 152:
                    this.o = aobv.c();
                    continue;
                case 162:
                    axpg = (axpg) aobv.a(axpg.c.getParserForType());
                    axpg2 = this.p;
                    if (axpg2 != null) {
                        axpf = (axpf) ((anxo) axpg2.toBuilder());
                        axpf.mergeFrom(axpg);
                        axpg = (axpg) ((anxl) axpf.build());
                    }
                    this.p = axpg;
                    continue;
                case 170:
                    axpg = (axpg) aobv.a(axpg.c.getParserForType());
                    axpg2 = this.q;
                    if (axpg2 != null) {
                        axpf = (axpf) ((anxo) axpg2.toBuilder());
                        axpf.mergeFrom(axpg);
                        axpg = (axpg) ((anxl) axpf.build());
                    }
                    this.q = axpg;
                    continue;
                case 178:
                    if (this.r == null) {
                        this.r = new ajzw();
                    }
                    aobv.a(this.r);
                    continue;
                case 184:
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
                        this.s = i;
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
