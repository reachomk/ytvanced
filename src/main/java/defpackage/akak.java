package defpackage;

import java.util.Arrays;

/* renamed from: akak */
public final class akak extends ajwo {
    public arwf a;
    public arwf b;
    public arml c;
    public arml d;
    public ajzw e;
    public byte[] f;

    public akak() {
        super(183696466);
        this.e = null;
        this.f = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akak) {
            akak akak = (akak) obj;
            arwf arwf = this.a;
            if (arwf == null) {
                if (akak.a != null) {
                    return false;
                }
            } else if (!arwf.equals(akak.a)) {
                return false;
            }
            arwf = this.b;
            if (arwf == null) {
                if (akak.b != null) {
                    return false;
                }
            } else if (!arwf.equals(akak.b)) {
                return false;
            }
            arml arml = this.c;
            if (arml == null) {
                if (akak.c != null) {
                    return false;
                }
            } else if (!arml.equals(akak.c)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (akak.d != null) {
                    return false;
                }
            } else if (!arml.equals(akak.d)) {
                return false;
            }
            ajzw ajzw = this.e;
            if (ajzw == null) {
                if (akak.e != null) {
                    return false;
                }
            } else if (!ajzw.equals(akak.e)) {
                return false;
            }
            if (Arrays.equals(this.f, akak.f)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akak.unknownFieldData);
                }
                aocb aocb2 = akak.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arwf arwf = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arwf != null ? arwf.hashCode() : 0;
        arwf arwf2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf2 != null ? arwf2.hashCode() : 0;
        arml arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        ajzw ajzw = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31) + Arrays.hashCode(this.f)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        aocf aocf = this.e;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            aoby.a(7, this.f);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        aocf aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        return !Arrays.equals(this.f, aock.c) ? computeSerializedSize + aoby.b(7, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arwf arwf;
            arwf arwf2;
            arwe arwe;
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf2 = this.a;
                if (arwf2 != null) {
                    arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.a = arwf;
            } else if (a == 18) {
                arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf2 = this.b;
                if (arwf2 != null) {
                    arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.b = arwf;
            } else if (a == 26) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.c;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.c = arml;
            } else if (a == 34) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.d;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.d = arml;
            } else if (a == 42) {
                if (this.e == null) {
                    this.e = new ajzw();
                }
                aobv.a(this.e);
            } else if (a == 58) {
                this.f = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
