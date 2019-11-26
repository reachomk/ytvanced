package defpackage;

/* renamed from: ajrv */
public final class ajrv extends aoca {
    public ajsi a;
    public axwa b;
    public aysr c;

    public ajrv() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrv)) {
            return false;
        }
        ajrv ajrv = (ajrv) obj;
        ajsi ajsi = this.a;
        if (ajsi == null) {
            if (ajrv.a != null) {
                return false;
            }
        } else if (!ajsi.equals(ajrv.a)) {
            return false;
        }
        axwa axwa = this.b;
        if (axwa == null) {
            if (ajrv.b != null) {
                return false;
            }
        } else if (!axwa.equals(ajrv.b)) {
            return false;
        }
        aysr aysr = this.c;
        if (aysr == null) {
            if (ajrv.c != null) {
                return false;
            }
        } else if (!aysr.equals(ajrv.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrv.unknownFieldData);
        }
        aocb aocb2 = ajrv.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajsi ajsi = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajsi != null ? ajsi.hashCode() : 0;
        axwa axwa = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axwa != null ? axwa.hashCode() : 0;
        aysr aysr = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (aysr != null ? aysr.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(51249284, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(55419609, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(63096351, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(51249284, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(55419609, anze);
        }
        anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(63096351, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 409994274) {
                if (this.a == null) {
                    this.a = new ajsi();
                }
                aobv.a(this.a);
            } else if (a == 443356874) {
                axwa axwa = (axwa) aobv.a(axwa.M.getParserForType());
                axwa axwa2 = this.b;
                if (axwa2 != null) {
                    axwd axwd = (axwd) ((anxo) axwa2.toBuilder());
                    axwd.mergeFrom(axwa);
                    axwa = (axwa) ((anxl) axwd.build());
                }
                this.b = axwa;
            } else if (a == 504770810) {
                aysr aysr = (aysr) aobv.a(aysr.e.getParserForType());
                aysr aysr2 = this.c;
                if (aysr2 != null) {
                    aysq aysq = (aysq) ((anxo) aysr2.toBuilder());
                    aysq.mergeFrom(aysr);
                    aysr = (aysr) ((anxl) aysq.build());
                }
                this.c = aysr;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
