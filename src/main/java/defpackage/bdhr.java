package defpackage;

/* renamed from: bdhr */
public final class bdhr extends aoca {
    public static final aobz a = aobz.a(bdhr.class, 1581064082);
    public azvf b;
    public azvr c;
    public boolean d;
    public boolean e;
    public azsr f;
    public int g;

    public bdhr() {
        this.g = 1;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhr) {
            bdhr bdhr = (bdhr) obj;
            if (this.g == bdhr.g) {
                azvf azvf = this.b;
                if (azvf == null) {
                    if (bdhr.b != null) {
                        return false;
                    }
                } else if (!azvf.equals(bdhr.b)) {
                    return false;
                }
                azvr azvr = this.c;
                if (azvr == null) {
                    if (bdhr.c != null) {
                        return false;
                    }
                } else if (!azvr.equals(bdhr.c)) {
                    return false;
                }
                if (this.d == bdhr.d && this.e == bdhr.e) {
                    azsr azsr = this.f;
                    if (azsr == null) {
                        if (bdhr.f != null) {
                            return false;
                        }
                    } else if (!azsr.equals(bdhr.f)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(bdhr.unknownFieldData);
                    }
                    aocb aocb2 = bdhr.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int i = this.g;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        azvf azvf = this.b;
        hashCode = (hashCode + i) * 31;
        i = azvf != null ? azvf.hashCode() : 0;
        azvr azvr = this.c;
        hashCode = (((hashCode + i) * 31) + (azvr != null ? azvr.hashCode() : 0)) * 31;
        int i3 = 1237;
        hashCode = (hashCode + (!this.d ? 1237 : 1231)) * 31;
        if (this.e) {
            i3 = 1231;
        }
        azsr azsr = this.f;
        hashCode = (((hashCode + i3) * 31) + (azsr != null ? azsr.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            aoby.a(1, i - 1);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        if (this.d) {
            aoby.a(4, true);
        }
        if (this.e) {
            aoby.a(5, true);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.g;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(1, i - 1);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        if (this.d) {
            computeSerializedSize += aoby.d(4);
        }
        if (this.e) {
            computeSerializedSize += aoby.d(5);
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(6, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 8) {
                int i = aobv.b;
                int f = aobv.f();
                int i2 = 2;
                if (f == 0 || f == 1 || f == 2) {
                    if (f == 0) {
                        i2 = 1;
                    } else if (f != 1) {
                        i2 = f != 2 ? 0 : 3;
                    }
                    this.g = i2;
                } else {
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                }
            } else if (a == 18) {
                azvf azvf = (azvf) aobv.a(azvf.d.getParserForType());
                azvf azvf2 = this.b;
                if (azvf2 != null) {
                    azve azve = (azve) ((anxo) azvf2.toBuilder());
                    azve.mergeFrom(azvf);
                    azvf = (azvf) ((anxl) azve.build());
                }
                this.b = azvf;
            } else if (a == 26) {
                azvr azvr = (azvr) aobv.a(azvr.d.getParserForType());
                azvr azvr2 = this.c;
                if (azvr2 != null) {
                    azvq azvq = (azvq) ((anxo) azvr2.toBuilder());
                    azvq.mergeFrom(azvr);
                    azvr = (azvr) ((anxl) azvq.build());
                }
                this.c = azvr;
            } else if (a == 32) {
                this.d = aobv.c();
            } else if (a == 40) {
                this.e = aobv.c();
            } else if (a == 50) {
                azsr azsr = (azsr) aobv.a(azsr.a.getParserForType());
                azsr azsr2 = this.f;
                if (azsr2 != null) {
                    azsq azsq = (azsq) ((anxo) azsr2.toBuilder());
                    azsq.mergeFrom(azsr);
                    azsr = (azsr) ((anxl) azsq.build());
                }
                this.f = azsr;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
