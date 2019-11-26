package defpackage;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.widget.EditText;

/* renamed from: zsi */
public final class zsi {
    public final zsj a = new zsj();
    public final StringBuilder b = new StringBuilder();
    public final Paint c = new Paint();
    public final zsl d = new zsl();
    public int e;
    public int f;
    private final Path g = new Path();

    public zsi() {
        this.c.setStyle(Style.FILL_AND_STROKE);
        this.c.setStrokeWidth(1.0f);
    }

    public final Path a(EditText editText, int i, int i2) {
        this.g.reset();
        amqp a = this.a.a(i);
        if (a.a()) {
            this.g.moveTo(((zsk) a.b()).b, zsi.a(editText, i));
        }
        for (int i3 = i; i3 <= i2; i3++) {
            amqp a2 = this.a.a(i3);
            if (a2.a()) {
                this.g.lineTo(((zsk) a2.b()).c, zsi.a(editText, i3));
                this.g.lineTo(((zsk) a2.b()).c, zsi.b(editText, i3));
            }
        }
        while (i2 >= i) {
            a = this.a.a(i2);
            if (a.a()) {
                this.g.lineTo(((zsk) a.b()).b, zsi.b(editText, i2));
                this.g.lineTo(((zsk) a.b()).b, zsi.a(editText, i2));
            }
            i2--;
        }
        this.g.close();
        return this.g;
    }

    private static float a(EditText editText, int i) {
        return (float) (editText.getLayout().getLineTop(i) + editText.getPaddingTop());
    }

    private static float b(EditText editText, int i) {
        return (float) (editText.getLayout().getLineBottom(i) + editText.getPaddingTop());
    }

    public static float a(EditText editText) {
        return editText.getTextSize() * 0.2f;
    }
}
