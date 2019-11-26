package defpackage;

/* renamed from: aker */
final class aker extends akhr {
    private final int a;
    private final float b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int l;
    private final float m;
    private final boolean n;
    private final boolean o;
    private final float p;

    public final int a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public final float m() {
        return this.m;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final float p() {
        return this.p;
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        boolean z8 = this.j;
        boolean z9 = this.k;
        int i2 = this.l;
        float f2 = this.m;
        boolean z10 = this.n;
        boolean z11 = this.o;
        float f3 = this.p;
        StringBuilder stringBuilder = new StringBuilder(547);
        stringBuilder.append("SurfaceConfig{lithoInitRange=");
        stringBuilder.append(i);
        stringBuilder.append(", lithoRangeRatio=");
        stringBuilder.append(f);
        stringBuilder.append(", useAdapterProxy=");
        stringBuilder.append(z);
        stringBuilder.append(", recyclerViewItemPrefetch=");
        stringBuilder.append(z2);
        stringBuilder.append(", recyclerViewFixedSize=");
        stringBuilder.append(z3);
        stringBuilder.append(", recyclerViewDisableViewCache=");
        stringBuilder.append(z4);
        stringBuilder.append(", useIncrementalMountForRb=");
        stringBuilder.append(z5);
        stringBuilder.append(", scheduleAsyncInitRangeOne=");
        stringBuilder.append(z6);
        stringBuilder.append(", scheduleAsyncInitRangeAll=");
        stringBuilder.append(z7);
        stringBuilder.append(", useSizeSpecYouTubeElement=");
        stringBuilder.append(z8);
        stringBuilder.append(", useAsyncPresenterPreparation=");
        stringBuilder.append(z9);
        stringBuilder.append(", asyncPrepareInitRange=");
        stringBuilder.append(i2);
        stringBuilder.append(", asyncPrepareRangeRatio=");
        stringBuilder.append(f2);
        stringBuilder.append(", useIncrementalMountForAsyncPrepare=");
        stringBuilder.append(z10);
        stringBuilder.append(", useFlatbufferRuntime=");
        stringBuilder.append(z11);
        stringBuilder.append(", imagePrefetchRangeRatio=");
        stringBuilder.append(f3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhr) {
            akhr akhr = (akhr) obj;
            return this.a == akhr.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(akhr.b()) && this.c == akhr.c() && this.d == akhr.d() && this.e == akhr.e() && this.f == akhr.f() && this.g == akhr.g() && this.h == akhr.h() && this.i == akhr.i() && this.j == akhr.j() && this.k == akhr.k() && this.l == akhr.l() && Float.floatToIntBits(this.m) == Float.floatToIntBits(akhr.m()) && this.n == akhr.n() && this.o == akhr.o() && Float.floatToIntBits(this.p) == Float.floatToIntBits(akhr.p());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int floatToIntBits = (((((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ (!this.f ? 1237 : 1231)) * 1000003) ^ (!this.g ? 1237 : 1231)) * 1000003) ^ (!this.h ? 1237 : 1231)) * 1000003) ^ (!this.i ? 1237 : 1231)) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ (!this.k ? 1237 : 1231)) * 1000003) ^ this.l) * 1000003) ^ Float.floatToIntBits(this.m)) * 1000003) ^ (!this.n ? 1237 : 1231)) * 1000003;
        if (this.o) {
            i = 1231;
        }
        return ((floatToIntBits ^ i) * 1000003) ^ Float.floatToIntBits(this.p);
    }

    /* synthetic */ aker(int i, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f2, boolean z10, boolean z11, float f3) {
        this.a = i;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = i2;
        this.m = f2;
        this.n = z10;
        this.o = z11;
        this.p = f3;
    }
}
