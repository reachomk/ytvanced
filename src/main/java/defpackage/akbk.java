package defpackage;

import java.util.Arrays;

/* renamed from: akbk */
public final class akbk extends ajwo {
    public azhy a;
    public azhs b;
    public akcc[] c;
    public int d;
    public arml e;
    private arwf f;
    private arwf g;
    private byte[] h;
    private arml i;

    public akbk() {
        super(119956144);
        if (akcc.a == null) {
            synchronized (aocd.b) {
                if (akcc.a == null) {
                    akcc.a = new akcc[0];
                }
            }
        }
        this.c = akcc.a;
        this.d = 0;
        this.h = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbk) {
            akbk akbk = (akbk) obj;
            azhy azhy = this.a;
            if (azhy == null) {
                if (akbk.a != null) {
                    return false;
                }
            } else if (!azhy.equals(akbk.a)) {
                return false;
            }
            azhs azhs = this.b;
            if (azhs == null) {
                if (akbk.b != null) {
                    return false;
                }
            } else if (!azhs.equals(akbk.b)) {
                return false;
            }
            if (aocd.a(this.c, akbk.c) && this.d == akbk.d) {
                arml arml = this.e;
                if (arml == null) {
                    if (akbk.e != null) {
                        return false;
                    }
                } else if (!arml.equals(akbk.e)) {
                    return false;
                }
                arwf arwf = this.f;
                if (arwf == null) {
                    if (akbk.f != null) {
                        return false;
                    }
                } else if (!arwf.equals(akbk.f)) {
                    return false;
                }
                arwf = this.g;
                if (arwf == null) {
                    if (akbk.g != null) {
                        return false;
                    }
                } else if (!arwf.equals(akbk.g)) {
                    return false;
                }
                if (Arrays.equals(this.h, akbk.h)) {
                    arml = this.i;
                    if (arml == null) {
                        if (akbk.i != null) {
                            return false;
                        }
                    } else if (!arml.equals(akbk.i)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akbk.unknownFieldData);
                    }
                    aocb aocb2 = akbk.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        azhy azhy = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = azhy != null ? azhy.hashCode() : 0;
        azhs azhs = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azhs != null ? azhs.hashCode() : 0;
        int a = aocd.a(this.c);
        int i2 = this.d;
        arml arml = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + i2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arwf arwf = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf != null ? arwf.hashCode() : 0;
        arwf = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arwf != null ? arwf.hashCode() : 0;
        a = Arrays.hashCode(this.h);
        arml arml2 = this.i;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        akcc[] akccArr = this.c;
        if (akccArr != null && akccArr.length > 0) {
            i = 0;
            while (true) {
                akcc[] akccArr2 = this.c;
                if (i >= akccArr2.length) {
                    break;
                }
                aocf aocf = akccArr2[i];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i++;
            }
        }
        i = this.d;
        if (i != 0) {
            aoby.a(4, i);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            aoby.a(9, this.h);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(10, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        akcc[] akccArr = this.c;
        if (akccArr != null && akccArr.length > 0) {
            i = 0;
            while (true) {
                akcc[] akccArr2 = this.c;
                if (i >= akccArr2.length) {
                    break;
                }
                aocf aocf = akccArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(3, aocf);
                }
                i++;
            }
        }
        i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.c(4, i);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        if (!Arrays.equals(this.h, aock.c)) {
            computeSerializedSize += aoby.b(9, this.h);
        }
        anze = this.i;
        return anze != null ? computeSerializedSize + anwm.c(10, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            arwf arwf;
            arwf arwf2;
            arwe arwe;
            if (a == 0) {
                break;
            } else if (a == 10) {
                azhy azhy = (azhy) aobv.a(azhy.c.getParserForType());
                azhy azhy2 = this.a;
                if (azhy2 != null) {
                    azib azib = (azib) ((anxo) azhy2.toBuilder());
                    azib.mergeFrom(azhy);
                    azhy = (azhy) ((anxl) azib.build());
                }
                this.a = azhy;
            } else if (a == 18) {
                azhs azhs = (azhs) aobv.a(azhs.c.getParserForType());
                azhs azhs2 = this.b;
                if (azhs2 != null) {
                    azhv azhv = (azhv) ((anxo) azhs2.toBuilder());
                    azhv.mergeFrom(azhs);
                    azhs = (azhs) ((anxl) azhv.build());
                }
                this.b = azhs;
            } else if (a == 26) {
                aocf akcc;
                a = aock.a(aobv, 26);
                akcc[] akccArr = this.c;
                int length = akccArr != null ? akccArr.length : 0;
                akcc[] akccArr2 = new akcc[(a + length)];
                if (length != 0) {
                    System.arraycopy(akccArr, 0, akccArr2, 0, length);
                }
                while (length < akccArr2.length - 1) {
                    akcc = new akcc();
                    akccArr2[length] = akcc;
                    aobv.a(akcc);
                    aobv.a();
                    length++;
                }
                akcc = new akcc();
                akccArr2[length] = akcc;
                aobv.a(akcc);
                this.c = akccArr2;
            } else if (a == 32) {
                this.d = aobv.f();
            } else if (a == 42) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.e;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.e = arml;
            } else if (a == 50) {
                arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf2 = this.f;
                if (arwf2 != null) {
                    arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.f = arwf;
            } else if (a == 58) {
                arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf2 = this.g;
                if (arwf2 != null) {
                    arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.g = arwf;
            } else if (a == 74) {
                this.h = aobv.e();
            } else if (a == 82) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.i;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.i = arml;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
