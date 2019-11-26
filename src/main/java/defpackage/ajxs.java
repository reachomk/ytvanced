package defpackage;

/* renamed from: ajxs */
public final class ajxs extends ajwo {
    public aweu[] a;
    public awfi b;
    public awfg c;
    public awfm d;
    public awew e;
    public awfs f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public ajzw k;
    public arml l;
    public apxu m;
    public ajzw n;
    private ajzw o;
    private ajzw p;
    private ajzw q;

    public ajxs() {
        super(78882851);
        this.a = new aweu[0];
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.o = null;
        this.p = null;
        this.k = null;
        this.n = null;
        this.q = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxs) {
            ajxs ajxs = (ajxs) obj;
            if (aocd.a(this.a, ajxs.a)) {
                awfi awfi = this.b;
                if (awfi == null) {
                    if (ajxs.b != null) {
                        return false;
                    }
                } else if (!awfi.equals(ajxs.b)) {
                    return false;
                }
                awfg awfg = this.c;
                if (awfg == null) {
                    if (ajxs.c != null) {
                        return false;
                    }
                } else if (!awfg.equals(ajxs.c)) {
                    return false;
                }
                awfm awfm = this.d;
                if (awfm == null) {
                    if (ajxs.d != null) {
                        return false;
                    }
                } else if (!awfm.equals(ajxs.d)) {
                    return false;
                }
                awew awew = this.e;
                if (awew == null) {
                    if (ajxs.e != null) {
                        return false;
                    }
                } else if (!awew.equals(ajxs.e)) {
                    return false;
                }
                awfs awfs = this.f;
                if (awfs == null) {
                    if (ajxs.f != null) {
                        return false;
                    }
                } else if (!awfs.equals(ajxs.f)) {
                    return false;
                }
                if (this.g == ajxs.g && this.h == ajxs.h && this.i == ajxs.i && this.j == ajxs.j) {
                    ajzw ajzw = this.o;
                    if (ajzw == null) {
                        if (ajxs.o != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajxs.o)) {
                        return false;
                    }
                    ajzw = this.p;
                    if (ajzw == null) {
                        if (ajxs.p != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajxs.p)) {
                        return false;
                    }
                    ajzw = this.k;
                    if (ajzw == null) {
                        if (ajxs.k != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajxs.k)) {
                        return false;
                    }
                    arml arml = this.l;
                    if (arml == null) {
                        if (ajxs.l != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajxs.l)) {
                        return false;
                    }
                    apxu apxu = this.m;
                    if (apxu == null) {
                        if (ajxs.m != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxs.m)) {
                        return false;
                    }
                    ajzw = this.n;
                    if (ajzw == null) {
                        if (ajxs.n != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajxs.n)) {
                        return false;
                    }
                    ajzw = this.q;
                    if (ajzw == null) {
                        if (ajxs.q != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajxs.q)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajxs.unknownFieldData);
                    }
                    aocb aocb2 = ajxs.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        awfi awfi = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = awfi != null ? awfi.hashCode() : 0;
        awfg awfg = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awfg != null ? awfg.hashCode() : 0;
        awfm awfm = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awfm != null ? awfm.hashCode() : 0;
        awew awew = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awew != null ? awew.hashCode() : 0;
        awfs awfs = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (awfs != null ? awfs.hashCode() : 0)) * 31;
        int i = 1237;
        hashCode = (((((hashCode + (!this.g ? 1237 : 1231)) * 31) + (!this.h ? 1237 : 1231)) * 31) + (!this.i ? 1237 : 1231)) * 31;
        if (this.j) {
            i = 1231;
        }
        ajzw ajzw = this.o;
        hashCode = (hashCode + i) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw ajzw2 = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        arml arml = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        ajzw2 = this.n;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.q;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        aweu[] aweuArr = this.a;
        if (aweuArr != null && aweuArr.length > 0) {
            int i = 0;
            while (true) {
                aweu[] aweuArr2 = this.a;
                if (i >= aweuArr2.length) {
                    break;
                }
                anze anze = aweuArr2[i];
                if (anze != null) {
                    aoby.a(1, anze);
                }
                i++;
            }
        }
        anze anze2 = this.b;
        if (anze2 != null) {
            aoby.a(3, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            aoby.a(4, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        if (this.g) {
            aoby.a(9, true);
        }
        if (this.h) {
            aoby.a(10, true);
        }
        if (this.i) {
            aoby.a(11, true);
        }
        if (this.j) {
            aoby.a(12, true);
        }
        aocf aocf = this.o;
        if (aocf != null) {
            aoby.a(13, aocf);
        }
        aocf = this.p;
        if (aocf != null) {
            aoby.a(14, aocf);
        }
        aocf = this.k;
        if (aocf != null) {
            aoby.a(15, aocf);
        }
        anze2 = this.l;
        if (anze2 != null) {
            aoby.a(16, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            aoby.a(17, anze2);
        }
        aocf = this.n;
        if (aocf != null) {
            aoby.a(18, aocf);
        }
        aocf = this.q;
        if (aocf != null) {
            aoby.a(19, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aweu[] aweuArr = this.a;
        if (aweuArr != null && aweuArr.length > 0) {
            int i = 0;
            while (true) {
                aweu[] aweuArr2 = this.a;
                if (i >= aweuArr2.length) {
                    break;
                }
                anze anze = aweuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(1, anze);
                }
                i++;
            }
        }
        anze anze2 = this.b;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(3, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(4, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        if (this.g) {
            computeSerializedSize += aoby.d(9);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(10);
        }
        if (this.i) {
            computeSerializedSize += aoby.d(11);
        }
        if (this.j) {
            computeSerializedSize += aoby.d(12);
        }
        aocf aocf = this.o;
        if (aocf != null) {
            computeSerializedSize += aoby.b(13, aocf);
        }
        aocf = this.p;
        if (aocf != null) {
            computeSerializedSize += aoby.b(14, aocf);
        }
        aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(15, aocf);
        }
        anze2 = this.l;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(16, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(17, anze2);
        }
        aocf = this.n;
        if (aocf != null) {
            computeSerializedSize += aoby.b(18, aocf);
        }
        aocf = this.q;
        return aocf != null ? computeSerializedSize + aoby.b(19, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = aock.a(aobv, 10);
                    aweu[] aweuArr = this.a;
                    int length = aweuArr != null ? aweuArr.length : 0;
                    aweu[] aweuArr2 = new aweu[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aweuArr, 0, aweuArr2, 0, length);
                    }
                    while (length < aweuArr2.length - 1) {
                        aweuArr2[length] = (aweu) aobv.a(aweu.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aweuArr2[length] = (aweu) aobv.a(aweu.f.getParserForType());
                    this.a = aweuArr2;
                    continue;
                case 26:
                    awfi awfi = (awfi) aobv.a(awfi.c.getParserForType());
                    awfi awfi2 = this.b;
                    if (awfi2 != null) {
                        awfl awfl = (awfl) ((anxo) awfi2.toBuilder());
                        awfl.mergeFrom(awfi);
                        awfi = (awfi) ((anxl) awfl.build());
                    }
                    this.b = awfi;
                    continue;
                case 34:
                    awfg awfg = (awfg) aobv.a(awfg.d.getParserForType());
                    awfg awfg2 = this.c;
                    if (awfg2 != null) {
                        awfj awfj = (awfj) ((anxo) awfg2.toBuilder());
                        awfj.mergeFrom(awfg);
                        awfg = (awfg) ((anxl) awfj.build());
                    }
                    this.c = awfg;
                    continue;
                case 42:
                    awfm awfm = (awfm) aobv.a(awfm.c.getParserForType());
                    awfm awfm2 = this.d;
                    if (awfm2 != null) {
                        awfp awfp = (awfp) ((anxo) awfm2.toBuilder());
                        awfp.mergeFrom(awfm);
                        awfm = (awfm) ((anxl) awfp.build());
                    }
                    this.d = awfm;
                    continue;
                case cv.aU /*50*/:
                    awew awew = (awew) aobv.a(awew.c.getParserForType());
                    awew awew2 = this.e;
                    if (awew2 != null) {
                        awez awez = (awez) ((anxo) awew2.toBuilder());
                        awez.mergeFrom(awew);
                        awew = (awew) ((anxl) awez.build());
                    }
                    this.e = awew;
                    continue;
                case 66:
                    awfs awfs = (awfs) aobv.a(awfs.c.getParserForType());
                    awfs awfs2 = this.f;
                    if (awfs2 != null) {
                        awfv awfv = (awfv) ((anxo) awfs2.toBuilder());
                        awfv.mergeFrom(awfs);
                        awfs = (awfs) ((anxl) awfv.build());
                    }
                    this.f = awfs;
                    continue;
                case 72:
                    this.g = aobv.c();
                    continue;
                case 80:
                    this.h = aobv.c();
                    continue;
                case 88:
                    this.i = aobv.c();
                    continue;
                case 96:
                    this.j = aobv.c();
                    continue;
                case 106:
                    if (this.o == null) {
                        this.o = new ajzw();
                    }
                    aobv.a(this.o);
                    continue;
                case 114:
                    if (this.p == null) {
                        this.p = new ajzw();
                    }
                    aobv.a(this.p);
                    continue;
                case afy.av /*122*/:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 130:
                    arml arml = (arml) aobv.a(arml.f.getParserForType());
                    arml arml2 = this.l;
                    if (arml2 != null) {
                        armk armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.l = arml;
                    continue;
                case 138:
                    apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu apxu2 = this.m;
                    if (apxu2 != null) {
                        apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.m = apxu;
                    continue;
                case 146:
                    if (this.n == null) {
                        this.n = new ajzw();
                    }
                    aobv.a(this.n);
                    continue;
                case 154:
                    if (this.q == null) {
                        this.q = new ajzw();
                    }
                    aobv.a(this.q);
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
