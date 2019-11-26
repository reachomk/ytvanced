package defpackage;

/* renamed from: ajri */
public final class ajri extends aoca {
    public static volatile ajri[] a;
    public arml b;
    public ajrh c;
    public aphj d;
    public apzc e;
    public long f;
    public int g;
    public int h;
    private arml i;
    private apxu j;
    private apxu k;

    public ajri() {
        this.g = 1;
        this.h = 1;
        this.c = null;
        this.e = apzc.COMMENT_POLL_STATUS_UNKNOWN;
        this.f = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajri) {
            ajri ajri = (ajri) obj;
            if (this.g == ajri.g && this.h == ajri.h) {
                arml arml = this.b;
                if (arml == null) {
                    if (ajri.b != null) {
                        return false;
                    }
                } else if (!arml.equals(ajri.b)) {
                    return false;
                }
                arml = this.i;
                if (arml == null) {
                    if (ajri.i != null) {
                        return false;
                    }
                } else if (!arml.equals(ajri.i)) {
                    return false;
                }
                apxu apxu = this.j;
                if (apxu == null) {
                    if (ajri.j != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajri.j)) {
                    return false;
                }
                ajrh ajrh = this.c;
                if (ajrh == null) {
                    if (ajri.c != null) {
                        return false;
                    }
                } else if (!ajrh.equals(ajri.c)) {
                    return false;
                }
                aphj aphj = this.d;
                if (aphj == null) {
                    if (ajri.d != null) {
                        return false;
                    }
                } else if (!aphj.equals(ajri.d)) {
                    return false;
                }
                if (this.e == ajri.e && this.f == ajri.f) {
                    apxu = this.k;
                    if (apxu == null) {
                        if (ajri.k != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajri.k)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajri.unknownFieldData);
                    }
                    aocb aocb2 = ajri.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int i = this.g;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        hashCode = (hashCode + i) * 31;
        i = this.h;
        if (i == 0) {
            i = 0;
        }
        arml arml = this.b;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        arml = this.i;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.j;
        hashCode = (hashCode + i) * 31;
        i = apxu != null ? apxu.hashCode() : 0;
        ajrh ajrh = this.c;
        hashCode = (hashCode + i) * 31;
        i = ajrh != null ? ajrh.hashCode() : 0;
        aphj aphj = this.d;
        hashCode = (((hashCode + i) * 31) + (aphj != null ? aphj.hashCode() : 0)) * 31;
        apzc apzc = this.e;
        i = apzc != null ? apzc.hashCode() : 0;
        long j = this.f;
        apxu apxu2 = this.k;
        hashCode = (((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (apxu2 != null ? apxu2.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            aoby.a(1, i - 1);
        }
        i = this.h;
        if (!(i == 1 || i == 0)) {
            aoby.a(2, i - 1);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(5, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(7, anze);
        }
        if (this.e != apzc.COMMENT_POLL_STATUS_UNKNOWN) {
            apzc apzc = this.e;
            if (apzc != null) {
                aoby.a(8, apzc.f);
            }
        }
        long j = this.f;
        if (j != 0) {
            aoby.b(9, j);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(10, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(1, i - 1);
        }
        i = this.h;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(2, i - 1);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        if (this.e != apzc.COMMENT_POLL_STATUS_UNKNOWN) {
            apzc apzc = this.e;
            if (apzc != null) {
                computeSerializedSize += aoby.c(8, apzc.f);
            }
        }
        long j = this.f;
        if (j != 0) {
            computeSerializedSize += aoby.d(9, j);
        }
        anze = this.k;
        return anze != null ? computeSerializedSize + anwm.c(10, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 2;
            int f;
            arml arml;
            arml arml2;
            armk armk;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            switch (a) {
                case 0:
                    break;
                case 8:
                    int i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1) {
                        if (f == 0) {
                            i = 1;
                        } else if (f != 1) {
                            i = 0;
                        }
                        this.g = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 16:
                    f = aobv.b;
                    int f2 = aobv.f();
                    switch (f2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            switch (f2) {
                                case 0:
                                    i = 1;
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                    i = 4;
                                    break;
                                case 4:
                                    i = 5;
                                    break;
                                case 5:
                                    i = 6;
                                    break;
                                case 6:
                                    i = 7;
                                    break;
                                case 7:
                                    i = 8;
                                    break;
                                case 8:
                                    i = 9;
                                    break;
                                case 9:
                                    i = 10;
                                    break;
                                case 10:
                                    i = 11;
                                    break;
                                case 11:
                                    i = 12;
                                    break;
                                case 12:
                                    i = 13;
                                    break;
                                case 13:
                                    i = 14;
                                    break;
                                case 14:
                                    i = 15;
                                    break;
                                case 15:
                                    i = 16;
                                    break;
                                case 16:
                                    i = 17;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            this.h = i;
                            break;
                        default:
                            aobv.e(f);
                            storeUnknownField(aobv, a);
                            continue;
                    }
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
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 42:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.j;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.j = apxu;
                    continue;
                case cv.aU /*50*/:
                    if (this.c == null) {
                        this.c = new ajrh();
                    }
                    aobv.a(this.c);
                    continue;
                case 58:
                    aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj aphj2 = this.d;
                    if (aphj2 != null) {
                        aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.d = aphj;
                    continue;
                case 64:
                    i = aobv.b;
                    int f3 = aobv.f();
                    if (f3 == 0 || f3 == 10 || f3 == 20 || f3 == 30 || f3 == 40) {
                        this.e = apzc.a(f3);
                        break;
                    }
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                    continue;
                case 72:
                    this.f = aobv.g();
                    continue;
                case 82:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.k;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.k = apxu;
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
