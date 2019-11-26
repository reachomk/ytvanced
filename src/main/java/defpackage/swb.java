package defpackage;

import android.view.View;

/* renamed from: swb */
final class swb extends swj {
    public syb a;
    private View b;
    private Integer c;
    private Integer d;
    private Float e;
    private Boolean f;
    private cxk g;

    swb() {
    }

    public final swj a(View view) {
        this.b = view;
        return this;
    }

    public final swj a(Integer num) {
        this.c = num;
        return this;
    }

    public final swj b(Integer num) {
        this.d = num;
        return this;
    }

    public final swj a(syb syb) {
        this.a = syb;
        return this;
    }

    public final swj a(float f) {
        this.e = Float.valueOf(f);
        return this;
    }

    public final swj a(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public final swj a(cxk cxk) {
        if (cxk != null) {
            this.g = cxk;
            return this;
        }
        throw new NullPointerException("Null recyclerBinderConfiguration");
    }

    public final swk a() {
        String str = "";
        if (this.e == null) {
            str = str.concat(" imagePrefetchRangeRatio");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" useIncrementalMountOnChildren");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" recyclerBinderConfiguration");
        }
        if (str.isEmpty()) {
            return new swc(this.b, this.c, this.d, this.a, this.e.floatValue(), this.f.booleanValue(), this.g);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ swb(swk swk) {
        swc swc = (swc) swk;
        this.b = swc.a;
        this.c = swc.b;
        this.d = swc.c;
        this.a = swc.d;
        this.e = Float.valueOf(swc.e);
        this.f = Boolean.valueOf(swc.f);
        this.g = swc.g;
    }
}
