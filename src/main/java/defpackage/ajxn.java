package defpackage;

/* renamed from: ajxn */
public final class ajxn extends aoca {
    public static volatile ajxn[] a;
    public ayle b;
    public aoms c;

    public ajxn() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxn)) {
            return false;
        }
        ajxn ajxn = (ajxn) obj;
        ayle ayle = this.b;
        if (ayle == null) {
            if (ajxn.b != null) {
                return false;
            }
        } else if (!ayle.equals(ajxn.b)) {
            return false;
        }
        aoms aoms = this.c;
        if (aoms == null) {
            if (ajxn.c != null) {
                return false;
            }
        } else if (!aoms.equals(ajxn.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxn.unknownFieldData);
        }
        aocb aocb2 = ajxn.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ayle ayle = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ayle != null ? ayle.hashCode() : 0;
        aoms aoms = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (aoms != null ? aoms.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(95066516, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(105643744, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(95066516, anze);
        }
        anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(105643744, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 760532130) {
                ayle ayle = (ayle) aobv.a(ayle.g.getParserForType());
                ayle ayle2 = this.b;
                if (ayle2 != null) {
                    aylh aylh = (aylh) ((anxo) ayle2.toBuilder());
                    aylh.mergeFrom(ayle);
                    ayle = (ayle) ((anxl) aylh.build());
                }
                this.b = ayle;
            } else if (a == 845149954) {
                aoms aoms = (aoms) aobv.a(aoms.d.getParserForType());
                aoms aoms2 = this.c;
                if (aoms2 != null) {
                    aomr aomr = (aomr) ((anxo) aoms2.toBuilder());
                    aomr.mergeFrom(aoms);
                    aoms = (aoms) ((anxl) aomr.build());
                }
                this.c = aoms;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
