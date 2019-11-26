package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: ps */
abstract class ps {
    public final ComponentName a;
    private boolean b;
    private int c;

    ps(ComponentName componentName) {
        this.a = componentName;
    }

    public void a() {
    }

    public abstract void a(Intent intent);

    public void b() {
    }

    public void c() {
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (!this.b) {
            this.b = true;
            this.c = i;
        } else if (this.c != i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Given job ID ");
            stringBuilder.append(i);
            stringBuilder.append(" is different than previous ");
            stringBuilder.append(this.c);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
