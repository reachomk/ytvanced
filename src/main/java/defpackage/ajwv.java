package defpackage;

/* renamed from: ajwv */
public final class ajwv extends aoca {
    public auwl a;
    public aufd b;
    public ajxc c;

    public ajwv() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajwv)) {
            return false;
        }
        ajwv ajwv = (ajwv) obj;
        auwl auwl = this.a;
        if (auwl == null) {
            if (ajwv.a != null) {
                return false;
            }
        } else if (!auwl.equals(ajwv.a)) {
            return false;
        }
        aufd aufd = this.b;
        if (aufd == null) {
            if (ajwv.b != null) {
                return false;
            }
        } else if (!aufd.equals(ajwv.b)) {
            return false;
        }
        ajxc ajxc = this.c;
        if (ajxc == null) {
            if (ajwv.c != null) {
                return false;
            }
        } else if (!ajxc.equals(ajwv.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajwv.unknownFieldData);
        }
        aocb aocb2 = ajwv.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        auwl auwl = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = auwl != null ? auwl.hashCode() : 0;
        aufd aufd = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aufd != null ? aufd.hashCode() : 0;
        ajxc ajxc = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (ajxc != null ? ajxc.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(58508690, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(121323709, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(132498670, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(58508690, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(121323709, anze);
        }
        aocf aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(132498670, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 468069522) {
                auwl auwl = (auwl) aobv.a(auwl.i.getParserForType());
                auwl auwl2 = this.a;
                if (auwl2 != null) {
                    auwk auwk = (auwk) ((anxo) auwl2.toBuilder());
                    auwk.mergeFrom(auwl);
                    auwl = (auwl) ((anxl) auwk.build());
                }
                this.a = auwl;
            } else if (a == 970589674) {
                aufd aufd = (aufd) aobv.a(aufd.h.getParserForType());
                aufd aufd2 = this.b;
                if (aufd2 != null) {
                    aufg aufg = (aufg) ((anxo) aufd2.toBuilder());
                    aufg.mergeFrom(aufd);
                    aufd = (aufd) ((anxl) aufg.build());
                }
                this.b = aufd;
            } else if (a == 1059989362) {
                if (this.c == null) {
                    this.c = new ajxc();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
