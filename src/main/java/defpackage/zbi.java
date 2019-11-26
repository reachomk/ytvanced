package defpackage;

import android.animation.Animator;
import com.google.android.libraries.youtube.conversation.ui.HeartView;

/* renamed from: zbi */
public final /* synthetic */ class zbi implements amro {
    private final HeartView a;

    public zbi(HeartView heartView) {
        this.a = heartView;
    }

    public final Object get() {
        HeartView heartView = this.a;
        Animator a = HeartView.a(heartView.g, heartView.a, heartView.b, 200);
        a.addListener(new zbp(heartView));
        return a;
    }
}
