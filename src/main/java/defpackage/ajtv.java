package defpackage;

/* renamed from: ajtv */
public final class ajtv extends ajwo {
    public arml a;
    public String b;
    public boolean c;
    public arml d;
    public String e;
    public boolean f;
    public aplb g;
    public int h;
    public int i;
    public int j;
    public ajug k;
    public arml[] l;
    public arml m;
    public arml n;
    public arml o;
    public arml p;
    private boolean q = false;
    private boolean r;
    private aygk s;

    public ajtv() {
        super(86209186);
        String str = "";
        this.b = str;
        this.c = false;
        this.r = false;
        this.e = str;
        this.f = false;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = null;
        this.l = new arml[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtv) {
            ajtv ajtv = (ajtv) obj;
            if (this.q == ajtv.q) {
                arml arml = this.a;
                if (arml == null) {
                    if (ajtv.a != null) {
                        return false;
                    }
                } else if (!arml.equals(ajtv.a)) {
                    return false;
                }
                String str = this.b;
                if (str == null) {
                    if (ajtv.b != null) {
                        return false;
                    }
                } else if (!str.equals(ajtv.b)) {
                    return false;
                }
                if (this.c == ajtv.c && this.r == ajtv.r) {
                    arml = this.d;
                    if (arml == null) {
                        if (ajtv.d != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajtv.d)) {
                        return false;
                    }
                    str = this.e;
                    if (str == null) {
                        if (ajtv.e != null) {
                            return false;
                        }
                    } else if (!str.equals(ajtv.e)) {
                        return false;
                    }
                    if (this.f == ajtv.f) {
                        aygk aygk = this.s;
                        if (aygk == null) {
                            if (ajtv.s != null) {
                                return false;
                            }
                        } else if (!aygk.equals(ajtv.s)) {
                            return false;
                        }
                        aplb aplb = this.g;
                        if (aplb == null) {
                            if (ajtv.g != null) {
                                return false;
                            }
                        } else if (!aplb.equals(ajtv.g)) {
                            return false;
                        }
                        if (this.h == ajtv.h && this.i == ajtv.i && this.j == ajtv.j) {
                            ajug ajug = this.k;
                            if (ajug == null) {
                                if (ajtv.k != null) {
                                    return false;
                                }
                            } else if (!ajug.equals(ajtv.k)) {
                                return false;
                            }
                            if (aocd.a(this.l, ajtv.l)) {
                                arml = this.m;
                                if (arml == null) {
                                    if (ajtv.m != null) {
                                        return false;
                                    }
                                } else if (!arml.equals(ajtv.m)) {
                                    return false;
                                }
                                arml = this.n;
                                if (arml == null) {
                                    if (ajtv.n != null) {
                                        return false;
                                    }
                                } else if (!arml.equals(ajtv.n)) {
                                    return false;
                                }
                                arml = this.o;
                                if (arml == null) {
                                    if (ajtv.o != null) {
                                        return false;
                                    }
                                } else if (!arml.equals(ajtv.o)) {
                                    return false;
                                }
                                arml = this.p;
                                if (arml == null) {
                                    if (ajtv.p != null) {
                                        return false;
                                    }
                                } else if (!arml.equals(ajtv.p)) {
                                    return false;
                                }
                                aocb aocb = this.unknownFieldData;
                                if (aocb != null && !aocb.b()) {
                                    return this.unknownFieldData.equals(ajtv.unknownFieldData);
                                }
                                aocb aocb2 = ajtv.unknownFieldData;
                                return aocb2 == null || aocb2.b();
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
        int i2 = !this.q ? 1237 : 1231;
        arml arml = this.a;
        hashCode = (hashCode + i2) * 31;
        i2 = 0;
        hashCode = (hashCode + (arml != null ? arml.hashCode() : 0)) * 31;
        String str = this.b;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.c ? 1237 : 1231)) * 31;
        int i3 = !this.r ? 1237 : 1231;
        arml arml2 = this.d;
        hashCode = (((hashCode + i3) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        if (this.f) {
            i = 1231;
        }
        aygk aygk = this.s;
        hashCode = (hashCode + i) * 31;
        i = aygk != null ? aygk.hashCode() : 0;
        aplb aplb = this.g;
        hashCode = (hashCode + i) * 31;
        i = aplb != null ? aplb.hashCode() : 0;
        int i4 = this.h;
        i3 = this.i;
        int i5 = this.j;
        ajug ajug = this.k;
        hashCode = (((((((hashCode + i) * 31) + i4) * 31) + i3) * 31) + i5) * 31;
        i = ajug != null ? ajug.hashCode() : 0;
        i4 = aocd.a(this.l);
        arml = this.m;
        hashCode = (((hashCode + i) * 31) + i4) * 31;
        i = arml != null ? arml.hashCode() : 0;
        arml arml3 = this.n;
        hashCode = (hashCode + i) * 31;
        i = arml3 != null ? arml3.hashCode() : 0;
        arml3 = this.o;
        hashCode = (hashCode + i) * 31;
        i = arml3 != null ? arml3.hashCode() : 0;
        arml3 = this.p;
        hashCode = (((hashCode + i) * 31) + (arml3 != null ? arml3.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        if (this.q) {
            aoby.a(1, true);
        }
        anze anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(3, this.b);
        }
        if (this.c) {
            aoby.a(4, true);
        }
        if (this.r) {
            aoby.a(5, true);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(6, anze);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            aoby.a(7, this.e);
        }
        if (this.f) {
            aoby.a(8, true);
        }
        anze = this.s;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(10, anze);
        }
        int i = this.h;
        if (i != 0) {
            aoby.a(11, i);
        }
        i = this.i;
        if (i != 0) {
            aoby.a(12, i);
        }
        i = this.j;
        if (i != 0) {
            aoby.a(13, i);
        }
        aocf aocf = this.k;
        if (aocf != null) {
            aoby.a(14, aocf);
        }
        arml[] armlArr = this.l;
        if (armlArr != null && armlArr.length > 0) {
            i = 0;
            while (true) {
                arml[] armlArr2 = this.l;
                if (i >= armlArr2.length) {
                    break;
                }
                anze anze2 = armlArr2[i];
                if (anze2 != null) {
                    aoby.a(15, anze2);
                }
                i++;
            }
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(16, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(17, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(18, anze);
        }
        anze = this.p;
        if (anze != null) {
            aoby.a(19, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.q) {
            computeSerializedSize += aoby.d(1);
        }
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(3, this.b);
        }
        if (this.c) {
            computeSerializedSize += aoby.d(4);
        }
        if (this.r) {
            computeSerializedSize += aoby.d(5);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(7, this.e);
        }
        if (this.f) {
            computeSerializedSize += aoby.d(8);
        }
        anze = this.s;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        int i = this.h;
        if (i != 0) {
            computeSerializedSize += aoby.c(11, i);
        }
        i = this.i;
        if (i != 0) {
            computeSerializedSize += aoby.c(12, i);
        }
        i = this.j;
        if (i != 0) {
            computeSerializedSize += aoby.c(13, i);
        }
        aocf aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(14, aocf);
        }
        arml[] armlArr = this.l;
        if (armlArr != null && armlArr.length > 0) {
            i = 0;
            while (true) {
                arml[] armlArr2 = this.l;
                if (i >= armlArr2.length) {
                    break;
                }
                anze anze2 = armlArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(15, anze2);
                }
                i++;
            }
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(16, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(17, anze);
        }
        anze = this.o;
        if (anze != null) {
            computeSerializedSize += anwm.c(18, anze);
        }
        anze = this.p;
        return anze != null ? computeSerializedSize + anwm.c(19, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.q = aobv.c();
                    continue;
                case 18:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.a;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 26:
                    this.b = aobv.d();
                    continue;
                case 32:
                    this.c = aobv.c();
                    continue;
                case 40:
                    this.r = aobv.c();
                    continue;
                case cv.aU /*50*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case 58:
                    this.e = aobv.d();
                    continue;
                case 64:
                    this.f = aobv.c();
                    continue;
                case 74:
                    aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk aygk2 = this.s;
                    if (aygk2 != null) {
                        aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.s = aygk;
                    continue;
                case 82:
                    aplb aplb = (aplb) aobv.a(aplb.c.getParserForType());
                    aplb aplb2 = this.g;
                    if (aplb2 != null) {
                        apla apla = (apla) ((anxo) aplb2.toBuilder());
                        apla.mergeFrom(aplb);
                        aplb = (aplb) ((anxl) apla.build());
                    }
                    this.g = aplb;
                    continue;
                case 88:
                    this.h = aobv.f();
                    continue;
                case 96:
                    this.i = aobv.f();
                    continue;
                case 104:
                    this.j = aobv.f();
                    continue;
                case 114:
                    if (this.k == null) {
                        this.k = new ajug();
                    }
                    aobv.a(this.k);
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    arml[] armlArr = this.l;
                    int length = armlArr != null ? armlArr.length : 0;
                    arml[] armlArr2 = new arml[(a + length)];
                    if (length != 0) {
                        System.arraycopy(armlArr, 0, armlArr2, 0, length);
                    }
                    while (length < armlArr2.length - 1) {
                        armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                    this.l = armlArr2;
                    continue;
                case 130:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.m;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.m = arml;
                    continue;
                case 138:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.n;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.n = arml;
                    continue;
                case 146:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.o;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.o = arml;
                    continue;
                case 154:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.p;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.p = arml;
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
