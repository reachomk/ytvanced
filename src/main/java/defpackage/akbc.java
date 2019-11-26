package defpackage;

import java.util.Arrays;

/* renamed from: akbc */
public final class akbc extends ajwo {
    public apxu a;
    public String b;
    public boolean c = false;
    public akaz d = null;
    public arwf e;
    public ayds f;
    public aydq g;
    public aydw h;
    public aydu i;
    public String j;
    public byte[] k;
    public String l;
    private aodx m;
    private aygk n;
    private String o;

    public akbc() {
        super(58174010);
        String str = "";
        this.b = str;
        this.j = str;
        this.k = aock.c;
        this.l = str;
        this.o = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbc) {
            akbc akbc = (akbc) obj;
            apxu apxu = this.a;
            if (apxu == null) {
                if (akbc.a != null) {
                    return false;
                }
            } else if (!apxu.equals(akbc.a)) {
                return false;
            }
            String str = this.b;
            if (str == null) {
                if (akbc.b != null) {
                    return false;
                }
            } else if (!str.equals(akbc.b)) {
                return false;
            }
            if (this.c == akbc.c) {
                akaz akaz = this.d;
                if (akaz == null) {
                    if (akbc.d != null) {
                        return false;
                    }
                } else if (!akaz.equals(akbc.d)) {
                    return false;
                }
                arwf arwf = this.e;
                if (arwf == null) {
                    if (akbc.e != null) {
                        return false;
                    }
                } else if (!arwf.equals(akbc.e)) {
                    return false;
                }
                ayds ayds = this.f;
                if (ayds == null) {
                    if (akbc.f != null) {
                        return false;
                    }
                } else if (!ayds.equals(akbc.f)) {
                    return false;
                }
                aydq aydq = this.g;
                if (aydq == null) {
                    if (akbc.g != null) {
                        return false;
                    }
                } else if (!aydq.equals(akbc.g)) {
                    return false;
                }
                aydw aydw = this.h;
                if (aydw == null) {
                    if (akbc.h != null) {
                        return false;
                    }
                } else if (!aydw.equals(akbc.h)) {
                    return false;
                }
                aydu aydu = this.i;
                if (aydu == null) {
                    if (akbc.i != null) {
                        return false;
                    }
                } else if (!aydu.equals(akbc.i)) {
                    return false;
                }
                str = this.j;
                if (str == null) {
                    if (akbc.j != null) {
                        return false;
                    }
                } else if (!str.equals(akbc.j)) {
                    return false;
                }
                aodx aodx = this.m;
                if (aodx == null) {
                    if (akbc.m != null) {
                        return false;
                    }
                } else if (!aodx.equals(akbc.m)) {
                    return false;
                }
                if (Arrays.equals(this.k, akbc.k)) {
                    aygk aygk = this.n;
                    if (aygk == null) {
                        if (akbc.n != null) {
                            return false;
                        }
                    } else if (!aygk.equals(akbc.n)) {
                        return false;
                    }
                    str = this.l;
                    if (str == null) {
                        if (akbc.l != null) {
                            return false;
                        }
                    } else if (!str.equals(akbc.l)) {
                        return false;
                    }
                    str = this.o;
                    if (str == null) {
                        if (akbc.o != null) {
                            return false;
                        }
                    } else if (!str.equals(akbc.o)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akbc.unknownFieldData);
                    }
                    aocb aocb2 = akbc.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        apxu apxu = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = !this.c ? 1237 : 1231;
        akaz akaz = this.d;
        hashCode = (hashCode + i2) * 31;
        i2 = akaz != null ? akaz.hashCode() : 0;
        arwf arwf = this.e;
        hashCode = (hashCode + i2) * 31;
        i2 = arwf != null ? arwf.hashCode() : 0;
        ayds ayds = this.f;
        hashCode = (hashCode + i2) * 31;
        i2 = ayds != null ? ayds.hashCode() : 0;
        aydq aydq = this.g;
        hashCode = (hashCode + i2) * 31;
        i2 = aydq != null ? aydq.hashCode() : 0;
        aydw aydw = this.h;
        hashCode = (hashCode + i2) * 31;
        i2 = aydw != null ? aydw.hashCode() : 0;
        aydu aydu = this.i;
        hashCode = (((hashCode + i2) * 31) + (aydu != null ? aydu.hashCode() : 0)) * 31;
        str = this.j;
        i2 = str != null ? str.hashCode() : 0;
        aodx aodx = this.m;
        hashCode = (hashCode + i2) * 31;
        i2 = aodx != null ? aodx.hashCode() : 0;
        int hashCode2 = Arrays.hashCode(this.k);
        aygk aygk = this.n;
        hashCode = (((((hashCode + i2) * 31) + hashCode2) * 31) + (aygk != null ? aygk.hashCode() : 0)) * 31;
        str = this.l;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.o;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(2, this.b);
        }
        if (this.c) {
            aoby.a(3, true);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(10, anze);
        }
        str = this.j;
        if (!(str == null || str.equals(str2))) {
            aoby.a(11, this.j);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(12, anze);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            aoby.a(14, this.k);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(15, anze);
        }
        str = this.l;
        if (!(str == null || str.equals(str2))) {
            aoby.a(16, this.l);
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            aoby.a(17, this.o);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(2, this.b);
        }
        if (this.c) {
            computeSerializedSize += aoby.d(3);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        str = this.j;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(11, this.j);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            computeSerializedSize += aoby.b(14, this.k);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        str = this.l;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(16, this.l);
        }
        str = this.o;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(17, this.o);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.a;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.a = apxu;
                    continue;
                case 18:
                    this.b = aobv.d();
                    continue;
                case 24:
                    this.c = aobv.c();
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new akaz();
                    }
                    aobv.a(this.d);
                    continue;
                case cv.aU /*50*/:
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.e;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.e = arwf;
                    continue;
                case 58:
                    ayds ayds = (ayds) aobv.a(ayds.f.getParserForType());
                    ayds ayds2 = this.f;
                    if (ayds2 != null) {
                        aydv aydv = (aydv) ((anxo) ayds2.toBuilder());
                        aydv.mergeFrom(ayds);
                        ayds = (ayds) ((anxl) aydv.build());
                    }
                    this.f = ayds;
                    continue;
                case 66:
                    aydq aydq = (aydq) aobv.a(aydq.c.getParserForType());
                    aydq aydq2 = this.g;
                    if (aydq2 != null) {
                        aydt aydt = (aydt) ((anxo) aydq2.toBuilder());
                        aydt.mergeFrom(aydq);
                        aydq = (aydq) ((anxl) aydt.build());
                    }
                    this.g = aydq;
                    continue;
                case 74:
                    aydw aydw = (aydw) aobv.a(aydw.c.getParserForType());
                    aydw aydw2 = this.h;
                    if (aydw2 != null) {
                        aydz aydz = (aydz) ((anxo) aydw2.toBuilder());
                        aydz.mergeFrom(aydw);
                        aydw = (aydw) ((anxl) aydz.build());
                    }
                    this.h = aydw;
                    continue;
                case 82:
                    aydu aydu = (aydu) aobv.a(aydu.d.getParserForType());
                    aydu aydu2 = this.i;
                    if (aydu2 != null) {
                        aydx aydx = (aydx) ((anxo) aydu2.toBuilder());
                        aydx.mergeFrom(aydu);
                        aydu = (aydu) ((anxl) aydx.build());
                    }
                    this.i = aydu;
                    continue;
                case 90:
                    this.j = aobv.d();
                    continue;
                case 98:
                    aodx aodx = (aodx) aobv.a(aodx.c.getParserForType());
                    aodx aodx2 = this.m;
                    if (aodx2 != null) {
                        aodz aodz = (aodz) ((anxo) aodx2.toBuilder());
                        aodz.mergeFrom(aodx);
                        aodx = (aodx) ((anxl) aodz.build());
                    }
                    this.m = aodx;
                    continue;
                case 114:
                    this.k = aobv.e();
                    continue;
                case afy.av /*122*/:
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.n;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.n = aygk;
                    continue;
                case 130:
                    this.l = aobv.d();
                    continue;
                case 138:
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
