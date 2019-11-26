package defpackage;

/* renamed from: ajxt */
public final class ajxt extends aoca {
    public aqyh a;

    public ajxt() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxt)) {
            return false;
        }
        ajxt ajxt = (ajxt) obj;
        aqyh aqyh = this.a;
        if (aqyh == null) {
            if (ajxt.a != null) {
                return false;
            }
        } else if (!aqyh.equals(ajxt.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxt.unknownFieldData);
        }
        aocb aocb2 = ajxt.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqyh aqyh = this.a;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (aqyh != null ? aqyh.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(71102045, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        return anze != null ? computeSerializedSize + anwm.c(71102045, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 568816362) {
                aqyh aqyh = (aqyh) aobv.a(aqyh.d.getParserForType());
                aqyh aqyh2 = this.a;
                if (aqyh2 != null) {
                    aqyg aqyg = (aqyg) ((anxo) aqyh2.toBuilder());
                    aqyg.mergeFrom(aqyh);
                    aqyh = (aqyh) ((anxl) aqyg.build());
                }
                this.a = aqyh;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
