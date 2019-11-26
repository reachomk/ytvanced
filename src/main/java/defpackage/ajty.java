package defpackage;

/* renamed from: ajty */
public final class ajty extends aoca {
    public ajtx a;
    public awlu b;
    public ajri c;
    public boolean d;
    private apxu[] e;
    public arnm frameworkUpdates;

    public ajty() {
        this.a = null;
        this.e = new apxu[0];
        this.c = null;
        this.d = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajty) {
            ajty ajty = (ajty) obj;
            ajtx ajtx = this.a;
            if (ajtx == null) {
                if (ajty.a != null) {
                    return false;
                }
            } else if (!ajtx.equals(ajty.a)) {
                return false;
            }
            awlu awlu = this.b;
            if (awlu == null) {
                if (ajty.b != null) {
                    return false;
                }
            } else if (!awlu.equals(ajty.b)) {
                return false;
            }
            if (aocd.a(this.e, ajty.e)) {
                ajri ajri = this.c;
                if (ajri == null) {
                    if (ajty.c != null) {
                        return false;
                    }
                } else if (!ajri.equals(ajty.c)) {
                    return false;
                }
                if (this.d == ajty.d) {
                    arnm arnm = this.frameworkUpdates;
                    if (arnm == null) {
                        if (ajty.frameworkUpdates != null) {
                            return false;
                        }
                    } else if (!arnm.equals(ajty.frameworkUpdates)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajty.unknownFieldData);
                    }
                    aocb aocb2 = ajty.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtx ajtx = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajtx != null ? ajtx.hashCode() : 0;
        awlu awlu = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awlu != null ? awlu.hashCode() : 0;
        int a = aocd.a(this.e);
        ajri ajri = this.c;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (ajri != null ? ajri.hashCode() : 0)) * 31;
        hashCode2 = !this.d ? 1237 : 1231;
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
        anze anze = this.b;
        if (anze != null) {
            aoby.a(5, anze);
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
                    aoby.a(6, anze2);
                }
                i++;
            }
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        if (this.d) {
            aoby.a(8, true);
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
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
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
                    computeSerializedSize += anwm.c(6, anze2);
                }
                i++;
            }
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        if (this.d) {
            computeSerializedSize += aoby.d(8);
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajtx();
                }
                aobv.a(this.a);
            } else if (a == 42) {
                awlu awlu = (awlu) aobv.a(awlu.c.getParserForType());
                awlu awlu2 = this.b;
                if (awlu2 != null) {
                    awlx awlx = (awlx) ((anxo) awlu2.toBuilder());
                    awlx.mergeFrom(awlu);
                    awlu = (awlu) ((anxl) awlx.build());
                }
                this.b = awlu;
            } else if (a == 50) {
                a = aock.a(aobv, 50);
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
            } else if (a == 58) {
                if (this.c == null) {
                    this.c = new ajri();
                }
                aobv.a(this.c);
            } else if (a == 64) {
                this.d = aobv.c();
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
