package defpackage;

import android.media.AudioAttributes.Builder;

/* renamed from: tn */
class tn implements tl {
    public final Builder a = new Builder();

    tn() {
    }

    public ti a() {
        return new tk(this.a.build());
    }

    public final /* synthetic */ tl a(int i) {
        this.a.setLegacyStreamType(i);
        return this;
    }
}
