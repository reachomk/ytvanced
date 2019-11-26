package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStartupLatencyActivity;
import com.google.android.youtube.R;

/* renamed from: agkj */
public final /* synthetic */ class agkj implements OnClickListener {
    private final DebugOfflineStartupLatencyActivity a;
    private final String b;
    private final int c;

    public agkj(DebugOfflineStartupLatencyActivity debugOfflineStartupLatencyActivity, String str, int i) {
        this.a = debugOfflineStartupLatencyActivity;
        this.b = str;
        this.c = i;
    }

    public final void onClick(View view) {
        Context context = this.a;
        String str = this.b;
        int i = this.c;
        Object[] objArr = new Object[1];
        int i2 = 0;
        objArr[0] = str;
        xpr.a(context, context.getString(R.string.downloading_videos_notification, objArr), 1);
        while (i2 < context.e.length && i2 < i) {
            context.d.k().a(context.e[i2], avsi.LD, agqq.OFFLINE_IMMEDIATELY, null, 0);
            i2++;
        }
        xpr.a(context, context.getString(R.string.complete_add_video_to_download_queue), 1);
    }
}
