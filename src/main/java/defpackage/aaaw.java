package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Map;

/* renamed from: aaaw */
public class aaaw extends ClickableSpan {
    private static aaay b;
    private static aaay c;
    public final apxu a;
    private final aaas d;
    private final Map e;
    private final boolean f;

    public aaaw(aaas aaas, Map map, apxu apxu, boolean z) {
        this.d = aaas;
        this.e = map;
        this.a = apxu;
        this.f = z;
    }

    public void onClick(View view) {
        this.d.a(this.a, this.e);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.f);
    }

    private static aaay b(boolean z) {
        return new aaaz(z);
    }

    public static synchronized aaay a(boolean z) {
        synchronized (aaaw.class) {
            aaay aaay;
            if (z) {
                if (b == null) {
                    b = aaaw.b(true);
                }
                aaay = b;
                return aaay;
            }
            if (c == null) {
                c = aaaw.b(false);
            }
            aaay = c;
            return aaay;
        }
    }
}
