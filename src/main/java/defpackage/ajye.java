package defpackage;

import java.util.Arrays;

/* renamed from: ajye */
public final class ajye extends ajwo {
    public apxu a;
    public ajyd[] b;
    private arml c;
    private apxu d;
    private byte[] e;
    private arml f;
    private arml g;

    public ajye() {
        super(78398567);
        if (ajyd.a == null) {
            synchronized (aocd.b) {
                if (ajyd.a == null) {
                    ajyd.a = new ajyd[0];
                }
            }
        }
        this.b = ajyd.a;
        this.e = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajye) {
            ajye ajye = (ajye) obj;
            arml arml = this.c;
            if (arml == null) {
                if (ajye.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajye.c)) {
                return false;
            }
            apxu apxu = this.a;
            if (apxu == null) {
                if (ajye.a != null) {
                    return false;
                }
            } else if (!apxu.equals(ajye.a)) {
                return false;
            }
            apxu = this.d;
            if (apxu == null) {
                if (ajye.d != null) {
                    return false;
                }
            } else if (!apxu.equals(ajye.d)) {
                return false;
            }
            if (aocd.a(this.b, ajye.b) && Arrays.equals(this.e, ajye.e)) {
                arml = this.f;
                if (arml == null) {
                    if (ajye.f != null) {
                        return false;
                    }
                } else if (!arml.equals(ajye.f)) {
                    return false;
                }
                arml = this.g;
                if (arml == null) {
                    if (ajye.g != null) {
                        return false;
                    }
                } else if (!arml.equals(ajye.g)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajye.unknownFieldData);
                }
                aocb aocb2 = ajye.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.c;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.a;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        apxu = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int a = aocd.a(this.b);
        int hashCode3 = Arrays.hashCode(this.e);
        arml arml2 = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml arml3 = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (arml3 != null ? arml3.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.c;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.a;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(3, anze);
        }
        ajyd[] ajydArr = this.b;
        if (ajydArr != null && ajydArr.length > 0) {
            int i = 0;
            while (true) {
                ajyd[] ajydArr2 = this.b;
                if (i >= ajydArr2.length) {
                    break;
                }
                aocf aocf = ajydArr2[i];
                if (aocf != null) {
                    aoby.a(4, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(6, this.e);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(8, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        ajyd[] ajydArr = this.b;
        if (ajydArr != null && ajydArr.length > 0) {
            int i = 0;
            while (true) {
                ajyd[] ajydArr2 = this.b;
                if (i >= ajydArr2.length) {
                    break;
                }
                aocf aocf = ajydArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(4, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(6, this.e);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.g;
        return anze != null ? computeSerializedSize + anwm.c(8, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.c;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.c = arml;
            } else if (a == 18) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.a;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.a = apxu;
            } else if (a == 26) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.d;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.d = apxu;
            } else if (a == 34) {
                aocf ajyd;
                a = aock.a(aobv, 34);
                ajyd[] ajydArr = this.b;
                int length = ajydArr != null ? ajydArr.length : 0;
                ajyd[] ajydArr2 = new ajyd[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajydArr, 0, ajydArr2, 0, length);
                }
                while (length < ajydArr2.length - 1) {
                    ajyd = new ajyd();
                    ajydArr2[length] = ajyd;
                    aobv.a(ajyd);
                    aobv.a();
                    length++;
                }
                ajyd = new ajyd();
                ajydArr2[length] = ajyd;
                aobv.a(ajyd);
                this.b = ajydArr2;
            } else if (a == 50) {
                this.e = aobv.e();
            } else if (a == 58) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.f;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.f = arml;
            } else if (a == 66) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.g;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.g = arml;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
