package defpackage;

/* renamed from: bdha */
public final class bdha extends aoca {
    public static final aobz a = aobz.a(bdha.class, 1535386018);
    public bdgf b;
    public bdgf c;
    public azsr d;
    public azsr e;
    public azsr f;
    public azsr g;
    public boolean h;

    public bdha() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdha) {
            bdha bdha = (bdha) obj;
            bdgf bdgf = this.b;
            if (bdgf == null) {
                if (bdha.b != null) {
                    return false;
                }
            } else if (!bdgf.equals(bdha.b)) {
                return false;
            }
            bdgf = this.c;
            if (bdgf == null) {
                if (bdha.c != null) {
                    return false;
                }
            } else if (!bdgf.equals(bdha.c)) {
                return false;
            }
            azsr azsr = this.d;
            if (azsr == null) {
                if (bdha.d != null) {
                    return false;
                }
            } else if (!azsr.equals(bdha.d)) {
                return false;
            }
            azsr = this.e;
            if (azsr == null) {
                if (bdha.e != null) {
                    return false;
                }
            } else if (!azsr.equals(bdha.e)) {
                return false;
            }
            azsr = this.f;
            if (azsr == null) {
                if (bdha.f != null) {
                    return false;
                }
            } else if (!azsr.equals(bdha.f)) {
                return false;
            }
            azsr = this.g;
            if (azsr == null) {
                if (bdha.g != null) {
                    return false;
                }
            } else if (!azsr.equals(bdha.g)) {
                return false;
            }
            if (this.h == bdha.h) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdha.unknownFieldData);
                }
                aocb aocb2 = bdha.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdgf bdgf = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdgf != null ? bdgf.hashCode() : 0;
        bdgf bdgf2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdgf2 != null ? bdgf2.hashCode() : 0;
        azsr azsr = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azsr != null ? azsr.hashCode() : 0;
        azsr = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azsr != null ? azsr.hashCode() : 0;
        azsr = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azsr != null ? azsr.hashCode() : 0;
        azsr = this.g;
        hashCode = (((((hashCode + hashCode2) * 31) + (azsr != null ? azsr.hashCode() : 0)) * 31) + (!this.h ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze anze = this.d;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(6, anze);
        }
        if (this.h) {
            aoby.a(7, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        return this.h ? computeSerializedSize + aoby.d(7) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            azsr azsr;
            azsr azsr2;
            azsq azsq;
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.b == null) {
                    this.b = new bdgf();
                }
                aobv.a(this.b);
            } else if (a == 18) {
                if (this.c == null) {
                    this.c = new bdgf();
                }
                aobv.a(this.c);
            } else if (a == 26) {
                azsr = (azsr) aobv.a(azsr.a.getParserForType());
                azsr2 = this.d;
                if (azsr2 != null) {
                    azsq = (azsq) ((anxo) azsr2.toBuilder());
                    azsq.mergeFrom(azsr);
                    azsr = (azsr) ((anxl) azsq.build());
                }
                this.d = azsr;
            } else if (a == 34) {
                azsr = (azsr) aobv.a(azsr.a.getParserForType());
                azsr2 = this.e;
                if (azsr2 != null) {
                    azsq = (azsq) ((anxo) azsr2.toBuilder());
                    azsq.mergeFrom(azsr);
                    azsr = (azsr) ((anxl) azsq.build());
                }
                this.e = azsr;
            } else if (a == 42) {
                azsr = (azsr) aobv.a(azsr.a.getParserForType());
                azsr2 = this.f;
                if (azsr2 != null) {
                    azsq = (azsq) ((anxo) azsr2.toBuilder());
                    azsq.mergeFrom(azsr);
                    azsr = (azsr) ((anxl) azsq.build());
                }
                this.f = azsr;
            } else if (a == 50) {
                azsr = (azsr) aobv.a(azsr.a.getParserForType());
                azsr2 = this.g;
                if (azsr2 != null) {
                    azsq = (azsq) ((anxo) azsr2.toBuilder());
                    azsq.mergeFrom(azsr);
                    azsr = (azsr) ((anxl) azsq.build());
                }
                this.g = azsr;
            } else if (a == 56) {
                this.h = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
