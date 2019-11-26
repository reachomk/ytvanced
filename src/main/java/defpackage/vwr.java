package defpackage;

import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;

/* renamed from: vwr */
public final class vwr {
    public final Object a;
    private final MuteAdEndpointOuterClass$MuteAdEndpoint b;
    private int c;

    public vwr(MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint, Object obj) {
        this.b = (MuteAdEndpointOuterClass$MuteAdEndpoint) amqw.a((Object) muteAdEndpointOuterClass$MuteAdEndpoint);
        this.a = obj;
    }

    public final int a() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        i = avip.a(this.b.b);
        if (i == 0) {
            i = 1;
        }
        i--;
        if (i == 1) {
            this.c = 2;
            return 2;
        } else if (i != 2) {
            this.c = 1;
            return 1;
        } else {
            this.c = 3;
            return 3;
        }
    }
}
