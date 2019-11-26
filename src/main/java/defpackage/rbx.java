package defpackage;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: rbx */
public final class rbx extends rhf {
    public rbx(qui qui, String str, String str2, qpa qpa, int i) {
        super(qui, str, str2, qpa, i, 49);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.b.F = Integer.valueOf(2);
        try {
            boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.a})).booleanValue();
            this.b.F = Integer.valueOf(booleanValue);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
