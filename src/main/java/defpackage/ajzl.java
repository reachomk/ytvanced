package defpackage;

import java.util.Arrays;

/* renamed from: ajzl */
public final class ajzl extends ajwo {
    public String a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public apxu f;
    public awvv[] g;
    public ajzw h;
    public ajzw i;
    public int j;
    private arml k;
    private ajzw l;
    private byte[] m;

    public ajzl() {
        super(154471660);
        this.a = "";
        this.g = new awvv[0];
        this.h = null;
        this.i = null;
        this.j = 1;
        this.l = null;
        this.m = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzl) {
            ajzl ajzl = (ajzl) obj;
            String str = this.a;
            if (str == null) {
                if (ajzl.a != null) {
                    return false;
                }
            } else if (!str.equals(ajzl.a)) {
                return false;
            }
            aygk aygk = this.b;
            if (aygk == null) {
                if (ajzl.b != null) {
                    return false;
                }
            } else if (!aygk.equals(ajzl.b)) {
                return false;
            }
            arml arml = this.c;
            if (arml == null) {
                if (ajzl.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajzl.c)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajzl.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajzl.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajzl.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajzl.e)) {
                return false;
            }
            arml = this.k;
            if (arml == null) {
                if (ajzl.k != null) {
                    return false;
                }
            } else if (!arml.equals(ajzl.k)) {
                return false;
            }
            apxu apxu = this.f;
            if (apxu == null) {
                if (ajzl.f != null) {
                    return false;
                }
            } else if (!apxu.equals(ajzl.f)) {
                return false;
            }
            if (aocd.a(this.g, ajzl.g)) {
                ajzw ajzw = this.h;
                if (ajzw == null) {
                    if (ajzl.h != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzl.h)) {
                    return false;
                }
                ajzw = this.i;
                if (ajzw == null) {
                    if (ajzl.i != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzl.i)) {
                    return false;
                }
                if (this.j == ajzl.j) {
                    ajzw = this.l;
                    if (ajzw == null) {
                        if (ajzl.l != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajzl.l)) {
                        return false;
                    }
                    if (Arrays.equals(this.m, ajzl.m)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajzl.unknownFieldData);
                        }
                        aocb aocb2 = ajzl.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        aygk aygk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.g);
        ajzw ajzw = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw ajzw2 = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31;
        hashCode2 = this.j;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        ajzw2 = this.l;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31) + Arrays.hashCode(this.m)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            aoby.a(1, this.a);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
        }
        awvv[] awvvArr = this.g;
        if (awvvArr != null && awvvArr.length > 0) {
            i = 0;
            while (true) {
                awvv[] awvvArr2 = this.g;
                if (i >= awvvArr2.length) {
                    break;
                }
                anze anze2 = awvvArr2[i];
                if (anze2 != null) {
                    aoby.a(8, anze2);
                }
                i++;
            }
        }
        aocf aocf = this.h;
        if (aocf != null) {
            aoby.a(9, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            aoby.a(10, aocf);
        }
        i = this.j;
        if (!(i == 1 || i == 0)) {
            aoby.a(11, i - 1);
        }
        aocf = this.l;
        if (aocf != null) {
            aoby.a(12, aocf);
        }
        if (!Arrays.equals(this.m, aock.c)) {
            aoby.a(14, this.m);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(1, this.a);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        awvv[] awvvArr = this.g;
        if (awvvArr != null && awvvArr.length > 0) {
            i = 0;
            while (true) {
                awvv[] awvvArr2 = this.g;
                if (i >= awvvArr2.length) {
                    break;
                }
                anze anze2 = awvvArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(8, anze2);
                }
                i++;
            }
        }
        aocf aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(9, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            computeSerializedSize += aoby.b(10, aocf);
        }
        i = this.j;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(11, i - 1);
        }
        aocf = this.l;
        if (aocf != null) {
            computeSerializedSize += aoby.b(12, aocf);
        }
        return !Arrays.equals(this.m, aock.c) ? computeSerializedSize + aoby.b(14, this.m) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            arml arml;
            arml arml2;
            armk armk;
            int length;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = aobv.d();
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
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.c;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.c = arml;
                    continue;
                case 34:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case cv.aU /*50*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.k;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.k = arml;
                    continue;
                case 58:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.f;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.f = apxu;
                    continue;
                case 66:
                    a = aock.a(aobv, 66);
                    awvv[] awvvArr = this.g;
                    length = awvvArr != null ? awvvArr.length : 0;
                    awvv[] awvvArr2 = new awvv[(a + length)];
                    if (length != 0) {
                        System.arraycopy(awvvArr, 0, awvvArr2, 0, length);
                    }
                    while (length < awvvArr2.length - 1) {
                        awvvArr2[length] = (awvv) aobv.a(awvv.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    awvvArr2[length] = (awvv) aobv.a(awvv.c.getParserForType());
                    this.g = awvvArr2;
                    continue;
                case 74:
                    if (this.h == null) {
                        this.h = new ajzw();
                    }
                    aobv.a(this.h);
                    continue;
                case 82:
                    if (this.i == null) {
                        this.i = new ajzw();
                    }
                    aobv.a(this.i);
                    continue;
                case 88:
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length == 0 || length == 1) {
                        if (length == 0) {
                            i = 1;
                        } else if (length == 1) {
                            i = 2;
                        }
                        this.j = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new ajzw();
                    }
                    aobv.a(this.l);
                    continue;
                case 114:
                    this.m = aobv.e();
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
