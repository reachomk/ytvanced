package defpackage;

/* renamed from: akap */
public final class akap extends ajwo {
    public akar a;
    public akas b;
    public atom c;
    public atoo d;
    public ajtn e;

    public akap() {
        super(51779735);
        this.a = null;
        this.b = null;
        this.e = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akap)) {
            return false;
        }
        akap akap = (akap) obj;
        akar akar = this.a;
        if (akar == null) {
            if (akap.a != null) {
                return false;
            }
        } else if (!akar.equals(akap.a)) {
            return false;
        }
        akas akas = this.b;
        if (akas == null) {
            if (akap.b != null) {
                return false;
            }
        } else if (!akas.equals(akap.b)) {
            return false;
        }
        atom atom = this.c;
        if (atom == null) {
            if (akap.c != null) {
                return false;
            }
        } else if (!atom.equals(akap.c)) {
            return false;
        }
        atoo atoo = this.d;
        if (atoo == null) {
            if (akap.d != null) {
                return false;
            }
        } else if (!atoo.equals(akap.d)) {
            return false;
        }
        ajtn ajtn = this.e;
        if (ajtn == null) {
            if (akap.e != null) {
                return false;
            }
        } else if (!ajtn.equals(akap.e)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akap.unknownFieldData);
        }
        aocb aocb2 = akap.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akar akar = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akar != null ? akar.hashCode() : 0;
        akas akas = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akas != null ? akas.hashCode() : 0;
        atom atom = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atom != null ? atom.hashCode() : 0;
        atoo atoo = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atoo != null ? atoo.hashCode() : 0;
        ajtn ajtn = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (ajtn != null ? ajtn.hashCode() : 0)) * 31;
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
        aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(6, aocf);
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
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        aocf = this.e;
        return aocf != null ? computeSerializedSize + aoby.b(6, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new akar();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new akas();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                atom atom = (atom) aobv.a(atom.c.getParserForType());
                atom atom2 = this.c;
                if (atom2 != null) {
                    atol atol = (atol) ((anxo) atom2.toBuilder());
                    atol.mergeFrom(atom);
                    atom = (atom) ((anxl) atol.build());
                }
                this.c = atom;
            } else if (a == 34) {
                atoo atoo = (atoo) aobv.a(atoo.c.getParserForType());
                atoo atoo2 = this.d;
                if (atoo2 != null) {
                    aton aton = (aton) ((anxo) atoo2.toBuilder());
                    aton.mergeFrom(atoo);
                    atoo = (atoo) ((anxl) aton.build());
                }
                this.d = atoo;
            } else if (a == 50) {
                if (this.e == null) {
                    this.e = new ajtn();
                }
                aobv.a(this.e);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
