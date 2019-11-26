package defpackage;

import com.google.android.libraries.video.trim.VideoTrimView;

/* renamed from: upm */
public final /* synthetic */ class upm implements Runnable {
    private final VideoTrimView a;
    private final ups b;
    private final ujf c;

    public upm(VideoTrimView videoTrimView, ups ups, ujf ujf) {
        this.a = videoTrimView;
        this.b = ups;
        this.c = ujf;
    }

    public final void run() {
        VideoTrimView videoTrimView = this.a;
        ups ups = this.b;
        ujf ujf = this.c;
        videoTrimView.a(ups);
        videoTrimView.i.a = ujf;
        videoTrimView.requestLayout();
    }
}
