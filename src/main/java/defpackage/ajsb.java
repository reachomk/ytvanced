package defpackage;

/* renamed from: ajsb */
public final class ajsb extends aoca {
    public aqhy a;
    public ajsc b;

    public ajsb() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajsb)) {
            return false;
        }
        ajsb ajsb = (ajsb) obj;
        aqhy aqhy = this.a;
        if (aqhy == null) {
            if (ajsb.a != null) {
                return false;
            }
        } else if (!aqhy.equals(ajsb.a)) {
            return false;
        }
        ajsc ajsc = this.b;
        if (ajsc == null) {
            if (ajsb.b != null) {
                return false;
            }
        } else if (!ajsc.equals(ajsb.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajsb.unknownFieldData);
        }
        aocb aocb2 = ajsb.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqhy aqhy = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqhy != null ? aqhy.hashCode() : 0;
        ajsc ajsc = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (ajsc != null ? ajsc.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(64099105, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(79964994, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(64099105, anze);
        }
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(79964994, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 512792842) {
                aqhy aqhy = (aqhy) aobv.a(aqhy.q.getParserForType());
                aqhy aqhy2 = this.a;
                if (aqhy2 != null) {
                    aqhx aqhx = (aqhx) ((anxo) aqhy2.toBuilder());
                    aqhx.mergeFrom(aqhy);
                    aqhy = (aqhy) ((anxl) aqhx.build());
                }
                this.a = aqhy;
            } else if (a == 639719954) {
                if (this.b == null) {
                    this.b = new ajsc();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
