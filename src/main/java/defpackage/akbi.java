package defpackage;

import java.util.Arrays;

/* renamed from: akbi */
public final class akbi extends ajwo {
    public arml a;
    public akbe[] b = akbe.a();
    public aphj c;
    public aphj d;
    public byte[] e = aock.c;
    public arml f;
    public akbd[] g;
    public boolean h;
    public int i;
    public boolean j;
    private ayif[] k;

    public akbi() {
        super(118637602);
        if (akbd.a == null) {
            synchronized (aocd.b) {
                if (akbd.a == null) {
                    akbd.a = new akbd[0];
                }
            }
        }
        this.g = akbd.a;
        this.k = new ayif[0];
        this.h = false;
        this.i = 0;
        this.j = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbi) {
            akbi akbi = (akbi) obj;
            arml arml = this.a;
            if (arml == null) {
                if (akbi.a != null) {
                    return false;
                }
            } else if (!arml.equals(akbi.a)) {
                return false;
            }
            if (aocd.a(this.b, akbi.b)) {
                aphj aphj = this.c;
                if (aphj == null) {
                    if (akbi.c != null) {
                        return false;
                    }
                } else if (!aphj.equals(akbi.c)) {
                    return false;
                }
                aphj = this.d;
                if (aphj == null) {
                    if (akbi.d != null) {
                        return false;
                    }
                } else if (!aphj.equals(akbi.d)) {
                    return false;
                }
                if (Arrays.equals(this.e, akbi.e)) {
                    arml = this.f;
                    if (arml == null) {
                        if (akbi.f != null) {
                            return false;
                        }
                    } else if (!arml.equals(akbi.f)) {
                        return false;
                    }
                    if (aocd.a(this.g, akbi.g) && aocd.a(this.k, akbi.k) && this.h == akbi.h && this.i == akbi.i && this.j == akbi.j) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(akbi.unknownFieldData);
                        }
                        aocb aocb2 = akbi.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        int a = aocd.a(this.b);
        aphj aphj = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        aphj aphj2 = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj2 != null ? aphj2.hashCode() : 0;
        a = Arrays.hashCode(this.e);
        arml arml2 = this.f;
        hashCode = (((((((((hashCode + hashCode2) * 31) + a) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31) + aocd.a(this.g)) * 31) + aocd.a(this.k)) * 31;
        a = 1237;
        hashCode = (((hashCode + (!this.h ? 1237 : 1231)) * 31) + this.i) * 31;
        if (this.j) {
            a = 1231;
        }
        hashCode = (hashCode + a) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        aocf aocf;
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        akbe[] akbeArr = this.b;
        int i2 = 0;
        if (akbeArr != null && akbeArr.length > 0) {
            i = 0;
            while (true) {
                akbe[] akbeArr2 = this.b;
                if (i >= akbeArr2.length) {
                    break;
                }
                aocf = akbeArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(6, this.e);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
        }
        akbd[] akbdArr = this.g;
        if (akbdArr != null && akbdArr.length > 0) {
            i = 0;
            while (true) {
                akbd[] akbdArr2 = this.g;
                if (i >= akbdArr2.length) {
                    break;
                }
                aocf = akbdArr2[i];
                if (aocf != null) {
                    aoby.a(8, aocf);
                }
                i++;
            }
        }
        ayif[] ayifArr = this.k;
        if (ayifArr != null && ayifArr.length > 0) {
            while (true) {
                ayifArr = this.k;
                if (i2 >= ayifArr.length) {
                    break;
                }
                anze = ayifArr[i2];
                if (anze != null) {
                    aoby.a(9, anze);
                }
                i2++;
            }
        }
        if (this.h) {
            aoby.a(10, true);
        }
        i = this.i;
        if (i != 0) {
            aoby.a(11, i);
        }
        if (this.j) {
            aoby.a(12, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        aocf aocf;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        akbe[] akbeArr = this.b;
        int i2 = 0;
        if (akbeArr != null && akbeArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akbe[] akbeArr2 = this.b;
                if (computeSerializedSize >= akbeArr2.length) {
                    break;
                }
                aocf = akbeArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(2, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(6, this.e);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        akbd[] akbdArr = this.g;
        if (akbdArr != null && akbdArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akbd[] akbdArr2 = this.g;
                if (computeSerializedSize >= akbdArr2.length) {
                    break;
                }
                aocf = akbdArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(8, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        ayif[] ayifArr = this.k;
        if (ayifArr != null && ayifArr.length > 0) {
            while (true) {
                ayifArr = this.k;
                if (i2 >= ayifArr.length) {
                    break;
                }
                anze = ayifArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(9, anze);
                }
                i2++;
            }
        }
        if (this.h) {
            computeSerializedSize += aoby.d(10);
        }
        i = this.i;
        if (i != 0) {
            computeSerializedSize += aoby.c(11, i);
        }
        return this.j ? computeSerializedSize + aoby.d(12) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            int length;
            aocf akbe;
            aphj aphj;
            aphj aphj2;
            aphm aphm;
            switch (a) {
                case 0:
                    break;
                case 10:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.a;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.a = arml;
                    continue;
                case 18:
                    a = aock.a(aobv, 18);
                    akbe[] akbeArr = this.b;
                    length = akbeArr != null ? akbeArr.length : 0;
                    akbe[] akbeArr2 = new akbe[(a + length)];
                    if (length != 0) {
                        System.arraycopy(akbeArr, 0, akbeArr2, 0, length);
                    }
                    while (length < akbeArr2.length - 1) {
                        akbe = new akbe();
                        akbeArr2[length] = akbe;
                        aobv.a(akbe);
                        aobv.a();
                        length++;
                    }
                    akbe = new akbe();
                    akbeArr2[length] = akbe;
                    aobv.a(akbe);
                    this.b = akbeArr2;
                    continue;
                case 26:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.c;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.c = aphj;
                    continue;
                case 34:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.d;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.d = aphj;
                    continue;
                case cv.aU /*50*/:
                    this.e = aobv.e();
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 66:
                    a = aock.a(aobv, 66);
                    akbd[] akbdArr = this.g;
                    length = akbdArr != null ? akbdArr.length : 0;
                    akbd[] akbdArr2 = new akbd[(a + length)];
                    if (length != 0) {
                        System.arraycopy(akbdArr, 0, akbdArr2, 0, length);
                    }
                    while (length < akbdArr2.length - 1) {
                        akbe = new akbd();
                        akbdArr2[length] = akbe;
                        aobv.a(akbe);
                        aobv.a();
                        length++;
                    }
                    akbe = new akbd();
                    akbdArr2[length] = akbe;
                    aobv.a(akbe);
                    this.g = akbdArr2;
                    continue;
                case 74:
                    a = aock.a(aobv, 74);
                    ayif[] ayifArr = this.k;
                    length = ayifArr != null ? ayifArr.length : 0;
                    ayif[] ayifArr2 = new ayif[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ayifArr, 0, ayifArr2, 0, length);
                    }
                    while (length < ayifArr2.length - 1) {
                        ayifArr2[length] = (ayif) aobv.a(ayif.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    ayifArr2[length] = (ayif) aobv.a(ayif.c.getParserForType());
                    this.k = ayifArr2;
                    continue;
                case 80:
                    this.h = aobv.c();
                    continue;
                case 88:
                    this.i = aobv.f();
                    continue;
                case 96:
                    this.j = aobv.c();
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
