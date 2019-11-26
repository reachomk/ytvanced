package defpackage;

/* renamed from: ajrs */
public final class ajrs extends aoca {
    public aqhy a;
    public ajwn b;
    public auuc c;
    public akbi d;
    public ayhz e;
    public arno f;

    public ajrs() {
        this.b = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrs)) {
            return false;
        }
        ajrs ajrs = (ajrs) obj;
        aqhy aqhy = this.a;
        if (aqhy == null) {
            if (ajrs.a != null) {
                return false;
            }
        } else if (!aqhy.equals(ajrs.a)) {
            return false;
        }
        ajwn ajwn = this.b;
        if (ajwn == null) {
            if (ajrs.b != null) {
                return false;
            }
        } else if (!ajwn.equals(ajrs.b)) {
            return false;
        }
        auuc auuc = this.c;
        if (auuc == null) {
            if (ajrs.c != null) {
                return false;
            }
        } else if (!auuc.equals(ajrs.c)) {
            return false;
        }
        akbi akbi = this.d;
        if (akbi == null) {
            if (ajrs.d != null) {
                return false;
            }
        } else if (!akbi.equals(ajrs.d)) {
            return false;
        }
        ayhz ayhz = this.e;
        if (ayhz == null) {
            if (ajrs.e != null) {
                return false;
            }
        } else if (!ayhz.equals(ajrs.e)) {
            return false;
        }
        arno arno = this.f;
        if (arno == null) {
            if (ajrs.f != null) {
                return false;
            }
        } else if (!arno.equals(ajrs.f)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrs.unknownFieldData);
        }
        aocb aocb2 = ajrs.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aqhy aqhy = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aqhy != null ? aqhy.hashCode() : 0;
        ajwn ajwn = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajwn != null ? ajwn.hashCode() : 0;
        auuc auuc = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auuc != null ? auuc.hashCode() : 0;
        akbi akbi = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akbi != null ? akbi.hashCode() : 0;
        ayhz ayhz = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ayhz != null ? ayhz.hashCode() : 0;
        arno arno = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (arno != null ? arno.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(64099105, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(86135402, aocf);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(96907215, anze);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(118637602, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(152873793, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(162801955, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(64099105, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(86135402, aocf);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(96907215, anze);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(118637602, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(152873793, anze);
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(162801955, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 512792842:
                    aqhy aqhy = (aqhy) aobv.a(aqhy.q.getParserForType());
                    aqhy aqhy2 = this.a;
                    if (aqhy2 != null) {
                        aqhx aqhx = (aqhx) ((anxo) aqhy2.toBuilder());
                        aqhx.mergeFrom(aqhy);
                        aqhy = (aqhy) ((anxl) aqhx.build());
                    }
                    this.a = aqhy;
                    continue;
                case 689083218:
                    if (this.b == null) {
                        this.b = new ajwn();
                    }
                    aobv.a(this.b);
                    continue;
                case 775257722:
                    auuc auuc = (auuc) aobv.a(auuc.p.getParserForType());
                    auuc auuc2 = this.c;
                    if (auuc2 != null) {
                        auub auub = (auub) ((anxo) auuc2.toBuilder());
                        auub.mergeFrom(auuc);
                        auuc = (auuc) ((anxl) auub.build());
                    }
                    this.c = auuc;
                    continue;
                case 949100818:
                    if (this.d == null) {
                        this.d = new akbi();
                    }
                    aobv.a(this.d);
                    continue;
                case 1222990346:
                    ayhz ayhz = (ayhz) aobv.a(ayhz.n.getParserForType());
                    ayhz ayhz2 = this.e;
                    if (ayhz2 != null) {
                        ayhy ayhy = (ayhy) ((anxo) ayhz2.toBuilder());
                        ayhy.mergeFrom(ayhz);
                        ayhz = (ayhz) ((anxl) ayhy.build());
                    }
                    this.e = ayhz;
                    continue;
                case 1302415642:
                    arno arno = (arno) aobv.a(arno.e.getParserForType());
                    arno arno2 = this.f;
                    if (arno2 != null) {
                        arnn arnn = (arnn) ((anxo) arno2.toBuilder());
                        arnn.mergeFrom(arno);
                        arno = (arno) ((anxl) arnn.build());
                    }
                    this.f = arno;
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
