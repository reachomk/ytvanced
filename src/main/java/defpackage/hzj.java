package defpackage;

import android.content.Context;

/* renamed from: hzj */
public final class hzj extends zvv implements iiz {
    private boolean g;

    public hzj(Context context, zvs zvs, bcud bcud, zwj zwj, zwh zwh, vvh vvh, aiac aiac) {
        super(context, zvs, bcud, zwj, zwh, vvh, aiac);
    }

    public final void a(zud zud, long j, long j2) {
        if (!this.g) {
            super.a(zud, j, j2);
        }
    }

    public final void a(int i, boolean z) {
        boolean z2 = i != 0;
        this.g = z2;
        if (z2) {
            a(false);
        }
    }
}
