package defpackage;

import android.animation.Animator;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbj */
public final /* synthetic */ class zbj implements amro {
    private final HeartView a;

    public zbj(HeartView heartView) {
        this.a = heartView;
    }

    public final Object get() {
        HeartView heartView = this.a;
        Animator a = HeartView.a(heartView.g, heartView.b, heartView.a, 400);
        a.addListener(new zbm(heartView));
        return a;
    }
}
