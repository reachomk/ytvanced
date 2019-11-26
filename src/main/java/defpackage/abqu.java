package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
import java.util.Map;

/* renamed from: abqu */
public final class abqu implements aaap {
    private nn a;

    public abqu(Activity activity) {
        if (activity instanceof nn) {
            this.a = (nn) activity;
        }
    }

    public final void a(apxu apxu, Map map) {
        if (this.a != null) {
            apxu apxu2 = (apxu) xsb.a(map, (Object) "ticker_applied_action", apxu.class);
            anxr access$000 = anxl.checkIsLite(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.showLiveChatItemEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint) b;
            abst abst = new abst();
            Bundle bundle = new Bundle();
            bundle.putByteArray("endpoint", showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.toByteArray());
            if (apxu2 != null) {
                bundle.putByteArray("applied_action", apxu2.toByteArray());
            }
            abst.f(bundle);
            abst.i_(true);
            View view = (View) xsb.a(map, (Object) "live_chat_ticker_view", View.class);
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                abst.ae = Integer.valueOf(iArr[1] + view.getHeight());
                if (((Boolean) xsb.c(map, "is_fullscreen", Boolean.valueOf(false))).booleanValue()) {
                    int width = view.getWidth();
                    abst.ac = i;
                    abst.ad = width;
                }
            }
            abst.a(this.a.f(), "show_live_chat_item");
        }
    }
}
