package defpackage;

import android.content.Context;

/* renamed from: ahnh */
public final class ahnh implements afjx {
    private final ahnq a;

    public ahnh(ahnq ahnq) {
        this.a = (ahnq) amqw.a((Object) ahnq);
    }

    public final afju a(afkn afkn, Context context, boolean z) {
        if (afkn == afkn.GL_GVR) {
            return new ahoq(context, this.a, z);
        }
        return afkn == afkn.GL_VPX ? new ahro(context) : null;
    }
}
