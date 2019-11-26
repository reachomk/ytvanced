package defpackage;

/* renamed from: ajws */
public final class ajws extends aoca {
    public atvp a;
    public atvt b;
    public ajsw c;
    public arbs d;
    public atwd e;

    public ajws() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajws)) {
            return false;
        }
        ajws ajws = (ajws) obj;
        atvp atvp = this.a;
        if (atvp == null) {
            if (ajws.a != null) {
                return false;
            }
        } else if (!atvp.equals(ajws.a)) {
            return false;
        }
        atvt atvt = this.b;
        if (atvt == null) {
            if (ajws.b != null) {
                return false;
            }
        } else if (!atvt.equals(ajws.b)) {
            return false;
        }
        ajsw ajsw = this.c;
        if (ajsw == null) {
            if (ajws.c != null) {
                return false;
            }
        } else if (!ajsw.equals(ajws.c)) {
            return false;
        }
        arbs arbs = this.d;
        if (arbs == null) {
            if (ajws.d != null) {
                return false;
            }
        } else if (!arbs.equals(ajws.d)) {
            return false;
        }
        atwd atwd = this.e;
        if (atwd == null) {
            if (ajws.e != null) {
                return false;
            }
        } else if (!atwd.equals(ajws.e)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajws.unknownFieldData);
        }
        aocb aocb2 = ajws.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        atvp atvp = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = atvp != null ? atvp.hashCode() : 0;
        atvt atvt = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atvt != null ? atvt.hashCode() : 0;
        ajsw ajsw = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajsw != null ? ajsw.hashCode() : 0;
        arbs arbs = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arbs != null ? arbs.hashCode() : 0;
        atwd atwd = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (atwd != null ? atwd.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(61393757, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(88941025, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(105977417, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(153515154, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(199213812, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(61393757, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(88941025, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(105977417, aocf);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(153515154, anze);
        }
        anze = this.e;
        return anze != null ? computeSerializedSize + anwm.c(199213812, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 491150058) {
                atvp atvp = (atvp) aobv.a(atvp.j.getParserForType());
                atvp atvp2 = this.a;
                if (atvp2 != null) {
                    atvo atvo = (atvo) ((anxo) atvp2.toBuilder());
                    atvo.mergeFrom(atvp);
                    atvp = (atvp) ((anxl) atvo.build());
                }
                this.a = atvp;
            } else if (a == 711528202) {
                atvt atvt = (atvt) aobv.a(atvt.e.getParserForType());
                atvt atvt2 = this.b;
                if (atvt2 != null) {
                    atvs atvs = (atvs) ((anxo) atvt2.toBuilder());
                    atvs.mergeFrom(atvt);
                    atvt = (atvt) ((anxl) atvs.build());
                }
                this.b = atvt;
            } else if (a == 847819338) {
                if (this.c == null) {
                    this.c = new ajsw();
                }
                aobv.a(this.c);
            } else if (a == 1228121234) {
                arbs arbs = (arbs) aobv.a(arbs.g.getParserForType());
                arbs arbs2 = this.d;
                if (arbs2 != null) {
                    arbr arbr = (arbr) ((anxo) arbs2.toBuilder());
                    arbr.mergeFrom(arbs);
                    arbs = (arbs) ((anxl) arbr.build());
                }
                this.d = arbs;
            } else if (a == 1593710498) {
                atwd atwd = (atwd) aobv.a(atwd.d.getParserForType());
                atwd atwd2 = this.e;
                if (atwd2 != null) {
                    atwc atwc = (atwc) ((anxo) atwd2.toBuilder());
                    atwc.mergeFrom(atwd);
                    atwd = (atwd) ((anxl) atwc.build());
                }
                this.e = atwd;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
