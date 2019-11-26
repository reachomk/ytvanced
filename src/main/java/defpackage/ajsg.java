package defpackage;

import java.util.Arrays;

/* renamed from: ajsg */
public final class ajsg extends ajwo {
    public ajsf[] a;
    public apmu b;
    public apxu c;
    public byte[] d;
    public aphj e;
    public int f;
    private apxu g;
    private int h;

    public ajsg() {
        super(48479645);
        if (ajsf.a == null) {
            synchronized (aocd.b) {
                if (ajsf.a == null) {
                    ajsf.a = new ajsf[0];
                }
            }
        }
        this.a = ajsf.a;
        this.d = aock.c;
        this.h = 1;
        this.f = 2;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsg) {
            ajsg ajsg = (ajsg) obj;
            if (aocd.a(this.a, ajsg.a)) {
                apmu apmu = this.b;
                if (apmu == null) {
                    if (ajsg.b != null) {
                        return false;
                    }
                } else if (!apmu.equals(ajsg.b)) {
                    return false;
                }
                apxu apxu = this.c;
                if (apxu == null) {
                    if (ajsg.c != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajsg.c)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajsg.d)) {
                    aphj aphj = this.e;
                    if (aphj == null) {
                        if (ajsg.e != null) {
                            return false;
                        }
                    } else if (!aphj.equals(ajsg.e)) {
                        return false;
                    }
                    if (this.h == ajsg.h) {
                        apxu = this.g;
                        if (apxu == null) {
                            if (ajsg.g != null) {
                                return false;
                            }
                        } else if (!apxu.equals(ajsg.g)) {
                            return false;
                        }
                        if (this.f == ajsg.f) {
                            aocb aocb = this.unknownFieldData;
                            if (aocb != null && !aocb.b()) {
                                return this.unknownFieldData.equals(ajsg.unknownFieldData);
                            }
                            aocb aocb2 = ajsg.unknownFieldData;
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
        int a = aocd.a(this.a);
        apmu apmu = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = apmu != null ? apmu.hashCode() : 0;
        apxu apxu = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.d);
        aphj aphj = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (aphj != null ? aphj.hashCode() : 0)) * 31;
        hashCode2 = this.h;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        apxu = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        hashCode2 = this.f;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        ajsf[] ajsfArr = this.a;
        if (ajsfArr != null && ajsfArr.length > 0) {
            i = 0;
            while (true) {
                ajsf[] ajsfArr2 = this.a;
                if (i >= ajsfArr2.length) {
                    break;
                }
                aocf aocf = ajsfArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(5, this.d);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        i = this.h;
        if (!(i == 1 || i == 0)) {
            aoby.a(7, i - 1);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(8, anze);
        }
        i = this.f;
        if (!(i == 2 || i == 0)) {
            aoby.a(9, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        ajsf[] ajsfArr = this.a;
        if (ajsfArr != null && ajsfArr.length > 0) {
            i = 0;
            while (true) {
                ajsf[] ajsfArr2 = this.a;
                if (i >= ajsfArr2.length) {
                    break;
                }
                aocf aocf = ajsfArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(5, this.d);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        i = this.h;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(7, i - 1);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        i = this.f;
        return (i == 2 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(9, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            }
            int i = 0;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            int i2;
            int f;
            if (a == 10) {
                aocf ajsf;
                a = aock.a(aobv, 10);
                ajsf[] ajsfArr = this.a;
                int length = ajsfArr != null ? ajsfArr.length : 0;
                ajsf[] ajsfArr2 = new ajsf[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajsfArr, 0, ajsfArr2, 0, length);
                }
                while (length < ajsfArr2.length - 1) {
                    ajsf = new ajsf();
                    ajsfArr2[length] = ajsf;
                    aobv.a(ajsf);
                    aobv.a();
                    length++;
                }
                ajsf = new ajsf();
                ajsfArr2[length] = ajsf;
                aobv.a(ajsf);
                this.a = ajsfArr2;
            } else if (a == 18) {
                apmu apmu = (apmu) aobv.a(apmu.c.getParserForType());
                apmu apmu2 = this.b;
                if (apmu2 != null) {
                    apmx apmx = (apmx) ((anxo) apmu2.toBuilder());
                    apmx.mergeFrom(apmu);
                    apmu = (apmu) ((anxl) apmx.build());
                }
                this.b = apmu;
            } else if (a == 26) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.c;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.c = apxu;
            } else if (a == 42) {
                this.d = aobv.e();
            } else if (a == 50) {
                aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                aphj aphj2 = this.e;
                if (aphj2 != null) {
                    aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                    aphm.mergeFrom(aphj);
                    aphj = (aphj) ((anxl) aphm.build());
                }
                this.e = aphj;
            } else if (a == 56) {
                i2 = aobv.b;
                f = aobv.f();
                if (f == 0 || f == 1) {
                    if (f == 0) {
                        i = 1;
                    } else if (f == 1) {
                        i = 2;
                    }
                    this.h = i;
                } else {
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                }
            } else if (a == 66) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.g;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.g = apxu;
            } else if (a == 72) {
                i2 = aobv.b;
                f = aobv.f();
                if (f == 0 || f == 1 || f == 2 || f == 3) {
                    if (f == 0) {
                        i = 1;
                    } else if (f == 1) {
                        i = 2;
                    } else if (f == 2) {
                        i = 3;
                    } else if (f == 3) {
                        i = 4;
                    }
                    this.f = i;
                } else {
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                }
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
