package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* renamed from: pd */
final class pd extends EpicenterCallback {
    private final /* synthetic */ Rect a;

    pd(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.a;
        return (rect == null || rect.isEmpty()) ? null : this.a;
    }
}
