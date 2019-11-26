package defpackage;

import java.util.Arrays;

/* renamed from: ajse */
public final class ajse extends ajwo {
    public aygk a;
    public apxu b;
    public byte[] c;
    public aodx d;
    public apms e;
    public arml f;
    public int g;
    private boolean h;
    private String i;

    public ajse() {
        super(48474525);
        this.g = 1;
        this.c = aock.c;
        this.h = false;
        this.i = "";
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajse) {
            ajse ajse = (ajse) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (ajse.a != null) {
                    return false;
                }
            } else if (!aygk.equals(ajse.a)) {
                return false;
            }
            if (this.g == ajse.g) {
                apxu apxu = this.b;
                if (apxu == null) {
                    if (ajse.b != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajse.b)) {
                    return false;
                }
                if (Arrays.equals(this.c, ajse.c)) {
                    aodx aodx = this.d;
                    if (aodx == null) {
                        if (ajse.d != null) {
                            return false;
                        }
                    } else if (!aodx.equals(ajse.d)) {
                        return false;
                    }
                    apms apms = this.e;
                    if (apms == null) {
                        if (ajse.e != null) {
                            return false;
                        }
                    } else if (!apms.equals(ajse.e)) {
                        return false;
                    }
                    arml arml = this.f;
                    if (arml == null) {
                        if (ajse.f != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajse.f)) {
                        return false;
                    }
                    if (this.h == ajse.h) {
                        String str = this.i;
                        if (str == null) {
                            if (ajse.i != null) {
                                return false;
                            }
                        } else if (!str.equals(ajse.i)) {
                            return false;
                        }
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajse.unknownFieldData);
                        }
                        aocb aocb2 = ajse.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aygk aygk = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (aygk != null ? aygk.hashCode() : 0)) * 31;
        int i2 = this.g;
        if (i2 == 0) {
            i2 = 0;
        }
        apxu apxu = this.b;
        hashCode = (hashCode + i2) * 31;
        i2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode2 = Arrays.hashCode(this.c);
        aodx aodx = this.d;
        hashCode = (((hashCode + i2) * 31) + hashCode2) * 31;
        i2 = aodx != null ? aodx.hashCode() : 0;
        apms apms = this.e;
        hashCode = (hashCode + i2) * 31;
        i2 = apms != null ? apms.hashCode() : 0;
        arml arml = this.f;
        hashCode = (((((hashCode + i2) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + (!this.h ? 1237 : 1231)) * 31;
        String str = this.i;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            aoby.a(2, i - 1);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(5, this.c);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(8, anze);
        }
        if (this.h) {
            aoby.a(9, true);
        }
        String str = this.i;
        if (!(str == null || str.equals(""))) {
            aoby.a(10, this.i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(2, i - 1);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(5, this.c);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        if (this.h) {
            computeSerializedSize += aoby.d(9);
        }
        String str = this.i;
        return (str == null || str.equals("")) ? computeSerializedSize : computeSerializedSize + aoby.b(10, this.i);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                aygk aygk2 = this.a;
                if (aygk2 != null) {
                    aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                    aygj.mergeFrom(aygk);
                    aygk = (aygk) ((anxl) aygj.build());
                }
                this.a = aygk;
            } else if (a == 16) {
                int i = aobv.b;
                int f = aobv.f();
                if (f == 0 || f == 1 || f == 2) {
                    this.g = apna.a(f);
                } else {
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                }
            } else if (a == 26) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.b;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.b = apxu;
            } else if (a == 42) {
                this.c = aobv.e();
            } else if (a == 50) {
                aodx aodx = (aodx) aobv.a(aodx.c.getParserForType());
                aodx aodx2 = this.d;
                if (aodx2 != null) {
                    aodz aodz = (aodz) ((anxo) aodx2.toBuilder());
                    aodz.mergeFrom(aodx);
                    aodx = (aodx) ((anxl) aodz.build());
                }
                this.d = aodx;
            } else if (a == 58) {
                apms apms = (apms) aobv.a(apms.c.getParserForType());
                apms apms2 = this.e;
                if (apms2 != null) {
                    apmv apmv = (apmv) ((anxo) apms2.toBuilder());
                    apmv.mergeFrom(apms);
                    apms = (apms) ((anxl) apmv.build());
                }
                this.e = apms;
            } else if (a == 66) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.f;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.f = arml;
            } else if (a == 72) {
                this.h = aobv.c();
            } else if (a == 82) {
                this.i = aobv.d();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
