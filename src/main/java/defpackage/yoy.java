package defpackage;

import android.content.Context;
import android.os.Handler;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: yoy */
public final class yoy extends ymt {
    public yoy(Context context, Handler handler, ywk ywk, yil yil, akkq akkq, yio yio, ymx ymx, String str, yqc yqc) {
        akkq akkq2 = akkq;
        super(str, context, handler, ywk, yil, yqc, yio, new yrc(ywk, akkq, ymx, handler));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        this.g.a(NumberFormat.getInstance(Locale.getDefault()).format((long) i));
    }
}
