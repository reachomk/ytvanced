package defpackage;

/* renamed from: ajro */
public final class ajro extends aoca {
    public aqyh a;
    public awmk b;

    public ajro() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajro)) {
            return false;
        }
        ajro ajro = (ajro) obj;
        aqyh aqyh = this.a;
        if (aqyh == null) {
            if (ajro.a != null) {
                return false;
            }
        } else if (!aqyh.equals(ajro.a)) {
            return false;
        }
        awmk awmk = this.b;
        if (awmk == null) {
            if (ajro.b != null) {
                return false;
            }
        } else if (!awmk.equals(ajro.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajro.unknownFieldData);
        }
        aocb aocb2 = ajro.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqyh aqyh = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqyh != null ? aqyh.hashCode() : 0;
        awmk awmk = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (awmk != null ? awmk.hashCode() : 0)) * 31;
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
        anze = this.b;
        if (anze != null) {
            aoby.a(236004500, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(71102045, anze);
        }
        anze = this.b;
        return anze != null ? computeSerializedSize + anwm.c(236004500, anze) : computeSerializedSize;
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
            } else if (a == 1888036002) {
                awmk awmk = (awmk) aobv.a(awmk.c.getParserForType());
                awmk awmk2 = this.b;
                if (awmk2 != null) {
                    awmn awmn = (awmn) ((anxo) awmk2.toBuilder());
                    awmn.mergeFrom(awmk);
                    awmk = (awmk) ((anxl) awmn.build());
                }
                this.b = awmk;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
