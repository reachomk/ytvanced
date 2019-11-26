package defpackage;

import java.util.Arrays;

/* renamed from: ajwa */
public final class ajwa extends aoca {
    public ajvz[] a;
    public byte[] b;
    private assr[] c;
    private assh d;
    private assf e;
    private assj f;
    public arnm frameworkUpdates;
    private assp g;
    private assn[] h;

    public ajwa() {
        if (ajvz.a == null) {
            synchronized (aocd.b) {
                if (ajvz.a == null) {
                    ajvz.a = new ajvz[0];
                }
            }
        }
        this.a = ajvz.a;
        this.b = aock.c;
        this.c = new assr[0];
        this.h = new assn[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwa) {
            ajwa ajwa = (ajwa) obj;
            if (aocd.a(this.a, ajwa.a) && Arrays.equals(this.b, ajwa.b) && aocd.a(this.c, ajwa.c)) {
                assh assh = this.d;
                if (assh == null) {
                    if (ajwa.d != null) {
                        return false;
                    }
                } else if (!assh.equals(ajwa.d)) {
                    return false;
                }
                assf assf = this.e;
                if (assf == null) {
                    if (ajwa.e != null) {
                        return false;
                    }
                } else if (!assf.equals(ajwa.e)) {
                    return false;
                }
                assj assj = this.f;
                if (assj == null) {
                    if (ajwa.f != null) {
                        return false;
                    }
                } else if (!assj.equals(ajwa.f)) {
                    return false;
                }
                assp assp = this.g;
                if (assp == null) {
                    if (ajwa.g != null) {
                        return false;
                    }
                } else if (!assp.equals(ajwa.g)) {
                    return false;
                }
                if (aocd.a(this.h, ajwa.h)) {
                    arnm arnm = this.frameworkUpdates;
                    if (arnm == null) {
                        if (ajwa.frameworkUpdates != null) {
                            return false;
                        }
                    } else if (!arnm.equals(ajwa.frameworkUpdates)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajwa.unknownFieldData);
                    }
                    aocb aocb2 = ajwa.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        int hashCode2 = Arrays.hashCode(this.b);
        int a2 = aocd.a(this.c);
        assh assh = this.d;
        hashCode = (((((((hashCode + 527) * 31) + a) * 31) + hashCode2) * 31) + a2) * 31;
        a = 0;
        hashCode2 = assh != null ? assh.hashCode() : 0;
        assf assf = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = assf != null ? assf.hashCode() : 0;
        assj assj = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = assj != null ? assj.hashCode() : 0;
        assp assp = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = assp != null ? assp.hashCode() : 0;
        a2 = aocd.a(this.h);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((hashCode + hashCode2) * 31) + a2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajvz[] ajvzArr = this.a;
        int i2 = 0;
        if (ajvzArr != null && ajvzArr.length > 0) {
            i = 0;
            while (true) {
                ajvz[] ajvzArr2 = this.a;
                if (i >= ajvzArr2.length) {
                    break;
                }
                aocf aocf = ajvzArr2[i];
                if (aocf != null) {
                    aoby.a(4, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(5, this.b);
        }
        assr[] assrArr = this.c;
        if (assrArr != null && assrArr.length > 0) {
            i = 0;
            while (true) {
                assr[] assrArr2 = this.c;
                if (i >= assrArr2.length) {
                    break;
                }
                anze anze = assrArr2[i];
                if (anze != null) {
                    aoby.a(6, anze);
                }
                i++;
            }
        }
        anze anze2 = this.d;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            aoby.a(10, anze2);
        }
        assn[] assnArr = this.h;
        if (assnArr != null && assnArr.length > 0) {
            while (true) {
                assnArr = this.h;
                if (i2 >= assnArr.length) {
                    break;
                }
                anze2 = assnArr[i2];
                if (anze2 != null) {
                    aoby.a(12, anze2);
                }
                i2++;
            }
        }
        anze2 = this.frameworkUpdates;
        if (anze2 != null) {
            aoby.a(777, anze2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajvz[] ajvzArr = this.a;
        int i2 = 0;
        if (ajvzArr != null && ajvzArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajvz[] ajvzArr2 = this.a;
                if (computeSerializedSize >= ajvzArr2.length) {
                    break;
                }
                aocf aocf = ajvzArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(4, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(5, this.b);
        }
        assr[] assrArr = this.c;
        if (assrArr != null && assrArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                assr[] assrArr2 = this.c;
                if (computeSerializedSize >= assrArr2.length) {
                    break;
                }
                anze anze = assrArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(6, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(10, anze2);
        }
        assn[] assnArr = this.h;
        if (assnArr != null && assnArr.length > 0) {
            while (true) {
                assnArr = this.h;
                if (i2 >= assnArr.length) {
                    break;
                }
                anze2 = assnArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(12, anze2);
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
            if (a == 0) {
                break;
            } else if (a == 34) {
                aocf ajvz;
                a = aock.a(aobv, 34);
                ajvz[] ajvzArr = this.a;
                length = ajvzArr != null ? ajvzArr.length : 0;
                ajvz[] ajvzArr2 = new ajvz[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajvzArr, 0, ajvzArr2, 0, length);
                }
                while (length < ajvzArr2.length - 1) {
                    ajvz = new ajvz();
                    ajvzArr2[length] = ajvz;
                    aobv.a(ajvz);
                    aobv.a();
                    length++;
                }
                ajvz = new ajvz();
                ajvzArr2[length] = ajvz;
                aobv.a(ajvz);
                this.a = ajvzArr2;
            } else if (a == 42) {
                this.b = aobv.e();
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                assr[] assrArr = this.c;
                length = assrArr != null ? assrArr.length : 0;
                assr[] assrArr2 = new assr[(a + length)];
                if (length != 0) {
                    System.arraycopy(assrArr, 0, assrArr2, 0, length);
                }
                while (length < assrArr2.length - 1) {
                    assrArr2[length] = (assr) aobv.a(assr.a.getParserForType());
                    aobv.a();
                    length++;
                }
                assrArr2[length] = (assr) aobv.a(assr.a.getParserForType());
                this.c = assrArr2;
            } else if (a == 58) {
                assh assh = (assh) aobv.a(assh.a.getParserForType());
                assh assh2 = this.d;
                if (assh2 != null) {
                    assk assk = (assk) ((anxo) assh2.toBuilder());
                    assk.mergeFrom(assh);
                    assh = (assh) ((anxl) assk.build());
                }
                this.d = assh;
            } else if (a == 66) {
                assf assf = (assf) aobv.a(assf.a.getParserForType());
                assf assf2 = this.e;
                if (assf2 != null) {
                    assi assi = (assi) ((anxo) assf2.toBuilder());
                    assi.mergeFrom(assf);
                    assf = (assf) ((anxl) assi.build());
                }
                this.e = assf;
            } else if (a == 74) {
                assj assj = (assj) aobv.a(assj.a.getParserForType());
                assj assj2 = this.f;
                if (assj2 != null) {
                    assm assm = (assm) ((anxo) assj2.toBuilder());
                    assm.mergeFrom(assj);
                    assj = (assj) ((anxl) assm.build());
                }
                this.f = assj;
            } else if (a == 82) {
                assp assp = (assp) aobv.a(assp.c.getParserForType());
                assp assp2 = this.g;
                if (assp2 != null) {
                    asss asss = (asss) ((anxo) assp2.toBuilder());
                    asss.mergeFrom(assp);
                    assp = (assp) ((anxl) asss.build());
                }
                this.g = assp;
            } else if (a == 98) {
                a = aock.a(aobv, 98);
                assn[] assnArr = this.h;
                length = assnArr != null ? assnArr.length : 0;
                assn[] assnArr2 = new assn[(a + length)];
                if (length != 0) {
                    System.arraycopy(assnArr, 0, assnArr2, 0, length);
                }
                while (length < assnArr2.length - 1) {
                    assnArr2[length] = (assn) aobv.a(assn.a.getParserForType());
                    aobv.a();
                    length++;
                }
                assnArr2[length] = (assn) aobv.a(assn.a.getParserForType());
                this.h = assnArr2;
            } else if (a == 6218) {
                arnm arnm = (arnm) aobv.a(arnm.a.getParserForType());
                arnm arnm2 = this.frameworkUpdates;
                if (arnm2 != null) {
                    arnl arnl = (arnl) ((anxo) arnm2.toBuilder());
                    arnl.mergeFrom(arnm);
                    arnm = (arnm) ((anxl) arnl.build());
                }
                this.frameworkUpdates = arnm;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
