package defpackage;

/* renamed from: aqs */
public final class aqs {
    public int a = 0;
    public int b = 0;
    public int c = aocf.UNSET_ENUM_VALUE;
    public int d = aocf.UNSET_ENUM_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != aocf.UNSET_ENUM_VALUE) {
                this.a = i2;
            }
            if (i != aocf.UNSET_ENUM_VALUE) {
                this.b = i;
                return;
            }
        }
        if (i != aocf.UNSET_ENUM_VALUE) {
            this.a = i;
        }
        if (i2 != aocf.UNSET_ENUM_VALUE) {
            this.b = i2;
        }
    }
}
