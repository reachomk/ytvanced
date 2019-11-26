package defpackage;

import android.view.ViewStub;

/* renamed from: icu */
final class icu extends xto {
    private final /* synthetic */ ViewStub a;
    private final /* synthetic */ long b;

    icu(String str, ViewStub viewStub, long j) {
        this.a = viewStub;
        this.b = j;
        super(str);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        return new iet(this.a, this.b);
    }
}
