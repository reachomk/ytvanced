package defpackage;

import java.util.Arrays;

/* renamed from: bdhk */
public final class bdhk extends aoca {
    public static volatile bdhk[] a;
    public int b;
    public int c;
    private int d;
    private String e;
    private byte[] f;
    private bdhj g;

    public final String a() {
        if (this.d != 0) {
            return "";
        }
        return this.e;
    }

    public final boolean b() {
        return this.d == 0;
    }

    public final bdhj c() {
        if (this.d != 2) {
            return null;
        }
        return this.g;
    }

    public final boolean d() {
        return this.d == 2;
    }

    public bdhk() {
        this.d = -1;
        this.g = null;
        this.b = 0;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhk) {
            bdhk bdhk = (bdhk) obj;
            String str = this.e;
            if (str == null) {
                if (bdhk.e != null) {
                    return false;
                }
            } else if (!str.equals(bdhk.e)) {
                return false;
            }
            if (Arrays.equals(this.f, bdhk.f)) {
                bdhj bdhj = this.g;
                if (bdhj == null) {
                    if (bdhk.g != null) {
                        return false;
                    }
                } else if (!bdhj.equals(bdhk.g)) {
                    return false;
                }
                if (this.b == bdhk.b && this.c == bdhk.c) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(bdhk.unknownFieldData);
                    }
                    aocb aocb2 = bdhk.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.e;
        int i = 0;
        hashCode = ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f);
        bdhj bdhj = this.g;
        if (this.d != 2) {
            bdhj = null;
        }
        hashCode = ((((((hashCode * 31) + (bdhj != null ? bdhj.hashCode() : 0)) * 31) + this.b) * 31) + this.c) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        if (this.d == 0) {
            aoby.a(1, this.e);
        }
        if (this.d == 1) {
            aoby.a(2, this.f);
        }
        if (this.d == 2) {
            aoby.a(3, this.g);
        }
        int i = this.b;
        if (i != 0) {
            aoby.b(4, i);
        }
        i = this.c;
        if (i != 0) {
            aoby.b(5, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.d == 0) {
            computeSerializedSize += aoby.b(1, this.e);
        }
        if (this.d == 1) {
            computeSerializedSize += aoby.b(2, this.f);
        }
        if (this.d == 2) {
            computeSerializedSize += aoby.b(3, this.g);
        }
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.d(4, i);
        }
        i = this.c;
        return i != 0 ? computeSerializedSize + aoby.d(5, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.e = aobv.d();
                this.d = 0;
            } else if (a == 18) {
                this.f = aobv.e();
                this.d = 1;
            } else if (a == 26) {
                if (this.g == null) {
                    this.g = new bdhj();
                }
                aobv.a(this.g);
                this.d = 2;
            } else if (a == 32) {
                this.b = aobv.f();
            } else if (a == 40) {
                this.c = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
