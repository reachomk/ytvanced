package defpackage;

import android.media.AudioTrack;

/* renamed from: nnq */
final class nnq extends Thread {
    private final /* synthetic */ AudioTrack a;
    private final /* synthetic */ nnn b;

    nnq(nnn nnn, AudioTrack audioTrack) {
        this.b = nnn;
        this.a = audioTrack;
    }

    public final void run() {
        try {
            this.a.flush();
            this.a.release();
        } finally {
            this.b.a.open();
        }
    }
}
