package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.Locale;

/* renamed from: vqx */
public final class vqx implements aftl {
    private Integer a;
    private Integer b;
    private View c;

    public vqx(View view) {
        this.c = view;
    }

    public vqx(View view, byte b) {
        this.c = view;
        view.setOnTouchListener(new vqw(this, view.getResources().getDisplayMetrics().density));
    }

    public final void a(int i, int i2) {
        this.a = Integer.valueOf(i);
        this.b = Integer.valueOf(i2);
    }

    public final void b() {
        this.a = null;
        this.b = null;
    }

    public final String a(Uri uri, String str) {
        String str2 = null;
        if (str != null) {
            Integer num = (Integer) vqq.a.get(str);
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 66) {
                    String str3 = "%d";
                    if (intValue != 68) {
                        if (intValue == 69 && this.b != null) {
                            return String.format(Locale.US, str3, new Object[]{this.b});
                        }
                    } else if (this.a != null) {
                        return String.format(Locale.US, str3, new Object[]{this.a});
                    }
                }
                View view = this.c;
                if (view != null) {
                    int measuredWidth = view.getMeasuredWidth();
                    intValue = this.c.getMeasuredHeight();
                    float f = this.c.getResources().getDisplayMetrics().density;
                    str2 = String.format(Locale.US, "%dx%d", new Object[]{Integer.valueOf((int) (((float) measuredWidth) / f)), Integer.valueOf((int) (((float) intValue) / f))});
                }
            }
        }
        return str2;
    }

    public final String a() {
        return vqx.class.getSimpleName();
    }
}
