package defpackage;

import java.util.Arrays;

/* renamed from: akag */
public final class akag extends ajwo {
    public arml a;
    public akaf[] b;
    public byte[] c;
    public int d;
    private arwf e;
    private arml f;
    private boolean g;

    public akag() {
        super(66930374);
        this.b = akaf.a();
        this.d = 1;
        this.g = false;
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akag) {
            akag akag = (akag) obj;
            arml arml = this.a;
            if (arml == null) {
                if (akag.a != null) {
                    return false;
                }
            } else if (!arml.equals(akag.a)) {
                return false;
            }
            if (aocd.a(this.b, akag.b) && this.d == akag.d) {
                arwf arwf = this.e;
                if (arwf == null) {
                    if (akag.e != null) {
                        return false;
                    }
                } else if (!arwf.equals(akag.e)) {
                    return false;
                }
                arml = this.f;
                if (arml == null) {
                    if (akag.f != null) {
                        return false;
                    }
                } else if (!arml.equals(akag.f)) {
                    return false;
                }
                if (this.g == akag.g && Arrays.equals(this.c, akag.c)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akag.unknownFieldData);
                    }
                    aocb aocb2 = akag.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + aocd.a(this.b)) * 31;
        int i2 = this.d;
        if (i2 == 0) {
            i2 = 0;
        }
        arwf arwf = this.e;
        hashCode = (hashCode + i2) * 31;
        i2 = arwf != null ? arwf.hashCode() : 0;
        arml arml2 = this.f;
        hashCode = (((((((hashCode + i2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31) + (!this.g ? 1237 : 1231)) * 31) + Arrays.hashCode(this.c)) * 31;
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
            aoby.a(2, anze);
        }
        akaf[] akafArr = this.b;
        if (akafArr != null && akafArr.length > 0) {
            i = 0;
            while (true) {
                akaf[] akafArr2 = this.b;
                if (i >= akafArr2.length) {
                    break;
                }
                aocf aocf = akafArr2[i];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i++;
            }
        }
        i = this.d;
        if (!(i == 1 || i == 0)) {
            aoby.a(4, i - 1);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        if (this.g) {
            aoby.a(7, true);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(9, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        akaf[] akafArr = this.b;
        if (akafArr != null && akafArr.length > 0) {
            i = 0;
            while (true) {
                akaf[] akafArr2 = this.b;
                if (i >= akafArr2.length) {
                    break;
                }
                aocf aocf = akafArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(3, aocf);
                }
                i++;
            }
        }
        i = this.d;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(4, i - 1);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        if (this.g) {
            computeSerializedSize += aoby.d(7);
        }
        return !Arrays.equals(this.c, aock.c) ? computeSerializedSize + aoby.b(9, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
            } else if (a != 18) {
                int i = 0;
                int length;
                if (a == 26) {
                    aocf akaf;
                    a = aock.a(aobv, 26);
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
                } else if (a == 32) {
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length != 0) {
                        switch (length) {
                            case 10000:
                            case 10001:
                            case 10002:
                            case 10003:
                            case 10004:
                            case 10005:
                            case 10006:
                            case 10007:
                            case 10008:
                            case 10009:
                            case 10010:
                            case 10011:
                            case 10012:
                            case 10013:
                            case 10014:
                            case 10015:
                            case 10016:
                            case 10017:
                            case 10018:
                            case 10019:
                            case 10020:
                            case 10021:
                            case 10022:
                            case 10023:
                            case 10024:
                            case 10025:
                            case 10026:
                            case 10027:
                            case 10028:
                            case 10029:
                            case 10030:
                            case 10031:
                            case 10032:
                            case 10033:
                            case 10034:
                            case 10035:
                            case 10036:
                                break;
                            default:
                                switch (length) {
                                    case 10038:
                                    case 10039:
                                    case 10040:
                                    case 10041:
                                    case 10042:
                                    case 10043:
                                    case 10044:
                                    case 10045:
                                    case 10046:
                                    case 10047:
                                    case 10048:
                                    case 10049:
                                    case 10050:
                                    case 10051:
                                    case 10052:
                                    case 10053:
                                    case 10054:
                                    case 10055:
                                    case 10056:
                                    case 10057:
                                    case 10058:
                                    case 10059:
                                    case 10060:
                                    case 10061:
                                    case 10062:
                                    case 10063:
                                    case 10064:
                                    case 10065:
                                    case 10066:
                                    case 10067:
                                    case 10068:
                                    case 10069:
                                    case 10070:
                                    case 10071:
                                    case 10072:
                                    case 10073:
                                    case 10074:
                                    case 10075:
                                    case 10076:
                                    case 10077:
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
                            case 10000:
                                i = 10001;
                                break;
                            case 10001:
                                i = 10002;
                                break;
                            case 10002:
                                i = 10003;
                                break;
                            case 10003:
                                i = 10004;
                                break;
                            case 10004:
                                i = 10005;
                                break;
                            case 10005:
                                i = 10006;
                                break;
                            case 10006:
                                i = 10007;
                                break;
                            case 10007:
                                i = 10008;
                                break;
                            case 10008:
                                i = 10009;
                                break;
                            case 10009:
                                i = 10010;
                                break;
                            case 10010:
                                i = 10011;
                                break;
                            case 10011:
                                i = 10012;
                                break;
                            case 10012:
                                i = 10013;
                                break;
                            case 10013:
                                i = 10014;
                                break;
                            case 10014:
                                i = 10015;
                                break;
                            case 10015:
                                i = 10016;
                                break;
                            case 10016:
                                i = 10017;
                                break;
                            case 10017:
                                i = 10018;
                                break;
                            case 10018:
                                i = 10019;
                                break;
                            case 10019:
                                i = 10020;
                                break;
                            case 10020:
                                i = 10021;
                                break;
                            case 10021:
                                i = 10022;
                                break;
                            case 10022:
                                i = 10023;
                                break;
                            case 10023:
                                i = 10024;
                                break;
                            case 10024:
                                i = 10025;
                                break;
                            case 10025:
                                i = 10026;
                                break;
                            case 10026:
                                i = 10027;
                                break;
                            case 10027:
                                i = 10028;
                                break;
                            case 10028:
                                i = 10029;
                                break;
                            case 10029:
                                i = 10030;
                                break;
                            case 10030:
                                i = 10031;
                                break;
                            case 10031:
                                i = 10032;
                                break;
                            case 10032:
                                i = 10033;
                                break;
                            case 10033:
                                i = 10034;
                                break;
                            case 10034:
                                i = 10035;
                                break;
                            case 10035:
                                i = 10036;
                                break;
                            case 10036:
                                i = 10037;
                                break;
                            default:
                                switch (length) {
                                    case 10038:
                                        i = 10039;
                                        break;
                                    case 10039:
                                        i = 10040;
                                        break;
                                    case 10040:
                                        i = 10041;
                                        break;
                                    case 10041:
                                        i = 10042;
                                        break;
                                    case 10042:
                                        i = 10043;
                                        break;
                                    case 10043:
                                        i = 10044;
                                        break;
                                    case 10044:
                                        i = 10045;
                                        break;
                                    case 10045:
                                        i = 10046;
                                        break;
                                    case 10046:
                                        i = 10047;
                                        break;
                                    case 10047:
                                        i = 10048;
                                        break;
                                    case 10048:
                                        i = 10049;
                                        break;
                                    case 10049:
                                        i = 10050;
                                        break;
                                    case 10050:
                                        i = 10051;
                                        break;
                                    case 10051:
                                        i = 10052;
                                        break;
                                    case 10052:
                                        i = 10053;
                                        break;
                                    case 10053:
                                        i = 10054;
                                        break;
                                    case 10054:
                                        i = 10055;
                                        break;
                                    case 10055:
                                        i = 10056;
                                        break;
                                    case 10056:
                                        i = 10057;
                                        break;
                                    case 10057:
                                        i = 10058;
                                        break;
                                    case 10058:
                                        i = 10059;
                                        break;
                                    case 10059:
                                        i = 10060;
                                        break;
                                    case 10060:
                                        i = 10061;
                                        break;
                                    case 10061:
                                        i = 10062;
                                        break;
                                    case 10062:
                                        i = 10063;
                                        break;
                                    case 10063:
                                        i = 10064;
                                        break;
                                    case 10064:
                                        i = 10065;
                                        break;
                                    case 10065:
                                        i = 10066;
                                        break;
                                    case 10066:
                                        i = 10067;
                                        break;
                                    case 10067:
                                        i = 10068;
                                        break;
                                    case 10068:
                                        i = 10069;
                                        break;
                                    case 10069:
                                        i = 10070;
                                        break;
                                    case 10070:
                                        i = 10071;
                                        break;
                                    case 10071:
                                        i = 10072;
                                        break;
                                    case 10072:
                                        i = 10073;
                                        break;
                                    case 10073:
                                        i = 10074;
                                        break;
                                    case 10074:
                                        i = 10075;
                                        break;
                                    case 10075:
                                        i = 10076;
                                        break;
                                    case 10076:
                                        i = 10077;
                                        break;
                                    case 10077:
                                        i = 10078;
                                        break;
                                }
                                break;
                        }
                    }
                    i = 1;
                    this.d = i;
                } else if (a == 42) {
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.e;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.e = arwf;
                } else if (a == 50) {
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                } else if (a == 56) {
                    this.g = aobv.c();
                } else if (a == 74) {
                    this.c = aobv.e();
                } else if (!super.storeUnknownField(aobv, a)) {
                    break;
                }
            } else {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.a;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            }
        }
        return this;
    }
}
