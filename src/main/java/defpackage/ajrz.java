package defpackage;

/* renamed from: ajrz */
public final class ajrz extends aoca {
    public aplf a;
    public ajtv b;
    public apkz c;

    public ajrz() {
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajrz)) {
            return false;
        }
        ajrz ajrz = (ajrz) obj;
        aplf aplf = this.a;
        if (aplf == null) {
            if (ajrz.a != null) {
                return false;
            }
        } else if (!aplf.equals(ajrz.a)) {
            return false;
        }
        ajtv ajtv = this.b;
        if (ajtv == null) {
            if (ajrz.b != null) {
                return false;
            }
        } else if (!ajtv.equals(ajrz.b)) {
            return false;
        }
        apkz apkz = this.c;
        if (apkz == null) {
            if (ajrz.c != null) {
                return false;
            }
        } else if (!apkz.equals(ajrz.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajrz.unknownFieldData);
        }
        aocb aocb2 = ajrz.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aplf aplf = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aplf != null ? aplf.hashCode() : 0;
        ajtv ajtv = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtv != null ? ajtv.hashCode() : 0;
        apkz apkz = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (apkz != null ? apkz.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(75328637, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(86209186, aocf);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(91428091, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(75328637, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(86209186, aocf);
        }
        anze = this.c;
        return anze != null ? computeSerializedSize + anwm.c(91428091, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 602629098) {
                aplf aplf = (aplf) aobv.a(aplf.f.getParserForType());
                aplf aplf2 = this.a;
                if (aplf2 != null) {
                    aple aple = (aple) ((anxo) aplf2.toBuilder());
                    aple.mergeFrom(aplf);
                    aplf = (aplf) ((anxl) aple.build());
                }
                this.a = aplf;
            } else if (a == 689673490) {
                if (this.b == null) {
                    this.b = new ajtv();
                }
                aobv.a(this.b);
            } else if (a == 731424730) {
                apkz apkz = (apkz) aobv.a(apkz.j.getParserForType());
                apkz apkz2 = this.c;
                if (apkz2 != null) {
                    apky apky = (apky) ((anxo) apkz2.toBuilder());
                    apky.mergeFrom(apkz);
                    apkz = (apkz) ((anxl) apky.build());
                }
                this.c = apkz;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
