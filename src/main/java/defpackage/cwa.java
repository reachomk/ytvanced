package defpackage;

/* renamed from: cwa */
final class cwa {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    cwa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    cwa() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    /* Access modifiers changed, original: final */
    public final cwa a(cwa cwa) {
        if (cwa == null) {
            return null;
        }
        return new cwa(this.a + cwa.a, this.b + cwa.b, this.c + cwa.c, this.d + cwa.d, this.e + cwa.e, this.f + cwa.f, this.g + cwa.g, cwa.h + this.h);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        StringBuilder stringBuilder = new StringBuilder(263);
        stringBuilder.append("ChangeSetStats{mEffectiveChangesCount=");
        stringBuilder.append(i);
        stringBuilder.append(", mInsertSingleCount=");
        stringBuilder.append(i2);
        stringBuilder.append(", mInsertRangeCount=");
        stringBuilder.append(i3);
        stringBuilder.append(", mDeleteSingleCount=");
        stringBuilder.append(i4);
        stringBuilder.append(", mDeleteRangeCount=");
        stringBuilder.append(i5);
        stringBuilder.append(", mUpdateSingleCount=");
        stringBuilder.append(i6);
        stringBuilder.append(", mUpdateRangeCount=");
        stringBuilder.append(i7);
        stringBuilder.append(", mMoveCount=");
        stringBuilder.append(i8);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cwa cwa = (cwa) obj;
            return this.a == cwa.a && this.b == cwa.b && this.c == cwa.c && this.d == cwa.d && this.e == cwa.e && this.f == cwa.f && this.g == cwa.g && this.h == cwa.h;
        }
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }
}
