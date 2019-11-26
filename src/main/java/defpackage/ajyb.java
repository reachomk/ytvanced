package defpackage;

/* renamed from: ajyb */
public final class ajyb extends ajwo {
    public awkj a;
    public awkj b;
    public akau c;
    public awkv d;
    private arml e;

    public ajyb() {
        super(91347533);
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajyb)) {
            return false;
        }
        ajyb ajyb = (ajyb) obj;
        arml arml = this.e;
        if (arml == null) {
            if (ajyb.e != null) {
                return false;
            }
        } else if (!arml.equals(ajyb.e)) {
            return false;
        }
        awkj awkj = this.a;
        if (awkj == null) {
            if (ajyb.a != null) {
                return false;
            }
        } else if (!awkj.equals(ajyb.a)) {
            return false;
        }
        awkj = this.b;
        if (awkj == null) {
            if (ajyb.b != null) {
                return false;
            }
        } else if (!awkj.equals(ajyb.b)) {
            return false;
        }
        akau akau = this.c;
        if (akau == null) {
            if (ajyb.c != null) {
                return false;
            }
        } else if (!akau.equals(ajyb.c)) {
            return false;
        }
        awkv awkv = this.d;
        if (awkv == null) {
            if (ajyb.d != null) {
                return false;
            }
        } else if (!awkv.equals(ajyb.d)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajyb.unknownFieldData);
        }
        aocb aocb2 = ajyb.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.e;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        awkj awkj = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awkj != null ? awkj.hashCode() : 0;
        awkj = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awkj != null ? awkj.hashCode() : 0;
        akau akau = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akau != null ? akau.hashCode() : 0;
        awkv awkv = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (awkv != null ? awkv.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.e;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(3, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        anze = this.d;
        return anze != null ? computeSerializedSize + anwm.c(5, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            awkj awkj;
            awkj awkj2;
            awki awki;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.e;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.e = arml;
            } else if (a == 18) {
                awkj = (awkj) aobv.a(awkj.c.getParserForType());
                awkj2 = this.a;
                if (awkj2 != null) {
                    awki = (awki) ((anxo) awkj2.toBuilder());
                    awki.mergeFrom(awkj);
                    awkj = (awkj) ((anxl) awki.build());
                }
                this.a = awkj;
            } else if (a == 26) {
                awkj = (awkj) aobv.a(awkj.c.getParserForType());
                awkj2 = this.b;
                if (awkj2 != null) {
                    awki = (awki) ((anxo) awkj2.toBuilder());
                    awki.mergeFrom(awkj);
                    awkj = (awkj) ((anxl) awki.build());
                }
                this.b = awkj;
            } else if (a == 34) {
                if (this.c == null) {
                    this.c = new akau();
                }
                aobv.a(this.c);
            } else if (a == 42) {
                awkv awkv = (awkv) aobv.a(awkv.d.getParserForType());
                awkv awkv2 = this.d;
                if (awkv2 != null) {
                    awku awku = (awku) ((anxo) awkv2.toBuilder());
                    awku.mergeFrom(awkv);
                    awkv = (awkv) ((anxl) awku.build());
                }
                this.d = awkv;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
