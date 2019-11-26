package defpackage;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

/* renamed from: pa */
final class pa implements TransitionListener {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ oz g;

    pa(oz ozVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = ozVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.a;
        if (obj != null) {
            this.g.b(obj, this.b, null);
        }
        obj = this.c;
        if (obj != null) {
            this.g.b(obj, this.d, null);
        }
        obj = this.e;
        if (obj != null) {
            this.g.b(obj, this.f, null);
        }
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
