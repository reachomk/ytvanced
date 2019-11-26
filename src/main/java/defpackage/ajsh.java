package defpackage;

import java.util.Arrays;

/* renamed from: ajsh */
public final class ajsh extends ajwo {
    public aphj a;
    public aphj b;
    public aphj c;
    public aqrq d;
    public long e;
    private aphj f;
    private aphj g;
    private aphj h;
    private aphj i;
    private byte[] j;
    private apya k;
    private apya l;
    private apya m;
    private apya n;
    private apya o;
    private axak p;
    private int q;

    public ajsh() {
        super(66744747);
        this.j = aock.c;
        this.e = 0;
        this.q = 1;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsh) {
            ajsh ajsh = (ajsh) obj;
            aphj aphj = this.a;
            if (aphj == null) {
                if (ajsh.a != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.a)) {
                return false;
            }
            aphj = this.b;
            if (aphj == null) {
                if (ajsh.b != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.b)) {
                return false;
            }
            aphj = this.f;
            if (aphj == null) {
                if (ajsh.f != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.f)) {
                return false;
            }
            aphj = this.g;
            if (aphj == null) {
                if (ajsh.g != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.g)) {
                return false;
            }
            aphj = this.h;
            if (aphj == null) {
                if (ajsh.h != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.h)) {
                return false;
            }
            aphj = this.i;
            if (aphj == null) {
                if (ajsh.i != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.i)) {
                return false;
            }
            aphj = this.c;
            if (aphj == null) {
                if (ajsh.c != null) {
                    return false;
                }
            } else if (!aphj.equals(ajsh.c)) {
                return false;
            }
            if (Arrays.equals(this.j, ajsh.j)) {
                apya apya = this.k;
                if (apya == null) {
                    if (ajsh.k != null) {
                        return false;
                    }
                } else if (!apya.equals(ajsh.k)) {
                    return false;
                }
                apya = this.l;
                if (apya == null) {
                    if (ajsh.l != null) {
                        return false;
                    }
                } else if (!apya.equals(ajsh.l)) {
                    return false;
                }
                apya = this.m;
                if (apya == null) {
                    if (ajsh.m != null) {
                        return false;
                    }
                } else if (!apya.equals(ajsh.m)) {
                    return false;
                }
                apya = this.n;
                if (apya == null) {
                    if (ajsh.n != null) {
                        return false;
                    }
                } else if (!apya.equals(ajsh.n)) {
                    return false;
                }
                apya = this.o;
                if (apya == null) {
                    if (ajsh.o != null) {
                        return false;
                    }
                } else if (!apya.equals(ajsh.o)) {
                    return false;
                }
                aqrq aqrq = this.d;
                if (aqrq == null) {
                    if (ajsh.d != null) {
                        return false;
                    }
                } else if (!aqrq.equals(ajsh.d)) {
                    return false;
                }
                if (this.e == ajsh.e) {
                    axak axak = this.p;
                    if (axak == null) {
                        if (ajsh.p != null) {
                            return false;
                        }
                    } else if (!axak.equals(ajsh.p)) {
                        return false;
                    }
                    if (this.q == ajsh.q) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajsh.unknownFieldData);
                        }
                        aocb aocb2 = ajsh.unknownFieldData;
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
        aphj aphj2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        aphj2 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        aphj2 = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        aphj2 = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        aphj2 = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        aphj2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.j);
        apya apya = this.k;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apya != null ? apya.hashCode() : 0;
        apya apya2 = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apya2 != null ? apya2.hashCode() : 0;
        apya2 = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apya2 != null ? apya2.hashCode() : 0;
        apya2 = this.n;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apya2 != null ? apya2.hashCode() : 0;
        apya2 = this.o;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apya2 != null ? apya2.hashCode() : 0;
        aqrq aqrq = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqrq != null ? aqrq.hashCode() : 0;
        long j = this.e;
        axak axak = this.p;
        hashCode = (((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (axak != null ? axak.hashCode() : 0)) * 31;
        hashCode2 = this.q;
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
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(7, anze);
        }
        if (!Arrays.equals(this.j, aock.c)) {
            aoby.a(8, this.j);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(11, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(12, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(13, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(15, anze);
        }
        long j = this.e;
        if (j != 0) {
            aoby.b(16, j);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(17, anze);
        }
        int i = this.q;
        if (!(i == 1 || i == 0)) {
            aoby.a(18, i - 1);
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
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        if (!Arrays.equals(this.j, aock.c)) {
            computeSerializedSize += aoby.b(8, this.j);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(15, anze);
        }
        long j = this.e;
        if (j != 0) {
            computeSerializedSize += aoby.d(16, j);
        }
        anze = this.p;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        int i = this.q;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(18, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            aphj aphj;
            aphj aphj2;
            aphm aphm;
            apya apya;
            apya apya2;
            apyd apyd;
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
                    aphj2 = this.b;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.b = aphj;
                    continue;
                case 26:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.f;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.f = aphj;
                    continue;
                case 34:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.g;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.g = aphj;
                    continue;
                case 42:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.h;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.h = aphj;
                    continue;
                case cv.aU /*50*/:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.i;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.i = aphj;
                    continue;
                case 58:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.c;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.c = aphj;
                    continue;
                case 66:
                    this.j = aobv.e();
                    continue;
                case 82:
                    apya = (apya) aobv.a(apya.c.getParserForType());
                    apya2 = this.k;
                    if (apya2 != null) {
                        apyd = (apyd) ((anxo) apya2.toBuilder());
                        apyd.mergeFrom(apya);
                        apya = (apya) ((anxl) apyd.build());
                    }
                    this.k = apya;
                    continue;
                case 90:
                    apya = (apya) aobv.a(apya.c.getParserForType());
                    apya2 = this.l;
                    if (apya2 != null) {
                        apyd = (apyd) ((anxo) apya2.toBuilder());
                        apyd.mergeFrom(apya);
                        apya = (apya) ((anxl) apyd.build());
                    }
                    this.l = apya;
                    continue;
                case 98:
                    apya = (apya) aobv.a(apya.c.getParserForType());
                    apya2 = this.m;
                    if (apya2 != null) {
                        apyd = (apyd) ((anxo) apya2.toBuilder());
                        apyd.mergeFrom(apya);
                        apya = (apya) ((anxl) apyd.build());
                    }
                    this.m = apya;
                    continue;
                case 106:
                    apya = (apya) aobv.a(apya.c.getParserForType());
                    apya2 = this.n;
                    if (apya2 != null) {
                        apyd = (apyd) ((anxo) apya2.toBuilder());
                        apyd.mergeFrom(apya);
                        apya = (apya) ((anxl) apyd.build());
                    }
                    this.n = apya;
                    continue;
                case 114:
                    apya = (apya) aobv.a(apya.c.getParserForType());
                    apya2 = this.o;
                    if (apya2 != null) {
                        apyd = (apyd) ((anxo) apya2.toBuilder());
                        apyd.mergeFrom(apya);
                        apya = (apya) ((anxl) apyd.build());
                    }
                    this.o = apya;
                    continue;
                case afy.av /*122*/:
                    aqrq aqrq = (aqrq) aobv.a(aqrq.c.getParserForType());
                    aqrq aqrq2 = this.d;
                    if (aqrq2 != null) {
                        aqrp aqrp = (aqrp) ((anxo) aqrq2.toBuilder());
                        aqrp.mergeFrom(aqrq);
                        aqrq = (aqrq) ((anxl) aqrp.build());
                    }
                    this.d = aqrq;
                    continue;
                case 128:
                    this.e = aobv.g();
                    continue;
                case 138:
                    axak axak = (axak) aobv.a(axak.a.getParserForType());
                    axak axak2 = this.p;
                    if (axak2 != null) {
                        axaj axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.p = axak;
                    continue;
                case 144:
                    int i = aobv.b;
                    int f = aobv.f();
                    int i2 = 2;
                    if (f == 0 || f == 1 || f == 2) {
                        if (f == 0) {
                            i2 = 1;
                        } else if (f != 1) {
                            i2 = f != 2 ? 0 : 3;
                        }
                        this.q = i2;
                        break;
                    }
                    aobv.e(i);
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
