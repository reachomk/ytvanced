package defpackage;

import java.util.Arrays;

/* renamed from: ajrr */
public final class ajrr extends aoca {
    public ajru a;
    public ajtk b;
    public ajrp c;
    public byte[] d;
    public asbq e;
    public ajrs f;
    public arnm frameworkUpdates;
    public asbs g;
    public apxu[] h;
    public apxu[] i;
    public boolean j;
    public apxu k;
    public apxu l;
    public ajzw[] m;
    private asbg[] n;
    private asbk o;
    private boolean p;
    private boolean q;
    private aokf r;
    private int s;
    private int t;
    private ajzw u;
    private ajzw v;

    public ajrr() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.n = new asbg[0];
        this.d = aock.c;
        this.p = false;
        this.f = null;
        this.q = false;
        this.h = new apxu[0];
        this.i = new apxu[0];
        this.j = false;
        this.s = 0;
        this.t = 0;
        this.u = null;
        this.v = null;
        this.m = ajzw.a();
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrr) {
            ajrr ajrr = (ajrr) obj;
            ajru ajru = this.a;
            if (ajru == null) {
                if (ajrr.a != null) {
                    return false;
                }
            } else if (!ajru.equals(ajrr.a)) {
                return false;
            }
            ajtk ajtk = this.b;
            if (ajtk == null) {
                if (ajrr.b != null) {
                    return false;
                }
            } else if (!ajtk.equals(ajrr.b)) {
                return false;
            }
            ajrp ajrp = this.c;
            if (ajrp == null) {
                if (ajrr.c != null) {
                    return false;
                }
            } else if (!ajrp.equals(ajrr.c)) {
                return false;
            }
            if (aocd.a(this.n, ajrr.n)) {
                asbk asbk = this.o;
                if (asbk == null) {
                    if (ajrr.o != null) {
                        return false;
                    }
                } else if (!asbk.equals(ajrr.o)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajrr.d)) {
                    asbq asbq = this.e;
                    if (asbq == null) {
                        if (ajrr.e != null) {
                            return false;
                        }
                    } else if (!asbq.equals(ajrr.e)) {
                        return false;
                    }
                    if (this.p == ajrr.p) {
                        ajrs ajrs = this.f;
                        if (ajrs == null) {
                            if (ajrr.f != null) {
                                return false;
                            }
                        } else if (!ajrs.equals(ajrr.f)) {
                            return false;
                        }
                        if (this.q == ajrr.q) {
                            asbs asbs = this.g;
                            if (asbs == null) {
                                if (ajrr.g != null) {
                                    return false;
                                }
                            } else if (!asbs.equals(ajrr.g)) {
                                return false;
                            }
                            if (aocd.a(this.h, ajrr.h) && aocd.a(this.i, ajrr.i) && this.j == ajrr.j) {
                                aokf aokf = this.r;
                                if (aokf == null) {
                                    if (ajrr.r != null) {
                                        return false;
                                    }
                                } else if (!aokf.equals(ajrr.r)) {
                                    return false;
                                }
                                if (this.s == ajrr.s && this.t == ajrr.t) {
                                    apxu apxu = this.k;
                                    if (apxu == null) {
                                        if (ajrr.k != null) {
                                            return false;
                                        }
                                    } else if (!apxu.equals(ajrr.k)) {
                                        return false;
                                    }
                                    ajzw ajzw = this.u;
                                    if (ajzw == null) {
                                        if (ajrr.u != null) {
                                            return false;
                                        }
                                    } else if (!ajzw.equals(ajrr.u)) {
                                        return false;
                                    }
                                    apxu = this.l;
                                    if (apxu == null) {
                                        if (ajrr.l != null) {
                                            return false;
                                        }
                                    } else if (!apxu.equals(ajrr.l)) {
                                        return false;
                                    }
                                    ajzw = this.v;
                                    if (ajzw == null) {
                                        if (ajrr.v != null) {
                                            return false;
                                        }
                                    } else if (!ajzw.equals(ajrr.v)) {
                                        return false;
                                    }
                                    if (aocd.a(this.m, ajrr.m)) {
                                        arnm arnm = this.frameworkUpdates;
                                        if (arnm == null) {
                                            if (ajrr.frameworkUpdates != null) {
                                                return false;
                                            }
                                        } else if (!arnm.equals(ajrr.frameworkUpdates)) {
                                            return false;
                                        }
                                        aocb aocb = this.unknownFieldData;
                                        if (aocb != null && !aocb.b()) {
                                            return this.unknownFieldData.equals(ajrr.unknownFieldData);
                                        }
                                        aocb aocb2 = ajrr.unknownFieldData;
                                        return aocb2 == null || aocb2.b();
                                    }
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
        int hashCode = getClass().getName().hashCode();
        ajru ajru = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajru != null ? ajru.hashCode() : 0;
        ajtk ajtk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtk != null ? ajtk.hashCode() : 0;
        ajrp ajrp = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajrp != null ? ajrp.hashCode() : 0;
        int a = aocd.a(this.n);
        asbk asbk = this.o;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = asbk != null ? asbk.hashCode() : 0;
        a = Arrays.hashCode(this.d);
        asbq asbq = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (asbq != null ? asbq.hashCode() : 0)) * 31;
        a = 1237;
        hashCode2 = !this.p ? 1237 : 1231;
        ajrs ajrs = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (ajrs != null ? ajrs.hashCode() : 0)) * 31;
        hashCode2 = !this.q ? 1237 : 1231;
        asbs asbs = this.g;
        hashCode = (((((((hashCode + hashCode2) * 31) + (asbs != null ? asbs.hashCode() : 0)) * 31) + aocd.a(this.h)) * 31) + aocd.a(this.i)) * 31;
        if (this.j) {
            a = 1231;
        }
        aokf aokf = this.r;
        hashCode = (hashCode + a) * 31;
        hashCode2 = aokf != null ? aokf.hashCode() : 0;
        a = this.s;
        int i2 = this.t;
        apxu apxu = this.k;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + i2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        ajzw ajzw = this.u;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        apxu apxu2 = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        ajzw = this.v;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        a = aocd.a(this.m);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        apxu[] apxuArr;
        anze anze;
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(9, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(10, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(13, aocf);
        }
        asbg[] asbgArr = this.n;
        int i2 = 0;
        if (asbgArr != null && asbgArr.length > 0) {
            i = 0;
            while (true) {
                asbg[] asbgArr2 = this.n;
                if (i >= asbgArr2.length) {
                    break;
                }
                anze anze2 = asbgArr2[i];
                if (anze2 != null) {
                    aoby.a(14, anze2);
                }
                i++;
            }
        }
        anze anze3 = this.o;
        if (anze3 != null) {
            aoby.a(15, anze3);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(16, this.d);
        }
        anze3 = this.e;
        if (anze3 != null) {
            aoby.a(18, anze3);
        }
        if (this.p) {
            aoby.a(19, true);
        }
        aocf = this.f;
        if (aocf != null) {
            aoby.a(20, aocf);
        }
        if (this.q) {
            aoby.a(26, true);
        }
        anze3 = this.g;
        if (anze3 != null) {
            aoby.a(28, anze3);
        }
        apxu[] apxuArr2 = this.h;
        if (apxuArr2 != null && apxuArr2.length > 0) {
            i = 0;
            while (true) {
                apxuArr = this.h;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(29, anze);
                }
                i++;
            }
        }
        apxuArr2 = this.i;
        if (apxuArr2 != null && apxuArr2.length > 0) {
            i = 0;
            while (true) {
                apxuArr = this.i;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(30, anze);
                }
                i++;
            }
        }
        if (this.j) {
            aoby.a(31, true);
        }
        anze3 = this.r;
        if (anze3 != null) {
            aoby.a(32, anze3);
        }
        i = this.s;
        if (i != 0) {
            aoby.b(34, i);
        }
        i = this.t;
        if (i != 0) {
            aoby.b(35, i);
        }
        anze3 = this.k;
        if (anze3 != null) {
            aoby.a(36, anze3);
        }
        aocf = this.u;
        if (aocf != null) {
            aoby.a(37, aocf);
        }
        anze3 = this.l;
        if (anze3 != null) {
            aoby.a(38, anze3);
        }
        aocf = this.v;
        if (aocf != null) {
            aoby.a(39, aocf);
        }
        ajzw[] ajzwArr = this.m;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.m;
                if (i2 >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i2];
                if (aocf != null) {
                    aoby.a(40, aocf);
                }
                i2++;
            }
        }
        anze3 = this.frameworkUpdates;
        if (anze3 != null) {
            aoby.a(777, anze3);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        apxu[] apxuArr;
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(9, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(10, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(13, aocf);
        }
        asbg[] asbgArr = this.n;
        int i2 = 0;
        if (asbgArr != null && asbgArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                asbg[] asbgArr2 = this.n;
                if (computeSerializedSize >= asbgArr2.length) {
                    break;
                }
                anze = asbgArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(14, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze anze2 = this.o;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(15, anze2);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(16, this.d);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(18, anze2);
        }
        if (this.p) {
            computeSerializedSize += aoby.d(19);
        }
        aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(20, aocf);
        }
        if (this.q) {
            computeSerializedSize += aoby.d(26);
        }
        anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(28, anze2);
        }
        apxu[] apxuArr2 = this.h;
        if (apxuArr2 != null && apxuArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxuArr = this.h;
                if (computeSerializedSize >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(29, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        apxuArr2 = this.i;
        if (apxuArr2 != null && apxuArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxuArr = this.i;
                if (computeSerializedSize >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(30, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (this.j) {
            computeSerializedSize += aoby.d(31);
        }
        anze2 = this.r;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(32, anze2);
        }
        i = this.s;
        if (i != 0) {
            computeSerializedSize += aoby.d(34, i);
        }
        i = this.t;
        if (i != 0) {
            computeSerializedSize += aoby.d(35, i);
        }
        anze2 = this.k;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(36, anze2);
        }
        aocf = this.u;
        if (aocf != null) {
            computeSerializedSize += aoby.b(37, aocf);
        }
        anze2 = this.l;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(38, anze2);
        }
        aocf = this.v;
        if (aocf != null) {
            computeSerializedSize += aoby.b(39, aocf);
        }
        ajzw[] ajzwArr = this.m;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.m;
                if (i2 >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i2];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(40, aocf);
                }
                i2++;
            }
        }
        anze2 = this.frameworkUpdates;
        return anze2 != null ? computeSerializedSize + anwm.c(777, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            apxu[] apxuArr;
            apxu[] apxuArr2;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            switch (a) {
                case 0:
                    break;
                case 74:
                    if (this.a == null) {
                        this.a = new ajru();
                    }
                    aobv.a(this.a);
                    continue;
                case 82:
                    if (this.b == null) {
                        this.b = new ajtk();
                    }
                    aobv.a(this.b);
                    continue;
                case 106:
                    if (this.c == null) {
                        this.c = new ajrp();
                    }
                    aobv.a(this.c);
                    continue;
                case 114:
                    a = aock.a(aobv, 114);
                    asbg[] asbgArr = this.n;
                    length = asbgArr != null ? asbgArr.length : 0;
                    asbg[] asbgArr2 = new asbg[(a + length)];
                    if (length != 0) {
                        System.arraycopy(asbgArr, 0, asbgArr2, 0, length);
                    }
                    while (length < asbgArr2.length - 1) {
                        asbgArr2[length] = (asbg) aobv.a(asbg.a.getParserForType());
                        aobv.a();
                        length++;
                    }
                    asbgArr2[length] = (asbg) aobv.a(asbg.a.getParserForType());
                    this.n = asbgArr2;
                    continue;
                case afy.av /*122*/:
                    asbk asbk = (asbk) aobv.a(asbk.a.getParserForType());
                    asbk asbk2 = this.o;
                    if (asbk2 != null) {
                        asbn asbn = (asbn) ((anxo) asbk2.toBuilder());
                        asbn.mergeFrom(asbk);
                        asbk = (asbk) ((anxl) asbn.build());
                    }
                    this.o = asbk;
                    continue;
                case 130:
                    this.d = aobv.e();
                    continue;
                case 146:
                    asbq asbq = (asbq) aobv.a(asbq.c.getParserForType());
                    asbq asbq2 = this.e;
                    if (asbq2 != null) {
                        asbt asbt = (asbt) ((anxo) asbq2.toBuilder());
                        asbt.mergeFrom(asbq);
                        asbq = (asbq) ((anxl) asbt.build());
                    }
                    this.e = asbq;
                    continue;
                case 152:
                    this.p = aobv.c();
                    continue;
                case 162:
                    if (this.f == null) {
                        this.f = new ajrs();
                    }
                    aobv.a(this.f);
                    continue;
                case 208:
                    this.q = aobv.c();
                    continue;
                case 226:
                    asbs asbs = (asbs) aobv.a(asbs.c.getParserForType());
                    asbs asbs2 = this.g;
                    if (asbs2 != null) {
                        asbv asbv = (asbv) ((anxo) asbs2.toBuilder());
                        asbv.mergeFrom(asbs);
                        asbs = (asbs) ((anxl) asbv.build());
                    }
                    this.g = asbs;
                    continue;
                case 234:
                    a = aock.a(aobv, 234);
                    apxuArr = this.h;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.h = apxuArr2;
                    continue;
                case 242:
                    a = aock.a(aobv, 242);
                    apxuArr = this.i;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.i = apxuArr2;
                    continue;
                case 248:
                    this.j = aobv.c();
                    continue;
                case 258:
                    aokf aokf = (aokf) aobv.a(aokf.a.getParserForType());
                    aokf aokf2 = this.r;
                    if (aokf2 != null) {
                        aoke aoke = (aoke) ((anxo) aokf2.toBuilder());
                        aoke.mergeFrom(aokf);
                        aokf = (aokf) ((anxl) aoke.build());
                    }
                    this.r = aokf;
                    continue;
                case 272:
                    this.s = aobv.f();
                    continue;
                case 280:
                    this.t = aobv.f();
                    continue;
                case 290:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.k;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.k = apxu;
                    continue;
                case 298:
                    if (this.u == null) {
                        this.u = new ajzw();
                    }
                    aobv.a(this.u);
                    continue;
                case 306:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.l;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.l = apxu;
                    continue;
                case 314:
                    if (this.v == null) {
                        this.v = new ajzw();
                    }
                    aobv.a(this.v);
                    continue;
                case 322:
                    aocf ajzw;
                    a = aock.a(aobv, 322);
                    ajzw[] ajzwArr = this.m;
                    length = ajzwArr != null ? ajzwArr.length : 0;
                    ajzw[] ajzwArr2 = new ajzw[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajzwArr, 0, ajzwArr2, 0, length);
                    }
                    while (length < ajzwArr2.length - 1) {
                        ajzw = new ajzw();
                        ajzwArr2[length] = ajzw;
                        aobv.a(ajzw);
                        aobv.a();
                        length++;
                    }
                    ajzw = new ajzw();
                    ajzwArr2[length] = ajzw;
                    aobv.a(ajzw);
                    this.m = ajzwArr2;
                    continue;
                case 6218:
                    arnm arnm = (arnm) aobv.a(arnm.a.getParserForType());
                    arnm arnm2 = this.frameworkUpdates;
                    if (arnm2 != null) {
                        arnl arnl = (arnl) ((anxo) arnm2.toBuilder());
                        arnl.mergeFrom(arnm);
                        arnm = (arnm) ((anxl) arnl.build());
                    }
                    this.frameworkUpdates = arnm;
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
