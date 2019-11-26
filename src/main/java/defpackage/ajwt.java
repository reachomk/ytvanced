package defpackage;

import java.util.Arrays;

/* renamed from: ajwt */
public final class ajwt extends ajwo {
    public static final aobz a = aobz.a(ajwt.class, 401563698);
    public ajww[] b;
    public atvz[] c;
    public ajws d;
    public atvn e;
    public String f;
    public boolean g;
    public int h;
    public arbw i;
    private byte[] j;

    public ajwt() {
        super(50195462);
        if (ajww.a == null) {
            synchronized (aocd.b) {
                if (ajww.a == null) {
                    ajww.a = new ajww[0];
                }
            }
        }
        this.b = ajww.a;
        this.c = new atvz[0];
        this.j = aock.c;
        this.d = null;
        this.f = "";
        this.g = false;
        this.h = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwt) {
            ajwt ajwt = (ajwt) obj;
            if (aocd.a(this.b, ajwt.b) && aocd.a(this.c, ajwt.c) && Arrays.equals(this.j, ajwt.j)) {
                ajws ajws = this.d;
                if (ajws == null) {
                    if (ajwt.d != null) {
                        return false;
                    }
                } else if (!ajws.equals(ajwt.d)) {
                    return false;
                }
                atvn atvn = this.e;
                if (atvn == null) {
                    if (ajwt.e != null) {
                        return false;
                    }
                } else if (!atvn.equals(ajwt.e)) {
                    return false;
                }
                String str = this.f;
                if (str == null) {
                    if (ajwt.f != null) {
                        return false;
                    }
                } else if (!str.equals(ajwt.f)) {
                    return false;
                }
                if (this.g == ajwt.g && this.h == ajwt.h) {
                    arbw arbw = this.i;
                    if (arbw == null) {
                        if (ajwt.i != null) {
                            return false;
                        }
                    } else if (!arbw.equals(ajwt.i)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajwt.unknownFieldData);
                    }
                    aocb aocb2 = ajwt.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.b);
        int a2 = aocd.a(this.c);
        int hashCode2 = Arrays.hashCode(this.j);
        ajws ajws = this.d;
        hashCode = (((((((hashCode + 527) * 31) + a) * 31) + a2) * 31) + hashCode2) * 31;
        a = 0;
        a2 = ajws != null ? ajws.hashCode() : 0;
        atvn atvn = this.e;
        hashCode = (((hashCode + a2) * 31) + (atvn != null ? atvn.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a2 = !this.g ? 1237 : 1231;
        hashCode2 = this.h;
        arbw arbw = this.i;
        hashCode = (((((hashCode + a2) * 31) + hashCode2) * 31) + (arbw != null ? arbw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        ajww[] ajwwArr = this.b;
        int i2 = 0;
        if (ajwwArr != null && ajwwArr.length > 0) {
            i = 0;
            while (true) {
                ajww[] ajwwArr2 = this.b;
                if (i >= ajwwArr2.length) {
                    break;
                }
                aocf aocf = ajwwArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        atvz[] atvzArr = this.c;
        if (atvzArr != null && atvzArr.length > 0) {
            while (true) {
                atvzArr = this.c;
                if (i2 >= atvzArr.length) {
                    break;
                }
                anze = atvzArr[i2];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.j, aock.c)) {
            aoby.a(4, this.j);
        }
        aocf aocf2 = this.d;
        if (aocf2 != null) {
            aoby.a(5, aocf2);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        String str = this.f;
        if (!(str == null || str.equals(""))) {
            aoby.a(7, this.f);
        }
        if (this.g) {
            aoby.a(8, true);
        }
        i = this.h;
        if (i != 0) {
            aoby.b(9, i);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(10, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        ajww[] ajwwArr = this.b;
        int i2 = 0;
        if (ajwwArr != null && ajwwArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajww[] ajwwArr2 = this.b;
                if (computeSerializedSize >= ajwwArr2.length) {
                    break;
                }
                aocf aocf = ajwwArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        atvz[] atvzArr = this.c;
        if (atvzArr != null && atvzArr.length > 0) {
            while (true) {
                atvzArr = this.c;
                if (i2 >= atvzArr.length) {
                    break;
                }
                anze = atvzArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(2, anze);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.j, aock.c)) {
            computeSerializedSize += aoby.b(4, this.j);
        }
        aocf aocf2 = this.d;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(5, aocf2);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        String str = this.f;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(7, this.f);
        }
        if (this.g) {
            computeSerializedSize += aoby.d(8);
        }
        i = this.h;
        if (i != 0) {
            computeSerializedSize += aoby.d(9, i);
        }
        anze = this.i;
        return anze != null ? computeSerializedSize + anwm.c(10, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf ajww;
                a = aock.a(aobv, 10);
                ajww[] ajwwArr = this.b;
                length = ajwwArr != null ? ajwwArr.length : 0;
                ajww[] ajwwArr2 = new ajww[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajwwArr, 0, ajwwArr2, 0, length);
                }
                while (length < ajwwArr2.length - 1) {
                    ajww = new ajww();
                    ajwwArr2[length] = ajww;
                    aobv.a(ajww);
                    aobv.a();
                    length++;
                }
                ajww = new ajww();
                ajwwArr2[length] = ajww;
                aobv.a(ajww);
                this.b = ajwwArr2;
            } else if (a == 18) {
                a = aock.a(aobv, 18);
                atvz[] atvzArr = this.c;
                length = atvzArr != null ? atvzArr.length : 0;
                atvz[] atvzArr2 = new atvz[(a + length)];
                if (length != 0) {
                    System.arraycopy(atvzArr, 0, atvzArr2, 0, length);
                }
                while (length < atvzArr2.length - 1) {
                    atvzArr2[length] = (atvz) aobv.a(atvz.f.getParserForType());
                    aobv.a();
                    length++;
                }
                atvzArr2[length] = (atvz) aobv.a(atvz.f.getParserForType());
                this.c = atvzArr2;
            } else if (a == 34) {
                this.j = aobv.e();
            } else if (a == 42) {
                if (this.d == null) {
                    this.d = new ajws();
                }
                aobv.a(this.d);
            } else if (a == 50) {
                atvn atvn = (atvn) aobv.a(atvn.c.getParserForType());
                atvn atvn2 = this.e;
                if (atvn2 != null) {
                    atvm atvm = (atvm) ((anxo) atvn2.toBuilder());
                    atvm.mergeFrom(atvn);
                    atvn = (atvn) ((anxl) atvm.build());
                }
                this.e = atvn;
            } else if (a == 58) {
                this.f = aobv.d();
            } else if (a == 64) {
                this.g = aobv.c();
            } else if (a == 72) {
                this.h = aobv.f();
            } else if (a == 82) {
                arbw arbw = (arbw) aobv.a(arbw.f.getParserForType());
                arbw arbw2 = this.i;
                if (arbw2 != null) {
                    arbv arbv = (arbv) ((anxo) arbw2.toBuilder());
                    arbv.mergeFrom(arbw);
                    arbw = (arbw) ((anxl) arbv.build());
                }
                this.i = arbw;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
