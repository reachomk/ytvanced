package defpackage;

import android.util.Log;

/* renamed from: baea */
public final class baea implements baee {
    private final int a = 2;
    private final baeu b;

    public baea(baeu baeu) {
        this.b = (baeu) nwf.a((Object) baeu);
    }

    public final baef a(int i, int i2) {
        int i3;
        String str = "AmbisonicAudioRendererFactory";
        if (i2 == 4) {
            i3 = 4;
        } else if (i2 != 6) {
            Log.e(str, "Unsupported number of input channels");
            i3 = 0;
        } else {
            i3 = 7;
        }
        if (i3 != 0) {
            try {
                return new baeh(i, this.a, i2, this.b, i3);
            } catch (Exception e) {
                Log.e(str, "Error creating native spatializing audio processor; creating no-op processor instead", e);
            }
        }
        return new baej(this.a);
    }
}
