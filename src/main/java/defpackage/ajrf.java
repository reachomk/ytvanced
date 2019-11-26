package defpackage;

/* renamed from: ajrf */
public final class ajrf extends aoca {
    public static volatile ajrf[] a;
    public aofb b;

    public ajrf() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrf)) {
            return false;
        }
        ajrf ajrf = (ajrf) obj;
        aofb aofb = this.b;
        if (aofb == null) {
            if (ajrf.b != null) {
                return false;
            }
        } else if (!aofb.equals(ajrf.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrf.unknownFieldData);
        }
        aocb aocb2 = ajrf.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aofb aofb = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (aofb != null ? aofb.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(77108254, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        return anze != null ? computeSerializedSize + anwm.c(77108254, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 616866034) {
                aofb aofb = (aofb) aobv.a(aofb.c.getParserForType());
                aofb aofb2 = this.b;
                if (aofb2 != null) {
                    aofe aofe = (aofe) ((anxo) aofb2.toBuilder());
                    aofe.mergeFrom(aofb);
                    aofb = (aofb) ((anxl) aofe.build());
                }
                this.b = aofb;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
