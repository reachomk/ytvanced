package defpackage;

import android.graphics.PathEffect;
import com.facebook.yoga.YogaEdge;

/* renamed from: cln */
public final class cln {
    private final clo a;
    private cqw b;
    private final PathEffect[] c = new PathEffect[2];

    cln(cmg cmg) {
        this.b = new cqw(cmg);
        this.a = new clo();
    }

    public final cln a(YogaEdge yogaEdge, float f) {
        b();
        int a = this.b.a(f);
        b();
        clo clo = this.a;
        if (a >= 0) {
            clo.a(clo.b, yogaEdge, a);
            return this;
        }
        String name = yogaEdge.name();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 56);
        stringBuilder.append("Given negative border width value: ");
        stringBuilder.append(a);
        stringBuilder.append(" for edge ");
        stringBuilder.append(name);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final cln a(float f) {
        b();
        int a = this.b.a(f);
        b();
        for (int i = 0; i < 4; i++) {
            this.a.a[i] = (float) a;
        }
        return this;
    }

    public final cln a(int i, float f) {
        b();
        int a = this.b.a(f);
        b();
        this.a.a[i] = (float) a;
        return this;
    }

    public final cln a(YogaEdge yogaEdge, int i) {
        b();
        clo.a(this.a.c, yogaEdge, i);
        return this;
    }

    public final clo a() {
        b();
        this.b.a();
        this.b = null;
        return this.a;
    }

    private final void b() {
        if (this.b == null) {
            throw new IllegalStateException("This builder has already been disposed / built!");
        }
    }
}
