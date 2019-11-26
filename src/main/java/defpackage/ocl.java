package defpackage;

import android.media.AudioTrack;

/* renamed from: ocl */
final class ocl extends Thread {
    private final /* synthetic */ AudioTrack a;
    private final /* synthetic */ ocm b;

    ocl(ocm ocm, AudioTrack audioTrack) {
        this.b = ocm;
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
