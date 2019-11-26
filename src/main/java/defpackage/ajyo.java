package defpackage;

/* renamed from: ajyo */
public final class ajyo extends aoca implements ajzh {
    public arwf a;
    public arml b;
    public arml c;
    public apxu[] d;
    public apxu[] e;
    public ajzw f;
    public awqw g;
    public awqa h;
    private boolean i;
    private boolean j;
    private boolean k;

    public ajyo() {
        this.d = new apxu[0];
        this.e = new apxu[0];
        this.f = null;
        this.cachedSize = -1;
    }

    public final boolean c() {
        return true;
    }

    public final void d() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyo) {
            ajyo ajyo = (ajyo) obj;
            arwf arwf = this.a;
            if (arwf == null) {
                if (ajyo.a != null) {
                    return false;
                }
            } else if (!arwf.equals(ajyo.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajyo.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajyo.b)) {
                return false;
            }
            arml = this.c;
            if (arml == null) {
                if (ajyo.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajyo.c)) {
                return false;
            }
            if (aocd.a(this.d, ajyo.d) && aocd.a(this.e, ajyo.e)) {
                ajzw ajzw = this.f;
                if (ajzw == null) {
                    if (ajyo.f != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajyo.f)) {
                    return false;
                }
                awqw awqw = this.g;
                if (awqw == null) {
                    if (ajyo.g != null) {
                        return false;
                    }
                } else if (!awqw.equals(ajyo.g)) {
                    return false;
                }
                awqa awqa = this.h;
                if (awqa == null) {
                    if (ajyo.h != null) {
                        return false;
                    }
                } else if (!awqa.equals(ajyo.h)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajyo.unknownFieldData);
                }
                aocb aocb2 = ajyo.unknownFieldData;
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
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        int a = aocd.a(this.d);
        int a2 = aocd.a(this.e);
        ajzw ajzw = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + a2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        awqw awqw = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awqw != null ? awqw.hashCode() : 0;
        awqa awqa = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (awqa != null ? awqa.hashCode() : 0)) * 31;
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
        apxu[] apxuArr = this.d;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i2];
                if (anze2 != null) {
                    aoby.a(4, anze2);
                }
                i2++;
            }
        }
        apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.e;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(5, anze);
                }
                i++;
            }
        }
        aocf aocf = this.f;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
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
        apxu[] apxuArr = this.d;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(4, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.e;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(5, anze);
                }
                i++;
            }
        }
        aocf aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.h;
        return anze != null ? computeSerializedSize + anwm.c(8, anze) : computeSerializedSize;
    }

    public final boolean a() {
        return this.i;
    }

    public final void b() {
        this.i = true;
    }

    public final boolean e() {
        return this.j;
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final boolean f() {
        return this.k;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            apxu[] apxuArr;
            int length;
            apxu[] apxuArr2;
            if (a == 0) {
                break;
            } else if (a == 10) {
                arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf arwf2 = this.a;
                if (arwf2 != null) {
                    arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.a = arwf;
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
                a = aock.a(aobv, 34);
                apxuArr = this.d;
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
                this.d = apxuArr2;
            } else if (a == 42) {
                a = aock.a(aobv, 42);
                apxuArr = this.e;
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
                this.e = apxuArr2;
            } else if (a == 50) {
                if (this.f == null) {
                    this.f = new ajzw();
                }
                aobv.a(this.f);
            } else if (a == 58) {
                awqw awqw = (awqw) aobv.a(awqw.d.getParserForType());
                awqw awqw2 = this.g;
                if (awqw2 != null) {
                    awqz awqz = (awqz) ((anxo) awqw2.toBuilder());
                    awqz.mergeFrom(awqw);
                    awqw = (awqw) ((anxl) awqz.build());
                }
                this.g = awqw;
            } else if (a == 66) {
                awqa awqa = (awqa) aobv.a(awqa.c.getParserForType());
                awqa awqa2 = this.h;
                if (awqa2 != null) {
                    awqd awqd = (awqd) ((anxo) awqa2.toBuilder());
                    awqd.mergeFrom(awqa);
                    awqa = (awqa) ((anxl) awqd.build());
                }
                this.h = awqa;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
