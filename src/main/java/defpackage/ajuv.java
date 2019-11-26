package defpackage;

/* renamed from: ajuv */
public final class ajuv extends aoca {
    public ajsb a;
    public apxu b;

    public ajuv() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajuv)) {
            return false;
        }
        ajuv ajuv = (ajuv) obj;
        ajsb ajsb = this.a;
        if (ajsb == null) {
            if (ajuv.a != null) {
                return false;
            }
        } else if (!ajsb.equals(ajuv.a)) {
            return false;
        }
        apxu apxu = this.b;
        if (apxu == null) {
            if (ajuv.b != null) {
                return false;
            }
        } else if (!apxu.equals(ajuv.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajuv.unknownFieldData);
        }
        aocb aocb2 = ajuv.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajsb ajsb = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajsb != null ? ajsb.hashCode() : 0;
        apxu apxu = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(4, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze anze = this.b;
        return anze != null ? computeSerializedSize + anwm.c(4, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajsb();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.b;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.b = apxu;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
