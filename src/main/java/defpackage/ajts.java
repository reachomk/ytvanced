package defpackage;

import java.util.Arrays;

/* renamed from: ajts */
public final class ajts extends ajwo {
    public arml a;
    public long b = 0;
    public ajtp[] c;
    public auvr d;
    public aqob e;
    public aqoh[] f;
    public apxu g;
    public boolean h;
    public ajtp i;
    public arml j;
    public aqol k;
    public ajzw l;
    public long m;
    public ajzw n;
    public ajzw o;
    private boolean p = false;
    private byte[] q;
    private boolean r;
    private String s;
    private String t;

    public ajts() {
        super(69224570);
        if (ajtp.a == null) {
            synchronized (aocd.b) {
                if (ajtp.a == null) {
                    ajtp.a = new ajtp[0];
                }
            }
        }
        this.c = ajtp.a;
        this.f = new aqoh[0];
        this.q = aock.c;
        this.h = false;
        this.i = null;
        this.r = false;
        this.s = "";
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.t = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajts) {
            ajts ajts = (ajts) obj;
            if (this.p == ajts.p) {
                arml arml = this.a;
                if (arml == null) {
                    if (ajts.a != null) {
                        return false;
                    }
                } else if (!arml.equals(ajts.a)) {
                    return false;
                }
                if (this.b == ajts.b && aocd.a(this.c, ajts.c)) {
                    auvr auvr = this.d;
                    if (auvr == null) {
                        if (ajts.d != null) {
                            return false;
                        }
                    } else if (!auvr.equals(ajts.d)) {
                        return false;
                    }
                    aqob aqob = this.e;
                    if (aqob == null) {
                        if (ajts.e != null) {
                            return false;
                        }
                    } else if (!aqob.equals(ajts.e)) {
                        return false;
                    }
                    if (aocd.a(this.f, ajts.f) && Arrays.equals(this.q, ajts.q)) {
                        apxu apxu = this.g;
                        if (apxu == null) {
                            if (ajts.g != null) {
                                return false;
                            }
                        } else if (!apxu.equals(ajts.g)) {
                            return false;
                        }
                        if (this.h == ajts.h) {
                            ajtp ajtp = this.i;
                            if (ajtp == null) {
                                if (ajts.i != null) {
                                    return false;
                                }
                            } else if (!ajtp.equals(ajts.i)) {
                                return false;
                            }
                            arml = this.j;
                            if (arml == null) {
                                if (ajts.j != null) {
                                    return false;
                                }
                            } else if (!arml.equals(ajts.j)) {
                                return false;
                            }
                            aqol aqol = this.k;
                            if (aqol == null) {
                                if (ajts.k != null) {
                                    return false;
                                }
                            } else if (!aqol.equals(ajts.k)) {
                                return false;
                            }
                            if (this.r == ajts.r) {
                                String str = this.s;
                                if (str == null) {
                                    if (ajts.s != null) {
                                        return false;
                                    }
                                } else if (!str.equals(ajts.s)) {
                                    return false;
                                }
                                ajzw ajzw = this.l;
                                if (ajzw == null) {
                                    if (ajts.l != null) {
                                        return false;
                                    }
                                } else if (!ajzw.equals(ajts.l)) {
                                    return false;
                                }
                                if (this.m == ajts.m) {
                                    ajzw = this.n;
                                    if (ajzw == null) {
                                        if (ajts.n != null) {
                                            return false;
                                        }
                                    } else if (!ajzw.equals(ajts.n)) {
                                        return false;
                                    }
                                    ajzw = this.o;
                                    if (ajzw == null) {
                                        if (ajts.o != null) {
                                            return false;
                                        }
                                    } else if (!ajzw.equals(ajts.o)) {
                                        return false;
                                    }
                                    str = this.t;
                                    if (str == null) {
                                        if (ajts.t != null) {
                                            return false;
                                        }
                                    } else if (!str.equals(ajts.t)) {
                                        return false;
                                    }
                                    aocb aocb = this.unknownFieldData;
                                    if (aocb != null && !aocb.b()) {
                                        return this.unknownFieldData.equals(ajts.unknownFieldData);
                                    }
                                    aocb aocb2 = ajts.unknownFieldData;
                                    return aocb2 == null || aocb2.b();
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int i = 1237;
        int i2 = !this.p ? 1237 : 1231;
        arml arml = this.a;
        hashCode = (hashCode + i2) * 31;
        i2 = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        long j = this.b;
        int a = aocd.a(this.c);
        auvr auvr = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + a) * 31;
        int hashCode3 = auvr != null ? auvr.hashCode() : 0;
        aqob aqob = this.e;
        hashCode = (hashCode + hashCode3) * 31;
        hashCode3 = aqob != null ? aqob.hashCode() : 0;
        int a2 = aocd.a(this.f);
        a = Arrays.hashCode(this.q);
        apxu apxu = this.g;
        hashCode = (((((((hashCode + hashCode3) * 31) + a2) * 31) + a) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        hashCode3 = !this.h ? 1237 : 1231;
        ajtp ajtp = this.i;
        hashCode = (hashCode + hashCode3) * 31;
        hashCode3 = ajtp != null ? ajtp.hashCode() : 0;
        arml arml2 = this.j;
        hashCode = (hashCode + hashCode3) * 31;
        hashCode3 = arml2 != null ? arml2.hashCode() : 0;
        aqol aqol = this.k;
        hashCode = (((hashCode + hashCode3) * 31) + (aqol != null ? aqol.hashCode() : 0)) * 31;
        if (this.r) {
            i = 1231;
        }
        hashCode = (hashCode + i) * 31;
        String str = this.s;
        i = str != null ? str.hashCode() : 0;
        ajzw ajzw = this.l;
        hashCode = (hashCode + i) * 31;
        i = ajzw != null ? ajzw.hashCode() : 0;
        j = this.m;
        ajzw = this.n;
        hashCode = (((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        i = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.o;
        hashCode = (((hashCode + i) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        if (this.p) {
            aoby.a(1, true);
        }
        anze anze = this.a;
        if (anze != null) {
            aoby.a(5, anze);
        }
        long j = this.b;
        if (j != 0) {
            aoby.a(6, j);
        }
        ajtp[] ajtpArr = this.c;
        int i = 0;
        if (ajtpArr != null && ajtpArr.length > 0) {
            int i2 = 0;
            while (true) {
                ajtp[] ajtpArr2 = this.c;
                if (i2 >= ajtpArr2.length) {
                    break;
                }
                aocf aocf = ajtpArr2[i2];
                if (aocf != null) {
                    aoby.a(7, aocf);
                }
                i2++;
            }
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(11, anze);
        }
        aqoh[] aqohArr = this.f;
        if (aqohArr != null && aqohArr.length > 0) {
            while (true) {
                aqohArr = this.f;
                if (i >= aqohArr.length) {
                    break;
                }
                anze = aqohArr[i];
                if (anze != null) {
                    aoby.a(12, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.q, aock.c)) {
            aoby.a(14, this.q);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(16, anze);
        }
        if (this.h) {
            aoby.a(17, true);
        }
        aocf aocf2 = this.i;
        if (aocf2 != null) {
            aoby.a(18, aocf2);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(20, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(21, anze);
        }
        if (this.r) {
            aoby.a(22, true);
        }
        String str = this.s;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(23, this.s);
        }
        aocf2 = this.l;
        if (aocf2 != null) {
            aoby.a(24, aocf2);
        }
        j = this.m;
        if (j != 0) {
            aoby.b(26, j);
        }
        aocf2 = this.n;
        if (aocf2 != null) {
            aoby.a(28, aocf2);
        }
        aocf2 = this.o;
        if (aocf2 != null) {
            aoby.a(29, aocf2);
        }
        str = this.t;
        if (!(str == null || str.equals(str2))) {
            aoby.a(31, this.t);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.p) {
            computeSerializedSize += aoby.d(1);
        }
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        long j = this.b;
        if (j != 0) {
            computeSerializedSize += aoby.c(6, j);
        }
        ajtp[] ajtpArr = this.c;
        int i = 0;
        if (ajtpArr != null && ajtpArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajtp[] ajtpArr2 = this.c;
                if (computeSerializedSize >= ajtpArr2.length) {
                    break;
                }
                aocf aocf = ajtpArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(7, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        aqoh[] aqohArr = this.f;
        if (aqohArr != null && aqohArr.length > 0) {
            while (true) {
                aqohArr = this.f;
                if (i >= aqohArr.length) {
                    break;
                }
                anze = aqohArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(12, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.q, aock.c)) {
            computeSerializedSize += aoby.b(14, this.q);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(17);
        }
        aocf aocf2 = this.i;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(18, aocf2);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(21, anze);
        }
        if (this.r) {
            computeSerializedSize += aoby.d(22);
        }
        String str = this.s;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(23, this.s);
        }
        aocf2 = this.l;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(24, aocf2);
        }
        long j2 = this.m;
        if (j2 != 0) {
            computeSerializedSize += aoby.d(26, j2);
        }
        aocf2 = this.n;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(28, aocf2);
        }
        aocf2 = this.o;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(29, aocf2);
        }
        str = this.t;
        return (str == null || str.equals(str2)) ? computeSerializedSize : computeSerializedSize + aoby.b(31, this.t);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            int length;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.p = aobv.c();
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.a;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 48:
                    this.b = aobv.g();
                    continue;
                case 58:
                    aocf ajtp;
                    a = aock.a(aobv, 58);
                    ajtp[] ajtpArr = this.c;
                    length = ajtpArr != null ? ajtpArr.length : 0;
                    ajtp[] ajtpArr2 = new ajtp[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajtpArr, 0, ajtpArr2, 0, length);
                    }
                    while (length < ajtpArr2.length - 1) {
                        ajtp = new ajtp();
                        ajtpArr2[length] = ajtp;
                        aobv.a(ajtp);
                        aobv.a();
                        length++;
                    }
                    ajtp = new ajtp();
                    ajtpArr2[length] = ajtp;
                    aobv.a(ajtp);
                    this.c = ajtpArr2;
                    continue;
                case 74:
                    auvr auvr = (auvr) aobv.a(auvr.c.getParserForType());
                    auvr auvr2 = this.d;
                    if (auvr2 != null) {
                        auvu auvu = (auvu) ((anxo) auvr2.toBuilder());
                        auvu.mergeFrom(auvr);
                        auvr = (auvr) ((anxl) auvu.build());
                    }
                    this.d = auvr;
                    continue;
                case 90:
                    aqob aqob = (aqob) aobv.a(aqob.c.getParserForType());
                    aqob aqob2 = this.e;
                    if (aqob2 != null) {
                        aqoa aqoa = (aqoa) ((anxo) aqob2.toBuilder());
                        aqoa.mergeFrom(aqob);
                        aqob = (aqob) ((anxl) aqoa.build());
                    }
                    this.e = aqob;
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    aqoh[] aqohArr = this.f;
                    length = aqohArr != null ? aqohArr.length : 0;
                    aqoh[] aqohArr2 = new aqoh[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aqohArr, 0, aqohArr2, 0, length);
                    }
                    while (length < aqohArr2.length - 1) {
                        aqohArr2[length] = (aqoh) aobv.a(aqoh.e.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aqohArr2[length] = (aqoh) aobv.a(aqoh.e.getParserForType());
                    this.f = aqohArr2;
                    continue;
                case 114:
                    this.q = aobv.e();
                    continue;
                case 130:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case 136:
                    this.h = aobv.c();
                    continue;
                case 146:
                    if (this.i == null) {
                        this.i = new ajtp();
                    }
                    aobv.a(this.i);
                    continue;
                case 162:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.j;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.j = arml;
                    continue;
                case 170:
                    aqol aqol = (aqol) aobv.a(aqol.c.getParserForType());
                    aqol aqol2 = this.k;
                    if (aqol2 != null) {
                        aqok aqok = (aqok) ((anxo) aqol2.toBuilder());
                        aqok.mergeFrom(aqol);
                        aqol = (aqol) ((anxl) aqok.build());
                    }
                    this.k = aqol;
                    continue;
                case 176:
                    this.r = aobv.c();
                    continue;
                case 186:
                    this.s = aobv.d();
                    continue;
                case 194:
                    if (this.l == null) {
                        this.l = new ajzw();
                    }
                    aobv.a(this.l);
                    continue;
                case 208:
                    this.m = aobv.g();
                    continue;
                case 226:
                    if (this.n == null) {
                        this.n = new ajzw();
                    }
                    aobv.a(this.n);
                    continue;
                case 234:
                    if (this.o == null) {
                        this.o = new ajzw();
                    }
                    aobv.a(this.o);
                    continue;
                case 250:
                    this.t = aobv.d();
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
