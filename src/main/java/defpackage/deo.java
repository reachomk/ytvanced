package defpackage;

import android.os.Bundle;

/* renamed from: deo */
public final class deo {
    public String a;
    public String b;
    public dew c;
    public boolean d;
    public int e;
    public int[] f;
    public final Bundle g = new Bundle();
    public dfc h = dfc.a;
    public boolean i;
    public dfh j;

    deo() {
    }

    public final dep a() {
        if (this.a != null && this.b != null && this.c != null) {
            return new dep(this);
        }
        throw new IllegalArgumentException("Required fields were not populated.");
    }
}
