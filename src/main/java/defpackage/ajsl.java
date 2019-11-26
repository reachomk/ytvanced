package defpackage;

/* renamed from: ajsl */
public final class ajsl extends ajwo {
    public ajsm a;
    public arml b;
    public arml c;
    public aqbg d;
    private apxu[] e;

    public ajsl() {
        super(128774566);
        this.a = null;
        this.e = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsl) {
            ajsl ajsl = (ajsl) obj;
            ajsm ajsm = this.a;
            if (ajsm == null) {
                if (ajsl.a != null) {
                    return false;
                }
            } else if (!ajsm.equals(ajsl.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajsl.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajsl.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajsl.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajsl.c)) {
                return false;
            }
            aqbg aqbg = this.d;
            if (aqbg == null) {
                if (ajsl.d != null) {
                    return false;
                }
            } else if (!aqbg.equals(ajsl.d)) {
                return false;
            }
            if (aocd.a(this.e, ajsl.e)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajsl.unknownFieldData);
                }
                aocb aocb2 = ajsl.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajsm ajsm = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajsm != null ? ajsm.hashCode() : 0;
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aqbg aqbg = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + (aqbg != null ? aqbg.hashCode() : 0)) * 31) + aocd.a(this.e)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        anze anze = this.b;
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
        apxu[] apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(5, anze2);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        anze anze = this.b;
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
        apxu[] apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(5, anze2);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new ajsm();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.b;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.b = arml;
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
                aqbg aqbg = (aqbg) aobv.a(aqbg.c.getParserForType());
                aqbg aqbg2 = this.d;
                if (aqbg2 != null) {
                    aqbf aqbf = (aqbf) ((anxo) aqbg2.toBuilder());
                    aqbf.mergeFrom(aqbg);
                    aqbg = (aqbg) ((anxl) aqbf.build());
                }
                this.d = aqbg;
            } else if (a == 42) {
                a = aock.a(aobv, 42);
                apxu[] apxuArr = this.e;
                int length = apxuArr != null ? apxuArr.length : 0;
                apxu[] apxuArr2 = new apxu[(a + length)];
                if (length != 0) {
                    System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                }
                while (length < apxuArr2.length - 1) {
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    aobv.a();
                    length++;
                }
                apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                this.e = apxuArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
