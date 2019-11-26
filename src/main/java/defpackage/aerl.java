package defpackage;

import android.util.SparseIntArray;

/* renamed from: aerl */
public final class aerl {
    public afne a;
    public SparseIntArray b;
    public aajs c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public final aerl a(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        return this;
    }

    public final aerm a() {
        StringBuilder stringBuilder = new StringBuilder(!this.e ? "SD" : "HD");
        if (this.f) {
            stringBuilder.append(",Allowed");
        }
        stringBuilder.append(",L");
        stringBuilder.append(this.d);
        if (this.g) {
            stringBuilder.append(",SS");
        }
        if (this.h) {
            stringBuilder.append(",KR");
        }
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                int keyAt = this.b.keyAt(i);
                stringBuilder.append(",");
                stringBuilder.append(keyAt);
                stringBuilder.append(this.b.get(keyAt));
            }
        }
        return new aerm(stringBuilder.toString(), (afne) amqw.a(this.a), this.c);
    }
}
