package defpackage;

/* renamed from: ajrh */
public final class ajrh extends aoca {
    public ajst a;
    public awly b;
    private aphv c;
    private ajsw d;

    public ajrh() {
        this.a = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrh)) {
            return false;
        }
        ajrh ajrh = (ajrh) obj;
        ajst ajst = this.a;
        if (ajst == null) {
            if (ajrh.a != null) {
                return false;
            }
        } else if (!ajst.equals(ajrh.a)) {
            return false;
        }
        aphv aphv = this.c;
        if (aphv == null) {
            if (ajrh.c != null) {
                return false;
            }
        } else if (!aphv.equals(ajrh.c)) {
            return false;
        }
        awly awly = this.b;
        if (awly == null) {
            if (ajrh.b != null) {
                return false;
            }
        } else if (!awly.equals(ajrh.b)) {
            return false;
        }
        ajsw ajsw = this.d;
        if (ajsw == null) {
            if (ajrh.d != null) {
                return false;
            }
        } else if (!ajsw.equals(ajrh.d)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrh.unknownFieldData);
        }
        aocb aocb2 = ajrh.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajst ajst = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajst != null ? ajst.hashCode() : 0;
        aphv aphv = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphv != null ? aphv.hashCode() : 0;
        awly awly = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awly != null ? awly.hashCode() : 0;
        ajsw ajsw = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (ajsw != null ? ajsw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(62285833, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(79971800, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(99391126, anze);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(105977417, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(62285833, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(79971800, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(99391126, anze);
        }
        aocf = this.d;
        return aocf != null ? computeSerializedSize + aoby.b(105977417, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 498286666) {
                if (this.a == null) {
                    this.a = new ajst();
                }
                aobv.a(this.a);
            } else if (a == 639774402) {
                aphv aphv = (aphv) aobv.a(aphv.s.getParserForType());
                aphv aphv2 = this.c;
                if (aphv2 != null) {
                    aphy aphy = (aphy) ((anxo) aphv2.toBuilder());
                    aphy.mergeFrom(aphv);
                    aphv = (aphv) ((anxl) aphy.build());
                }
                this.c = aphv;
            } else if (a == 795129010) {
                awly awly = (awly) aobv.a(awly.j.getParserForType());
                awly awly2 = this.b;
                if (awly2 != null) {
                    awmb awmb = (awmb) ((anxo) awly2.toBuilder());
                    awmb.mergeFrom(awly);
                    awly = (awly) ((anxl) awmb.build());
                }
                this.b = awly;
            } else if (a == 847819338) {
                if (this.d == null) {
                    this.d = new ajsw();
                }
                aobv.a(this.d);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
