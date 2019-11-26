package defpackage;

import java.util.Arrays;

/* renamed from: ajst */
public final class ajst extends ajwo {
    public ajsu a;
    public ajss b;
    public byte[] c;
    public aqbw d;
    public boolean e;
    public ajso f;
    public axak g;
    public axak h;
    public int i;
    private arml j;
    private arml k;
    private arml l;
    private ajsm m;
    private boolean n;
    private boolean o;
    private axak p;
    private arml q;
    private axak r;
    private boolean s;
    private auko t;

    public ajst() {
        super(62285833);
        this.a = null;
        this.b = null;
        this.c = aock.c;
        this.e = false;
        this.m = null;
        this.f = null;
        this.i = 1;
        this.n = false;
        this.o = false;
        this.s = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajst) {
            ajst ajst = (ajst) obj;
            ajsu ajsu = this.a;
            if (ajsu == null) {
                if (ajst.a != null) {
                    return false;
                }
            } else if (!ajsu.equals(ajst.a)) {
                return false;
            }
            ajss ajss = this.b;
            if (ajss == null) {
                if (ajst.b != null) {
                    return false;
                }
            } else if (!ajss.equals(ajst.b)) {
                return false;
            }
            arml arml = this.j;
            if (arml == null) {
                if (ajst.j != null) {
                    return false;
                }
            } else if (!arml.equals(ajst.j)) {
                return false;
            }
            arml = this.k;
            if (arml == null) {
                if (ajst.k != null) {
                    return false;
                }
            } else if (!arml.equals(ajst.k)) {
                return false;
            }
            if (Arrays.equals(this.c, ajst.c)) {
                arml = this.l;
                if (arml == null) {
                    if (ajst.l != null) {
                        return false;
                    }
                } else if (!arml.equals(ajst.l)) {
                    return false;
                }
                aqbw aqbw = this.d;
                if (aqbw == null) {
                    if (ajst.d != null) {
                        return false;
                    }
                } else if (!aqbw.equals(ajst.d)) {
                    return false;
                }
                if (this.e == ajst.e) {
                    ajsm ajsm = this.m;
                    if (ajsm == null) {
                        if (ajst.m != null) {
                            return false;
                        }
                    } else if (!ajsm.equals(ajst.m)) {
                        return false;
                    }
                    ajso ajso = this.f;
                    if (ajso == null) {
                        if (ajst.f != null) {
                            return false;
                        }
                    } else if (!ajso.equals(ajst.f)) {
                        return false;
                    }
                    if (this.i == ajst.i && this.n == ajst.n) {
                        axak axak = this.g;
                        if (axak == null) {
                            if (ajst.g != null) {
                                return false;
                            }
                        } else if (!axak.equals(ajst.g)) {
                            return false;
                        }
                        axak = this.h;
                        if (axak == null) {
                            if (ajst.h != null) {
                                return false;
                            }
                        } else if (!axak.equals(ajst.h)) {
                            return false;
                        }
                        if (this.o == ajst.o) {
                            axak = this.p;
                            if (axak == null) {
                                if (ajst.p != null) {
                                    return false;
                                }
                            } else if (!axak.equals(ajst.p)) {
                                return false;
                            }
                            arml = this.q;
                            if (arml == null) {
                                if (ajst.q != null) {
                                    return false;
                                }
                            } else if (!arml.equals(ajst.q)) {
                                return false;
                            }
                            axak = this.r;
                            if (axak == null) {
                                if (ajst.r != null) {
                                    return false;
                                }
                            } else if (!axak.equals(ajst.r)) {
                                return false;
                            }
                            if (this.s == ajst.s) {
                                auko auko = this.t;
                                if (auko == null) {
                                    if (ajst.t != null) {
                                        return false;
                                    }
                                } else if (!auko.equals(ajst.t)) {
                                    return false;
                                }
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(ajst.unknownFieldData);
                                }
                                aocb aocb2 = ajst.unknownFieldData;
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
        ajsu ajsu = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajsu != null ? ajsu.hashCode() : 0;
        ajss ajss = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajss != null ? ajss.hashCode() : 0;
        arml arml = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.c);
        arml arml2 = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        aqbw aqbw = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (aqbw != null ? aqbw.hashCode() : 0)) * 31;
        hashCode3 = 1237;
        hashCode2 = !this.e ? 1237 : 1231;
        ajsm ajsm = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajsm != null ? ajsm.hashCode() : 0;
        ajso ajso = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (ajso != null ? ajso.hashCode() : 0)) * 31;
        hashCode2 = this.i;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = !this.n ? 1237 : 1231;
        axak axak = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axak != null ? axak.hashCode() : 0;
        axak = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (axak != null ? axak.hashCode() : 0)) * 31;
        hashCode2 = !this.o ? 1237 : 1231;
        axak = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axak != null ? axak.hashCode() : 0;
        arml arml3 = this.q;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        axak = this.r;
        hashCode = (((hashCode + hashCode2) * 31) + (axak != null ? axak.hashCode() : 0)) * 31;
        if (this.s) {
            hashCode3 = 1231;
        }
        auko auko = this.t;
        hashCode = (((hashCode + hashCode3) * 31) + (auko != null ? auko.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze anze = this.j;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(4, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(6, this.c);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(9, anze);
        }
        if (this.e) {
            aoby.a(10, true);
        }
        aocf = this.m;
        if (aocf != null) {
            aoby.a(11, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            aoby.a(12, aocf);
        }
        int i = this.i;
        if (!(i == 1 || i == 0)) {
            aoby.a(13, i - 1);
        }
        if (this.n) {
            aoby.a(14, true);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(16, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(17, anze);
        }
        if (this.o) {
            aoby.a(18, true);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(19, anze);
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.r;
        if (anze != null) {
            aoby.a(21, anze);
        }
        if (this.s) {
            aoby.a(22, true);
        }
        anze = this.t;
        if (anze != null) {
            aoby.a(999, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(6, this.c);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        if (this.e) {
            computeSerializedSize += aoby.d(10);
        }
        aocf = this.m;
        if (aocf != null) {
            computeSerializedSize += aoby.b(11, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(12, aocf);
        }
        int i = this.i;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(13, i - 1);
        }
        if (this.n) {
            computeSerializedSize += aoby.d(14);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        if (this.o) {
            computeSerializedSize += aoby.d(18);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(19, anze);
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.r;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        if (this.s) {
            computeSerializedSize += aoby.d(22);
        }
        anze = this.t;
        return anze != null ? computeSerializedSize + anwm.c(999, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            axak axak;
            axak axak2;
            axaj axaj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new ajsu();
                    }
                    aobv.a(this.a);
                    continue;
                case 18:
                    if (this.b == null) {
                        this.b = new ajss();
                    }
                    aobv.a(this.b);
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.j;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.j = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.k;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.k = arml;
                    continue;
                case cv.aU /*50*/:
                    this.c = aobv.e();
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.l;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.l = arml;
                    continue;
                case 74:
                    aqbw aqbw = (aqbw) aobv.a(aqbw.c.getParserForType());
                    aqbw aqbw2 = this.d;
                    if (aqbw2 != null) {
                        aqbv aqbv = (aqbv) ((anxo) aqbw2.toBuilder());
                        aqbv.mergeFrom(aqbw);
                        aqbw = (aqbw) ((anxl) aqbv.build());
                    }
                    this.d = aqbw;
                    continue;
                case 80:
                    this.e = aobv.c();
                    continue;
                case 90:
                    if (this.m == null) {
                        this.m = new ajsm();
                    }
                    aobv.a(this.m);
                    continue;
                case 98:
                    if (this.f == null) {
                        this.f = new ajso();
                    }
                    aobv.a(this.f);
                    continue;
                case 104:
                    int i = aobv.b;
                    int f = aobv.f();
                    if (f == 0 || f == 10 || f == 20 || f == 100) {
                        a = f != 0 ? f != 10 ? f != 20 ? f != 100 ? 0 : 101 : 21 : 11 : 1;
                        this.i = a;
                        break;
                    }
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                    continue;
                case 112:
                    this.n = aobv.c();
                    continue;
                case 130:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.g;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.g = axak;
                    continue;
                case 138:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.h;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.h = axak;
                    continue;
                case 144:
                    this.o = aobv.c();
                    continue;
                case 154:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.p;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.p = axak;
                    continue;
                case 162:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.q;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.q = arml;
                    continue;
                case 170:
                    axak = (axak) aobv.a(axak.a.getParserForType());
                    axak2 = this.r;
                    if (axak2 != null) {
                        axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.r = axak;
                    continue;
                case 176:
                    this.s = aobv.c();
                    continue;
                case 7994:
                    auko auko = (auko) aobv.a(auko.f.getParserForType());
                    auko auko2 = this.t;
                    if (auko2 != null) {
                        aukq aukq = (aukq) ((anxo) auko2.toBuilder());
                        aukq.mergeFrom(auko);
                        auko = (auko) ((anxl) aukq.build());
                    }
                    this.t = auko;
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
