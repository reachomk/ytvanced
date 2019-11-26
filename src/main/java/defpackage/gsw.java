package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.youtube.R;

/* renamed from: gsw */
final /* synthetic */ class gsw implements xar {
    private final gso a;

    gsw(gso gso) {
        this.a = gso;
    }

    public final void accept(Object obj) {
        gso gso = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        gso.ad = booleanValue;
        if (booleanValue) {
            boolean z = true;
            amqw.b(gso.T != null, (Object) "Video editing fragment is not initialized");
            View findViewById = gso.a.findViewById(R.id.video_edit_fragment_container);
            zrr zrr = gso.T;
            ViewParent viewParent = gso.K;
            amqw.a((Object) viewParent, (Object) "Upload video edit fragment scroll container does not exist");
            View view = findViewById == null ? zrr.K : findViewById;
            amqw.b(view != null, (Object) "Upload video edit fragment root view does not exist");
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewParent) {
                    break;
                }
            }
            z = false;
            amqw.a(z);
            zrr.a = viewParent;
            zrr.a.getViewTreeObserver().addOnScrollChangedListener(zrr);
            findViewById.setVisibility(0);
        }
        gso.a(4);
    }
}
