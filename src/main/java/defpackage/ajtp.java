package defpackage;

/* renamed from: ajtp */
public final class ajtp extends aoca {
    public static volatile ajtp[] a;
    public aqnt b;
    public aqoj c;
    public ajtu d;
    public aqof e;
    public aqnr f;
    public aqnx g;
    public aqmx h;

    public ajtp() {
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajtp)) {
            return false;
        }
        ajtp ajtp = (ajtp) obj;
        aqnt aqnt = this.b;
        if (aqnt == null) {
            if (ajtp.b != null) {
                return false;
            }
        } else if (!aqnt.equals(ajtp.b)) {
            return false;
        }
        aqoj aqoj = this.c;
        if (aqoj == null) {
            if (ajtp.c != null) {
                return false;
            }
        } else if (!aqoj.equals(ajtp.c)) {
            return false;
        }
        ajtu ajtu = this.d;
        if (ajtu == null) {
            if (ajtp.d != null) {
                return false;
            }
        } else if (!ajtu.equals(ajtp.d)) {
            return false;
        }
        aqof aqof = this.e;
        if (aqof == null) {
            if (ajtp.e != null) {
                return false;
            }
        } else if (!aqof.equals(ajtp.e)) {
            return false;
        }
        aqnr aqnr = this.f;
        if (aqnr == null) {
            if (ajtp.f != null) {
                return false;
            }
        } else if (!aqnr.equals(ajtp.f)) {
            return false;
        }
        aqnx aqnx = this.g;
        if (aqnx == null) {
            if (ajtp.g != null) {
                return false;
            }
        } else if (!aqnx.equals(ajtp.g)) {
            return false;
        }
        aqmx aqmx = this.h;
        if (aqmx == null) {
            if (ajtp.h != null) {
                return false;
            }
        } else if (!aqmx.equals(ajtp.h)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajtp.unknownFieldData);
        }
        aocb aocb2 = ajtp.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqnt aqnt = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqnt != null ? aqnt.hashCode() : 0;
        aqoj aqoj = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqoj != null ? aqoj.hashCode() : 0;
        ajtu ajtu = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtu != null ? ajtu.hashCode() : 0;
        aqof aqof = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqof != null ? aqof.hashCode() : 0;
        aqnr aqnr = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqnr != null ? aqnr.hashCode() : 0;
        aqnx aqnx = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqnx != null ? aqnx.hashCode() : 0;
        aqmx aqmx = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (aqmx != null ? aqmx.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(75217872, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(75551572, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(75551609, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(98128620, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(136203652, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(207610346, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(209950429, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(75217872, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(75551572, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(75551609, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(98128620, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(136203652, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(207610346, anze);
        }
        anze = this.h;
        return anze != null ? computeSerializedSize + anwm.c(209950429, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 601742978:
                    aqnt aqnt = (aqnt) aobv.a(aqnt.g.getParserForType());
                    aqnt aqnt2 = this.b;
                    if (aqnt2 != null) {
                        aqns aqns = (aqns) ((anxo) aqnt2.toBuilder());
                        aqns.mergeFrom(aqnt);
                        aqnt = (aqnt) ((anxl) aqns.build());
                    }
                    this.b = aqnt;
                    continue;
                case 604412578:
                    aqoj aqoj = (aqoj) aobv.a(aqoj.s.getParserForType());
                    aqoj aqoj2 = this.c;
                    if (aqoj2 != null) {
                        aqoi aqoi = (aqoi) ((anxo) aqoj2.toBuilder());
                        aqoi.mergeFrom(aqoj);
                        aqoj = (aqoj) ((anxl) aqoi.build());
                    }
                    this.c = aqoj;
                    continue;
                case 604412874:
                    if (this.d == null) {
                        this.d = new ajtu();
                    }
                    aobv.a(this.d);
                    continue;
                case 785028962:
                    aqof aqof = (aqof) aobv.a(aqof.e.getParserForType());
                    aqof aqof2 = this.e;
                    if (aqof2 != null) {
                        aqoe aqoe = (aqoe) ((anxo) aqof2.toBuilder());
                        aqoe.mergeFrom(aqof);
                        aqof = (aqof) ((anxl) aqoe.build());
                    }
                    this.e = aqof;
                    continue;
                case 1089629218:
                    aqnr aqnr = (aqnr) aobv.a(aqnr.l.getParserForType());
                    aqnr aqnr2 = this.f;
                    if (aqnr2 != null) {
                        aqnq aqnq = (aqnq) ((anxo) aqnr2.toBuilder());
                        aqnq.mergeFrom(aqnr);
                        aqnr = (aqnr) ((anxl) aqnq.build());
                    }
                    this.f = aqnr;
                    continue;
                case 1660882770:
                    aqnx aqnx = (aqnx) aobv.a(aqnx.w.getParserForType());
                    aqnx aqnx2 = this.g;
                    if (aqnx2 != null) {
                        aqnw aqnw = (aqnw) ((anxo) aqnx2.toBuilder());
                        aqnw.mergeFrom(aqnx);
                        aqnx = (aqnx) ((anxl) aqnw.build());
                    }
                    this.g = aqnx;
                    continue;
                case 1679603434:
                    aqmx aqmx = (aqmx) aobv.a(aqmx.v.getParserForType());
                    aqmx aqmx2 = this.h;
                    if (aqmx2 != null) {
                        aqmw aqmw = (aqmw) ((anxo) aqmx2.toBuilder());
                        aqmw.mergeFrom(aqmx);
                        aqmx = (aqmx) ((anxl) aqmw.build());
                    }
                    this.h = aqmx;
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
