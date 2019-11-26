package defpackage;

import android.media.VolumeProvider;

/* renamed from: vt */
final class vt extends VolumeProvider {
    private final /* synthetic */ vq a;

    vt(vq vqVar, int i, int i2, int i3) {
        this.a = vqVar;
        super(i, i2, i3);
    }

    public final void onSetVolumeTo(int i) {
        this.a.a(i);
    }

    public final void onAdjustVolume(int i) {
        this.a.b(i);
    }
}
