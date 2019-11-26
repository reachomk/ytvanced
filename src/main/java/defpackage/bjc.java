package defpackage;

import android.view.View;
import java.util.Comparator;

/* renamed from: bjc */
public final class bjc implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        bir bir = (bir) ((View) obj).getLayoutParams();
        bir bir2 = (bir) ((View) obj2).getLayoutParams();
        boolean z = bir.a;
        if (z == bir2.a) {
            i = bir.e - bir2.e;
        } else if (!z) {
            return -1;
        } else {
            i = 1;
        }
        return i;
    }
}
