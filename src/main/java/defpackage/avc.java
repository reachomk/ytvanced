package defpackage;

import android.view.View;
import java.util.Comparator;

/* renamed from: avc */
public final class avc implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        View view = (View) obj2;
        float F = abe.F((View) obj);
        float F2 = abe.F(view);
        if (F > F2) {
            i = -1;
        } else if (F < F2) {
            return 1;
        } else {
            i = 0;
        }
        return i;
    }
}
