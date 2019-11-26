package defpackage;

/* renamed from: ajwi */
public final class ajwi extends aoca {
    public arxp a;
    public arxb b;
    public arxf c;
    public arxt d;
    public arwn e;
    public arwp f;
    public awly g;
    public arxl h;

    public ajwi() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajwi)) {
            return false;
        }
        ajwi ajwi = (ajwi) obj;
        arxp arxp = this.a;
        if (arxp == null) {
            if (ajwi.a != null) {
                return false;
            }
        } else if (!arxp.equals(ajwi.a)) {
            return false;
        }
        arxb arxb = this.b;
        if (arxb == null) {
            if (ajwi.b != null) {
                return false;
            }
        } else if (!arxb.equals(ajwi.b)) {
            return false;
        }
        arxf arxf = this.c;
        if (arxf == null) {
            if (ajwi.c != null) {
                return false;
            }
        } else if (!arxf.equals(ajwi.c)) {
            return false;
        }
        arxt arxt = this.d;
        if (arxt == null) {
            if (ajwi.d != null) {
                return false;
            }
        } else if (!arxt.equals(ajwi.d)) {
            return false;
        }
        arwn arwn = this.e;
        if (arwn == null) {
            if (ajwi.e != null) {
                return false;
            }
        } else if (!arwn.equals(ajwi.e)) {
            return false;
        }
        arwp arwp = this.f;
        if (arwp == null) {
            if (ajwi.f != null) {
                return false;
            }
        } else if (!arwp.equals(ajwi.f)) {
            return false;
        }
        awly awly = this.g;
        if (awly == null) {
            if (ajwi.g != null) {
                return false;
            }
        } else if (!awly.equals(ajwi.g)) {
            return false;
        }
        arxl arxl = this.h;
        if (arxl == null) {
            if (ajwi.h != null) {
                return false;
            }
        } else if (!arxl.equals(ajwi.h)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajwi.unknownFieldData);
        }
        aocb aocb2 = ajwi.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arxp arxp = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arxp != null ? arxp.hashCode() : 0;
        arxb arxb = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arxb != null ? arxb.hashCode() : 0;
        arxf arxf = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arxf != null ? arxf.hashCode() : 0;
        arxt arxt = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arxt != null ? arxt.hashCode() : 0;
        arwn arwn = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwn != null ? arwn.hashCode() : 0;
        arwp arwp = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwp != null ? arwp.hashCode() : 0;
        awly awly = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awly != null ? awly.hashCode() : 0;
        arxl arxl = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (arxl != null ? arxl.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(62053166, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(70719299, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(70870226, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(71247332, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(87936418, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(99174129, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(99391126, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(105818573, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(62053166, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(70719299, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(70870226, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(71247332, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(87936418, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(99174129, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(99391126, anze);
        }
        anze = this.h;
        return anze != null ? computeSerializedSize + anwm.c(105818573, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 496425330:
                    arxp arxp = (arxp) aobv.a(arxp.k.getParserForType());
                    arxp arxp2 = this.a;
                    if (arxp2 != null) {
                        arxs arxs = (arxs) ((anxo) arxp2.toBuilder());
                        arxs.mergeFrom(arxp);
                        arxp = (arxp) ((anxl) arxs.build());
                    }
                    this.a = arxp;
                    continue;
                case 565754394:
                    arxb arxb = (arxb) aobv.a(arxb.k.getParserForType());
                    arxb arxb2 = this.b;
                    if (arxb2 != null) {
                        arxe arxe = (arxe) ((anxo) arxb2.toBuilder());
                        arxe.mergeFrom(arxb);
                        arxb = (arxb) ((anxl) arxe.build());
                    }
                    this.b = arxb;
                    continue;
                case 566961810:
                    arxf arxf = (arxf) aobv.a(arxf.k.getParserForType());
                    arxf arxf2 = this.c;
                    if (arxf2 != null) {
                        arxi arxi = (arxi) ((anxo) arxf2.toBuilder());
                        arxi.mergeFrom(arxf);
                        arxf = (arxf) ((anxl) arxi.build());
                    }
                    this.c = arxf;
                    continue;
                case 569978658:
                    arxt arxt = (arxt) aobv.a(arxt.l.getParserForType());
                    arxt arxt2 = this.d;
                    if (arxt2 != null) {
                        arxv arxv = (arxv) ((anxo) arxt2.toBuilder());
                        arxv.mergeFrom(arxt);
                        arxt = (arxt) ((anxl) arxv.build());
                    }
                    this.d = arxt;
                    continue;
                case 703491346:
                    arwn arwn = (arwn) aobv.a(arwn.i.getParserForType());
                    arwn arwn2 = this.e;
                    if (arwn2 != null) {
                        arwq arwq = (arwq) ((anxo) arwn2.toBuilder());
                        arwq.mergeFrom(arwn);
                        arwn = (arwn) ((anxl) arwq.build());
                    }
                    this.e = arwn;
                    continue;
                case 793393034:
                    arwp arwp = (arwp) aobv.a(arwp.i.getParserForType());
                    arwp arwp2 = this.f;
                    if (arwp2 != null) {
                        arws arws = (arws) ((anxo) arwp2.toBuilder());
                        arws.mergeFrom(arwp);
                        arwp = (arwp) ((anxl) arws.build());
                    }
                    this.f = arwp;
                    continue;
                case 795129010:
                    awly awly = (awly) aobv.a(awly.j.getParserForType());
                    awly awly2 = this.g;
                    if (awly2 != null) {
                        awmb awmb = (awmb) ((anxo) awly2.toBuilder());
                        awmb.mergeFrom(awly);
                        awly = (awly) ((anxl) awmb.build());
                    }
                    this.g = awly;
                    continue;
                case 846548586:
                    arxl arxl = (arxl) aobv.a(arxl.n.getParserForType());
                    arxl arxl2 = this.h;
                    if (arxl2 != null) {
                        arxo arxo = (arxo) ((anxo) arxl2.toBuilder());
                        arxo.mergeFrom(arxl);
                        arxl = (arxl) ((anxl) arxo.build());
                    }
                    this.h = arxl;
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
