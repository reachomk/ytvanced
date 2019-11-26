package defpackage;

import java.util.Arrays;

/* renamed from: ajwy */
public final class ajwy extends ajwo {
    public arml a;
    public auev[] b = new auev[0];
    public String c;
    public long d;
    public auem e;
    public auep f;
    public auer g;
    public long h;
    public String i;
    public aufb[] j;
    public ajzw k;
    public boolean l;
    private arml m;
    private auez[] n;
    private String o;
    private String[] p;
    private ardw[] q;
    private byte[] r;

    public ajwy() {
        super(132517641);
        String str = "";
        this.c = str;
        this.d = 0;
        this.h = 0;
        this.i = str;
        this.j = new aufb[0];
        this.n = new auez[0];
        this.o = str;
        this.p = aock.b;
        this.k = null;
        this.q = new ardw[0];
        this.r = aock.c;
        this.l = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwy) {
            ajwy ajwy = (ajwy) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajwy.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajwy.a)) {
                return false;
            }
            arml = this.m;
            if (arml == null) {
                if (ajwy.m != null) {
                    return false;
                }
            } else if (!arml.equals(ajwy.m)) {
                return false;
            }
            if (aocd.a(this.b, ajwy.b)) {
                String str = this.c;
                if (str == null) {
                    if (ajwy.c != null) {
                        return false;
                    }
                } else if (!str.equals(ajwy.c)) {
                    return false;
                }
                if (this.d == ajwy.d) {
                    auem auem = this.e;
                    if (auem == null) {
                        if (ajwy.e != null) {
                            return false;
                        }
                    } else if (!auem.equals(ajwy.e)) {
                        return false;
                    }
                    auep auep = this.f;
                    if (auep == null) {
                        if (ajwy.f != null) {
                            return false;
                        }
                    } else if (!auep.equals(ajwy.f)) {
                        return false;
                    }
                    auer auer = this.g;
                    if (auer == null) {
                        if (ajwy.g != null) {
                            return false;
                        }
                    } else if (!auer.equals(ajwy.g)) {
                        return false;
                    }
                    if (this.h == ajwy.h) {
                        str = this.i;
                        if (str == null) {
                            if (ajwy.i != null) {
                                return false;
                            }
                        } else if (!str.equals(ajwy.i)) {
                            return false;
                        }
                        if (aocd.a(this.j, ajwy.j) && aocd.a(this.n, ajwy.n)) {
                            str = this.o;
                            if (str == null) {
                                if (ajwy.o != null) {
                                    return false;
                                }
                            } else if (!str.equals(ajwy.o)) {
                                return false;
                            }
                            if (aocd.a(this.p, ajwy.p)) {
                                ajzw ajzw = this.k;
                                if (ajzw == null) {
                                    if (ajwy.k != null) {
                                        return false;
                                    }
                                } else if (!ajzw.equals(ajwy.k)) {
                                    return false;
                                }
                                if (aocd.a(this.q, ajwy.q) && Arrays.equals(this.r, ajwy.r) && this.l == ajwy.l) {
                                    aocb aocb = this.unknownFieldData;
                                    if (aocb != null && !aocb.b()) {
                                        return this.unknownFieldData.equals(ajwy.unknownFieldData);
                                    }
                                    aocb aocb2 = ajwy.unknownFieldData;
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
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.m;
        hashCode = (((((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31) + aocd.a(this.b)) * 31;
        String str = this.c;
        hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.d;
        auem auem = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int hashCode3 = auem != null ? auem.hashCode() : 0;
        auep auep = this.f;
        hashCode = (hashCode + hashCode3) * 31;
        hashCode3 = auep != null ? auep.hashCode() : 0;
        auer auer = this.g;
        hashCode = (hashCode + hashCode3) * 31;
        hashCode3 = auer != null ? auer.hashCode() : 0;
        long j2 = this.h;
        hashCode = (((hashCode + hashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.i;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + aocd.a(this.j)) * 31) + aocd.a(this.n)) * 31;
        str = this.o;
        hashCode2 = str != null ? str.hashCode() : 0;
        hashCode3 = aocd.a(this.p);
        ajzw ajzw = this.k;
        hashCode = (((((((((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31) + aocd.a(this.q)) * 31) + Arrays.hashCode(this.r)) * 31) + (!this.l ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        anze anze2 = this.a;
        if (anze2 != null) {
            aoby.a(1, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            aoby.a(2, anze2);
        }
        auev[] auevArr = this.b;
        int i2 = 0;
        if (auevArr != null && auevArr.length > 0) {
            i = 0;
            while (true) {
                auev[] auevArr2 = this.b;
                if (i >= auevArr2.length) {
                    break;
                }
                anze anze3 = auevArr2[i];
                if (anze3 != null) {
                    aoby.a(3, anze3);
                }
                i++;
            }
        }
        String str = this.c;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(4, this.c);
        }
        long j = this.d;
        if (j != 0) {
            aoby.b(5, j);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        j = this.h;
        if (j != 0) {
            aoby.b(9, j);
        }
        str = this.i;
        if (!(str == null || str.equals(str2))) {
            aoby.a(10, this.i);
        }
        aufb[] aufbArr = this.j;
        if (aufbArr != null && aufbArr.length > 0) {
            i = 0;
            while (true) {
                aufb[] aufbArr2 = this.j;
                if (i >= aufbArr2.length) {
                    break;
                }
                anze = aufbArr2[i];
                if (anze != null) {
                    aoby.a(11, anze);
                }
                i++;
            }
        }
        auez[] auezArr = this.n;
        if (auezArr != null && auezArr.length > 0) {
            i = 0;
            while (true) {
                auez[] auezArr2 = this.n;
                if (i >= auezArr2.length) {
                    break;
                }
                anze = auezArr2[i];
                if (anze != null) {
                    aoby.a(12, anze);
                }
                i++;
            }
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            aoby.a(14, this.o);
        }
        String[] strArr = this.p;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            while (true) {
                String[] strArr2 = this.p;
                if (i >= strArr2.length) {
                    break;
                }
                str2 = strArr2[i];
                if (str2 != null) {
                    aoby.a(15, str2);
                }
                i++;
            }
        }
        aocf aocf = this.k;
        if (aocf != null) {
            aoby.a(16, aocf);
        }
        ardw[] ardwArr = this.q;
        if (ardwArr != null && ardwArr.length > 0) {
            while (true) {
                ardwArr = this.q;
                if (i2 >= ardwArr.length) {
                    break;
                }
                anze2 = ardwArr[i2];
                if (anze2 != null) {
                    aoby.a(17, anze2);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.r, aock.c)) {
            aoby.a(19, this.r);
        }
        if (this.l) {
            aoby.a(20, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze2 = this.a;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(1, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(2, anze2);
        }
        auev[] auevArr = this.b;
        int i2 = 0;
        if (auevArr != null && auevArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                auev[] auevArr2 = this.b;
                if (computeSerializedSize >= auevArr2.length) {
                    break;
                }
                anze anze3 = auevArr2[computeSerializedSize];
                if (anze3 != null) {
                    i += anwm.c(3, anze3);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String str = this.c;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        long j = this.d;
        if (j != 0) {
            computeSerializedSize += aoby.d(5, j);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        j = this.h;
        if (j != 0) {
            computeSerializedSize += aoby.d(9, j);
        }
        str = this.i;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(10, this.i);
        }
        aufb[] aufbArr = this.j;
        if (aufbArr != null && aufbArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aufb[] aufbArr2 = this.j;
                if (computeSerializedSize >= aufbArr2.length) {
                    break;
                }
                anze = aufbArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(11, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        auez[] auezArr = this.n;
        if (auezArr != null && auezArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                auez[] auezArr2 = this.n;
                if (computeSerializedSize >= auezArr2.length) {
                    break;
                }
                anze = auezArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(12, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(14, this.o);
        }
        String[] strArr = this.p;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.p;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    i4++;
                    i3 += aoby.b(str3);
                }
                i++;
            }
            computeSerializedSize = (computeSerializedSize + i3) + i4;
        }
        aocf aocf = this.k;
        if (aocf != null) {
            computeSerializedSize += aoby.b(16, aocf);
        }
        ardw[] ardwArr = this.q;
        if (ardwArr != null && ardwArr.length > 0) {
            while (true) {
                ardwArr = this.q;
                if (i2 >= ardwArr.length) {
                    break;
                }
                anze2 = ardwArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(17, anze2);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.r, aock.c)) {
            computeSerializedSize += aoby.b(19, this.r);
        }
        return this.l ? computeSerializedSize + aoby.d(20) : computeSerializedSize;
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
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.m;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.m = arml;
                    continue;
                case 26:
                    a = aock.a(aobv, 26);
                    auev[] auevArr = this.b;
                    length = auevArr != null ? auevArr.length : 0;
                    auev[] auevArr2 = new auev[(a + length)];
                    if (length != 0) {
                        System.arraycopy(auevArr, 0, auevArr2, 0, length);
                    }
                    while (length < auevArr2.length - 1) {
                        auevArr2[length] = (auev) aobv.a(auev.g.getParserForType());
                        aobv.a();
                        length++;
                    }
                    auevArr2[length] = (auev) aobv.a(auev.g.getParserForType());
                    this.b = auevArr2;
                    continue;
                case 34:
                    this.c = aobv.d();
                    continue;
                case 40:
                    this.d = aobv.g();
                    continue;
                case cv.aU /*50*/:
                    auem auem = (auem) aobv.a(auem.c.getParserForType());
                    auem auem2 = this.e;
                    if (auem2 != null) {
                        aueo aueo = (aueo) ((anxo) auem2.toBuilder());
                        aueo.mergeFrom(auem);
                        auem = (auem) ((anxl) aueo.build());
                    }
                    this.e = auem;
                    continue;
                case 58:
                    auep auep = (auep) aobv.a(auep.c.getParserForType());
                    auep auep2 = this.f;
                    if (auep2 != null) {
                        aues aues = (aues) ((anxo) auep2.toBuilder());
                        aues.mergeFrom(auep);
                        auep = (auep) ((anxl) aues.build());
                    }
                    this.f = auep;
                    continue;
                case 66:
                    auer auer = (auer) aobv.a(auer.c.getParserForType());
                    auer auer2 = this.g;
                    if (auer2 != null) {
                        aueu aueu = (aueu) ((anxo) auer2.toBuilder());
                        aueu.mergeFrom(auer);
                        auer = (auer) ((anxl) aueu.build());
                    }
                    this.g = auer;
                    continue;
                case 72:
                    this.h = aobv.g();
                    continue;
                case 82:
                    this.i = aobv.d();
                    continue;
                case 90:
                    a = aock.a(aobv, 90);
                    aufb[] aufbArr = this.j;
                    length = aufbArr != null ? aufbArr.length : 0;
                    aufb[] aufbArr2 = new aufb[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aufbArr, 0, aufbArr2, 0, length);
                    }
                    while (length < aufbArr2.length - 1) {
                        aufbArr2[length] = (aufb) aobv.a(aufb.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aufbArr2[length] = (aufb) aobv.a(aufb.c.getParserForType());
                    this.j = aufbArr2;
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    auez[] auezArr = this.n;
                    length = auezArr != null ? auezArr.length : 0;
                    auez[] auezArr2 = new auez[(a + length)];
                    if (length != 0) {
                        System.arraycopy(auezArr, 0, auezArr2, 0, length);
                    }
                    while (length < auezArr2.length - 1) {
                        auezArr2[length] = (auez) aobv.a(auez.c.getParserForType());
                        aobv.a();
                        length++;
                    }
                    auezArr2[length] = (auez) aobv.a(auez.c.getParserForType());
                    this.n = auezArr2;
                    continue;
                case 114:
                    this.o = aobv.d();
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    String[] strArr = this.p;
                    length = strArr != null ? strArr.length : 0;
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
                    this.p = strArr2;
                    continue;
                case 130:
                    if (this.k == null) {
                        this.k = new ajzw();
                    }
                    aobv.a(this.k);
                    continue;
                case 138:
                    a = aock.a(aobv, 138);
                    ardw[] ardwArr = this.q;
                    length = ardwArr != null ? ardwArr.length : 0;
                    ardw[] ardwArr2 = new ardw[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ardwArr, 0, ardwArr2, 0, length);
                    }
                    while (length < ardwArr2.length - 1) {
                        ardwArr2[length] = (ardw) aobv.a(ardw.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    ardwArr2[length] = (ardw) aobv.a(ardw.f.getParserForType());
                    this.q = ardwArr2;
                    continue;
                case 154:
                    this.r = aobv.e();
                    continue;
                case 160:
                    this.l = aobv.c();
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
