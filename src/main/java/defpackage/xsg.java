package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: xsg */
public final class xsg {
    public static Application a(Context context) {
        amqw.a((Object) context, (Object) "context");
        for (int i = 0; i < 10000; i++) {
            if (context instanceof Application) {
                return (Application) context;
            }
            if (context instanceof Service) {
                return ((Service) context).getApplication();
            }
            if (context instanceof Activity) {
                return ((Activity) context).getApplication();
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                context = context.getApplicationContext();
            }
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }

    public static Activity b(Context context) {
        amqw.a((Object) context, (Object) "context");
        int i = 0;
        while (i < 10000) {
            Object context2;
            if (context2 instanceof Service) {
                throw new IllegalArgumentException("Cannot get an Activity from a Service");
            } else if (context2 instanceof Application) {
                throw new IllegalArgumentException("Cannot get a singular Activity from an Application");
            } else if (context2 instanceof Activity) {
                return (Activity) context2;
            } else {
                if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                    i++;
                } else {
                    String simpleName = context2.getClass().getSimpleName();
                    String str = "Unkown Context type: ";
                    throw new IllegalArgumentException(simpleName.length() == 0 ? new String(str) : str.concat(simpleName));
                }
            }
        }
        throw new IllegalStateException("Possible Context wrapper loop - chain of wrappers larger than 10000");
    }
}
