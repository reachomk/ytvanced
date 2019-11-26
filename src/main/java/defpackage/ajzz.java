package defpackage;

import java.util.Arrays;

/* renamed from: ajzz */
public final class ajzz extends aoca {
    public akac a = null;
    public ajtk b;
    public byte[] c;
    public atgw d;
    public atgn e;
    public atgp f;
    public arnm frameworkUpdates;
    public String[] g;
    private long h = 0;
    private String i;
    private String j;
    private boolean k;
    private aokf l;
    private boolean m;

    public ajzz() {
        String str = "";
        this.i = str;
        this.b = null;
        this.c = aock.c;
        this.j = str;
        this.k = false;
        this.m = false;
        this.g = aock.b;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzz) {
            ajzz ajzz = (ajzz) obj;
            if (this.h == ajzz.h) {
                akac akac = this.a;
                if (akac == null) {
                    if (ajzz.a != null) {
                        return false;
                    }
                } else if (!akac.equals(ajzz.a)) {
                    return false;
                }
                String str = this.i;
                if (str == null) {
                    if (ajzz.i != null) {
                        return false;
                    }
                } else if (!str.equals(ajzz.i)) {
                    return false;
                }
                ajtk ajtk = this.b;
                if (ajtk == null) {
                    if (ajzz.b != null) {
                        return false;
                    }
                } else if (!ajtk.equals(ajzz.b)) {
                    return false;
                }
                if (Arrays.equals(this.c, ajzz.c)) {
                    atgw atgw = this.d;
                    if (atgw == null) {
                        if (ajzz.d != null) {
                            return false;
                        }
                    } else if (!atgw.equals(ajzz.d)) {
                        return false;
                    }
                    atgn atgn = this.e;
                    if (atgn == null) {
                        if (ajzz.e != null) {
                            return false;
                        }
                    } else if (!atgn.equals(ajzz.e)) {
                        return false;
                    }
                    str = this.j;
                    if (str == null) {
                        if (ajzz.j != null) {
                            return false;
                        }
                    } else if (!str.equals(ajzz.j)) {
                        return false;
                    }
                    atgp atgp = this.f;
                    if (atgp == null) {
                        if (ajzz.f != null) {
                            return false;
                        }
                    } else if (!atgp.equals(ajzz.f)) {
                        return false;
                    }
                    if (this.k == ajzz.k) {
                        aokf aokf = this.l;
                        if (aokf == null) {
                            if (ajzz.l != null) {
                                return false;
                            }
                        } else if (!aokf.equals(ajzz.l)) {
                            return false;
                        }
                        if (this.m == ajzz.m && aocd.a(this.g, ajzz.g)) {
                            arnm arnm = this.frameworkUpdates;
                            if (arnm == null) {
                                if (ajzz.frameworkUpdates != null) {
                                    return false;
                                }
                            } else if (!arnm.equals(ajzz.frameworkUpdates)) {
                                return false;
                            }
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajzz.unknownFieldData);
                            }
                            aocb aocb2 = ajzz.unknownFieldData;
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
        long j = this.h;
        akac akac = this.a;
        hashCode = (((hashCode + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i = 0;
        hashCode = (hashCode + (akac != null ? akac.hashCode() : 0)) * 31;
        String str = this.i;
        int hashCode2 = str != null ? str.hashCode() : 0;
        ajtk ajtk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtk != null ? ajtk.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.c);
        atgw atgw = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = atgw != null ? atgw.hashCode() : 0;
        atgn atgn = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (atgn != null ? atgn.hashCode() : 0)) * 31;
        str = this.j;
        hashCode2 = str != null ? str.hashCode() : 0;
        atgp atgp = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (atgp != null ? atgp.hashCode() : 0)) * 31;
        hashCode3 = 1237;
        hashCode2 = !this.k ? 1237 : 1231;
        aokf aokf = this.l;
        hashCode = (((hashCode + hashCode2) * 31) + (aokf != null ? aokf.hashCode() : 0)) * 31;
        if (this.m) {
            hashCode3 = 1231;
        }
        hashCode2 = aocd.a(this.g);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((hashCode + hashCode3) * 31) + hashCode2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        long j = this.h;
        if (j != 0) {
            aoby.b(2, j);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        String str = this.i;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.i);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(9, this.c);
        }
        anze anze = this.d;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(13, anze);
        }
        str = this.j;
        if (!(str == null || str.equals(str2))) {
            aoby.a(17, this.j);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(18, anze);
        }
        if (this.k) {
            aoby.a(19, true);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(20, anze);
        }
        if (this.m) {
            aoby.a(21, true);
        }
        String[] strArr = this.g;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.g;
                if (i >= strArr2.length) {
                    break;
                }
                str2 = strArr2[i];
                if (str2 != null) {
                    aoby.a(22, str2);
                }
                i++;
            }
        }
        anze = this.frameworkUpdates;
        if (anze != null) {
            aoby.a(777, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.h;
        if (j != 0) {
            computeSerializedSize += aoby.d(2, j);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        String str = this.i;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(5, this.i);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(9, this.c);
        }
        anze anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        str = this.j;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(17, this.j);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        if (this.k) {
            computeSerializedSize += aoby.d(19);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(20, anze);
        }
        if (this.m) {
            computeSerializedSize += aoby.d(21);
        }
        String[] strArr = this.g;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.g;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    i3++;
                    i2 += aoby.b(str3);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i2) + (i3 + i3);
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.h = aobv.g();
                    continue;
                case 34:
                    if (this.a == null) {
                        this.a = new akac();
                    }
                    aobv.a(this.a);
                    continue;
                case 42:
                    this.i = aobv.d();
                    continue;
                case 58:
                    if (this.b == null) {
                        this.b = new ajtk();
                    }
                    aobv.a(this.b);
                    continue;
                case 74:
                    this.c = aobv.e();
                    continue;
                case 82:
                    atgw atgw = (atgw) aobv.a(atgw.c.getParserForType());
                    atgw atgw2 = this.d;
                    if (atgw2 != null) {
                        atgv atgv = (atgv) ((anxo) atgw2.toBuilder());
                        atgv.mergeFrom(atgw);
                        atgw = (atgw) ((anxl) atgv.build());
                    }
                    this.d = atgw;
                    continue;
                case 106:
                    atgn atgn = (atgn) aobv.a(atgn.c.getParserForType());
                    atgn atgn2 = this.e;
                    if (atgn2 != null) {
                        atgq atgq = (atgq) ((anxo) atgn2.toBuilder());
                        atgq.mergeFrom(atgn);
                        atgn = (atgn) ((anxl) atgq.build());
                    }
                    this.e = atgn;
                    continue;
                case 138:
                    this.j = aobv.d();
                    continue;
                case 146:
                    atgp atgp = (atgp) aobv.a(atgp.c.getParserForType());
                    atgp atgp2 = this.f;
                    if (atgp2 != null) {
                        atgs atgs = (atgs) ((anxo) atgp2.toBuilder());
                        atgs.mergeFrom(atgp);
                        atgp = (atgp) ((anxl) atgs.build());
                    }
                    this.f = atgp;
                    continue;
                case 152:
                    this.k = aobv.c();
                    continue;
                case 162:
                    aokf aokf = (aokf) aobv.a(aokf.a.getParserForType());
                    aokf aokf2 = this.l;
                    if (aokf2 != null) {
                        aoke aoke = (aoke) ((anxo) aokf2.toBuilder());
                        aoke.mergeFrom(aokf);
                        aokf = (aokf) ((anxl) aoke.build());
                    }
                    this.l = aokf;
                    continue;
                case 168:
                    this.m = aobv.c();
                    continue;
                case 178:
                    a = aock.a(aobv, 178);
                    String[] strArr = this.g;
                    int length = strArr != null ? strArr.length : 0;
                    String[] strArr2 = new String[(a + length)];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = aobv.d();
                        aobv.a();
                        length++;
                    }
                    strArr2[length] = aobv.d();
                    this.g = strArr2;
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
