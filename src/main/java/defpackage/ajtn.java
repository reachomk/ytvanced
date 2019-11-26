package defpackage;

/* renamed from: ajtn */
public final class ajtn extends aoca {
    public ajxa a;
    private aqlr b;

    public ajtn() {
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtn)) {
            return false;
        }
        ajtn ajtn = (ajtn) obj;
        aqlr aqlr = this.b;
        if (aqlr == null) {
            if (ajtn.b != null) {
                return false;
            }
        } else if (!aqlr.equals(ajtn.b)) {
            return false;
        }
        ajxa ajxa = this.a;
        if (ajxa == null) {
            if (ajtn.a != null) {
                return false;
            }
        } else if (!ajxa.equals(ajtn.a)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtn.unknownFieldData);
        }
        aocb aocb2 = ajtn.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqlr aqlr = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqlr != null ? aqlr.hashCode() : 0;
        ajxa ajxa = this.a;
        hashCode = (((hashCode + hashCode2) * 31) + (ajxa != null ? ajxa.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(74886276, anze);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(117294427, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(74886276, anze);
        }
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(117294427, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 599090210) {
                aqlr aqlr = (aqlr) aobv.a(aqlr.d.getParserForType());
                aqlr aqlr2 = this.b;
                if (aqlr2 != null) {
                    aqlq aqlq = (aqlq) ((anxo) aqlr2.toBuilder());
                    aqlq.mergeFrom(aqlr);
                    aqlr = (aqlr) ((anxl) aqlq.build());
                }
                this.b = aqlr;
            } else if (a == 938355418) {
                if (this.a == null) {
                    this.a = new ajxa();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
