package defpackage;

import java.util.Arrays;

/* renamed from: ajsr */
public final class ajsr extends ajwo {
    public aphj a;
    public aygk b;
    public arml c;
    public apxu d;
    public azru e;
    public aphj f;
    public int g;
    private aphj h;
    private byte[] i;
    private apcd j;
    private apbz k;
    private apxu l;
    private apfu m;
    private aphj n;
    private ardw[] o;
    private axak p;
    private String q;

    public ajsr() {
        super(93764576);
        this.i = aock.c;
        this.g = 1;
        this.o = new ardw[0];
        this.q = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsr) {
            ajsr ajsr = (ajsr) obj;
            aphj aphj = this.a;
            if (aphj == null) {
                if (ajsr.a != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsr.a)) {
                return false;
            }
            aphj = this.h;
            if (aphj == null) {
                if (ajsr.h != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsr.h)) {
                return false;
            }
            aygk aygk = this.b;
            if (aygk == null) {
                if (ajsr.b != null) {
                    return false;
                }
            } else if (!aygk.equals(ajsr.b)) {
                return false;
            }
            arml arml = this.c;
            if (arml == null) {
                if (ajsr.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajsr.c)) {
                return false;
            }
            apxu apxu = this.d;
            if (apxu == null) {
                if (ajsr.d != null) {
                    return false;
                }
            } else if (!apxu.equals(ajsr.d)) {
                return false;
            }
            if (Arrays.equals(this.i, ajsr.i)) {
                apcd apcd = this.j;
                if (apcd == null) {
                    if (ajsr.j != null) {
                        return false;
                    }
                } else if (!apcd.equals(ajsr.j)) {
                    return false;
                }
                apbz apbz = this.k;
                if (apbz == null) {
                    if (ajsr.k != null) {
                        return false;
                    }
                } else if (!apbz.equals(ajsr.k)) {
                    return false;
                }
                azru azru = this.e;
                if (azru == null) {
                    if (ajsr.e != null) {
                        return false;
                    }
                } else if (!azru.equals(ajsr.e)) {
                    return false;
                }
                if (this.g == ajsr.g) {
                    aphj = this.f;
                    if (aphj == null) {
                        if (ajsr.f != null) {
                            return false;
                        }
                    } else if (!aphj.equals(ajsr.f)) {
                        return false;
                    }
                    apxu = this.l;
                    if (apxu == null) {
                        if (ajsr.l != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajsr.l)) {
                        return false;
                    }
                    apfu apfu = this.m;
                    if (apfu == null) {
                        if (ajsr.m != null) {
                            return false;
                        }
                    } else if (!apfu.equals(ajsr.m)) {
                        return false;
                    }
                    aphj = this.n;
                    if (aphj == null) {
                        if (ajsr.n != null) {
                            return false;
                        }
                    } else if (!aphj.equals(ajsr.n)) {
                        return false;
                    }
                    if (aocd.a(this.o, ajsr.o)) {
                        axak axak = this.p;
                        if (axak == null) {
                            if (ajsr.p != null) {
                                return false;
                            }
                        } else if (!axak.equals(ajsr.p)) {
                            return false;
                        }
                        String str = this.q;
                        if (str == null) {
                            if (ajsr.q != null) {
                                return false;
                            }
                        } else if (!str.equals(ajsr.q)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajsr.unknownFieldData);
                        }
                        aocb aocb2 = ajsr.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aphj aphj = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aphj != null ? aphj.hashCode() : 0;
        aphj aphj2 = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        aygk aygk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.i);
        apcd apcd = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apcd != null ? apcd.hashCode() : 0;
        apbz apbz = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apbz != null ? apbz.hashCode() : 0;
        azru azru = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (azru != null ? azru.hashCode() : 0)) * 31;
        hashCode2 = this.g;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        aphj2 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        apxu = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        apfu apfu = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apfu != null ? apfu.hashCode() : 0;
        aphj2 = this.n;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        hashCode3 = aocd.a(this.o);
        axak axak = this.p;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (axak != null ? axak.hashCode() : 0)) * 31;
        String str = this.q;
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
        anze = this.h;
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
        if (!Arrays.equals(this.i, aock.c)) {
            aoby.a(6, this.i);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(11, anze);
        }
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            aoby.a(12, i - 1);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(13, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(15, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(16, anze);
        }
        ardw[] ardwArr = this.o;
        if (ardwArr != null && ardwArr.length > 0) {
            i = 0;
            while (true) {
                ardw[] ardwArr2 = this.o;
                if (i >= ardwArr2.length) {
                    break;
                }
                anze anze2 = ardwArr2[i];
                if (anze2 != null) {
                    aoby.a(17, anze2);
                }
                i++;
            }
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(18, anze);
        }
        String str = this.q;
        if (!(str == null || str.equals(""))) {
            aoby.a(19, this.q);
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
        anze = this.h;
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
        if (!Arrays.equals(this.i, aock.c)) {
            computeSerializedSize += aoby.b(6, this.i);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(12, i - 1);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        ardw[] ardwArr = this.o;
        if (ardwArr != null && ardwArr.length > 0) {
            i = 0;
            while (true) {
                ardw[] ardwArr2 = this.o;
                if (i >= ardwArr2.length) {
                    break;
                }
                anze anze2 = ardwArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(17, anze2);
                }
                i++;
            }
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        String str = this.q;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(19, this.q);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            aphj aphj;
            aphj aphj2;
            aphm aphm;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            int f;
            switch (a) {
                case 0:
                    break;
                case 10:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.a;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.a = aphj;
                    continue;
                case 18:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.h;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.h = aphj;
                    continue;
                case 26:
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.b;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.b = aygk;
                    continue;
                case 34:
                    arml arml = (arml) aobv.a(arml.f.getParserForType());
                    arml arml2 = this.c;
                    if (arml2 != null) {
                        armk armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case 42:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.d;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.d = apxu;
                    continue;
                case cv.aU /*50*/:
                    this.i = aobv.e();
                    continue;
                case 66:
                    apcd apcd = (apcd) aobv.a(apcd.c.getParserForType());
                    apcd apcd2 = this.j;
                    if (apcd2 != null) {
                        apcf apcf = (apcf) ((anxo) apcd2.toBuilder());
                        apcf.mergeFrom(apcd);
                        apcd = (apcd) ((anxl) apcf.build());
                    }
                    this.j = apcd;
                    continue;
                case 82:
                    apbz apbz = (apbz) aobv.a(apbz.c.getParserForType());
                    apbz apbz2 = this.k;
                    if (apbz2 != null) {
                        apcc apcc = (apcc) ((anxo) apbz2.toBuilder());
                        apcc.mergeFrom(apbz);
                        apbz = (apbz) ((anxl) apcc.build());
                    }
                    this.k = apbz;
                    continue;
                case 90:
                    azru azru = (azru) aobv.a(azru.c.getParserForType());
                    azru azru2 = this.e;
                    if (azru2 != null) {
                        azrx azrx = (azrx) ((anxo) azru2.toBuilder());
                        azrx.mergeFrom(azru);
                        azru = (azru) ((anxl) azrx.build());
                    }
                    this.e = azru;
                    continue;
                case 96:
                    int i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1 || f == 2 || f == 3) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        } else if (f == 2) {
                            i = 3;
                        } else if (f == 3) {
                            i = 4;
                        }
                        this.g = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 106:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.f;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.f = aphj;
                    continue;
                case 114:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.l;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.l = apxu;
                    continue;
                case afy.av /*122*/:
                    apfu apfu = (apfu) aobv.a(apfu.a.getParserForType());
                    apfu apfu2 = this.m;
                    if (apfu2 != null) {
                        apfw apfw = (apfw) ((anxo) apfu2.toBuilder());
                        apfw.mergeFrom(apfu);
                        apfu = (apfu) ((anxl) apfw.build());
                    }
                    this.m = apfu;
                    continue;
                case 130:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.n;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.n = aphj;
                    continue;
                case 138:
                    a = aock.a(aobv, 138);
                    ardw[] ardwArr = this.o;
                    f = ardwArr != null ? ardwArr.length : 0;
                    ardw[] ardwArr2 = new ardw[(a + f)];
                    if (f != 0) {
                        System.arraycopy(ardwArr, 0, ardwArr2, 0, f);
                    }
                    while (f < ardwArr2.length - 1) {
                        ardwArr2[f] = (ardw) aobv.a(ardw.f.getParserForType());
                        aobv.a();
                        f++;
                    }
                    ardwArr2[f] = (ardw) aobv.a(ardw.f.getParserForType());
                    this.o = ardwArr2;
                    continue;
                case 146:
                    axak axak = (axak) aobv.a(axak.a.getParserForType());
                    axak axak2 = this.p;
                    if (axak2 != null) {
                        axaj axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.p = axak;
                    continue;
                case 154:
                    this.q = aobv.d();
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
