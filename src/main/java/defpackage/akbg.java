package defpackage;

import java.util.Arrays;

/* renamed from: akbg */
public final class akbg extends ajwo {
    public arml a;
    public aygk b;
    public boolean c = false;
    public String d;
    public byte[] e;
    public ayif[] f;
    private String g;
    private apxu h;
    private apxu i;

    public akbg() {
        super(46637760);
        String str = "";
        this.d = str;
        this.e = aock.c;
        this.f = new ayif[0];
        this.g = str;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbg) {
            akbg akbg = (akbg) obj;
            arml arml = this.a;
            if (arml == null) {
                if (akbg.a != null) {
                    return false;
                }
            } else if (!arml.equals(akbg.a)) {
                return false;
            }
            aygk aygk = this.b;
            if (aygk == null) {
                if (akbg.b != null) {
                    return false;
                }
            } else if (!aygk.equals(akbg.b)) {
                return false;
            }
            if (this.c == akbg.c) {
                String str = this.d;
                if (str == null) {
                    if (akbg.d != null) {
                        return false;
                    }
                } else if (!str.equals(akbg.d)) {
                    return false;
                }
                if (Arrays.equals(this.e, akbg.e) && aocd.a(this.f, akbg.f)) {
                    str = this.g;
                    if (str == null) {
                        if (akbg.g != null) {
                            return false;
                        }
                    } else if (!str.equals(akbg.g)) {
                        return false;
                    }
                    apxu apxu = this.h;
                    if (apxu == null) {
                        if (akbg.h != null) {
                            return false;
                        }
                    } else if (!apxu.equals(akbg.h)) {
                        return false;
                    }
                    apxu = this.i;
                    if (apxu == null) {
                        if (akbg.i != null) {
                            return false;
                        }
                    } else if (!apxu.equals(akbg.i)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akbg.unknownFieldData);
                    }
                    aocb aocb2 = akbg.unknownFieldData;
                    return aocb2 == null || aocb2.b();
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
        aygk aygk = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + (aygk != null ? aygk.hashCode() : 0)) * 31) + (!this.c ? 1237 : 1231)) * 31;
        String str = this.d;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.e)) * 31) + aocd.a(this.f)) * 31;
        str = this.g;
        hashCode2 = str != null ? str.hashCode() : 0;
        apxu apxu = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        apxu = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
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
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        if (this.c) {
            aoby.a(3, true);
        }
        String str = this.d;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(4, this.d);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(6, this.e);
        }
        ayif[] ayifArr = this.f;
        if (ayifArr != null && ayifArr.length > 0) {
            int i = 0;
            while (true) {
                ayif[] ayifArr2 = this.f;
                if (i >= ayifArr2.length) {
                    break;
                }
                anze anze2 = ayifArr2[i];
                if (anze2 != null) {
                    aoby.a(7, anze2);
                }
                i++;
            }
        }
        str = this.g;
        if (!(str == null || str.equals(str2))) {
            aoby.a(8, this.g);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(10, anze);
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
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        if (this.c) {
            computeSerializedSize += aoby.d(3);
        }
        String str = this.d;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(4, this.d);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(6, this.e);
        }
        ayif[] ayifArr = this.f;
        if (ayifArr != null && ayifArr.length > 0) {
            int i = 0;
            while (true) {
                ayif[] ayifArr2 = this.f;
                if (i >= ayifArr2.length) {
                    break;
                }
                anze anze2 = ayifArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(7, anze2);
                }
                i++;
            }
        }
        str = this.g;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(8, this.g);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.i;
        return anze != null ? computeSerializedSize + anwm.c(10, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.a;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                aygk aygk2 = this.b;
                if (aygk2 != null) {
                    aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                    aygj.mergeFrom(aygk);
                    aygk = (aygk) ((anxl) aygj.build());
                }
                this.b = aygk;
            } else if (a == 24) {
                this.c = aobv.c();
            } else if (a == 34) {
                this.d = aobv.d();
            } else if (a == 50) {
                this.e = aobv.e();
            } else if (a == 58) {
                a = aock.a(aobv, 58);
                ayif[] ayifArr = this.f;
                int length = ayifArr != null ? ayifArr.length : 0;
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
                this.f = ayifArr2;
            } else if (a == 66) {
                this.g = aobv.d();
            } else if (a == 74) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.h;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.h = apxu;
            } else if (a == 82) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.i;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.i = apxu;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
