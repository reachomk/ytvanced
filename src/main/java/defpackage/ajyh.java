package defpackage;

/* renamed from: ajyh */
public final class ajyh extends aoca {
    public azok a;
    public aqhy b;
    public azom c;
    public azpm d;
    public ajwn e;
    public auuw f;
    public aymq g;
    public arno h;
    public aqxi i;
    public axsl j;
    private avfs k;
    private auuc l;

    public ajyh() {
        this.e = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajyh)) {
            return false;
        }
        ajyh ajyh = (ajyh) obj;
        azok azok = this.a;
        if (azok == null) {
            if (ajyh.a != null) {
                return false;
            }
        } else if (!azok.equals(ajyh.a)) {
            return false;
        }
        aqhy aqhy = this.b;
        if (aqhy == null) {
            if (ajyh.b != null) {
                return false;
            }
        } else if (!aqhy.equals(ajyh.b)) {
            return false;
        }
        azom azom = this.c;
        if (azom == null) {
            if (ajyh.c != null) {
                return false;
            }
        } else if (!azom.equals(ajyh.c)) {
            return false;
        }
        azpm azpm = this.d;
        if (azpm == null) {
            if (ajyh.d != null) {
                return false;
            }
        } else if (!azpm.equals(ajyh.d)) {
            return false;
        }
        ajwn ajwn = this.e;
        if (ajwn == null) {
            if (ajyh.e != null) {
                return false;
            }
        } else if (!ajwn.equals(ajyh.e)) {
            return false;
        }
        avfs avfs = this.k;
        if (avfs == null) {
            if (ajyh.k != null) {
                return false;
            }
        } else if (!avfs.equals(ajyh.k)) {
            return false;
        }
        auuw auuw = this.f;
        if (auuw == null) {
            if (ajyh.f != null) {
                return false;
            }
        } else if (!auuw.equals(ajyh.f)) {
            return false;
        }
        auuc auuc = this.l;
        if (auuc == null) {
            if (ajyh.l != null) {
                return false;
            }
        } else if (!auuc.equals(ajyh.l)) {
            return false;
        }
        aymq aymq = this.g;
        if (aymq == null) {
            if (ajyh.g != null) {
                return false;
            }
        } else if (!aymq.equals(ajyh.g)) {
            return false;
        }
        arno arno = this.h;
        if (arno == null) {
            if (ajyh.h != null) {
                return false;
            }
        } else if (!arno.equals(ajyh.h)) {
            return false;
        }
        aqxi aqxi = this.i;
        if (aqxi == null) {
            if (ajyh.i != null) {
                return false;
            }
        } else if (!aqxi.equals(ajyh.i)) {
            return false;
        }
        axsl axsl = this.j;
        if (axsl == null) {
            if (ajyh.j != null) {
                return false;
            }
        } else if (!axsl.equals(ajyh.j)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajyh.unknownFieldData);
        }
        aocb aocb2 = ajyh.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        azok azok = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = azok != null ? azok.hashCode() : 0;
        aqhy aqhy = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqhy != null ? aqhy.hashCode() : 0;
        azom azom = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azom != null ? azom.hashCode() : 0;
        azpm azpm = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azpm != null ? azpm.hashCode() : 0;
        ajwn ajwn = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajwn != null ? ajwn.hashCode() : 0;
        avfs avfs = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = avfs != null ? avfs.hashCode() : 0;
        auuw auuw = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auuw != null ? auuw.hashCode() : 0;
        auuc auuc = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = auuc != null ? auuc.hashCode() : 0;
        aymq aymq = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aymq != null ? aymq.hashCode() : 0;
        arno arno = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arno != null ? arno.hashCode() : 0;
        aqxi aqxi = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aqxi != null ? aqxi.hashCode() : 0;
        axsl axsl = this.j;
        hashCode = (((hashCode + hashCode2) * 31) + (axsl != null ? axsl.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(62441981, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(64099105, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(65097874, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(65500215, anze);
        }
        aocf aocf = this.e;
        if (aocf != null) {
            aoby.a(86135402, aocf);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(94312586, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(96152614, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(96907215, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(127387931, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(162801955, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(200043314, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(202129111, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(62441981, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(64099105, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(65097874, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(65500215, anze);
        }
        aocf aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(86135402, aocf);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(94312586, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(96152614, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(96907215, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(127387931, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(162801955, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(200043314, anze);
        }
        anze = this.j;
        return anze != null ? computeSerializedSize + anwm.c(202129111, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 499535850:
                    azok azok = (azok) aobv.a(azok.e.getParserForType());
                    azok azok2 = this.a;
                    if (azok2 != null) {
                        azon azon = (azon) ((anxo) azok2.toBuilder());
                        azon.mergeFrom(azok);
                        azok = (azok) ((anxl) azon.build());
                    }
                    this.a = azok;
                    continue;
                case 512792842:
                    aqhy aqhy = (aqhy) aobv.a(aqhy.q.getParserForType());
                    aqhy aqhy2 = this.b;
                    if (aqhy2 != null) {
                        aqhx aqhx = (aqhx) ((anxo) aqhy2.toBuilder());
                        aqhx.mergeFrom(aqhy);
                        aqhy = (aqhy) ((anxl) aqhx.build());
                    }
                    this.b = aqhy;
                    continue;
                case 520782994:
                    azom azom = (azom) aobv.a(azom.d.getParserForType());
                    azom azom2 = this.c;
                    if (azom2 != null) {
                        azop azop = (azop) ((anxo) azom2.toBuilder());
                        azop.mergeFrom(azom);
                        azom = (azom) ((anxl) azop.build());
                    }
                    this.c = azom;
                    continue;
                case 524001722:
                    azpm azpm = (azpm) aobv.a(azpm.b.getParserForType());
                    azpm azpm2 = this.d;
                    if (azpm2 != null) {
                        azpp azpp = (azpp) ((anxo) azpm2.toBuilder());
                        azpp.mergeFrom(azpm);
                        azpm = (azpm) ((anxl) azpp.build());
                    }
                    this.d = azpm;
                    continue;
                case 689083218:
                    if (this.e == null) {
                        this.e = new ajwn();
                    }
                    aobv.a(this.e);
                    continue;
                case 754500690:
                    avfs avfs = (avfs) aobv.a(avfs.g.getParserForType());
                    avfs avfs2 = this.k;
                    if (avfs2 != null) {
                        avfr avfr = (avfr) ((anxo) avfs2.toBuilder());
                        avfr.mergeFrom(avfs);
                        avfs = (avfs) ((anxl) avfr.build());
                    }
                    this.k = avfs;
                    continue;
                case 769220914:
                    auuw auuw = (auuw) aobv.a(auuw.o.getParserForType());
                    auuw auuw2 = this.f;
                    if (auuw2 != null) {
                        auuv auuv = (auuv) ((anxo) auuw2.toBuilder());
                        auuv.mergeFrom(auuw);
                        auuw = (auuw) ((anxl) auuv.build());
                    }
                    this.f = auuw;
                    continue;
                case 775257722:
                    auuc auuc = (auuc) aobv.a(auuc.p.getParserForType());
                    auuc auuc2 = this.l;
                    if (auuc2 != null) {
                        auub auub = (auub) ((anxo) auuc2.toBuilder());
                        auub.mergeFrom(auuc);
                        auuc = (auuc) ((anxl) auub.build());
                    }
                    this.l = auuc;
                    continue;
                case 1019103450:
                    aymq aymq = (aymq) aobv.a(aymq.h.getParserForType());
                    aymq aymq2 = this.g;
                    if (aymq2 != null) {
                        aymt aymt = (aymt) ((anxo) aymq2.toBuilder());
                        aymt.mergeFrom(aymq);
                        aymq = (aymq) ((anxl) aymt.build());
                    }
                    this.g = aymq;
                    continue;
                case 1302415642:
                    arno arno = (arno) aobv.a(arno.e.getParserForType());
                    arno arno2 = this.h;
                    if (arno2 != null) {
                        arnn arnn = (arnn) ((anxo) arno2.toBuilder());
                        arnn.mergeFrom(arno);
                        arno = (arno) ((anxl) arnn.build());
                    }
                    this.h = arno;
                    continue;
                case 1600346514:
                    aqxi aqxi = (aqxi) aobv.a(aqxi.i.getParserForType());
                    aqxi aqxi2 = this.i;
                    if (aqxi2 != null) {
                        aqxh aqxh = (aqxh) ((anxo) aqxi2.toBuilder());
                        aqxh.mergeFrom(aqxi);
                        aqxi = (aqxi) ((anxl) aqxh.build());
                    }
                    this.i = aqxi;
                    continue;
                case 1617032890:
                    axsl axsl = (axsl) aobv.a(axsl.g.getParserForType());
                    axsl axsl2 = this.j;
                    if (axsl2 != null) {
                        axsk axsk = (axsk) ((anxo) axsl2.toBuilder());
                        axsk.mergeFrom(axsl);
                        axsl = (axsl) ((anxl) axsk.build());
                    }
                    this.j = axsl;
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
