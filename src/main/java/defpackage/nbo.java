package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: nbo */
public final /* synthetic */ class nbo implements Callable {
    private final Activity a;
    private final Context b;

    public nbo(Activity activity, Context context) {
        this.a = activity;
        this.b = context;
    }

    public final Object call() {
        Activity activity = this.a;
        Context context = this.b;
        return new mxl(activity, context.getResources(), context.getClassLoader(), context.getTheme());
    }
}
