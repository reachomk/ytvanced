package defpackage;

/* renamed from: ajvk */
public final class ajvk extends aoca {
    public ajxd[] a;
    private arml b;
    private arml c;
    private apxu d;
    public arnm frameworkUpdates;

    public ajvk() {
        if (ajxd.a == null) {
            synchronized (aocd.b) {
                if (ajxd.a == null) {
                    ajxd.a = new ajxd[0];
                }
            }
        }
        this.a = ajxd.a;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvk) {
            ajvk ajvk = (ajvk) obj;
            arml arml = this.b;
            if (arml == null) {
                if (ajvk.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajvk.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajvk.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajvk.c)) {
                return false;
            }
            if (aocd.a(this.a, ajvk.a)) {
                apxu apxu = this.d;
                if (apxu == null) {
                    if (ajvk.d != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajvk.d)) {
                    return false;
                }
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (ajvk.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(ajvk.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajvk.unknownFieldData);
                }
                aocb aocb2 = ajvk.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        int a = aocd.a(this.a);
        apxu apxu = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arnm arnm = this.frameworkUpdates;
        hashCode = (((hashCode + hashCode2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        ajxd[] ajxdArr = this.a;
        if (ajxdArr != null && ajxdArr.length > 0) {
            int i = 0;
            while (true) {
                ajxd[] ajxdArr2 = this.a;
                if (i >= ajxdArr2.length) {
                    break;
                }
                aocf aocf = ajxdArr2[i];
                if (aocf != null) {
                    aoby.a(4, aocf);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.frameworkUpdates;
        if (anze != null) {
            aoby.a(777, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        ajxd[] ajxdArr = this.a;
        if (ajxdArr != null && ajxdArr.length > 0) {
            int i = 0;
            while (true) {
                ajxd[] ajxdArr2 = this.a;
                if (i >= ajxdArr2.length) {
                    break;
                }
                aocf aocf = ajxdArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(4, aocf);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
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
                aocf ajxd;
                a = aock.a(aobv, 34);
                ajxd[] ajxdArr = this.a;
                int length = ajxdArr != null ? ajxdArr.length : 0;
                ajxd[] ajxdArr2 = new ajxd[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajxdArr, 0, ajxdArr2, 0, length);
                }
                while (length < ajxdArr2.length - 1) {
                    ajxd = new ajxd();
                    ajxdArr2[length] = ajxd;
                    aobv.a(ajxd);
                    aobv.a();
                    length++;
                }
                ajxd = new ajxd();
                ajxdArr2[length] = ajxd;
                aobv.a(ajxd);
                this.a = ajxdArr2;
            } else if (a == 50) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.d;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.d = apxu;
            } else if (a == 6218) {
                arnm arnm = (arnm) aobv.a(arnm.a.getParserForType());
                arnm arnm2 = this.frameworkUpdates;
                if (arnm2 != null) {
                    arnl arnl = (arnl) ((anxo) arnm2.toBuilder());
                    arnl.mergeFrom(arnm);
                    arnm = (arnm) ((anxl) arnl.build());
                }
                this.frameworkUpdates = arnm;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
