package defpackage;

import java.util.Arrays;

/* renamed from: ajzq */
public final class ajzq extends aoca {
    public ajzs a;
    public ajxu b;
    public apxu c;
    public apxu d;
    public byte[] e;
    public int f;
    private String g;
    private awxz h;

    public ajzq() {
        this.a = null;
        this.b = null;
        this.f = 1;
        this.g = "";
        this.e = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzq) {
            ajzq ajzq = (ajzq) obj;
            ajzs ajzs = this.a;
            if (ajzs == null) {
                if (ajzq.a != null) {
                    return false;
                }
            } else if (!ajzs.equals(ajzq.a)) {
                return false;
            }
            ajxu ajxu = this.b;
            if (ajxu == null) {
                if (ajzq.b != null) {
                    return false;
                }
            } else if (!ajxu.equals(ajzq.b)) {
                return false;
            }
            apxu apxu = this.c;
            if (apxu == null) {
                if (ajzq.c != null) {
                    return false;
                }
            } else if (!apxu.equals(ajzq.c)) {
                return false;
            }
            apxu = this.d;
            if (apxu == null) {
                if (ajzq.d != null) {
                    return false;
                }
            } else if (!apxu.equals(ajzq.d)) {
                return false;
            }
            if (this.f == ajzq.f) {
                String str = this.g;
                if (str == null) {
                    if (ajzq.g != null) {
                        return false;
                    }
                } else if (!str.equals(ajzq.g)) {
                    return false;
                }
                if (Arrays.equals(this.e, ajzq.e)) {
                    awxz awxz = this.h;
                    if (awxz == null) {
                        if (ajzq.h != null) {
                            return false;
                        }
                    } else if (!awxz.equals(ajzq.h)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajzq.unknownFieldData);
                    }
                    aocb aocb2 = ajzq.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzs ajzs = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajzs != null ? ajzs.hashCode() : 0;
        ajxu ajxu = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajxu != null ? ajxu.hashCode() : 0;
        apxu apxu = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        apxu = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        hashCode2 = this.f;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        String str = this.g;
        hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.e);
        awxz awxz = this.h;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (awxz != null ? awxz.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(6, anze);
        }
        int i = this.f;
        if (!(i == 1 || i == 0)) {
            aoby.a(7, i - 1);
        }
        String str = this.g;
        if (!(str == null || str.equals(""))) {
            aoby.a(8, this.g);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(10, this.e);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(11, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        int i = this.f;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(7, i - 1);
        }
        String str = this.g;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(8, this.g);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(10, this.e);
        }
        anze = this.h;
        return anze != null ? computeSerializedSize + anwm.c(11, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            if (a == 0) {
                break;
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new ajzs();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                if (this.b == null) {
                    this.b = new ajxu();
                }
                aobv.a(this.b);
            } else if (a == 42) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.c;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.c = apxu;
            } else if (a == 50) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.d;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.d = apxu;
            } else if (a == 56) {
                int i = aobv.b;
                int f = aobv.f();
                int i2 = 5;
                if (f == 0 || f == 1 || f == 2 || f == 3 || f == 4 || f == 5) {
                    if (f == 0) {
                        i2 = 1;
                    } else if (f == 1) {
                        i2 = 2;
                    } else if (f == 2) {
                        i2 = 3;
                    } else if (f == 3) {
                        i2 = 4;
                    } else if (f != 4) {
                        i2 = f != 5 ? 0 : 6;
                    }
                    this.f = i2;
                } else {
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                }
            } else if (a == 66) {
                this.g = aobv.d();
            } else if (a == 82) {
                this.e = aobv.e();
            } else if (a == 90) {
                awxz awxz = (awxz) aobv.a(awxz.f.getParserForType());
                awxz awxz2 = this.h;
                if (awxz2 != null) {
                    awyc awyc = (awyc) ((anxo) awxz2.toBuilder());
                    awyc.mergeFrom(awxz);
                    awxz = (awxz) ((anxl) awyc.build());
                }
                this.h = awxz;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
