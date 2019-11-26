package defpackage;

/* renamed from: ajud */
public final class ajud extends ajwo {
    public ajug a;
    private arml b;
    private String c;
    private boolean d;

    public ajud() {
        super(80162164);
        this.c = "";
        this.a = null;
        this.d = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajud) {
            ajud ajud = (ajud) obj;
            arml arml = this.b;
            if (arml == null) {
                if (ajud.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajud.b)) {
                return false;
            }
            String str = this.c;
            if (str == null) {
                if (ajud.c != null) {
                    return false;
                }
            } else if (!str.equals(ajud.c)) {
                return false;
            }
            ajug ajug = this.a;
            if (ajug == null) {
                if (ajud.a != null) {
                    return false;
                }
            } else if (!ajug.equals(ajud.a)) {
                return false;
            }
            if (this.d == ajud.d) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajud.unknownFieldData);
                }
                aocb aocb2 = ajud.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.b;
        int i = 0;
        hashCode = (((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31;
        String str = this.c;
        int hashCode2 = str != null ? str.hashCode() : 0;
        ajug ajug = this.a;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajug != null ? ajug.hashCode() : 0)) * 31) + (!this.d ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(1, anze);
        }
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            aoby.a(2, this.c);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        if (this.d) {
            aoby.a(4, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        String str = this.c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(2, this.c);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        return this.d ? computeSerializedSize + aoby.d(4) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.b;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.b = arml;
            } else if (a == 18) {
                this.c = aobv.d();
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new ajug();
                }
                aobv.a(this.a);
            } else if (a == 32) {
                this.d = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
