package defpackage;

import java.util.Arrays;

/* renamed from: ajte */
public final class ajte extends ajwo {
    public aphj a;
    public ajtg b;
    public aqjq[] c;
    public int d;
    public arml e;
    public arml f;
    public long g;
    public boolean h;
    public aykk i;
    public aykw j;
    private aqjs[] k;
    private byte[] l;

    public ajte() {
        super(87264807);
        this.k = new aqjs[0];
        this.l = aock.c;
        this.b = null;
        this.c = new aqjq[0];
        this.d = 0;
        this.g = 0;
        this.h = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajte) {
            ajte ajte = (ajte) obj;
            if (aocd.a(this.k, ajte.k) && Arrays.equals(this.l, ajte.l)) {
                aphj aphj = this.a;
                if (aphj == null) {
                    if (ajte.a != null) {
                        return false;
                    }
                } else if (!aphj.equals(ajte.a)) {
                    return false;
                }
                ajtg ajtg = this.b;
                if (ajtg == null) {
                    if (ajte.b != null) {
                        return false;
                    }
                } else if (!ajtg.equals(ajte.b)) {
                    return false;
                }
                if (aocd.a(this.c, ajte.c) && this.d == ajte.d) {
                    arml arml = this.e;
                    if (arml == null) {
                        if (ajte.e != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajte.e)) {
                        return false;
                    }
                    arml = this.f;
                    if (arml == null) {
                        if (ajte.f != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajte.f)) {
                        return false;
                    }
                    if (this.g == ajte.g && this.h == ajte.h) {
                        aykk aykk = this.i;
                        if (aykk == null) {
                            if (ajte.i != null) {
                                return false;
                            }
                        } else if (!aykk.equals(ajte.i)) {
                            return false;
                        }
                        aykw aykw = this.j;
                        if (aykw == null) {
                            if (ajte.j != null) {
                                return false;
                            }
                        } else if (!aykw.equals(ajte.j)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajte.unknownFieldData);
                        }
                        aocb aocb2 = ajte.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.k);
        int hashCode2 = Arrays.hashCode(this.l);
        aphj aphj = this.a;
        hashCode = (((((hashCode + 527) * 31) + a) * 31) + hashCode2) * 31;
        a = 0;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        ajtg ajtg = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtg != null ? ajtg.hashCode() : 0;
        int a2 = aocd.a(this.c);
        int i = this.d;
        arml arml = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + a2) * 31) + i) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        long j = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        hashCode2 = !this.h ? 1237 : 1231;
        aykk aykk = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aykk != null ? aykk.hashCode() : 0;
        aykw aykw = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (aykw != null ? aykw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        aqjs[] aqjsArr = this.k;
        int i2 = 0;
        if (aqjsArr != null && aqjsArr.length > 0) {
            i = 0;
            while (true) {
                aqjs[] aqjsArr2 = this.k;
                if (i >= aqjsArr2.length) {
                    break;
                }
                anze anze = aqjsArr2[i];
                if (anze != null) {
                    aoby.a(1, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.l, aock.c)) {
            aoby.a(4, this.l);
        }
        anze anze2 = this.a;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        aqjq[] aqjqArr = this.c;
        if (aqjqArr != null && aqjqArr.length > 0) {
            while (true) {
                aqjqArr = this.c;
                if (i2 >= aqjqArr.length) {
                    break;
                }
                anze2 = aqjqArr[i2];
                if (anze2 != null) {
                    aoby.a(7, anze2);
                }
                i2++;
            }
        }
        i = this.d;
        if (i != 0) {
            aoby.a(8, i);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(10, anze2);
        }
        long j = this.g;
        if (j != 0) {
            aoby.b(11, j);
        }
        if (this.h) {
            aoby.a(12, true);
        }
        anze2 = this.i;
        if (anze2 != null) {
            aoby.a(13, anze2);
        }
        anze2 = this.j;
        if (anze2 != null) {
            aoby.a(14, anze2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        aqjs[] aqjsArr = this.k;
        int i2 = 0;
        if (aqjsArr != null && aqjsArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aqjs[] aqjsArr2 = this.k;
                if (computeSerializedSize >= aqjsArr2.length) {
                    break;
                }
                anze anze = aqjsArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(1, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (!Arrays.equals(this.l, aock.c)) {
            computeSerializedSize += aoby.b(4, this.l);
        }
        anze anze2 = this.a;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        aqjq[] aqjqArr = this.c;
        if (aqjqArr != null && aqjqArr.length > 0) {
            while (true) {
                aqjqArr = this.c;
                if (i2 >= aqjqArr.length) {
                    break;
                }
                anze2 = aqjqArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(7, anze2);
                }
                i2++;
            }
        }
        i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.c(8, i);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(10, anze2);
        }
        long j = this.g;
        if (j != 0) {
            computeSerializedSize += aoby.d(11, j);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(12);
        }
        anze2 = this.i;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(13, anze2);
        }
        anze2 = this.j;
        return anze2 != null ? computeSerializedSize + anwm.c(14, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            arml arml;
            arml arml2;
            armk armk;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = aock.a(aobv, 10);
                    aqjs[] aqjsArr = this.k;
                    length = aqjsArr != null ? aqjsArr.length : 0;
                    aqjs[] aqjsArr2 = new aqjs[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aqjsArr, 0, aqjsArr2, 0, length);
                    }
                    while (length < aqjsArr2.length - 1) {
                        aqjsArr2[length] = (aqjs) aobv.a(aqjs.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aqjsArr2[length] = (aqjs) aobv.a(aqjs.d.getParserForType());
                    this.k = aqjsArr2;
                    continue;
                case 34:
                    this.l = aobv.e();
                    continue;
                case 42:
                    aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj aphj2 = this.a;
                    if (aphj2 != null) {
                        aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.a = aphj;
                    continue;
                case cv.aU /*50*/:
                    if (this.b == null) {
                        this.b = new ajtg();
                    }
                    aobv.a(this.b);
                    continue;
                case 58:
                    a = aock.a(aobv, 58);
                    aqjq[] aqjqArr = this.c;
                    length = aqjqArr != null ? aqjqArr.length : 0;
                    aqjq[] aqjqArr2 = new aqjq[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aqjqArr, 0, aqjqArr2, 0, length);
                    }
                    while (length < aqjqArr2.length - 1) {
                        aqjqArr2[length] = (aqjq) aobv.a(aqjq.d.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aqjqArr2[length] = (aqjq) aobv.a(aqjq.d.getParserForType());
                    this.c = aqjqArr2;
                    continue;
                case 64:
                    this.d = aobv.f();
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case 82:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 88:
                    this.g = aobv.g();
                    continue;
                case 96:
                    this.h = aobv.c();
                    continue;
                case 106:
                    aykk aykk = (aykk) aobv.a(aykk.c.getParserForType());
                    aykk aykk2 = this.i;
                    if (aykk2 != null) {
                        aykn aykn = (aykn) ((anxo) aykk2.toBuilder());
                        aykn.mergeFrom(aykk);
                        aykk = (aykk) ((anxl) aykn.build());
                    }
                    this.i = aykk;
                    continue;
                case 114:
                    aykw aykw = (aykw) aobv.a(aykw.d.getParserForType());
                    aykw aykw2 = this.j;
                    if (aykw2 != null) {
                        aykz aykz = (aykz) ((anxo) aykw2.toBuilder());
                        aykz.mergeFrom(aykw);
                        aykw = (aykw) ((anxl) aykz.build());
                    }
                    this.j = aykw;
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
