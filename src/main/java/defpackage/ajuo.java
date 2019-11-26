package defpackage;

/* renamed from: ajuo */
public final class ajuo extends ajwo {
    public String a;
    public arfd b;
    public ajul c;
    public arez d;
    public int e;
    private auko f;

    public ajuo() {
        super(138681066);
        this.a = "";
        this.c = null;
        this.e = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuo) {
            ajuo ajuo = (ajuo) obj;
            String str = this.a;
            if (str == null) {
                if (ajuo.a != null) {
                    return false;
                }
            } else if (!str.equals(ajuo.a)) {
                return false;
            }
            arfd arfd = this.b;
            if (arfd == null) {
                if (ajuo.b != null) {
                    return false;
                }
            } else if (!arfd.equals(ajuo.b)) {
                return false;
            }
            ajul ajul = this.c;
            if (ajul == null) {
                if (ajuo.c != null) {
                    return false;
                }
            } else if (!ajul.equals(ajuo.c)) {
                return false;
            }
            arez arez = this.d;
            if (arez == null) {
                if (ajuo.d != null) {
                    return false;
                }
            } else if (!arez.equals(ajuo.d)) {
                return false;
            }
            if (this.e == ajuo.e) {
                auko auko = this.f;
                if (auko == null) {
                    if (ajuo.f != null) {
                        return false;
                    }
                } else if (!auko.equals(ajuo.f)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajuo.unknownFieldData);
                }
                aocb aocb2 = ajuo.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        arfd arfd = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arfd != null ? arfd.hashCode() : 0;
        ajul ajul = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajul != null ? ajul.hashCode() : 0;
        arez arez = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arez != null ? arez.hashCode() : 0;
        int i2 = this.e;
        auko auko = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + i2) * 31) + (auko != null ? auko.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            aoby.a(1, this.a);
        }
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        int i = this.e;
        if (i != 0) {
            aoby.a(5, i);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(999, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(1, this.a);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        int i = this.e;
        if (i != 0) {
            computeSerializedSize += aoby.c(5, i);
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(999, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.a = aobv.d();
            } else if (a == 18) {
                arfd arfd = (arfd) aobv.a(arfd.c.getParserForType());
                arfd arfd2 = this.b;
                if (arfd2 != null) {
                    arfc arfc = (arfc) ((anxo) arfd2.toBuilder());
                    arfc.mergeFrom(arfd);
                    arfd = (arfd) ((anxl) arfc.build());
                }
                this.b = arfd;
            } else if (a == 26) {
                if (this.c == null) {
                    this.c = new ajul();
                }
                aobv.a(this.c);
            } else if (a == 34) {
                arez arez = (arez) aobv.a(arez.c.getParserForType());
                arez arez2 = this.d;
                if (arez2 != null) {
                    arey arey = (arey) ((anxo) arez2.toBuilder());
                    arey.mergeFrom(arez);
                    arez = (arez) ((anxl) arey.build());
                }
                this.d = arez;
            } else if (a == 40) {
                this.e = aobv.f();
            } else if (a == 7994) {
                auko auko = (auko) aobv.a(auko.f.getParserForType());
                auko auko2 = this.f;
                if (auko2 != null) {
                    aukq aukq = (aukq) ((anxo) auko2.toBuilder());
                    aukq.mergeFrom(auko);
                    auko = (auko) ((anxl) aukq.build());
                }
                this.f = auko;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
