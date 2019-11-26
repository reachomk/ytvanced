package defpackage;

import android.graphics.Rect;

/* renamed from: fpe */
public final class fpe {
    public static Rect a(float f, Rect rect, Rect rect2) {
        double d = (double) f;
        double width = (double) rect.width();
        double height = (double) rect.height();
        Double.isNaN(width);
        Double.isNaN(height);
        int width2;
        if (d < width / height) {
            width2 = (int) (((float) rect.width()) / f);
            rect2.set(rect.left, rect.top - ((width2 - rect.height()) / 2), rect.right, rect.top + ((width2 + rect.height()) / 2));
        } else {
            width2 = (int) (((float) rect.height()) * f);
            rect2.set(rect.left - ((width2 - rect.width()) / 2), rect.top, rect.left + ((rect.width() + width2) / 2), rect.bottom);
        }
        return rect2;
    }

    public static Rect b(float f, Rect rect, Rect rect2) {
        double d = (double) f;
        double width = (double) rect.width();
        double height = (double) rect.height();
        Double.isNaN(width);
        Double.isNaN(height);
        int height2;
        if (d < width / height) {
            height2 = (int) (((float) rect.height()) * f);
            rect2.set(rect.left + ((rect.width() - height2) / 2), rect.top, rect.left + ((rect.width() + height2) / 2), rect.bottom);
        } else {
            height2 = (int) (((float) rect.width()) / f);
            rect2.set(rect.left, rect.top + ((rect.height() - height2) / 2), rect.right, rect.top + ((rect.height() + height2) / 2));
        }
        return rect2;
    }
}
