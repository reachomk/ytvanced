package defpackage;

import android.view.View;

/* renamed from: swc */
final class swc extends swk {
    public final View a;
    public final Integer b;
    public final Integer c;
    public final syb d;
    public final float e;
    public final boolean f;
    public final cxk g;

    public final View a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final syb d() {
        return this.d;
    }

    public final float e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final cxk g() {
        return this.g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        float f = this.e;
        boolean z = this.f;
        String valueOf5 = String.valueOf(this.g);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 198) + length2) + length3) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("ConversionContext{container=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", widthConstraint=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", heightConstraint=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", templateLoggerFactory=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", imagePrefetchRangeRatio=");
        stringBuilder.append(f);
        stringBuilder.append(", useIncrementalMountOnChildren=");
        stringBuilder.append(z);
        stringBuilder.append(", recyclerBinderConfiguration=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof swk) {
            swk swk = (swk) obj;
            View view = this.a;
            if (view == null ? swk.a() != null : !view.equals(swk.a())) {
                Integer num = this.b;
                if (num == null ? swk.b() != null : !num.equals(swk.b())) {
                    num = this.c;
                    if (num == null ? swk.c() != null : !num.equals(swk.c())) {
                        syb syb = this.d;
                        if (syb == null ? swk.d() == null : syb.equals(swk.d())) {
                            return Float.floatToIntBits(this.e) == Float.floatToIntBits(swk.e()) && this.f == swk.f() && this.g.equals(swk.g());
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        View view = this.a;
        int i = 0;
        int hashCode = ((view != null ? view.hashCode() : 0) ^ 1000003) * 1000003;
        Integer num = this.b;
        hashCode = (hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003;
        num = this.c;
        hashCode = (hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003;
        syb syb = this.d;
        if (syb != null) {
            i = syb.hashCode();
        }
        return ((((((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ (!this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    public final swj h() {
        return new swb(this);
    }

    /* synthetic */ swc(View view, Integer num, Integer num2, syb syb, float f, boolean z, cxk cxk) {
        this.a = view;
        this.b = num;
        this.c = num2;
        this.d = syb;
        this.e = f;
        this.f = z;
        this.g = cxk;
    }
}
