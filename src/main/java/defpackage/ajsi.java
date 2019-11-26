package defpackage;

import java.util.Arrays;

/* renamed from: ajsi */
public final class ajsi extends ajwo {
    public arml a;
    public apne b;
    public apne c;
    public apnc d;
    private arml e;
    private byte[] f;

    public ajsi() {
        super(51249284);
        this.f = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsi) {
            ajsi ajsi = (ajsi) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajsi.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajsi.a)) {
                return false;
            }
            apne apne = this.b;
            if (apne == null) {
                if (ajsi.b != null) {
                    return false;
                }
            } else if (!apne.equals(ajsi.b)) {
                return false;
            }
            apne = this.c;
            if (apne == null) {
                if (ajsi.c != null) {
                    return false;
                }
            } else if (!apne.equals(ajsi.c)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajsi.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajsi.e)) {
                return false;
            }
            apnc apnc = this.d;
            if (apnc == null) {
                if (ajsi.d != null) {
                    return false;
                }
            } else if (!apnc.equals(ajsi.d)) {
                return false;
            }
            if (Arrays.equals(this.f, ajsi.f)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajsi.unknownFieldData);
                }
                aocb aocb2 = ajsi.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        apne apne = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apne != null ? apne.hashCode() : 0;
        apne = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apne != null ? apne.hashCode() : 0;
        arml arml2 = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        apnc apnc = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + (apnc != null ? apnc.hashCode() : 0)) * 31) + Arrays.hashCode(this.f)) * 31;
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
        anze = this.e;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
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
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        return !Arrays.equals(this.f, aock.c) ? computeSerializedSize + aoby.b(7, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            apne apne;
            apne apne2;
            apnh apnh;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.a;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                apne = (apne) aobv.a(apne.c.getParserForType());
                apne2 = this.b;
                if (apne2 != null) {
                    apnh = (apnh) ((anxo) apne2.toBuilder());
                    apnh.mergeFrom(apne);
                    apne = (apne) ((anxl) apnh.build());
                }
                this.b = apne;
            } else if (a == 26) {
                apne = (apne) aobv.a(apne.c.getParserForType());
                apne2 = this.c;
                if (apne2 != null) {
                    apnh = (apnh) ((anxo) apne2.toBuilder());
                    apnh.mergeFrom(apne);
                    apne = (apne) ((anxl) apnh.build());
                }
                this.c = apne;
            } else if (a == 34) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.e;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.e = arml;
            } else if (a == 42) {
                apnc apnc = (apnc) aobv.a(apnc.d.getParserForType());
                apnc apnc2 = this.d;
                if (apnc2 != null) {
                    apnf apnf = (apnf) ((anxo) apnc2.toBuilder());
                    apnf.mergeFrom(apnc);
                    apnc = (apnc) ((anxl) apnf.build());
                }
                this.d = apnc;
            } else if (a == 58) {
                this.f = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
