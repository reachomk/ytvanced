package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;

/* renamed from: alfa */
final class alfa implements bcaa {
    private final /* synthetic */ apk a;

    alfa(apk apk) {
        this.a = apk;
    }

    public final /* synthetic */ Object get() {
        alpc alpc = (alpc) this.a;
        if (alpc.d == null) {
            return null;
        }
        SparseArray sparseArray = alpc.b;
        View view = (View) sparseArray.get(sparseArray.keyAt(0));
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        alpc.d.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.top = iArr[1] + alpc.a;
        rect.bottom = rect.top + view.getMeasuredHeight();
        if (alpc.a()) {
            rect.left = ((iArr[0] + alpc.d.getWidth()) - alpc.d.getPaddingRight()) - view.getWidth();
            rect.right = rect.left + view.getMeasuredWidth();
        } else {
            rect.left = iArr[0] + alpc.d.getPaddingLeft();
            rect.right = rect.left + view.getMeasuredWidth();
        }
        return rect;
    }
}
