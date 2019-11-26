package defpackage;

import android.view.View.MeasureSpec;
import com.facebook.litho.ComponentTree;

/* renamed from: dda */
public final class dda {
    static void a(cmg cmg, int i, int i2, crd crd, ComponentTree componentTree, cma cma, boolean z, boolean z2) {
        if (z && !(z2 && MeasureSpec.getMode(i2) == aocf.UNSET_ENUM_VALUE)) {
            ctb a = ctc.a(cmg);
            a.a(cma);
            cma = (ctc) ((ctb) a.a(MeasureSpec.getSize(i2))).c();
        }
        componentTree.a(cma, i, MeasureSpec.makeMeasureSpec(0, 0), crd);
        int mode = MeasureSpec.getMode(i2);
        if (mode == aocf.UNSET_ENUM_VALUE) {
            crd.b = Math.min(MeasureSpec.getSize(i2), crd.b);
        } else if (mode == 1073741824) {
            crd.b = MeasureSpec.getSize(i2);
        }
    }
}
