package defpackage;

import java.util.Arrays;

/* renamed from: akbb */
public final class akbb extends ajwo {
    public arwf a;
    public aygk b;
    public ajxj c = null;
    public byte[] d = aock.c;
    public avdz e;
    public boolean f;
    public String g;
    private apxu h;
    private aodx i;
    private String j;
    private int k;

    public akbb() {
        super(120823052);
        String str = "";
        this.j = str;
        this.k = 1;
        this.f = false;
        this.g = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbb) {
            akbb akbb = (akbb) obj;
            arwf arwf = this.a;
            if (arwf == null) {
                if (akbb.a != null) {
                    return false;
                }
            } else if (!arwf.equals(akbb.a)) {
                return false;
            }
            aygk aygk = this.b;
            if (aygk == null) {
                if (akbb.b != null) {
                    return false;
                }
            } else if (!aygk.equals(akbb.b)) {
                return false;
            }
            ajxj ajxj = this.c;
            if (ajxj == null) {
                if (akbb.c != null) {
                    return false;
                }
            } else if (!ajxj.equals(akbb.c)) {
                return false;
            }
            apxu apxu = this.h;
            if (apxu == null) {
                if (akbb.h != null) {
                    return false;
                }
            } else if (!apxu.equals(akbb.h)) {
                return false;
            }
            if (Arrays.equals(this.d, akbb.d)) {
                aodx aodx = this.i;
                if (aodx == null) {
                    if (akbb.i != null) {
                        return false;
                    }
                } else if (!aodx.equals(akbb.i)) {
                    return false;
                }
                String str = this.j;
                if (str == null) {
                    if (akbb.j != null) {
                        return false;
                    }
                } else if (!str.equals(akbb.j)) {
                    return false;
                }
                if (this.k == akbb.k) {
                    avdz avdz = this.e;
                    if (avdz == null) {
                        if (akbb.e != null) {
                            return false;
                        }
                    } else if (!avdz.equals(akbb.e)) {
                        return false;
                    }
                    if (this.f == akbb.f) {
                        str = this.g;
                        if (str == null) {
                            if (akbb.g != null) {
                                return false;
                            }
                        } else if (!str.equals(akbb.g)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(akbb.unknownFieldData);
                        }
                        aocb aocb2 = akbb.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arwf arwf = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arwf != null ? arwf.hashCode() : 0;
        aygk aygk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        ajxj ajxj = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajxj != null ? ajxj.hashCode() : 0;
        apxu apxu = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.d);
        aodx aodx = this.i;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (aodx != null ? aodx.hashCode() : 0)) * 31;
        String str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        hashCode2 = this.k;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        avdz avdz = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + (avdz != null ? avdz.hashCode() : 0)) * 31) + (!this.f ? 1237 : 1231)) * 31;
        str = this.g;
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
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(4, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(6, this.d);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(7, anze);
        }
        String str = this.j;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(8, this.j);
        }
        int i = this.k;
        if (!(i == 1 || i == 0)) {
            aoby.a(9, i - 1);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(11, anze);
        }
        if (this.f) {
            aoby.a(12, true);
        }
        str = this.g;
        if (!(str == null || str.equals(str2))) {
            aoby.a(13, this.g);
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
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(6, this.d);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        String str = this.j;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(8, this.j);
        }
        int i = this.k;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(9, i - 1);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        if (this.f) {
            computeSerializedSize += aoby.d(12);
        }
        str = this.g;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(13, this.g);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                    arwf arwf2 = this.a;
                    if (arwf2 != null) {
                        arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                        arwe.mergeFrom(arwf);
                        arwf = (arwf) ((anxl) arwe.build());
                    }
                    this.a = arwf;
                    continue;
                case 18:
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.b;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.b = aygk;
                    continue;
                case 26:
                    if (this.c == null) {
                        this.c = new ajxj();
                    }
                    aobv.a(this.c);
                    continue;
                case 34:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.h;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.h = apxu;
                    continue;
                case cv.aU /*50*/:
                    this.d = aobv.e();
                    continue;
                case 58:
                    aodx aodx = (aodx) aobv.a(aodx.c.getParserForType());
                    aodx aodx2 = this.i;
                    if (aodx2 != null) {
                        aodz aodz = (aodz) ((anxo) aodx2.toBuilder());
                        aodz.mergeFrom(aodx);
                        aodx = (aodx) ((anxl) aodz.build());
                    }
                    this.i = aodx;
                    continue;
                case 66:
                    this.j = aobv.d();
                    continue;
                case 72:
                    int i = aobv.b;
                    int f = aobv.f();
                    int i2 = 1;
                    if (f == 0 || f == 1) {
                        if (f != 0) {
                            i2 = f != 1 ? 0 : 2;
                        }
                        this.k = i2;
                        break;
                    }
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                    continue;
                case 90:
                    avdz avdz = (avdz) aobv.a(avdz.c.getParserForType());
                    avdz avdz2 = this.e;
                    if (avdz2 != null) {
                        aveb aveb = (aveb) ((anxo) avdz2.toBuilder());
                        aveb.mergeFrom(avdz);
                        avdz = (avdz) ((anxl) aveb.build());
                    }
                    this.e = avdz;
                    continue;
                case 96:
                    this.f = aobv.c();
                    continue;
                case 106:
                    this.g = aobv.d();
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
