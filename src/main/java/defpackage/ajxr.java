package defpackage;

/* renamed from: ajxr */
public final class ajxr extends aoca {
    public aoiu a;
    public ajxs b;

    public ajxr() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxr)) {
            return false;
        }
        ajxr ajxr = (ajxr) obj;
        aoiu aoiu = this.a;
        if (aoiu == null) {
            if (ajxr.a != null) {
                return false;
            }
        } else if (!aoiu.equals(ajxr.a)) {
            return false;
        }
        ajxs ajxs = this.b;
        if (ajxs == null) {
            if (ajxr.b != null) {
                return false;
            }
        } else if (!ajxs.equals(ajxr.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxr.unknownFieldData);
        }
        aocb aocb2 = ajxr.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aoiu aoiu = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aoiu != null ? aoiu.hashCode() : 0;
        ajxs ajxs = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (ajxs != null ? ajxs.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(62960614, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(78882851, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(62960614, anze);
        }
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(78882851, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 503684914) {
                aoiu aoiu = (aoiu) aobv.a(aoiu.m.getParserForType());
                aoiu aoiu2 = this.a;
                if (aoiu2 != null) {
                    aoit aoit = (aoit) ((anxo) aoiu2.toBuilder());
                    aoit.mergeFrom(aoiu);
                    aoiu = (aoiu) ((anxl) aoit.build());
                }
                this.a = aoiu;
            } else if (a == 631062810) {
                if (this.b == null) {
                    this.b = new ajxs();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
