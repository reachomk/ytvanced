package defpackage;

import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: upl */
public final class upl implements Runnable {
    private final /* synthetic */ VideoTrimView a;

    public upl(VideoTrimView videoTrimView) {
        this.a = videoTrimView;
    }

    public final void run() {
        this.a.e();
    }
}
