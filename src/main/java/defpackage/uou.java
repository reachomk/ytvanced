package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: uou */
final class uou implements uox {
    private uou() {
    }

    public final void a(Matrix matrix, int i, Rect rect, Bitmap bitmap) {
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        if (i == 0) {
            matrix.setScale(((float) rect.width()) / width, ((float) rect.height()) / height);
        } else if (i == 90) {
            matrix.setRotate(90.0f);
            matrix.postTranslate(height, 0.0f);
            matrix.postScale(((float) rect.width()) / height, ((float) rect.height()) / width);
        } else if (i == 180) {
            matrix.setRotate(180.0f, width / 2.0f, height / 2.0f);
            matrix.postScale(((float) rect.width()) / width, ((float) rect.height()) / height);
        } else if (i == 270) {
            matrix.setRotate(270.0f);
            matrix.postTranslate(0.0f, width);
            matrix.postScale(((float) rect.width()) / height, ((float) rect.height()) / width);
        }
        matrix.postTranslate((float) rect.left, (float) rect.top);
    }

    /* synthetic */ uou(byte b) {
    }
}
