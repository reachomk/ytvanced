package defpackage;

import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: upn */
public final class upn implements Runnable {
    private final /* synthetic */ upf a;
    private final /* synthetic */ VideoTrimView b;

    public upn(VideoTrimView videoTrimView, upf upf) {
        this.b = videoTrimView;
        this.a = upf;
    }

    public final void run() {
        if (!this.b.p.a()) {
            upf upf = this.a;
            VideoTrimView videoTrimView = this.b;
            if (upf == videoTrimView.r) {
                videoTrimView.g = videoTrimView.e;
                videoTrimView.a(videoTrimView.n);
            }
        }
    }
}
