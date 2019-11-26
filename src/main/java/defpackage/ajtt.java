package defpackage;

/* renamed from: ajtt */
public final class ajtt extends ajwo {
    public arml a;
    public ajtw b;
    public aqpl c;

    public ajtt() {
        super(105560617);
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtt)) {
            return false;
        }
        ajtt ajtt = (ajtt) obj;
        arml arml = this.a;
        if (arml == null) {
            if (ajtt.a != null) {
                return false;
            }
        } else if (!arml.equals(ajtt.a)) {
            return false;
        }
        ajtw ajtw = this.b;
        if (ajtw == null) {
            if (ajtt.b != null) {
                return false;
            }
        } else if (!ajtw.equals(ajtt.b)) {
            return false;
        }
        aqpl aqpl = this.c;
        if (aqpl == null) {
            if (ajtt.c != null) {
                return false;
            }
        } else if (!aqpl.equals(ajtt.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtt.unknownFieldData);
        }
        aocb aocb2 = ajtt.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        ajtw ajtw = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtw != null ? ajtw.hashCode() : 0;
        aqpl aqpl = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (aqpl != null ? aqpl.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(3, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.a;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new ajtw();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                aqpl aqpl = (aqpl) aobv.a(aqpl.c.getParserForType());
                aqpl aqpl2 = this.c;
                if (aqpl2 != null) {
                    aqpk aqpk = (aqpk) ((anxo) aqpl2.toBuilder());
                    aqpk.mergeFrom(aqpl);
                    aqpl = (aqpl) ((anxl) aqpk.build());
                }
                this.c = aqpl;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
