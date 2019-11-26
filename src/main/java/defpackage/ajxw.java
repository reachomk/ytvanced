package defpackage;

/* renamed from: ajxw */
public final class ajxw extends aoca {
    public ajxv a = null;
    public apxu[] b;
    public String c;
    public apxu d;
    public ajxy e;
    private String f;
    private apxu g;
    private axak h;
    private atfj[] i;
    private int j = 1;

    public ajxw() {
        String str = "";
        this.f = str;
        this.b = new apxu[0];
        this.c = str;
        this.e = null;
        this.i = new atfj[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxw) {
            ajxw ajxw = (ajxw) obj;
            if (this.j == ajxw.j) {
                ajxv ajxv = this.a;
                if (ajxv == null) {
                    if (ajxw.a != null) {
                        return false;
                    }
                } else if (!ajxv.equals(ajxw.a)) {
                    return false;
                }
                String str = this.f;
                if (str == null) {
                    if (ajxw.f != null) {
                        return false;
                    }
                } else if (!str.equals(ajxw.f)) {
                    return false;
                }
                if (aocd.a(this.b, ajxw.b)) {
                    str = this.c;
                    if (str == null) {
                        if (ajxw.c != null) {
                            return false;
                        }
                    } else if (!str.equals(ajxw.c)) {
                        return false;
                    }
                    apxu apxu = this.d;
                    if (apxu == null) {
                        if (ajxw.d != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxw.d)) {
                        return false;
                    }
                    apxu = this.g;
                    if (apxu == null) {
                        if (ajxw.g != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxw.g)) {
                        return false;
                    }
                    ajxy ajxy = this.e;
                    if (ajxy == null) {
                        if (ajxw.e != null) {
                            return false;
                        }
                    } else if (!ajxy.equals(ajxw.e)) {
                        return false;
                    }
                    axak axak = this.h;
                    if (axak == null) {
                        if (ajxw.h != null) {
                            return false;
                        }
                    } else if (!axak.equals(ajxw.h)) {
                        return false;
                    }
                    if (aocd.a(this.i, ajxw.i)) {
                        aocb aocb = this.unknownFieldData;
                        if (aocb != null && !aocb.b()) {
                            return this.unknownFieldData.equals(ajxw.unknownFieldData);
                        }
                        aocb aocb2 = ajxw.unknownFieldData;
                        return aocb2 == null || aocb2.b();
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        int i = this.j;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        ajxv ajxv = this.a;
        hashCode = (((hashCode + i) * 31) + (ajxv != null ? ajxv.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + aocd.a(this.b)) * 31;
        str = this.c;
        i = str != null ? str.hashCode() : 0;
        apxu apxu = this.d;
        hashCode = (hashCode + i) * 31;
        i = apxu != null ? apxu.hashCode() : 0;
        apxu = this.g;
        hashCode = (hashCode + i) * 31;
        i = apxu != null ? apxu.hashCode() : 0;
        ajxy ajxy = this.e;
        hashCode = (hashCode + i) * 31;
        i = ajxy != null ? ajxy.hashCode() : 0;
        axak axak = this.h;
        hashCode = (((((hashCode + i) * 31) + (axak != null ? axak.hashCode() : 0)) * 31) + aocd.a(this.i)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        int i = this.j;
        if (!(i == 1 || i == 0)) {
            aoby.a(2, i - 1);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        String str = this.f;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.f);
        }
        apxu[] apxuArr = this.b;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(7, anze);
                }
                i++;
            }
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            aoby.a(8, this.c);
        }
        anze anze2 = this.d;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            aoby.a(10, anze2);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(13, aocf);
        }
        anze2 = this.h;
        if (anze2 != null) {
            aoby.a(14, anze2);
        }
        atfj[] atfjArr = this.i;
        if (atfjArr != null && atfjArr.length > 0) {
            while (true) {
                atfjArr = this.i;
                if (i2 >= atfjArr.length) {
                    break;
                }
                anze2 = atfjArr[i2];
                if (anze2 != null) {
                    aoby.a(15, anze2);
                }
                i2++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.j;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(2, i - 1);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        String str = this.f;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(5, this.f);
        }
        apxu[] apxuArr = this.b;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(7, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(8, this.c);
        }
        anze anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(10, anze2);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(13, aocf);
        }
        anze2 = this.h;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(14, anze2);
        }
        atfj[] atfjArr = this.i;
        if (atfjArr != null && atfjArr.length > 0) {
            while (true) {
                atfjArr = this.i;
                if (i2 >= atfjArr.length) {
                    break;
                }
                anze2 = atfjArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(15, anze2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int i = 0;
            int f;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            switch (a) {
                case 0:
                    break;
                case 16:
                    int i2 = aobv.b;
                    f = aobv.f();
                    if (f == 0 || f == 1) {
                        if (f == 0) {
                            i = 1;
                        } else if (f == 1) {
                            i = 2;
                        }
                        this.j = i;
                        break;
                    }
                    aobv.e(i2);
                    storeUnknownField(aobv, a);
                    continue;
                case 26:
                    if (this.a == null) {
                        this.a = new ajxv();
                    }
                    aobv.a(this.a);
                    continue;
                case 42:
                    this.f = aobv.d();
                    continue;
                case 58:
                    a = aock.a(aobv, 58);
                    apxu[] apxuArr = this.b;
                    f = apxuArr != null ? apxuArr.length : 0;
                    apxu[] apxuArr2 = new apxu[(a + f)];
                    if (f != 0) {
                        System.arraycopy(apxuArr, 0, apxuArr2, 0, f);
                    }
                    while (f < apxuArr2.length - 1) {
                        apxuArr2[f] = (apxu) aobv.a(apxu.d.getParserForType());
                        aobv.a();
                        f++;
                    }
                    apxuArr2[f] = (apxu) aobv.a(apxu.d.getParserForType());
                    this.b = apxuArr2;
                    continue;
                case 66:
                    this.c = aobv.d();
                    continue;
                case 74:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.d;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.d = apxu;
                    continue;
                case 82:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.g;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.g = apxu;
                    continue;
                case 106:
                    if (this.e == null) {
                        this.e = new ajxy();
                    }
                    aobv.a(this.e);
                    continue;
                case 114:
                    axak axak = (axak) aobv.a(axak.a.getParserForType());
                    axak axak2 = this.h;
                    if (axak2 != null) {
                        axaj axaj = (axaj) ((anxo) axak2.toBuilder());
                        axaj.mergeFrom(axak);
                        axak = (axak) ((anxl) axaj.build());
                    }
                    this.h = axak;
                    continue;
                case afy.av /*122*/:
                    a = aock.a(aobv, (int) afy.av);
                    atfj[] atfjArr = this.i;
                    f = atfjArr != null ? atfjArr.length : 0;
                    atfj[] atfjArr2 = new atfj[(a + f)];
                    if (f != 0) {
                        System.arraycopy(atfjArr, 0, atfjArr2, 0, f);
                    }
                    while (f < atfjArr2.length - 1) {
                        atfjArr2[f] = (atfj) aobv.a(atfj.c.getParserForType());
                        aobv.a();
                        f++;
                    }
                    atfjArr2[f] = (atfj) aobv.a(atfj.c.getParserForType());
                    this.i = atfjArr2;
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
