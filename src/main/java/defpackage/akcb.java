package defpackage;

import java.util.Arrays;

/* renamed from: akcb */
public final class akcb extends aoca {
    public akce a = null;
    public ajtk b = null;
    public apxu c;
    public byte[] d = aock.c;
    public ajxr e = null;
    public ajtb f = null;
    public arnm frameworkUpdates;
    public atoq g;
    public atpc h;
    public atoy i;
    public apxu[] j = new apxu[0];
    public atow k;
    public ajun[] l;
    public apxu m;
    public atok n;
    public aygk o;
    public ajun[] p;
    public apxu q;
    private String r;
    private String s;
    private ajzw t;
    private ajzw u;
    private ajzw v;

    public akcb() {
        String str = "";
        this.r = str;
        this.s = str;
        this.l = ajun.a();
        this.p = ajun.a();
        this.t = null;
        this.u = null;
        this.v = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcb) {
            akcb akcb = (akcb) obj;
            akce akce = this.a;
            if (akce == null) {
                if (akcb.a != null) {
                    return false;
                }
            } else if (!akce.equals(akcb.a)) {
                return false;
            }
            ajtk ajtk = this.b;
            if (ajtk == null) {
                if (akcb.b != null) {
                    return false;
                }
            } else if (!ajtk.equals(akcb.b)) {
                return false;
            }
            apxu apxu = this.c;
            if (apxu == null) {
                if (akcb.c != null) {
                    return false;
                }
            } else if (!apxu.equals(akcb.c)) {
                return false;
            }
            if (Arrays.equals(this.d, akcb.d)) {
                ajxr ajxr = this.e;
                if (ajxr == null) {
                    if (akcb.e != null) {
                        return false;
                    }
                } else if (!ajxr.equals(akcb.e)) {
                    return false;
                }
                ajtb ajtb = this.f;
                if (ajtb == null) {
                    if (akcb.f != null) {
                        return false;
                    }
                } else if (!ajtb.equals(akcb.f)) {
                    return false;
                }
                atoq atoq = this.g;
                if (atoq == null) {
                    if (akcb.g != null) {
                        return false;
                    }
                } else if (!atoq.equals(akcb.g)) {
                    return false;
                }
                atpc atpc = this.h;
                if (atpc == null) {
                    if (akcb.h != null) {
                        return false;
                    }
                } else if (!atpc.equals(akcb.h)) {
                    return false;
                }
                atoy atoy = this.i;
                if (atoy == null) {
                    if (akcb.i != null) {
                        return false;
                    }
                } else if (!atoy.equals(akcb.i)) {
                    return false;
                }
                if (aocd.a(this.j, akcb.j)) {
                    String str = this.r;
                    if (str == null) {
                        if (akcb.r != null) {
                            return false;
                        }
                    } else if (!str.equals(akcb.r)) {
                        return false;
                    }
                    str = this.s;
                    if (str == null) {
                        if (akcb.s != null) {
                            return false;
                        }
                    } else if (!str.equals(akcb.s)) {
                        return false;
                    }
                    atow atow = this.k;
                    if (atow == null) {
                        if (akcb.k != null) {
                            return false;
                        }
                    } else if (!atow.equals(akcb.k)) {
                        return false;
                    }
                    if (aocd.a(this.l, akcb.l)) {
                        apxu = this.m;
                        if (apxu == null) {
                            if (akcb.m != null) {
                                return false;
                            }
                        } else if (!apxu.equals(akcb.m)) {
                            return false;
                        }
                        atok atok = this.n;
                        if (atok == null) {
                            if (akcb.n != null) {
                                return false;
                            }
                        } else if (!atok.equals(akcb.n)) {
                            return false;
                        }
                        aygk aygk = this.o;
                        if (aygk == null) {
                            if (akcb.o != null) {
                                return false;
                            }
                        } else if (!aygk.equals(akcb.o)) {
                            return false;
                        }
                        if (aocd.a(this.p, akcb.p)) {
                            apxu = this.q;
                            if (apxu == null) {
                                if (akcb.q != null) {
                                    return false;
                                }
                            } else if (!apxu.equals(akcb.q)) {
                                return false;
                            }
                            ajzw ajzw = this.t;
                            if (ajzw == null) {
                                if (akcb.t != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(akcb.t)) {
                                return false;
                            }
                            ajzw = this.u;
                            if (ajzw == null) {
                                if (akcb.u != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(akcb.u)) {
                                return false;
                            }
                            ajzw = this.v;
                            if (ajzw == null) {
                                if (akcb.v != null) {
                                    return false;
                                }
                            } else if (!ajzw.equals(akcb.v)) {
                                return false;
                            }
                            arnm arnm = this.frameworkUpdates;
                            if (arnm == null) {
                                if (akcb.frameworkUpdates != null) {
                                    return false;
                                }
                            } else if (!arnm.equals(akcb.frameworkUpdates)) {
                                return false;
                            }
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(akcb.unknownFieldData);
                            }
                            aocb aocb2 = akcb.unknownFieldData;
                            return aocb2 == null || aocb2.b();
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akce akce = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akce != null ? akce.hashCode() : 0;
        ajtk ajtk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtk != null ? ajtk.hashCode() : 0;
        apxu apxu = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.d);
        ajxr ajxr = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = ajxr != null ? ajxr.hashCode() : 0;
        ajtb ajtb = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtb != null ? ajtb.hashCode() : 0;
        atoq atoq = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atoq != null ? atoq.hashCode() : 0;
        atpc atpc = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atpc != null ? atpc.hashCode() : 0;
        atoy atoy = this.i;
        hashCode = (((((hashCode + hashCode2) * 31) + (atoy != null ? atoy.hashCode() : 0)) * 31) + aocd.a(this.j)) * 31;
        String str = this.r;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.s;
        hashCode2 = str != null ? str.hashCode() : 0;
        atow atow = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atow != null ? atow.hashCode() : 0;
        hashCode3 = aocd.a(this.l);
        apxu apxu2 = this.m;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        atok atok = this.n;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atok != null ? atok.hashCode() : 0;
        aygk aygk = this.o;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        hashCode3 = aocd.a(this.p);
        apxu2 = this.q;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        ajzw ajzw = this.t;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.u;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.v;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        arnm arnm = this.frameworkUpdates;
        hashCode = (((hashCode + hashCode2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(9, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(13, this.d);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(14, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            aoby.a(15, aocf);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(16, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(20, anze);
        }
        apxu[] apxuArr = this.j;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.j;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(21, anze2);
                }
                i++;
            }
        }
        String str = this.r;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(22, this.r);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            aoby.a(23, this.s);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(24, anze);
        }
        ajun[] ajunArr = this.l;
        if (ajunArr != null && ajunArr.length > 0) {
            i = 0;
            while (true) {
                ajun[] ajunArr2 = this.l;
                if (i >= ajunArr2.length) {
                    break;
                }
                aocf aocf2 = ajunArr2[i];
                if (aocf2 != null) {
                    aoby.a(25, aocf2);
                }
                i++;
            }
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(26, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(28, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(29, anze);
        }
        ajunArr = this.p;
        if (ajunArr != null && ajunArr.length > 0) {
            while (true) {
                ajunArr = this.p;
                if (i2 >= ajunArr.length) {
                    break;
                }
                aocf = ajunArr[i2];
                if (aocf != null) {
                    aoby.a(30, aocf);
                }
                i2++;
            }
        }
        anze = this.q;
        if (anze != null) {
            aoby.a(32, anze);
        }
        aocf = this.t;
        if (aocf != null) {
            aoby.a(33, aocf);
        }
        aocf = this.u;
        if (aocf != null) {
            aoby.a(34, aocf);
        }
        aocf = this.v;
        if (aocf != null) {
            aoby.a(35, aocf);
        }
        anze = this.frameworkUpdates;
        if (anze != null) {
            aoby.a(777, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(13, this.d);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(14, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(15, aocf);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        apxu[] apxuArr = this.j;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.j;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(21, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String str = this.r;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(22, this.r);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(23, this.s);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(24, anze);
        }
        ajun[] ajunArr = this.l;
        if (ajunArr != null && ajunArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajun[] ajunArr2 = this.l;
                if (computeSerializedSize >= ajunArr2.length) {
                    break;
                }
                aocf aocf2 = ajunArr2[computeSerializedSize];
                if (aocf2 != null) {
                    i += aoby.b(25, aocf2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(26, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(28, anze);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(29, anze);
        }
        ajunArr = this.p;
        if (ajunArr != null && ajunArr.length > 0) {
            while (true) {
                ajunArr = this.p;
                if (i2 >= ajunArr.length) {
                    break;
                }
                aocf = ajunArr[i2];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(30, aocf);
                }
                i2++;
            }
        }
        anze = this.q;
        if (anze != null) {
            computeSerializedSize += anwm.c(32, anze);
        }
        aocf = this.t;
        if (aocf != null) {
            computeSerializedSize += aoby.b(33, aocf);
        }
        aocf = this.u;
        if (aocf != null) {
            computeSerializedSize += aoby.b(34, aocf);
        }
        aocf = this.v;
        if (aocf != null) {
            computeSerializedSize += aoby.b(35, aocf);
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            int length;
            ajun[] ajunArr;
            ajun[] ajunArr2;
            aocf ajun;
            switch (a) {
                case 0:
                    break;
                case 58:
                    if (this.a == null) {
                        this.a = new akce();
                    }
                    aobv.a(this.a);
                    continue;
                case 66:
                    if (this.b == null) {
                        this.b = new ajtk();
                    }
                    aobv.a(this.b);
                    continue;
                case 74:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.c;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.c = apxu;
                    continue;
                case 106:
                    this.d = aobv.e();
                    continue;
                case 114:
                    if (this.e == null) {
                        this.e = new ajxr();
                    }
                    aobv.a(this.e);
                    continue;
                case afy.av /*122*/:
                    if (this.f == null) {
                        this.f = new ajtb();
                    }
                    aobv.a(this.f);
                    continue;
                case 130:
                    atoq atoq = (atoq) aobv.a(atoq.c.getParserForType());
                    atoq atoq2 = this.g;
                    if (atoq2 != null) {
                        atop atop = (atop) ((anxo) atoq2.toBuilder());
                        atop.mergeFrom(atoq);
                        atoq = (atoq) ((anxl) atop.build());
                    }
                    this.g = atoq;
                    continue;
                case 138:
                    atpc atpc = (atpc) aobv.a(atpc.c.getParserForType());
                    atpc atpc2 = this.h;
                    if (atpc2 != null) {
                        atpb atpb = (atpb) ((anxo) atpc2.toBuilder());
                        atpb.mergeFrom(atpc);
                        atpc = (atpc) ((anxl) atpb.build());
                    }
                    this.h = atpc;
                    continue;
                case 162:
                    atoy atoy = (atoy) aobv.a(atoy.c.getParserForType());
                    atoy atoy2 = this.i;
                    if (atoy2 != null) {
                        atox atox = (atox) ((anxo) atoy2.toBuilder());
                        atox.mergeFrom(atoy);
                        atoy = (atoy) ((anxl) atox.build());
                    }
                    this.i = atoy;
                    continue;
                case 170:
                    a = aock.a(aobv, 170);
                    apxu[] apxuArr = this.j;
                    length = apxuArr != null ? apxuArr.length : 0;
                    apxu[] apxuArr2 = new apxu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                    }
                    while (length < apxuArr2.length - 1) {
                        apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.j = apxuArr2;
                    continue;
                case 178:
                    this.r = aobv.d();
                    continue;
                case 186:
                    this.s = aobv.d();
                    continue;
                case 194:
                    atow atow = (atow) aobv.a(atow.c.getParserForType());
                    atow atow2 = this.k;
                    if (atow2 != null) {
                        atov atov = (atov) ((anxo) atow2.toBuilder());
                        atov.mergeFrom(atow);
                        atow = (atow) ((anxl) atov.build());
                    }
                    this.k = atow;
                    continue;
                case 202:
                    a = aock.a(aobv, 202);
                    ajunArr = this.l;
                    length = ajunArr != null ? ajunArr.length : 0;
                    ajunArr2 = new ajun[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajunArr, 0, ajunArr2, 0, length);
                    }
                    while (length < ajunArr2.length - 1) {
                        ajun = new ajun();
                        ajunArr2[length] = ajun;
                        aobv.a(ajun);
                        aobv.a();
                        length++;
                    }
                    ajun = new ajun();
                    ajunArr2[length] = ajun;
                    aobv.a(ajun);
                    this.l = ajunArr2;
                    continue;
                case 210:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.m;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.m = apxu;
                    continue;
                case 226:
                    atok atok = (atok) aobv.a(atok.c.getParserForType());
                    atok atok2 = this.n;
                    if (atok2 != null) {
                        atoj atoj = (atoj) ((anxo) atok2.toBuilder());
                        atoj.mergeFrom(atok);
                        atok = (atok) ((anxl) atoj.build());
                    }
                    this.n = atok;
                    continue;
                case 234:
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.o;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.o = aygk;
                    continue;
                case 242:
                    a = aock.a(aobv, 242);
                    ajunArr = this.p;
                    length = ajunArr != null ? ajunArr.length : 0;
                    ajunArr2 = new ajun[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajunArr, 0, ajunArr2, 0, length);
                    }
                    while (length < ajunArr2.length - 1) {
                        ajun = new ajun();
                        ajunArr2[length] = ajun;
                        aobv.a(ajun);
                        aobv.a();
                        length++;
                    }
                    ajun = new ajun();
                    ajunArr2[length] = ajun;
                    aobv.a(ajun);
                    this.p = ajunArr2;
                    continue;
                case 258:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.q;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.q = apxu;
                    continue;
                case 266:
                    if (this.t == null) {
                        this.t = new ajzw();
                    }
                    aobv.a(this.t);
                    continue;
                case 274:
                    if (this.u == null) {
                        this.u = new ajzw();
                    }
                    aobv.a(this.u);
                    continue;
                case 282:
                    if (this.v == null) {
                        this.v = new ajzw();
                    }
                    aobv.a(this.v);
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
