package defpackage;

import android.os.Bundle;

/* renamed from: qiq */
abstract class qiq {
    public final int a;
    public final ryl b = new ryl();
    public final int c;
    public final Bundle d;

    qiq(int i, Bundle bundle) {
        this.a = i;
        this.c = 1;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean a();

    /* Access modifiers changed, original: final */
    public final void a(qip qip) {
        this.b.a((Exception) qip);
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.a;
        a();
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(i);
        stringBuilder.append(" id=");
        stringBuilder.append(i2);
        stringBuilder.append(" oneWay=false}");
        return stringBuilder.toString();
    }
}
