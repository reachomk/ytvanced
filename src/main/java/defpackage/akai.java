package defpackage;

import java.util.Arrays;

/* renamed from: akai */
public final class akai extends ajwo {
    public arml a;
    public akaf[] b;
    public String c;
    public int d;
    private arml e;
    private apxu f;
    private arwf g;
    private byte[] h;
    private axhe[] i;

    public akai() {
        super(75120871);
        this.b = akaf.a();
        this.d = 1;
        this.c = "";
        this.h = aock.c;
        this.i = new axhe[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akai) {
            akai akai = (akai) obj;
            arml arml = this.a;
            if (arml == null) {
                if (akai.a != null) {
                    return false;
                }
            } else if (!arml.equals(akai.a)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (akai.e != null) {
                    return false;
                }
            } else if (!arml.equals(akai.e)) {
                return false;
            }
            apxu apxu = this.f;
            if (apxu == null) {
                if (akai.f != null) {
                    return false;
                }
            } else if (!apxu.equals(akai.f)) {
                return false;
            }
            if (aocd.a(this.b, akai.b)) {
                arwf arwf = this.g;
                if (arwf == null) {
                    if (akai.g != null) {
                        return false;
                    }
                } else if (!arwf.equals(akai.g)) {
                    return false;
                }
                if (this.d == akai.d) {
                    String str = this.c;
                    if (str == null) {
                        if (akai.c != null) {
                            return false;
                        }
                    } else if (!str.equals(akai.c)) {
                        return false;
                    }
                    if (Arrays.equals(this.h, akai.h) && aocd.a(this.i, akai.i)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(akai.unknownFieldData);
                        }
                        aocb aocb2 = akai.unknownFieldData;
                        return aocb2 == null || aocb2.b();
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
        arml arml2 = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        apxu apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.b);
        arwf arwf = this.g;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (arwf != null ? arwf.hashCode() : 0)) * 31;
        hashCode2 = this.d;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        String str = this.c;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.h)) * 31) + aocd.a(this.i)) * 31;
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
        anze = this.e;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(3, anze);
        }
        akaf[] akafArr = this.b;
        int i2 = 0;
        if (akafArr != null && akafArr.length > 0) {
            i = 0;
            while (true) {
                akaf[] akafArr2 = this.b;
                if (i >= akafArr2.length) {
                    break;
                }
                aocf aocf = akafArr2[i];
                if (aocf != null) {
                    aoby.a(4, aocf);
                }
                i++;
            }
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(5, anze);
        }
        i = this.d;
        if (!(i == 1 || i == 0)) {
            aoby.a(6, i - 1);
        }
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            aoby.a(7, this.c);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(9, this.h);
        }
        axhe[] axheArr = this.i;
        if (axheArr != null && axheArr.length > 0) {
            while (true) {
                axheArr = this.i;
                if (i2 >= axheArr.length) {
                    break;
                }
                anze = axheArr[i2];
                if (anze != null) {
                    aoby.a(10, anze);
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
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        akaf[] akafArr = this.b;
        int i2 = 0;
        if (akafArr != null && akafArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akaf[] akafArr2 = this.b;
                if (computeSerializedSize >= akafArr2.length) {
                    break;
                }
                aocf aocf = akafArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(4, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        i = this.d;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(6, i - 1);
        }
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(7, this.c);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(9, this.h);
        }
        axhe[] axheArr = this.i;
        if (axheArr != null && axheArr.length > 0) {
            while (true) {
                axheArr = this.i;
                if (i2 >= axheArr.length) {
                    break;
                }
                anze = axheArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(10, anze);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.a;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.e;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.e = arml;
            } else if (a != 26) {
                int i = 0;
                int length;
                if (a == 34) {
                    aocf akaf;
                    a = aock.a(aobv, 34);
                    akaf[] akafArr = this.b;
                    length = akafArr != null ? akafArr.length : 0;
                    akaf[] akafArr2 = new akaf[(a + length)];
                    if (length != 0) {
                        System.arraycopy(akafArr, 0, akafArr2, 0, length);
                    }
                    while (length < akafArr2.length - 1) {
                        akaf = new akaf();
                        akafArr2[length] = akaf;
                        aobv.a(akaf);
                        aobv.a();
                        length++;
                    }
                    akaf = new akaf();
                    akafArr2[length] = akaf;
                    aobv.a(akaf);
                    this.b = akafArr2;
                } else if (a == 42) {
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.g;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.g = arwf;
                } else if (a == 48) {
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length != 0) {
                        switch (length) {
                            case 20000:
                            case 20001:
                            case 20002:
                            case 20003:
                            case 20004:
                            case 20005:
                            case 20006:
                            case 20007:
                            case 20008:
                            case 20009:
                            case 20010:
                            case 20011:
                            case 20012:
                            case 20013:
                            case 20014:
                            case 20015:
                            case 20016:
                            case 20017:
                            case 20018:
                            case 20019:
                                break;
                            default:
                                switch (length) {
                                    case 20024:
                                    case 20025:
                                    case 20026:
                                    case 20027:
                                    case 20028:
                                    case 20029:
                                    case 20030:
                                        break;
                                    default:
                                        aobv.e(i2);
                                        storeUnknownField(aobv, a);
                                        continue;
                                        continue;
                                }
                        }
                    }
                    if (length != 0) {
                        switch (length) {
                            case 20000:
                                i = 20001;
                                break;
                            case 20001:
                                i = 20002;
                                break;
                            case 20002:
                                i = 20003;
                                break;
                            case 20003:
                                i = 20004;
                                break;
                            case 20004:
                                i = 20005;
                                break;
                            case 20005:
                                i = 20006;
                                break;
                            case 20006:
                                i = 20007;
                                break;
                            case 20007:
                                i = 20008;
                                break;
                            case 20008:
                                i = 20009;
                                break;
                            case 20009:
                                i = 20010;
                                break;
                            case 20010:
                                i = 20011;
                                break;
                            case 20011:
                                i = 20012;
                                break;
                            case 20012:
                                i = 20013;
                                break;
                            case 20013:
                                i = 20014;
                                break;
                            case 20014:
                                i = 20015;
                                break;
                            case 20015:
                                i = 20016;
                                break;
                            case 20016:
                                i = 20017;
                                break;
                            case 20017:
                                i = 20018;
                                break;
                            case 20018:
                                i = 20019;
                                break;
                            case 20019:
                                i = 20020;
                                break;
                            default:
                                switch (length) {
                                    case 20024:
                                        i = 20025;
                                        break;
                                    case 20025:
                                        i = 20026;
                                        break;
                                    case 20026:
                                        i = 20027;
                                        break;
                                    case 20027:
                                        i = 20028;
                                        break;
                                    case 20028:
                                        i = 20029;
                                        break;
                                    case 20029:
                                        i = 20030;
                                        break;
                                    case 20030:
                                        i = 20031;
                                        break;
                                }
                                break;
                        }
                    }
                    i = 1;
                    this.d = i;
                } else if (a == 58) {
                    this.c = aobv.d();
                } else if (a == 74) {
                    this.h = aobv.e();
                } else if (a == 82) {
                    a = aock.a(aobv, 82);
                    axhe[] axheArr = this.i;
                    length = axheArr != null ? axheArr.length : 0;
                    axhe[] axheArr2 = new axhe[(a + length)];
                    if (length != 0) {
                        System.arraycopy(axheArr, 0, axheArr2, 0, length);
                    }
                    while (length < axheArr2.length - 1) {
                        axheArr2[length] = (axhe) aobv.a(axhe.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    axheArr2[length] = (axhe) aobv.a(axhe.c.getParserForType());
                    this.i = axheArr2;
                } else if (!super.storeUnknownField(aobv, a)) {
                    break;
                }
            } else {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.f;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.f = apxu;
            }
        }
        return this;
    }
}
