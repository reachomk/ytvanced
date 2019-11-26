package defpackage;

/* renamed from: ajsj */
public final class ajsj extends aoca {
    public ajri[] a;
    private apxu[] b;
    private apxu[] c;
    public arnm frameworkUpdates;

    public ajsj() {
        if (ajri.a == null) {
            synchronized (aocd.b) {
                if (ajri.a == null) {
                    ajri.a = new ajri[0];
                }
            }
        }
        this.a = ajri.a;
        this.b = new apxu[0];
        this.c = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsj) {
            ajsj ajsj = (ajsj) obj;
            if (aocd.a(this.a, ajsj.a) && aocd.a(this.b, ajsj.b) && aocd.a(this.c, ajsj.c)) {
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (ajsj.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(ajsj.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajsj.unknownFieldData);
                }
                aocb aocb2 = ajsj.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        int a2 = aocd.a(this.b);
        int a3 = aocd.a(this.c);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((((hashCode + 527) * 31) + a) * 31) + a2) * 31) + a3) * 31;
        a = 0;
        hashCode = (hashCode + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze;
        ajri[] ajriArr = this.a;
        int i2 = 0;
        if (ajriArr != null && ajriArr.length > 0) {
            i = 0;
            while (true) {
                ajri[] ajriArr2 = this.a;
                if (i >= ajriArr2.length) {
                    break;
                }
                aocf aocf = ajriArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        apxu[] apxuArr = this.b;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
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
        apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.c;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    aoby.a(6, anze);
                }
                i2++;
            }
        }
        anze = this.frameworkUpdates;
        if (anze != null) {
            aoby.a(777, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        ajri[] ajriArr = this.a;
        int i2 = 0;
        if (ajriArr != null && ajriArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajri[] ajriArr2 = this.a;
                if (computeSerializedSize >= ajriArr2.length) {
                    break;
                }
                aocf aocf = ajriArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(2, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        apxu[] apxuArr = this.b;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i += anwm.c(5, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.c;
                if (i2 >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i2];
                if (anze != null) {
                    computeSerializedSize += anwm.c(6, anze);
                }
                i2++;
            }
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            apxu[] apxuArr;
            apxu[] apxuArr2;
            if (a == 0) {
                break;
            } else if (a == 18) {
                aocf ajri;
                a = aock.a(aobv, 18);
                ajri[] ajriArr = this.a;
                length = ajriArr != null ? ajriArr.length : 0;
                ajri[] ajriArr2 = new ajri[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajriArr, 0, ajriArr2, 0, length);
                }
                while (length < ajriArr2.length - 1) {
                    ajri = new ajri();
                    ajriArr2[length] = ajri;
                    aobv.a(ajri);
                    aobv.a();
                    length++;
                }
                ajri = new ajri();
                ajriArr2[length] = ajri;
                aobv.a(ajri);
                this.a = ajriArr2;
            } else if (a == 42) {
                a = aock.a(aobv, 42);
                apxuArr = this.b;
                length = apxuArr != null ? apxuArr.length : 0;
                apxuArr2 = new apxu[(a + length)];
                if (length != 0) {
                    System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                }
                while (length < apxuArr2.length - 1) {
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    aobv.a();
                    length++;
                }
                apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                this.b = apxuArr2;
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                apxuArr = this.c;
                length = apxuArr != null ? apxuArr.length : 0;
                apxuArr2 = new apxu[(a + length)];
                if (length != 0) {
                    System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                }
                while (length < apxuArr2.length - 1) {
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    aobv.a();
                    length++;
                }
                apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                this.c = apxuArr2;
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
