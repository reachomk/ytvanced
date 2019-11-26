package defpackage;

import java.util.Arrays;

/* renamed from: ajxa */
public final class ajxa extends ajwo {
    public static final aobz a = aobz.a(ajxa.class, 938355418);
    public aufw[] b;
    public apxu[] c;
    public ajwv d;
    public aufq e;
    public aufo f;
    public ardw[] g;
    public String h;
    public boolean i;
    private aufy j;
    private byte[] k;
    private aufu l;
    private ajzw m;
    private ajzw n;
    private int o;

    public ajxa() {
        super(117294427);
        this.b = new aufw[0];
        this.c = new apxu[0];
        this.d = null;
        this.k = aock.c;
        this.g = new ardw[0];
        this.h = "";
        this.i = false;
        this.o = 1;
        this.m = null;
        this.n = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxa) {
            ajxa ajxa = (ajxa) obj;
            if (aocd.a(this.b, ajxa.b) && aocd.a(this.c, ajxa.c)) {
                ajwv ajwv = this.d;
                if (ajwv == null) {
                    if (ajxa.d != null) {
                        return false;
                    }
                } else if (!ajwv.equals(ajxa.d)) {
                    return false;
                }
                aufq aufq = this.e;
                if (aufq == null) {
                    if (ajxa.e != null) {
                        return false;
                    }
                } else if (!aufq.equals(ajxa.e)) {
                    return false;
                }
                aufo aufo = this.f;
                if (aufo == null) {
                    if (ajxa.f != null) {
                        return false;
                    }
                } else if (!aufo.equals(ajxa.f)) {
                    return false;
                }
                aufy aufy = this.j;
                if (aufy == null) {
                    if (ajxa.j != null) {
                        return false;
                    }
                } else if (!aufy.equals(ajxa.j)) {
                    return false;
                }
                if (Arrays.equals(this.k, ajxa.k) && aocd.a(this.g, ajxa.g)) {
                    aufu aufu = this.l;
                    if (aufu == null) {
                        if (ajxa.l != null) {
                            return false;
                        }
                    } else if (!aufu.equals(ajxa.l)) {
                        return false;
                    }
                    String str = this.h;
                    if (str == null) {
                        if (ajxa.h != null) {
                            return false;
                        }
                    } else if (!str.equals(ajxa.h)) {
                        return false;
                    }
                    if (this.i == ajxa.i && this.o == ajxa.o) {
                        ajzw ajzw = this.m;
                        if (ajzw == null) {
                            if (ajxa.m != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajxa.m)) {
                            return false;
                        }
                        ajzw = this.n;
                        if (ajzw == null) {
                            if (ajxa.n != null) {
                                return false;
                            }
                        } else if (!ajzw.equals(ajxa.n)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajxa.unknownFieldData);
                        }
                        aocb aocb2 = ajxa.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.b);
        int a2 = aocd.a(this.c);
        ajwv ajwv = this.d;
        hashCode = (((((hashCode + 527) * 31) + a) * 31) + a2) * 31;
        a = 0;
        a2 = ajwv != null ? ajwv.hashCode() : 0;
        aufq aufq = this.e;
        hashCode = (hashCode + a2) * 31;
        a2 = aufq != null ? aufq.hashCode() : 0;
        aufo aufo = this.f;
        hashCode = (hashCode + a2) * 31;
        a2 = aufo != null ? aufo.hashCode() : 0;
        aufy aufy = this.j;
        hashCode = (hashCode + a2) * 31;
        a2 = aufy != null ? aufy.hashCode() : 0;
        int hashCode2 = Arrays.hashCode(this.k);
        int a3 = aocd.a(this.g);
        aufu aufu = this.l;
        hashCode = (((((((hashCode + a2) * 31) + hashCode2) * 31) + a3) * 31) + (aufu != null ? aufu.hashCode() : 0)) * 31;
        String str = this.h;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (!this.i ? 1237 : 1231)) * 31;
        a2 = this.o;
        if (a2 == 0) {
            a2 = 0;
        }
        ajzw ajzw = this.m;
        hashCode = (hashCode + a2) * 31;
        a2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.n;
        hashCode = (((hashCode + a2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        aufw[] aufwArr = this.b;
        int i2 = 0;
        if (aufwArr != null && aufwArr.length > 0) {
            i = 0;
            while (true) {
                aufw[] aufwArr2 = this.b;
                if (i >= aufwArr2.length) {
                    break;
                }
                anze = aufwArr2[i];
                if (anze != null) {
                    aoby.a(1, anze);
                }
                i++;
            }
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        anze anze2 = this.e;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        anze2 = this.j;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            aoby.a(9, this.k);
        }
        ardw[] ardwArr = this.g;
        if (ardwArr != null && ardwArr.length > 0) {
            while (true) {
                ardwArr = this.g;
                if (i2 >= ardwArr.length) {
                    break;
                }
                anze2 = ardwArr[i2];
                if (anze2 != null) {
                    aoby.a(12, anze2);
                }
                i2++;
            }
        }
        anze2 = this.l;
        if (anze2 != null) {
            aoby.a(14, anze2);
        }
        String str = this.h;
        if (!(str == null || str.equals(""))) {
            aoby.a(15, this.h);
        }
        if (this.i) {
            aoby.a(16, true);
        }
        i = this.o;
        if (!(i == 1 || i == 0)) {
            aoby.a(17, i - 1);
        }
        aocf = this.m;
        if (aocf != null) {
            aoby.a(18, aocf);
        }
        aocf = this.n;
        if (aocf != null) {
            aoby.a(19, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        aufw[] aufwArr = this.b;
        int i2 = 0;
        if (aufwArr != null && aufwArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aufw[] aufwArr2 = this.b;
                if (computeSerializedSize >= aufwArr2.length) {
                    break;
                }
                anze = aufwArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(1, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze = apxuArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(2, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        anze anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        anze2 = this.j;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        if (!Arrays.equals(this.k, aock.c)) {
            computeSerializedSize += aoby.b(9, this.k);
        }
        ardw[] ardwArr = this.g;
        if (ardwArr != null && ardwArr.length > 0) {
            while (true) {
                ardwArr = this.g;
                if (i2 >= ardwArr.length) {
                    break;
                }
                anze2 = ardwArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(12, anze2);
                }
                i2++;
            }
        }
        anze2 = this.l;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(14, anze2);
        }
        String str = this.h;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(15, this.h);
        }
        if (this.i) {
            computeSerializedSize += aoby.d(16);
        }
        i = this.o;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(17, i - 1);
        }
        aocf = this.m;
        if (aocf != null) {
            computeSerializedSize += aoby.b(18, aocf);
        }
        aocf = this.n;
        return aocf != null ? computeSerializedSize + aoby.b(19, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            int length;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = aock.a(aobv, 10);
                    aufw[] aufwArr = this.b;
                    length = aufwArr != null ? aufwArr.length : 0;
                    aufw[] aufwArr2 = new aufw[(a + length)];
                    if (length != 0) {
                        System.arraycopy(aufwArr, 0, aufwArr2, 0, length);
                    }
                    while (length < aufwArr2.length - 1) {
                        aufwArr2[length] = (aufw) aobv.a(aufw.g.getParserForType());
                        aobv.a();
                        length++;
                    }
                    aufwArr2[length] = (aufw) aobv.a(aufw.g.getParserForType());
                    this.b = aufwArr2;
                    continue;
                case 18:
                    a = aock.a(aobv, 18);
                    apxu[] apxuArr = this.c;
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
                    this.c = apxuArr2;
                    continue;
                case 26:
                    if (this.d == null) {
                        this.d = new ajwv();
                    }
                    aobv.a(this.d);
                    continue;
                case 42:
                    aufq aufq = (aufq) aobv.a(aufq.c.getParserForType());
                    aufq aufq2 = this.e;
                    if (aufq2 != null) {
                        auft auft = (auft) ((anxo) aufq2.toBuilder());
                        auft.mergeFrom(aufq);
                        aufq = (aufq) ((anxl) auft.build());
                    }
                    this.e = aufq;
                    continue;
                case cv.aU /*50*/:
                    aufo aufo = (aufo) aobv.a(aufo.c.getParserForType());
                    aufo aufo2 = this.f;
                    if (aufo2 != null) {
                        aufr aufr = (aufr) ((anxo) aufo2.toBuilder());
                        aufr.mergeFrom(aufo);
                        aufo = (aufo) ((anxl) aufr.build());
                    }
                    this.f = aufo;
                    continue;
                case 58:
                    aufy aufy = (aufy) aobv.a(aufy.a.getParserForType());
                    aufy aufy2 = this.j;
                    if (aufy2 != null) {
                        augb augb = (augb) ((anxo) aufy2.toBuilder());
                        augb.mergeFrom(aufy);
                        aufy = (aufy) ((anxl) augb.build());
                    }
                    this.j = aufy;
                    continue;
                case 74:
                    this.k = aobv.e();
                    continue;
                case 98:
                    a = aock.a(aobv, 98);
                    ardw[] ardwArr = this.g;
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
                    this.g = ardwArr2;
                    continue;
                case 114:
                    aufu aufu = (aufu) aobv.a(aufu.g.getParserForType());
                    aufu aufu2 = this.l;
                    if (aufu2 != null) {
                        aufx aufx = (aufx) ((anxo) aufu2.toBuilder());
                        aufx.mergeFrom(aufu);
                        aufu = (aufu) ((anxl) aufx.build());
                    }
                    this.l = aufu;
                    continue;
                case afy.av /*122*/:
                    this.h = aobv.d();
                    continue;
                case 128:
                    this.i = aobv.c();
                    continue;
                case 136:
                    int i2 = aobv.b;
                    length = aobv.f();
                    if (length == 0 || length == 1 || length == 2 || length == 3) {
                        if (length == 0) {
                            i = 1;
                        } else if (length == 1) {
                            i = 2;
                        } else if (length == 2) {
                            i = 3;
                        } else if (length == 3) {
                            i = 4;
                        }
                        this.o = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 146:
                    if (this.m == null) {
                        this.m = new ajzw();
                    }
                    aobv.a(this.m);
                    continue;
                case 154:
                    if (this.n == null) {
                        this.n = new ajzw();
                    }
                    aobv.a(this.n);
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
