package defpackage;

/* renamed from: ajvh */
public final class ajvh extends aoca {
    private auit a;
    private auin b;
    private ajxb c;

    public ajvh() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajvh)) {
            return false;
        }
        ajvh ajvh = (ajvh) obj;
        auit auit = this.a;
        if (auit == null) {
            if (ajvh.a != null) {
                return false;
            }
        } else if (!auit.equals(ajvh.a)) {
            return false;
        }
        auin auin = this.b;
        if (auin == null) {
            if (ajvh.b != null) {
                return false;
            }
        } else if (!auin.equals(ajvh.b)) {
            return false;
        }
        ajxb ajxb = this.c;
        if (ajxb == null) {
            if (ajvh.c != null) {
                return false;
            }
        } else if (!ajxb.equals(ajvh.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajvh.unknownFieldData);
        }
        aocb aocb2 = ajvh.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        auit auit = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = auit != null ? auit.hashCode() : 0;
        auin auin = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auin != null ? auin.hashCode() : 0;
        ajxb ajxb = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (ajxb != null ? ajxb.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(4, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        aocf aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(5, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                auit auit = (auit) aobv.a(auit.d.getParserForType());
                auit auit2 = this.a;
                if (auit2 != null) {
                    auiw auiw = (auiw) ((anxo) auit2.toBuilder());
                    auiw.mergeFrom(auit);
                    auit = (auit) ((anxl) auiw.build());
                }
                this.a = auit;
            } else if (a == 34) {
                auin auin = (auin) aobv.a(auin.c.getParserForType());
                auin auin2 = this.b;
                if (auin2 != null) {
                    auiq auiq = (auiq) ((anxo) auin2.toBuilder());
                    auiq.mergeFrom(auin);
                    auin = (auin) ((anxl) auiq.build());
                }
                this.b = auin;
            } else if (a == 42) {
                if (this.c == null) {
                    this.c = new ajxb();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
