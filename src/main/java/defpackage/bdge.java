package defpackage;

/* renamed from: bdge */
public final class bdge extends aoca {
    public static volatile bdge[] a;
    public int b;
    public int c;
    public azsr d;
    public azsr e;
    private azst f;
    private azst g;

    public bdge() {
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdge) {
            bdge bdge = (bdge) obj;
            if (this.b == bdge.b && this.c == bdge.c) {
                azsr azsr = this.d;
                if (azsr == null) {
                    if (bdge.d != null) {
                        return false;
                    }
                } else if (!azsr.equals(bdge.d)) {
                    return false;
                }
                azsr = this.e;
                if (azsr == null) {
                    if (bdge.e != null) {
                        return false;
                    }
                } else if (!azsr.equals(bdge.e)) {
                    return false;
                }
                azst azst = this.f;
                if (azst == null) {
                    if (bdge.f != null) {
                        return false;
                    }
                } else if (!azst.equals(bdge.f)) {
                    return false;
                }
                azst = this.g;
                if (azst == null) {
                    if (bdge.g != null) {
                        return false;
                    }
                } else if (!azst.equals(bdge.g)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdge.unknownFieldData);
                }
                aocb aocb2 = bdge.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int i = this.b;
        int i2 = this.c;
        azsr azsr = this.d;
        hashCode = (((((hashCode + 527) * 31) + i) * 31) + i2) * 31;
        i = 0;
        i2 = azsr != null ? azsr.hashCode() : 0;
        azsr = this.e;
        hashCode = (hashCode + i2) * 31;
        i2 = azsr != null ? azsr.hashCode() : 0;
        azst azst = this.f;
        hashCode = (hashCode + i2) * 31;
        i2 = azst != null ? azst.hashCode() : 0;
        azst = this.g;
        hashCode = (((hashCode + i2) * 31) + (azst != null ? azst.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i = this.b;
        if (i != 0) {
            aoby.b(1, i);
        }
        i = this.c;
        if (i != 0) {
            aoby.b(2, i);
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
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.d(1, i);
        }
        i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.d(2, i);
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
        return anze != null ? computeSerializedSize + anwm.c(6, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            azsr azsr;
            azsr azsr2;
            azsq azsq;
            azst azst;
            azst azst2;
            azss azss;
            if (a == 0) {
                break;
            } else if (a == 8) {
                this.b = aobv.f();
            } else if (a == 16) {
                this.c = aobv.f();
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
                azst = (azst) aobv.a(azst.a.getParserForType());
                azst2 = this.f;
                if (azst2 != null) {
                    azss = (azss) ((anxo) azst2.toBuilder());
                    azss.mergeFrom(azst);
                    azst = (azst) ((anxl) azss.build());
                }
                this.f = azst;
            } else if (a == 50) {
                azst = (azst) aobv.a(azst.a.getParserForType());
                azst2 = this.g;
                if (azst2 != null) {
                    azss = (azss) ((anxo) azst2.toBuilder());
                    azss.mergeFrom(azst);
                    azst = (azst) ((anxl) azss.build());
                }
                this.g = azst;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
