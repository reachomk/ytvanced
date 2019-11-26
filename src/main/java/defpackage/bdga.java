package defpackage;

/* renamed from: bdga */
public final class bdga extends aoca {
    public static final aobz a = aobz.a(bdga.class, 1350198106);
    public String b;
    public String c;
    public String d;
    public boolean e;
    private String f;
    private azsd[] g;

    public bdga() {
        String str = "";
        this.b = str;
        this.c = str;
        this.f = str;
        this.d = str;
        this.g = new azsd[0];
        this.e = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdga) {
            bdga bdga = (bdga) obj;
            String str = this.b;
            if (str == null) {
                if (bdga.b != null) {
                    return false;
                }
            } else if (!str.equals(bdga.b)) {
                return false;
            }
            str = this.c;
            if (str == null) {
                if (bdga.c != null) {
                    return false;
                }
            } else if (!str.equals(bdga.c)) {
                return false;
            }
            str = this.f;
            if (str == null) {
                if (bdga.f != null) {
                    return false;
                }
            } else if (!str.equals(bdga.f)) {
                return false;
            }
            str = this.d;
            if (str == null) {
                if (bdga.d != null) {
                    return false;
                }
            } else if (!str.equals(bdga.d)) {
                return false;
            }
            if (aocd.a(this.g, bdga.g) && this.e == bdga.e) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdga.unknownFieldData);
                }
                aocb aocb2 = bdga.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + aocd.a(this.g)) * 31) + (!this.e ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.b);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            aoby.a(2, this.c);
        }
        str = this.f;
        if (!(str == null || str.equals(str2))) {
            aoby.a(3, this.f);
        }
        str = this.d;
        if (!(str == null || str.equals(str2))) {
            aoby.a(4, this.d);
        }
        azsd[] azsdArr = this.g;
        if (azsdArr != null && azsdArr.length > 0) {
            int i = 0;
            while (true) {
                azsd[] azsdArr2 = this.g;
                if (i >= azsdArr2.length) {
                    break;
                }
                azsd azsd = azsdArr2[i];
                if (azsd != null) {
                    aoby.a(5, azsd.a);
                }
                i++;
            }
        }
        if (this.e) {
            aoby.a(6, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(2, this.c);
        }
        str = this.f;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(3, this.f);
        }
        str = this.d;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(4, this.d);
        }
        azsd[] azsdArr = this.g;
        if (azsdArr != null && azsdArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                azsd[] azsdArr2 = this.g;
                if (i2 >= azsdArr2.length) {
                    break;
                }
                azsd azsd = azsdArr2[i2];
                if (azsd != null) {
                    i3 += aoby.e(azsd.a);
                }
                i2++;
            }
            computeSerializedSize += i3;
            while (true) {
                azsd[] azsdArr3 = this.g;
                if (i >= azsdArr3.length) {
                    break;
                }
                if (azsdArr3[i] != null) {
                    computeSerializedSize++;
                }
                i++;
            }
        }
        return this.e ? computeSerializedSize + aoby.d(6) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            azsd[] azsdArr;
            int i;
            int i2;
            azsd[] azsdArr2;
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (a == 18) {
                this.c = aobv.d();
            } else if (a == 26) {
                this.f = aobv.d();
            } else if (a == 34) {
                this.d = aobv.d();
            } else if (a == 40) {
                int a2 = aock.a(aobv, 40);
                azsdArr = new azsd[a2];
                i = 0;
                for (i2 = 0; i2 < a2; i2++) {
                    if (i2 != 0) {
                        aobv.a();
                    }
                    int i3 = aobv.b;
                    int f = aobv.f();
                    switch (f) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i3 = i + 1;
                            azsdArr[i] = azsd.a(f);
                            i = i3;
                            break;
                        default:
                            aobv.e(i3);
                            storeUnknownField(aobv, a);
                            break;
                    }
                }
                if (i != 0) {
                    azsd[] azsdArr3 = this.g;
                    a2 = azsdArr3 != null ? azsdArr3.length : 0;
                    if (a2 == 0 && i == azsdArr.length) {
                        this.g = azsdArr;
                    } else {
                        azsdArr2 = new azsd[(a2 + i)];
                        if (a2 != 0) {
                            System.arraycopy(azsdArr3, 0, azsdArr2, 0, a2);
                        }
                        System.arraycopy(azsdArr, 0, azsdArr2, a2, i);
                        this.g = azsdArr2;
                    }
                }
            } else if (a == 42) {
                a = aobv.c(aobv.f());
                int i4 = aobv.b;
                i2 = 0;
                while (aobv.k() > 0) {
                    switch (aobv.f()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i2++;
                            break;
                        default:
                            break;
                    }
                }
                if (i2 != 0) {
                    aobv.e(i4);
                    azsdArr = this.g;
                    i = azsdArr != null ? azsdArr.length : 0;
                    azsdArr2 = new azsd[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(azsdArr, 0, azsdArr2, 0, i);
                    }
                    while (aobv.k() > 0) {
                        int i5 = aobv.b;
                        i4 = aobv.f();
                        switch (i4) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i5 = i + 1;
                                azsdArr2[i] = azsd.a(i4);
                                i = i5;
                                break;
                            default:
                                aobv.e(i5);
                                storeUnknownField(aobv, 40);
                                break;
                        }
                    }
                    this.g = azsdArr2;
                }
                aobv.d(a);
            } else if (a == 48) {
                this.e = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
