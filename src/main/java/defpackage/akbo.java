package defpackage;

/* renamed from: akbo */
public final class akbo extends aoca {
    public akbn a;
    public ajri b;
    private apxu[] c;
    public arnm frameworkUpdates;

    public akbo() {
        this.a = null;
        this.c = new apxu[0];
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbo) {
            akbo akbo = (akbo) obj;
            akbn akbn = this.a;
            if (akbn == null) {
                if (akbo.a != null) {
                    return false;
                }
            } else if (!akbn.equals(akbo.a)) {
                return false;
            }
            if (aocd.a(this.c, akbo.c)) {
                ajri ajri = this.b;
                if (ajri == null) {
                    if (akbo.b != null) {
                        return false;
                    }
                } else if (!ajri.equals(akbo.b)) {
                    return false;
                }
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (akbo.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(akbo.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akbo.unknownFieldData);
                }
                aocb aocb2 = akbo.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akbn akbn = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akbn != null ? akbn.hashCode() : 0;
        int a = aocd.a(this.c);
        ajri ajri = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajri != null ? ajri.hashCode() : 0;
        arnm arnm = this.frameworkUpdates;
        hashCode = (((hashCode + hashCode2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(4, anze);
                }
                i++;
            }
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        anze anze2 = this.frameworkUpdates;
        if (anze2 != null) {
            aoby.a(777, anze2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(4, anze);
                }
                i++;
            }
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        anze anze2 = this.frameworkUpdates;
        return anze2 != null ? computeSerializedSize + anwm.c(777, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new akbn();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                apxu[] apxuArr = this.c;
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
                this.c = apxuArr2;
            } else if (a == 42) {
                if (this.b == null) {
                    this.b = new ajri();
                }
                aobv.a(this.b);
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
