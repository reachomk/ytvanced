package defpackage;

import java.util.Arrays;

/* renamed from: ajsq */
public final class ajsq extends ajwo {
    public static final aobz a = aobz.a(ajsq.class, 520486026);
    public ajsu[] b;
    public aqbs[] c;
    public byte[] d;
    public aphj e;
    public boolean f;
    private arml g;
    private apxu h;
    private arml i;
    private arml j;
    private aqbg k;
    private ajsu[] l;
    private boolean m;

    public ajsq() {
        super(65060753);
        this.b = ajsu.a();
        this.c = new aqbs[0];
        this.d = aock.c;
        this.l = ajsu.a();
        this.m = false;
        this.f = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsq) {
            ajsq ajsq = (ajsq) obj;
            if (aocd.a(this.b, ajsq.b) && aocd.a(this.c, ajsq.c)) {
                arml arml = this.g;
                if (arml == null) {
                    if (ajsq.g != null) {
                        return false;
                    }
                } else if (!arml.equals(ajsq.g)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajsq.d)) {
                    apxu apxu = this.h;
                    if (apxu == null) {
                        if (ajsq.h != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajsq.h)) {
                        return false;
                    }
                    arml = this.i;
                    if (arml == null) {
                        if (ajsq.i != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajsq.i)) {
                        return false;
                    }
                    aphj aphj = this.e;
                    if (aphj == null) {
                        if (ajsq.e != null) {
                            return false;
                        }
                    } else if (!aphj.equals(ajsq.e)) {
                        return false;
                    }
                    arml = this.j;
                    if (arml == null) {
                        if (ajsq.j != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajsq.j)) {
                        return false;
                    }
                    aqbg aqbg = this.k;
                    if (aqbg == null) {
                        if (ajsq.k != null) {
                            return false;
                        }
                    } else if (!aqbg.equals(ajsq.k)) {
                        return false;
                    }
                    if (aocd.a(this.l, ajsq.l) && this.m == ajsq.m && this.f == ajsq.f) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajsq.unknownFieldData);
                        }
                        aocb aocb2 = ajsq.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.b);
        int a2 = aocd.a(this.c);
        arml arml = this.g;
        hashCode = (((((hashCode + 527) * 31) + a) * 31) + a2) * 31;
        a = 0;
        a2 = arml != null ? arml.hashCode() : 0;
        int hashCode2 = Arrays.hashCode(this.d);
        apxu apxu = this.h;
        hashCode = (((hashCode + a2) * 31) + hashCode2) * 31;
        a2 = apxu != null ? apxu.hashCode() : 0;
        arml = this.i;
        hashCode = (hashCode + a2) * 31;
        a2 = arml != null ? arml.hashCode() : 0;
        aphj aphj = this.e;
        hashCode = (hashCode + a2) * 31;
        a2 = aphj != null ? aphj.hashCode() : 0;
        arml = this.j;
        hashCode = (hashCode + a2) * 31;
        a2 = arml != null ? arml.hashCode() : 0;
        aqbg aqbg = this.k;
        hashCode = (((((hashCode + a2) * 31) + (aqbg != null ? aqbg.hashCode() : 0)) * 31) + aocd.a(this.l)) * 31;
        hashCode2 = 1237;
        hashCode = (hashCode + (!this.m ? 1237 : 1231)) * 31;
        if (this.f) {
            hashCode2 = 1231;
        }
        hashCode = (hashCode + hashCode2) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajsu[] ajsuArr = this.b;
        int i2 = 0;
        if (ajsuArr != null && ajsuArr.length > 0) {
            i = 0;
            while (true) {
                ajsu[] ajsuArr2 = this.b;
                if (i >= ajsuArr2.length) {
                    break;
                }
                aocf aocf = ajsuArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        aqbs[] aqbsArr = this.c;
        if (aqbsArr != null && aqbsArr.length > 0) {
            i = 0;
            while (true) {
                aqbs[] aqbsArr2 = this.c;
                if (i >= aqbsArr2.length) {
                    break;
                }
                anze anze = aqbsArr2[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        anze anze2 = this.g;
        if (anze2 != null) {
            aoby.a(3, anze2);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(4, this.d);
        }
        anze2 = this.h;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        anze2 = this.i;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        anze2 = this.j;
        if (anze2 != null) {
            aoby.a(10, anze2);
        }
        anze2 = this.k;
        if (anze2 != null) {
            aoby.a(12, anze2);
        }
        ajsuArr = this.l;
        if (ajsuArr != null && ajsuArr.length > 0) {
            while (true) {
                ajsuArr = this.l;
                if (i2 >= ajsuArr.length) {
                    break;
                }
                aocf aocf2 = ajsuArr[i2];
                if (aocf2 != null) {
                    aoby.a(13, aocf2);
                }
                i2++;
            }
        }
        if (this.m) {
            aoby.a(14, true);
        }
        if (this.f) {
            aoby.a(15, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajsu[] ajsuArr = this.b;
        int i2 = 0;
        if (ajsuArr != null && ajsuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajsu[] ajsuArr2 = this.b;
                if (computeSerializedSize >= ajsuArr2.length) {
                    break;
                }
                aocf aocf = ajsuArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aqbs[] aqbsArr = this.c;
        if (aqbsArr != null && aqbsArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aqbs[] aqbsArr2 = this.c;
                if (computeSerializedSize >= aqbsArr2.length) {
                    break;
                }
                anze anze = aqbsArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(2, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(3, anze2);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(4, this.d);
        }
        anze2 = this.h;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        anze2 = this.i;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        anze2 = this.j;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(10, anze2);
        }
        anze2 = this.k;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(12, anze2);
        }
        ajsuArr = this.l;
        if (ajsuArr != null && ajsuArr.length > 0) {
            while (true) {
                ajsuArr = this.l;
                if (i2 >= ajsuArr.length) {
                    break;
                }
                aocf aocf2 = ajsuArr[i2];
                if (aocf2 != null) {
                    computeSerializedSize += aoby.b(13, aocf2);
                }
                i2++;
            }
        }
        if (this.m) {
            computeSerializedSize += aoby.d(14);
        }
        return this.f ? computeSerializedSize + aoby.d(15) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            ajsu[] ajsuArr;
            int length;
            ajsu[] ajsuArr2;
            aocf ajsu;
            arml arml;
            arml arml2;
            armk armk;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = aock.a(aobv, 10);
                    ajsuArr = this.b;
                    length = ajsuArr != null ? ajsuArr.length : 0;
                    ajsuArr2 = new ajsu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajsuArr, 0, ajsuArr2, 0, length);
                    }
                    while (length < ajsuArr2.length - 1) {
                        ajsu = new ajsu();
                        ajsuArr2[length] = ajsu;
                        aobv.a(ajsu);
                        aobv.a();
                        length++;
                    }
                    ajsu = new ajsu();
                    ajsuArr2[length] = ajsu;
                    aobv.a(ajsu);
                    this.b = ajsuArr2;
                    continue;
                case 18:
                    a = aock.a(aobv, 18);
                    aqbs[] aqbsArr = this.c;
                    length = aqbsArr != null ? aqbsArr.length : 0;
                    aqbs[] aqbsArr2 = new aqbs[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aqbsArr, 0, aqbsArr2, 0, length);
                    }
                    while (length < aqbsArr2.length - 1) {
                        aqbsArr2[length] = (aqbs) aobv.a(aqbs.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aqbsArr2[length] = (aqbs) aobv.a(aqbs.c.getParserForType());
                    this.c = aqbsArr2;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.g;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.g = arml;
                    continue;
                case 34:
                    this.d = aobv.e();
                    continue;
                case cv.aU /*50*/:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.h;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.h = apxu;
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.i;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.i = arml;
                    continue;
                case 66:
                    aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj aphj2 = this.e;
                    if (aphj2 != null) {
                        aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.e = aphj;
                    continue;
                case 82:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.j;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.j = arml;
                    continue;
                case 98:
                    aqbg aqbg = (aqbg) aobv.a(aqbg.c.getParserForType());
                    aqbg aqbg2 = this.k;
                    if (aqbg2 != null) {
                        aqbf aqbf = (aqbf) ((anxo) aqbg2.toBuilder());
                        aqbf.mergeFrom(aqbg);
                        aqbg = (aqbg) ((anxl) aqbf.build());
                    }
                    this.k = aqbg;
                    continue;
                case 106:
                    a = aock.a(aobv, 106);
                    ajsuArr = this.l;
                    length = ajsuArr != null ? ajsuArr.length : 0;
                    ajsuArr2 = new ajsu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajsuArr, 0, ajsuArr2, 0, length);
                    }
                    while (length < ajsuArr2.length - 1) {
                        ajsu = new ajsu();
                        ajsuArr2[length] = ajsu;
                        aobv.a(ajsu);
                        aobv.a();
                        length++;
                    }
                    ajsu = new ajsu();
                    ajsuArr2[length] = ajsu;
                    aobv.a(ajsu);
                    this.l = ajsuArr2;
                    continue;
                case 112:
                    this.m = aobv.c();
                    continue;
                case 120:
                    this.f = aobv.c();
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
