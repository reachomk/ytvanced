package defpackage;

/* renamed from: ajsa */
public final class ajsa extends aoca {
    public static volatile ajsa[] a;
    public ajwn b;
    public aqto c;

    public ajsa() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajsa)) {
            return false;
        }
        ajsa ajsa = (ajsa) obj;
        ajwn ajwn = this.b;
        if (ajwn == null) {
            if (ajsa.b != null) {
                return false;
            }
        } else if (!ajwn.equals(ajsa.b)) {
            return false;
        }
        aqto aqto = this.c;
        if (aqto == null) {
            if (ajsa.c != null) {
                return false;
            }
        } else if (!aqto.equals(ajsa.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajsa.unknownFieldData);
        }
        aocb aocb2 = ajsa.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajwn ajwn = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajwn != null ? ajwn.hashCode() : 0;
        aqto aqto = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (aqto != null ? aqto.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(86135402, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(144881215, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(86135402, aocf);
        }
        anze anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(144881215, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 689083218) {
                if (this.b == null) {
                    this.b = new ajwn();
                }
                aobv.a(this.b);
            } else if (a == 1159049722) {
                aqto aqto = (aqto) aobv.a(aqto.v.getParserForType());
                aqto aqto2 = this.c;
                if (aqto2 != null) {
                    aqtr aqtr = (aqtr) ((anxo) aqto2.toBuilder());
                    aqtr.mergeFrom(aqto);
                    aqto = (aqto) ((anxl) aqtr.build());
                }
                this.c = aqto;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
