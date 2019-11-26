package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: afi */
final class afi implements OnClickListener {
    private final View a;
    private final String b;
    private Method c;
    private Context d;

    public afi(View view, String str) {
        this.a = view;
        this.b = str;
    }

    public final void onClick(View view) {
        if (this.c == null) {
            String stringBuilder;
            for (Context context = this.a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.b, new Class[]{View.class});
                        if (method != null) {
                            this.c = method;
                            this.d = context;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
            int id = this.a.getId();
            if (id != -1) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(" with id '");
                stringBuilder2.append(this.a.getContext().getResources().getResourceEntryName(id));
                stringBuilder2.append("'");
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = "";
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Could not find method ");
            stringBuilder3.append(this.b);
            stringBuilder3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            stringBuilder3.append(this.a.getClass());
            stringBuilder3.append(stringBuilder);
            throw new IllegalStateException(stringBuilder3.toString());
        }
        try {
            this.c.invoke(this.d, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
