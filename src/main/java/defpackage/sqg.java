package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* renamed from: sqg */
final /* synthetic */ class sqg implements Callable {
    private final syl a;
    private final Context b;
    private final String c;

    sqg(syl syl, Context context, String str) {
        this.a = syl;
        this.b = context;
        this.c = str;
    }

    public final Object call() {
        syl syl = this.a;
        Context context = this.b;
        String str = this.c;
        Object a = syl.a(context, str);
        if (a != null) {
            return a;
        }
        String a2 = ampq.a(str);
        int i = 0;
        if (a2.endsWith("-bold")) {
            a2 = a2.substring(0, a2.length() - 5);
            i = 1;
        } else if (a2.endsWith("-bold-italic")) {
            a2 = a2.substring(0, a2.length() - 12);
            i = 3;
        } else if (a2.endsWith("-italic")) {
            a2 = a2.substring(0, a2.length() - 7);
            i = 2;
        }
        return Typeface.create(a2, i);
    }
}
